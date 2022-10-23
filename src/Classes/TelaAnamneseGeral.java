package Classes;

import javax.swing.*;
import java.awt.*;

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
    }
}
