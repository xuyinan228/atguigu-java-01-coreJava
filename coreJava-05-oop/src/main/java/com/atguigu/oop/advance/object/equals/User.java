package com.atguigu.oop.advance.object.equals;

public class User {
    private int age;
    private String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if( this == obj ) {
            return true;
        }
        if( obj == null ) {
            return false;
        }
        if( !(obj instanceof User) ) {
            return false;
        }
        User other = (User) obj;
        if( age != other.age ) {
            return false;
        }
        if( name == null ) {
            return other.name == null;
        }
        return name.equals(other.name);
    }
}
