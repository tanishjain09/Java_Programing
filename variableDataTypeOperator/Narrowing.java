package variableDataTypeOperator;

import java.util.*;

public class Narrowing {
    public static void main(String[] args) {
      
      /*double d = 38.67;
      int i = (int)d; // use typecast to convert higher size data into lower size data
      System.out.println(d);
      System.out.println(i); //.67 is lost*/
      // in Narrowing we lost data
      // Narrowing is also called explicit typecasting
      // Widening is also called implicit typecasting
      
      /*int i = 130;
      byte b = (byte)i;
      System.out.println(b);
      System.out.println(i);*/
      
      double d = 23.76;
      byte b = (byte)d;
      short s = (short)d;
      int i = (int)d;
      char ch = (char)d;
      System.out.println(d);
      System.out.println(b);
      System.out.println(s);
      System.out.println(i);
      System.out.println(ch);
      
      
      
      
  }
}