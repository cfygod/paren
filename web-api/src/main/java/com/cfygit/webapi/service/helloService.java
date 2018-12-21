package com.cfygit.webapi.service;

import com.alibaba.fastjson.JSON;
import com.cfygit.webapi.mapper.CfyTestMapper;
import com.cfygit.webapi.model.CfyTest;
import com.cfygit.webapi.model.CfyTestExample;
import com.cfygit.webapi.vo.Testlombok;
import com.github.pagehelper.PageHelper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor(onConstructor=@_(@Autowired))
public class helloService  {

    private final CfyTestMapper cfyTestMapper;

    public String sayhello() {
        Testlombok testlombok  = Testlombok.builder().age("123").name("cfy").build();
        PageHelper.startPage(1,2);
        CfyTestExample cfyTestExample = new CfyTestExample();
        CfyTestExample.Criteria criteria = cfyTestExample.createCriteria();
        cfyTestExample.setOrderByClause(" id desc");
        List<CfyTest> list = cfyTestMapper.selectByExample(cfyTestExample);
        log.info(JSON.toJSONString(list));
        return JSON.toJSONString(list);
    }

}
