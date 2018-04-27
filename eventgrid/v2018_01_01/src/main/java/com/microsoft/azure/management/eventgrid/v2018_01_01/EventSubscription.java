/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2018_01_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.eventgrid.v2018_01_01.implementation.EventSubscriptionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.eventgrid.v2018_01_01.implementation.EventGridManager;
import java.util.List;

/**
 * Type representing EventSubscription.
 */
public interface EventSubscription extends HasInner<EventSubscriptionInner>, Indexable, Refreshable<EventSubscription>, Updatable<EventSubscription.Update>, HasManager<EventGridManager> {
    /**
     * @return the destination value.
     */
    EventSubscriptionDestination destination();

    /**
     * @return the filter value.
     */
    EventSubscriptionFilter filter();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the labels value.
     */
    List<String> labels();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    EventSubscriptionProvisioningState provisioningState();

    /**
     * @return the topic value.
     */
    String topic();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the EventSubscription definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithScope, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of EventSubscription definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a EventSubscription definition.
         */
        interface Blank extends WithScope {
        }

        /**
         * The stage of the eventsubscription definition allowing to specify Scope.
         */
        interface WithScope {
           /**
            * Specifies scope.
            */
            WithCreate withScope(String scope);
        }

        /**
         * The stage of the eventsubscription definition allowing to specify Destination.
         */
        interface WithDestination {
            /**
             * Specifies destination.
             */
            WithCreate withDestination(EventSubscriptionDestination destination);
        }

        /**
         * The stage of the eventsubscription definition allowing to specify Filter.
         */
        interface WithFilter {
            /**
             * Specifies filter.
             */
            WithCreate withFilter(EventSubscriptionFilter filter);
        }

        /**
         * The stage of the eventsubscription definition allowing to specify Labels.
         */
        interface WithLabels {
            /**
             * Specifies labels.
             */
            WithCreate withLabels(List<String> labels);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<EventSubscription>, DefinitionStages.WithDestination, DefinitionStages.WithFilter, DefinitionStages.WithLabels {
        }
    }
    /**
     * The template for a EventSubscription update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<EventSubscription>, UpdateStages.WithDestination, UpdateStages.WithFilter, UpdateStages.WithLabels {
    }

    /**
     * Grouping of EventSubscription update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the eventsubscription update allowing to specify Destination.
         */
        interface WithDestination {
            /**
             * Specifies destination.
             */
            Update withDestination(EventSubscriptionDestination destination);
        }

        /**
         * The stage of the eventsubscription update allowing to specify Filter.
         */
        interface WithFilter {
            /**
             * Specifies filter.
             */
            Update withFilter(EventSubscriptionFilter filter);
        }

        /**
         * The stage of the eventsubscription update allowing to specify Labels.
         */
        interface WithLabels {
            /**
             * Specifies labels.
             */
            Update withLabels(List<String> labels);
        }

    }
}
