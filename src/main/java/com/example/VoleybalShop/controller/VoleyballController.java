package com.example.VoleybalShop.controller;

import com.example.VoleybalShop.service.VoleyballService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class VoleyballController {
    private final VoleyballService voleyballService;

    public VoleyballController(VoleyballService voleyballService) {
        this.voleyballService = voleyballService;
    }

    @GetMapping(path = "/add")
    public List<Integer> add(@RequestParam List<Integer> id){
        return voleyballService.add(id);
    }

    @GetMapping(path = "/get")
    public List<Integer> get(){
        return voleyballService.get();
    }
}
