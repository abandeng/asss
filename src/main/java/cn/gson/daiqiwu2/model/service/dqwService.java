package cn.gson.daiqiwu2.model.service;

import cn.gson.daiqiwu2.model.mapper.PtMapper;
import cn.gson.daiqiwu2.model.mapper.gxMapper;
import cn.gson.daiqiwu2.model.pojos.gxMan;
import cn.gson.daiqiwu2.model.pojos.ptMan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class dqwService {
    @Autowired
    PtMapper aa;
    @Autowired
    gxMapper bb;
    public List<gxMan> allProject(){
        List<gxMan> listsp = bb.allGx();
        return listsp;
    }
    public List<ptMan> allMan(String seach){
        List<ptMan> listsp = aa.selectpt(seach);
        return listsp;
    }
    /**
     * 新增修改病人
     * @return
     */
    public boolean ptUpdate(ptMan proj){
        int is = 0;//判断是否新增成功
        if(proj.getPtId() == 0){//新增
            aa.insert(proj);
        }else{//修改
            is = aa.updateById(proj);
        }

        return is == 0?false:true;
    }

}
