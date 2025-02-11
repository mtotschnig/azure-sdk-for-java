// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.TagsObject;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class TagsObjectTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TagsObject model =
            BinaryData
                .fromString(
                    "{\"tags\":{\"jakhmsbzjh\":\"fdfdosygexpa\",\"hqtrgqjbpf\":\"rzevdphlxaol\",\"tfell\":\"fsinzgvfcjrwzoxx\",\"lxofpdvhpfxxypin\":\"wfzitonpeqfpjk\"}}")
                .toObject(TagsObject.class);
        Assertions.assertEquals("fdfdosygexpa", model.tags().get("jakhmsbzjh"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TagsObject model =
            new TagsObject()
                .withTags(
                    mapOf(
                        "jakhmsbzjh",
                        "fdfdosygexpa",
                        "hqtrgqjbpf",
                        "rzevdphlxaol",
                        "tfell",
                        "fsinzgvfcjrwzoxx",
                        "lxofpdvhpfxxypin",
                        "wfzitonpeqfpjk"));
        model = BinaryData.fromObject(model).toObject(TagsObject.class);
        Assertions.assertEquals("fdfdosygexpa", model.tags().get("jakhmsbzjh"));
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
