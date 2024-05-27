package com.seig.zsy.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.seig.zsy.entity.GraduationProjectTopic;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 卓世源
 * @since 2024-05-19
 */
public interface IGraduationProjectTopicService extends IService<GraduationProjectTopic> {

    boolean createTopic(GraduationProjectTopic topic);
    boolean updateTopic(int id, GraduationProjectTopic topic);
    boolean deleteTopic(int id);
    GraduationProjectTopic getTopic(int id);
    IPage<GraduationProjectTopic> listTopics(Page<GraduationProjectTopic> page);
}
