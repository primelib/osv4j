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
 * OsvSeverity
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
    "score"
})
@JsonTypeName("osvSeverity")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OsvSeverity {

    @JsonProperty("type")
    protected OsvSeverityType type;

    /**
     * The quantitative score.
     */
    @JsonProperty("score")
    protected String score;

    /**
     * Constructs a validated instance of {@link OsvSeverity}.
     *
     * @param spec the specification to process
     */
    public OsvSeverity(Consumer<OsvSeverity> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OsvSeverity}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OsvSeverity(Consumer)} instead.
     * @param type type
     * @param score The quantitative score.
     */
    @ApiStatus.Internal
    public OsvSeverity(OsvSeverityType type, String score) {
        this.type = type;
        this.score = score;
    }

}
