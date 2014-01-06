package string_manipulation;
import java.lang.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;


public class simplify_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str="/../ptervsMY/../XHZ/PmReT///././om/.///NID/./nb/../////../OzVU/..///////..///.///Fbz/.///JkBLsBPOtaZfJxBsr/////./PlKqDZibpe///BojpVLSKRxwoNTye/DouOLUweLjfjmSVnNB/gkVRoZplAXmDApDcfz/../../TGuyzi/LxiuqfGMIVgSqwjjKn///nrUL/./UXubqdyqDdjYpPjxcK/../skBTmgzFvPvRRUVJZaj/.///./dXMwqDITFGedfD///./../SJsnjqaejDumfKMgfIwa/./AkIkoLqSFqCluW/YFroCAYXGPBhYeIMWl/ie/FMGzVASoRbbFRj/cI/zbVOaYMkHjNj/LO/cHvxnYfEaWabThaWbu/./../lCzgrdFsIcrgTsTNG///qRHYGgDkc/ZNQXkAPmygMEp/./iD/YjpUiwMrRUI///SSeyNJTkkVUNQaEmeO/./YVhKivJXOMBiaF/tnyodagYEHDRZaHXFF/mKZLDarbdM/../FgaTiMQHaULpidm/../Rs/.././mSovxOdRAsqApStB/././QgTXzkoJ/../BR/jyUfTCJx/MkXYqXcXFUo///../EdLxgz/./GNrHjtXIwSvKGKr/./KdPo/QlpxuwxRk///Z/KX/JKPkjMrhZ/./////.././//////zXDkQvxQHRj/kcVCaMpRRTbrpjqJ///zMPHxrk/././H///LxRIytui///QsPZecj/////../WKyepNvAXv/JKSJoymertVFOQZgy/eyChfvJciPRaqc/kQDMydOjqDCUeiMF/../PSWbWSmPbNjRxMePqP///qLGDZwcNVSnWz/HvXN///WSWg/esoKtXeevuWTrQFEBlX/./zisxX/../EsUvBkbmtXZgRPeBdqA/DFGWEcQUtgsGlMyB/RduYIuxsCHyCnaDywQRq/TDZCpShqrw/.///tmiRNSCoygMYBcY/fKdCfOzMLZnjOcaOJula/.././wW/./JBMLkAuH/Wxi/uVovvcTKWRviPqjhnm/uJk/../glZFVEVPG/SdwxUNmDirhnl/AqJfZ///../sgWRJUqyJG/./nKtZIW/DhopPsvKicLISLoJjYZ/JBnNVrEzRA/./XK/.///KyKqy/.././//kkdrwuvBdXJPBQW/ULhGXIghUqXk/";
		String str="home/liguifan/./../...";
		String[] s=str.split("/");
		for(String s1:s )
			System.out.println(s1);
		System.out.println(str.substring(1).equals("..."));
		String str1=simplifyPath2(str);
		//String non=str1.replaceAll("[.]", "");
		System.out.println(str1);
		
		System.out.println("test+"+anagram_twoword("ate","taa"));
		
		HashSet<Character> set=new HashSet<Character>();
		Iterator<Character> it=set.iterator();
		set.add('a');
		set.add('b');
		set.add('c');
		System.out.println(set);
		//System.out.println(it.next());
		set.remove('a');
		System.out.println(set);
		//System.out.println(it.next());
		set.remove('b');
		
		
	}
	
	
	public static String simplifyPath(String path) {
		int counter1=0;
		int last=0;
		if(path=="/")
			return path;
		for(int i=0; i<path.length()-1;i++){
			if(path.charAt(i)=='/')
				counter1++;
			System.out.println(counter1);
		}
		if(path.charAt(path.length()-1)=='/'){
			System.out.println("in");
			counter1++;
			last=1;
		}
		else
			counter1++;
		System.out.println("total counter "+counter1);
		int counter2=0;
		int mark=0;
		for(int i=0;i<path.length();i++){
			if(path.charAt(i)=='/'){
				counter2++;
				if(counter2==counter1-1)
					 mark=i;
			}
		}
		String newstring=new String();
		if(last==0){
			newstring=path.substring(mark);
		}
		else{
			newstring=path.substring(mark,path.length()-1);
		}
		
		if(!newstring.substring(1).equals("..."))
			newstring.replaceAll(".","");
		
		return newstring;
}
/*
 * Given an absolute path for a file (Unix-style), simplify it.

For example,
path = "/home/", => "/home"
path = "/a/./b/../../c/", => "/c"
click to show corner cases.

Corner Cases:
Did you consider the case where path = "/../"?
In this case, you should return "/".
Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
In this case, you should ignore redundant slashes and return "/home/foo".
 */
	public static String simplifyPath2(String path) {
		 if (path == null || path.length() == 0) return "/";

		    Stack<String> stack = new Stack<String>();
		    String[] splits = path.split("/");
		    for (String s : splits) {
		        if (s == null || s.length() == 0 || s.equals(".")) {
		            // Do nothing;
		        } else if (s.equals("..")) {
		            // Pop if stack is not empty;
		            if (stack.size() > 0) stack.pop();
		        } else {
		            // Push all others to stack.
		            stack.push(s);
		        }
		    }

		    // Remember, stack can be empty.
		    if (stack.isEmpty()) return "/";

		    StringBuffer buf = new StringBuffer();
		    while (!stack.isEmpty()) {
		        buf.insert(0, stack.pop());// This is to insert the string at the position rather than
		        buf.insert(0, "/");
    }
		    return buf.toString();
	}
	
	
	public static String reverseString(String word){
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<word.length();i++)
		{
			sb.insert(0,word.charAt(i));
		}
		return sb.toString();
	}
	
	
	public static boolean anagram_twoword(String a, String b){
		HashSet<Character> seta = new HashSet<Character>();
		if(a.length()!=b.length()) return false;
		
		for(int i=0;i<a.length();i++){
			seta.add(a.charAt(i));
		}
		
		
		for(int i=0;i<a.length();i++){
				if(seta.add(b.charAt(i))){
					return false;
				}
				seta.remove(b.charAt(i));// when a character is compared, remove it.
			}

		return true;
	}
}