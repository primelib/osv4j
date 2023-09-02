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
 * OsvRange
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
    "type",
    "repo",
    "events"
})
@JsonTypeName("osvRange")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OsvRange {

    @JsonProperty("type")
    protected OsvRangeType type;

    /**
     * Required if type is GIT. The publicly accessible URL of the repo that can be directly passed to clone commands.
     */
    @JsonProperty("repo")
    protected String repo;

    /**
     * Required. Version event information.
     */
    @JsonProperty("events")
    protected List<OsvEvent> events;

    /**
     * Constructs a validated instance of {@link OsvRange}.
     *
     * @param spec the specification to process
     */
    public OsvRange(Consumer<OsvRange> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OsvRange}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OsvRange(Consumer)} instead.
     * @param type type
     * @param repo Required if type is GIT. The publicly accessible URL of the repo that can be directly passed to clone commands.
     * @param events Required. Version event information.
     */
    @ApiStatus.Internal
    public OsvRange(OsvRangeType type, String repo, List<OsvEvent> events) {
        this.type = type;
        this.repo = repo;
        this.events = events;
    }

}
