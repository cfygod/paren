package com.cfygit.insideinterface.controller;

import com.cfygit.insideinterface.interfaceInside.InsudeInterface;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class hello implements InsudeInterface {

    @Override
    public ResponseEntity<Boolean> createCart() {
        return ResponseEntity.ok(false);
    }
}
