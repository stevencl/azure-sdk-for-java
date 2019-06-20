/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes the expected impact of a repair on a set of nodes.
 *
 * This type supports the Service Fabric platform; it is not meant to be used
 * directly from your code.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Node")
public class NodeRepairImpactDescription extends RepairImpactDescriptionBase {
    /**
     * The list of nodes impacted by a repair action and their respective
     * expected impact.
     */
    @JsonProperty(value = "NodeImpactList")
    private List<NodeImpact> nodeImpactList;

    /**
     * Get the list of nodes impacted by a repair action and their respective expected impact.
     *
     * @return the nodeImpactList value
     */
    public List<NodeImpact> nodeImpactList() {
        return this.nodeImpactList;
    }

    /**
     * Set the list of nodes impacted by a repair action and their respective expected impact.
     *
     * @param nodeImpactList the nodeImpactList value to set
     * @return the NodeRepairImpactDescription object itself.
     */
    public NodeRepairImpactDescription withNodeImpactList(List<NodeImpact> nodeImpactList) {
        this.nodeImpactList = nodeImpactList;
        return this;
    }

}