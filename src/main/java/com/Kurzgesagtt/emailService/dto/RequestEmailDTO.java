package com.Kurzgesagtt.emailService.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.io.Serializable;

public class RequestEmailDTO implements Serializable {

    @Email
    @NotBlank(message = "Campo email vazio")
    private String receiverEmail;
    private String subject;

    @NotBlank(message = "Não é possível enviar o email sem um corpo de mensagem")
    private String content;

    public RequestEmailDTO(String senderEmail, String content, String subject) {
        this.receiverEmail = senderEmail;
        this.content = content;
        this.subject = subject;
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
