package com.springboot.blog.service;

import com.springboot.blog.dtos.PostDTO;

import java.util.List;

public interface PostService {
    PostDTO createPost(PostDTO postDTO);
    List<PostDTO> getAllPost();
    PostDTO getPostById(Long id);
    PostDTO updatePost(Long id, PostDTO postDTO);
    void deletePostById(Long id);
}
