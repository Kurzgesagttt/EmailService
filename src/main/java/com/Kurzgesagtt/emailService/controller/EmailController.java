package com.Kurzgesagtt.emailService.controller;

import com.Kurzgesagtt.emailService.dto.RequestEmailDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mail")
public class EmailController {

    @PostMapping
    public ResponseEntity<Email> emailSender(RequestEmailDTO dto){



        return ResponseEntity.ok().build();
    }
}
