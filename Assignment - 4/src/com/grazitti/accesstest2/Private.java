package com.grazitti.accesstest2;

import com.grazitti.accesstest1.Public;
/*
This is a class with private access specifier
This class is accessible only within the class
 */
class Private{
   private int x = 100;
   private void privateMethod() {
       System.out.println("This is private method from private class");
   }
}
