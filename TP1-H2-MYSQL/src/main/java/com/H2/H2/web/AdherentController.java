package com.H2.H2.web;

import com.H2.H2.entity.Adherent;
import com.H2.H2.repository.AdherentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdherentController {

    private final AdherentRepository repository;

    public AdherentController(AdherentRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/adherents")
    public List<Adherent> getAll() {
        return repository.findAll();
    }
}
