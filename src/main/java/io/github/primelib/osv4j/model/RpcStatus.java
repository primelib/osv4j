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
 * RpcStatus
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
    "code",
    "message",
    "details"
})
@JsonTypeName("rpcStatus")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RpcStatus {

    @JsonProperty("code")
    protected Integer code;

    @JsonProperty("message")
    protected String message;

    @JsonProperty("details")
    protected List<ProtobufAny> details;

    /**
     * Constructs a validated instance of {@link RpcStatus}.
     *
     * @param spec the specification to process
     */
    public RpcStatus(Consumer<RpcStatus> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RpcStatus}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RpcStatus(Consumer)} instead.
     * @param code code
     * @param message message
     * @param details details
     */
    @ApiStatus.Internal
    public RpcStatus(Integer code, String message, List<ProtobufAny> details) {
        this.code = code;
        this.message = message;
        this.details = details;
    }

}
