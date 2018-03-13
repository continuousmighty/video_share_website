package getAuthority;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.qcloud.QcloudApiModuleCenter;
import com.qcloud.Common.Request;
import com.qcloud.Module.Cvm;
import com.qcloud.Utilities.Json.JSONObject;
import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;

public class Demo {
	public static void getCOSClient() {
		TreeMap<String, Object> config = new TreeMap<String, Object>();
		  config.put("SecretId", "AKIDNdly74FOmxvhHfoUhiX9ua3KfifRng2E");
		  config.put("SecretKey", "85qPSO8f096qPmxEQRGGAtQs9EMMAn07");
		  /* 请求方法类型 POST、GET */
		  config.put("RequestMethod", "GET");
		  /* 区域参数，可选: gz:广州; sh:上海; hk:香港; ca:北美;等。 */
		  config.put("DefaultRegion", "cd");

		  /*
		   * 你将要使用接口所在的模块，可以从 官网->云 API 文档->XXXX 接口->接口描述->域名
		   * 中获取，比如域名：cvm.api.qcloud.com，module 就是 new Cvm()。
		   */
		  /*
		   * 示例：DescribeInstances 
		   * 的 API 文档地址：https://cloud.tencent.com/document/product/213/9388
		   */
		  QcloudApiModuleCenter module = new QcloudApiModuleCenter(new Cvm(),
		    config);

		  TreeMap<String, Object> params = new TreeMap<String, Object>();
		  /* 将需要输入的参数都放入 params 里面，必选参数是必填的。 */
		  /* DescribeInstances 接口的部分可选参数如下 */
		  params.put("offset", 0);
		  params.put("limit", 3);
		  /*在这里指定所要用的签名算法，不指定默认为 HmacSHA1*/
		  //params.put("SignatureMethod", "HmacSHA256");

		  /* generateUrl 方法生成请求串,可用于调试使用 */
		  System.out.println(module.generateUrl("DescribeInstances", params));
		  String result = null;
		  try {
		   /* call 方法正式向指定的接口名发送请求，并把请求参数 params 传入，返回即是接口的请求结果。 */
		   result = module.call("DescribeInstances", params);
		   JSONObject json_result = new JSONObject(result);
		   System.out.println(json_result);
		  } catch (Exception e) {
		   System.out.println("error..." + e.getMessage());
		  }
    }
	public static void main(String[] args) {
		getCOSClient();
	}

}