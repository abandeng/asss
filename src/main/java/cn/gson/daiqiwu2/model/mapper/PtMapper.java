package cn.gson.daiqiwu2.model.mapper;

import cn.gson.daiqiwu2.model.pojos.ptMan;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PtMapper extends BaseMapper<ptMan> {
    List<ptMan> selectpt(String seach);
}
