/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakestore.v2016_11_01;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The encryption identity properties.
 */
public class EncryptionIdentity {
    /**
     * The type of encryption being used. Currently the only supported type is
     * 'SystemAssigned'.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * The principal identifier associated with the encryption.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID principalId;

    /**
     * The tenant identifier associated with the encryption.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID tenantId;

    /**
     * Creates an instance of EncryptionIdentity class.
     */
    public EncryptionIdentity() {
        type = "SystemAssigned";
    }

    /**
     * Get the type of encryption being used. Currently the only supported type is 'SystemAssigned'.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type of encryption being used. Currently the only supported type is 'SystemAssigned'.
     *
     * @param type the type value to set
     * @return the EncryptionIdentity object itself.
     */
    public EncryptionIdentity withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the principal identifier associated with the encryption.
     *
     * @return the principalId value
     */
    public UUID principalId() {
        return this.principalId;
    }

    /**
     * Get the tenant identifier associated with the encryption.
     *
     * @return the tenantId value
     */
    public UUID tenantId() {
        return this.tenantId;
    }

}