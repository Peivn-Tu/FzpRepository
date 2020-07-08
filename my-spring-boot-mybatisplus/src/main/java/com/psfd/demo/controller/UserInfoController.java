package com.psfd.demo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.psfd.demo.entity.UserInfoEntity;
import com.psfd.demo.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.*;

@RestController
public class UserInfoController {

//    @Autowired
//    private IUserInfoService iUserInfoService;
//
//    @RequestMapping("/welcome")
//    public ModelAndView welcome(){
//        ModelAndView model = new ModelAndView();
//        model.setViewName("welcome");
//        return model;
//    }

//    @PostMapping(value = "/getInfo")
//    public UserInfoEntity getInfo( @RequestParam("id")  String userId){
//        System.out.println(userId);
//        UserInfoEntity userInfoEntity = iUserInfoService.getById(userId);
//        System.out.println(userInfoEntity);
//        return userInfoEntity;
//    }
//
//    @PostMapping(value = "/user/login")
//    public String login(@RequestParam("userid") String userId,
//                        Map<String, Object> map){
//        System.out.println(userId);
//        UserInfoEntity userInfoEntity = iUserInfoService.getById(userId);
//        System.out.println(userInfoEntity);
//        return "index";
//    }


//    @PostMapping(value = "/user/login")
//    public String login(@RequestParam("userid") String userId){
//        System.out.println(userId);
//        UserInfoEntity userInfoEntity = iUserInfoService.getById(userId);
//        System.out.println(userInfoEntity);
//        return "yes";
//    }
//
//    /**
//     * 查询全部shuju
//     */
//    @PostMapping(value = "/user/getList")
//    public List<UserInfoEntity> getList(){
//        List<UserInfoEntity> userInfoEntities = iUserInfoService.list();
//        return userInfoEntities;
//    }
//
//    /**
//     * 分页查询数据
//     */
//
//    @PostMapping(value = "/user/getInfoListPage")
//    public IPage<UserInfoEntity>getInfoListPage(){
//        //需要在config配置类中配置分页插件
//        IPage<UserInfoEntity> page = new Page<UserInfoEntity>();
//        page.setCurrent(5); //当前页
//        page.setSize(2);    //每页条数
//        page = iUserInfoService.page(page);
//        return page;
//    }
//
//    /**
//     * 根据指定字段查询用户信息集合
//     * @Author Sans
//     * @CreateTime 2019/6/8 16:39
//     * @Return Collection<UserInfoEntity> 用户实体集合
//     */
//    @RequestMapping("/user/getListMap")
//    public Collection<UserInfoEntity> getListMap(){
//        Map<String,Object> map = new HashMap<>();
//        //kay是字段名 value是字段值
//        map.put("name","fxy");
//        Collection<UserInfoEntity> userInfoEntityList = iUserInfoService.listByMap(map);
//        return userInfoEntityList;
//    }
//
//    /**
//     * 新增用户
//     */
//
//    @RequestMapping("/user/saveInfo")
//    public void saveInfo(){
//        UserInfoEntity userInfoEntity = new UserInfoEntity();
//        userInfoEntity.setName("fxy");
//        userInfoEntity.setSkill("mysql");
//        userInfoEntity.setAge(23);
//        userInfoEntity.setFraction(60L);
//        userInfoEntity.setEvaluate("该学生是一个费中非");
//        iUserInfoService.save(userInfoEntity);
//
//    }
//
//    /**
//     * 批量增加用户信息
//     */
//
//    @RequestMapping("/user/saveInfoList")
//    public void saveInfoList(){
//        //创建对象
//        UserInfoEntity sans = new UserInfoEntity();
//        sans.setName("qss");
//        sans.setSkill("睡觉");
//        sans.setAge(18);
//        sans.setFraction(60L);
//        sans.setEvaluate("Sans是一个爱睡觉,并且身材较矮骨骼巨大的骷髅小胖子");
//        UserInfoEntity papyrus = new UserInfoEntity();
//        papyrus.setName("papyrus");
//        papyrus.setSkill("JAVA");
//        papyrus.setAge(18);
//        papyrus.setFraction(58L);
//        papyrus.setEvaluate("Papyrus是一个讲话大声、个性张扬的骷髅，给人自信、有魅力的骷髅小瘦子");
//        //批量删除
//        List<UserInfoEntity> list = new ArrayList<>();
//        list.add(sans);
//        list.add(papyrus);
//        iUserInfoService.saveBatch(list);
//
//    }



}
