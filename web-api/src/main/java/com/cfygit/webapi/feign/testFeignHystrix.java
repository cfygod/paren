package com.cfygit.webapi.feign;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("fallback/demo/api")
public class testFeignHystrix implements testFeign{
    @Override
    public ResponseEntity<Boolean> createCart() {
        return null;
    }
}
