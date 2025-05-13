package com.Kurzgesagtt.emailService.controller;

import com.Kurzgesagtt.emailService.dto.RequestEmailDTO;
import com.Kurzgesagtt.emailService.service.MailService;
import jakarta.validation.constraints.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mail")
public class EmailController {

    @Autowired
    MailService service;

    @PostMapping
    public ResponseEntity<RequestEmailDTO> emailSender(@Email RequestEmailDTO dto){
        service.sendEmail(dto);
        service.saveEmail(dto);


        return ResponseEntity.ok().build();
    }
}
