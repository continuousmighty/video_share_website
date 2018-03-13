package cn.houshiyou.web;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
/**
 * 文件上传下载功能实现
 * @author HouShiyou
 *
 */

@Controller
public class FileUploadController {
	 
	/*@RequestMapping("/upload")
	//登陆需要ssession
	public String fileupload(@RequestParam("file")CommonsMultipartFile file,HttpServletRequest req,
			Model model) throws IOException{
		//获取文件名
		
		if(!file.isEmpty()){
			//获取上传文件路径
		String path=req.getServletContext().getRealPath("/fileupload/");
		System.out.println(path);
		String filename=file.getOriginalFilename();
		model.addAttribute("filename", filename);
		System.out.println(filename);
		file.transferTo(new File(path+File.separator+filename));
		return "success";
		}else{
		return "error";
		}
	}
	@RequestMapping("/download")
	public ResponseEntity<byte[]> download(HttpServletRequest req,@RequestParam("filename") String filename,
			Model model) throws IOException  {
		//下载文件路径
		String path=req.getServletContext().getRealPath("/fileupload/");
		File file=new File(path+File.separator+filename);
		HttpHeaders headers=new HttpHeaders();
		//下载显示的文件名，解决中文乱码问题
		String downloadFileName=new String(filename.getBytes("UTF-8"),"iso-8859-1");
		 //通知浏览器以attachment（下载方式）打开图片
		headers.setContentDispositionFormData("attachment", downloadFileName);
		//二进制流数据（最常见下载方式）application_octet_stream
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers,HttpStatus.CREATED) ;
	}
	@RequestMapping("/download1")
	public   String showFiles(HttpServletRequest req,HttpServletResponse resp,Model model) throws IOException  {
		//下载文件路径
		String path=req.getServletContext().getRealPath("/fileupload/");
		File file=new File(path);
		String files[];
		List<String> list=new ArrayList<String>();
		files=file.list();
		for(String str:files)
		{
			list.add(str);
		System.out.println(str);	
		}
		model.addAttribute("str", list);
		return "12";
  	}*/
}
