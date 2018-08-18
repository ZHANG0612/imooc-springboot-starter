package com.imooc.tasks;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestTask {

	private static final SimpleDateFormat DATE_FORMAT=new SimpleDateFormat("HH:mm:ss a");
	
	//定时每过3秒执行任务
	//@Scheduled(fixedRate=3000)
	@Scheduled(cron="4-40 * * * * ? ")
	public void reportCurrentTime(){
		System.out.println("现在时间："+DATE_FORMAT.format(new Date()));
	}
}
