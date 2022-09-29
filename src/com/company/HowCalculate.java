package com.company;

import java.awt.geom.QuadCurve2D;

public class HowCalculate {

    public static void main(String[] args) {
       int a = 5 % 3;
        System.out.println(a);
        double b = 1 / 3.;
        System.out.println(b);
        //int c = 2 / 0;
        //System.out.println(c);
        double d = 2. / 0;
        System.out.println(d);
        double e = d * 0;
        System.out.println(e);
        System.out.println(Double.isInfinite(d));
        System.out.println(Double.isNaN(e));

    }
}
