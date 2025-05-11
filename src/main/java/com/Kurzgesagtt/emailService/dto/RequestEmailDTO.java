package com.Kurzgesagtt.emailService.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.UUID;

public class RequestEmailDTO implements Serializable {

    private String senderEmail;
    private String subject;
    private String content;

    public RequestEmailDTO(String senderEmail, String content, String subject) {
        this.senderEmail = senderEmail;
        this.content = content;
        this.subject = subject;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
