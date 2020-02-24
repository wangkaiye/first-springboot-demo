package com.htdata.firstboot.pojo;

public class User {
    private  Integer id;
    private  String username;
    private  String email;
    private  Integer age;
    private  Integer phone;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }



    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getPhone() {
        return phone;
    }
}
