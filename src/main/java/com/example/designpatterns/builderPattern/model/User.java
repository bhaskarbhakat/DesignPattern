package com.example.designpatterns.builderPattern.model;

import lombok.Getter;

@Getter
public class User {
    private String name;
    private String dob;
    private Integer age;
    private String email;
    private String phoneNumber;
    private String gender;
    private String city;
    private String state;

    public static Builder getBuilder() {
        return new Builder();
    }

    private User(Builder builder) {
        this.name = builder.getName();
        this.dob = builder.getDob();
        this.age = builder.getAge();
        this.city = builder.getCity();
        this.state = builder.getState();
        this.phoneNumber = builder.getPhoneNumber();
        this.email = builder.getEmail();
        this.gender = builder.getGender();
    }

    @Getter
    public static class Builder {
        private String name;
        private String dob;
        private Integer age;
        private String email;
        private String phoneNumber;
        private String gender;
        private String city;
        private String state;

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder setDob(String dob) {
            this.dob = dob;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setState(String state) {
            this.state = state;
            return this;
        }

        public boolean validate() {
            return this.getAge() >= 18;
        }

        public User build(){
            if (!validate()) {
                throw new RuntimeException("Parameter not allowed");
            }
            return new User(this);
        }
    }
}
