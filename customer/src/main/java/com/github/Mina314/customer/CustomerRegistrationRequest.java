package com.github.Mina314.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
