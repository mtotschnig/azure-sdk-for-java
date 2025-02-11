// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SapEccSource;

public final class SapEccSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapEccSource model = BinaryData.fromString(
            "{\"type\":\"SapEccSource\",\"query\":\"dataskb\",\"httpRequestTimeout\":\"datacakle\",\"queryTimeout\":\"datagxdhgezyhphao\",\"additionalColumns\":\"databqm\",\"sourceRetryCount\":\"dataglkqitpbyn\",\"sourceRetryWait\":\"datayx\",\"maxConcurrentConnections\":\"dataopocleffgggg\",\"disableMetricsCollection\":\"datasbouhmng\",\"\":{\"cpspaoxigpdiou\":\"datakgiusrvs\"}}")
            .toObject(SapEccSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapEccSource model = new SapEccSource().withSourceRetryCount("dataglkqitpbyn").withSourceRetryWait("datayx")
            .withMaxConcurrentConnections("dataopocleffgggg").withDisableMetricsCollection("datasbouhmng")
            .withQueryTimeout("datagxdhgezyhphao").withAdditionalColumns("databqm").withQuery("dataskb")
            .withHttpRequestTimeout("datacakle");
        model = BinaryData.fromObject(model).toObject(SapEccSource.class);
    }
}
