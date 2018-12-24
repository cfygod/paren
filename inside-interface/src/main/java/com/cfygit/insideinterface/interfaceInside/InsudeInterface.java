package com.cfygit.insideinterface.interfaceInside;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("hello/cfy")
public interface InsudeInterface {
    @RequestMapping("/test")
    ResponseEntity<Boolean> createCart();

}