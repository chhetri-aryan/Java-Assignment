package com.grazitti.accesstest1;

/*
This is a class with default access specifier
This class is accessible to everything that is in the same package!
 */
class Default {
    int x = 100;
    void defaultMethod() {
        System.out.println("This is from Default class " + x);
    }
}

