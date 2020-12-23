// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ClusterEntityStatus. */
public final class ClusterEntityStatus extends ExpandableStringEnum<ClusterEntityStatus> {
    /** Static value Creating for ClusterEntityStatus. */
    public static final ClusterEntityStatus CREATING = fromString("Creating");

    /** Static value Succeeded for ClusterEntityStatus. */
    public static final ClusterEntityStatus SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for ClusterEntityStatus. */
    public static final ClusterEntityStatus FAILED = fromString("Failed");

    /** Static value Canceled for ClusterEntityStatus. */
    public static final ClusterEntityStatus CANCELED = fromString("Canceled");

    /** Static value Deleting for ClusterEntityStatus. */
    public static final ClusterEntityStatus DELETING = fromString("Deleting");

    /** Static value ProvisioningAccount for ClusterEntityStatus. */
    public static final ClusterEntityStatus PROVISIONING_ACCOUNT = fromString("ProvisioningAccount");

    /** Static value Updating for ClusterEntityStatus. */
    public static final ClusterEntityStatus UPDATING = fromString("Updating");

    /**
     * Creates or finds a ClusterEntityStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ClusterEntityStatus.
     */
    @JsonCreator
    public static ClusterEntityStatus fromString(String name) {
        return fromString(name, ClusterEntityStatus.class);
    }

    /** @return known ClusterEntityStatus values. */
    public static Collection<ClusterEntityStatus> values() {
        return values(ClusterEntityStatus.class);
    }
}