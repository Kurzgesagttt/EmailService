package com.Kurzgesagtt.emailService.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Entity
@Table(name = "emails")
public class Email {

    @Column(name = "email_id")
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "sender")
    private String senderEmail;

    @Column(name = "subject")
    private String subject;

    @Column(name = "content")
    private String content;

    public Email(String senderEmail, String subject, String content) {
        this.senderEmail = senderEmail;
        this.subject = subject;
        this.content = content;
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
