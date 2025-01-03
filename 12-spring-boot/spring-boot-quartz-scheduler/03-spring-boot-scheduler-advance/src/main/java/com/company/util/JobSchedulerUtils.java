package com.company.util;

import java.util.Date;
import java.util.Map;

import org.quartz.CronScheduleBuilder;
import org.quartz.Job;
import org.quartz.JobBuilder;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;

import com.company.model.ScheduleInfo;

public final class JobSchedulerUtils {

	private JobSchedulerUtils() {

	}

	// for SimpleScheduleBuilder
	public static JobDetail getJobDetail(Class<? extends Job> jobClass, ScheduleInfo scheduleInfo) {

		return JobBuilder.newJob(
		      jobClass
		).setJobData(
		      new JobDataMap(
		            Map.of(jobClass.getSimpleName(), scheduleInfo)
		      )
		).withIdentity(
		      jobClass.getSimpleName(), "job-group"
		).withDescription(
		      "job-description"
		).build();

	}

	// for SimpleScheduleBuilder
	public static Trigger getTriggerBySimpleScheduleBuilder(Class<? extends Job> jobClass, ScheduleInfo scheduleInfo) {

		SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule().withIntervalInMilliseconds(
		      scheduleInfo.getInterval()
		);
		if (scheduleInfo.isRunForever()) {
			scheduleBuilder.repeatForever();
		} else {
			scheduleBuilder.withRepeatCount(scheduleInfo.getRepeatCount());
		}

		return TriggerBuilder.newTrigger().startAt(
		      new Date(System.currentTimeMillis() + scheduleInfo.getInitialOffset())
		).withSchedule(
		      scheduleBuilder
		).withIdentity(
		      jobClass.getSimpleName(), "trigger-group"
		).withDescription(
		      "trigger-description"
		).build();

	}

	// for CronScheduleBuilder
	public static JobDetail getJobDetail(Class<? extends Job> jobClass) {

		return JobBuilder.newJob(
		      jobClass
		).withIdentity(
		      jobClass.getSimpleName(), "job-group"
		).withDescription(
		      "job-description"
		).build();

	}

	// for CronScheduleBuilder
	public static Trigger getTriggerByCronScheduleBuilder(Class<? extends Job> jobClass, String expression) {

		return TriggerBuilder.newTrigger().withSchedule(
		      CronScheduleBuilder.cronSchedule(expression)
		).withIdentity(
		      jobClass.getSimpleName(), "trigger-group"
		).withDescription(
		      "trigger-description"
		).build();

	}

}
