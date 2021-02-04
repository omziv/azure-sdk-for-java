// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.attestation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.Base64Url;
import com.azure.core.util.CoreUtils;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The result of a policy certificate modification. */
@Fluent
public final class PolicyResult {
    /*
     * The result of the operation
     */
    @JsonProperty(value = "x-ms-policy-result")
    private PolicyModification policyResolution;

    /*
     * The SHA256 hash of the policy object modified
     */
    @JsonProperty(value = "x-ms-policy-token-hash")
    private Base64Url policyTokenHash;

    /*
     * The certificate used to sign the policy object, if specified
     */
    @JsonProperty(value = "x-ms-policy-signer")
    private JsonWebKey policySigner;

    /*
     * A JSON Web Token containing a StoredAttestationPolicy object with the
     * attestation policy
     */
    @JsonProperty(value = "x-ms-policy")
    private String policy;

    /**
     * Get the policyResolution property: The result of the operation.
     *
     * @return the policyResolution value.
     */
    public PolicyModification getPolicyResolution() {
        return this.policyResolution;
    }

    /**
     * Set the policyResolution property: The result of the operation.
     *
     * @param policyResolution the policyResolution value to set.
     * @return the PolicyResult object itself.
     */
    public PolicyResult setPolicyResolution(PolicyModification policyResolution) {
        this.policyResolution = policyResolution;
        return this;
    }

    /**
     * Get the policyTokenHash property: The SHA256 hash of the policy object modified.
     *
     * @return the policyTokenHash value.
     */
    public byte[] getPolicyTokenHash() {
        if (this.policyTokenHash == null) {
            return null;
        }
        return this.policyTokenHash.decodedBytes();
    }

    /**
     * Set the policyTokenHash property: The SHA256 hash of the policy object modified.
     *
     * @param policyTokenHash the policyTokenHash value to set.
     * @return the PolicyResult object itself.
     */
    public PolicyResult setPolicyTokenHash(byte[] policyTokenHash) {
        if (policyTokenHash == null) {
            this.policyTokenHash = null;
        } else {
            this.policyTokenHash = Base64Url.encode(CoreUtils.clone(policyTokenHash));
        }
        return this;
    }

    /**
     * Get the policySigner property: The certificate used to sign the policy object, if specified.
     *
     * @return the policySigner value.
     */
    public JsonWebKey getPolicySigner() {
        return this.policySigner;
    }

    /**
     * Set the policySigner property: The certificate used to sign the policy object, if specified.
     *
     * @param policySigner the policySigner value to set.
     * @return the PolicyResult object itself.
     */
    public PolicyResult setPolicySigner(JsonWebKey policySigner) {
        this.policySigner = policySigner;
        return this;
    }

    /**
     * Get the policy property: A JSON Web Token containing a StoredAttestationPolicy object with the attestation
     * policy.
     *
     * @return the policy value.
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * Set the policy property: A JSON Web Token containing a StoredAttestationPolicy object with the attestation
     * policy.
     *
     * @param policy the policy value to set.
     * @return the PolicyResult object itself.
     */
    public PolicyResult setPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getPolicySigner() != null) {
            getPolicySigner().validate();
        }
    }
}