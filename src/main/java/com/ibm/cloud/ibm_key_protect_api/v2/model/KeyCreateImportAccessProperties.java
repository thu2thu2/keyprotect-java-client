/*
 * (C) Copyright IBM Corp. 2021.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.ibm_key_protect_api.v2.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Data associated with the policy type `keyCreateImportAccess`.
 */
public class KeyCreateImportAccessProperties extends GenericModel {

  @SerializedName("create_root_key")
  protected Boolean createRootKey;
  @SerializedName("create_standard_key")
  protected Boolean createStandardKey;
  @SerializedName("import_root_key")
  protected Boolean importRootKey;
  @SerializedName("import_standard_key")
  protected Boolean importStandardKey;
  @SerializedName("enforce_token")
  protected Boolean enforceToken;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean createRootKey;
    private Boolean createStandardKey;
    private Boolean importRootKey;
    private Boolean importStandardKey;
    private Boolean enforceToken;

    private Builder(KeyCreateImportAccessProperties keyCreateImportAccessProperties) {
      this.createRootKey = keyCreateImportAccessProperties.createRootKey;
      this.createStandardKey = keyCreateImportAccessProperties.createStandardKey;
      this.importRootKey = keyCreateImportAccessProperties.importRootKey;
      this.importStandardKey = keyCreateImportAccessProperties.importStandardKey;
      this.enforceToken = keyCreateImportAccessProperties.enforceToken;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a KeyCreateImportAccessProperties.
     *
     * @return the new KeyCreateImportAccessProperties instance
     */
    public KeyCreateImportAccessProperties build() {
      return new KeyCreateImportAccessProperties(this);
    }

    /**
     * Set the createRootKey.
     *
     * @param createRootKey the createRootKey
     * @return the KeyCreateImportAccessProperties builder
     */
    public Builder createRootKey(Boolean createRootKey) {
      this.createRootKey = createRootKey;
      return this;
    }

    /**
     * Set the createStandardKey.
     *
     * @param createStandardKey the createStandardKey
     * @return the KeyCreateImportAccessProperties builder
     */
    public Builder createStandardKey(Boolean createStandardKey) {
      this.createStandardKey = createStandardKey;
      return this;
    }

    /**
     * Set the importRootKey.
     *
     * @param importRootKey the importRootKey
     * @return the KeyCreateImportAccessProperties builder
     */
    public Builder importRootKey(Boolean importRootKey) {
      this.importRootKey = importRootKey;
      return this;
    }

    /**
     * Set the importStandardKey.
     *
     * @param importStandardKey the importStandardKey
     * @return the KeyCreateImportAccessProperties builder
     */
    public Builder importStandardKey(Boolean importStandardKey) {
      this.importStandardKey = importStandardKey;
      return this;
    }

    /**
     * Set the enforceToken.
     *
     * @param enforceToken the enforceToken
     * @return the KeyCreateImportAccessProperties builder
     */
    public Builder enforceToken(Boolean enforceToken) {
      this.enforceToken = enforceToken;
      return this;
    }
  }

  protected KeyCreateImportAccessProperties(Builder builder) {
    createRootKey = builder.createRootKey;
    createStandardKey = builder.createStandardKey;
    importRootKey = builder.importRootKey;
    importStandardKey = builder.importStandardKey;
    enforceToken = builder.enforceToken;
  }

  /**
   * New builder.
   *
   * @return a KeyCreateImportAccessProperties builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the createRootKey.
   *
   * If set to `false`, the service prevents you or any authorized users from using Key Protect to create root keys in
   * the specified service instance. If set to `true`, Key Protect allows you or any authorized users to create root
   * keys in the instance.
   *
   * **Note:** If omitted, `POST /instance/policies` will set this attribute to the default value (`true`).
   *
   * @return the createRootKey
   */
  public Boolean createRootKey() {
    return createRootKey;
  }

  /**
   * Gets the createStandardKey.
   *
   * If set to `false`, the service prevents you or any authorized users from using Key Protect to create standard keys
   * in the specified service instance. If set to `true`, Key Protect allows you or any authorized users to create
   * standard keys in the instance.
   *
   * **Note:** If omitted, `POST /instance/policies` will set this attribute to the default value (`true`).
   *
   * @return the createStandardKey
   */
  public Boolean createStandardKey() {
    return createStandardKey;
  }

  /**
   * Gets the importRootKey.
   *
   * If set to `false`, the service prevents you or any authorized users from importing root keys into the specified
   * service instance. If set to `true`, Key Protect allows you or any authorized users to import root keys into the
   * instance.
   *
   * **Note:** If omitted, `POST /instance/policies` will set this attribute to the default value (`true`).
   *
   * @return the importRootKey
   */
  public Boolean importRootKey() {
    return importRootKey;
  }

  /**
   * Gets the importStandardKey.
   *
   * If set to `false`, the service prevents you or any authorized users from importing standard keys into the specified
   * service instance. If set to `true`, Key Protect allows you or any authorized users to import standard keys into the
   * instance.
   *
   * **Note:** If omitted, `POST /instance/policies` will set this attribute to the default value (`true`).
   *
   * @return the importStandardKey
   */
  public Boolean importStandardKey() {
    return importStandardKey;
  }

  /**
   * Gets the enforceToken.
   *
   * If set to `true`, the service prevents you or any authorized users from importing key material into the specified
   * service instance without using an import token. If set to `false`, Key Protect allows you or any authorized users
   * to import key material into the instance without the use of an import token.
   *
   * **Note:** If omitted, `POST /instance/policies` will set this attribute to the default value (`false`).
   *
   * @return the enforceToken
   */
  public Boolean enforceToken() {
    return enforceToken;
  }
}

