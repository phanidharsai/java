package com.phanidharsai.designpatterns.creational.prototype.shallowanddeepcopy;

import java.util.ArrayList;
import java.util.List;

// ========== Usage ==========
public class Demo {
    public static void main(String[] args) {
        Employee original = new Employee(
                "Alice", "Engineering",
                new Address("123 Main St", "San Jose", "USA"),
                new ArrayList<>(List.of("Java", "Spring", "AWS"))
        );

        // Deep clone — independent copy
        Employee clone = original.clone();
        clone.setName("Bob");
        clone.getAddress().setStreet("456 Oak Ave");
        clone.getSkills().add("Kubernetes");

        // Original is NOT affected
        System.out.println(original.getName());           // Alice
        System.out.println(original.getAddress().getStreet()); // 123 Main St
        System.out.println(original.getSkills().size());  // 3
    }
}
