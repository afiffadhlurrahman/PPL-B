import java.util.*;

public class Main {

    public static void main(String[] args) {

        MaterialPrice matAPI = new MaterialPrice();

        System.out.println(matAPI.getItemList("balok kayu", "100"));
    }

}