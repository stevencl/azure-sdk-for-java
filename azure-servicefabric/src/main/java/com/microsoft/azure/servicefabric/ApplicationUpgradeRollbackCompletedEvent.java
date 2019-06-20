/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.servicefabric.implementation.ApplicationEventInner;

/**
 * Application Upgrade Rollback Completed event.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ApplicationUpgradeRollbackCompleted")
public class ApplicationUpgradeRollbackCompletedEvent extends ApplicationEventInner {
    /**
     * Application type name.
     */
    @JsonProperty(value = "ApplicationTypeName", required = true)
    private String applicationTypeName;

    /**
     * Application type version.
     */
    @JsonProperty(value = "ApplicationTypeVersion", required = true)
    private String applicationTypeVersion;

    /**
     * Describes reason of failure.
     */
    @JsonProperty(value = "FailureReason", required = true)
    private String failureReason;

    /**
     * Overall upgrade time in milli-seconds.
     */
    @JsonProperty(value = "OverallUpgradeElapsedTimeInMs", required = true)
    private double overallUpgradeElapsedTimeInMs;

    /**
     * Get application type name.
     *
     * @return the applicationTypeName value
     */
    public String applicationTypeName() {
        return this.applicationTypeName;
    }

    /**
     * Set application type name.
     *
     * @param applicationTypeName the applicationTypeName value to set
     * @return the ApplicationUpgradeRollbackCompletedEvent object itself.
     */
    public ApplicationUpgradeRollbackCompletedEvent withApplicationTypeName(String applicationTypeName) {
        this.applicationTypeName = applicationTypeName;
        return this;
    }

    /**
     * Get application type version.
     *
     * @return the applicationTypeVersion value
     */
    public String applicationTypeVersion() {
        return this.applicationTypeVersion;
    }

    /**
     * Set application type version.
     *
     * @param applicationTypeVersion the applicationTypeVersion value to set
     * @return the ApplicationUpgradeRollbackCompletedEvent object itself.
     */
    public ApplicationUpgradeRollbackCompletedEvent withApplicationTypeVersion(String applicationTypeVersion) {
        this.applicationTypeVersion = applicationTypeVersion;
        return this;
    }

    /**
     * Get describes reason of failure.
     *
     * @return the failureReason value
     */
    public String failureReason() {
        return this.failureReason;
    }

    /**
     * Set describes reason of failure.
     *
     * @param failureReason the failureReason value to set
     * @return the ApplicationUpgradeRollbackCompletedEvent object itself.
     */
    public ApplicationUpgradeRollbackCompletedEvent withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * Get overall upgrade time in milli-seconds.
     *
     * @return the overallUpgradeElapsedTimeInMs value
     */
    public double overallUpgradeElapsedTimeInMs() {
        return this.overallUpgradeElapsedTimeInMs;
    }

    /**
     * Set overall upgrade time in milli-seconds.
     *
     * @param overallUpgradeElapsedTimeInMs the overallUpgradeElapsedTimeInMs value to set
     * @return the ApplicationUpgradeRollbackCompletedEvent object itself.
     */
    public ApplicationUpgradeRollbackCompletedEvent withOverallUpgradeElapsedTimeInMs(double overallUpgradeElapsedTimeInMs) {
        this.overallUpgradeElapsedTimeInMs = overallUpgradeElapsedTimeInMs;
        return this;
    }

}