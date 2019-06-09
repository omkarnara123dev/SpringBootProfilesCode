package com.app.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.InotificationService;

@Component
@Profile("htc")
public class HtcNotificationServiceImpl implements InotificationService {

	
	@Override
	public void notificate() {

		System.out.println(" only for htc for all ");
	}

}
