package com.springboot.blog.dtos;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data
public class PostDTO {
    private Long id;
    @NotEmpty
    @Size(min = 2, message = "Post title should have at least 2 characters")
    public String title;
    @NotEmpty
    @Size(min = 10, message = "Post description should have at least 10 characters")
    private String description;
    @NotEmpty
    private String content;
    private Set<CommentDTO> comments;
}
