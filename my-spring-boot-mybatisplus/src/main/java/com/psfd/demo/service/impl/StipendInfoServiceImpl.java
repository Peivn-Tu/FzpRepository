package com.psfd.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.psfd.demo.dao.StipendInfoDao;
import com.psfd.demo.entity.StipendInfoEntity;
import com.psfd.demo.service.StipendInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StipendInfoServiceImpl extends ServiceImpl<StipendInfoDao, StipendInfoEntity> implements StipendInfoService {


}
