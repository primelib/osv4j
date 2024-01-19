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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OsvPackage
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
    "name",
    "ecosystem",
    "purl"
})
@JsonTypeName("osvPackage")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OsvPackage {

    /**
     * Required. Name of the package. Should match the name used in the package ecosystem (e.g. the npm package name). For C/C++ projects integrated in OSS-Fuzz, this is the name used for the integration.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Required. The ecosystem for this package.
     * For the complete list of valid ecosystem names, see &amp;lt;https://ossf.github.io/osv-schema/#affectedpackage-field&amp;gt;.
     */
    @JsonProperty("ecosystem")
    protected String ecosystem;

    /**
     * Optional. The package URL for this package.
     */
    @JsonProperty("purl")
    protected String purl;

    /**
     * Constructs a validated instance of {@link OsvPackage}.
     *
     * @param spec the specification to process
     */
    public OsvPackage(Consumer<OsvPackage> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OsvPackage}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OsvPackage(Consumer)} instead.
     * @param name Required. Name of the package. Should match the name used in the package ecosystem (e.g. the npm package name). For C/C++ projects integrated in OSS-Fuzz, this is the name used for the integration.
     * @param ecosystem Required. The ecosystem for this package.  For the complete list of valid ecosystem names, see &amp;lt;https://ossf.github.io/osv-schema/#affectedpackage-field&amp;gt;.
     * @param purl Optional. The package URL for this package.
     */
    @ApiStatus.Internal
    public OsvPackage(String name, String ecosystem, String purl) {
        this.name = name;
        this.ecosystem = ecosystem;
        this.purl = purl;
    }

}
