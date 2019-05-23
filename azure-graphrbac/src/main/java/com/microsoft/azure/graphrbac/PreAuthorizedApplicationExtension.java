/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.graphrbac;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Representation of an app PreAuthorizedApplicationExtension required by a pre
 * authorized client app.
 */
public class PreAuthorizedApplicationExtension {
    /**
     * The extension's conditions.
     */
    @JsonProperty(value = "conditions")
    private List<String> conditions;

    /**
     * Get the extension's conditions.
     *
     * @return the conditions value
     */
    public List<String> conditions() {
        return this.conditions;
    }

    /**
     * Set the extension's conditions.
     *
     * @param conditions the conditions value to set
     * @return the PreAuthorizedApplicationExtension object itself.
     */
    public PreAuthorizedApplicationExtension withConditions(List<String> conditions) {
        this.conditions = conditions;
        return this;
    }

}