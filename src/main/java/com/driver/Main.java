package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwOnly=new RWOnly();
        rwOnly.name="shri";
        System.out.println(rwOnly.name);
        //java: name has private access in com.driver.RWOnly
        rwOnly.setName("shri");
        rwOnly.getName();
    }
}