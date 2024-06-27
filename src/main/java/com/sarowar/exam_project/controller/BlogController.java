package com.sarowar.exam_project.controller;


import com.sarowar.exam_project.Repos.BlogRepository;
import com.sarowar.exam_project.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/blog")
public class BlogController {

    @Autowired
    BlogRepository repo;

    @GetMapping("/get-blogs")
    public List<Blog> getAllBlogs() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Blog> getBlogById(@PathVariable String id) {
        return repo.findById(id);
    }

    @PostMapping("/create-blog")
    public Blog createBlog(@RequestBody Blog blog) {
        if (blog.getDate() == null) {
            blog.setDate(new Date());
        }
        return repo.save(blog);
    }

}
