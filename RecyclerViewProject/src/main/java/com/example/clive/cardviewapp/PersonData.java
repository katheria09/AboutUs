package com.example.clive.cardviewapp;

/*created using Android Studio (Beta) 0.8.14
www.101apps.co.za*/

public class PersonData {


    String name;
    String email;
    int image;
    int id_;

    public PersonData(String name, String email, int image, int id_) {
        this.name = name;
        this.email = email;
        this.image = image;
        this.id_ = id_;
    }


    public String getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }


    public int getImage() {
        return image;
    }

    public int getId() {
        return id_;
    }
}