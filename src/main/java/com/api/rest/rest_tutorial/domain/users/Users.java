package com.api.rest.rest_tutorial.domain.users;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Users {

    @Id
    public ObjectId _id;

    public String username;
    public String password;

    public Users(){}

    public Users(ObjectId _id, String username, String password){
        this._id = _id;
        this.username = username;
        this.password = password;
    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
