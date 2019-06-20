/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes a Service Fabric property value of type Binary.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Binary")
public class BinaryPropertyValue extends PropertyValue {
    /**
     * Array of bytes to be sent as an integer array. Each element of array is
     * a number between 0 and 255.
     */
    @JsonProperty(value = "Data", required = true)
    private List<Integer> data;

    /**
     * Get array of bytes to be sent as an integer array. Each element of array is a number between 0 and 255.
     *
     * @return the data value
     */
    public List<Integer> data() {
        return this.data;
    }

    /**
     * Set array of bytes to be sent as an integer array. Each element of array is a number between 0 and 255.
     *
     * @param data the data value to set
     * @return the BinaryPropertyValue object itself.
     */
    public BinaryPropertyValue withData(List<Integer> data) {
        this.data = data;
        return this;
    }

}