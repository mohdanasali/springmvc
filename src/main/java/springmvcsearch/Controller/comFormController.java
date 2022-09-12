package springmvcsearch.Controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvcsearch.model.Student;

@Controller
public class comFormController {
	
	@RequestMapping("/form")
	public String showform() {
		
//		System.out.println("this is home controller");
		return "complexform";
	}

	@RequestMapping(path="/cform",method=RequestMethod.POST)
	public String formhandle(@ModelAttribute("student") Student student,BindingResult result) {
		
		if(result.hasErrors()) {
			return "complexform";
		}
		System.out.println(student);
		return"sucess";
	}
	
	
}
