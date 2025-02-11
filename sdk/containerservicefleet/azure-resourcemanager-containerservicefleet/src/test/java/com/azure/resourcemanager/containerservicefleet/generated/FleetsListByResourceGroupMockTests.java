// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager;
import com.azure.resourcemanager.containerservicefleet.models.Fleet;
import com.azure.resourcemanager.containerservicefleet.models.ManagedServiceIdentityType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class FleetsListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Updating\"},\"eTag\":\"zlfmisgwbnbbeld\",\"identity\":{\"principalId\":\"83f502da-cc13-4c3c-a5f4-64dd46a21f4c\",\"tenantId\":\"383d5bb3-f707-4d72-b03b-c4aebce90071\",\"type\":\"SystemAssigned,"
                + " UserAssigned\",\"userAssignedIdentities\":{\"urqhaka\":{\"principalId\":\"9a0d63cc-7bed-40d2-bbce-f570c0834930\",\"clientId\":\"ccd9d344-63dd-4c3c-b404-0bd25fb86597\"},\"shsfwxosowzxcu\":{\"principalId\":\"3e149389-ebec-4320-9c72-bf632ad8069c\",\"clientId\":\"0059c334-1340-4c1e-837f-0f54b9ea7748\"},\"jooxdjebw\":{\"principalId\":\"eae88e80-f635-48ee-926a-933f0d9c5fda\",\"clientId\":\"39262479-a2bd-4386-93af-590ba9c88c14\"}}},\"location\":\"cwwfvovbvme\",\"tags\":{\"iotwmcdytdxwit\":\"ivyhzceuojgjrwju\",\"hniskxfbkpyc\":\"nrjawgqwg\",\"l\":\"klwndnhjdauwhv\"},\"id\":\"zbtd\",\"name\":\"xujznbmpowu\",\"type\":\"przqlveu\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        ContainerServiceFleetManager manager =
            ContainerServiceFleetManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Fleet> response =
            manager.fleets().listByResourceGroup("rcrgvx", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("cwwfvovbvme", response.iterator().next().location());
        Assertions.assertEquals("ivyhzceuojgjrwju", response.iterator().next().tags().get("iotwmcdytdxwit"));
        Assertions
            .assertEquals(
                ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, response.iterator().next().identity().type());
    }
}
