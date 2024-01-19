package io.github.primelib.osv4j.model;

import javax.annotation.processing.Generated;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * OsvSeverityType
 * 
 *
 */
@JsonTypeName("osvSeverityType")
@AllArgsConstructor
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public enum OsvSeverityType {
    UNSPECIFIED("UNSPECIFIED"),
    CVSS_V3("CVSS_V3"),
    CVSS_V2("CVSS_V2");

    private final String value;
}
