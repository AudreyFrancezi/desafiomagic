package com.Projeto.DesafioMagic;

import javax.persistence.Entity;

@Entity
public class Cartas {

    private String Nome;
    private String Edição;
    private String Idioma;
    private String Foil;
    private Number Preço;
    private Number Quantidade;

    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getEdição() {
        return Edição;
    }
    public void setEdição(String edição) {
        Edição = edição;
    }
    public String getIdioma() {
        return Idioma;
    }
    public void setIdioma(String idioma) {
        Idioma = idioma;
    }
    public String getFoil() {
        return Foil;
    }
    public void setFoil(String foil) {
        Foil = foil;
    }
    public Number getPreço() {
        return Preço;
    }
    public void setPreço(Number preço) {
        Preço = preço;
    }
    public Number getQuantidade() {
        return Quantidade;
    }
    public void setQuantidade(Number quantidade) {
        Quantidade = quantidade;
    }

}
