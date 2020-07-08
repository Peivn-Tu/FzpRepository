package com.psfd.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.psfd.demo.dao.PopeInfoDao;
import com.psfd.demo.entity.PopeInfoEntity;
import com.psfd.demo.service.PopeInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PopeInfoServiceImpl extends ServiceImpl<PopeInfoDao, PopeInfoEntity> implements PopeInfoService {
}
