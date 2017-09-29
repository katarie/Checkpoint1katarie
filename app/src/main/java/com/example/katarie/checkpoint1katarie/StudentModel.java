package com.example.katarie.checkpoint1katarie;


/**
 * Created by katarie on 29/09/2017.
 */

public class StudentModel {
    private String nom;
    private String prenom;
    private String ecole;
    private String langage;

    public StudentModel(String nom, String prenom, String ecole, String langage) {
        this.nom = nom;
        this.prenom = prenom;
        this.ecole = ecole;
        this.langage = langage;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEcole() {
        return ecole;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }

    public String getLangage() {
        return langage;
    }

    public void setLangage(String langage) {
        this.langage = langage;
    }
}
