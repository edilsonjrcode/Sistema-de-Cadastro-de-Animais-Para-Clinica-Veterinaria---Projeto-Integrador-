package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TelaExame extends JFrame{
    private JPanel telaExameFisico;
    private JLabel lblTitulo;
    private JLabel lblTr;
    private JTextField tfTr;
    private JLabel lblFc;
    private JTextField tfFc;
    private JLabel lblTpc;
    private JTextField tfTpc;
    private JLabel lblHidratacao;
    private JTextField tfHidratacao;
    private JTextField tfNivelConsciencia;
    private JTextField tfEscoreCorporal;
    private JLabel lblFr;
    private JTextField tfFr;
    private JLabel lblPulso;
    private JTextField tfPulso;
    private JLabel lblPostura;
    private JLabel lblNivelConsciencia;
    private JLabel lblEscoreCorporal;
    private JTextField tfPostura;
    private JLabel lblLinfonodosSub;
    private JLabel lblLinfPreEncap;
    private JLabel lblLinfPopliteos;
    private JLabel lblLinfInguinais;
    private JTextField tfLinfInguinais;
    private JLabel lblMucosaOcular;
    private JLabel lblMucosaOral;
    private JTextField tfMucosaOcular;
    private JTextField tfMucosaOral;
    private JTextField tfLinfonodosSub;
    private JTextField tfLinfPreEncap;
    private JTextField tfLinfPopliteos;
    private JLabel lblMucosaPeniana;
    private JLabel lblMucosaAnal;
    private JTextField tfMucosaPeniana;
    private JTextField tfMucosaAnal;
    private JButton btnEnviar;
    private JButton btnCancelar;
    private JPanel plTitulo;
    private JPanel plCorpo;

    public TelaExame(){
        setTitle("Pet Dream - Exame Físico");
        setContentPane(telaExameFisico);
        setMinimumSize(new Dimension(700,550));
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
        System.out.println("Exame Físico\n");
        System.out.println("Postura: " + tfPostura.getText());
        System.out.println("Nível de Consciência: " + tfNivelConsciencia.getText());
        System.out.println("Escore Corporal: " + tfEscoreCorporal.getText());
        System.out.println("TR: " + tfTr.getText());
        System.out.println("FR: " + tfFr.getText());
        System.out.println("FC: " + tfFc.getText());
        System.out.println("TPC: " + tfTpc.getText());
        System.out.println("Pulso: " + tfPulso.getText());
        System.out.println("Hidratação: " + tfHidratacao.getText());
        System.out.println("Linfonodos Submand.: " + tfLinfonodosSub.getText());
        System.out.println("Linf. Pré Encapsuladores: " + tfLinfPreEncap.getText());
        System.out.println("Linf. Poplíteos: " + tfLinfPopliteos.getText());
        System.out.println("Linf. Inguinais: " + tfLinfInguinais.getText());
        System.out.println("Mucosa Ocular: " + tfMucosaOcular.getText());
        System.out.println("Mucosa Oral: " + tfMucosaOcular.getText());
        System.out.println("Mucosa Peniana: " + tfMucosaOcular.getText());
        System.out.println("Mucosa Anal: " + tfMucosaOcular.getText());

        this.dispose();
    }
}
