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
 * V1VersionQuery
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
    "fileHashes"
})
@JsonTypeName("v1VersionQuery")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class V1VersionQuery {

    /**
     * The name of the dependency. Can be empty.
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("fileHashes")
    protected List<V1FileHash> fileHashes;

    /**
     * Constructs a validated instance of {@link V1VersionQuery}.
     *
     * @param spec the specification to process
     */
    public V1VersionQuery(Consumer<V1VersionQuery> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link V1VersionQuery}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #V1VersionQuery(Consumer)} instead.
     * @param name The name of the dependency. Can be empty.
     * @param fileHashes fileHashes
     */
    @ApiStatus.Internal
    public V1VersionQuery(String name, List<V1FileHash> fileHashes) {
        this.name = name;
        this.fileHashes = fileHashes;
    }

}
