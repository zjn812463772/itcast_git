package com.nanwei.pojo;

public class User {
    private String usernmae;
    private int age;

    public User(String usernmae, int age) {
        this.usernmae = usernmae;
        this.age = age;
    }

    public String getUsernmae() {
        return usernmae;
    }

    public void setUsernmae(String usernmae) {
        this.usernmae = usernmae;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
