package builder;

import model.House;
import model.ModelHouseEnum;

public class HouseBuilder implements Builder{

    /*Singleton*/
    private static Builder instance;
    private HouseBuilder(){}
    private  Long id;
    private  ModelHouseEnum model;
    private  String color;
    private  Double weight;
    private  Double height;
    private  Integer doors;


    public static Builder getInstance(){
        if(instance == null){
            instance = new HouseBuilder();
            return instance;
        }
        return instance;
    }

    @Override
    public HouseBuilder id(Long id){
        this.id = id;
        return this;
    }
    @Override
    public HouseBuilder model(ModelHouseEnum model){
        this.model = model;
        return this;
    }
    @Override
    public HouseBuilder weight(Double weight){
        this.weight = weight;
        return this;
    }
    @Override
    public HouseBuilder height(Double height){
        this.height = height;
        return this;
    }

    @Override
    public HouseBuilder color (String color){
        this.color = color;
        return this;
    }
    @Override
    public HouseBuilder doors(Integer doors){
        this.doors = doors;
        return this;
    }

    public House build(){
        return new House(this.id, this.model, this.color, this.weight, this.height, this.doors);
    }
}
