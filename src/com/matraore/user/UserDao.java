package com.matraore.user;

import java.util.UUID;

public class UserDao {

    private static final User[] users;

    static {
        users = new User[]{
                new User(UUID.fromString("246986f2-9cd1-40b8-8a91-7499f515e257"), "Moctar"),
                new User(UUID.fromString("c9578590-bc86-11ed-afa1-0242ac120002"), "Mamadou")
        };
    }
    public User[] getUsers() {
        return users;
    }
}
