package io.github.primelib.osv4j.api;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.osv4j.model.OsvVulnerability;
import io.github.primelib.osv4j.model.V1BatchQuery;
import io.github.primelib.osv4j.model.V1BatchVulnerabilityList;
import io.github.primelib.osv4j.model.V1Query;
import io.github.primelib.osv4j.model.V1VersionMatchList;
import io.github.primelib.osv4j.model.V1VersionQuery;
import io.github.primelib.osv4j.model.V1VulnerabilityList;
import java.util.concurrent.CompletableFuture;
import feign.RequestLine;
import feign.Param;
import feign.Headers;

@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public interface OSVAsyncApi {

    /**
     * Determine the version of the provided hash values.
     *
     * @param body                  (required)
     */
    @RequestLine("POST /v1experimental/determineversion")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<V1VersionMatchList> determineVersion(@NotNull V1VersionQuery body);

    /**
     * Return a {@code Vulnerability} object for a given OSV ID.
     *
     * @param id                    (required)
     */
    @RequestLine("GET /v1/vulns/{id}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<OsvVulnerability> getVulnById(@Param("id") @NotNull String id);

    /**
     * Query vulnerabilities for a particular project at a given commit or version.
     *
     * @param body                  (required)
     */
    @RequestLine("POST /v1/query")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<V1VulnerabilityList> queryAffected(@NotNull V1Query body);

    /**
     * Query vulnerabilities (batched) for given package versions and commits. This currently allows a maximum of 1000 package versions to be included in a single query.
     *
     * @param body                  (required)
     */
    @RequestLine("POST /v1/querybatch")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<V1BatchVulnerabilityList> queryAffectedBatch(@NotNull V1BatchQuery body);

}
