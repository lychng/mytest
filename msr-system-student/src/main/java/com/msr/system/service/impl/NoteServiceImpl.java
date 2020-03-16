package com.msr.system.service.impl;

import com.msr.system.entity.Note;
import com.msr.system.mapper.NoteMapper;
import com.msr.system.service.NoteService;
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
public class NoteServiceImpl extends ServiceImpl<NoteMapper, Note> implements NoteService {

}
