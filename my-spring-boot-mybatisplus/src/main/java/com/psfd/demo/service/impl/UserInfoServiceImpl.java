package com.psfd.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.psfd.demo.dao.UserInfoDao;
import com.psfd.demo.entity.UserInfoEntity;
import com.psfd.demo.service.IUserInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserInfoServiceImpl extends ServiceImpl<UserInfoDao, UserInfoEntity> implements IUserInfoService {
}
