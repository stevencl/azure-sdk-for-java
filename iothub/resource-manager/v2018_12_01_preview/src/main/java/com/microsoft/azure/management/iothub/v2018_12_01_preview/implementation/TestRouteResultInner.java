/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_12_01_preview.implementation;

import com.microsoft.azure.management.iothub.v2018_12_01_preview.TestResultStatus;
import com.microsoft.azure.management.iothub.v2018_12_01_preview.TestRouteResultDetails;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Result of testing one route.
 */
public class TestRouteResultInner {
    /**
     * Result of testing route. Possible values include: 'undefined', 'false',
     * 'true'.
     */
    @JsonProperty(value = "result")
    private TestResultStatus result;

    /**
     * Detailed result of testing route.
     */
    @JsonProperty(value = "details")
    private TestRouteResultDetails details;

    /**
     * Get result of testing route. Possible values include: 'undefined', 'false', 'true'.
     *
     * @return the result value
     */
    public TestResultStatus result() {
        return this.result;
    }

    /**
     * Set result of testing route. Possible values include: 'undefined', 'false', 'true'.
     *
     * @param result the result value to set
     * @return the TestRouteResultInner object itself.
     */
    public TestRouteResultInner withResult(TestResultStatus result) {
        this.result = result;
        return this;
    }

    /**
     * Get detailed result of testing route.
     *
     * @return the details value
     */
    public TestRouteResultDetails details() {
        return this.details;
    }

    /**
     * Set detailed result of testing route.
     *
     * @param details the details value to set
     * @return the TestRouteResultInner object itself.
     */
    public TestRouteResultInner withDetails(TestRouteResultDetails details) {
        this.details = details;
        return this;
    }

}
