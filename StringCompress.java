
public class StringCompress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="aabbbccccaaa";
     String s1 = "";
     int count=0;
     for(int i=0;i<s.length();i++)
     {
    	   if(s1.equals(""))
    	   {
    		   s1+=s.charAt(i);
    		   count=count+1;
    	   }
    	   else 
    	   {
    		   if(s.charAt(i)==s.charAt(i-1)) {
    			   count=count+1;
    		   }
    		   else {
    			   s1+=count;
    			   count=0;
    			   s1+=s.charAt(i);
    			   count=count+1;
    		   }
    	   }
    	   if(i==s.length()-1)
    	   {
    		   s1+=count;
    	   }
    	   
     }
     System.out.println(s1);
  
	}

}
