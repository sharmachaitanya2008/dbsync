
package com.example.sync.mapper;

import com.example.sync.domain.*;
import com.example.sync.dto.sybase.*;
import org.springframework.stereotype.Component;
import java.time.Instant;
import java.util.List;

@Component
public class NormalizedObjectMapper {

    public NormalizedObject aggregate(TableADto a, TableBDto b, List<TableCDto> cList) {
        NormalizedObject obj = new NormalizedObject();
        obj.setBusinessId(a.businessId());
        obj.setName(a.name());
        obj.setStatus(b != null ? b.status() : null);

        obj.setAttributes(
            cList.stream().map(c -> {
                Attribute attr = new Attribute();
                attr.setCode(c.code());
                attr.setValue(c.value());
                return attr;
            }).toList()
        );

        obj.setLastSyncedAt(Instant.now());
        return obj;
    }
}
