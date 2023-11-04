package com.startjobs.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Candidato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    //@Min(value = 5, message = "O nome deve conter no mínimo 5 caracteres")
    @NotNull(message = "O nome não pode ser vazio")
    private String nome;
    @NotNull(message = "O e-mail não pode ser vazio")
    private String email;

    @NotNull(message = "O telefone não pode ser vazio")
    private String telefone;

    public Candidato(){


    }

    public Long getCodigo() {
        return codigo;
    }



    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }



    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }



    public String getTelefone() {
        return telefone;
    }



    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }



    public Vaga getVaga() {
        return vaga;
    }



    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }



    @ManyToOne
    @JoinColumn(name ="vaga_candidato")
    private Vaga vaga;



    @Override
    public String toString() {
        return "Candidato [codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone
                + ", vaga=" + vaga + "]";
    }

    
    
}
