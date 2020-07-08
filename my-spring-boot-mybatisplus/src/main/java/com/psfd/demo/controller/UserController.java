package com.psfd.demo.controller;

import com.psfd.demo.entity.PopeInfoEntity;
import com.psfd.demo.service.PopeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private PopeInfoService popeInfoService;

    @RequestMapping(value = "/user/login")
    public ModelAndView login(@RequestParam("userName") String name,@RequestParam("password") String password){

        ModelAndView model = new ModelAndView();
        System.out.println(name+password);
        Map<String,Object> map = new HashMap<>();
        map.put("user_name",name);
        map.put("password",password);
       Collection<PopeInfoEntity> userInfoEntityList = popeInfoService.listByMap(map);
       if(!userInfoEntityList.isEmpty()){
           model.setViewName("manage");
       }else{
           model.setViewName("welcome");
       }
       return model;
    }

    /**
     * 增加人员信息
     * @param user
     * @return
     */
    @RequestMapping(value = "/user/people")
    public ModelAndView adduser(PopeInfoEntity user){
        System.out.println(user);
        ModelAndView model = new ModelAndView();
        boolean falg = popeInfoService.save(user);
        if(falg){
            model.setViewName("success");
        } else {
            model.setViewName("error");
        }
        return model;
    }

    /**
     * 查询人员信息
     */

    @RequestMapping(value = "/user/look")
    public ModelAndView look(){

        ModelAndView model = new ModelAndView();
        List<PopeInfoEntity> list = popeInfoService.list();
        System.out.println(list);
        model.addObject("list",list);
        model.setViewName("listuser");
        return model;
    }

    /**
     * 修改页面(输入人员信息)
     * @param id
     * @return
     */

    @RequestMapping(value = "/user/update")
    public ModelAndView update(@RequestParam("id") String id){
        ModelAndView model = new ModelAndView();
        System.out.println("id是： "+id);
        Map<String,Object> map = new HashMap<>();
        map.put("id",id);
        Collection<PopeInfoEntity> userInfoEntityList = popeInfoService.listByMap(map);
        System.out.println("这个人的信息是： "+userInfoEntityList);
        model.addObject("userInfoEntityList",userInfoEntityList);
        model.addObject("id", id);
        model.setViewName("updateuser");
        return model;
    }

    /**
     * 更新人员信息
     * @param popeInfoEntity
     * @param userId
     * @return
     */

    @RequestMapping(value = "/user/renewal")
    public  ModelAndView renewal(PopeInfoEntity popeInfoEntity,@RequestParam("userId") String userId){
        ModelAndView model = new ModelAndView();
        System.out.println("USER: "+popeInfoEntity);
        int id = Integer.parseInt(userId);
        popeInfoEntity.setId(id);;
       boolean  flag = popeInfoService.updateById(popeInfoEntity);
       if(flag){
           model.setViewName("success");
       } else {
           model.setViewName("error");
       }
       return model;

    }




    @RequestMapping("/user/del")
    public ModelAndView del(@RequestParam("id") String id){

        ModelAndView model = new ModelAndView();
        boolean flag = popeInfoService.removeById(id);
        if(flag){
            model.setViewName("success");
        } else {
            model.setViewName("error");
        }
        return  model;
    }

}
