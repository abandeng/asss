package cn.gson.daiqiwu2.model.pojos;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data//get  set方法
public class ptMan {
  @TableId(value = "pt_id",type = IdType.AUTO)
  private long ptId;
  private String ptName;
  private String ptAge;
  private String ptNumber;
  private String ptPhone;
  private String ptDz;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="Asia/Shanghai")//将数据库的类型返回成指定类型
  private java.sql.Timestamp  ptTime;
  private String ptZd;
  private String ptNo;
  private String ptGc;
  private String ptCsr;
  private String ptTbr;
  private String gxId;
  private String ptSex;
  private String ptGz;
  @TableField(exist = false)
  private gxMan gx;//关系信息
}
