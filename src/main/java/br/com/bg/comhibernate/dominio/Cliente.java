package br.com.bg.comhibernate.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author rubens.leme
 * @e-Mail rubenss.leme@gmail.com
 * @github.com/rubenssleme
 * 
 */
@SuppressWarnings("serial")
@Entity
public class Cliente extends GenericDomain{
    
    @Column(length = 50, nullable = false)
    private String nome;
   @Column(length = 15, nullable = false)
    private String CPF;
    @Column(length = 11, nullable = false)
    private String RG;
    @Column(length = 1, nullable = false)
    private String sexo;
    @Column(length = 35, nullable = false)
    private String eMail;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", CPF=" + CPF + ", RG=" + RG + ", sexo=" + sexo + ", eMail=" + eMail + '}';
    }
    
    
    
}
