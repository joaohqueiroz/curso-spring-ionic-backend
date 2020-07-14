package com.joaohenrique.cursospring.services;

import org.springframework.mail.SimpleMailMessage;

import com.joaohenrique.cursospring.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
