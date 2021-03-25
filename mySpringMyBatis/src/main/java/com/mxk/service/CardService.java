package com.mxk.service;

import com.mxk.dao.CardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

/**
 * @ClassName CardService
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/3/17 14:27
 **/
@Component
public class CardService {

//    @Autowired
    private CardDao cardDao;

    public List<Map<Integer,String>> list(String name){
        return cardDao.list(name);
    }

    @PostConstruct
    public void init(){

    }
}
