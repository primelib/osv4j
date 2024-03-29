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
 * V1VersionMatchList
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
    "matches"
})
@JsonTypeName("v1VersionMatchList")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class V1VersionMatchList {

    @JsonProperty("matches")
    protected List<V1VersionMatch> matches;

    /**
     * Constructs a validated instance of {@link V1VersionMatchList}.
     *
     * @param spec the specification to process
     */
    public V1VersionMatchList(Consumer<V1VersionMatchList> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link V1VersionMatchList}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #V1VersionMatchList(Consumer)} instead.
     * @param matches matches
     */
    @ApiStatus.Internal
    public V1VersionMatchList(List<V1VersionMatch> matches) {
        this.matches = matches;
    }

}
