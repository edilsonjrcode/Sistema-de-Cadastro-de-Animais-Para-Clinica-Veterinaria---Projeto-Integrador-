package Classes;

public class AnamneseEspecial {

    private String SistemaRespiratorio;
    private String SistemaCardiovascular;
    private String SistemaDigestorio;
    private String SistemaUrinario;
    private String SistemaReprodutor;
    private String SistemaLocomotor;
    private String SistemaNeurologico;
    private String PeleEAnexos;
    private String Olhos;

    public AnamneseEspecial(String sistemaRespiratorio, String sistemaCardiovascular, String sistemaDigestorio, String sistemaUrinario, String sistemaReprodutor, String sistemaLocomotor, String sistemaNeurologico, String peleEAnexos, String olhos) {
        SistemaRespiratorio = sistemaRespiratorio;
        SistemaCardiovascular = sistemaCardiovascular;
        SistemaDigestorio = sistemaDigestorio;
        SistemaUrinario = sistemaUrinario;
        SistemaReprodutor = sistemaReprodutor;
        SistemaLocomotor = sistemaLocomotor;
        SistemaNeurologico = sistemaNeurologico;
        PeleEAnexos = peleEAnexos;
        Olhos = olhos;
    }

    public String getSistemaRespiratorio() {
        return SistemaRespiratorio;
    }

    public void setSistemaRespiratorio(String sistemaRespiratorio) {
        SistemaRespiratorio = sistemaRespiratorio;
    }

    public String getSistemaCardiovascular() {
        return SistemaCardiovascular;
    }

    public void setSistemaCardiovascular(String sistemaCardiovascular) {
        SistemaCardiovascular = sistemaCardiovascular;
    }

    public String getSistemaDigestorio() {
        return SistemaDigestorio;
    }

    public void setSistemaDigestorio(String sistemaDigestorio) {
        SistemaDigestorio = sistemaDigestorio;
    }

    public String getSistemaUrinario() {
        return SistemaUrinario;
    }

    public void setSistemaUrinario(String sistemaUrinario) {
        SistemaUrinario = sistemaUrinario;
    }

    public String getSistemaReprodutor() {
        return SistemaReprodutor;
    }

    public void setSistemaReprodutor(String sistemaReprodutor) {
        SistemaReprodutor = sistemaReprodutor;
    }

    public String getSistemaLocomotor() {
        return SistemaLocomotor;
    }

    public void setSistemaLocomotor(String sistemaLocomotor) {
        SistemaLocomotor = sistemaLocomotor;
    }

    public String getSistemaNeurologico() {
        return SistemaNeurologico;
    }

    public void setSistemaNeurologico(String sistemaNeurologico) {
        SistemaNeurologico = sistemaNeurologico;
    }

    public String getPeleEAnexos() {
        return PeleEAnexos;
    }

    public void setPeleEAnexos(String peleEAnexos) {
        PeleEAnexos = peleEAnexos;
    }

    public String getOlhos() {
        return Olhos;
    }

    public void setOlhos(String olhos) {
        Olhos = olhos;
    }
}
