package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        UserProfile user1 = new UserProfile(
                "Maryam",
                "maryam@gmail.com",
                Optional.of("1234567890"),
                Optional.empty()
        );

        UserProfile user2 = new UserProfile(
                "John",
                "john@gmail.com",
                Optional.empty(),
                Optional.of("119 Goethe street")
        );

        UserProfile user3 = new UserProfile(
                "Mia",
                "mia@example.com",
                Optional.empty(),
                Optional.empty()
        );

        List<UserProfile> users = Arrays.asList(user1, user2, user3);

        System.out.println("All Users:");
        users.forEach(user -> printUserProfile(user));

        System.out.println("\nUsers' phone numbers:");
        users.forEach(user -> {
            System.out.print(user.getUsername() + ": ");
            System.out.println(getPhoneNumber(user));
        });

        System.out.println("\nAll users with address:");
        filterUsersWithAddress(users).forEach(System.out::println);

        System.out.println("\nTesting updateAddress:");
        updateAddress(user1, "55 Schadow Street");
        updateAddress(user2, "789 Berliner Street");
        System.out.println("User 1 updated: " + user1);
        System.out.println("User 2 updated: " + user2);

    }

    private static void printUserProfile(UserProfile user) {
        System.out.println("\nUser's Information");
        System.out.println("username: " + user.getUsername());
        System.out.println("email: " + user.getEmail());
        System.out.println("phone number: " + user.getPhoneNumber().orElseGet((() -> "No phone number available")));
        System.out.println("address: " + user.getAddress().orElseGet(() -> "No address available"));
    }

    private static String getPhoneNumber(UserProfile user) {
        return user.getPhoneNumber().orElseGet(() -> "No phone number available");
    }

    private static List<UserProfile> filterUsersWithAddress(List<UserProfile> users) {
        return users.stream().filter(user -> user.getAddress().isPresent()).toList();
    }

    public static void updateAddress(UserProfile user, String newAddress) {
        user.getAddress().ifPresentOrElse(
                address -> System.out.println("Address is already present and was not updated."),
                () -> {
                    user.setAddress(Optional.of(newAddress));
                    System.out.println("Address was updated to: " + newAddress);
                }
        );
    }
}