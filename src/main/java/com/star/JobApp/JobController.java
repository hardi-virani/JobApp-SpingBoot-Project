package com.star.JobApp;

import com.star.JobApp.model.JobPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {

    @GetMapping({"/", "home"})
    public String home() {
        return "home";
    }

    @GetMapping("addjob")
    public String addjob() {
        return "addjob";
    }

    @PostMapping(value = "handleForm")
    public String handleform(JobPost jobPost) {
        return "success";
    }

}
