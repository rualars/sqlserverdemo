package com.example.sqlserverdemo.controller;

import com.example.sqlserverdemo.entity.Access;
import com.example.sqlserverdemo.service.AccessService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@RequestMapping("msss")
public class DemoController {
    @Resource
    AccessService accessService;

    @GetMapping("get")
    public String getMethod(@RequestParam int id) {
        try {
            return accessService.getLicense(id);
        } catch (NullPointerException e) {
            return "no such id";
        }
    }

    @GetMapping("insert")
    public void insertAccess(@RequestParam int id,
                             @RequestParam String license,
                             @RequestParam int accessType,
                             @RequestParam Long timeL,
                             @RequestParam int isE) {
        Date time = new Date(timeL);
        Access access = new Access();
        access.setId(id);
        access.setLicense(license);
        access.setAccessType(accessType);
        access.setTime(time);
        access.setIsE(isE);
        accessService.insert(access);
    }
}
