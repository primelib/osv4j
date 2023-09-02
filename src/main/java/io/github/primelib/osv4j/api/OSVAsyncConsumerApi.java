package io.github.primelib.osv4j.api;

import java.util.List;
import javax.annotation.processing.Generated;

import io.github.primelib.osv4j.model.OsvVulnerability;
import io.github.primelib.osv4j.model.V1BatchVulnerabilityList;
import io.github.primelib.osv4j.model.V1VersionMatchList;
import io.github.primelib.osv4j.model.V1VulnerabilityList;
import java.util.concurrent.CompletableFuture;

import java.util.function.Consumer;

import io.github.primelib.osv4j.spec.DetermineVersionOperationSpec;
import io.github.primelib.osv4j.spec.GetVulnByIdOperationSpec;
import io.github.primelib.osv4j.spec.QueryAffectedOperationSpec;
import io.github.primelib.osv4j.spec.QueryAffectedBatchOperationSpec;

@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OSVAsyncConsumerApi {
    private final OSVAsyncApi api;

    public OSVAsyncConsumerApi(OSVAsyncApi api) {
        this.api = api;
    }

    /**
     * Determine the version of the provided hash values.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public CompletableFuture<V1VersionMatchList> determineVersion(Consumer<DetermineVersionOperationSpec> spec) {
        DetermineVersionOperationSpec r = new DetermineVersionOperationSpec(spec);
        return api.determineVersion(r.body());
    }

    /**
     * Return a {@code Vulnerability} object for a given OSV ID.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: </li>
     * </ul>
     */
    public CompletableFuture<OsvVulnerability> getVulnById(Consumer<GetVulnByIdOperationSpec> spec) {
        GetVulnByIdOperationSpec r = new GetVulnByIdOperationSpec(spec);
        return api.getVulnById(r.id());
    }

    /**
     * Query vulnerabilities for a particular project at a given commit or version.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public CompletableFuture<V1VulnerabilityList> queryAffected(Consumer<QueryAffectedOperationSpec> spec) {
        QueryAffectedOperationSpec r = new QueryAffectedOperationSpec(spec);
        return api.queryAffected(r.body());
    }

    /**
     * Query vulnerabilities (batched) for given package versions and commits. This currently allows a maximum of 1000 package versions to be included in a single query.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public CompletableFuture<V1BatchVulnerabilityList> queryAffectedBatch(Consumer<QueryAffectedBatchOperationSpec> spec) {
        QueryAffectedBatchOperationSpec r = new QueryAffectedBatchOperationSpec(spec);
        return api.queryAffectedBatch(r.body());
    }

}
