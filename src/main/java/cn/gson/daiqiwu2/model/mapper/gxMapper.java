package cn.gson.daiqiwu2.model.mapper;

import cn.gson.daiqiwu2.model.pojos.gxMan;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface gxMapper  extends BaseMapper<gxMan> {
    @Select("SELECT * FROM gxMan")
    List<gxMan> allGx();
}
