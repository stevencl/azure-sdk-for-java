/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2017_09_30.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ContainerServices.
 */
public class ContainerServicesInner {
    /** The Retrofit service to perform REST calls. */
    private ContainerServicesService service;
    /** The service client containing this operation class. */
    private ContainerServiceManagementClientImpl client;

    /**
     * Initializes an instance of ContainerServicesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ContainerServicesInner(Retrofit retrofit, ContainerServiceManagementClientImpl client) {
        this.service = retrofit.create(ContainerServicesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ContainerServices to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ContainerServicesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.containerservice.v2017_09_30.ContainerServices listOrchestrators" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.ContainerService/locations/{location}/orchestrators")
        Observable<Response<ResponseBody>> listOrchestrators(@Path("subscriptionId") String subscriptionId, @Path("location") String location, @Query("api-version") String apiVersion, @Query("resource-type") String resourceType, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a list of supported orchestrators in the specified subscription.
     * Gets a list of supported orchestrators in the specified subscription. The operation returns properties of each orchestrator including verison and available upgrades.
     *
     * @param location The name of a supported Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OrchestratorVersionProfileListResultInner object if successful.
     */
    public OrchestratorVersionProfileListResultInner listOrchestrators(String location) {
        return listOrchestratorsWithServiceResponseAsync(location).toBlocking().single().body();
    }

    /**
     * Gets a list of supported orchestrators in the specified subscription.
     * Gets a list of supported orchestrators in the specified subscription. The operation returns properties of each orchestrator including verison and available upgrades.
     *
     * @param location The name of a supported Azure region.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<OrchestratorVersionProfileListResultInner> listOrchestratorsAsync(String location, final ServiceCallback<OrchestratorVersionProfileListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listOrchestratorsWithServiceResponseAsync(location), serviceCallback);
    }

    /**
     * Gets a list of supported orchestrators in the specified subscription.
     * Gets a list of supported orchestrators in the specified subscription. The operation returns properties of each orchestrator including verison and available upgrades.
     *
     * @param location The name of a supported Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OrchestratorVersionProfileListResultInner object
     */
    public Observable<OrchestratorVersionProfileListResultInner> listOrchestratorsAsync(String location) {
        return listOrchestratorsWithServiceResponseAsync(location).map(new Func1<ServiceResponse<OrchestratorVersionProfileListResultInner>, OrchestratorVersionProfileListResultInner>() {
            @Override
            public OrchestratorVersionProfileListResultInner call(ServiceResponse<OrchestratorVersionProfileListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a list of supported orchestrators in the specified subscription.
     * Gets a list of supported orchestrators in the specified subscription. The operation returns properties of each orchestrator including verison and available upgrades.
     *
     * @param location The name of a supported Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OrchestratorVersionProfileListResultInner object
     */
    public Observable<ServiceResponse<OrchestratorVersionProfileListResultInner>> listOrchestratorsWithServiceResponseAsync(String location) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String resourceType = null;
        return service.listOrchestrators(this.client.subscriptionId(), location, this.client.apiVersion(), resourceType, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<OrchestratorVersionProfileListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<OrchestratorVersionProfileListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<OrchestratorVersionProfileListResultInner> clientResponse = listOrchestratorsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets a list of supported orchestrators in the specified subscription.
     * Gets a list of supported orchestrators in the specified subscription. The operation returns properties of each orchestrator including verison and available upgrades.
     *
     * @param location The name of a supported Azure region.
     * @param resourceType resource type for which the list of orchestrators needs to be returned
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OrchestratorVersionProfileListResultInner object if successful.
     */
    public OrchestratorVersionProfileListResultInner listOrchestrators(String location, String resourceType) {
        return listOrchestratorsWithServiceResponseAsync(location, resourceType).toBlocking().single().body();
    }

    /**
     * Gets a list of supported orchestrators in the specified subscription.
     * Gets a list of supported orchestrators in the specified subscription. The operation returns properties of each orchestrator including verison and available upgrades.
     *
     * @param location The name of a supported Azure region.
     * @param resourceType resource type for which the list of orchestrators needs to be returned
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<OrchestratorVersionProfileListResultInner> listOrchestratorsAsync(String location, String resourceType, final ServiceCallback<OrchestratorVersionProfileListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listOrchestratorsWithServiceResponseAsync(location, resourceType), serviceCallback);
    }

    /**
     * Gets a list of supported orchestrators in the specified subscription.
     * Gets a list of supported orchestrators in the specified subscription. The operation returns properties of each orchestrator including verison and available upgrades.
     *
     * @param location The name of a supported Azure region.
     * @param resourceType resource type for which the list of orchestrators needs to be returned
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OrchestratorVersionProfileListResultInner object
     */
    public Observable<OrchestratorVersionProfileListResultInner> listOrchestratorsAsync(String location, String resourceType) {
        return listOrchestratorsWithServiceResponseAsync(location, resourceType).map(new Func1<ServiceResponse<OrchestratorVersionProfileListResultInner>, OrchestratorVersionProfileListResultInner>() {
            @Override
            public OrchestratorVersionProfileListResultInner call(ServiceResponse<OrchestratorVersionProfileListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a list of supported orchestrators in the specified subscription.
     * Gets a list of supported orchestrators in the specified subscription. The operation returns properties of each orchestrator including verison and available upgrades.
     *
     * @param location The name of a supported Azure region.
     * @param resourceType resource type for which the list of orchestrators needs to be returned
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OrchestratorVersionProfileListResultInner object
     */
    public Observable<ServiceResponse<OrchestratorVersionProfileListResultInner>> listOrchestratorsWithServiceResponseAsync(String location, String resourceType) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listOrchestrators(this.client.subscriptionId(), location, this.client.apiVersion(), resourceType, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<OrchestratorVersionProfileListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<OrchestratorVersionProfileListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<OrchestratorVersionProfileListResultInner> clientResponse = listOrchestratorsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<OrchestratorVersionProfileListResultInner> listOrchestratorsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<OrchestratorVersionProfileListResultInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<OrchestratorVersionProfileListResultInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
