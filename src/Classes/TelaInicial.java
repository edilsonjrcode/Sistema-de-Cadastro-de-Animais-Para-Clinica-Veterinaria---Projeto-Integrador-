package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TelaInicial extends JFrame{
    private JPanel panel1;
    private JButton btnCadastrarCliente;
    private JButton btnCadastrarAnimal;
    private JButton btnCadastrarExame;
    private JButton btnCadastrarAnamneseGeral;
    private JButton btnCadastrarAnamneseEspecifica;
    private JPanel telaInicial;
    private JLabel lblTitle;
    private JLabel lblSubTitle;

    public TelaInicial(){
        setTitle("Clínica Veterinária Pet Dream - Inicial");
        setContentPane(panel1);
        setMinimumSize(new Dimension(700,400));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        
        btnCadastrarCliente.addActionListener(this::abrirTelaCliente);
        btnCadastrarAnimal.addActionListener(this::abrirTelaAnimal);
        btnCadastrarExame.addActionListener(this::abrirTelaExame);
        btnCadastrarAnamneseGeral.addActionListener(this::abrirTelaAnamneseGeral);
        btnCadastrarAnamneseEspecifica.addActionListener(this::abrirTelaAnamneseEspecial);
    }

    private void abrirTelaAnamneseEspecial(ActionEvent actionEvent) {TelaAnamneseEspecial telaAnamneseEspecial = new TelaAnamneseEspecial();}
    private void abrirTelaAnamneseGeral(ActionEvent actionEvent) { TelaAnamneseGeral abrirAnamnese = new TelaAnamneseGeral();}
    private void abrirTelaCliente(ActionEvent actionEvent) {
        TelaClientes abrirTelaCliente = new TelaClientes();
    }
    private void abrirTelaAnimal(ActionEvent actionEvent) {
        TelaAnimal abrirTelaAnimal = new TelaAnimal();
    }
    private void abrirTelaExame(ActionEvent actionEvent) { TelaExame abrirTelaExame = new TelaExame();}
}
