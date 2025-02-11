// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureWorkloadContainerAutoProtectionIntent;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionStatus;
import org.junit.jupiter.api.Assertions;

public final class AzureWorkloadContainerAutoProtectionIntentTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureWorkloadContainerAutoProtectionIntent model =
            BinaryData
                .fromString(
                    "{\"protectionIntentItemType\":\"AzureWorkloadContainerAutoProtectionIntent\",\"backupManagementType\":\"AzureBackupServer\",\"sourceResourceId\":\"qfyiaseqchkr\",\"itemId\":\"zrazisgyk\",\"policyId\":\"emv\",\"protectionState\":\"Protecting\"}")
                .toObject(AzureWorkloadContainerAutoProtectionIntent.class);
        Assertions.assertEquals(BackupManagementType.AZURE_BACKUP_SERVER, model.backupManagementType());
        Assertions.assertEquals("qfyiaseqchkr", model.sourceResourceId());
        Assertions.assertEquals("zrazisgyk", model.itemId());
        Assertions.assertEquals("emv", model.policyId());
        Assertions.assertEquals(ProtectionStatus.PROTECTING, model.protectionState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureWorkloadContainerAutoProtectionIntent model =
            new AzureWorkloadContainerAutoProtectionIntent()
                .withBackupManagementType(BackupManagementType.AZURE_BACKUP_SERVER)
                .withSourceResourceId("qfyiaseqchkr")
                .withItemId("zrazisgyk")
                .withPolicyId("emv")
                .withProtectionState(ProtectionStatus.PROTECTING);
        model = BinaryData.fromObject(model).toObject(AzureWorkloadContainerAutoProtectionIntent.class);
        Assertions.assertEquals(BackupManagementType.AZURE_BACKUP_SERVER, model.backupManagementType());
        Assertions.assertEquals("qfyiaseqchkr", model.sourceResourceId());
        Assertions.assertEquals("zrazisgyk", model.itemId());
        Assertions.assertEquals("emv", model.policyId());
        Assertions.assertEquals(ProtectionStatus.PROTECTING, model.protectionState());
    }
}
