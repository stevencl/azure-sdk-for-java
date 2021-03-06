/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2019_01_01.Tags;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.apimanagement.v2019_01_01.TagContract;

class TagsImpl extends WrapperImpl<TagsInner> implements Tags {
    private final ApiManagementManager manager;

    TagsImpl(ApiManagementManager manager) {
        super(manager.inner().tags());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public TagContractImpl define(String name) {
        return wrapModel(name);
    }

    private TagContractImpl wrapModel(TagContractInner inner) {
        return  new TagContractImpl(inner, manager());
    }

    private TagContractImpl wrapModel(String name) {
        return new TagContractImpl(name, this.manager());
    }

    @Override
    public Completable getEntityStateByOperationAsync(String resourceGroupName, String serviceName, String apiId, String operationId, String tagId) {
        TagsInner client = this.inner();
        return client.getEntityStateByOperationAsync(resourceGroupName, serviceName, apiId, operationId, tagId).toCompletable();
    }

    @Override
    public Observable<TagContract> listByApiAsync(final String resourceGroupName, final String serviceName, final String apiId) {
        TagsInner client = this.inner();
        return client.listByApiAsync(resourceGroupName, serviceName, apiId)
        .flatMapIterable(new Func1<Page<TagContractInner>, Iterable<TagContractInner>>() {
            @Override
            public Iterable<TagContractInner> call(Page<TagContractInner> page) {
                return page.items();
            }
        })
        .map(new Func1<TagContractInner, TagContract>() {
            @Override
            public TagContract call(TagContractInner inner) {
                return new TagContractImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable getEntityStateByApiAsync(String resourceGroupName, String serviceName, String apiId, String tagId) {
        TagsInner client = this.inner();
        return client.getEntityStateByApiAsync(resourceGroupName, serviceName, apiId, tagId).toCompletable();
    }

    @Override
    public Observable<TagContract> getByApiAsync(String resourceGroupName, String serviceName, String apiId, String tagId) {
        TagsInner client = this.inner();
        return client.getByApiAsync(resourceGroupName, serviceName, apiId, tagId)
        .map(new Func1<TagContractInner, TagContract>() {
            @Override
            public TagContract call(TagContractInner inner) {
                return new TagContractImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<TagContract> assignToApiAsync(String resourceGroupName, String serviceName, String apiId, String tagId) {
        TagsInner client = this.inner();
        return client.assignToApiAsync(resourceGroupName, serviceName, apiId, tagId)
        .map(new Func1<TagContractInner, TagContract>() {
            @Override
            public TagContract call(TagContractInner inner) {
                return new TagContractImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable detachFromApiAsync(String resourceGroupName, String serviceName, String apiId, String tagId) {
        TagsInner client = this.inner();
        return client.detachFromApiAsync(resourceGroupName, serviceName, apiId, tagId).toCompletable();
    }

    @Override
    public Observable<TagContract> listByProductAsync(final String resourceGroupName, final String serviceName, final String productId) {
        TagsInner client = this.inner();
        return client.listByProductAsync(resourceGroupName, serviceName, productId)
        .flatMapIterable(new Func1<Page<TagContractInner>, Iterable<TagContractInner>>() {
            @Override
            public Iterable<TagContractInner> call(Page<TagContractInner> page) {
                return page.items();
            }
        })
        .map(new Func1<TagContractInner, TagContract>() {
            @Override
            public TagContract call(TagContractInner inner) {
                return new TagContractImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable getEntityStateByProductAsync(String resourceGroupName, String serviceName, String productId, String tagId) {
        TagsInner client = this.inner();
        return client.getEntityStateByProductAsync(resourceGroupName, serviceName, productId, tagId).toCompletable();
    }

    @Override
    public Observable<TagContract> getByProductAsync(String resourceGroupName, String serviceName, String productId, String tagId) {
        TagsInner client = this.inner();
        return client.getByProductAsync(resourceGroupName, serviceName, productId, tagId)
        .map(new Func1<TagContractInner, TagContract>() {
            @Override
            public TagContract call(TagContractInner inner) {
                return new TagContractImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<TagContract> assignToProductAsync(String resourceGroupName, String serviceName, String productId, String tagId) {
        TagsInner client = this.inner();
        return client.assignToProductAsync(resourceGroupName, serviceName, productId, tagId)
        .map(new Func1<TagContractInner, TagContract>() {
            @Override
            public TagContract call(TagContractInner inner) {
                return new TagContractImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable detachFromProductAsync(String resourceGroupName, String serviceName, String productId, String tagId) {
        TagsInner client = this.inner();
        return client.detachFromProductAsync(resourceGroupName, serviceName, productId, tagId).toCompletable();
    }

    @Override
    public Observable<TagContract> listByServiceAsync(final String resourceGroupName, final String serviceName) {
        TagsInner client = this.inner();
        return client.listByServiceAsync(resourceGroupName, serviceName)
        .flatMapIterable(new Func1<Page<TagContractInner>, Iterable<TagContractInner>>() {
            @Override
            public Iterable<TagContractInner> call(Page<TagContractInner> page) {
                return page.items();
            }
        })
        .map(new Func1<TagContractInner, TagContract>() {
            @Override
            public TagContract call(TagContractInner inner) {
                return new TagContractImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable getEntityStateAsync(String resourceGroupName, String serviceName, String tagId) {
        TagsInner client = this.inner();
        return client.getEntityStateAsync(resourceGroupName, serviceName, tagId).toCompletable();
    }

    @Override
    public Observable<TagContract> getAsync(String resourceGroupName, String serviceName, String tagId) {
        TagsInner client = this.inner();
        return client.getAsync(resourceGroupName, serviceName, tagId)
        .map(new Func1<TagContractInner, TagContract>() {
            @Override
            public TagContract call(TagContractInner inner) {
                return new TagContractImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<TagContract> createOrUpdateAsync(String resourceGroupName, String serviceName, String tagId, String displayName) {
        TagsInner client = this.inner();
        return client.createOrUpdateAsync(resourceGroupName, serviceName, tagId, displayName)
        .map(new Func1<TagContractInner, TagContract>() {
            @Override
            public TagContract call(TagContractInner inner) {
                return new TagContractImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable updateAsync(String resourceGroupName, String serviceName, String tagId, String ifMatch, String displayName) {
        TagsInner client = this.inner();
        return client.updateAsync(resourceGroupName, serviceName, tagId, ifMatch, displayName).toCompletable();
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serviceName, String tagId, String ifMatch) {
        TagsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serviceName, tagId, ifMatch).toCompletable();
    }

    @Override
    public Observable<TagContract> listByOperationAsync(final String resourceGroupName, final String serviceName, final String apiId, final String operationId) {
        TagsInner client = this.inner();
        return client.listByOperationAsync(resourceGroupName, serviceName, apiId, operationId)
        .flatMapIterable(new Func1<Page<TagContractInner>, Iterable<TagContractInner>>() {
            @Override
            public Iterable<TagContractInner> call(Page<TagContractInner> page) {
                return page.items();
            }
        })
        .map(new Func1<TagContractInner, TagContract>() {
            @Override
            public TagContract call(TagContractInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<TagContract> getByOperationAsync(String resourceGroupName, String serviceName, String apiId, String operationId, String tagId) {
        TagsInner client = this.inner();
        return client.getByOperationAsync(resourceGroupName, serviceName, apiId, operationId, tagId)
        .flatMap(new Func1<TagContractInner, Observable<TagContract>>() {
            @Override
            public Observable<TagContract> call(TagContractInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((TagContract)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable detachFromOperationAsync(String resourceGroupName, String serviceName, String apiId, String operationId, String tagId) {
        TagsInner client = this.inner();
        return client.detachFromOperationAsync(resourceGroupName, serviceName, apiId, operationId, tagId).toCompletable();
    }

}
