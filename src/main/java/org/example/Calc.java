package org.example;

abstract class Calc {
        Logger l=Logger.getLogger("kitty");
        private int a;
        private int b;
        public void sett(int a,int b)
        {
            this.a=a;
            this.b=b;
        }
        int get1()
        {
            return a;
        }
        int get2()
        {
            return b;
        }
        abstract int cal(int a,int b);
    }
