/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.programmatic.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Model Training Details.
 */
public class ModelTrainingDetails {
    /**
     * The train request status ID.
     */
    @JsonProperty(value = "statusId")
    private Integer statusId;

    /**
     * Possible values include: 'Queued', 'InProgress', 'UpToDate', 'Fail',
     * 'Success'.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * The count of examples used to train the model.
     */
    @JsonProperty(value = "exampleCount")
    private Integer exampleCount;

    /**
     * When the model was trained.
     */
    @JsonProperty(value = "trainingDateTime")
    private DateTime trainingDateTime;

    /**
     * Reason for the training failure.
     */
    @JsonProperty(value = "failureReason")
    private String failureReason;

    /**
     * Get the statusId value.
     *
     * @return the statusId value
     */
    public Integer statusId() {
        return this.statusId;
    }

    /**
     * Set the statusId value.
     *
     * @param statusId the statusId value to set
     * @return the ModelTrainingDetails object itself.
     */
    public ModelTrainingDetails withStatusId(Integer statusId) {
        this.statusId = statusId;
        return this;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     * @return the ModelTrainingDetails object itself.
     */
    public ModelTrainingDetails withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the exampleCount value.
     *
     * @return the exampleCount value
     */
    public Integer exampleCount() {
        return this.exampleCount;
    }

    /**
     * Set the exampleCount value.
     *
     * @param exampleCount the exampleCount value to set
     * @return the ModelTrainingDetails object itself.
     */
    public ModelTrainingDetails withExampleCount(Integer exampleCount) {
        this.exampleCount = exampleCount;
        return this;
    }

    /**
     * Get the trainingDateTime value.
     *
     * @return the trainingDateTime value
     */
    public DateTime trainingDateTime() {
        return this.trainingDateTime;
    }

    /**
     * Set the trainingDateTime value.
     *
     * @param trainingDateTime the trainingDateTime value to set
     * @return the ModelTrainingDetails object itself.
     */
    public ModelTrainingDetails withTrainingDateTime(DateTime trainingDateTime) {
        this.trainingDateTime = trainingDateTime;
        return this;
    }

    /**
     * Get the failureReason value.
     *
     * @return the failureReason value
     */
    public String failureReason() {
        return this.failureReason;
    }

    /**
     * Set the failureReason value.
     *
     * @param failureReason the failureReason value to set
     * @return the ModelTrainingDetails object itself.
     */
    public ModelTrainingDetails withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

}