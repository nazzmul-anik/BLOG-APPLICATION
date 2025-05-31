package com.springboot.blog.dtos;

import lombok.Data;

import java.util.Set;

@Data
public class PostDTO {
    private Long id;
    public String title;
    private String description;
    private String content;
    private Set<CommentDTO> comments;
}
