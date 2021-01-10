import java.util.HashMap;

public class MaterialAPI {

    private String oauth;
    private String host;

    public MaterialAPI () {
        this.oauth = "API-KEY";
        this.host = "twelve-data1.p.rapidapi.com";
    }

    public MaterialAPI(String APIkey) {
        this.oauth = APIkey;
        this.host = "twelve-data1.p.rapidapi.com";
    }

    public HashMap retrieveItemsParams(String item, String outputSize) {
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("API-KEY", this.oauth);
        params.put("HOST_URL", this.host);
        params.put("output_size", outputSize);
        params.put("item_name", item);
        params.put("type", "json");

        return params;
    }
}