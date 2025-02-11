// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.FileServerWriteSettings;

public final class FileServerWriteSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FileServerWriteSettings model = BinaryData.fromString(
            "{\"type\":\"FileServerWriteSettings\",\"maxConcurrentConnections\":\"datamrjngrjsqtirhab\",\"disableMetricsCollection\":\"datapcvsd\",\"copyBehavior\":\"datambydrgxvnmtjmu\",\"\":{\"thfqcyycx\":\"datamudwruog\",\"wfssgiebq\":\"datallkfjgj\"}}")
            .toObject(FileServerWriteSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FileServerWriteSettings model
            = new FileServerWriteSettings().withMaxConcurrentConnections("datamrjngrjsqtirhab")
                .withDisableMetricsCollection("datapcvsd").withCopyBehavior("datambydrgxvnmtjmu");
        model = BinaryData.fromObject(model).toObject(FileServerWriteSettings.class);
    }
}
