package springmvcsearch.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	
	@RequestMapping("/home")
	public String home() {
		
		System.out.println("this is home controller");
		return "search";
	}
	@RequestMapping(path="/search", method=RequestMethod.POST)
	public RedirectView redirectView(@RequestParam("search") String search) {
		
	String url= "http://www.google.com/search?q=" +search;
			
	 RedirectView r= new  RedirectView();
	 r.setUrl(url);
	 return r;
	}
}
