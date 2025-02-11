// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Authentication credential stored for an upstream. */
@Fluent
public final class AuthCredential {
    /*
     * The name of the credential.
     */
    @JsonProperty(value = "name")
    private CredentialName name;

    /*
     * KeyVault Secret URI for accessing the username.
     */
    @JsonProperty(value = "usernameSecretIdentifier")
    private String usernameSecretIdentifier;

    /*
     * KeyVault Secret URI for accessing the password.
     */
    @JsonProperty(value = "passwordSecretIdentifier")
    private String passwordSecretIdentifier;

    /*
     * This provides data pertaining to the health of the auth credential.
     */
    @JsonProperty(value = "credentialHealth", access = JsonProperty.Access.WRITE_ONLY)
    private CredentialHealth credentialHealth;

    /** Creates an instance of AuthCredential class. */
    public AuthCredential() {
    }

    /**
     * Get the name property: The name of the credential.
     *
     * @return the name value.
     */
    public CredentialName name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the credential.
     *
     * @param name the name value to set.
     * @return the AuthCredential object itself.
     */
    public AuthCredential withName(CredentialName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the usernameSecretIdentifier property: KeyVault Secret URI for accessing the username.
     *
     * @return the usernameSecretIdentifier value.
     */
    public String usernameSecretIdentifier() {
        return this.usernameSecretIdentifier;
    }

    /**
     * Set the usernameSecretIdentifier property: KeyVault Secret URI for accessing the username.
     *
     * @param usernameSecretIdentifier the usernameSecretIdentifier value to set.
     * @return the AuthCredential object itself.
     */
    public AuthCredential withUsernameSecretIdentifier(String usernameSecretIdentifier) {
        this.usernameSecretIdentifier = usernameSecretIdentifier;
        return this;
    }

    /**
     * Get the passwordSecretIdentifier property: KeyVault Secret URI for accessing the password.
     *
     * @return the passwordSecretIdentifier value.
     */
    public String passwordSecretIdentifier() {
        return this.passwordSecretIdentifier;
    }

    /**
     * Set the passwordSecretIdentifier property: KeyVault Secret URI for accessing the password.
     *
     * @param passwordSecretIdentifier the passwordSecretIdentifier value to set.
     * @return the AuthCredential object itself.
     */
    public AuthCredential withPasswordSecretIdentifier(String passwordSecretIdentifier) {
        this.passwordSecretIdentifier = passwordSecretIdentifier;
        return this;
    }

    /**
     * Get the credentialHealth property: This provides data pertaining to the health of the auth credential.
     *
     * @return the credentialHealth value.
     */
    public CredentialHealth credentialHealth() {
        return this.credentialHealth;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (credentialHealth() != null) {
            credentialHealth().validate();
        }
    }
}
