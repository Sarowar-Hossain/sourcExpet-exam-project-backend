package com.sarowar.exam_project.Repos;

import com.sarowar.exam_project.model.Newsletter;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NewsletterRepository extends MongoRepository<Newsletter, String> {
}
