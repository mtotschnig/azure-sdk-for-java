// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.QuotaUsageInner;

/** An immutable client-side representation of QuotaUsage. */
public interface QuotaUsage {
    /**
     * Gets the name property: Name of quota usage for flexible servers.
     *
     * @return the name value.
     */
    NameProperty name();

    /**
     * Gets the limit property: Quota limit.
     *
     * @return the limit value.
     */
    Long limit();

    /**
     * Gets the unit property: Quota unit.
     *
     * @return the unit value.
     */
    String unit();

    /**
     * Gets the currentValue property: Current Quota usage value.
     *
     * @return the currentValue value.
     */
    Long currentValue();

    /**
     * Gets the id property: Fully qualified ARM resource Id.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the inner com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.QuotaUsageInner object.
     *
     * @return the inner object.
     */
    QuotaUsageInner innerModel();
}
