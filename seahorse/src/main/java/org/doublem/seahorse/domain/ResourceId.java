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

    /**
     * translate dbSeqId to translatedId
     * @param sequence
     * @return dbSeqId in int
     */
    public String translate(int sequence) {

        return Base62.execute(sequence);
    }

    /**
     * translate translatedId to dbSeqId
     * @param translatedId
     * @return dbSeqId in int
     */
    public int translate(String translatedId) {

        return Base62.execute(translatedId);
    }
}
