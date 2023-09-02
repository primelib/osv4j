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
 * V1BatchQuery
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
    "queries"
})
@JsonTypeName("v1BatchQuery")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class V1BatchQuery {

    /**
     * The queries that form this batch query.
     */
    @JsonProperty("queries")
    protected List<V1Query> queries;

    /**
     * Constructs a validated instance of {@link V1BatchQuery}.
     *
     * @param spec the specification to process
     */
    public V1BatchQuery(Consumer<V1BatchQuery> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link V1BatchQuery}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #V1BatchQuery(Consumer)} instead.
     * @param queries The queries that form this batch query.
     */
    @ApiStatus.Internal
    public V1BatchQuery(List<V1Query> queries) {
        this.queries = queries;
    }

}
