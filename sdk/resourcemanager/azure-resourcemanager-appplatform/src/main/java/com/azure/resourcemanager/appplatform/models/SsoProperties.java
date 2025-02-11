// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Single sign-on related configuration. */
@Fluent
public final class SsoProperties {
    /*
     * It defines the specific actions applications can be allowed to do on a
     * user's behalf
     */
    @JsonProperty(value = "scope")
    private List<String> scope;

    /*
     * The public identifier for the application
     */
    @JsonProperty(value = "clientId")
    private String clientId;

    /*
     * The secret known only to the application and the authorization server
     */
    @JsonProperty(value = "clientSecret")
    private String clientSecret;

    /*
     * The URI of Issuer Identifier
     */
    @JsonProperty(value = "issuerUri")
    private String issuerUri;

    /**
     * Get the scope property: It defines the specific actions applications can be allowed to do on a user's behalf.
     *
     * @return the scope value.
     */
    public List<String> scope() {
        return this.scope;
    }

    /**
     * Set the scope property: It defines the specific actions applications can be allowed to do on a user's behalf.
     *
     * @param scope the scope value to set.
     * @return the SsoProperties object itself.
     */
    public SsoProperties withScope(List<String> scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the clientId property: The public identifier for the application.
     *
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The public identifier for the application.
     *
     * @param clientId the clientId value to set.
     * @return the SsoProperties object itself.
     */
    public SsoProperties withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientSecret property: The secret known only to the application and the authorization server.
     *
     * @return the clientSecret value.
     */
    public String clientSecret() {
        return this.clientSecret;
    }

    /**
     * Set the clientSecret property: The secret known only to the application and the authorization server.
     *
     * @param clientSecret the clientSecret value to set.
     * @return the SsoProperties object itself.
     */
    public SsoProperties withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Get the issuerUri property: The URI of Issuer Identifier.
     *
     * @return the issuerUri value.
     */
    public String issuerUri() {
        return this.issuerUri;
    }

    /**
     * Set the issuerUri property: The URI of Issuer Identifier.
     *
     * @param issuerUri the issuerUri value to set.
     * @return the SsoProperties object itself.
     */
    public SsoProperties withIssuerUri(String issuerUri) {
        this.issuerUri = issuerUri;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
