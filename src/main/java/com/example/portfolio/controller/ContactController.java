package com.example.portfolio.controller;

import com.example.portfolio.dto.ContactRequest;
import com.example.portfolio.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*")
public class ContactController {
    @Autowired
    private EmailService emailService;

    @PostMapping
    public String sendMessage(@RequestBody ContactRequest request){

        emailService.sendEmail(request);

        return "Message Sent Successfully";

    }
}
