package com.example.admin.singletonepattern;

/**
 * Created by ADMIN on 08-03-2017.
 */

public class SingleTonPatWithConst {
    private static final SingleTonPatWithConst instance = new SingleTonPatWithConst();

    //private constructor to avoid client applications to use constructor
    private SingleTonPatWithConst(){}

    public static SingleTonPatWithConst getInstance(){
        return instance;
    }


}
