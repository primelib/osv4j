package io.github.primelib.osv4j.model;

import javax.annotation.processing.Generated;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * OsvCreditType
 * 
 *
 */
@JsonTypeName("osvCreditType")
@AllArgsConstructor
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public enum OsvCreditType {
    UNSPECIFIED("UNSPECIFIED"),
    OTHER("OTHER"),
    FINDER("FINDER"),
    REPORTER("REPORTER"),
    ANALYST("ANALYST"),
    COORDINATOR("COORDINATOR"),
    REMEDIATION_DEVELOPER("REMEDIATION_DEVELOPER"),
    REMEDIATION_REVIEWER("REMEDIATION_REVIEWER"),
    REMEDIATION_VERIFIER("REMEDIATION_VERIFIER"),
    TOOL("TOOL"),
    SPONSOR("SPONSOR");

    private final String value;
}
