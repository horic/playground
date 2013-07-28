/**
 * 
 */
package migel.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.support.RequestContextUtils;

@Controller
@RequestMapping("/")
public class BaseController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome(ModelMap model) {
		//master merged
		model.addAttribute("message",
				"Maven Web Project + Spring 3 MVC - welcome()");

		// Spring uses InternalResourceViewResolver and return back index.jsp
		return "index";

	}

	@RequestMapping(value = "/welcome/{name}", method = RequestMethod.GET)
	public String welcomeName(@PathVariable String name, ModelMap model) {

		model.addAttribute("message", "Maven Web Project + Spring 3 MVC - "
				+ name);
		return "index";

	}
	
	@RequestMapping(value = "/status", method = RequestMethod.GET)
	public @ResponseBody
	Status status() {

		return new Status("myattr", Integer.MAX_VALUE, new String[] { "bval1",
				"valsdsdsd", "valoooo888888" });
	}
}
