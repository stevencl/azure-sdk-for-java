/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.formrecognizer.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Canonical representation of single extracted text.
 */
public class ExtractedToken {
    /**
     * String value of the extracted text.
     */
    @JsonProperty(value = "text")
    private String text;

    /**
     * Bounding box of the extracted text. Represents the
     * location of the extracted text as a pair of
     * cartesian co-ordinates. The co-ordinate pairs are arranged by
     * top-left, top-right, bottom-right and bottom-left endpoints box
     * with origin reference from the bottom-left of the page.
     */
    @JsonProperty(value = "boundingBox")
    private List<Double> boundingBox;

    /**
     * A measure of accuracy of the extracted text.
     */
    @JsonProperty(value = "confidence")
    private Double confidence;

    /**
     * Get string value of the extracted text.
     *
     * @return the text value
     */
    public String text() {
        return this.text;
    }

    /**
     * Set string value of the extracted text.
     *
     * @param text the text value to set
     * @return the ExtractedToken object itself.
     */
    public ExtractedToken withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get bounding box of the extracted text. Represents the
     location of the extracted text as a pair of
     cartesian co-ordinates. The co-ordinate pairs are arranged by
     top-left, top-right, bottom-right and bottom-left endpoints box
     with origin reference from the bottom-left of the page.
     *
     * @return the boundingBox value
     */
    public List<Double> boundingBox() {
        return this.boundingBox;
    }

    /**
     * Set bounding box of the extracted text. Represents the
     location of the extracted text as a pair of
     cartesian co-ordinates. The co-ordinate pairs are arranged by
     top-left, top-right, bottom-right and bottom-left endpoints box
     with origin reference from the bottom-left of the page.
     *
     * @param boundingBox the boundingBox value to set
     * @return the ExtractedToken object itself.
     */
    public ExtractedToken withBoundingBox(List<Double> boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    /**
     * Get a measure of accuracy of the extracted text.
     *
     * @return the confidence value
     */
    public Double confidence() {
        return this.confidence;
    }

    /**
     * Set a measure of accuracy of the extracted text.
     *
     * @param confidence the confidence value to set
     * @return the ExtractedToken object itself.
     */
    public ExtractedToken withConfidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }

}