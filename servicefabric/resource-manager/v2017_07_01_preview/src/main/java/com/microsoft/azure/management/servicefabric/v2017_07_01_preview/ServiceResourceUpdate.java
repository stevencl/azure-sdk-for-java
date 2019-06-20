/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2017_07_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * The service resource for patch operations.
 */
@JsonFlatten
public class ServiceResourceUpdate extends ProxyResource {
    /**
     * The placement constraints as a string. Placement constraints are boolean
     * expressions on node properties and allow for restricting a service to
     * particular nodes based on the service requirements. For example, to
     * place a service on nodes where NodeType is blue specify the following:
     * "NodeColor == blue)".
     */
    @JsonProperty(value = "properties.placementConstraints")
    private String placementConstraints;

    /**
     * The correlationScheme property.
     */
    @JsonProperty(value = "properties.correlationScheme")
    private List<ServiceCorrelationDescription> correlationScheme;

    /**
     * The serviceLoadMetrics property.
     */
    @JsonProperty(value = "properties.serviceLoadMetrics")
    private List<ServiceLoadMetricDescription> serviceLoadMetrics;

    /**
     * The servicePlacementPolicies property.
     */
    @JsonProperty(value = "properties.servicePlacementPolicies")
    private List<ServicePlacementPolicyDescription> servicePlacementPolicies;

    /**
     * Possible values include: 'Zero', 'Low', 'Medium', 'High'.
     */
    @JsonProperty(value = "properties.defaultMoveCost")
    private String defaultMoveCost;

    /**
     * Resource location.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * Get the placement constraints as a string. Placement constraints are boolean expressions on node properties and allow for restricting a service to particular nodes based on the service requirements. For example, to place a service on nodes where NodeType is blue specify the following: "NodeColor == blue)".
     *
     * @return the placementConstraints value
     */
    public String placementConstraints() {
        return this.placementConstraints;
    }

    /**
     * Set the placement constraints as a string. Placement constraints are boolean expressions on node properties and allow for restricting a service to particular nodes based on the service requirements. For example, to place a service on nodes where NodeType is blue specify the following: "NodeColor == blue)".
     *
     * @param placementConstraints the placementConstraints value to set
     * @return the ServiceResourceUpdate object itself.
     */
    public ServiceResourceUpdate withPlacementConstraints(String placementConstraints) {
        this.placementConstraints = placementConstraints;
        return this;
    }

    /**
     * Get the correlationScheme value.
     *
     * @return the correlationScheme value
     */
    public List<ServiceCorrelationDescription> correlationScheme() {
        return this.correlationScheme;
    }

    /**
     * Set the correlationScheme value.
     *
     * @param correlationScheme the correlationScheme value to set
     * @return the ServiceResourceUpdate object itself.
     */
    public ServiceResourceUpdate withCorrelationScheme(List<ServiceCorrelationDescription> correlationScheme) {
        this.correlationScheme = correlationScheme;
        return this;
    }

    /**
     * Get the serviceLoadMetrics value.
     *
     * @return the serviceLoadMetrics value
     */
    public List<ServiceLoadMetricDescription> serviceLoadMetrics() {
        return this.serviceLoadMetrics;
    }

    /**
     * Set the serviceLoadMetrics value.
     *
     * @param serviceLoadMetrics the serviceLoadMetrics value to set
     * @return the ServiceResourceUpdate object itself.
     */
    public ServiceResourceUpdate withServiceLoadMetrics(List<ServiceLoadMetricDescription> serviceLoadMetrics) {
        this.serviceLoadMetrics = serviceLoadMetrics;
        return this;
    }

    /**
     * Get the servicePlacementPolicies value.
     *
     * @return the servicePlacementPolicies value
     */
    public List<ServicePlacementPolicyDescription> servicePlacementPolicies() {
        return this.servicePlacementPolicies;
    }

    /**
     * Set the servicePlacementPolicies value.
     *
     * @param servicePlacementPolicies the servicePlacementPolicies value to set
     * @return the ServiceResourceUpdate object itself.
     */
    public ServiceResourceUpdate withServicePlacementPolicies(List<ServicePlacementPolicyDescription> servicePlacementPolicies) {
        this.servicePlacementPolicies = servicePlacementPolicies;
        return this;
    }

    /**
     * Get possible values include: 'Zero', 'Low', 'Medium', 'High'.
     *
     * @return the defaultMoveCost value
     */
    public String defaultMoveCost() {
        return this.defaultMoveCost;
    }

    /**
     * Set possible values include: 'Zero', 'Low', 'Medium', 'High'.
     *
     * @param defaultMoveCost the defaultMoveCost value to set
     * @return the ServiceResourceUpdate object itself.
     */
    public ServiceResourceUpdate withDefaultMoveCost(String defaultMoveCost) {
        this.defaultMoveCost = defaultMoveCost;
        return this;
    }

    /**
     * Get resource location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set resource location.
     *
     * @param location the location value to set
     * @return the ServiceResourceUpdate object itself.
     */
    public ServiceResourceUpdate withLocation(String location) {
        this.location = location;
        return this;
    }

}