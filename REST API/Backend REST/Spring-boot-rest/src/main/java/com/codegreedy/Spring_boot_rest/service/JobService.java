package com.codegreedy.spring_boot_rest.service;
import  com.codegreedy.spring_boot_rest.model.JobPost;
import com.codegreedy.spring_boot_rest.repo.JobRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    JobRepo jobrepo;


    public void addJob(JobPost job){
        jobrepo.addJob(job);
    }

    public List<JobPost> getAllJobs(){
        return jobrepo.getAllJobs();
    }

    public JobPost getJob(int postId){
        return jobrepo.getJob(postId);
    }

    public void updateJob(JobPost post){
        jobrepo.updateJob(post);
    }

    public void deleteJob(int postId){
        jobrepo.deleteJob(postId);
    }
}
