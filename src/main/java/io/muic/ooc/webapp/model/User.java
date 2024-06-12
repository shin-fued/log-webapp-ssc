package io.muic.ooc.webapp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class User {
    private long id;
    private String username;
    private String password;
    private String displayName;

}
