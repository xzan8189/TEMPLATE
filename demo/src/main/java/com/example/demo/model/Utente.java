package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("utenti")
public class Utente {

    @Id
    private String nameID;

    public Utente() {
    }

    public Utente(String nameID) {
        this.nameID = nameID;
    }

    public String getNameID() {
        return nameID;
    }

    public void setNameID(String nameID) {
        this.nameID = nameID;
    }


}
