package com.yami.springcloud.controller;

import com.yami.springcloud.entities.Dept;
import com.yami.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController_Feign {

    @Autowired
    private DeptClientService service ;

    @RequestMapping("consumer/dept/add")
    public boolean add(Dept dept){
        return service.add(dept);
    }
    @RequestMapping("consumer/dept/get/{id}")
    public Dept getById(@PathVariable("id")Long id ){
       return service.get(id);
    }
    @RequestMapping("consumer/dept/getList")
    public List<Dept> getList(){
       return service.list();
    }
}
