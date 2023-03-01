package org.example;

abstract class Calc {
        Logger l=Logger.getLogger("kitty");
        private int n1;
        private int n2;

        public void sett(int a,int b)
        {
            this.n1=a;
            this.n2=b;
        }
        int get1()
        {
            return n1;
        }
        int get2()
        {
            return n2;
        }
        abstract int cal(int a,int b);
    }

