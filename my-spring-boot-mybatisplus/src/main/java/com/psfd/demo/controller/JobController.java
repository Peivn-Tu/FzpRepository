package com.psfd.demo.controller;

import com.psfd.demo.entity.JobInfoEntity;
import com.psfd.demo.entity.PopeInfoEntity;
import com.psfd.demo.service.JobInfoService;
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
public class JobController {

    @Autowired
    private JobInfoService jobInfoService;


    /**
     * 应聘信息录入
     * @param job
     * @return
     */

    @RequestMapping(value = "/user/modifyjob")
    public ModelAndView addjob(JobInfoEntity job){
        ModelAndView model = new ModelAndView();
        System.out.println(job);
        boolean flag = jobInfoService.save(job);
        List<JobInfoEntity> list = jobInfoService.list();
        model.addObject("list",list);
        if(flag){
            model.setViewName("listjob");
        } else {
            model.setViewName("error");
        }
        return  model;
    }


    /**
     * 查看人才信息
     * @return
     */

    @RequestMapping(value = "/look/job")
    public ModelAndView checkJob(){
        ModelAndView model = new ModelAndView();
        List<JobInfoEntity> list = jobInfoService.list();
        System.out.println(list);
        model.addObject("list",list);
        model.setViewName("listjob");
        return model;
    }

    /**
     * 招聘人员详情页
     * @param id
     * @return
     */
    @RequestMapping("/job/detailjob")
    public ModelAndView datail(@RequestParam("id") String id){
        ModelAndView model = new ModelAndView();
        Map<String,Object> map = new HashMap<>();
        map.put("id",id);
        Collection<JobInfoEntity> joblist = jobInfoService.listByMap(map);
        System.out.println("<<<<<< "+joblist);
        model.addObject("joblist",joblist);
        model.setViewName("detailjob");
        return model;
    }

    /**
     * 人才信息删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/job/deljob")
    public ModelAndView deljob(@RequestParam("id") String  id){
        ModelAndView model = new ModelAndView();
        boolean flag = jobInfoService.removeById(id);
        List<JobInfoEntity> list = jobInfoService.list();
        model.addObject("list",list);
        if(flag){
            model.setViewName("listjob");
        } else {
            model.setViewName("error");
        }
        return  model;
    }


    /**
     * 入库
     * @param id
     * @param isstock
     * @return
     */
    @RequestMapping(value = "/job/updatejob")
    public ModelAndView godown(@RequestParam("id") String id,@RequestParam("isstock") String isstock){
        System.out.println("ID: "+id);
        System.out.println("Isstock:  "+isstock);
        ModelAndView model = new ModelAndView();
        JobInfoEntity job = jobInfoService.getById(id);
        System.out.println("<><><><><> "+job);

        job.setIsstock(isstock);
        jobInfoService.updateById(job);
        Map<String,Object> map = new HashMap<>();
        map.put("isstock","1");
        Collection<JobInfoEntity> list = jobInfoService.listByMap(map);
        System.out.println("LIST:  "+list);

        model.addObject("list",list);
        model.setViewName("listjob");
        return  model;
    }


    @RequestMapping(value = "/job/pool")
    public  ModelAndView  pool(){
        ModelAndView model = new ModelAndView();
        Map<String,Object> map = new HashMap<>();
        map.put("isstock","1");
        Collection<JobInfoEntity> list = jobInfoService.listByMap(map);
        System.out.println("LIST:  "+list);

        model.addObject("list",list);
        model.setViewName("listjob");
        return model;
    }

}
