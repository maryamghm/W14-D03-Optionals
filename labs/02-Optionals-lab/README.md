# Lab: Exploring Optionals in Java

## Objective
Learn to use the `Optional` class in Java to handle nullable values safely and effectively.

---

## Scenario
You are tasked with managing a user profile system. Each user profile contains some optional information such as phone number and address. You need to safely access and manipulate this data using `Optional`.

---

## Instructions

1. **Create a `UserProfile` class** with the following fields:
   - `username` (String, required)
   - `email` (String, required)
   - `phoneNumber` (String, optional)
   - `address` (String, optional)

   Use `Optional` for the optional fields.

2. **Complete the following tasks:**

---

### Task 1: Safely Access Optional Data
Write a method `printUserProfile(UserProfile user)` that:
- Prints the `username` and `email` (always available).
- Prints the `phoneNumber` and `address` if they are present or indicates that they are missing.

---

### Task 2: Default Values for Missing Data
Write a method `getPhoneNumber(UserProfile user)` that:
- Returns the `phoneNumber` if present.
- Defaults to `"No phone number available"` if missing.

---

### Task 3: Filter Users by Address Presence
Write a method `filterUsersWithAddress(List<UserProfile> users)` that:
- Returns a list of users who have an `address`.

---

### Task 4: Bonus Challenge - Update Address
Write a method `updateAddress(UserProfile user, String newAddress)` that:
- Updates the user's address only if it is currently missing.
- Prints a message indicating whether the address was updated or not.

