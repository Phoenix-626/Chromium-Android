
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/dom_storage/storage_partition_service.mojom
//

package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface StoragePartitionService extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends StoragePartitionService, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<StoragePartitionService, StoragePartitionService.Proxy> MANAGER = StoragePartitionService_Internal.MANAGER;


    void openLocalStorage(
org.chromium.url.mojom.Origin origin, org.chromium.mojo.bindings.InterfaceRequest<StorageArea> area);



    void openSessionStorage(
String namespaceId, org.chromium.mojo.bindings.InterfaceRequest<SessionStorageNamespace> sessionNamespace);


}
