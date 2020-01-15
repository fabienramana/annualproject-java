package sample;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ComponentModel {

    private StringProperty idProperty;

    private StringProperty dataProperty;

    private IntegerProperty photosProperty;

    private IntegerProperty textFieldsProperty;

    private StringProperty typeProperty;

    public ComponentModel() {
        this.idProperty = new SimpleStringProperty();
        this.dataProperty = new SimpleStringProperty();
        this.typeProperty = new SimpleStringProperty();
        this.photosProperty = new SimpleIntegerProperty();
        this.textFieldsProperty = new SimpleIntegerProperty();
    }

    // ID
    public String getId() {
        return idProperty.get();
    }

    public void setId (String id) {
        this.idProperty.set(id);
    }

    public StringProperty getComponentId() {
        return idProperty;
    }

    // DATA
    public String getData() {
        return dataProperty.get();
    }

    public void setData (String data) {
        this.dataProperty.set(data);
    }

    public StringProperty getComponentData() {
        return dataProperty;
    }

    // PHOTOS

    public int getNumberOfPhotos() {
        return photosProperty.get();
    }

    public void setNumberOfPhotos (int nbOfPhotos) {
        this.photosProperty.set(nbOfPhotos);
    }

    public IntegerProperty getComponentNbOfPhotos() {
        return photosProperty;
    }

    // TEXTFIELDS

    public int getNumberOfTextFields() {
        return textFieldsProperty.get();
    }

    public void setNumberOfTextFields (int nbOfTextFields) {
        this.photosProperty.set(nbOfTextFields);
    }

    public IntegerProperty getComponentNbOfTextFields() {
        return textFieldsProperty;
    }


    // TYPE

    public String getType() {
        return typeProperty.get();
    }

    public void setType (String type) {
        this.typeProperty.set(type);
    }

    public StringProperty getComponentType() {
        return typeProperty;
    }



}
