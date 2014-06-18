package com.seed.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by jiachiliu on 6/16/14.
 */

@Controller
@RequestMapping("/persist")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @RequestMapping("/applications")
    public @ResponseBody
    List<Application> retrieveApplications(){
        return applicationService.findApplications();
    }

    @RequestMapping("/home")
    public ModelAndView home(){
        ModelAndView model = new ModelAndView("/application/application");
        return model;
    }
}
