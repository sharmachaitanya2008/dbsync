
package com.example.sync.service;

import com.example.sync.batch.BulkSyncProcessor;
import org.springframework.stereotype.Service;

@Service
public class SyncServiceImpl implements SyncService {

    private final BulkSyncProcessor processor;

    public SyncServiceImpl(BulkSyncProcessor processor) {
        this.processor = processor;
    }

    public void fullSync() {
        processor.fullRefresh();
    }

    public void syncByBusinessId(Long id) {
        processor.singleRefresh(id);
    }
}
