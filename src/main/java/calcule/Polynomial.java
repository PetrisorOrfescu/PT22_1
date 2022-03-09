package calcule;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static java.lang.Math.abs;

public class Polynomial {
    public ArrayList<Monome> arr;

    public ArrayList<Monome> getArr() {
        return arr;
    }

    public void setArr(ArrayList<Monome> arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "Polynomial{" +
                "arr=" + arr +
                '}';
    }

    public Polynomial(ArrayList<Monome> arr) {
        this.arr = arr;
    }

    public void derrivate() {
        for (Monome a : arr) {
            a.Derrivate();
        }
    }

    public void integrate() {
        for (Monome a : arr) {
            a.Integrate();
        }
    }

    public void add(Polynomial p) {
        for (Monome a : arr) {
            for (Monome b : p.arr)
                if (a.exponent == b.exponent) {
                    a.numaratorCoeficient = a.numaratorCoeficient * b.numitorCoeficient + b.numaratorCoeficient * a.numitorCoeficient;
                    a.numitorCoeficient *= b.numitorCoeficient;
                }

        }
        for (Monome b : p.arr) {
            int count = 0;
            for (Monome a : arr)
                if (b.exponent != a.exponent)
                    count++;
            if (count == this.arr.size())
                this.arr.add(b);
        }
        Collections.sort(this.arr);
    }

    public void substract(Polynomial p) {
        for (Monome a : arr) {
            for (Monome b : p.arr)
                if (a.exponent == b.exponent) {
                    a.numaratorCoeficient = a.numaratorCoeficient * b.numitorCoeficient - b.numaratorCoeficient * a.numitorCoeficient;
                    a.numitorCoeficient *= b.numitorCoeficient;
                }
        }
        for (Monome b : p.arr) {
            int count = 0;
            for (Monome a : arr)
                if (b.exponent != a.exponent)
                    count++;
            if (count == this.arr.size()) {
                Monome r = new Monome(b.numaratorCoeficient, b.numitorCoeficient, b.exponent);
                r.numaratorCoeficient = -r.numaratorCoeficient;
                this.arr.add(r);

            }
        }
        Collections.sort(this.arr);
    }

    public void multiply(Polynomial p) {
        ArrayList<Monome> nou = new ArrayList();
        for (Monome b : p.arr) {
            for (Monome a : this.arr) {
                Monome c = new Monome(b.getNumaratorCoeficient() * a.getNumaratorCoeficient(),
                        b.getNumitorCoeficient() * a.getNumitorCoeficient(), b.exponent + a.getExponent());
                int ok = 0;
                for (Monome d : nou) {
                    if (d.exponent == c.exponent) {
                        ok = 1;
                        d.numaratorCoeficient += c.getNumaratorCoeficient();
                    }
                }
                if (ok == 0)
                    nou.add(c);
            }
        }
        this.arr = nou;
        Collections.sort(this.arr);


    }

    public String polynomialOut() {
        String s = new String();
        for (Monome a : this.arr) {
            if (a.getNumaratorCoeficient() != 0) {
                if (s.length() == 0) {
                    float sign = (float) a.getNumaratorCoeficient() / a.getNumitorCoeficient();
                    if (sign < 0)
                        s += "-";
                    if (abs(sign) != 1) {
                        s += String.valueOf(abs(a.getNumaratorCoeficient()));
                        if (abs(a.getNumitorCoeficient()) == 1)
                            s += "";
                        else
                            s += "/" + String.valueOf(abs(a.getNumitorCoeficient()));
                        if (a.getExponent() > 1 || a.getExponent() < 0)
                            s += "*x^" + String.valueOf(a.getExponent());
                        else if (a.getExponent() == 1)
                            s += "*x";
                        else if (a.getExponent() == 0)
                            s += "";
                    } else {
                        s += "";
                        if (a.getExponent() > 1 || a.getExponent() < 0)
                            s += "x^" + String.valueOf(a.getExponent());
                        else if (a.getExponent() == 1)
                            s += "x";
                        else if (a.getExponent() == 0)
                            s += "1";
                    }

                } else {
                    float sign = (float) a.getNumaratorCoeficient() / a.getNumitorCoeficient();
                    if (sign < 0)
                        s += "-";
                    else s += "+";
                    if (abs(sign) != 1) {
                        s += String.valueOf(abs(a.getNumaratorCoeficient()));
                        if (abs(a.getNumitorCoeficient()) == 1)
                            s += "";
                        else
                            s += "/" + String.valueOf(abs(a.getNumitorCoeficient()));
                        if (a.getExponent() > 1 || a.getExponent() < 0)
                            s += "*x^" + String.valueOf(a.getExponent());
                        else if (a.getExponent() == 1)
                            s += "*x";
                        else if (a.getExponent() == 0)
                            s += "";
                    } else {
                        s += "";
                        if (a.getExponent() > 1 || a.getExponent() < 0)
                            s += "x^" + String.valueOf(a.getExponent());
                        else if (a.getExponent() == 1)
                            s += "x";
                        else if (a.getExponent() == 0)
                            s += "1";
                    }

                }
            } else s += "";

        }
        if (s.length() == 0)
            s += "0";
        return s;
    }

}
