/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Interact with Ignite Atomic Sequences and ID Generators .
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface IgniteIdGenEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Ignite ID Generator component.
     */
    public interface IgniteIdGenEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedIgniteIdGenEndpointBuilder advanced() {
            return (AdvancedIgniteIdGenEndpointBuilder) this;
        }
        /**
         * The batch size.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default IgniteIdGenEndpointBuilder batchSize(Integer batchSize) {
            doSetProperty("batchSize", batchSize);
            return this;
        }
        /**
         * The batch size.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: producer
         */
        default IgniteIdGenEndpointBuilder batchSize(String batchSize) {
            doSetProperty("batchSize", batchSize);
            return this;
        }
        /**
         * The initial value.
         * 
         * The option is a: <code>java.lang.Long</code> type.
         * 
         * Default: 0
         * Group: producer
         */
        default IgniteIdGenEndpointBuilder initialValue(Long initialValue) {
            doSetProperty("initialValue", initialValue);
            return this;
        }
        /**
         * The initial value.
         * 
         * The option will be converted to a <code>java.lang.Long</code> type.
         * 
         * Default: 0
         * Group: producer
         */
        default IgniteIdGenEndpointBuilder initialValue(String initialValue) {
            doSetProperty("initialValue", initialValue);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default IgniteIdGenEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default IgniteIdGenEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The operation to invoke on the Ignite ID Generator. Superseded by the
         * IgniteConstants.IGNITE_IDGEN_OPERATION header in the IN message.
         * Possible values: ADD_AND_GET, GET, GET_AND_ADD, GET_AND_INCREMENT,
         * INCREMENT_AND_GET.
         * 
         * The option is a:
         * <code>org.apache.camel.component.ignite.idgen.IgniteIdGenOperation</code> type.
         * 
         * Group: producer
         */
        default IgniteIdGenEndpointBuilder operation(
                IgniteIdGenOperation operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The operation to invoke on the Ignite ID Generator. Superseded by the
         * IgniteConstants.IGNITE_IDGEN_OPERATION header in the IN message.
         * Possible values: ADD_AND_GET, GET, GET_AND_ADD, GET_AND_INCREMENT,
         * INCREMENT_AND_GET.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.ignite.idgen.IgniteIdGenOperation</code> type.
         * 
         * Group: producer
         */
        default IgniteIdGenEndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Sets whether to propagate the incoming body if the return type of the
         * underlying Ignite operation is void.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default IgniteIdGenEndpointBuilder propagateIncomingBodyIfNoReturnValue(
                boolean propagateIncomingBodyIfNoReturnValue) {
            doSetProperty("propagateIncomingBodyIfNoReturnValue", propagateIncomingBodyIfNoReturnValue);
            return this;
        }
        /**
         * Sets whether to propagate the incoming body if the return type of the
         * underlying Ignite operation is void.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default IgniteIdGenEndpointBuilder propagateIncomingBodyIfNoReturnValue(
                String propagateIncomingBodyIfNoReturnValue) {
            doSetProperty("propagateIncomingBodyIfNoReturnValue", propagateIncomingBodyIfNoReturnValue);
            return this;
        }
        /**
         * Sets whether to treat Collections as cache objects or as Collections
         * of items to insert/update/compute, etc.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default IgniteIdGenEndpointBuilder treatCollectionsAsCacheObjects(
                boolean treatCollectionsAsCacheObjects) {
            doSetProperty("treatCollectionsAsCacheObjects", treatCollectionsAsCacheObjects);
            return this;
        }
        /**
         * Sets whether to treat Collections as cache objects or as Collections
         * of items to insert/update/compute, etc.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default IgniteIdGenEndpointBuilder treatCollectionsAsCacheObjects(
                String treatCollectionsAsCacheObjects) {
            doSetProperty("treatCollectionsAsCacheObjects", treatCollectionsAsCacheObjects);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Ignite ID Generator component.
     */
    public interface AdvancedIgniteIdGenEndpointBuilder
            extends
                EndpointProducerBuilder {
        default IgniteIdGenEndpointBuilder basic() {
            return (IgniteIdGenEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedIgniteIdGenEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedIgniteIdGenEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedIgniteIdGenEndpointBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedIgniteIdGenEndpointBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.ignite.idgen.IgniteIdGenOperation</code>
     * enum.
     */
    enum IgniteIdGenOperation {
        ADD_AND_GET,
        GET,
        GET_AND_ADD,
        GET_AND_INCREMENT,
        INCREMENT_AND_GET;
    }

    public interface IgniteIdGenBuilders {
        /**
         * Ignite ID Generator (camel-ignite)
         * Interact with Ignite Atomic Sequences and ID Generators .
         * 
         * Category: compute
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-ignite
         * 
         * Syntax: <code>ignite-idgen:name</code>
         * 
         * Path parameter: name (required)
         * The sequence name.
         * 
         * @param path name
         */
        default IgniteIdGenEndpointBuilder igniteIdgen(String path) {
            return IgniteIdGenEndpointBuilderFactory.endpointBuilder("ignite-idgen", path);
        }
        /**
         * Ignite ID Generator (camel-ignite)
         * Interact with Ignite Atomic Sequences and ID Generators .
         * 
         * Category: compute
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-ignite
         * 
         * Syntax: <code>ignite-idgen:name</code>
         * 
         * Path parameter: name (required)
         * The sequence name.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path name
         */
        default IgniteIdGenEndpointBuilder igniteIdgen(
                String componentName,
                String path) {
            return IgniteIdGenEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static IgniteIdGenEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class IgniteIdGenEndpointBuilderImpl extends AbstractEndpointBuilder implements IgniteIdGenEndpointBuilder, AdvancedIgniteIdGenEndpointBuilder {
            public IgniteIdGenEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new IgniteIdGenEndpointBuilderImpl(path);
    }
}