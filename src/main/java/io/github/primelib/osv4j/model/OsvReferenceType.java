package io.github.primelib.osv4j.model;

import javax.annotation.processing.Generated;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * OsvReferenceType
 * 
 *
 */
@JsonTypeName("osvReferenceType")
@AllArgsConstructor
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public enum OsvReferenceType {
    NONE("NONE"),
    WEB("WEB"),
    ADVISORY("ADVISORY"),
    REPORT("REPORT"),
    FIX("FIX"),
    PACKAGE("PACKAGE"),
    ARTICLE("ARTICLE"),
    EVIDENCE("EVIDENCE");

    private final String value;
}
