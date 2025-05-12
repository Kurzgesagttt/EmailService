package com.Kurzgesagtt.emailService.repository;

import com.Kurzgesagtt.emailService.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailRepository extends JpaRepository<Email, UUID> {
}
