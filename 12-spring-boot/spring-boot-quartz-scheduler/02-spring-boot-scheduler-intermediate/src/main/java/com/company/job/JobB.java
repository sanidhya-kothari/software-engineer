package com.company.job;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.stereotype.Component;

import com.company.model.ScheduleInfo;

@Component
public class JobB implements Job, Serializable {

	private static Integer count = 0;

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.out.println("Job B - " + "count - " + (++count) + " at " + LocalDateTime.now());
	}

	public static ScheduleInfo getDefaultScheduleInfo() {
		return new ScheduleInfo("job-b", 1L, 10000L, 10, false);
	}

	public static String getDefaultCronExpression() {
		return new String("");
	}

	public static ScheduleInfo getCustomScheduleInfo(
	      String info,
	      Long initialOffset,
	      Long interval,
	      Integer repeatCount,
	      boolean runForever
	) {
		return new ScheduleInfo(info, initialOffset, interval, repeatCount, runForever);
	}

	public static String getCustomCronExpression(String cronExpression) {
		return new String(cronExpression);
	}

}