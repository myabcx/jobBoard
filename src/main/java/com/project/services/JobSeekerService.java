package com.project.services;

import com.project.models.JobSeeker;
import com.project.payloads.JobSeekerDto;

import java.util.List;

public interface JobSeekerService {

    public JobSeekerDto getJobSeekerById(Integer jsId);

    public List<JobSeekerDto> getJobSeekers();

    public JobSeekerDto updateJobSeeker(JobSeekerDto jobSeeker);

    public void deleteJobSeeker(Integer jsId);

    public void addJobSeeker(JobSeekerDto jobSeekerDto);

}
