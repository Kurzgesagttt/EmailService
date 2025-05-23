package com.Kurzgesagtt.emailService.service;

import com.Kurzgesagtt.emailService.dto.RequestEmailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    JavaMailSender javaMail;

    public void sendEmail(RequestEmailDTO dto){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(dto.getSenderEmail());
        message.setSubject(dto.getSubject());
        message.setText(dto.getContent());
        javaMail.send(message);
    }
}
