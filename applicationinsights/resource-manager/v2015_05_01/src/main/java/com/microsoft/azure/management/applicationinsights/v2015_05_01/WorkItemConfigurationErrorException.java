/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01;

import com.microsoft.rest.RestException;
import okhttp3.ResponseBody;
import retrofit2.Response;

/**
 * Exception thrown for an invalid response with WorkItemConfigurationError
 * information.
 */
public class WorkItemConfigurationErrorException extends RestException {
    /**
     * Initializes a new instance of the WorkItemConfigurationErrorException class.
     *
     * @param message the exception message or the response content if a message is not available
     * @param response the HTTP response
     */
    public WorkItemConfigurationErrorException(final String message, final Response<ResponseBody> response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the WorkItemConfigurationErrorException class.
     *
     * @param message the exception message or the response content if a message is not available
     * @param response the HTTP response
     * @param body the deserialized response body
     */
    public WorkItemConfigurationErrorException(final String message, final Response<ResponseBody> response, final WorkItemConfigurationError body) {
        super(message, response, body);
    }

    @Override
    public WorkItemConfigurationError body() {
        return (WorkItemConfigurationError) super.body();
    }
}
