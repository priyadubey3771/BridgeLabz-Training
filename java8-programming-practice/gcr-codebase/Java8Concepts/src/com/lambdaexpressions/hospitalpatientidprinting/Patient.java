package com.lambdaexpressions.hospitalpatientidprinting;

class Patient {
    String id;
    String name;

    public Patient(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }
}
