package demo_app;

public class JavaString {

	public static void main(String[] args) {
		
		String S1 = "Geeks";
				String S2 = "forGeeks";
				String S3=S1+S2;
				String Rev="";
				
		/*	StringBuffer str=new StringBuffer(S3);
			str.reverse();
                    System.out.println(str);
                    */
				for (int i = 0; i < S3.length(); i++) {
					
					char ch=S3.charAt(i);
					Rev=ch+Rev;
					
					}
				System.out.println(Rev);
	}

}
