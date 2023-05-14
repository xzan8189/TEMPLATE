package com.example.demo.controllers;

import com.example.demo.model.Utente;
import com.example.demo.mongorepository.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UtenteController {
    @Autowired
    private UtenteRepository utenteRepository;

    @RequestMapping(value = "/findById",
            produces = "application/json",
            method= RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Utente> findById(@RequestBody Utente utente) {
        Utente result = utenteRepository.findById(utente.getNameID()).get();

        return ResponseEntity.ok(result);
    }
}
