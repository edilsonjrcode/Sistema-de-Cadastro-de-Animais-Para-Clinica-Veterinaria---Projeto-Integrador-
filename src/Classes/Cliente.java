package Classes;

import java.util.Date;

public class Cliente {

    private String nome;
    private String cpf;
    private String celular;
    private String endereco;
    private String telefone;
    private String cidade;
    private String uf;
    private String data;
    private String rg;

    public Cliente(String nome, String cpf, String celular, String endereco, String telefone, String cidade, String uf, String data, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cidade = cidade;
        this.uf = uf;
        this.data = data;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
