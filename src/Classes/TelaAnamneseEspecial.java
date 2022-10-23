package Classes;

import javax.swing.*;
import java.awt.*;

public class TelaAnamneseEspecial extends JFrame{
    private JLabel lblTitle;
    private JLabel lblSistemaRespiratorio;
    private JTextField tfSistemaRespiratorio;
    private JLabel lblSistemaCardiovascular;
    private JTextField tfSistemaCardiovascular;
    private JLabel lblSistemaDigestorio;
    private JTextField tfSistemaDigestorio;
    private JLabel lblSistemaUrinario;
    private JTextField tfSistemaUrinario;
    private JLabel lblSistemaReprodutor;
    private JTextField tfSistemaReprodutor;
    private JLabel lblSistemaLocomotor;
    private JTextField tfSistemaLocomotor;
    private JLabel lblSistemaNeurologico;
    private JTextField tfSistemaNeurologico;
    private JLabel lblPeleAnexos;
    private JTextField tfPeleAnexos;
    private JLabel lblOlhos;
    private JTextField tfOlhos;
    private JPanel telaAnamneseEspecial;
    private JButton btnEnviar;
    private JButton btnCancelar;

    public TelaAnamneseEspecial(){
        setTitle("Pet Dream - Anamnese Geral");
        setContentPane(telaAnamneseEspecial);
        setMinimumSize(new Dimension(650,750));
        setResizable(false);
        setLocationRelativeTo(null);

        setVisible(true);
    }
}