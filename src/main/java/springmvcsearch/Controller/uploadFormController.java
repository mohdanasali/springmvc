package springmvcsearch.Controller;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
@Controller
public class uploadFormController {
  
	@RequestMapping("/upload")
	public String uploadForm() {
		System.out.println("uploadForm Controller");
		return "fileupload";
	}
	@RequestMapping(path="/uploadimage",method=RequestMethod.POST)
	public String fileUpload(@RequestParam("profile") CommonsMultipartFile file,HttpSession s,Model m) {
		
	
		System.out.println(file.getStorageDescription());
		System.out.println(file.getSize());
		byte [] data = file.getBytes();
		String path = s.getServletContext().getRealPath("/")+ "WEB-INF"+File.separator+"resources" 
		 +File.separator+"cs"+File.separator+file.getOriginalFilename();
		System.out.println(path);
		try {
		FileOutputStream  fos= new FileOutputStream(path);
		fos.write(data);
		m.addAttribute("msg","uploaded Sucessfully");
		m.addAttribute("file", file.getOriginalFilename());
		System.out.println("file uploaded");
		}catch(Exception e) {
			System.out.println("error in uploading file");
			e.printStackTrace();
			m.addAttribute("msg", "error in uploading file");
		}
		return "sucessupload";
	}
}
