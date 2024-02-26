package ws;


import jakarta.xml.ws.Endpoint;

//Serveur JWX
public class ServeurJWS {
    public static void main(String[] args) {
        //publish(URL,webService)
        String url = "http://0.0.0.0:7878/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("Web service déployer sur "+url);
    }
}
