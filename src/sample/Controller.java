package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import org.json.JSONArray;
import org.json.JSONObject;




public class Controller {

    @FXML
    private TableColumn<ComponentModel, String> id;

    @FXML
    private TableColumn <ComponentModel, String> data;

    @FXML
    private TableColumn <ComponentModel, String> type;

    @FXML
    private TableColumn <ComponentModel, Integer> photos;

    @FXML
    private TableColumn <ComponentModel, Integer> textfields;

    @FXML
    private TableView componentTable;


    public void initializeComponents(ActionEvent event) {
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();
        ObservableList<ComponentModel> observable = FXCollections.observableArrayList();

        id.setCellValueFactory(cellData -> cellData.getValue().getComponentId());
        data.setCellValueFactory(cellData -> cellData.getValue().getComponentData());
        type.setCellValueFactory(cellData -> cellData.getValue().getComponentType());
        photos.setCellValueFactory(cellData -> cellData.getValue().getComponentNbOfPhotos().asObject());
        textfields.setCellValueFactory(cellData -> cellData.getValue().getComponentNbOfTextFields().asObject());
        ObservableList<ComponentModel> componentsList = CallAPI.getAllComponentModels();
        componentTable.setItems(componentsList);
    }

}
