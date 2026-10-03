package com.phanidharsai.designpatterns.creational.prototype.shallowanddeepcopy;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Prototype<Employee> {
    private String name;
    private String department;
    private Address address;        // Reference type!
    private List<String> skills;    // Reference type!

    public Employee(String name, String department, Address address,
                    List<String> skills) {
        this.name = name;
        this.department = department;
        this.address = address;
        this.skills = skills;
    }

    // SHALLOW COPY — address and skills are shared references!
    public Employee shallowClone() {
        return new Employee(name, department, address, skills);
    }

    // DEEP COPY — all nested objects are independently copied
    @Override
    public Employee clone() {
        Address clonedAddress = new Address(
                address.getStreet(), address.getCity(), address.getCountry()
        );
        List<String> clonedSkills = new ArrayList<>(skills);
        return new Employee(name, department, clonedAddress, clonedSkills);
    }

    // Getters and setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public List<String> getSkills() {
        return skills;
    }
}
