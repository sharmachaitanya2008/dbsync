
package com.example.sync.service;

public interface SyncService {
    void fullSync();
    void syncByBusinessId(Long id);
}
