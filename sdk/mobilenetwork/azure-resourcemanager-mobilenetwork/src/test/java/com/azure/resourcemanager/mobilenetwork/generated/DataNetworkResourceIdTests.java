// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.models.DataNetworkResourceId;
import org.junit.jupiter.api.Assertions;

public final class DataNetworkResourceIdTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataNetworkResourceId model =
            BinaryData.fromString("{\"id\":\"yqdhcuplcplcw\"}").toObject(DataNetworkResourceId.class);
        Assertions.assertEquals("yqdhcuplcplcw", model.id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataNetworkResourceId model = new DataNetworkResourceId().withId("yqdhcuplcplcw");
        model = BinaryData.fromObject(model).toObject(DataNetworkResourceId.class);
        Assertions.assertEquals("yqdhcuplcplcw", model.id());
    }
}
