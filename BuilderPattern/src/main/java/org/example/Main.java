package org.example;

import builder.HouseBuilder;
import model.House;
import model.ModelHouseEnum;

public class Main {
    public static void main(String[] args) {
        House concreteHouse = House.builder()
                .id(1L)
                .color("Blue")
                .model(ModelHouseEnum.CLASSIC)
                .height(100.3)
                .weight(100.2)
                .doors(150)
                .build();
        System.out.println(concreteHouse);
        concreteHouse.setId(2L);
        System.out.println(concreteHouse);

    }
}