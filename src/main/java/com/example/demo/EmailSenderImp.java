package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailSenderImp implements EmailSender {
	
	@Autowired
	public JavaMailSender mailsender;

	@Override
	public void sendMessage(User user) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(user.getName());
		message.setSubject("Email de prueba");
		message.setText("Te has registrado en mi fabulosa página de prueba.");
		mailsender.send(message);
		
	}

}
