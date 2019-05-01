/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.formrecognizer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ErrorInformation model.
 */
public class ErrorInformation {
    /**
     * The code property.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * The innerError property.
     */
    @JsonProperty(value = "innerError")
    private InnerError innerError;

    /**
     * The message property.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code value.
     *
     * @param code the code value to set
     * @return the ErrorInformation object itself.
     */
    public ErrorInformation withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the innerError value.
     *
     * @return the innerError value
     */
    public InnerError innerError() {
        return this.innerError;
    }

    /**
     * Set the innerError value.
     *
     * @param innerError the innerError value to set
     * @return the ErrorInformation object itself.
     */
    public ErrorInformation withInnerError(InnerError innerError) {
        this.innerError = innerError;
        return this;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     * @return the ErrorInformation object itself.
     */
    public ErrorInformation withMessage(String message) {
        this.message = message;
        return this;
    }

}