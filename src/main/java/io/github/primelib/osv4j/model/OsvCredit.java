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
 * OsvCredit
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
    "contact",
    "type"
})
@JsonTypeName("osvCredit")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OsvCredit {

    /**
     * The name to give credit to.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Contact methods (URLs).
     */
    @JsonProperty("contact")
    protected List<String> contact;

    @JsonProperty("type")
    protected OsvCreditType type;

    /**
     * Constructs a validated instance of {@link OsvCredit}.
     *
     * @param spec the specification to process
     */
    public OsvCredit(Consumer<OsvCredit> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OsvCredit}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OsvCredit(Consumer)} instead.
     * @param name The name to give credit to.
     * @param contact Contact methods (URLs).
     * @param type type
     */
    @ApiStatus.Internal
    public OsvCredit(String name, List<String> contact, OsvCreditType type) {
        this.name = name;
        this.contact = contact;
        this.type = type;
    }

}
