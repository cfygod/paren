package com.cfygit.parent.controller;

import com.cfygit.parent.service.helloService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class hello {

    private final helloService helloService;


    @RequestMapping("/h")
    public String sayHello() {
        log.info("ffz");
        return helloService.sayhello();
    }

    @RequestMapping(path = "/h/{id}", method = RequestMethod.GET)
    public void sayHellow(@PathVariable("id") Long id) {
        log.info("id:===" + id);
    }

    /**
     * 用来获取url对应的内容
     *
     * @param id
     */
    @GetMapping(path = "/getMapping/{id}",
            consumes = "application/json", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void getMapping(@PathVariable("id") Long id) {
        log.info("id:===" + id);
    }

    /**
     * 向服务器提交信息
     *
     * @param id
     */
    @PostMapping(path = "/postMapping/{id}",
            consumes = "application/json",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE/*,
            params = "action=save"*/)
    public void postMapping(@PathVariable("id") Long id) {
        log.info("id:===" + id);
    }

    /**
     * 局部更新操作
     *
     * @param id
     */
    @PutMapping(path = "/putMapping/{id}")
    public void putMapping(@PathVariable("id") Long id) {
        log.info("id:===" + id);
    }

    /**
     * 删除操作
     *
     * @param id
     */
    @DeleteMapping(path = "/deleteMapping/{id}")
    public void deleteMapping(@PathVariable("id") Long id) {
        log.info("id:===" + id);
    }

    /**
     * 局部更新操作 类似于put
     *
     * @param id
     */
    @PatchMapping(path = "/patchMapping/{id}")
    public void patchMapping(@PathVariable("id") Long id) {
        log.info("id:===" + id);
    }

    /**
     * ant路径表达 获取系统配置信息
     */
    @GetMapping(path = "/test/${query.all}.json")
    public void GetMappingANT() {
        log.info("id:===");
    }



}
