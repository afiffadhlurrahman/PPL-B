import java.util.HashMap;

public class MaterialPrice{

    private MaterialAPI matAPI = new MaterialAPI();
    private HTTPRequest httpRequest = new HTTPRequest("Mozilla/5.0");
    
    public void getItemList(String item, String outputSize) {
        HashMap <String, String> params = matAPI.retrieveItemsParams(item, outputSize);
        httpRequest.sendGET(params);
    }
}