package com.seed.jackson;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jiachiliu on 6/16/14.
 */
@Controller
@RequestMapping("/jackson")
public class JsonController {

    @RequestMapping("/application/{id}")
    public @ResponseBody Application getApplication(@PathVariable Long id){
        Application app = new Application();
        app.setId(id);
        app.setAppName("JackSon Sample App");
        app.setCategory("Jackson");
        return app;
    }
}
