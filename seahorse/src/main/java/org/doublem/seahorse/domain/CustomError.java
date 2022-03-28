package org.doublem.seahorse.domain;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public enum CustomError {
    NO_BASE62_CODE("DNBC1", "NO_BASE62_CODE");

    private final String errorCode;
    private final String errorMessage;

}

