package com.sarowar.exam_project.controller;


import com.sarowar.exam_project.Repos.NewsletterRepository;
import com.sarowar.exam_project.model.Newsletter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("/api/newsletter")
public class NewsletterController {

    @Autowired
    NewsletterRepository repo;

    @GetMapping("/get-newsletters")
    public List<Newsletter> getAllNewsletter() {
        return repo.findAll();
    }

    @PostMapping("/send-newsletter")
    public Newsletter createNewsletter(@RequestBody Newsletter newsletter) {
        String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        newsletter.setSubscriptionDate(currentDate);
        return repo.save(newsletter);
    }

}
