package com.sarowar.exam_project.controller;

import com.sarowar.exam_project.Repos.ContactUsRepository;
import com.sarowar.exam_project.model.ContactUs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
public class ContactUsController {

    @Autowired
    ContactUsRepository repo;


    @GetMapping("/get-messages")
    public List<ContactUs> getAllContactUs() {
        return repo.findAll();
    }

    @PostMapping("/send-message")
    public ContactUs createContactUs(@RequestBody ContactUs contactUs) {
        return repo.save(contactUs);
    }

}
