// SOAP : simple object acces protocol Protocole de communication XML
//JAX-WS: API Java pour créer/consommer des services SOAP
//JAXB :Sérialiser/désérialiser objets Java ↔ XML
//URL : Adresse du service (ex: WSDL)
//URN : Nom unique d’un service ou d’un espace de noms
//URI = URL+URN : Identifie une ressource (URL ou URN)

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(targetNamespace = "http://example.com/webservice")

public class MonserviceWeb {
    @WebMethod(operationName =   "convertir")
    public double conversion(@WebParam(name = "MT") double montant) {
        return montant * 0.9;
    }

    @WebMethod
    public double somme(@WebParam(name = "A") double a, @WebParam(name = "B") double b) {
        return a + b;
    }
    public  Etudiant getEtudiant(int identifiant){
        return new Etudiant(1,"riham",22);
    }
}
