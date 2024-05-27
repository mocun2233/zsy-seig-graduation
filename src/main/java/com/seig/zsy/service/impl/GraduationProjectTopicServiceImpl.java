package com.seig.zsy.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.seig.zsy.entity.GraduationProjectTopic;
import com.seig.zsy.mapper.GraduationProjectTopicMapper;
import com.seig.zsy.service.IGraduationProjectTopicService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 卓世源
 * @since 2024-05-19
 */
@Service
public class GraduationProjectTopicServiceImpl extends ServiceImpl<GraduationProjectTopicMapper, GraduationProjectTopic> implements IGraduationProjectTopicService {




    @Override
    public boolean createTopic(GraduationProjectTopic topic) {
        return save(topic);
    }

    @Override
    public boolean updateTopic(int id, GraduationProjectTopic topic) {
        topic.setId(id); // 设置ID以确保更新正确的记录
        return updateById(topic);
    }

    @Override
    public boolean deleteTopic(int id) {
        return removeById(id);
    }

    @Override
    public GraduationProjectTopic getTopic(int id) {
        return getById(id);
    }

    @Override
    public IPage<GraduationProjectTopic> listTopics(Page<GraduationProjectTopic> page) {
        return page(page);
    }
}
