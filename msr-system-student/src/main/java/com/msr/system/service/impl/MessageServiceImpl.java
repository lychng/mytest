package com.msr.system.service.impl;

import com.msr.system.entity.Message;
import com.msr.system.mapper.MessageMapper;
import com.msr.system.service.MessageService;
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
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message> implements MessageService {

}
