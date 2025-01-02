package com.company.job;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.stereotype.Component;

import com.company.model.ScheduleInfo;

@Component
public class JobC implements Job, Serializable {

	private static Integer count = 0;

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.out.println("Job C - " + "count - " + (++count) + " at " + LocalDateTime.now());
	}

	public static ScheduleInfo getDefaultScheduleInfo() {
		return new ScheduleInfo("job-c", 1000L, 15000L, null, true);
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