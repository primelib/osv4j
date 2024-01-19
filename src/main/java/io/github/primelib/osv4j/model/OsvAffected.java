package io.github.primelib.osv4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OsvAffected
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@JsonPropertyOrder({
    "package",
    "ranges",
    "versions",
    "ecosystemSpecific",
    "databaseSpecific",
    "severity"
})
@JsonTypeName("osvAffected")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OsvAffected {

    @JsonProperty("package")
    protected OsvPackage _package;

    /**
     * Required. Range information.
     */
    @JsonProperty("ranges")
    protected List<OsvRange> ranges;

    /**
     * Optional. List of affected versions.
     */
    @JsonProperty("versions")
    protected List<String> versions;

    /**
     * Optional. JSON object holding additional information about the vulnerability as defined by the ecosystem for which the record applies.
     */
    @JsonProperty("ecosystemSpecific")
    protected Object ecosystemSpecific;

    /**
     * Optional. JSON object holding additional information about the vulnerability as defined by the database for which the record applies.
     */
    @JsonProperty("databaseSpecific")
    protected Object databaseSpecific;

    /**
     * Optional. Severity of the vulnerability for this package.
     */
    @JsonProperty("severity")
    protected List<OsvSeverity> severity;

    /**
     * Constructs a validated instance of {@link OsvAffected}.
     *
     * @param spec the specification to process
     */
    public OsvAffected(Consumer<OsvAffected> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OsvAffected}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OsvAffected(Consumer)} instead.
     * @param _package _package
     * @param ranges Required. Range information.
     * @param versions Optional. List of affected versions.
     * @param ecosystemSpecific Optional. JSON object holding additional information about the vulnerability as defined by the ecosystem for which the record applies.
     * @param databaseSpecific Optional. JSON object holding additional information about the vulnerability as defined by the database for which the record applies.
     * @param severity Optional. Severity of the vulnerability for this package.
     */
    @ApiStatus.Internal
    public OsvAffected(OsvPackage _package, List<OsvRange> ranges, List<String> versions, Object ecosystemSpecific, Object databaseSpecific, List<OsvSeverity> severity) {
        this._package = _package;
        this.ranges = ranges;
        this.versions = versions;
        this.ecosystemSpecific = ecosystemSpecific;
        this.databaseSpecific = databaseSpecific;
        this.severity = severity;
    }

}
