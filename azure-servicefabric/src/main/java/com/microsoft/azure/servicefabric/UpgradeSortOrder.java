/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for UpgradeSortOrder.
 */
public final class UpgradeSortOrder extends ExpandableStringEnum<UpgradeSortOrder> {
    /** Static value Invalid for UpgradeSortOrder. */
    public static final UpgradeSortOrder INVALID = fromString("Invalid");

    /** Static value Default for UpgradeSortOrder. */
    public static final UpgradeSortOrder DEFAULT = fromString("Default");

    /** Static value Numeric for UpgradeSortOrder. */
    public static final UpgradeSortOrder NUMERIC = fromString("Numeric");

    /** Static value Lexicographical for UpgradeSortOrder. */
    public static final UpgradeSortOrder LEXICOGRAPHICAL = fromString("Lexicographical");

    /** Static value ReverseNumeric for UpgradeSortOrder. */
    public static final UpgradeSortOrder REVERSE_NUMERIC = fromString("ReverseNumeric");

    /** Static value ReverseLexicographical for UpgradeSortOrder. */
    public static final UpgradeSortOrder REVERSE_LEXICOGRAPHICAL = fromString("ReverseLexicographical");

    /**
     * Creates or finds a UpgradeSortOrder from its string representation.
     * @param name a name to look for
     * @return the corresponding UpgradeSortOrder
     */
    @JsonCreator
    public static UpgradeSortOrder fromString(String name) {
        return fromString(name, UpgradeSortOrder.class);
    }

    /**
     * @return known UpgradeSortOrder values
     */
    public static Collection<UpgradeSortOrder> values() {
        return values(UpgradeSortOrder.class);
    }
}