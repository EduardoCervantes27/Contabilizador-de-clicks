import javax.swing.*;

import java.awt.Font;
import java.awt.event.*;

public class Ventana extends JFrame {
    JPanel panelMain;
    JLabel etiquetaContador;
    JButton btnContador;
    int contador = 0;
    public Ventana() {
        setSize(300,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Clicks");

        iniciarComponentes();
    }

    public void iniciarComponentes(){
        panelMain = new JPanel();
        this.getContentPane().add(panelMain);
        panelMain.setLayout(null);
        labels();
        buttons();
    }

    public void labels() {
        etiquetaContador = new JLabel();
        etiquetaContador.setBounds(100,50,150,30);
        etiquetaContador.setFont(new Font("arial",1,20));
        panelMain.add(etiquetaContador);
    }

    public void buttons() {
        btnContador = new JButton("Haz click!");
        btnContador.setBounds(90,200,100,30);
        panelMain.add(btnContador);

        ActionListener oa = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                contador++;
                etiquetaContador.setText("Clicks: "+contador);
            }
        };
        btnContador.addActionListener(oa);
    }
}
