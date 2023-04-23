package org.example.protobuf;

import com.example.models.Credentials;
import com.example.models.EmailCredentials;
import com.example.models.PhoneOTP;

import java.util.ArrayList;

public class OneOfDemo {

    public static void main(String[] args) {
        EmailCredentials emailCredentials = EmailCredentials.newBuilder()
                .setEmail("anhad.pandit@samsung.com")
                .setPassword("password")
                .build();

        PhoneOTP phoneOTP = PhoneOTP.newBuilder()
                .setNumber(98765)
                .setCode(123456)
                .build();

        Credentials credentials = Credentials.newBuilder()
                .setPhoneMode(phoneOTP)
                .setEmailMode(emailCredentials)

                .build();

        login(credentials);
    }

    public static void login(Credentials credentials) {

        switch(credentials.getModeCase()) {
            case EMAILMODE:
                System.out.println(credentials.getEmailMode());
                break;
            case PHONEMODE:
                System.out.println(credentials.getPhoneMode());
                break;
        }
    }
}
