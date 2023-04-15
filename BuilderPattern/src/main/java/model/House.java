package model;

import builder.Builder;
import builder.HouseBuilder;

public class House {
    private  Long id;
    private  ModelHouseEnum model;
    private  String color;
    private  Double weight;
    private  Double height;
    private  Integer doors;

    public House(Long id, ModelHouseEnum model, String color, Double weight, Double height, Integer doors) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.weight = weight;
        this.height = height;
        this.doors = doors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ModelHouseEnum getModel() {
        return model;
    }

    public void setModel(ModelHouseEnum model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Integer getDoors() {
        return doors;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    public static Builder builder(){
        return HouseBuilder.getInstance();
    }

    @Override
    public String toString() {
        return "House [id=" + id + ", model=" + model + ", color=" + color + ", weight=" + weight + ", height=" + height + ", doors=" + doors + "]";
    }
}
