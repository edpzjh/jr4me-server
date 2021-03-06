/**
 * Copyright 2012 (C) The original author or authors
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
package com.acme.service;

import com.acme.model.Car;
import com.acme.model.Carriage;
import com.acme.model.Vehicle;
import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;

import com.toolazydogs.jr4me.api.Method;
import com.toolazydogs.jr4me.api.Param;


/**
 * @author Alan D. Cabrera
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
              include = JsonTypeInfo.As.PROPERTY,
              property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = Car.class, name = "car"),
               @JsonSubTypes.Type(value = Carriage.class, name = "carriage")})
public interface FooBar
{
    @Method(name = "register")
    public String fooMethod(@Param(name = "name") String param, @Param(name = "vehicle") Vehicle vehicle);
}
