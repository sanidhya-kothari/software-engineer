package com.company.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ScheduleInfo {

	private String info;
	private Long initialOffset;
	private Long interval;
	private Integer repeatCount;
	private boolean runForever;

}
