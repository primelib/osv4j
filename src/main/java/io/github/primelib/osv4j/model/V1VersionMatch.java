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
 * V1VersionMatch
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
    "score",
    "repoInfo",
    "osvIdentifier",
    "cpe23"
})
@JsonTypeName("v1VersionMatch")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class V1VersionMatch {

    /**
     * Score in the interval (0.0, 1.0] with 1.0 being a perfect match.
     */
    @JsonProperty("score")
    protected Double score;

    @JsonProperty("repoInfo")
    protected V1VersionRepositoryInformation repoInfo;

    @JsonProperty("osvIdentifier")
    protected OsvPackage osvIdentifier;

    /**
     * CPE 2.3.
     */
    @JsonProperty("cpe23")
    protected String cpe23;

    /**
     * Constructs a validated instance of {@link V1VersionMatch}.
     *
     * @param spec the specification to process
     */
    public V1VersionMatch(Consumer<V1VersionMatch> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link V1VersionMatch}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #V1VersionMatch(Consumer)} instead.
     * @param score Score in the interval (0.0, 1.0] with 1.0 being a perfect match.
     * @param repoInfo repoInfo
     * @param osvIdentifier osvIdentifier
     * @param cpe23 CPE 2.3.
     */
    @ApiStatus.Internal
    public V1VersionMatch(Double score, V1VersionRepositoryInformation repoInfo, OsvPackage osvIdentifier, String cpe23) {
        this.score = score;
        this.repoInfo = repoInfo;
        this.osvIdentifier = osvIdentifier;
        this.cpe23 = cpe23;
    }

}
