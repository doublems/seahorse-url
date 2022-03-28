package org.doublem.seahorse.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ResourceId {

    private int    dbSeqId;
    private String shortenId;

    public String translate(int sequence) {

        return Base62.execute(sequence);
    }

    public int translate(String translatedId) {

        return Base62.execute(translatedId);
    }
}
