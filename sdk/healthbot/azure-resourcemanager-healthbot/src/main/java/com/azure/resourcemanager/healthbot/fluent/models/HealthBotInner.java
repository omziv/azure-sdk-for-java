// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthbot.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.healthbot.models.HealthBotProperties;
import com.azure.resourcemanager.healthbot.models.Sku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** HealthBot resource definition. */
@Fluent
public final class HealthBotInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HealthBotInner.class);

    /*
     * SKU of the HealthBot.
     */
    @JsonProperty(value = "sku", required = true)
    private Sku sku;

    /*
     * The set of properties specific to Healthbot resource.
     */
    @JsonProperty(value = "properties")
    private HealthBotProperties properties;

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
     * @return the HealthBotInner object itself.
     */
    public HealthBotInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the properties property: The set of properties specific to Healthbot resource.
     *
     * @return the properties value.
     */
    public HealthBotProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The set of properties specific to Healthbot resource.
     *
     * @param properties the properties value to set.
     * @return the HealthBotInner object itself.
     */
    public HealthBotInner withProperties(HealthBotProperties properties) {
        this.properties = properties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HealthBotInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HealthBotInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sku in model HealthBotInner"));
        } else {
            sku().validate();
        }
        if (properties() != null) {
            properties().validate();
        }
    }
}