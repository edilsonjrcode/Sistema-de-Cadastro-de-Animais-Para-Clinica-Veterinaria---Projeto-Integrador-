package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TelaClientes extends JFrame{
    private JTextField tfNome;
    private JLabel lblCelular;
    private JTextField tfCelular;
    private JLabel lblEndereco;
    private JComboBox cbEndereco;
    private JTextField tfEndereco;
    private JLabel lblTelefone;
    private JTextField tfTelefone;
    private JLabel lblCidade;
    private JTextField tfCidade;
    private JLabel lblUf;
    private JComboBox tfUf;
    private JButton btnEnviar;
    private JButton btnCancelar;
    private JLabel lblDataAtendimento;
    private JTextField tfDataAtendimento;
    private JLabel lblRg;
    private JTextField tfRg;
    private JPanel telaDadosDoResponsável;
    private JLabel lblTitulo;

    public TelaClientes(){
        setTitle("Pet Dream - Dados do Responsável");
        setContentPane(telaDadosDoResponsável);
        setMinimumSize(new Dimension(600,650));
        setResizable(false);
        setLocationRelativeTo(null);

        btnCancelar.addActionListener(this::Fechar);

        setVisible(true);
    }
    private void Fechar(ActionEvent actionEvent) {

    }
}