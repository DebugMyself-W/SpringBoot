package com.example.modules.controller;

import com.example.modules.service.IlambdaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * java8 stream api流式编程
 */
@RestController
@Slf4j
@RequestMapping("lambda")
public class LambdaController {

    @Autowired
    private IlambdaService ilambdaService;

    public static void main(String[] args){

    }
}
