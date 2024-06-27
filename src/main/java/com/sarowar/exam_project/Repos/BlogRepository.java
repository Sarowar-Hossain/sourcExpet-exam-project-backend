package com.sarowar.exam_project.Repos;

import com.sarowar.exam_project.model.Blog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BlogRepository extends MongoRepository<Blog, String> {
}
