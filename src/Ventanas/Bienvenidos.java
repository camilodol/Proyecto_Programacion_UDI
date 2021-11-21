package Ventanas;

import javax.swing.*;
import java.awt.*;

public class Bienvenidos extends JFrame {

    JLabel texto;

    public Bienvenidos(String usuario){
        super("Bienvenida");
        setLayout(new FlowLayout());

        texto = new JLabel();
        texto.setText("Buenas a el servicio de turno " + usuario);
        texto.setFont(new Font("Verdana", Font.BOLD+Font.ITALIC,22));
        texto.setForeground(Color.blue);

        add(texto);
    }
}
