package org.doublem.seahorse.model.user;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    String id;
    String displayId;
    String email;
}
