package com.star.JobApp;

import com.star.JobApp.model.JobPost;
import com.star.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {

    @Autowired
    private JobService service; //Created this so, controller and service and talk to each other.



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
        service.addJob(jobPost);
        return "success";
    }

}
