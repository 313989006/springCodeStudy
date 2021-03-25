package com.mxk.test;

import com.mxk.entity.User;
import com.mxk.util.CommonUtil;

import javax.jws.soap.SOAPBinding;

/**
 * @ClassName AnnoTest
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/3/10 10:39
 **/
public class AnnoTest {

    public static void main(String[] args) {

        User user = new User();

        user.setId("1");
        user.setName("mxk");

        String sql = CommonUtil.buildQueryForEntity(user);
        System.out.println(sql);

    }
}
