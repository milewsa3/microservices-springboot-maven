package com.amigoscode.customer;

record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
