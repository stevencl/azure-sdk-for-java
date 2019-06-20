/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2017_07_01_preview.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.servicefabric.v2017_07_01_preview.Clusters;
import com.microsoft.azure.management.servicefabric.v2017_07_01_preview.ClusterVersions;
import com.microsoft.azure.management.servicefabric.v2017_07_01_preview.Operations;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure ServiceFabric resource management.
 */
public final class ServiceFabricManager extends ManagerCore<ServiceFabricManager, ServiceFabricManagementClientImpl> {
    private Clusters clusters;
    private ClusterVersions clusterVersions;
    private Operations operations;
    /**
    * Get a Configurable instance that can be used to create ServiceFabricManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new ServiceFabricManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of ServiceFabricManager that exposes ServiceFabric resource management API entry points.
    *
    * @param credentials the credentials to use
    * @return the ServiceFabricManager
    */
    public static ServiceFabricManager authenticate(AzureTokenCredentials credentials) {
        return new ServiceFabricManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build());
    }
    /**
    * Creates an instance of ServiceFabricManager that exposes ServiceFabric resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @return the ServiceFabricManager
    */
    public static ServiceFabricManager authenticate(RestClient restClient) {
        return new ServiceFabricManager(restClient);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of ServiceFabricManager that exposes ServiceFabric management API entry points.
        *
        * @param credentials the credentials to use
        * @return the interface exposing ServiceFabric management API entry points that work across subscriptions
        */
        ServiceFabricManager authenticate(AzureTokenCredentials credentials);
    }

    /**
     * @return Entry point to manage Clusters.
     */
    public Clusters clusters() {
        if (this.clusters == null) {
            this.clusters = new ClustersImpl(this);
        }
        return this.clusters;
    }

    /**
     * @return Entry point to manage ClusterVersions.
     */
    public ClusterVersions clusterVersions() {
        if (this.clusterVersions == null) {
            this.clusterVersions = new ClusterVersionsImpl(this);
        }
        return this.clusterVersions;
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public ServiceFabricManager authenticate(AzureTokenCredentials credentials) {
           return ServiceFabricManager.authenticate(buildRestClient(credentials));
        }
     }
    private ServiceFabricManager(RestClient restClient) {
        super(
            restClient,
            null,
            new ServiceFabricManagementClientImpl(restClient));
    }
}