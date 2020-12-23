/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_11_01_preview.implementation;

import com.microsoft.azure.management.appplatform.v2020_11_01_preview.MonitoringSettingProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.ProxyResource;

/**
 * Monitoring Setting resource.
 */
public class MonitoringSettingResourceInner extends ProxyResource {
    /**
     * Properties of the Monitoring Setting resource.
     */
    @JsonProperty(value = "properties")
    private MonitoringSettingProperties properties;

    /**
     * Get properties of the Monitoring Setting resource.
     *
     * @return the properties value
     */
    public MonitoringSettingProperties properties() {
        return this.properties;
    }

    /**
     * Set properties of the Monitoring Setting resource.
     *
     * @param properties the properties value to set
     * @return the MonitoringSettingResourceInner object itself.
     */
    public MonitoringSettingResourceInner withProperties(MonitoringSettingProperties properties) {
        this.properties = properties;
        return this;
    }

}