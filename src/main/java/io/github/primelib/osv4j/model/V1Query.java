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
 * V1Query
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
    "commit",
    "version",
    "package",
    "pageToken"
})
@JsonTypeName("v1Query")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class V1Query {

    /**
     * The commit hash to query for. If specified, {@code version} should not be set.
     */
    @JsonProperty("commit")
    protected String commit;

    /**
     * The version string to query for. A fuzzy match is done against upstream versions. If specified, {@code commit} should not be set.
     */
    @JsonProperty("version")
    protected String version;

    @JsonProperty("package")
    protected OsvPackage _package;

    @JsonProperty("pageToken")
    protected String pageToken;

    /**
     * Constructs a validated instance of {@link V1Query}.
     *
     * @param spec the specification to process
     */
    public V1Query(Consumer<V1Query> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link V1Query}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #V1Query(Consumer)} instead.
     * @param commit The commit hash to query for. If specified, {@code version} should not be set.
     * @param version The version string to query for. A fuzzy match is done against upstream versions. If specified, {@code commit} should not be set.
     * @param _package _package
     * @param pageToken pageToken
     */
    @ApiStatus.Internal
    public V1Query(String commit, String version, OsvPackage _package, String pageToken) {
        this.commit = commit;
        this.version = version;
        this._package = _package;
        this.pageToken = pageToken;
    }

}
