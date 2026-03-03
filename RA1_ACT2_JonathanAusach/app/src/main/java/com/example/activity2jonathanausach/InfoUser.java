package com.example.activity2jonathanausach;

public class InfoUser {
    String nom;
    String cognoms;
    String Nickname;
    int edat;
    String Password;

    public InfoUser(String nom, String Cognoms, int edat, String username, String Password){
        this.nom = nom;
        this.cognoms = Cognoms;
        this.edat = edat;
        this.Nickname = username;
        this.Password = Password;
    }

    //getters
    public String GetNom(){
        return this.nom;
    }
    public String GetCognoms() {
        return this.cognoms;
    }
    public int GetEdat(){
        return  this.edat;
    }
    public String GetNickname(){
        return this.Nickname;
    }
    public String GetPassword(){
        return this.Password;
    }

    //Setters
    //.. Proximamente
}
