package com.msr.system.service.impl;

import com.msr.system.entity.Comment;
import com.msr.system.mapper.CommentMapper;
import com.msr.system.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Liyanchong
 * @since 2020-03-12
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
