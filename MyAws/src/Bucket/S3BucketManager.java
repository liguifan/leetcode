package Bucket;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.amazonaws.auth.ClasspathPropertiesFileCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.CreateBucketRequest;
import com.amazonaws.services.s3.model.ListObjectsRequest;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3ObjectSummary;
public class S3BucketManager {
	 
//	String bucketName = "liguifan3431";
//	String key = "Movie";
// path="/Users/liguifan/Desktop/music/IMG_0155.MOV"
//+ UUID.randomUUID();
	 public static void main(String[] args) throws IOException {
		 	ArrayList<String> sql=new ArrayList<String>();
	        AmazonS3 s3 = new AmazonS3Client(new ClasspathPropertiesFileCredentialsProvider());
			Region usWest2 = Region.getRegion(Regions.US_WEST_2);
			s3.setRegion(usWest2);

	        String bucketName = "liguifan3432";
	       
	        String path="/Users/liguifan/Desktop/2011_newZ";
	        sql=upload_folder(path,bucketName,s3);
	        
	        for(String x:sql){
	        	System.out.println(x);
	        }
	 }
	
	public static void create_bucket(String bucketName, String key){
		AmazonS3 s3 = new AmazonS3Client(new ClasspathPropertiesFileCredentialsProvider());
		Region usWest2 = Region.getRegion(Regions.US_WEST_2);
		s3.setRegion(usWest2);
		System.out.println("Creating bucket " + bucketName + "\n");
		s3.createBucket(bucketName);
		System.out.println("Listing buckets");
		System.out.println();
	}
	
	public static String upload(String path, String bucketName, String key_temp, AmazonS3 s3){
		String key = "\""+key_temp+"\"";
		String key2 =key_temp+"\"";
		
		try{
		System.out.println("Uploading a new object to S3 with name"+key+"\n");
		s3.putObject(new PutObjectRequest(bucketName, key, new File(path))
				.withCannedAcl(CannedAccessControlList.PublicRead));
		System.out.println("done!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String url_link="\"https://s3-us-west-2.amazonaws.com"+"/"+bucketName+"/"+key2;
		
		System.out.println("Listing objects");
		ObjectListing objectListing = s3.listObjects(new ListObjectsRequest()
		.withBucketName(bucketName)
		.withPrefix("My"));
		for (S3ObjectSummary objectSummary : objectListing.getObjectSummaries()) {
			System.out.println(" - " + objectSummary.getKey() + "  " +
					"(size = " + objectSummary.getSize() + ")");
		}
		return "insert into video_info values("+key+","+url_link+")";
	}
	
	static public void ReadAllFile(String filePath) {  
        File f = null;  
        f = new File(filePath);  
        File[] files = f.listFiles();  
        List<File> list = new ArrayList<File>();  
        for (File file : files) {  
            if(file.isDirectory()) {  
                ReadAllFile(file.getAbsolutePath());  
            } else {  
                list.add(file);  
                System.out.println(file.getName());
            }  
        }  
        for(File file : files) {  
            System.out.println(file.getAbsolutePath());  
        }  
    } 
	
	static public ArrayList<String> upload_folder(String filepath, String bucketName, AmazonS3 s3){ 
        File f = new File(filepath);  
        File[] files = f.listFiles();  
//        List<File> list = new ArrayList<File>();  
        ArrayList<String> sql_cmd=new ArrayList<String>();
        for (File file : files) {  
            if(file.isDirectory()) {  
                ReadAllFile(file.getAbsolutePath());  
            } else {  
//                list.add(file);  
                String sql_temp=upload(file.getAbsolutePath(), bucketName, file.getName(), s3);
                sql_cmd.add(sql_temp);
            }  
            }
        return sql_cmd;
	}
}
