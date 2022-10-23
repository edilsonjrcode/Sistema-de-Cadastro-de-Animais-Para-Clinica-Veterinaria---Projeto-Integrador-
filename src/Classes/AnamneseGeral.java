package Classes;

public class AnamneseGeral {
    private String QueixaPrincipal;
    private String HistoricoMedico;
    private String Contactantes;
    private String AmbienteQueVive;
    private String Vacinacao;
    private String Vermifugacao;

    public AnamneseGeral(String queixaPrincipal, String historicoMedico, String contactantes, String ambienteQueVive, String vacinacao, String vermifugacao) {
        QueixaPrincipal = queixaPrincipal;
        HistoricoMedico = historicoMedico;
        Contactantes = contactantes;
        AmbienteQueVive = ambienteQueVive;
        Vacinacao = vacinacao;
        Vermifugacao = vermifugacao;
    }

    public String getQueixaPrincipal() {
        return QueixaPrincipal;
    }

    public void setQueixaPrincipal(String queixaPrincipal) {
        QueixaPrincipal = queixaPrincipal;
    }

    public String getHistoricoMedico() {
        return HistoricoMedico;
    }

    public void setHistoricoMedico(String historicoMedico) {
        HistoricoMedico = historicoMedico;
    }

    public String getContactantes() {
        return Contactantes;
    }

    public void setContactantes(String contactantes) {
        Contactantes = contactantes;
    }

    public String getAmbienteQueVive() {
        return AmbienteQueVive;
    }

    public void setAmbienteQueVive(String ambienteQueVive) {
        AmbienteQueVive = ambienteQueVive;
    }

    public String getVacinacao() {
        return Vacinacao;
    }

    public void setVacinacao(String vacinacao) {
        Vacinacao = vacinacao;
    }

    public String getVermifugacao() {
        return Vermifugacao;
    }

    public void setVermifugacao(String vermifugacao) {
        Vermifugacao = vermifugacao;
    }
}
