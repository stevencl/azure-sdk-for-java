/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_06_01.implementation;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The configuration of service URI and custom headers for the webhook.
 */
public class CallbackConfigInner {
    /**
     * The service URI for the webhook to post notifications.
     */
    @JsonProperty(value = "serviceUri", required = true)
    private String serviceUri;

    /**
     * Custom headers that will be added to the webhook notifications.
     */
    @JsonProperty(value = "customHeaders")
    private Map<String, String> customHeaders;

    /**
     * Get the service URI for the webhook to post notifications.
     *
     * @return the serviceUri value
     */
    public String serviceUri() {
        return this.serviceUri;
    }

    /**
     * Set the service URI for the webhook to post notifications.
     *
     * @param serviceUri the serviceUri value to set
     * @return the CallbackConfigInner object itself.
     */
    public CallbackConfigInner withServiceUri(String serviceUri) {
        this.serviceUri = serviceUri;
        return this;
    }

    /**
     * Get custom headers that will be added to the webhook notifications.
     *
     * @return the customHeaders value
     */
    public Map<String, String> customHeaders() {
        return this.customHeaders;
    }

    /**
     * Set custom headers that will be added to the webhook notifications.
     *
     * @param customHeaders the customHeaders value to set
     * @return the CallbackConfigInner object itself.
     */
    public CallbackConfigInner withCustomHeaders(Map<String, String> customHeaders) {
        this.customHeaders = customHeaders;
        return this;
    }

}