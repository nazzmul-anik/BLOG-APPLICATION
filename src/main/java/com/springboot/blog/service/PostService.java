package com.springboot.blog.service;

import com.springboot.blog.dtos.PostDTO;
import com.springboot.blog.dtos.PostResponse;

import java.util.List;

public interface PostService {
    PostDTO createPost(PostDTO postDTO);
    PostResponse getAllPost(int pageNo, int pageSize, String sortBy, String sortDr);
    PostDTO getPostById(Long id);
    PostDTO updatePost(Long id, PostDTO postDTO);
    void deletePostById(Long id);
}
