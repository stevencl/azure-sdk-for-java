/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devspaces.v2018_06_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ContainerHostMappings.
 */
public class ContainerHostMappingsInner {
    /** The Retrofit service to perform REST calls. */
    private ContainerHostMappingsService service;
    /** The service client containing this operation class. */
    private DevSpacesManagementClientImpl client;

    /**
     * Initializes an instance of ContainerHostMappingsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ContainerHostMappingsInner(Retrofit retrofit, DevSpacesManagementClientImpl client) {
        this.service = retrofit.create(ContainerHostMappingsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ContainerHostMappings to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ContainerHostMappingsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.devspaces.v2018_06_01_preview.ContainerHostMappings getContainerHostMapping" })
        @POST("providers/Microsoft.DevSpaces/locations/{location}/checkContainerHostMapping")
        Observable<Response<ResponseBody>> getContainerHostMapping(@Path("location") String location, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body ContainerHostMappingInner containerHostMapping, @Header("User-Agent") String userAgent);

    }

    /**
     * Returns container host mapping object for a container host resource ID if an associated controller exists.
     *
     * @param location Location of the container host.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getContainerHostMapping(String location) {
        return getContainerHostMappingWithServiceResponseAsync(location).toBlocking().single().body();
    }

    /**
     * Returns container host mapping object for a container host resource ID if an associated controller exists.
     *
     * @param location Location of the container host.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getContainerHostMappingAsync(String location, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getContainerHostMappingWithServiceResponseAsync(location), serviceCallback);
    }

    /**
     * Returns container host mapping object for a container host resource ID if an associated controller exists.
     *
     * @param location Location of the container host.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getContainerHostMappingAsync(String location) {
        return getContainerHostMappingWithServiceResponseAsync(location).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Returns container host mapping object for a container host resource ID if an associated controller exists.
     *
     * @param location Location of the container host.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getContainerHostMappingWithServiceResponseAsync(String location) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String containerHostResourceId = null;
        ContainerHostMappingInner containerHostMapping = new ContainerHostMappingInner();
        containerHostMapping.withContainerHostResourceId(null);
        return service.getContainerHostMapping(location, this.client.apiVersion(), this.client.acceptLanguage(), containerHostMapping, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getContainerHostMappingDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Returns container host mapping object for a container host resource ID if an associated controller exists.
     *
     * @param location Location of the container host.
     * @param containerHostResourceId ARM ID of the Container Host resource
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getContainerHostMapping(String location, String containerHostResourceId) {
        return getContainerHostMappingWithServiceResponseAsync(location, containerHostResourceId).toBlocking().single().body();
    }

    /**
     * Returns container host mapping object for a container host resource ID if an associated controller exists.
     *
     * @param location Location of the container host.
     * @param containerHostResourceId ARM ID of the Container Host resource
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getContainerHostMappingAsync(String location, String containerHostResourceId, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getContainerHostMappingWithServiceResponseAsync(location, containerHostResourceId), serviceCallback);
    }

    /**
     * Returns container host mapping object for a container host resource ID if an associated controller exists.
     *
     * @param location Location of the container host.
     * @param containerHostResourceId ARM ID of the Container Host resource
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getContainerHostMappingAsync(String location, String containerHostResourceId) {
        return getContainerHostMappingWithServiceResponseAsync(location, containerHostResourceId).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Returns container host mapping object for a container host resource ID if an associated controller exists.
     *
     * @param location Location of the container host.
     * @param containerHostResourceId ARM ID of the Container Host resource
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getContainerHostMappingWithServiceResponseAsync(String location, String containerHostResourceId) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        ContainerHostMappingInner containerHostMapping = new ContainerHostMappingInner();
        containerHostMapping.withContainerHostResourceId(containerHostResourceId);
        return service.getContainerHostMapping(location, this.client.apiVersion(), this.client.acceptLanguage(), containerHostMapping, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getContainerHostMappingDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getContainerHostMappingDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Object, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}