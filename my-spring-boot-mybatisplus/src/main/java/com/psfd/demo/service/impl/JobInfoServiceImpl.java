package com.psfd.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.psfd.demo.dao.JobInfoDao;
import com.psfd.demo.entity.JobInfoEntity;
import com.psfd.demo.service.JobInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class JobInfoServiceImpl extends ServiceImpl<JobInfoDao, JobInfoEntity> implements JobInfoService{
}
