import java.util.HashMap;

public class MaterialPrice{

    private MaterialAPI matAPI = new MaterialAPI();
    private HTTPRequest httpRequest = new HTTPRequest("Mozilla/5.0");
    
    public String getItemList(String item, String outputSize) {
        HashMap <String, String> params = matAPI.retrieveItemsParams(item, outputSize);

        String respond = httpRequest.sendGET(params);

        return respond;
    }
}