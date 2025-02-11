// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.PrivateEndpointConnectionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of private endpoint connections. */
@Immutable
public final class PrivateEndpointConnectionListResult {
    /*
     * Array of results.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointConnectionInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of PrivateEndpointConnectionListResult class. */
    public PrivateEndpointConnectionListResult() {
    }

    /**
     * Get the value property: Array of results.
     *
     * @return the value value.
     */
    public List<PrivateEndpointConnectionInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
