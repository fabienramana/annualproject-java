package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class CallAPI {


    public static ObservableList<ComponentModel> getAllComponentModels() {
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();
        ObservableList<ComponentModel> observable = FXCollections.observableArrayList();
        try{
            URL url = new URL("http://localhost:3000/api/component-models");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setConnectTimeout(5000);
            con.setReadTimeout(5000);
            int status = con.getResponseCode();
            System.out.println("status" + status);

            reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            while((line = reader.readLine()) != null) {
                responseContent.append(line);
            }
            reader.close();
            System.out.println(responseContent);
            JSONObject jsonObject = new JSONObject(responseContent);
            List<String> list = new ArrayList<String>();
            System.out.println(jsonObject);
            /*JSONArray array = jsonObject.getJSONArray("components");
            System.out.println(array);*/

            //ALTERNATIVE
            ComponentModel CM1 = new ComponentModel();
            CM1.setId("1");
            CM1.setData("<h1>Salut</h1>");
            CM1.setType("Body");
            CM1.setNumberOfPhotos(2);
            CM1.setNumberOfTextFields(2);
            observable.add(CM1);

            ComponentModel CM2 = new ComponentModel();
            CM2.setId("1");
            CM2.setData("<h1>Coucou</h1>");
            CM2.setType("NavBar");
            CM2.setNumberOfPhotos(2);
            CM2.setNumberOfTextFields(2);
            observable.add(CM2);

            System.out.println(observable);
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        return observable;
    }

}
