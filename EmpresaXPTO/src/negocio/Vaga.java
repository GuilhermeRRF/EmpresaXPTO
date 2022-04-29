/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author romei
 */
public class Vaga {

    private String nome;
    private String sobrenome;
    private String cpf;
    private String dataN;
    private String idade;
    private String MaiorI;
    private String vaga;

    public Vaga(String nome, String sobrenome, String cpf, String dataN,String idade, String MaiorI, String vaga) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.dataN = dataN;
        this.idade = idade;
        this.MaiorI = MaiorI;
        this.vaga = vaga;
    }

    public Vaga() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataN() {
        return dataN;
    }

    public void setDataN(String dataN) {
        this.dataN = dataN;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getMaiorI() {
        return MaiorI;
    }

    public void setMaiorI(String MaiorI) {
        this.MaiorI = MaiorI;
    }

    public String getVaga() {
        return vaga;
    }

    public void setVaga(String vaga) {
        this.vaga = vaga;
    }

   
}
