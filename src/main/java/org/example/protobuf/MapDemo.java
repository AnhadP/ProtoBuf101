package org.example.protobuf;

import com.example.models.BodyStyle;
import com.example.models.Car;
import com.example.models.Dealer;
//import com.example.models.dealer

public class MapDemo {
    public static void main(String[] args) {

        Car accord = Car.newBuilder()
                .setMake("Honda")
                .setModel("Accord")
                .setBodyStyle(BodyStyle.SEDAN)
                .setYear(2020)
                .build();

        Car civic = Car.newBuilder()
                .setMake("Honda")
                .setModel("Civic")
                .setBodyStyle(BodyStyle.COUPE)
                .setYear(2005)
                .build();

        Dealer dealer = Dealer.newBuilder()
                .putModel(2020, accord)
                .putModel(2005, civic)
                .build();
        System.out.println(
                dealer.getModelOrThrow(2005).getBodyStyle()
        );
    }
}
