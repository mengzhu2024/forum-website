package com.my.bbs.service;

import com.my.bbs.entity.BBSPost;

import java.util.List;

public interface BBSPostCollectService {

    /**
     * 收藏帖子
     *
     * @param userId
     * @param postId
     * @return
     */
    Boolean addCollectRecord(Long userId, Long postId);

    /**
     * 取消收藏帖子
     *
     * @param userId
     * @param postId
     * @return
     */
    Boolean deleteCollectRecord(Long userId, Long postId);

    /**
     * 验证用户是否收藏了帖子
     *
     * @param userId
     * @param postId
     * @return
     */
    Boolean validUserCollect(Long userId, Long postId);

    /**
     * 获取收藏的帖子列表
     *
     * @param userId
     * @return
     */
    List<BBSPost> getCollectRecordsByUserId(Long userId);
}
