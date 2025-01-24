package com.codegreedy.JobApp;

import com.codegreedy.JobApp.model.JobPost;
import com.codegreedy.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@Controller
public class JobController {

    JobService jobService;

    public JobService jobService() {
        return jobService;
    }

    @Autowired
    public void setJobService(JobService jobService) {
        this.jobService = jobService;
    }

    // mapping for the home page
    @GetMapping({"/", "/home"})
    public String home(){
        return "home";
    }

    // mapping for the add jobs
    @GetMapping("/addjob")
    public String addJob(){
        return "addjob";
    }

    // mapping for the handleForm -> to add the jobs success page
    @PostMapping("/handleForm")
    public String handleForm(JobPost jobPosts){
        jobService.addJob(jobPosts);
        System.out.println(jobPosts);
        return "success";
    }

    @GetMapping("/viewalljobs")
    public String viewJobs(Model model){
        List<JobPost> jobs = jobService.getAllJobs();
        System.out.println(jobs.size());
        model.addAttribute("jobPosts", jobs);
        return "viewalljobs";
    }


}
