package io.github.primelib.osv4j.model;

import javax.annotation.processing.Generated;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * V1VersionRepositoryInformationRepoType
 * 
 *
 */
@JsonTypeName("v1VersionRepositoryInformationRepoType")
@AllArgsConstructor
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public enum V1VersionRepositoryInformationRepoType {
    UNSPECIFIED("UNSPECIFIED"),
    GIT("GIT");

    private final String value;
}
