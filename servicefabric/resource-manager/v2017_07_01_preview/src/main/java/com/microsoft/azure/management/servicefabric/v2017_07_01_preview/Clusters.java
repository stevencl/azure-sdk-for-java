/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2017_07_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.servicefabric.v2017_07_01_preview.implementation.ClustersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Clusters.
 */
public interface Clusters extends SupportsCreating<Cluster.DefinitionStages.Blank>, HasInner<ClustersInner> {
    /**
     * Delete cluster resource.
     * Delete cluster resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource
     * @param subscriptionId The customer subscription identifier
     * @param apiVersion The version of the API.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String clusterName, String subscriptionId, String apiVersion);

    /**
     * Get cluster resource.
     * Get cluster resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource
     * @param subscriptionId The customer subscription identifier
     * @param apiVersion The version of the API.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Cluster> getByResourceGroupAsync(String resourceGroupName, String clusterName, String subscriptionId, String apiVersion);

    /**
     * List cluster resource by resource group.
     * List cluster resource by resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param subscriptionId The customer subscription identifier
     * @param apiVersion The version of the API.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Cluster> listByResourceGroupAsync(String resourceGroupName, String subscriptionId, String apiVersion);

    /**
     * List cluster resource.
     * List cluster resource.
     *
     * @param subscriptionId The customer subscription identifier
     * @param apiVersion The version of the API.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Cluster> listAsync(String subscriptionId, String apiVersion);

}