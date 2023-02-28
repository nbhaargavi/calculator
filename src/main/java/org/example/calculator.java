package org.example;
import java.util.*;
import java.util.logging.*;
import java.util.logging.Logger;

public class Calculator {
    public static void main(String[] args)
    {
        Logger l=Logger.getLogger("kitty");
        Scanner sc=new Scanner(System.in);
        l.info("Enter the number 1");
        int a=sc.nextInt();
        l.info("Enter the number 2");
        int b=sc.nextInt();
        l.info("1.Addition");
        l.info("2.Subtraction");
        l.info("3.Multiplication");
        l.info("4.Division");
        l.info("Enter a choice");
        int ch=sc.nextInt();
        Calc c=null;
        switch(ch)
        {
            case 1:
                c=new Add();
                break;
            case 2:
                c=new Sub();
                break;
            case 3:
                c=new Mul();
                break;
            case 4:
               c=new Div();
                break;
            default:
                l.info("Valid input required ");
        }
        c.sett(a,b);
        Calc k = c;
        l.log(Level.INFO,() ->"Result: " + k.cal(k.get1(),k.get2()));
        sc.close();
    }
}
