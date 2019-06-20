/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a volume whose lifetime is scoped to the application's lifetime.
 */
public class ApplicationScopedVolume extends VolumeReference {
    /**
     * Describes parameters for creating application-scoped volumes.
     */
    @JsonProperty(value = "creationParameters", required = true)
    private ApplicationScopedVolumeCreationParameters creationParameters;

    /**
     * Get describes parameters for creating application-scoped volumes.
     *
     * @return the creationParameters value
     */
    public ApplicationScopedVolumeCreationParameters creationParameters() {
        return this.creationParameters;
    }

    /**
     * Set describes parameters for creating application-scoped volumes.
     *
     * @param creationParameters the creationParameters value to set
     * @return the ApplicationScopedVolume object itself.
     */
    public ApplicationScopedVolume withCreationParameters(ApplicationScopedVolumeCreationParameters creationParameters) {
        this.creationParameters = creationParameters;
        return this;
    }

}