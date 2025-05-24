package com.springboot.blog.service;

import com.springboot.blog.dtos.PostDTO;
import com.springboot.blog.entity.Post;

public interface PostService {
    PostDTO createPost(PostDTO postDTO);
}
