package com.my.bbs.service;

import com.my.bbs.entity.BBSPostComment;
import com.my.bbs.entity.RecentCommentListEntity;
import com.my.bbs.util.PageQueryUtil;
import com.my.bbs.util.PageResult;

import java.util.List;

public interface BBSPostCommentService {

    /**
     * 增加一条回复
     *
     * @param postComment
     * @return
     */
    Boolean addPostComment(BBSPostComment postComment);

    /**
     * 删除一条回复
     *
     * @param commentId
     * @param userId
     * @return
     */
    Boolean delPostComment(Long commentId, Long userId);

    /**
     * 详情页评论列表
     *
     * @param postId
     * @param commentPage
     * @return
     */
    PageResult getCommentsByPostId(Long postId, int commentPage);

    /**
     * 个人中心-最近评论列表
     *
     * @param userId
     * @return
     */
    List<RecentCommentListEntity> getRecentCommentListByUserId(Long userId);
}
