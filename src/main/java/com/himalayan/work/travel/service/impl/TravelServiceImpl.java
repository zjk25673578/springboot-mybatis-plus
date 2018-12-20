package com.himalayan.work.travel.service.impl;

import com.himalayan.work.travel.model.Travel;
import com.himalayan.work.travel.dao.TravelMapper;
import com.himalayan.work.travel.service.TravelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 家庭旅行计划表 服务实现类
 * </p>
 *
 * @author zjk
 * @since 2018-12-20
 */
@Service
public class TravelServiceImpl extends ServiceImpl<TravelMapper, Travel> implements TravelService {

}
