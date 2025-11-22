package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;

@RestController
public class MyApi {

      public static ArrayList<Etudiant> liste = new ArrayList();
      static {
          liste.add(new Etudiant(0 ,"riham",19));
          liste.add(new Etudiant(1 ,"riham",19));
          liste.add(new Etudiant(2 ,"riham",19));
          liste.add(new Etudiant(3 ,"riham",19));

      }
      @GetMapping(value = "/liste")
public  Collection<Etudiant> geAlltEtudiants(){
          return liste;
}
    @GetMapping(value = "/getEtudiant")
public Etudiant getEtudiant(int id){
          return liste.get(id);

}
    @PostMapping(value = "/addEtudiant")
public Etudiant addEtudiant(Etudiant etudiant){
          liste.add(etudiant);
          return etudiant;
}
    @DeleteMapping(value = "/suppEtudiant")
public void supprimeretudiant(int id){
       liste.remove(id);
}

    @PutMapping(value = "/ ")
    public void modifierEtudiant(int id , String nom){
        liste.get(id).setNom(nom);
    }

    @GetMapping(value = "/bonjour")
    public String bonjour() {
        return "bonjour";
    }



    @GetMapping(value = "/bonsoir")
    public String bonsoir() {
        return "bonsoir";
    }

    @GetMapping(value = "/etudiant")
    public Etudiant getEtudiant() {
        return new Etudiant(1,"riham",19);
    }

    @GetMapping(value = "/somme")
    public double somme(double a,double b){
        return a+b;
    }
}
