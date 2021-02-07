/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Describes a Service Bus Queue output data source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = ServiceBusQueueOutputDataSource.class)
@JsonTypeName("Microsoft.ServiceBus/Queue")
@JsonFlatten
public class ServiceBusQueueOutputDataSource extends OutputDataSource {
    /**
     * The namespace that is associated with the desired Event Hub, Service Bus
     * Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace)
     * requests.
     */
    @JsonProperty(value = "properties.serviceBusNamespace")
    private String serviceBusNamespace;

    /**
     * The shared access policy name for the Event Hub, Service Bus Queue,
     * Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties.sharedAccessPolicyName")
    private String sharedAccessPolicyName;

    /**
     * The shared access policy key for the specified shared access policy.
     * Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties.sharedAccessPolicyKey")
    private String sharedAccessPolicyKey;

    /**
     * Authentication Mode. Possible values include: 'Msi', 'UserToken',
     * 'ConnectionString'.
     */
    @JsonProperty(value = "properties.authenticationMode")
    private AuthenticationMode authenticationMode;

    /**
     * The name of the Service Bus Queue. Required on PUT (CreateOrReplace)
     * requests.
     */
    @JsonProperty(value = "properties.queueName")
    private String queueName;

    /**
     * A string array of the names of output columns to be attached to Service
     * Bus messages as custom properties.
     */
    @JsonProperty(value = "properties.propertyColumns")
    private List<String> propertyColumns;

    /**
     * The systemPropertyColumns property.
     */
    @JsonProperty(value = "properties.systemPropertyColumns")
    private Map<String, String> systemPropertyColumns;

    /**
     * Get the namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     *
     * @return the serviceBusNamespace value
     */
    public String serviceBusNamespace() {
        return this.serviceBusNamespace;
    }

    /**
     * Set the namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     *
     * @param serviceBusNamespace the serviceBusNamespace value to set
     * @return the ServiceBusQueueOutputDataSource object itself.
     */
    public ServiceBusQueueOutputDataSource withServiceBusNamespace(String serviceBusNamespace) {
        this.serviceBusNamespace = serviceBusNamespace;
        return this;
    }

    /**
     * Get the shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     *
     * @return the sharedAccessPolicyName value
     */
    public String sharedAccessPolicyName() {
        return this.sharedAccessPolicyName;
    }

    /**
     * Set the shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     *
     * @param sharedAccessPolicyName the sharedAccessPolicyName value to set
     * @return the ServiceBusQueueOutputDataSource object itself.
     */
    public ServiceBusQueueOutputDataSource withSharedAccessPolicyName(String sharedAccessPolicyName) {
        this.sharedAccessPolicyName = sharedAccessPolicyName;
        return this;
    }

    /**
     * Get the shared access policy key for the specified shared access policy. Required on PUT (CreateOrReplace) requests.
     *
     * @return the sharedAccessPolicyKey value
     */
    public String sharedAccessPolicyKey() {
        return this.sharedAccessPolicyKey;
    }

    /**
     * Set the shared access policy key for the specified shared access policy. Required on PUT (CreateOrReplace) requests.
     *
     * @param sharedAccessPolicyKey the sharedAccessPolicyKey value to set
     * @return the ServiceBusQueueOutputDataSource object itself.
     */
    public ServiceBusQueueOutputDataSource withSharedAccessPolicyKey(String sharedAccessPolicyKey) {
        this.sharedAccessPolicyKey = sharedAccessPolicyKey;
        return this;
    }

    /**
     * Get authentication Mode. Possible values include: 'Msi', 'UserToken', 'ConnectionString'.
     *
     * @return the authenticationMode value
     */
    public AuthenticationMode authenticationMode() {
        return this.authenticationMode;
    }

    /**
     * Set authentication Mode. Possible values include: 'Msi', 'UserToken', 'ConnectionString'.
     *
     * @param authenticationMode the authenticationMode value to set
     * @return the ServiceBusQueueOutputDataSource object itself.
     */
    public ServiceBusQueueOutputDataSource withAuthenticationMode(AuthenticationMode authenticationMode) {
        this.authenticationMode = authenticationMode;
        return this;
    }

    /**
     * Get the name of the Service Bus Queue. Required on PUT (CreateOrReplace) requests.
     *
     * @return the queueName value
     */
    public String queueName() {
        return this.queueName;
    }

    /**
     * Set the name of the Service Bus Queue. Required on PUT (CreateOrReplace) requests.
     *
     * @param queueName the queueName value to set
     * @return the ServiceBusQueueOutputDataSource object itself.
     */
    public ServiceBusQueueOutputDataSource withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * Get a string array of the names of output columns to be attached to Service Bus messages as custom properties.
     *
     * @return the propertyColumns value
     */
    public List<String> propertyColumns() {
        return this.propertyColumns;
    }

    /**
     * Set a string array of the names of output columns to be attached to Service Bus messages as custom properties.
     *
     * @param propertyColumns the propertyColumns value to set
     * @return the ServiceBusQueueOutputDataSource object itself.
     */
    public ServiceBusQueueOutputDataSource withPropertyColumns(List<String> propertyColumns) {
        this.propertyColumns = propertyColumns;
        return this;
    }

    /**
     * Get the systemPropertyColumns value.
     *
     * @return the systemPropertyColumns value
     */
    public Map<String, String> systemPropertyColumns() {
        return this.systemPropertyColumns;
    }

    /**
     * Set the systemPropertyColumns value.
     *
     * @param systemPropertyColumns the systemPropertyColumns value to set
     * @return the ServiceBusQueueOutputDataSource object itself.
     */
    public ServiceBusQueueOutputDataSource withSystemPropertyColumns(Map<String, String> systemPropertyColumns) {
        this.systemPropertyColumns = systemPropertyColumns;
        return this;
    }

}