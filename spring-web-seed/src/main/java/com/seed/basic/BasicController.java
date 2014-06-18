package com.seed.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jiachiliu on 6/16/14.
 */
@Controller
@RequestMapping("/basic")
public class BasicController {

    @RequestMapping("/example")
    public ModelAndView home() {
        System.out.println("Got it");
        ModelAndView model = new ModelAndView("example");
        return model;
    }

}
