package com.example.demo.mongorepository;

import com.example.demo.model.Utente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface UtenteRepository extends MongoRepository<Utente, String> {

    @Query("{'nameID':?0}")
    Utente findByIDName(String nameID);
}
