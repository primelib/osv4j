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
 * OsvEvent
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
    "introduced",
    "fixed",
    "limit",
    "lastAffected"
})
@JsonTypeName("osvEvent")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OsvEvent {

    /**
     * The earliest version/commit where this vulnerability was introduced in.
     */
    @JsonProperty("introduced")
    protected String introduced;

    /**
     * The version/commit that this vulnerability was fixed in.
     */
    @JsonProperty("fixed")
    protected String fixed;

    /**
     * The limit to apply to the range.
     */
    @JsonProperty("limit")
    protected String limit;

    /**
     * The last affected version.
     */
    @JsonProperty("lastAffected")
    protected String lastAffected;

    /**
     * Constructs a validated instance of {@link OsvEvent}.
     *
     * @param spec the specification to process
     */
    public OsvEvent(Consumer<OsvEvent> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OsvEvent}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OsvEvent(Consumer)} instead.
     * @param introduced The earliest version/commit where this vulnerability was introduced in.
     * @param fixed The version/commit that this vulnerability was fixed in.
     * @param limit The limit to apply to the range.
     * @param lastAffected The last affected version.
     */
    @ApiStatus.Internal
    public OsvEvent(String introduced, String fixed, String limit, String lastAffected) {
        this.introduced = introduced;
        this.fixed = fixed;
        this.limit = limit;
        this.lastAffected = lastAffected;
    }

}
