package getAuthority;

import java.security.MessageDigest;
import java.util.Date;
/**
 * sha1加密算法
 * 将一段明文加密为一段密码
 * @author HouShiyou
 *
 */
public final class Get_sha1 {  
	     
    public static String getSha1(String str) {  
    	          
    	         char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',  
    	                 'a', 'b', 'c', 'd', 'e', 'f' };  
    	         try {  
						 MessageDigest mdTemp = MessageDigest.getInstance("SHA1");  
						 mdTemp.update(str.getBytes("UTF-8"));  
						 byte[] md = mdTemp.digest();  
						 int j = md.length;  
						 char buf[] = new char[j * 2];  
    	                 int k = 0;  
                         for (int i = 0; i < j; i++) {  
                         byte byte0 = md[i];  
    	                 buf[k++] = hexDigits[byte0 >>> 4 & 0xf];  
    	                 buf[k++] = hexDigits[byte0 & 0xf];  
                 }  
    	             return new String(buf);  
    	         } catch (Exception e) {  
                 return null;  
            }  
     }  

	      
	 }  


