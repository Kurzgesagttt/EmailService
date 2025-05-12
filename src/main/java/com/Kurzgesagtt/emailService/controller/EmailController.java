package com.Kurzgesagtt.emailService.controller;

import com.Kurzgesagtt.emailService.dto.RequestEmailDTO;
import jakarta.validation.constraints.Email;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mail")
public class EmailController {

    @PostMapping
    public ResponseEntity<RequestEmailDTO> emailSender(@Email RequestEmailDTO dto){



        return ResponseEntity.ok().build();
    }
}
