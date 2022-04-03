package com.desh.customer;

public record CustomerRegistrationRequest(String firstname,
                                          String lastname,
                                          String  email)
{
}
