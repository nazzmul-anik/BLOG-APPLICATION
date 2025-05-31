package com.springboot.blog.service;

import com.springboot.blog.dtos.CommentDTO;
import com.springboot.blog.entity.Comment;

import java.util.List;

public interface CommentService {
    CommentDTO createComment(Long postId, CommentDTO commentDTO);
    List<CommentDTO> getCommentsByPostId(Long postId);
    CommentDTO getCommentById(Long postId, Long commentId);
    CommentDTO updateComment(Long postId, Long commentId, CommentDTO commentDTO);
    void deleteCommentById(Long postId, Long commentId);
}
