package Classes;

import javax.swing.*;
import java.awt.*;

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
    }
}
