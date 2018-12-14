package com.cfygit.parent.controller;

import com.cfygit.parent.service.helloService;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class hello {
    @Autowired
    private helloService helloService;
    @BeforeClass
    public static void beforeClassTest () throws Exception {
    }
    @Before
    public  void beforeTest () throws Exception {
    }
    @Test
    public void sayHello() {
        System.out.println( helloService.sayhello());
    }
    @After
    public  void afterTest() throws Exception {

    }
    @AfterClass
    public  static void AfterClassTest() throws Exception {

    }
}
