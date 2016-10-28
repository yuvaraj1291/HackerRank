
public class Reverse { 

	static String reverseButPreserveWhitespace(String initialMessage) {
	        char[] ch=initialMessage.toCharArray();    
	        StringBuffer sb=new StringBuffer();
	        int initial=0,last=0;
	        for(int i=0;i<initialMessage.length();i++){
	                if(ch[i]==' '){
	                    sb.append(ch[i]);
	                }else{
	                    initial=i;
	                    while(i<initialMessage.length() && ch[i]!=' '){         
	                        last=i;
	                        i++;
	                    }
	                    i--;
	                    for(int j=last;j>=initial;j--){
	                        sb.append(ch[j]);
	                    }
	                }
	               
	                
	            }
	        return sb.toString();

	    }
	
	public static void main(String[] arg){
		
			String s=reverseButPreserveWhitespace("hey how are    doing adak fuck");
			System.out.println(s);
	}
	

}
