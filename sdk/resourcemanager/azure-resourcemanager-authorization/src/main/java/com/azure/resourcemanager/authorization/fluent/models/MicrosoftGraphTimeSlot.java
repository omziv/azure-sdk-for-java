// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** timeSlot. */
@Fluent
public final class MicrosoftGraphTimeSlot {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphTimeSlot.class);

    /*
     * dateTimeTimeZone
     */
    @JsonProperty(value = "end")
    private MicrosoftGraphDateTimeZone end;

    /*
     * dateTimeTimeZone
     */
    @JsonProperty(value = "start")
    private MicrosoftGraphDateTimeZone start;

    /*
     * timeSlot
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the end property: dateTimeTimeZone.
     *
     * @return the end value.
     */
    public MicrosoftGraphDateTimeZone end() {
        return this.end;
    }

    /**
     * Set the end property: dateTimeTimeZone.
     *
     * @param end the end value to set.
     * @return the MicrosoftGraphTimeSlot object itself.
     */
    public MicrosoftGraphTimeSlot withEnd(MicrosoftGraphDateTimeZone end) {
        this.end = end;
        return this;
    }

    /**
     * Get the start property: dateTimeTimeZone.
     *
     * @return the start value.
     */
    public MicrosoftGraphDateTimeZone start() {
        return this.start;
    }

    /**
     * Set the start property: dateTimeTimeZone.
     *
     * @param start the start value to set.
     * @return the MicrosoftGraphTimeSlot object itself.
     */
    public MicrosoftGraphTimeSlot withStart(MicrosoftGraphDateTimeZone start) {
        this.start = start;
        return this;
    }

    /**
     * Get the additionalProperties property: timeSlot.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: timeSlot.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphTimeSlot object itself.
     */
    public MicrosoftGraphTimeSlot withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (end() != null) {
            end().validate();
        }
        if (start() != null) {
            start().validate();
        }
    }
}