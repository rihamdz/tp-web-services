import javax.xml.ws.Endpoint;

public class Application {
    public static  void main(String[] args){
        System.out.println("Début du déploiement du service Web...");
        String url = "http://localhost:8888/";
        Endpoint.publish(url, new MonserviceWeb());
        System.out.println("Le service web est déployé");
    }
}
