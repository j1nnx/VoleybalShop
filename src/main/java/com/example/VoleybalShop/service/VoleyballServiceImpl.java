package com.example.VoleybalShop.service;

import com.example.VoleybalShop.domain.Voleyball;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoleyballServiceImpl implements VoleyballService{
    @Autowired
    private final Voleyball voleyball;

    public VoleyballServiceImpl(Voleyball voleyball){
        this.voleyball = voleyball;
    }

    @Override
    public List<Integer> add(List<Integer> id){
        return voleyball.add(id);
    }

    @Override
    public List<Integer> get(){
        return voleyball.getList();
    }

}
