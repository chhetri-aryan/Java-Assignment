package com.grazitti.accesstest2;

/*
This is a class with protected access specifier
This class is accessible to within class or class which inherit this class
 */
public class Protected{
    protected int x = 90;
    protected void protectedMethod() {
        System.out.println("This is Protected Method");
    }
}
