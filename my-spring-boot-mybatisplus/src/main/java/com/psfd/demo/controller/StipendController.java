package com.psfd.demo.controller;

import com.psfd.demo.entity.PopeInfoEntity;
import com.psfd.demo.entity.StipendInfoEntity;
import com.psfd.demo.service.StipendInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.*;

@RestController
public class StipendController {
    @Autowired
    private StipendInfoService stipendInfoService;

    /**
     * 薪金录入
     * @param sp
     * @return
     */
    @RequestMapping(value = "/stipend/addstipend")
    public ModelAndView addstipend(StipendInfoEntity sp){
        ModelAndView model = new ModelAndView();
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
        String dateFormat = format.format(date);
        sp.setGranttime(dateFormat);
        Float total = sp.getEat()+sp.getHouse()+sp.getScot()+sp.getDuty()+sp.getPunishment()+sp.getOther()+ Float.parseFloat(sp.getBasic());
        sp.setTotalize(total);
        boolean flag = stipendInfoService.save(sp);
        List<StipendInfoEntity> list = stipendInfoService.list();
        if(flag){
            model.addObject("list",list);
            model.setViewName("liststipend");
        }
        return model;
    }

    /**
     * 修改请求处理
     * @param id
     * @return
     */
    @RequestMapping(value = "/stipend/update")
    public ModelAndView update(@RequestParam("id") String id){
        ModelAndView model = new ModelAndView();
        Map<String,Object> map = new HashMap<>();
        map.put("id",id);
        Collection<StipendInfoEntity> stipendList = stipendInfoService.listByMap(map);
        model.addObject("stipendList",stipendList);
        model.setViewName("updatestipend");
        return model;
    }

    /**
     * 修改薪金(提交)
     * @param id
     * @param sp
     * @return
     */
    @RequestMapping(value = "/stipend/modification")
    public ModelAndView modification(@RequestParam("id") String id,StipendInfoEntity sp){
        ModelAndView model = new ModelAndView();
        int sid = Integer.parseInt(id);
        sp.setId(sid);
        boolean flat = stipendInfoService.updateById(sp);
        List<StipendInfoEntity> list = stipendInfoService.list();
        if (flat){
            model.addObject("list",list);
            model.setViewName("liststipend");
        }
        return model;
    }

    /**
     * 删除薪金
     * @param id
     * @return
     */
    @RequestMapping(value = "/stipend/del")
    public ModelAndView del(@RequestParam("id") String id){
        ModelAndView model = new ModelAndView();
        boolean flat = stipendInfoService.removeById(id);
        List<StipendInfoEntity> list = stipendInfoService.list();
        if (flat){
            model.addObject("list",list);
            model.setViewName("liststipend");
        }
        return model;
    }

    @RequestMapping(value = "/stipend/check")
    public ModelAndView check(){
        ModelAndView model = new ModelAndView();
        List<StipendInfoEntity> list = stipendInfoService.list();
        model.addObject("list",list);
        model.setViewName("liststipend");
        return model;
    }


}
