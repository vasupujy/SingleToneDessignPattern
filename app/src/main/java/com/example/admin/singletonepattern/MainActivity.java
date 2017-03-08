package com.example.admin.singletonepattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.lang.reflect.Constructor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //This is directly use of singleton class with using instance
        SingleTonPatWithConst instanceOne = SingleTonPatWithConst.getInstance();

        /*
        This method use singleton class using constructor
        load all constructor which use in class
         */
        SingleTonPatWithConst instanceTwo = null;
        try {
            Constructor[] constructors = SingleTonPatWithConst.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (SingleTonPatWithConst) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
