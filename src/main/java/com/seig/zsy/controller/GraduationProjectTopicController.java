package com.seig.zsy.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.seig.zsy.common.ResponseResult;
import com.seig.zsy.entity.GraduationProjectTopic;
import com.seig.zsy.service.IGraduationProjectTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 卓世源
 * @since 2024-05-19
 */

@RestController
@RequestMapping("/graduation")
//@RequestMapping("/graduation-project-topic")
public class GraduationProjectTopicController {

    @Autowired
    private IGraduationProjectTopicService igraduationProjectTopicService;

    // 创建题目
    @PostMapping("/topic")
    public ResponseResult<?> createTopic(@RequestBody GraduationProjectTopic topic) {
        try {
            // 调用Service层的方法来处理新增题目
            igraduationProjectTopicService.createTopic(topic);
            return ResponseResult.success("题目创建成功");
        } catch (Exception e) {
            return ResponseResult.error(500, "题目创建失败：" + e.getMessage());
        }
    }

    // 更新题目
    @PutMapping("/topic/{id}")
    public ResponseResult<?> updateTopic(@PathVariable int id, @RequestBody GraduationProjectTopic topic) {
        try {
            // 调用Service层的方法来处理更新题目
            igraduationProjectTopicService.updateTopic(id, topic);
            return ResponseResult.success("题目更新成功");
        } catch (Exception e) {
            return ResponseResult.error(500, "题目更新失败：" + e.getMessage());
        }
    }

    // 删除题目
    @DeleteMapping("/topic/{id}")
    public ResponseResult<?> deleteTopic(@PathVariable int id) {
        try {
            // 调用Service层的方法来处理删除题目
            igraduationProjectTopicService.deleteTopic(id);
            return ResponseResult.success("题目删除成功");
        } catch (Exception e) {
            return ResponseResult.error(500, "题目删除失败：" + e.getMessage());
        }
    }

    // 查询题目
    @GetMapping("/topic/{id}")
    public ResponseResult<?> getTopic(@PathVariable int id) {
        try {
            GraduationProjectTopic topic = igraduationProjectTopicService.getTopic(id);
            return ResponseResult.success(topic);
        } catch (Exception e) {
            return ResponseResult.error(500, "查询失败：" + e.getMessage());
        }
    }

    // 列出所有题目
    @GetMapping("/topics")
    public ResponseResult<?> listTopics(@RequestParam(required = false, defaultValue = "1") int current, @RequestParam(required = false, defaultValue = "10") int size) {
        try {
            Page<GraduationProjectTopic> page = new Page<>(current, size);
            IPage<GraduationProjectTopic> topics = igraduationProjectTopicService.listTopics(page);
            return ResponseResult.success(topics);
        } catch (Exception e) {
            return ResponseResult.error(500, "题目列表获取失败：" + e.getMessage());
        }
    }



}