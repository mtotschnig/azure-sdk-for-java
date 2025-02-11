// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The request payload for holding participant from the call. */
@Fluent
public final class StartHoldMusicRequestInternal {
    /*
     * Participant to be held from the call.
     */
    @JsonProperty(value = "targetParticipant", required = true)
    private CommunicationIdentifierModel targetParticipant;

    /*
     * Prompt to play while in hold.
     */
    @JsonProperty(value = "playSourceInfo", required = true)
    private PlaySourceInternal playSourceInfo;

    /*
     * If the prompt will be looped or not.
     */
    @JsonProperty(value = "loop")
    private Boolean loop;

    /*
     * Used by customers when calling mid-call actions to correlate the request
     * to the response event.
     */
    @JsonProperty(value = "operationContext")
    private String operationContext;

    /**
     * Get the targetParticipant property: Participant to be held from the call.
     *
     * @return the targetParticipant value.
     */
    public CommunicationIdentifierModel getTargetParticipant() {
        return this.targetParticipant;
    }

    /**
     * Set the targetParticipant property: Participant to be held from the call.
     *
     * @param targetParticipant the targetParticipant value to set.
     * @return the StartHoldMusicRequestInternal object itself.
     */
    public StartHoldMusicRequestInternal setTargetParticipant(CommunicationIdentifierModel targetParticipant) {
        this.targetParticipant = targetParticipant;
        return this;
    }

    /**
     * Get the playSourceInfo property: Prompt to play while in hold.
     *
     * @return the playSourceInfo value.
     */
    public PlaySourceInternal getPlaySourceInfo() {
        return this.playSourceInfo;
    }

    /**
     * Set the playSourceInfo property: Prompt to play while in hold.
     *
     * @param playSourceInfo the playSourceInfo value to set.
     * @return the StartHoldMusicRequestInternal object itself.
     */
    public StartHoldMusicRequestInternal setPlaySourceInfo(PlaySourceInternal playSourceInfo) {
        this.playSourceInfo = playSourceInfo;
        return this;
    }

    /**
     * Get the loop property: If the prompt will be looped or not.
     *
     * @return the loop value.
     */
    public Boolean isLoop() {
        return this.loop;
    }

    /**
     * Set the loop property: If the prompt will be looped or not.
     *
     * @param loop the loop value to set.
     * @return the StartHoldMusicRequestInternal object itself.
     */
    public StartHoldMusicRequestInternal setLoop(Boolean loop) {
        this.loop = loop;
        return this;
    }

    /**
     * Get the operationContext property: Used by customers when calling mid-call actions to correlate the request to
     * the response event.
     *
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return this.operationContext;
    }

    /**
     * Set the operationContext property: Used by customers when calling mid-call actions to correlate the request to
     * the response event.
     *
     * @param operationContext the operationContext value to set.
     * @return the StartHoldMusicRequestInternal object itself.
     */
    public StartHoldMusicRequestInternal setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }
}
