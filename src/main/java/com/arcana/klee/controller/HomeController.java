package com.arcana.klee.controller;

import com.arcana.klee.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    HomeService homeService;

    @Autowired
    public HomeController(HomeService homeServiceParam) {
        this.homeService = homeServiceParam;
    }

    @ResponseBody
    @GetMapping(value = {"/home/klee"}, produces = {"application/json"})
    public String arcana() throws Exception {
        String res = "this is home -> arcana.";
        String klee = this.homeService.kleeHome();
        res = res + klee;
        return res;
    }
}