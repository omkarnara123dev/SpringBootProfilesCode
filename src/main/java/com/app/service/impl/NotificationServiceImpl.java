package com.app.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.InotificationService;

@Component
@Profile("default")
public class NotificationServiceImpl implements InotificationService {

	
	@Override
	public void notificate() {

		System.out.println(" common for all ");
	}

}
