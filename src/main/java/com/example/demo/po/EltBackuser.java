package com.example.demo.po;



import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;


import java.io.Serializable;

/**
 * Created by Admin on 2017/7/26.
 */
@Entity
@Table(name="ELT_BACKUSER")
public class EltBackuser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String username;

    private String password;



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
