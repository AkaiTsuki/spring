package springmvcsample.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import springmvcsample.domain.Story;
import springmvcsample.event.PageRequest;
import springmvcsample.event.StoryListFacade;

@Controller
@RequestMapping("/jackson")
public class JacksonController {

	/*
	 * To return json, the @ResponseBody must be used on return type not method
	 */
	
	@RequestMapping("/home")
	public String home(){
		System.out.println("Jackson Controlle: homer");
		return "/view/home";
	}
	
	@RequestMapping("/story")
	public @ResponseBody StoryListFacade index(@ModelAttribute PageRequest pageRequest) {
		System.out.println("Jackson Controller");
		System.out.println(pageRequest);
		return getDummyStories();
	}
	
	@RequestMapping("/rest/story/{id}")
	public @ResponseBody Story restIndex(@PathVariable Integer id) {
		System.out.println("Jackson Controller: restIndex");
		Story story = new Story();
		story.setId(id);
		story.setContent("As a developer, I want to see this story as a json in web page");
		return story;
	}
	
	private StoryListFacade getDummyStories(){
		List<Story> stories = new ArrayList<Story>();
		
		for(int i=0;i<25;i++){
			Story s = new Story();
			s.setId(i);
			s.setContent("As a role"+i+", I would like to see content "+i);
			stories.add(s);
		}
		StoryListFacade facade = new StoryListFacade();
		facade.setContents(stories);
		return facade;
	}

}
