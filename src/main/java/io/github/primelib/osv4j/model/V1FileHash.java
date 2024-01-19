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
 * V1FileHash
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
    "filePath",
    "hashType",
    "hash"
})
@JsonTypeName("v1FileHash")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class V1FileHash {

    /**
     * The file path inside the repository, relative to the repository root.
     */
    @JsonProperty("filePath")
    protected String filePath;

    @JsonProperty("hashType")
    protected String hashType;

    @JsonProperty("hash")
    protected byte[] hash;

    /**
     * Constructs a validated instance of {@link V1FileHash}.
     *
     * @param spec the specification to process
     */
    public V1FileHash(Consumer<V1FileHash> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link V1FileHash}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #V1FileHash(Consumer)} instead.
     * @param filePath The file path inside the repository, relative to the repository root.
     * @param hashType hashType
     * @param hash hash
     */
    @ApiStatus.Internal
    public V1FileHash(String filePath, String hashType, byte[] hash) {
        this.filePath = filePath;
        this.hashType = hashType;
        this.hash = hash;
    }

}
