package com.psfd.demo.controller;

import com.psfd.demo.entity.EducateInfoEntity;
import com.psfd.demo.entity.JobInfoEntity;
import com.psfd.demo.service.EducateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.*;

@RestController
public class EducateController {
    @Autowired
    private EducateService educateService;

    /**
     * 培训计划录入
     * @param educate
     * @return
     */
    @RequestMapping(value = "/educate/add")
    public ModelAndView add(EducateInfoEntity educate){
        System.out.println(educate);
        ModelAndView model = new ModelAndView();
        boolean flag = educateService.save(educate);
        if(flag){
            model.setViewName("success");
        } else {
            model.setViewName("error");
        }
        return model;
    }

    /**
     * 培训计划查看
     * @return
     */
    @RequestMapping(value = "/educate/query")
    public ModelAndView query(){
        ModelAndView model = new ModelAndView();
        List<EducateInfoEntity> list = educateService.list();
        model.addObject("list",list);
        model.setViewName("listeducate");
        return model;
    }

    /**
     * 查看培训人员详情
     * @param id
     * @return
     */
    @RequestMapping(value = "/educate/detail")
    public ModelAndView datail(@RequestParam("id") String id){
        ModelAndView model = new ModelAndView();
        Map<String,Object> map = new HashMap<>();
        map.put("id",id);
        Collection<EducateInfoEntity> listByMap = educateService.listByMap(map);
        System.out.println("<<<<<< "+listByMap);
        model.addObject("listByMap",listByMap);
        model.setViewName("detailed");
        return model;
    }


    /**
     * 删除培训信息
     * @param id
     * @return
     */

    @RequestMapping(value = "/educate/del")
    public ModelAndView del(@RequestParam("id") String id){
        ModelAndView model = new ModelAndView();
        boolean flag = educateService.removeById(id);
        List<EducateInfoEntity> list = educateService.list();
        model.addObject("list",list);
        if(flag){
            model.setViewName("listeducate");
        } else {
            model.setViewName("error");
        }
        return model;
    }

    /**
     * 完成培训（跳转处理）
     * @param id
     * @return
     */

    @RequestMapping(value = "/educate/off")
    public ModelAndView off(@RequestParam("id") String id){
        ModelAndView model = new ModelAndView();
        int Id = Integer.parseInt(id);
        EducateInfoEntity educate = educateService.getById(id);
        model.addObject("id",Id);
        model.addObject("educate",educate);
        model.setViewName("updateeducate");
        return model;
    }

    /**
     * 完成培训
     * @param id
     * @param ed
     * @return
     */
    @RequestMapping("/educate/summary")
    public ModelAndView summary(@RequestParam("id") String id,EducateInfoEntity ed){
        ModelAndView model = new ModelAndView();
        EducateInfoEntity educates = educateService.getById(id);
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
        String dateFormat = format.format(date);
        educates.setCreatetime(dateFormat);
        educates.setEffect(ed.getEffect());
        educates.setSummarize(ed.getSummarize());

        educateService.updateById(educates);
        Map<String,Object> map = new HashMap<>();
        map.put("id",id);
        Collection<EducateInfoEntity> listByMap = educateService.listByMap(map);
        model.addObject("listByMap",listByMap);
        model.setViewName("detailed");
        return model;
    }

    @RequestMapping(value = "/educate/check")
    public ModelAndView check(){
        ModelAndView model = new ModelAndView();
        List<EducateInfoEntity> list = educateService.list();
        model.addObject("list",list);
        model.setViewName("listeducate");
        return model;
    }


}
