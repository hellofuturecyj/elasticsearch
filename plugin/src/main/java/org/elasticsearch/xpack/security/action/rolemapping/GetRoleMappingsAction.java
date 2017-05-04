/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.xpack.security.action.rolemapping;

import org.elasticsearch.action.Action;
import org.elasticsearch.client.ElasticsearchClient;

/**
 * Action to retrieve one or more role-mappings from X-Pack security

 * @see org.elasticsearch.xpack.security.authc.support.mapper.NativeRoleMappingStore
 */
public class GetRoleMappingsAction extends Action<GetRoleMappingsRequest, GetRoleMappingsResponse, GetRoleMappingsRequestBuilder> {

    public static final GetRoleMappingsAction INSTANCE = new GetRoleMappingsAction();
    public static final String NAME = "cluster:admin/xpack/security/role_mapping/get";

    private GetRoleMappingsAction() {
        super(NAME);
    }

    @Override
    public GetRoleMappingsRequestBuilder newRequestBuilder(ElasticsearchClient client) {
        return new GetRoleMappingsRequestBuilder(client, this);
    }

    @Override
    public GetRoleMappingsResponse newResponse() {
        return new GetRoleMappingsResponse();
    }
}
