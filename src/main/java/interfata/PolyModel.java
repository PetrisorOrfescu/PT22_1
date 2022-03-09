package interfata;

import calcule.Monome;
import calcule.Polynomial;

import java.awt.event.MouseMotionAdapter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;


public class PolyModel {

    public Polynomial stringToPolynomial(String polinomString) {
        ArrayList<Monome> arr = new ArrayList<>();
        char[] t = polinomString.toCharArray();
        for (int i = 0; i < t.length; i++) {
            if (t[i] == 'x') {
                int numaratorCoeficient = 1;
                int numitorCoeficient = 1;
                int exponent = 1;
                if (i - 1 >= 0 && t[i - 1] == '*' && i - 2 >= 0 && (t[i - 2] > '0' && t[i - 2] <= '9')) {
                    if (i - 3 >= 0 && t[i - 3] == '-')
                        numaratorCoeficient = -Integer.parseInt(String.valueOf(t[i - 2]));
                    else
                        numaratorCoeficient = Integer.parseInt(String.valueOf(t[i - 2]));
                } else if (i - 1 >= 0 && t[i - 1] == '-')
                    numaratorCoeficient = -1;
                if (i + 1 < t.length && t[i + 1] == '^')
                    exponent = Integer.parseInt(String.valueOf(t[i + 2]));
                Monome m = new Monome(numaratorCoeficient, numitorCoeficient, exponent);
                arr.add(m);
            }
        }
        if (t.length == 1 && (t[0] > '0' && t[0] <= '9')) {
            Monome m = new Monome(Integer.parseInt(String.valueOf(t[0])), 1, 0);
            arr.add(m);
        }
        if (t.length >= 2 && (t[t.length - 1] > '0' && t[t.length - 1] <= '9') && t[t.length - 2] != '^') {
            int numaratorCoeficient = 1;
            int numitorCoeficient = 1;
            int exponent = 0;
            if (t.length > 1 && t[t.length - 2] == '-')
                numaratorCoeficient = -Integer.parseInt(String.valueOf(t[t.length - 1]));
            else
                numaratorCoeficient = Integer.parseInt(String.valueOf(t[t.length - 1]));
            Monome m = new Monome(numaratorCoeficient, numitorCoeficient, exponent);
            arr.add(m);
        }
        Collections.sort(arr);
        Polynomial p = new Polynomial(arr);
        return p;
    }
}
