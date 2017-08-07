package com.lyc.hyt.basecode.bean;

import javax.inject.Inject;

/**
 * Created by lcy on 2017/8/7.
 */

public class Test {

    private String name;

    private String pwd;
    @Inject
    public Test() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
