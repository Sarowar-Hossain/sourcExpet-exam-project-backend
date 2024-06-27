package com.sarowar.exam_project.Repos;

import com.sarowar.exam_project.model.ContactUs;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactUsRepository extends MongoRepository<ContactUs, String> {

}
