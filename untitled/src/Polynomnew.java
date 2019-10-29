package com.company;
public class Polynomnew {

    double[] coef;

    public Polynomnew(double[] coef) {
        this.coef = coef;
    }

    public int getlength() {
        return coef.length;
    }

    @Override
    public String toString() {
        String result = "";
        result = "" + coef[0];

        if (coef.length >= 2) {

            if (coef[0] < 0) {
                if (coef[1] == 1) {
                    result = "x" + " - " + -1 * coef[0];
                } else if (coef[1] == -1) {
                    result = " - x" + " - " + -1 * coef[0];
                } else if (coef[1] == 0) {
                    result = " - " + -1 * coef[0];
                } else {
                    result = coef[1] + "x" + " - " + -1 * coef[0];
                }

            } else if (coef[0] == 0) {
                if (coef[1] == 1) {
                    result = "x";
                } else if (coef[1] == -1) {
                    result = " - x";
                } else if (coef[1] == 0) {
                    result = " 0 ";
                } else {
                    result = coef[1] + "x";
                }

            } else if (coef[1] == 1) {
                result = "x" + " + " + result;

            } else if (coef[1] == -1) {
                result = " - x" + " + " + result;
            } else {
                result = coef[1] + "x" + " + " + coef[0];
            }


        }


        for (int i = 2; i < coef.length; i++) {
            if (coef[i] == -1) {
                if (coef[i - 1] < 0) {
                    result = " - " + "x^" + i + " " + result;
                } else {
                    result = " - " + "x^" + i + " + " + result;
                }

            } else if (coef[i] == 1) {
                if (coef[i - 1] < 0) {
                    result = "" + "x^" + i + " " + result;
                } else {
                    result = "" + "x^" + i + " + " + result;
                }
            } else if (coef[i] == 0) {
                if (coef[i - 1] < 0) {
                    result = "" + result;
                } else {
                    result = "" + result;
                }
            } else if (coef[i - 1] < 0) {
                result = "" + coef[i] + "x^" + i + " " + result;
            } else {
                result = "" + coef[i] + "x^" + i + " + " + result;
            }
        }
        return result;
    }

    public static Polynomnew addition(Polynomnew P, Polynomnew A) {

        double[] mas = new double[A.coef.length];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = A.coef[i] + P.coef[i];
        }
        return new Polynomnew(mas);

    }

    public static Polynomnew mult(Polynomnew P, Polynomnew A) {
        int rez = P.getlength() + A.getlength() - 1;
        double[] result = new double[rez];
        for (int i = 0; i < P.getlength(); i++) {
            for (int j = 0; j < P.getlength(); j++) {
                result[i + j] += P.coef[i] * A.coef[j];
            }
        }
        return new Polynomnew(result);
    }

    public static Polynomnew multint(Polynomnew A, double c) {
        double[] mas = new double[A.coef.length];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = A.coef[i] * c;
        }
        return new Polynomnew(mas);
    }

    public static Polynomnew divint(Polynomnew A, double c) {
        double[] mas = new double[A.coef.length];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = A.coef[i] * (1/c);
        }
        return new Polynomnew(mas);
    }
}