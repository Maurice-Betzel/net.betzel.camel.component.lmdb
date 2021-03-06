package net.betzel.camel.component.lmdb;

/**
 * Copyright 2017 Maurice Betzel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.camel.Endpoint;
import org.apache.camel.impl.UriEndpointComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class LMDbComponent extends UriEndpointComponent {

    private static final Logger LOGGER = LoggerFactory.getLogger(LMDbComponent.class);

    public LMDbComponent(Class<? extends Endpoint> endpointClass) {
        super(endpointClass);
    }

    @Override
    protected Endpoint createEndpoint(String uri, String remaining, Map<String, Object> params) throws Exception {
        Endpoint endpoint = new LMDbEndpoint(uri, this);
        setProperties(endpoint, params);
        return endpoint;
    }

}