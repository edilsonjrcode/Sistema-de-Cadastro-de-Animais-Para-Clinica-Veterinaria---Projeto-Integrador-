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

        btnEnviar.addActionListener(this::retorno);
        btnCancelar.addActionListener(this::fecharJanela);

        setVisible(true);
    }

    public void fecharJanela(ActionEvent actionEvent) {
        this.dispose();
    }

    private void retorno(ActionEvent actionEvent) {
        System.out.println("Identificação do Animal\n");
        System.out.println("Nome: " + tfNome.getText());
        System.out.println("Espécie: " + tfEspecie.getText());
        System.out.println("Pelagem: " + tfPelagem.getText());
        System.out.println("Raça: " + tfRaca.getText());
        System.out.println("Sexo: " + cbSexo.getSelectedItem());
        System.out.println("Idade: " + cbIdade.getSelectedItem() + " " + cbIdadeAno.getSelectedItem());
        System.out.println("Peso: " + tfPeso.getText());
        System.out.println("Procedência: " + tfProcedencia.getText());

        this.dispose();
    }
}