package com.mydemo.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("demo")
public class DemoController {

    @RequestMapping("upload")
    public String upload(@RequestParam("file") MultipartFile file){
        System.out.println(
                file.getOriginalFilename());
        return "success";
    }
}

