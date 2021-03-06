// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.azure.security.keyvault.certificates.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The contact information for the vault certificates.
 */
public final class Contact {
    /**
     * Email addresss.
     */
    @JsonProperty(value = "email")
    private String emailAddress;

    /**
     * Name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Phone number.
     */
    @JsonProperty(value = "phone")
    private String phone;

    /**
     * Creates a new contact instance.
     *
     * @param name The name of the contact
     * @param emailAddress The email address of the contact
     * @param phone The phone number of the contact.
     */
    public Contact(String name, String emailAddress, String phone) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.phone = phone;
    }

    /**
     * Creates a new contact instance.
     *
     * @param name The name of the contact
     * @param emailAddress The email address of the contact
     */
    public Contact(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    Contact() { }

    /**
     * Get the emailAddress.
     *
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the phone info.
     *
     * @return the phone info
     */
    public String getPhone() {
        return this.phone;
    }
}
