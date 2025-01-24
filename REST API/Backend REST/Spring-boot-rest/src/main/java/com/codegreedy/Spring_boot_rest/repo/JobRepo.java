package com.codegreedy.spring_boot_rest.repo;
import com.codegreedy.spring_boot_rest.JobRestController;
import com.codegreedy.spring_boot_rest.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>();


    public List<JobPost> getAllJobs(){
        return jobs;
    }

    public void addJob(JobPost job){
        jobs.add(job);
    }

    public JobPost getJob(int postId){

        for (JobPost job : jobs){
            if (job.postId() == postId){
                return job;
            }
        }

        return null;
    }

    public void updateJob(JobPost jobPost){

        for (JobPost job: jobs){
            if (job.postId() == jobPost.postId()){
                job.setPostDesc(jobPost.postDesc());
                job.setPostId(jobPost.postId());
                job.setPostTechStack(jobPost.postTechStack());
                job.setPostProfile(jobPost.postProfile());
                break;
            }
        }
    }

    public void deleteJob(int postId){

        for (JobPost job: jobs){
            if (job.postId() == postId){
                jobs.remove(job);
            }
        }
    }
}
