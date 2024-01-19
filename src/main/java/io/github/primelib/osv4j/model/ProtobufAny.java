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
 * ProtobufAny
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
    "typeUrl",
    "value"
})
@JsonTypeName("protobufAny")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProtobufAny {

    @JsonProperty("typeUrl")
    protected String typeUrl;

    @JsonProperty("value")
    protected byte[] value;

    /**
     * Constructs a validated instance of {@link ProtobufAny}.
     *
     * @param spec the specification to process
     */
    public ProtobufAny(Consumer<ProtobufAny> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ProtobufAny}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ProtobufAny(Consumer)} instead.
     * @param typeUrl typeUrl
     * @param value value
     */
    @ApiStatus.Internal
    public ProtobufAny(String typeUrl, byte[] value) {
        this.typeUrl = typeUrl;
        this.value = value;
    }

}
