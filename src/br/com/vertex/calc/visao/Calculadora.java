package br.com.vertex.calc.visao;

import javax.swing.*;
import java.awt.*;

public class Calculadora extends JFrame {

    public Calculadora(){

        organizarLayout();

        setSize(332, 422);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void organizarLayout() {
        setLayout(new BorderLayout());

        Display display = new Display();
        display.setPreferredSize(new Dimension( 332, 80));
        add(display, BorderLayout.NORTH);
        Teclado teclado = new Teclado();
        add(teclado, BorderLayout.CENTER);
    }

    public static void main (String[] args){
        new Calculadora();
    }

}
