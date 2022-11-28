package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TelaAnamneseGeral extends JFrame{
    private JLabel lblTitle;
    private JTextArea taQueixaPrincipal;
    private JTextField tfAlimentacao;
    private JButton btnEnviar;
    private JButton btnCancelar;
    private JPanel plTitle;
    private JLabel lblQueixaPrincipal;
    private JLabel lblHistoricoMedico;
    private JTextArea taHistoricoMedico;
    private JLabel lblAlimentacao;
    private JLabel lblContactantes;
    private JTextField tfContactantes;
    private JLabel lblVermifugacao;
    private JTextField tfVermifugacao;
    private JLabel lblAmbiente;
    private JTextField tfAmbiente;
    private JPanel telaAnamneseGeral;

    public TelaAnamneseGeral(){
        setTitle("Pet Dream - Anamnese Geral");
        setContentPane(telaAnamneseGeral);
        setMinimumSize(new Dimension(700,450));
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
        System.out.println("Anamnese Geral\n");
        System.out.println("Queixa principaç: " + taQueixaPrincipal.getText());
        System.out.println("Histórico Médico Pregresso: " + taHistoricoMedico.getText());
        System.out.println("Alimentação: " + tfAlimentacao.getText());
        System.out.println("Vermifugação: " + tfVermifugacao.getText());
        System.out.println("Contactantes: " + tfContactantes.getText());
        System.out.println("Ambiente em que vive: " + tfAmbiente.getText());

        this.dispose();
    }
}
