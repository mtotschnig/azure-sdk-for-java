// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** This enumerates the possible sources of a volume creation. */
public final class VolumeCreateOption extends ExpandableStringEnum<VolumeCreateOption> {
    /** Static value None for VolumeCreateOption. */
    public static final VolumeCreateOption NONE = fromString("None");

    /** Static value VolumeSnapshot for VolumeCreateOption. */
    public static final VolumeCreateOption VOLUME_SNAPSHOT = fromString("VolumeSnapshot");

    /** Static value DiskSnapshot for VolumeCreateOption. */
    public static final VolumeCreateOption DISK_SNAPSHOT = fromString("DiskSnapshot");

    /** Static value Disk for VolumeCreateOption. */
    public static final VolumeCreateOption DISK = fromString("Disk");

    /** Static value DiskRestorePoint for VolumeCreateOption. */
    public static final VolumeCreateOption DISK_RESTORE_POINT = fromString("DiskRestorePoint");

    /**
     * Creates a new instance of VolumeCreateOption value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VolumeCreateOption() {
    }

    /**
     * Creates or finds a VolumeCreateOption from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VolumeCreateOption.
     */
    @JsonCreator
    public static VolumeCreateOption fromString(String name) {
        return fromString(name, VolumeCreateOption.class);
    }

    /**
     * Gets known VolumeCreateOption values.
     *
     * @return known VolumeCreateOption values.
     */
    public static Collection<VolumeCreateOption> values() {
        return values(VolumeCreateOption.class);
    }
}
