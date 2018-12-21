package com.cfygit.webapi.mapper;

import com.cfygit.webapi.model.CfyTest;
import com.cfygit.webapi.model.CfyTestExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CfyTestMapper {
    long countByExample(CfyTestExample example);

    int deleteByExample(CfyTestExample example);

    int insert(CfyTest record);

    int insertSelective(CfyTest record);

    List<CfyTest> selectByExampleWithBLOBs(CfyTestExample example);

    List<CfyTest> selectByExample(CfyTestExample example);

    int updateByExampleSelective(@Param("record") CfyTest record, @Param("example") CfyTestExample example);

    int updateByExampleWithBLOBs(@Param("record") CfyTest record, @Param("example") CfyTestExample example);

    int updateByExample(@Param("record") CfyTest record, @Param("example") CfyTestExample example);
}