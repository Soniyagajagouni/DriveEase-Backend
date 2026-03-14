package com.rrss.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestMailController {

    @Autowired
    private JavaMailSender mailSender;

    @GetMapping("/test-mail")
    public String sendTestMail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("soniya.gajagouni@gmail.com");
        message.setTo("soniya.gajagouni@gmail.com");
        message.setSubject("DriveEase Test Email");
        message.setText("Email is working successfully in DriveEase.");

        mailSender.send(message);

        return "Test email sent successfully";
    }
}
