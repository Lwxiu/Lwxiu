package com.mr.user.entity;

import lombok.Data;

import java.util.List;

public class CommentVO {

    private String userId;
    private String commentInfo;
    private List<CommentVO> commentList;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCommentInfo() {
        return commentInfo;
    }

    public void setCommentInfo(String commentInfo) {
        this.commentInfo = commentInfo;
    }

    public List<CommentVO> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<CommentVO> commentList) {
        this.commentList = commentList;
    }

    public CommentVO() {
    }

    public CommentVO(String userId, String commentInfo) {
        this.userId = userId;
        this.commentInfo = commentInfo;
    }
}
