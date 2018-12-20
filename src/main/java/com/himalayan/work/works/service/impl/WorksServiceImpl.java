package com.himalayan.work.works.service.impl;

import com.himalayan.work.works.model.Works;
import com.himalayan.work.works.dao.WorksMapper;
import com.himalayan.work.works.service.WorksService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 工作经历记录 服务实现类
 * </p>
 *
 * @author zjk
 * @since 2018-12-20
 */
@Service
public class WorksServiceImpl extends ServiceImpl<WorksMapper, Works> implements WorksService {

}
