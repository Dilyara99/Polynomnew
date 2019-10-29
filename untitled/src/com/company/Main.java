package com.company;

public class Main {

    public static void main(String[] args) {
        int c = 2;
        double[] n = new double[8];
        n[0] = - 90;
        n[1] = 1;
        n[2] = 67;
        n[3] = 0;
        n[4] = - 1;
        n[5] = 10;
        n[6] = 38;
        n[7] = 0;
        Polynomnew A = new Polynomnew(n);
        System.out.println(A);

        double[] d = new double[8];
        d[0] = - 78;
        d[1] = - 2;
        d[2] = 9;
        d[3] = 2;
        d[4] = - 45;
        d[5] = - 9;
        d[6] = 56;
        d[7] = 99;
        Polynomnew P = new Polynomnew(d);
        System.out.println(P);


        Polynomnew addition = Polynomnew.addition(A, P);
        System.out.println(addition);

        Polynomnew mult = Polynomnew.mult(A, P);
        System.out.println(mult);

        Polynomnew multint = Polynomnew.multint(A, c);
        System.out.println(multint);

        Polynomnew divint = Polynomnew.divint(A, c);
        System.out.println(divint);
    }

}

