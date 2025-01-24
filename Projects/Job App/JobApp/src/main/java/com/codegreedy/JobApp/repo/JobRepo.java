package com.codegreedy.JobApp.repo;

import com.codegreedy.JobApp.JobController;
import com.codegreedy.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class JobRepo {
    List<JobPost> jobs = new ArrayList<>();

    public List<JobPost> getAllJobs(){
        return jobs;
    }

    public void addJob(JobPost job){
        jobs.add(job);
    }
}
