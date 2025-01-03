package com.company.scheduler;

import org.quartz.Job;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.model.ScheduleInfo;
import com.company.util.JobSchedulerUtils;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
public final class JobScheduler {

	private final Scheduler scheduler;

	@Autowired
	public JobScheduler(Scheduler scheduler) {
		this.scheduler = scheduler;
	}

	@PostConstruct
	public void startJobScheduler() {
		try {
			scheduler.start();
		} catch (SchedulerException schedulerException) {
			throw new IllegalStateException(
			      "scheduler exception: failed to start the job scheduler", schedulerException
			);
		}
	}

	public void scheduleJobSchedulerBySimpleScheduleBuilder(
	      Class<? extends Job> jobClass, ScheduleInfo scheduleInfo
	) {
		try {
			scheduler.scheduleJob(
			      JobSchedulerUtils.getJobDetail(jobClass, scheduleInfo),
			      JobSchedulerUtils.getTriggerBySimpleScheduleBuilder(jobClass, scheduleInfo)
			);
		} catch (SchedulerException schedulerException) {
			throw new IllegalStateException(
			      "scheduler exception: failed to schedule the job scheduler", schedulerException
			);
		}
	}

	public void scheduleJobSchedulerByCronScheduleBuilder(
	      Class<? extends Job> jobClass, String expression
	) {
		try {
			scheduler.scheduleJob(
			      JobSchedulerUtils.getJobDetail(jobClass),
			      JobSchedulerUtils.getTriggerByCronScheduleBuilder(jobClass, expression)
			);
		} catch (SchedulerException schedulerException) {
			throw new IllegalStateException(
			      "scheduler exception: failed to schedule the job scheduler", schedulerException
			);
		}
	}

	@PreDestroy
	public void stopJobScheduler() {
		try {
			scheduler.shutdown();
		} catch (SchedulerException schedulerException) {
			throw new IllegalStateException(
			      "scheduler exception: failed to stop the job scheduler", schedulerException
			);
		}
	}

}
