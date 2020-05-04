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
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * Send and receive messages to/from Guava EventBus.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface GuavaEventBusEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Guava EventBus component.
     */
    public interface GuavaEventBusEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedGuavaEventBusEndpointConsumerBuilder advanced() {
            return (AdvancedGuavaEventBusEndpointConsumerBuilder) this;
        }
        /**
         * If used on the consumer side of the route, will filter events
         * received from the EventBus to the instances of the class and
         * superclasses of eventClass. Null value of this option is equal to
         * setting it to the java.lang.Object i.e. the consumer will capture all
         * messages incoming to the event bus. This option cannot be used
         * together with listenerInterface option.
         * 
         * The option is a: <code>java.lang.Class&lt;java.lang.Object&gt;</code>
         * type.
         * 
         * Group: common
         */
        default GuavaEventBusEndpointConsumerBuilder eventClass(
                Class<Object> eventClass) {
            doSetProperty("eventClass", eventClass);
            return this;
        }
        /**
         * If used on the consumer side of the route, will filter events
         * received from the EventBus to the instances of the class and
         * superclasses of eventClass. Null value of this option is equal to
         * setting it to the java.lang.Object i.e. the consumer will capture all
         * messages incoming to the event bus. This option cannot be used
         * together with listenerInterface option.
         * 
         * The option will be converted to a
         * <code>java.lang.Class&lt;java.lang.Object&gt;</code> type.
         * 
         * Group: common
         */
        default GuavaEventBusEndpointConsumerBuilder eventClass(
                String eventClass) {
            doSetProperty("eventClass", eventClass);
            return this;
        }
        /**
         * The interface with method(s) marked with the Subscribe annotation.
         * Dynamic proxy will be created over the interface so it could be
         * registered as the EventBus listener. Particularly useful when
         * creating multi-event listeners and for handling DeadEvent properly.
         * This option cannot be used together with eventClass option.
         * 
         * The option is a: <code>java.lang.Class&lt;java.lang.Object&gt;</code>
         * type.
         * 
         * Group: common
         */
        default GuavaEventBusEndpointConsumerBuilder listenerInterface(
                Class<Object> listenerInterface) {
            doSetProperty("listenerInterface", listenerInterface);
            return this;
        }
        /**
         * The interface with method(s) marked with the Subscribe annotation.
         * Dynamic proxy will be created over the interface so it could be
         * registered as the EventBus listener. Particularly useful when
         * creating multi-event listeners and for handling DeadEvent properly.
         * This option cannot be used together with eventClass option.
         * 
         * The option will be converted to a
         * <code>java.lang.Class&lt;java.lang.Object&gt;</code> type.
         * 
         * Group: common
         */
        default GuavaEventBusEndpointConsumerBuilder listenerInterface(
                String listenerInterface) {
            doSetProperty("listenerInterface", listenerInterface);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default GuavaEventBusEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default GuavaEventBusEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Guava EventBus component.
     */
    public interface AdvancedGuavaEventBusEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default GuavaEventBusEndpointConsumerBuilder basic() {
            return (GuavaEventBusEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedGuavaEventBusEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedGuavaEventBusEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedGuavaEventBusEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedGuavaEventBusEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
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
        default AdvancedGuavaEventBusEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedGuavaEventBusEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedGuavaEventBusEndpointConsumerBuilder synchronous(
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
        default AdvancedGuavaEventBusEndpointConsumerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Guava EventBus component.
     */
    public interface GuavaEventBusEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedGuavaEventBusEndpointProducerBuilder advanced() {
            return (AdvancedGuavaEventBusEndpointProducerBuilder) this;
        }
        /**
         * If used on the consumer side of the route, will filter events
         * received from the EventBus to the instances of the class and
         * superclasses of eventClass. Null value of this option is equal to
         * setting it to the java.lang.Object i.e. the consumer will capture all
         * messages incoming to the event bus. This option cannot be used
         * together with listenerInterface option.
         * 
         * The option is a: <code>java.lang.Class&lt;java.lang.Object&gt;</code>
         * type.
         * 
         * Group: common
         */
        default GuavaEventBusEndpointProducerBuilder eventClass(
                Class<Object> eventClass) {
            doSetProperty("eventClass", eventClass);
            return this;
        }
        /**
         * If used on the consumer side of the route, will filter events
         * received from the EventBus to the instances of the class and
         * superclasses of eventClass. Null value of this option is equal to
         * setting it to the java.lang.Object i.e. the consumer will capture all
         * messages incoming to the event bus. This option cannot be used
         * together with listenerInterface option.
         * 
         * The option will be converted to a
         * <code>java.lang.Class&lt;java.lang.Object&gt;</code> type.
         * 
         * Group: common
         */
        default GuavaEventBusEndpointProducerBuilder eventClass(
                String eventClass) {
            doSetProperty("eventClass", eventClass);
            return this;
        }
        /**
         * The interface with method(s) marked with the Subscribe annotation.
         * Dynamic proxy will be created over the interface so it could be
         * registered as the EventBus listener. Particularly useful when
         * creating multi-event listeners and for handling DeadEvent properly.
         * This option cannot be used together with eventClass option.
         * 
         * The option is a: <code>java.lang.Class&lt;java.lang.Object&gt;</code>
         * type.
         * 
         * Group: common
         */
        default GuavaEventBusEndpointProducerBuilder listenerInterface(
                Class<Object> listenerInterface) {
            doSetProperty("listenerInterface", listenerInterface);
            return this;
        }
        /**
         * The interface with method(s) marked with the Subscribe annotation.
         * Dynamic proxy will be created over the interface so it could be
         * registered as the EventBus listener. Particularly useful when
         * creating multi-event listeners and for handling DeadEvent properly.
         * This option cannot be used together with eventClass option.
         * 
         * The option will be converted to a
         * <code>java.lang.Class&lt;java.lang.Object&gt;</code> type.
         * 
         * Group: common
         */
        default GuavaEventBusEndpointProducerBuilder listenerInterface(
                String listenerInterface) {
            doSetProperty("listenerInterface", listenerInterface);
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
        default GuavaEventBusEndpointProducerBuilder lazyStartProducer(
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
        default GuavaEventBusEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Guava EventBus component.
     */
    public interface AdvancedGuavaEventBusEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default GuavaEventBusEndpointProducerBuilder basic() {
            return (GuavaEventBusEndpointProducerBuilder) this;
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
        default AdvancedGuavaEventBusEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedGuavaEventBusEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedGuavaEventBusEndpointProducerBuilder synchronous(
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
        default AdvancedGuavaEventBusEndpointProducerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Guava EventBus component.
     */
    public interface GuavaEventBusEndpointBuilder
            extends
                GuavaEventBusEndpointConsumerBuilder,
                GuavaEventBusEndpointProducerBuilder {
        default AdvancedGuavaEventBusEndpointBuilder advanced() {
            return (AdvancedGuavaEventBusEndpointBuilder) this;
        }
        /**
         * If used on the consumer side of the route, will filter events
         * received from the EventBus to the instances of the class and
         * superclasses of eventClass. Null value of this option is equal to
         * setting it to the java.lang.Object i.e. the consumer will capture all
         * messages incoming to the event bus. This option cannot be used
         * together with listenerInterface option.
         * 
         * The option is a: <code>java.lang.Class&lt;java.lang.Object&gt;</code>
         * type.
         * 
         * Group: common
         */
        default GuavaEventBusEndpointBuilder eventClass(Class<Object> eventClass) {
            doSetProperty("eventClass", eventClass);
            return this;
        }
        /**
         * If used on the consumer side of the route, will filter events
         * received from the EventBus to the instances of the class and
         * superclasses of eventClass. Null value of this option is equal to
         * setting it to the java.lang.Object i.e. the consumer will capture all
         * messages incoming to the event bus. This option cannot be used
         * together with listenerInterface option.
         * 
         * The option will be converted to a
         * <code>java.lang.Class&lt;java.lang.Object&gt;</code> type.
         * 
         * Group: common
         */
        default GuavaEventBusEndpointBuilder eventClass(String eventClass) {
            doSetProperty("eventClass", eventClass);
            return this;
        }
        /**
         * The interface with method(s) marked with the Subscribe annotation.
         * Dynamic proxy will be created over the interface so it could be
         * registered as the EventBus listener. Particularly useful when
         * creating multi-event listeners and for handling DeadEvent properly.
         * This option cannot be used together with eventClass option.
         * 
         * The option is a: <code>java.lang.Class&lt;java.lang.Object&gt;</code>
         * type.
         * 
         * Group: common
         */
        default GuavaEventBusEndpointBuilder listenerInterface(
                Class<Object> listenerInterface) {
            doSetProperty("listenerInterface", listenerInterface);
            return this;
        }
        /**
         * The interface with method(s) marked with the Subscribe annotation.
         * Dynamic proxy will be created over the interface so it could be
         * registered as the EventBus listener. Particularly useful when
         * creating multi-event listeners and for handling DeadEvent properly.
         * This option cannot be used together with eventClass option.
         * 
         * The option will be converted to a
         * <code>java.lang.Class&lt;java.lang.Object&gt;</code> type.
         * 
         * Group: common
         */
        default GuavaEventBusEndpointBuilder listenerInterface(
                String listenerInterface) {
            doSetProperty("listenerInterface", listenerInterface);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Guava EventBus component.
     */
    public interface AdvancedGuavaEventBusEndpointBuilder
            extends
                AdvancedGuavaEventBusEndpointConsumerBuilder,
                AdvancedGuavaEventBusEndpointProducerBuilder {
        default GuavaEventBusEndpointBuilder basic() {
            return (GuavaEventBusEndpointBuilder) this;
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
        default AdvancedGuavaEventBusEndpointBuilder basicPropertyBinding(
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
        default AdvancedGuavaEventBusEndpointBuilder basicPropertyBinding(
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
        default AdvancedGuavaEventBusEndpointBuilder synchronous(
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
        default AdvancedGuavaEventBusEndpointBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface GuavaEventBusBuilders {
        /**
         * Guava EventBus (camel-guava-eventbus)
         * Send and receive messages to/from Guava EventBus.
         * 
         * Category: eventbus
         * Since: 2.10
         * Maven coordinates: org.apache.camel:camel-guava-eventbus
         * 
         * Syntax: <code>guava-eventbus:eventBusRef</code>
         * 
         * Path parameter: eventBusRef
         * To lookup the Guava EventBus from the registry with the given name
         */
        default GuavaEventBusEndpointBuilder guavaEventbus(String path) {
            return GuavaEventBusEndpointBuilderFactory.guavaEventbus(path);
        }
    }
    /**
     * Guava EventBus (camel-guava-eventbus)
     * Send and receive messages to/from Guava EventBus.
     * 
     * Category: eventbus
     * Since: 2.10
     * Maven coordinates: org.apache.camel:camel-guava-eventbus
     * 
     * Syntax: <code>guava-eventbus:eventBusRef</code>
     * 
     * Path parameter: eventBusRef
     * To lookup the Guava EventBus from the registry with the given name
     */
    static GuavaEventBusEndpointBuilder guavaEventbus(String path) {
        class GuavaEventBusEndpointBuilderImpl extends AbstractEndpointBuilder implements GuavaEventBusEndpointBuilder, AdvancedGuavaEventBusEndpointBuilder {
            public GuavaEventBusEndpointBuilderImpl(String path) {
                super("guava-eventbus", path);
            }
        }
        return new GuavaEventBusEndpointBuilderImpl(path);
    }
}