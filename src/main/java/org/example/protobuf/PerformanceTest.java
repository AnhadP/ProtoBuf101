package org.example.protobuf;

import com.example.models.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.Int32Value;
import com.google.protobuf.InvalidProtocolBufferException;
import org.example.json.JPerson;

public class PerformanceTest { //Testing file

    public static void main(String[] args) {

        //json object creation
        JPerson person = new JPerson();
        person.setName("sam");
        person.setAge(10);

        ObjectMapper mapper = new ObjectMapper(); //using Jackson dependency

        Runnable json = () -> {
            try {
                byte[] bytes = mapper.writeValueAsBytes(person);
                System.out.println(bytes.length);
                JPerson person1 = mapper.readValue(bytes, JPerson.class);
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
        };

        //protobuf

        Person sam = Person.newBuilder()
                .setName("sam")
                .setAge(Int32Value.newBuilder().setValue(10).build())
                .build();


        Runnable proto = () -> {
            try {
                byte[] bytes = sam.toByteArray();
                System.out.println(bytes.length);
                Person sam1 = Person.parseFrom(bytes);
            }
            catch (InvalidProtocolBufferException e) {
                throw new RuntimeException(e);
            }
        };
        for (int i = 0; i < 1; i++) {
            runPerformanceTest(json, "JSON");
            runPerformanceTest(proto, "PROTO");
            System.out.println("\n");
        }

    }

    public static void runPerformanceTest(Runnable runnable, String method) {
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 1; i++) {
            runnable.run();
        }
        long time2 = System.currentTimeMillis();

        System.out.println(
                method + " : " + (time2 - time1) + "ms"
        );
    }
}
