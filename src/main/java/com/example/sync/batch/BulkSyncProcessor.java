
package com.example.sync.batch;

import com.example.sync.mapper.NormalizedObjectMapper;
import com.example.sync.repository.mongo.NormalizedObjectRepository;
import com.example.sync.repository.sybase.*;
import org.springframework.stereotype.Component;

@Component
public class BulkSyncProcessor {

    public BulkSyncProcessor(TableARepository a, TableBRepository b, TableCRepository c,
                             NormalizedObjectMapper mapper,
                             NormalizedObjectRepository mongo) {
    }

    public void fullRefresh() {}
    public void singleRefresh(Long id) {}
}
