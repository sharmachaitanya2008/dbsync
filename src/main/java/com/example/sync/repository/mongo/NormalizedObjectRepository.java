
package com.example.sync.repository.mongo;

import com.example.sync.domain.NormalizedObject;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NormalizedObjectRepository
        extends MongoRepository<NormalizedObject, Long> {}
