// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.Activity;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.Expression;
import com.azure.resourcemanager.datafactory.models.ForEachActivity;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ForEachActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ForEachActivity model = BinaryData.fromString(
            "{\"type\":\"ForEach\",\"typeProperties\":{\"isSequential\":true,\"batchCount\":1012384732,\"items\":{\"value\":\"dbmuzpdjthpsyc\"},\"activities\":[{\"type\":\"Activity\",\"name\":\"xuhiwymmiipf\",\"description\":\"gjmysnfpx\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Failed\",\"dependsOn\":[{\"activity\":\"ivsq\",\"dependencyConditions\":[\"Skipped\",\"Succeeded\",\"Completed\",\"Failed\"],\"\":{\"itkfvdjgwzak\":\"dataade\"}}],\"userProperties\":[{\"name\":\"brbsuxgnw\",\"value\":\"dataykuloz\"},{\"name\":\"oilhrxjiwjivy\",\"value\":\"datarqlky\"},{\"name\":\"wnb\",\"value\":\"datalau\"}],\"\":{\"bvftqahjnsllfkcr\":\"datayriscio\",\"fxtendfp\":\"dataviimhdlmagdwi\",\"tklojlgsbystznwj\":\"dataoxtifosxxk\",\"ptvkjdowuzasd\":\"datasvllefliriq\"}},{\"type\":\"Activity\",\"name\":\"tufmujadippdntun\",\"description\":\"eeprmebvxmaacr\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Failed\",\"dependsOn\":[{\"activity\":\"jcesm\",\"dependencyConditions\":[\"Failed\",\"Succeeded\",\"Completed\",\"Failed\"],\"\":{\"dbuz\":\"datajxyv\",\"asdrrfozz\":\"dataphogmrcmguel\"}},{\"activity\":\"ygolz\",\"dependencyConditions\":[\"Failed\",\"Succeeded\",\"Skipped\",\"Completed\"],\"\":{\"rjmzqnbwnloo\":\"datarysvcabr\"}},{\"activity\":\"ah\",\"dependencyConditions\":[\"Completed\",\"Completed\",\"Completed\",\"Skipped\"],\"\":{\"jorpcrgrjxitpp\":\"dataoqclypbr\",\"rdefhbzic\":\"databuvxxlo\",\"lzwvmwjuqchc\":\"datafdwgbgenwesxzu\"}}],\"userProperties\":[{\"name\":\"yscarjm\",\"value\":\"dataiewv\"},{\"name\":\"pyskhkvkwdtbvy\",\"value\":\"datalgkzbyxtprxtf\"},{\"name\":\"vng\",\"value\":\"datacsno\"},{\"name\":\"kglygeuo\",\"value\":\"datalywjvdr\"}],\"\":{\"nt\":\"datawzbrg\",\"n\":\"dataptrjtyhthfcpz\",\"g\":\"datavkhkubpojhdxcha\",\"vrnwxolfhiq\":\"dataw\"}}]},\"name\":\"iulfxgzyr\",\"description\":\"uxlt\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Succeeded\",\"dependsOn\":[{\"activity\":\"catozsodpbsqcw\",\"dependencyConditions\":[\"Failed\"],\"\":{\"ribmeuukk\":\"datahuixczycifdrjry\",\"jmnxlf\":\"datanwtucmh\",\"wzgb\":\"datam\",\"mrpbmxmxshfh\":\"databwmiap\"}},{\"activity\":\"p\",\"dependencyConditions\":[\"Skipped\",\"Succeeded\",\"Failed\"],\"\":{\"vxytmoqnytucuzy\":\"datap\",\"e\":\"dataigdebsinsoybe\",\"mqjcagxrozcfcxk\":\"datarpouhlhlud\",\"kgepmnxvahqvc\":\"datahjxbteakdr\"}},{\"activity\":\"lphlkxdanlycc\",\"dependencyConditions\":[\"Succeeded\",\"Completed\",\"Skipped\"],\"\":{\"qzdedizdmwndnsg\":\"dataa\"}}],\"userProperties\":[{\"name\":\"pstwmdmwsf\",\"value\":\"datardyrxloxa\"},{\"name\":\"mxnmx\",\"value\":\"datamdlynlhsdtc\"},{\"name\":\"flevndldhwrf\",\"value\":\"dataflhwfrjyuhuthqdf\"},{\"name\":\"bizloyqjrkt\",\"value\":\"datadvuqve\"}],\"\":{\"relbzwxxsowd\":\"dataogesrmahszxcfbp\",\"nhqfae\":\"datauwvupn\"}}")
            .toObject(ForEachActivity.class);
        Assertions.assertEquals("iulfxgzyr", model.name());
        Assertions.assertEquals("uxlt", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SUCCEEDED, model.onInactiveMarkAs());
        Assertions.assertEquals("catozsodpbsqcw", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.FAILED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("pstwmdmwsf", model.userProperties().get(0).name());
        Assertions.assertEquals(true, model.isSequential());
        Assertions.assertEquals(1012384732, model.batchCount());
        Assertions.assertEquals("dbmuzpdjthpsyc", model.items().value());
        Assertions.assertEquals("xuhiwymmiipf", model.activities().get(0).name());
        Assertions.assertEquals("gjmysnfpx", model.activities().get(0).description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.activities().get(0).state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.activities().get(0).onInactiveMarkAs());
        Assertions.assertEquals("ivsq", model.activities().get(0).dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED,
            model.activities().get(0).dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("brbsuxgnw", model.activities().get(0).userProperties().get(0).name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ForEachActivity model = new ForEachActivity().withName("iulfxgzyr").withDescription("uxlt")
            .withState(ActivityState.INACTIVE).withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SUCCEEDED)
            .withDependsOn(Arrays.asList(new ActivityDependency().withActivity("catozsodpbsqcw")
                .withDependencyConditions(Arrays.asList(DependencyCondition.FAILED)).withAdditionalProperties(mapOf()),
                new ActivityDependency().withActivity("p")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED, DependencyCondition.SUCCEEDED,
                        DependencyCondition.FAILED))
                    .withAdditionalProperties(mapOf()),
                new ActivityDependency().withActivity("lphlkxdanlycc")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.SUCCEEDED,
                        DependencyCondition.COMPLETED, DependencyCondition.SKIPPED))
                    .withAdditionalProperties(mapOf())))
            .withUserProperties(Arrays.asList(new UserProperty().withName("pstwmdmwsf").withValue("datardyrxloxa"),
                new UserProperty().withName("mxnmx").withValue("datamdlynlhsdtc"),
                new UserProperty().withName("flevndldhwrf").withValue("dataflhwfrjyuhuthqdf"),
                new UserProperty().withName("bizloyqjrkt").withValue("datadvuqve")))
            .withIsSequential(true).withBatchCount(1012384732).withItems(new Expression().withValue("dbmuzpdjthpsyc"))
            .withActivities(Arrays.asList(new Activity().withName("xuhiwymmiipf").withDescription("gjmysnfpx")
                .withState(ActivityState.INACTIVE).withOnInactiveMarkAs(ActivityOnInactiveMarkAs.FAILED)
                .withDependsOn(Arrays.asList(new ActivityDependency().withActivity("ivsq")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED, DependencyCondition.SUCCEEDED,
                        DependencyCondition.COMPLETED, DependencyCondition.FAILED))
                    .withAdditionalProperties(mapOf())))
                .withUserProperties(
                    Arrays.asList(new UserProperty().withName("brbsuxgnw").withValue("dataykuloz"),
                        new UserProperty().withName("oilhrxjiwjivy").withValue("datarqlky"),
                        new UserProperty().withName("wnb").withValue("datalau")))
                .withAdditionalProperties(mapOf("type", "Activity")),
                new Activity().withName("tufmujadippdntun").withDescription("eeprmebvxmaacr")
                    .withState(ActivityState.ACTIVE).withOnInactiveMarkAs(ActivityOnInactiveMarkAs.FAILED)
                    .withDependsOn(Arrays.asList(new ActivityDependency().withActivity("jcesm")
                        .withDependencyConditions(Arrays.asList(DependencyCondition.FAILED,
                            DependencyCondition.SUCCEEDED, DependencyCondition.COMPLETED, DependencyCondition.FAILED))
                        .withAdditionalProperties(mapOf()),
                        new ActivityDependency().withActivity("ygolz")
                            .withDependencyConditions(
                                Arrays.asList(DependencyCondition.FAILED, DependencyCondition.SUCCEEDED,
                                    DependencyCondition.SKIPPED, DependencyCondition.COMPLETED))
                            .withAdditionalProperties(mapOf()),
                        new ActivityDependency().withActivity("ah")
                            .withDependencyConditions(
                                Arrays.asList(DependencyCondition.COMPLETED, DependencyCondition.COMPLETED,
                                    DependencyCondition.COMPLETED, DependencyCondition.SKIPPED))
                            .withAdditionalProperties(mapOf())))
                    .withUserProperties(Arrays.asList(new UserProperty().withName("yscarjm").withValue("dataiewv"),
                        new UserProperty().withName("pyskhkvkwdtbvy").withValue("datalgkzbyxtprxtf"),
                        new UserProperty().withName("vng").withValue("datacsno"),
                        new UserProperty().withName("kglygeuo").withValue("datalywjvdr")))
                    .withAdditionalProperties(mapOf("type", "Activity"))));
        model = BinaryData.fromObject(model).toObject(ForEachActivity.class);
        Assertions.assertEquals("iulfxgzyr", model.name());
        Assertions.assertEquals("uxlt", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SUCCEEDED, model.onInactiveMarkAs());
        Assertions.assertEquals("catozsodpbsqcw", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.FAILED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("pstwmdmwsf", model.userProperties().get(0).name());
        Assertions.assertEquals(true, model.isSequential());
        Assertions.assertEquals(1012384732, model.batchCount());
        Assertions.assertEquals("dbmuzpdjthpsyc", model.items().value());
        Assertions.assertEquals("xuhiwymmiipf", model.activities().get(0).name());
        Assertions.assertEquals("gjmysnfpx", model.activities().get(0).description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.activities().get(0).state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.activities().get(0).onInactiveMarkAs());
        Assertions.assertEquals("ivsq", model.activities().get(0).dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED,
            model.activities().get(0).dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("brbsuxgnw", model.activities().get(0).userProperties().get(0).name());
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
