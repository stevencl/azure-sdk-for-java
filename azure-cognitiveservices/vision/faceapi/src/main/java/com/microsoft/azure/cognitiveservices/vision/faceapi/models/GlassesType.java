/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for GlassesType.
 */
public enum GlassesType {
    /** Enum value noGlasses. */
    NO_GLASSES("noGlasses"),

    /** Enum value readingGlasses. */
    READING_GLASSES("readingGlasses"),

    /** Enum value sunglasses. */
    SUNGLASSES("sunglasses"),

    /** Enum value swimmingGoggles. */
    SWIMMING_GOGGLES("swimmingGoggles");

    /** The actual serialized value for a GlassesType instance. */
    private String value;

    GlassesType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a GlassesType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed GlassesType object, or null if unable to parse.
     */
    @JsonCreator
    public static GlassesType fromString(String value) {
        GlassesType[] items = GlassesType.values();
        for (GlassesType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}