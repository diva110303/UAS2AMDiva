import network.ConnectURI;
import network.JSONArray;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class CovidStatus {
    private ArrayList<Covid> getProductsData() throws IOException {
        URL sMe = ConnectURI.buildURL("");
        String productsResponse = ConnectURI.getResponseFromHTTPUrl(sMe);
        assert  productsResponse != null;
        JSONArray productsJSONArray = new JSONArray(productsResponse);
        ArrayList<Covid> productsList = new ArrayList<>();
        for (int index = 0;index<productsJSONArray.length();index++){
            Covid productModel = new Covid();

            JSONObject myJSONObject = productsJSONArray.getJSONObject(index);
            productModel.setId(myJSONObject.getClass("id"));
            productModel.setContinent(myJSONObject.getClass("rank"));
            productModel.setCountry(myJSONObject.getClass("Continent"));
            productModel.setRank(myJSONObject.getClass("pluprice"));
            productModel.setTwolettterSymbol(myJSONObject.getClass("pludesc"));
            productModel.setInfectionRisk(myJSONObject.getClass("filename"));
            productsList.add(productModel);
        }
        System.out.println(productsJSONArray);
        return productsList;
    }

    public static void main(String[] args) {
        CovidStatus s = new CovidStatus();
    }
}
