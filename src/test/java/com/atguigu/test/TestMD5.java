package com.atguigu.test;

import com.atguigu.util.MD5Utils;

public class TestMD5 {
    public static void main(String[] args) {
        // 密码同样是1234却变成了密码不相同
        System.out.println(MD5Utils.md5("1234xiaowang")); //a8231077b3d5b40ffadee7f4c8f66cb7
        System.out.println(MD5Utils.md5("1234xiaoli")); //7d5250d8620fcdb53b25f96a1c7be591

    }
}
