package dao.impl;

import dao.Reading;

public class Home implements Reading {
    public void read() {
        System.out.println("在家读书");
    }

    public void eat() {
        System.out.println("在餐馆吃饭");
    }
}
