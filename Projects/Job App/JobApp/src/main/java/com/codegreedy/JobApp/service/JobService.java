package com.codegreedy.JobApp.service;

import com.codegreedy.JobApp.model.JobPost;
import com.codegreedy.JobApp.repo.JobRepo;
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
}
