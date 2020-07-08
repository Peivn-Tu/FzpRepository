package com.psfd.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.psfd.demo.dao.InstitutionInfoDao;
import com.psfd.demo.entity.InstitutionInfoEntity;
import com.psfd.demo.service.InstutitionInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InstutitionInfoServiceImpl extends ServiceImpl<InstitutionInfoDao, InstitutionInfoEntity> implements InstutitionInfoService {
}
