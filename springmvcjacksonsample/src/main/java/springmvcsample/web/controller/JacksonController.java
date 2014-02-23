package springmvcsample.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import springmvcsample.domain.Story;

@Controller
@RequestMapping("/jackson")
public class JacksonController {

	/*
	 * To return json, the @ResponseBody must be used on return type not method
	 */
	@RequestMapping("/story")
	public @ResponseBody Story index() {
		System.out.println("Jackson Controller");
		Story story = new Story();
		story.setId(1);
		story.setContent("As a developer, I want to see this story as a json in web page");
		return story;
	}
	
	@RequestMapping("/rest/story/{id}")
	public @ResponseBody Story restIndex(@PathVariable Integer id) {
		System.out.println("Jackson Controller: restIndex");
		Story story = new Story();
		story.setId(id);
		story.setContent("As a developer, I want to see this story as a json in web page");
		return story;
	}

}
