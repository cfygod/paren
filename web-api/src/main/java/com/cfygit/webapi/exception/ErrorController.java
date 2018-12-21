package com.cfygit.webapi.exception;

import org.springframework.boot.autoconfigure.web.servlet.error.AbstractErrorController;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ErrorController extends AbstractErrorController {

    public ErrorController(ErrorAttributes errorAttributes) {
        super(errorAttributes);
    }

    @Override
    public String getErrorPath() {
        System.out.println("getErrorPath");
        return "/error";
    }

    @RequestMapping(produces = "text/html" )
    public ModelAndView errorHtml(HttpServletRequest request,
                                  HttpServletResponse response) throws IOException {
        HttpStatus status = getStatus(request);
        getErrorAttributes(request,true);
        response.setCharacterEncoding("UTF-8");
        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        response.setStatus(status.value());
        PrintWriter writer = response.getWriter();
        Map<String, Object> body = new HashMap<>();
        body.put("error","html访问系统错误，请联系程序员大大");
        writer.write(body.toString()+ getErrorAttributes(request,true).toString());
        writer.flush();
        writer.close();
        return null;
    }

    @RequestMapping
    @ResponseBody
    public ResponseEntity<Map<String, Object>> error(HttpServletRequest request) {
        Map<String, Object> body = new HashMap<>();
        body.put("error","ajax访问系统错误，请联系程序员大大");
        System.out.println(1111);
        HttpStatus status = getStatus(request);
        return new ResponseEntity<>(body, status);
    }


}
