// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.communication.models.ManagedServiceIdentity;
import com.azure.resourcemanager.communication.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.communication.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ManagedServiceIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedServiceIdentity model = BinaryData.fromString(
            "{\"principalId\":\"7da3f15f-3155-44b6-af7b-57d700e8f3dc\",\"tenantId\":\"49937368-fbce-4402-86f3-d3aa0a9448f0\",\"type\":\"None\",\"userAssignedIdentities\":{\"txilnerkujy\":{\"principalId\":\"67f3950e-cd0f-487e-816c-470e8537908e\",\"clientId\":\"59f0b0a9-0888-4c2b-ac73-b383c3bc4c43\"},\"eju\":{\"principalId\":\"28575b7b-d38a-4ae5-b132-6015536496ec\",\"clientId\":\"a64c4366-9d5f-4d2d-a216-cdc7b15630f9\"},\"awrlyx\":{\"principalId\":\"fbdd6559-a515-49de-8f75-d3f5ee30a72a\",\"clientId\":\"71db179b-92ad-4b09-830b-cfe4be1c994e\"},\"cpr\":{\"principalId\":\"10c013a1-f476-4177-9ed5-85e204c97d46\",\"clientId\":\"0f13e40b-e69a-425e-bc08-3d4491477e09\"}}}")
            .toObject(ManagedServiceIdentity.class);
        Assertions.assertEquals(ManagedServiceIdentityType.NONE, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedServiceIdentity model = new ManagedServiceIdentity().withType(ManagedServiceIdentityType.NONE)
            .withUserAssignedIdentities(mapOf("txilnerkujy", new UserAssignedIdentity(), "eju",
                new UserAssignedIdentity(), "awrlyx", new UserAssignedIdentity(), "cpr", new UserAssignedIdentity()));
        model = BinaryData.fromObject(model).toObject(ManagedServiceIdentity.class);
        Assertions.assertEquals(ManagedServiceIdentityType.NONE, model.type());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
