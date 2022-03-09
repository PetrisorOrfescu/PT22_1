import calcule.Monome;
import calcule.Polynomial;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class PolynomialTest {

    @org.junit.jupiter.api.Test
    void derrivate() {
        Monome m1 = new Monome(2, 1, 3);
        Monome m2 = new Monome(6, 1, 1);
        Monome m3 = new Monome(4, 1, 2);
        ArrayList<Monome> arr = new ArrayList();
        arr.add(m1);
        arr.add(m2);
        arr.add(m3);
        Collections.sort(arr);
        Polynomial p = new Polynomial(arr);
        p.derrivate();
        Monome m4 = new Monome(6, 1, 2);
        Monome m5 = new Monome(6, 1, 0);
        Monome m6 = new Monome(8, 1, 1);
        ArrayList<Monome> arr2 = new ArrayList();
        arr2.add(m4);
        arr2.add(m5);
        arr2.add(m6);
        Collections.sort(arr2);
        Polynomial q = new Polynomial(arr2);
        assertEquals(q.toString(),p.toString(),"Incorrect derrivation1");
        Monome m7 = new Monome(12, 1, 1);
        Monome m8 = new Monome(0, 1, -1);
        Monome m9 = new Monome(8, 1, 0);
        ArrayList<Monome> arr3 = new ArrayList();
        arr3.add(m7);
        arr3.add(m8);
        arr3.add(m9);
        Collections.sort(arr3);
        Polynomial v = new Polynomial(arr3);
        q.derrivate();
        assertEquals(v.toString(),q.toString(),"Incorrect derrivation2");

    }



    @org.junit.jupiter.api.Test
    void integrate() {
        Monome m1 = new Monome(2, 1, 3);
        Monome m2 = new Monome(6, 1, 1);
        Monome m3 = new Monome(4, 1, 2);
        ArrayList<Monome> arr = new ArrayList();
        arr.add(m1);
        arr.add(m2);
        arr.add(m3);
        Collections.sort(arr);
        Polynomial p = new Polynomial(arr);
        p.integrate();
        Monome m4 = new Monome(2, 4, 4);
        Monome m5 = new Monome(6, 2, 2);
        Monome m6 = new Monome(4, 3, 3);
        ArrayList<Monome> arr2 = new ArrayList();
        arr2.add(m4);
        arr2.add(m5);
        arr2.add(m6);
        Collections.sort(arr2);
        Polynomial q = new Polynomial(arr2);
        assertEquals(q.toString(),p.toString(),"Incorrect Integration");
        Monome m7 = new Monome(2, 20, 5);
        Monome m8 = new Monome(6, 6, 3);
        Monome m9 = new Monome(4, 12, 4);
        ArrayList<Monome> arr3 = new ArrayList();
        arr3.add(m7);
        arr3.add(m8);
        arr3.add(m9);
        Collections.sort(arr3);
        Polynomial v = new Polynomial(arr3);
        q.integrate();
        assertEquals(v.toString(),q.toString(),"Incorrect Integration2");
    }

    @org.junit.jupiter.api.Test
    void add() {
        Monome m1 = new Monome(2, 1, 3);
        Monome m2 = new Monome(6, 1, 1);
        Monome m3 = new Monome(4, 1, 2);
        ArrayList<Monome> arr = new ArrayList();
        arr.add(m1);
        arr.add(m2);
        arr.add(m3);
        Collections.sort(arr);
        Polynomial p = new Polynomial(arr);
        Monome m4 = new Monome(2, 4, 4);
        Monome m5 = new Monome(6, 2, 2);
        Monome m6 = new Monome(4, 3, 3);
        ArrayList<Monome> arr2 = new ArrayList();
        arr2.add(m4);
        arr2.add(m5);
        arr2.add(m6);
        Collections.sort(arr2);
        Polynomial q = new Polynomial(arr2);
        p.add(q);
        Monome m7 = new Monome(2, 4, 4);
        Monome m8 = new Monome(10, 3, 3);
        Monome m9 = new Monome(14, 2, 2);
        Monome m10 = new Monome(6, 1, 1);
        ArrayList<Monome> arr3 = new ArrayList();
        arr3.add(m7);
        arr3.add(m8);
        arr3.add(m9);
        arr3.add(m10);
        Collections.sort(arr3);
        Polynomial v = new Polynomial(arr3);
        assertEquals(v.toString(),p.toString(),"Incorrect Add Operation");
    }

    @org.junit.jupiter.api.Test
    void substract() {
        Monome m1 = new Monome(2, 1, 3);
        Monome m2 = new Monome(6, 1, 1);
        Monome m3 = new Monome(4, 1, 2);
        ArrayList<Monome> arr = new ArrayList();
        arr.add(m1);
        arr.add(m2);
        arr.add(m3);
        Collections.sort(arr);
        Polynomial p = new Polynomial(arr);
        Monome m4 = new Monome(2, 4, 4);
        Monome m5 = new Monome(6, 2, 2);
        Monome m6 = new Monome(4, 3, 3);
        ArrayList<Monome> arr2 = new ArrayList();
        arr2.add(m4);
        arr2.add(m5);
        arr2.add(m6);
        Collections.sort(arr2);
        Polynomial q = new Polynomial(arr2);
        p.substract(q);
        Monome m7 = new Monome(-2, 4, 4);
        Monome m8 = new Monome(2, 3, 3);
        Monome m9 = new Monome(2, 2, 2);
        Monome m10 = new Monome(6, 1, 1);
        ArrayList<Monome> arr3 = new ArrayList();
        arr3.add(m7);
        arr3.add(m8);
        arr3.add(m9);
        arr3.add(m10);
        Collections.sort(arr3);
        Polynomial v = new Polynomial(arr3);
        assertEquals(v.toString(),p.toString(),"Incorrect Substract Operation");
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        Monome m1 = new Monome(2, 1, 3);
        Monome m2 = new Monome(6, 1, 1);
        Monome m3 = new Monome(4, 1, 2);
        ArrayList<Monome> arr = new ArrayList();
        arr.add(m1);
        arr.add(m2);
        arr.add(m3);
        Collections.sort(arr);
        Polynomial p = new Polynomial(arr);
        Monome m4 = new Monome(-2, 1, 4);
        Monome m5 = new Monome(6, 1, 2);
        Monome m6 = new Monome(4, 1, 3);
        ArrayList<Monome> arr2 = new ArrayList();
        arr2.add(m4);
        arr2.add(m5);
        arr2.add(m6);
        Collections.sort(arr2);
        Polynomial q = new Polynomial(arr2);
        p.multiply(q);
        Monome m7 = new Monome(-4, 1, 7);
        Monome m8 = new Monome(0, 1, 6);
        Monome m9 = new Monome(16, 1, 5);
        Monome m10 = new Monome(48, 1, 4);
        Monome m11 = new Monome(36, 1, 3);
        ArrayList<Monome> arr3 = new ArrayList();
        arr3.add(m7);
        arr3.add(m8);
        arr3.add(m9);
        arr3.add(m10);
        arr3.add(m11);
        Collections.sort(arr3);
        Polynomial v = new Polynomial(arr3);
        assertEquals(v.toString(),p.toString(),"Incorrect Multiply Operation");
    }
}