// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ReportGranularityType. */
public final class ReportGranularityType extends ExpandableStringEnum<ReportGranularityType> {
    /** Static value Daily for ReportGranularityType. */
    public static final ReportGranularityType DAILY = fromString("Daily");

    /** Static value Monthly for ReportGranularityType. */
    public static final ReportGranularityType MONTHLY = fromString("Monthly");

    /**
     * Creates or finds a ReportGranularityType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ReportGranularityType.
     */
    @JsonCreator
    public static ReportGranularityType fromString(String name) {
        return fromString(name, ReportGranularityType.class);
    }

    /** @return known ReportGranularityType values. */
    public static Collection<ReportGranularityType> values() {
        return values(ReportGranularityType.class);
    }
}