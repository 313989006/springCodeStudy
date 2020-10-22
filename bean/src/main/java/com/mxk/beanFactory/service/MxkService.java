package com.mxk.beanFactory.service;

import com.mxk.beanFactory.dao.MxkDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @ClassName MxkService
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/10/22 9:26
 **/
@Component
public class MxkService implements MxkDao {

    @Autowired
    private MxkDao mxkDao;

    @Override
    public List<Map<String,String>> select() {
        System.out.println(mxkDao.select());
        return null;
    }
}
