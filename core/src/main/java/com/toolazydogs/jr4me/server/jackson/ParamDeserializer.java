/**
 * Copyright 2011 (C) The original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.toolazydogs.jr4me.server.jackson;

import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.ObjectMapper;


/**
 *
 */
public abstract class ParamDeserializer
{
    private final String key;
    private final ObjectMapper mapper;

    public ParamDeserializer(String key, ObjectMapper mapper)
    {
        assert key != null;
        assert mapper != null;

        this.key = key;
        this.mapper = mapper;
    }

    public String getKey()
    {
        return key;
    }

    public ObjectMapper getMapper()
    {
        return mapper;
    }

    public abstract Object deserialize(JsonParser parser, DeserializationContext context) throws IOException;
}
