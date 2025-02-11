// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Authorization profile with details of AAD user Ids and group Ids authorized for data plane access. */
@Fluent
public final class AuthorizationProfile {
    /*
     * AAD user Ids authorized for data plane access.
     */
    @JsonProperty(value = "userIds")
    private List<String> userIds;

    /*
     * AAD group Ids authorized for data plane access.
     */
    @JsonProperty(value = "groupIds")
    private List<String> groupIds;

    /** Creates an instance of AuthorizationProfile class. */
    public AuthorizationProfile() {
    }

    /**
     * Get the userIds property: AAD user Ids authorized for data plane access.
     *
     * @return the userIds value.
     */
    public List<String> userIds() {
        return this.userIds;
    }

    /**
     * Set the userIds property: AAD user Ids authorized for data plane access.
     *
     * @param userIds the userIds value to set.
     * @return the AuthorizationProfile object itself.
     */
    public AuthorizationProfile withUserIds(List<String> userIds) {
        this.userIds = userIds;
        return this;
    }

    /**
     * Get the groupIds property: AAD group Ids authorized for data plane access.
     *
     * @return the groupIds value.
     */
    public List<String> groupIds() {
        return this.groupIds;
    }

    /**
     * Set the groupIds property: AAD group Ids authorized for data plane access.
     *
     * @param groupIds the groupIds value to set.
     * @return the AuthorizationProfile object itself.
     */
    public AuthorizationProfile withGroupIds(List<String> groupIds) {
        this.groupIds = groupIds;
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
