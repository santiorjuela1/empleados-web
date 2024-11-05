package com.empleados_web.empleados_web.web.controllers;

import com.empleados_web.empleados_web.model.Posts;
import com.empleados_web.empleados_web.services.PostsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
public class PostsController {

    private final PostsService postsService;

    public PostsController(PostsService postsService) {
        this.postsService = postsService;
    }
    @PostMapping("/create")
    public ResponseEntity<Posts> createPost(@RequestBody Posts posts) {
        return ResponseEntity.ok(postsService.createPost(posts));
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Posts> getPost(@PathVariable Long id) {
        return ResponseEntity.ok(postsService.getPost(id));
    }

    @PatchMapping("/posts/update/{id}")
    public ResponseEntity<Posts> updatePost(@RequestBody Posts posts) {
        return ResponseEntity.ok(postsService.updatePost(posts));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deletePost(@PathVariable Long id) {
        return ResponseEntity.ok(postsService.deletePost(id));
    }
}
