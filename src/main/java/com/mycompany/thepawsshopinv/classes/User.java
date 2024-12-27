/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thepawsshopinv.classes;

public class User {
    private String name;
    private String username;
    private String password;
    private String gender;

    public User(String name, String username, String password, String gender) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.gender = gender;
    }

    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
}
