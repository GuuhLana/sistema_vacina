package br.com.viewTest;

import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        JOptionPane.showMessageDialog(null, gc.getTime());

    }

}
