package interfata;

import calcule.Polynomial;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PolyController {
    private PolyModel model;
    private PolyView view;
    String s1 = new String();
    String s2 = new String();

    public PolyController(PolyModel model, PolyView view) {
        super();
        this.model = model;
        this.view = view;
        view.setVisible(true);
        view.jButton1ActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = view.getjTextField1().getText();
                s2 = view.getjTextField2().getText();
                Polynomial p1 = model.stringToPolynomial(s1);
                Polynomial p2 = model.stringToPolynomial(s2);
                Polynomial p3 = p1;
                p1.add(p2);
                view.getjTextField3().setText(p1.polynomialOut());
                p1 = p3;
            }
        });
        view.jButton2ActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = view.getjTextField1().getText();
                s2 = view.getjTextField2().getText();
                Polynomial p1 = model.stringToPolynomial(s1);
                Polynomial p2 = model.stringToPolynomial(s2);
                Polynomial p3 = p1;
                p1.substract(p2);
                view.getjTextField3().setText(p1.polynomialOut());
                p1 = p3;
            }
        });
        view.jButton3ActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getjTextField3().setText("Not implemented yet");
            }
        });
        view.jButton4ActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = view.getjTextField1().getText();
                s2 = view.getjTextField2().getText();
                Polynomial p1 = model.stringToPolynomial(s1);
                Polynomial p2 = model.stringToPolynomial(s2);
                Polynomial p3 = p1;
                p1.multiply(p2);
                view.getjTextField3().setText(p1.polynomialOut());
                p1 = p3;
            }
        });
        view.jButton5ActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = view.getjTextField1().getText();
                Polynomial p1 = model.stringToPolynomial(s1);
                p1.derrivate();
                view.getjTextField3().setText(p1.polynomialOut());
                Polynomial p3 = p1;
                p1 = p3;
            }
        });
        view.jButton6ActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = view.getjTextField1().getText();
                Polynomial p1 = model.stringToPolynomial(s1);
                p1.integrate();
                view.getjTextField3().setText(p1.polynomialOut());
                Polynomial p3 = p1;
                p1 = p3;
            }
        });
    }
}
