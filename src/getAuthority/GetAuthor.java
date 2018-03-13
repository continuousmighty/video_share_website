/*package getAuthority;

import java.util.Date;

import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.region.Region;

public class GetAuthor {
	public static void getAuthority(){
	// 1 初始化用户身份信息(secretId, secretKey)
	
	COSCredentials cred = new BasicCOSCredentials(secretId,secretKey );
	// 2 设置bucket的区域, COS地域的简称请参照 https://cloud.tencent.com/document/product/436/6224
	ClientConfig clientConfig = new ClientConfig(new Region("ap-chengdu"));
	// 3 生成cos客户端
	//COSClient cosclient = new COSClient(cred, clientConfig);
	// bucket的命名规则为{name}-{appid} ，此处填写的存储桶名称必须为此格式
	String bucketName = "hsy-first-yun-1252134166";
	long timestamp=new Date().getTime();
	//1.对临时密钥的有效起止时间加密计算值 SignKey
	
	//根据固定格式组合生成 HttpString
	//2.HttpString = [HttpMethod]\n[HttpURI]\n[HttpParameters]\n[HttpHeaders]\n
	
	String HttpString="put\n/test/1.pdf\n"+param+"\nhttps\n"; 	
	//3.加密 HttpString，并根据固定格式组合生成 StringToSign
	String httpstr=Get_sha1.getSha1(HttpString);
	//StringToSign = [q-sign-algorithm]\n[q-sign-time]\nSHA1-HASH(HttpString)\n
	String StringToSign = "sha1\n"+timestamp+"\n"+httpstr+"\n";
	//4.加密 StringToSign，生成Signature。
	String Signature=Get_sha1.getSha1(StringToSign);
    System.out.println(Signature);
	}
	public static void main(String[] args) {
		GetAuthor.getAuthority();;
		 
	}
}*/