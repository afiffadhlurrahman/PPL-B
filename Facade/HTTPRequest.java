import java.util.*;

public class HTTPRequest {

    private static String USER_AGENT;

    public HTTPRequest(String UA) {
        this.USER_AGENT = UA;
    }

    public String sendGET(HashMap params) {
        System.out.println("masuk sendGET");
        System.out.println("Isi params:");
        
        params.forEach((k, v) -> System.out.println(k + ": " + v));

        // respond dalam bentuk JSON Object dan JSON Array
        String respond = "Hasil respond dari API";
        return respond;
    }

    public String sendPOST(HashMap params) {
        System.out.print("masuk sendPOST");
        System.out.println("Isi params:");
        
        params.forEach((k, v) -> System.out.println(k + ": " + v));

        // respond dalam bentuk JSON Object dan JSON Array
        String respond = "Hasil respond dari API";
        return respond;
    }
}