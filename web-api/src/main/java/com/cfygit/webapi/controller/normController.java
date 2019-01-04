package com.cfygit.webapi.controller;

import com.cfygit.webapi.vo.TestvalidVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


/**
 * @author  cfy
 * 代码规范示例
 * created by 2019-01-04
 */
@Slf4j
@RestController
@RequiredArgsConstructor(onConstructor = @_(@Autowired))
public class normController {

    @RequestMapping(path = "/norm/demo")
    public ResponseEntity setSomething(@RequestBody @Valid TestvalidVo testvalidVo){
        return ResponseEntity.ok(testvalidVo);
    }


}
