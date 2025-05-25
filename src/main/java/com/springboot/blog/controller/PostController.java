package com.springboot.blog.controller;

import com.springboot.blog.dtos.PostDTO;
import com.springboot.blog.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    private final PostService postService;
    public PostController(PostService postService) {
        this.postService = postService;
    }

    // create blog post rest api
    @PostMapping
    public ResponseEntity<PostDTO> createPost(@RequestBody PostDTO postDTO) {
        return new ResponseEntity<>(postService.createPost(postDTO), HttpStatus.CREATED);
    }

    // get all post rest api
    @GetMapping
    public ResponseEntity<List<PostDTO>> getAllPosts() {
        return new ResponseEntity<>(postService.getAllPost(), HttpStatus.OK);
    }

    // get post by id rest api
    @GetMapping("/{id}")
    public ResponseEntity<PostDTO> getPostById(@PathVariable("id") Long id){
        return new ResponseEntity<>(postService.getPostById(id), HttpStatus.OK);
    }

    // update post by id rest api
    @PutMapping("/{id}")
    public ResponseEntity<PostDTO> updatePost(@PathVariable("id") Long id, @RequestBody PostDTO postDTO) {
        return new ResponseEntity<>(postService.updatePost(id, postDTO), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePost(@PathVariable("id") Long id){
        postService.deletePostById(id);
        return new ResponseEntity<>("Post ID : "+id+", Deleted Successfully !!", HttpStatus.OK);
    }
}
