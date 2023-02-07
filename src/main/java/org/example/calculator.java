package org.example;
import java.util.*;
import java.util.logging.*;
import java.util.logging.Logger;
class calc {
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
    public int cal(int a,int b)
    {
        return 0;
    }
}
    class add extends calc
    {
        public int cal(int a, int b) {
            return a+b;
        }
    }
    class sub extends calc
    {
        public int cal(int a,int b) {
            return a-b;
        }
    }
    class mul extends calc
    {
        public int cal(int a,int b) {
            return a*b;
        }
    }
    class div extends calc
    {
        public int cal(int a,int b) {
            return a%b;
        }
    }
public class calculator {
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
        calc c=null;
        switch(ch)
        {
            case 1:
                c=new add();
                break;
            case 2:
                c=new sub();
                break;
            case 3:
                c=new mul();
                break;
            case 4:
               c=new div();
                break;
        }
        c.sett(a,b);
        calc finalC = c;
        l.log(Level.INFO,() ->"Result: " + finalC.cal(finalC.get1(), finalC.get2()));
        sc.close();
    }
}
