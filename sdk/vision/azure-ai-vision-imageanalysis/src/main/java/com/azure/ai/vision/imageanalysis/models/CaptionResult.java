// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.imageanalysis.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a generated phrase that describes the content of the whole image.
 */
@Immutable
public final class CaptionResult {

    /*
     * A score, in the range of 0 to 1 (inclusive), representing the confidence that this description is accurate.
     * Higher values indicating higher confidence.
     */
    @Generated
    @JsonProperty(value = "confidence")
    private double confidence;

    /*
     * The text of the caption.
     */
    @Generated
    @JsonProperty(value = "text")
    private String text;

    /**
     * Creates an instance of CaptionResult class.
     * 
     * @param confidence the confidence value to set.
     * @param text the text value to set.
     */
    @Generated
    @JsonCreator
    private CaptionResult(@JsonProperty(value = "confidence") double confidence,
        @JsonProperty(value = "text") String text) {
        this.confidence = confidence;
        this.text = text;
    }

    /**
     * Get the confidence property: A score, in the range of 0 to 1 (inclusive), representing the confidence that this
     * description is accurate.
     * Higher values indicating higher confidence.
     * 
     * @return the confidence value.
     */
    @Generated
    public double getConfidence() {
        return this.confidence;
    }

    /**
     * Get the text property: The text of the caption.
     * 
     * @return the text value.
     */
    @Generated
    public String getText() {
        return this.text;
    }
}
