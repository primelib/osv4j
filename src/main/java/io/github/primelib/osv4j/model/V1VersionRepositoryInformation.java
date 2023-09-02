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
 * V1VersionRepositoryInformation
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
    "address",
    "commit",
    "tag",
    "version"
})
@JsonTypeName("v1VersionRepositoryInformation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class V1VersionRepositoryInformation {

    @JsonProperty("type")
    protected V1VersionRepositoryInformationRepoType type;

    /**
     * Source address of the repository.
     */
    @JsonProperty("address")
    protected String address;

    /**
     * Commit hash.
     */
    @JsonProperty("commit")
    protected byte[] commit;

    @JsonProperty("tag")
    protected String tag;

    @JsonProperty("version")
    protected String version;

    /**
     * Constructs a validated instance of {@link V1VersionRepositoryInformation}.
     *
     * @param spec the specification to process
     */
    public V1VersionRepositoryInformation(Consumer<V1VersionRepositoryInformation> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link V1VersionRepositoryInformation}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #V1VersionRepositoryInformation(Consumer)} instead.
     * @param type type
     * @param address Source address of the repository.
     * @param commit Commit hash.
     * @param tag tag
     * @param version version
     */
    @ApiStatus.Internal
    public V1VersionRepositoryInformation(V1VersionRepositoryInformationRepoType type, String address, byte[] commit, String tag, String version) {
        this.type = type;
        this.address = address;
        this.commit = commit;
        this.tag = tag;
        this.version = version;
    }

}
