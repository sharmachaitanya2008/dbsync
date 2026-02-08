
package com.example.sync.controller;

import com.example.sync.service.SyncService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sync")
public class SyncController {

    private final SyncService service;

    public SyncController(SyncService service) {
        this.service = service;
    }

    @PostMapping("/full")
    public void fullSync() {
        service.fullSync();
    }

    @PostMapping("/{id}")
    public void syncOne(@PathVariable Long id) {
        service.syncByBusinessId(id);
    }
}
