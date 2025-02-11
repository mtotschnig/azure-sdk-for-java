// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Objects;

/**
 * The DataLakeGen2SharedKeyCredentialPatch model.
 */
@Fluent
public final class DataLakeGen2SharedKeyCredentialPatch extends DataSourceCredentialPatch {
    /*
     * The parameters property.
     */
    private DataLakeGen2SharedKeyParamPatch parameters;

    /**
     * Creates an instance of DataLakeGen2SharedKeyCredentialPatch class.
     */
    public DataLakeGen2SharedKeyCredentialPatch() {
    }

    /**
     * Get the parameters property: The parameters property.
     * 
     * @return the parameters value.
     */
    public DataLakeGen2SharedKeyParamPatch getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The parameters property.
     * 
     * @param parameters the parameters value to set.
     * @return the DataLakeGen2SharedKeyCredentialPatch object itself.
     */
    public DataLakeGen2SharedKeyCredentialPatch setParameters(DataLakeGen2SharedKeyParamPatch parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataLakeGen2SharedKeyCredentialPatch setDataSourceCredentialName(String dataSourceCredentialName) {
        super.setDataSourceCredentialName(dataSourceCredentialName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataLakeGen2SharedKeyCredentialPatch
        setDataSourceCredentialDescription(String dataSourceCredentialDescription) {
        super.setDataSourceCredentialDescription(dataSourceCredentialDescription);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("dataSourceCredentialType",
            Objects.toString(DataSourceCredentialType.DATA_LAKE_GEN2SHARED_KEY, null));
        jsonWriter.writeStringField("dataSourceCredentialName", getDataSourceCredentialName());
        jsonWriter.writeStringField("dataSourceCredentialDescription", getDataSourceCredentialDescription());
        jsonWriter.writeJsonField("parameters", this.parameters);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataLakeGen2SharedKeyCredentialPatch from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataLakeGen2SharedKeyCredentialPatch if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing the polymorphic discriminator.
     * @throws IOException If an error occurs while reading the DataLakeGen2SharedKeyCredentialPatch.
     */
    public static DataLakeGen2SharedKeyCredentialPatch fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataLakeGen2SharedKeyCredentialPatch deserializedDataLakeGen2SharedKeyCredentialPatch
                = new DataLakeGen2SharedKeyCredentialPatch();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dataSourceCredentialType".equals(fieldName)) {
                    String dataSourceCredentialType = reader.getString();
                    if (!"DataLakeGen2SharedKey".equals(dataSourceCredentialType)) {
                        throw new IllegalStateException(
                            "'dataSourceCredentialType' was expected to be non-null and equal to 'DataLakeGen2SharedKey'. The found 'dataSourceCredentialType' was '"
                                + dataSourceCredentialType + "'.");
                    }
                } else if ("dataSourceCredentialName".equals(fieldName)) {
                    deserializedDataLakeGen2SharedKeyCredentialPatch.setDataSourceCredentialName(reader.getString());
                } else if ("dataSourceCredentialDescription".equals(fieldName)) {
                    deserializedDataLakeGen2SharedKeyCredentialPatch
                        .setDataSourceCredentialDescription(reader.getString());
                } else if ("parameters".equals(fieldName)) {
                    deserializedDataLakeGen2SharedKeyCredentialPatch.parameters
                        = DataLakeGen2SharedKeyParamPatch.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataLakeGen2SharedKeyCredentialPatch;
        });
    }
}
