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
    private String receiverEmail;

    @Column(name = "subject")
    private String subject;

    @Column(name = "content")
    private String content;

    public Email(String receiverEmail, String subject, String content) {
        this.receiverEmail = receiverEmail;
        this.subject = subject;
        this.content = content;
    }

    public String getSenderEmail() {
        return receiverEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.receiverEmail = senderEmail;
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
