// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureBlobFSSource;

public final class AzureBlobFSSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBlobFSSource model = BinaryData.fromString(
            "{\"type\":\"AzureBlobFSSource\",\"treatEmptyAsNull\":\"datax\",\"skipHeaderLineCount\":\"datanrurtnwbjj\",\"recursive\":\"dataupckhfbmdemohlsh\",\"sourceRetryCount\":\"dataaoofltb\",\"sourceRetryWait\":\"datayvmwaejxzkqcm\",\"maxConcurrentConnections\":\"datacf\",\"disableMetricsCollection\":\"dataxyrtqegabsfjrj\",\"\":{\"dibepgfrbijoehh\":\"datascgorv\"}}")
            .toObject(AzureBlobFSSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBlobFSSource model = new AzureBlobFSSource().withSourceRetryCount("dataaoofltb")
            .withSourceRetryWait("datayvmwaejxzkqcm").withMaxConcurrentConnections("datacf")
            .withDisableMetricsCollection("dataxyrtqegabsfjrj").withTreatEmptyAsNull("datax")
            .withSkipHeaderLineCount("datanrurtnwbjj").withRecursive("dataupckhfbmdemohlsh");
        model = BinaryData.fromObject(model).toObject(AzureBlobFSSource.class);
    }
}
