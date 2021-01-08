// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthbot.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Parameters for updating a HealthBot. */
@Fluent
public final class HealthBotUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HealthBotUpdateParameters.class);

    /*
     * Tags for a HealthBot.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * SKU of the HealthBot.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * Get the tags property: Tags for a HealthBot.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Tags for a HealthBot.
     *
     * @param tags the tags value to set.
     * @return the HealthBotUpdateParameters object itself.
     */
    public HealthBotUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the sku property: SKU of the HealthBot.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: SKU of the HealthBot.
     *
     * @param sku the sku value to set.
     * @return the HealthBotUpdateParameters object itself.
     */
    public HealthBotUpdateParameters withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
    }
}