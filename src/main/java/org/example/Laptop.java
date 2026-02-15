package org.example;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {

    @Id
    int lid;
    int Brand;
    int Model;

    public int getBrand() {
        return Brand;
    }

    public void setBrand(int brand) {
        Brand = brand;
    }

    public int getModel() {
        return Model;
    }

    public void setModel(int model) {
        Model = model;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "Brand=" + Brand +
                ", Model=" + Model +
                '}';
    }
}
