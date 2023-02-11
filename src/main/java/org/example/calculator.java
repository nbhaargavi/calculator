package org.example;
import java.util.*;
import java.util.logging.*;
import java.util.logging.Logger;
class Calc {
    Logger l=Logger.getLogger("kitty");
    int a;
    int b;
    public void sett(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public int get1()
    {
        return a;
    }
    public int get2()
    {
        return b;
    }
    int cal(int a,int b)
    {
        l.info("c");
        return 0;
    }
}
    class Add extends Calc
    {
        @Override
        int cal(int a, int b) {
            return a+b;
        }
    }
    class Sub extends Calc
    {
        @Override
        int cal(int a,int b) {
            return a-b;
        }
    }
    class Mul extends Calc
    {
        @Override
        int cal(int a,int b) {
            return a*b;
        }
    }
    class Div extends Calc
    {
        @Override
        int cal(int a,int b) {
            return a%b;
        }
    }
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
        Calc C = c;
        l.log(Level.INFO,() ->"Result: " + C.cal(C.get1(),C.get2()));
        sc.close();
    }
}
