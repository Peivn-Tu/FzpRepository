package com.psfd.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.psfd.demo.dao.EducateInfoDao;
import com.psfd.demo.entity.EducateInfoEntity;
import com.psfd.demo.service.EducateService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducateServiceImpl extends ServiceImpl<EducateInfoDao, EducateInfoEntity> implements EducateService {
}
