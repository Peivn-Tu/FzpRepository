package com.psfd.demo.controller;

import com.psfd.demo.entity.InstitutionInfoEntity;
import com.psfd.demo.service.InstutitionInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@RestController
public class InstitutionController {
    @Autowired
    private InstutitionInfoService instutitionInfoService;

    /**
     * 添加奖惩信息
     * @param institution
     * @return
     */
    @RequestMapping(value = "/institution/add")
    public ModelAndView add(InstitutionInfoEntity institution){
        ModelAndView model = new ModelAndView();
        boolean flag = instutitionInfoService.save(institution);
        List<InstitutionInfoEntity> list = instutitionInfoService.list();
        if(flag){
            model.addObject("list",list);
            model.setViewName("listinstitution");
        } else {
            model.setViewName("error");
        }
        return  model;
    }


    /**
     * 惩奖信息 详情页
     * @param id
     * @return
     */
    @RequestMapping(value = "/institution/detail")
    public ModelAndView detail(@RequestParam("id") String id){
        ModelAndView model = new ModelAndView();
        InstitutionInfoEntity instutition = instutitionInfoService.getById(id);
        model.addObject("instutition",instutition);
        model.setViewName("detailinstitution");
        return model;
    }

    /**
     * 奖惩修改请求
     * @param id
     * @return
     */
    @RequestMapping(value = "/institution/update")
    public ModelAndView update(@RequestParam("id") String id){
        ModelAndView model = new ModelAndView();
        InstitutionInfoEntity instutition = instutitionInfoService.getById(id);
        model.addObject("instutition",instutition);
        model.setViewName("updateinstitution");
        return model;
    }

    /**
     * 更新惩奖信息
     * @param id
     * @param institutionInfoEntity
     * @return
     */
    @RequestMapping(value = "/institution/modification")
    public ModelAndView modification(@RequestParam("id") String id,InstitutionInfoEntity institutionInfoEntity){
        ModelAndView model = new ModelAndView();
        int inid = Integer.parseInt(id);
        institutionInfoEntity.setId(inid);
        boolean flag = instutitionInfoService.updateById(institutionInfoEntity);
        List<InstitutionInfoEntity> list = instutitionInfoService.list();
        if(flag){
            model.addObject("list",list);
            model.setViewName("listinstitution");
        } else {
            model.setViewName("error");
        }
        return model;
    }

    /**
     * 查看奖惩信息
     * @return
     */
    @RequestMapping(value = "/institution/check")
    public ModelAndView check(){
        ModelAndView model = new ModelAndView();
        List<InstitutionInfoEntity> list = instutitionInfoService.list();
        model.addObject("list",list);
        model.setViewName("listinstitution");
        return model;
    }

    @RequestMapping(value = "/institution/del")
    public ModelAndView del(@RequestParam("id") String id){
        ModelAndView model = new ModelAndView();
        boolean flag = instutitionInfoService.removeById(id);
        List<InstitutionInfoEntity> list = instutitionInfoService.list();
        if(flag){
            model.addObject("list",list);
            model.setViewName("listinstitution");
        } else {
            model.setViewName("error");
        }
        return model;
    }


}
