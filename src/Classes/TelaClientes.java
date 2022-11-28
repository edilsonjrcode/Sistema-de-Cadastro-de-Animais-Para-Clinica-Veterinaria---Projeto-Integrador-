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
    private JComboBox cbUf;
    private JButton btnEnviar;
    private JButton btnCancelar;
    private JLabel lblDataAtendimento;
    private JTextField tfDataAtendimento;
    private JLabel lblRg;
    private JTextField tfRg;
    private JPanel telaDadosDoResponsável;
    private JLabel lblTitulo;
    private JTextField tfCpf;

    public TelaClientes(){
        setTitle("Pet Dream - Dados do Responsável");
        setContentPane(telaDadosDoResponsável);
        setMinimumSize(new Dimension(600,650));
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
        System.out.println("Dados do Responsável\n");
        System.out.println("Nome: " + tfNome.getText());
        System.out.println("CPF: " + tfCpf.getText());
        System.out.println("Celular: " + tfCelular.getText());
        System.out.println("Endereço: " + cbEndereco.getSelectedItem() + " " +  tfEndereco.getText());
        System.out.println("Telefone: " + tfTelefone.getText());
        System.out.println("Cidade: " + tfCidade.getText());
        System.out.println("Estado: " + cbUf.getSelectedItem());
        System.out.println("Data: " + tfDataAtendimento.getText());
        System.out.println("RG: " + tfRg.getText());

        this.dispose();
    }
}