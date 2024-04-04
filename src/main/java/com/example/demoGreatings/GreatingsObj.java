package com.example.demoGreatings;
public class GreatingsObj {
    public String nome;
    public String saluto;
    public String regione;

    public GreatingsObj(String nome, String regione, String saluto) {
        this.nome = nome;
        this.regione = regione;
        this.saluto = saluto;
    }

    @Override
    public String toString() {
        return "GreatingsObj{" +
                "nome= '" + nome + "\n" +
                " regione= '" + regione +"\n"+
                " saluto = '" + saluto + "\n" +
                '}';
    }
}
