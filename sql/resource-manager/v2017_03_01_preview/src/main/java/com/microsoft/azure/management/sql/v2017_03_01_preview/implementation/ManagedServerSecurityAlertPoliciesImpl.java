/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2017_03_01_preview.ManagedServerSecurityAlertPolicies;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.sql.v2017_03_01_preview.ManagedServerSecurityAlertPolicy;
import com.microsoft.azure.Page;

class ManagedServerSecurityAlertPoliciesImpl extends WrapperImpl<ManagedServerSecurityAlertPoliciesInner> implements ManagedServerSecurityAlertPolicies {
    private final SqlManager manager;

    ManagedServerSecurityAlertPoliciesImpl(SqlManager manager) {
        super(manager.inner().managedServerSecurityAlertPolicies());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public ManagedServerSecurityAlertPolicyImpl defineSecurityAlertPolicy(String name) {
        return wrapSecurityAlertPolicyModel(name);
    }

    private ManagedServerSecurityAlertPolicyImpl wrapSecurityAlertPolicyModel(String name) {
        return new ManagedServerSecurityAlertPolicyImpl(name, this.manager());
    }

    private ManagedServerSecurityAlertPolicyImpl wrapManagedServerSecurityAlertPolicyModel(ManagedServerSecurityAlertPolicyInner inner) {
        return  new ManagedServerSecurityAlertPolicyImpl(inner, manager());
    }

    private Observable<ManagedServerSecurityAlertPolicyInner> getManagedServerSecurityAlertPolicyInnerUsingManagedServerSecurityAlertPoliciesInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String managedInstanceName = IdParsingUtils.getValueFromIdByName(id, "managedInstances");
        ManagedServerSecurityAlertPoliciesInner client = this.inner();
        return client.getAsync(resourceGroupName, managedInstanceName);
    }

    @Override
    public Observable<ManagedServerSecurityAlertPolicy> getAsync(String resourceGroupName, String managedInstanceName) {
        ManagedServerSecurityAlertPoliciesInner client = this.inner();
        return client.getAsync(resourceGroupName, managedInstanceName)
        .map(new Func1<ManagedServerSecurityAlertPolicyInner, ManagedServerSecurityAlertPolicy>() {
            @Override
            public ManagedServerSecurityAlertPolicy call(ManagedServerSecurityAlertPolicyInner inner) {
                return wrapManagedServerSecurityAlertPolicyModel(inner);
            }
       });
    }

    @Override
    public Observable<ManagedServerSecurityAlertPolicy> listByInstanceAsync(final String resourceGroupName, final String managedInstanceName) {
        ManagedServerSecurityAlertPoliciesInner client = this.inner();
        return client.listByInstanceAsync(resourceGroupName, managedInstanceName)
        .flatMapIterable(new Func1<Page<ManagedServerSecurityAlertPolicyInner>, Iterable<ManagedServerSecurityAlertPolicyInner>>() {
            @Override
            public Iterable<ManagedServerSecurityAlertPolicyInner> call(Page<ManagedServerSecurityAlertPolicyInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ManagedServerSecurityAlertPolicyInner, ManagedServerSecurityAlertPolicy>() {
            @Override
            public ManagedServerSecurityAlertPolicy call(ManagedServerSecurityAlertPolicyInner inner) {
                return wrapManagedServerSecurityAlertPolicyModel(inner);
            }
        });
    }

}