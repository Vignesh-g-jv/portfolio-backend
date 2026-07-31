package com.example.portfolio.service;

import com.example.portfolio.dto.ContactRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(ContactRequest request) {

        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo("vickynrsvicky@gmail.com");

        message.setSubject(request.getSubject());

        message.setText(
                "Name : " + request.getName() +
                        "\n\nEmail : " + request.getEmail() +
                        "\n\nMessage :\n\n" +
                        request.getMessage());

        mailSender.send(message);

    }

}
