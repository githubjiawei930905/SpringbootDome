package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.Mapper.EltBackuserRepository;
import com.example.demo.po.EltBackuser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Admin on 2017/7/27.
 */
@Controller
public class HelloWorldController {

    @Autowired
    private EltBackuserRepository backuserRepository;

    protected static Logger logger= LoggerFactory.getLogger(HelloWorldController.class);
    @RequestMapping("/holle")
    public @ResponseBody String hello() {
        logger.debug("Hello World");
        return "Hello World";
    }

    @RequestMapping("/index/{name}")
    @Cacheable(value="user-key")
    public @ResponseBody String index(@PathVariable String name) {
        logger.debug("index");
        System.out.print(name);
        EltBackuser backuser = backuserRepository.findByusername(name);

        return JSON.toJSONString(backuser);
    }
}
