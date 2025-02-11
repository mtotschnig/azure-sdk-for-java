// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ProtectionContainerFabricSpecificDetails;

public final class ProtectionContainerFabricSpecificDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProtectionContainerFabricSpecificDetails model =
            BinaryData
                .fromString("{\"instanceType\":\"vmkfssxqu\"}")
                .toObject(ProtectionContainerFabricSpecificDetails.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProtectionContainerFabricSpecificDetails model = new ProtectionContainerFabricSpecificDetails();
        model = BinaryData.fromObject(model).toObject(ProtectionContainerFabricSpecificDetails.class);
    }
}
