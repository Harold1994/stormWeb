package com.harold.storm.heatmap.controller;

import com.harold.storm.heatmap.domain.ResultBean;
import com.harold.storm.heatmap.service.ResultBeanService;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class StatApp {
    @Autowired
    private ResultBeanService resultBeanService;
    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/map", method = RequestMethod.GET)
    public ModelAndView map() {
        System.out.println("test");
        return new ModelAndView("map");
    }

    @RequestMapping(value = "/mapstat", method = RequestMethod.GET)
    public ModelAndView statmaps() {
        ModelAndView view = new ModelAndView("statmap");
        List<ResultBean> list = resultBeanService.query();
        JSONArray arr = new JSONArray(list);
        view.addObject("data_json", arr);
        return view;
    }
}
