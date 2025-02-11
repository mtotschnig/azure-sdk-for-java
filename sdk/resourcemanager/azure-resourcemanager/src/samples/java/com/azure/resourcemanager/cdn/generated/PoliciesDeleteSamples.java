// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

/** Samples for Policies Delete. */
public final class PoliciesDeleteSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2023-05-01/examples/WafPolicyDelete.json
     */
    /**
     * Sample code: Delete protection policy.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteProtectionPolicy(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cdnProfiles()
            .manager()
            .serviceClient()
            .getPolicies()
            .deleteWithResponse("rg1", "Policy1", com.azure.core.util.Context.NONE);
    }
}
