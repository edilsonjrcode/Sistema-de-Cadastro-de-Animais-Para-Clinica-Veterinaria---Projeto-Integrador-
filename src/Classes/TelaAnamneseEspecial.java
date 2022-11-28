package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

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

        btnEnviar.addActionListener(this::retorno);
        btnCancelar.addActionListener(this::fecharJanela);
    }
    public void fecharJanela(ActionEvent actionEvent) {
        this.dispose();
    }
    private void retorno(ActionEvent actionEvent) {
        System.out.println("Anamnese Especial\n");
        System.out.println("Sistema Respiratório: " + tfSistemaRespiratorio.getText());
        System.out.println("Sistema Cardiovascular: " + tfSistemaCardiovascular.getText());
        System.out.println("Sistema Digestório: " + tfSistemaDigestorio.getText());
        System.out.println("Sistema Reprodutor: " + tfSistemaReprodutor.getText());
        System.out.println("Sistema Locomotor: " + tfSistemaLocomotor.getText());
        System.out.println("Sistema Neurológico: " + tfSistemaNeurologico.getText());
        System.out.println("Peles e anexos: " + tfPeleAnexos.getText());
        System.out.println("Olhos: " + tfOlhos.getText());

        this.dispose();
    }
}