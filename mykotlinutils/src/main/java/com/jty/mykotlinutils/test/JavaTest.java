package com.jty.mykotlinutils.test;

import com.jty.mykotlinutils.utils.DateUtils;

import java.util.Date;

/**
 * Created by TaoYuan on 2017/9/20 0020.
 *
 */

public class JavaTest {
    public static void main(String[] args){

        String currentTime = DateUtils.formatDate(new Date(),DateUtils.DF_YYYYMMDDHHMMSS);

        System.out.println("currentTime=="+currentTime);
    }
}
