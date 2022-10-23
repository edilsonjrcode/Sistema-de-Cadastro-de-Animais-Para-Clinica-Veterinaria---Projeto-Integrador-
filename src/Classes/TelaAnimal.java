package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TelaAnimal extends JFrame{

    private JPanel cadastroAnimal;
    private JLabel lblTitle;
    private JLabel lblNome;
    private JTextField tfNome;
    private JTextField tfEspecie;
    private JLabel lblEspecie;
    private JLabel lblPelagem;
    private JLabel lblRaca;
    private JLabel lblSexo;
    private JLabel lblIdade;
    private JLabel lblPeso;
    private JLabel lblProcedencia;
    private JButton btnEnviar;
    private JButton btnCancelar;
    private JComboBox cbSexo;
    private JTextField tfPelagem;
    private JTextField tfRaca;
    private JTextField tfPeso;
    private JTextField tfProcedencia;
    private JComboBox cbIdade;
    private JComboBox cbIdadeAno;

    public TelaAnimal(){
        setTitle("Pet Dream - Identificação do Animal");
        setContentPane(cadastroAnimal);
        setMinimumSize(new Dimension(550,650));
        setResizable(false);
        setLocationRelativeTo(null);

        setVisible(true);

    }
}
