package com.arcana.klee.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {
    public HomeService() {
    }

    public String kleeHome() {
        return "klee";
    }

    public String fischlHome() {
        return "fischl";
    }
}