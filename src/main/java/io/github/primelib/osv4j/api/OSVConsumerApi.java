package io.github.primelib.osv4j.api;

import java.util.List;
import javax.annotation.processing.Generated;

import io.github.primelib.osv4j.model.OsvVulnerability;
import io.github.primelib.osv4j.model.V1BatchVulnerabilityList;
import io.github.primelib.osv4j.model.V1VersionMatchList;
import io.github.primelib.osv4j.model.V1VulnerabilityList;

import java.util.function.Consumer;

import io.github.primelib.osv4j.spec.OSVDetermineVersionOperationSpec;
import io.github.primelib.osv4j.spec.OSVGetVulnByIdOperationSpec;
import io.github.primelib.osv4j.spec.OSVQueryAffectedOperationSpec;
import io.github.primelib.osv4j.spec.OSVQueryAffectedBatchOperationSpec;

@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OSVConsumerApi {
    private final OSVApi api;

    public OSVConsumerApi(OSVApi api) {
        this.api = api;
    }

    /**
     * Determine the version of the provided hash values.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public V1VersionMatchList oSVDetermineVersion(Consumer<OSVDetermineVersionOperationSpec> spec) {
        OSVDetermineVersionOperationSpec r = new OSVDetermineVersionOperationSpec(spec);
        return api.oSVDetermineVersion(r.body());
    }

    /**
     * Return a {@code Vulnerability} object for a given OSV ID.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: </li>
     * </ul>
     */
    public OsvVulnerability oSVGetVulnById(Consumer<OSVGetVulnByIdOperationSpec> spec) {
        OSVGetVulnByIdOperationSpec r = new OSVGetVulnByIdOperationSpec(spec);
        return api.oSVGetVulnById(r.id());
    }

    /**
     * Query vulnerabilities for a particular project at a given commit or version.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public V1VulnerabilityList oSVQueryAffected(Consumer<OSVQueryAffectedOperationSpec> spec) {
        OSVQueryAffectedOperationSpec r = new OSVQueryAffectedOperationSpec(spec);
        return api.oSVQueryAffected(r.body());
    }

    /**
     * Query vulnerabilities (batched) for given package versions and commits. This currently allows a maximum of 1000 package versions to be included in a single query.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public V1BatchVulnerabilityList oSVQueryAffectedBatch(Consumer<OSVQueryAffectedBatchOperationSpec> spec) {
        OSVQueryAffectedBatchOperationSpec r = new OSVQueryAffectedBatchOperationSpec(spec);
        return api.oSVQueryAffectedBatch(r.body());
    }

}
