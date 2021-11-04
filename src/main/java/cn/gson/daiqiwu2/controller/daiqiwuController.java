package cn.gson.daiqiwu2.controller;

import cn.gson.daiqiwu2.model.pojos.gxMan;
import cn.gson.daiqiwu2.model.pojos.ptMan;
import cn.gson.daiqiwu2.model.service.dqwService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class daiqiwuController {
    @Autowired
    dqwService aa;
    @RequestMapping("allgx")
    public List<gxMan> aall(){
        return  aa.allProject();
    }
    @RequestMapping("allman")
    public List<ptMan> aaman(String seach){
        return  aa.allMan(seach);
    }
    @RequestMapping("aOrUrman")
    public boolean roomjAddOrUpdate(@RequestBody String projstr){
        System.out.println(projstr);
        Map map = JSON.parseObject(projstr, Map.class);//将病房对象字符串转换为病房对象
        ptMan proj = JSON.parseObject(map.get("proj").toString(), ptMan.class);
        System.out.println(proj);
        return aa.ptUpdate(proj);
    }
}
