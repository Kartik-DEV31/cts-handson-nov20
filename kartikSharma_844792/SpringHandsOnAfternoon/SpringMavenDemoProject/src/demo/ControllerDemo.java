package demo;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerDemo {

	@RequestMapping(value = "/whatsTime" , method = RequestMethod.GET)
	public ModelAndView viewDateTime() {
		ModelAndView mav = new ModelAndView("currentTimeAndDate", "timeAndDate", LocalDateTime.now().toString());
		return mav;
	}
	
}
