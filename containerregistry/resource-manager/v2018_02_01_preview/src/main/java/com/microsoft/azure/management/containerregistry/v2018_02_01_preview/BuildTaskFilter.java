/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_02_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The filter that can be used for listing build tasks.
 */
public class BuildTaskFilter {
    /**
     * The alternative name for build task.
     */
    @JsonProperty(value = "alias")
    private String alias;

    /**
     * Get the alternative name for build task.
     *
     * @return the alias value
     */
    public String alias() {
        return this.alias;
    }

    /**
     * Set the alternative name for build task.
     *
     * @param alias the alias value to set
     * @return the BuildTaskFilter object itself.
     */
    public BuildTaskFilter withAlias(String alias) {
        this.alias = alias;
        return this;
    }

}
