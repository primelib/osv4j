package io.github.primelib.osv4j.model;

import javax.annotation.processing.Generated;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * OsvRangeType
 * 
 *
 */
@JsonTypeName("osvRangeType")
@AllArgsConstructor
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public enum OsvRangeType {
    UNSPECIFIED("UNSPECIFIED"),
    GIT("GIT"),
    SEMVER("SEMVER"),
    ECOSYSTEM("ECOSYSTEM");

    private final String value;
}
