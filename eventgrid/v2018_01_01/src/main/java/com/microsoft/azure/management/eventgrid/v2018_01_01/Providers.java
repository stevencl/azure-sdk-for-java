/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2018_01_01;

import com.microsoft.azure.management.eventgrid.v2018_01_01.implementation.TopicsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Providers.
 */
public interface Providers extends HasInner<TopicsInner> {

    /**
     * @return Entry point to manage Provider EventType.
     */
    ProviderEventTypes eventTypes();
}
