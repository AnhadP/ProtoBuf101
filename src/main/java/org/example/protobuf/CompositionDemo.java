package org.example.protobuf;

import com.example.models.Address;
import com.example.models.Car;
import com.example.models.Person;
import com.google.protobuf.Int32Value;

import java.util.ArrayList;
import java.util.List;

public class CompositionDemo {

    public static void main(String[] args) {
        Address address = Address.newBuilder()
                                .setPostbox(123)
                                .setStreet("main street")
                                .setCity("New Delhi")
                                .build();

        Car accord = Car.newBuilder()
                    .setMake("Honda")
                    .setModel("Accord")
                    .setYear(2020)
                    .build();

        Car civic = Car.newBuilder()
                .setMake("Honda")
                .setModel("Civic")
                .setYear(2005)
                .build();

        List<Car> cars = new ArrayList<Car>();
        cars.add(accord);
        cars.add(civic);

        Person sam = Person.newBuilder()
                .setName("sam")
                .setAge(Int32Value.newBuilder().setValue(25).build())
                .addAllCar(cars)
                .setAddress(address)
                .build();

        System.out.println(
                sam.hasAge()
        );
    }
}
