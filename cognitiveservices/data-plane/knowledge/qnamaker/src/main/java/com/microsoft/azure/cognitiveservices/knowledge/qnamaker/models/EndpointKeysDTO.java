/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Schema for EndpointKeys generate/refresh operations.
 */
public class EndpointKeysDTO {
    /**
     * Primary Access Key.
     */
    @JsonProperty(value = "primaryEndpointKey")
    private String primaryEndpointKey;

    /**
     * Secondary Access Key.
     */
    @JsonProperty(value = "secondaryEndpointKey")
    private String secondaryEndpointKey;

    /**
     * Current version of runtime.
     */
    @JsonProperty(value = "installedVersion")
    private String installedVersion;

    /**
     * Latest version of runtime.
     */
    @JsonProperty(value = "lastStableVersion")
    private String lastStableVersion;

    /**
     * Get primary Access Key.
     *
     * @return the primaryEndpointKey value
     */
    public String primaryEndpointKey() {
        return this.primaryEndpointKey;
    }

    /**
     * Set primary Access Key.
     *
     * @param primaryEndpointKey the primaryEndpointKey value to set
     * @return the EndpointKeysDTO object itself.
     */
    public EndpointKeysDTO withPrimaryEndpointKey(String primaryEndpointKey) {
        this.primaryEndpointKey = primaryEndpointKey;
        return this;
    }

    /**
     * Get secondary Access Key.
     *
     * @return the secondaryEndpointKey value
     */
    public String secondaryEndpointKey() {
        return this.secondaryEndpointKey;
    }

    /**
     * Set secondary Access Key.
     *
     * @param secondaryEndpointKey the secondaryEndpointKey value to set
     * @return the EndpointKeysDTO object itself.
     */
    public EndpointKeysDTO withSecondaryEndpointKey(String secondaryEndpointKey) {
        this.secondaryEndpointKey = secondaryEndpointKey;
        return this;
    }

    /**
     * Get current version of runtime.
     *
     * @return the installedVersion value
     */
    public String installedVersion() {
        return this.installedVersion;
    }

    /**
     * Set current version of runtime.
     *
     * @param installedVersion the installedVersion value to set
     * @return the EndpointKeysDTO object itself.
     */
    public EndpointKeysDTO withInstalledVersion(String installedVersion) {
        this.installedVersion = installedVersion;
        return this;
    }

    /**
     * Get latest version of runtime.
     *
     * @return the lastStableVersion value
     */
    public String lastStableVersion() {
        return this.lastStableVersion;
    }

    /**
     * Set latest version of runtime.
     *
     * @param lastStableVersion the lastStableVersion value to set
     * @return the EndpointKeysDTO object itself.
     */
    public EndpointKeysDTO withLastStableVersion(String lastStableVersion) {
        this.lastStableVersion = lastStableVersion;
        return this;
    }

}