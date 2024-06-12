package io.muic.ooc.webapp.config;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class ConfigProperties {
    private String databaseDriverClassName;
    private String databaseConnectionUrl;
    private String databaseUsername;
    private String databsePassword;
}
