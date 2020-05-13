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
 * Send and receive messages to/from Google Cloud Platform PubSub Service.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface GooglePubsubEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Google Pubsub component.
     */
    public interface GooglePubsubEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedGooglePubsubEndpointConsumerBuilder advanced() {
            return (AdvancedGooglePubsubEndpointConsumerBuilder) this;
        }
        /**
         * AUTO = exchange gets ack'ed/nack'ed on completion. NONE = downstream
         * process has to ack/nack explicitly.
         * 
         * The option is a:
         * <code>org.apache.camel.component.google.pubsub.GooglePubsubConstants$AckMode</code> type.
         * 
         * Default: AUTO
         * Group: common
         */
        default GooglePubsubEndpointConsumerBuilder ackMode(AckMode ackMode) {
            doSetProperty("ackMode", ackMode);
            return this;
        }
        /**
         * AUTO = exchange gets ack'ed/nack'ed on completion. NONE = downstream
         * process has to ack/nack explicitly.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.google.pubsub.GooglePubsubConstants$AckMode</code> type.
         * 
         * Default: AUTO
         * Group: common
         */
        default GooglePubsubEndpointConsumerBuilder ackMode(String ackMode) {
            doSetProperty("ackMode", ackMode);
            return this;
        }
        /**
         * The number of parallel streams consuming from the subscription.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Default: 1
         * Group: common
         */
        default GooglePubsubEndpointConsumerBuilder concurrentConsumers(
                Integer concurrentConsumers) {
            doSetProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * The number of parallel streams consuming from the subscription.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Default: 1
         * Group: common
         */
        default GooglePubsubEndpointConsumerBuilder concurrentConsumers(
                String concurrentConsumers) {
            doSetProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * Logger ID to use when a match to the parent route required.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GooglePubsubEndpointConsumerBuilder loggerId(String loggerId) {
            doSetProperty("loggerId", loggerId);
            return this;
        }
        /**
         * The max number of messages to receive from the server in a single API
         * call.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Default: 1
         * Group: common
         */
        default GooglePubsubEndpointConsumerBuilder maxMessagesPerPoll(
                Integer maxMessagesPerPoll) {
            doSetProperty("maxMessagesPerPoll", maxMessagesPerPoll);
            return this;
        }
        /**
         * The max number of messages to receive from the server in a single API
         * call.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Default: 1
         * Group: common
         */
        default GooglePubsubEndpointConsumerBuilder maxMessagesPerPoll(
                String maxMessagesPerPoll) {
            doSetProperty("maxMessagesPerPoll", maxMessagesPerPoll);
            return this;
        }
        /**
         * Synchronously pull batches of messages.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default GooglePubsubEndpointConsumerBuilder synchronousPull(
                boolean synchronousPull) {
            doSetProperty("synchronousPull", synchronousPull);
            return this;
        }
        /**
         * Synchronously pull batches of messages.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default GooglePubsubEndpointConsumerBuilder synchronousPull(
                String synchronousPull) {
            doSetProperty("synchronousPull", synchronousPull);
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
        default GooglePubsubEndpointConsumerBuilder bridgeErrorHandler(
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
        default GooglePubsubEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Google Pubsub component.
     */
    public interface AdvancedGooglePubsubEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default GooglePubsubEndpointConsumerBuilder basic() {
            return (GooglePubsubEndpointConsumerBuilder) this;
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
        default AdvancedGooglePubsubEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedGooglePubsubEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedGooglePubsubEndpointConsumerBuilder exchangePattern(
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
        default AdvancedGooglePubsubEndpointConsumerBuilder exchangePattern(
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
        default AdvancedGooglePubsubEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedGooglePubsubEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedGooglePubsubEndpointConsumerBuilder synchronous(
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
        default AdvancedGooglePubsubEndpointConsumerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Google Pubsub component.
     */
    public interface GooglePubsubEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedGooglePubsubEndpointProducerBuilder advanced() {
            return (AdvancedGooglePubsubEndpointProducerBuilder) this;
        }
        /**
         * AUTO = exchange gets ack'ed/nack'ed on completion. NONE = downstream
         * process has to ack/nack explicitly.
         * 
         * The option is a:
         * <code>org.apache.camel.component.google.pubsub.GooglePubsubConstants$AckMode</code> type.
         * 
         * Default: AUTO
         * Group: common
         */
        default GooglePubsubEndpointProducerBuilder ackMode(AckMode ackMode) {
            doSetProperty("ackMode", ackMode);
            return this;
        }
        /**
         * AUTO = exchange gets ack'ed/nack'ed on completion. NONE = downstream
         * process has to ack/nack explicitly.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.google.pubsub.GooglePubsubConstants$AckMode</code> type.
         * 
         * Default: AUTO
         * Group: common
         */
        default GooglePubsubEndpointProducerBuilder ackMode(String ackMode) {
            doSetProperty("ackMode", ackMode);
            return this;
        }
        /**
         * The number of parallel streams consuming from the subscription.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Default: 1
         * Group: common
         */
        default GooglePubsubEndpointProducerBuilder concurrentConsumers(
                Integer concurrentConsumers) {
            doSetProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * The number of parallel streams consuming from the subscription.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Default: 1
         * Group: common
         */
        default GooglePubsubEndpointProducerBuilder concurrentConsumers(
                String concurrentConsumers) {
            doSetProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * Logger ID to use when a match to the parent route required.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GooglePubsubEndpointProducerBuilder loggerId(String loggerId) {
            doSetProperty("loggerId", loggerId);
            return this;
        }
        /**
         * The max number of messages to receive from the server in a single API
         * call.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Default: 1
         * Group: common
         */
        default GooglePubsubEndpointProducerBuilder maxMessagesPerPoll(
                Integer maxMessagesPerPoll) {
            doSetProperty("maxMessagesPerPoll", maxMessagesPerPoll);
            return this;
        }
        /**
         * The max number of messages to receive from the server in a single API
         * call.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Default: 1
         * Group: common
         */
        default GooglePubsubEndpointProducerBuilder maxMessagesPerPoll(
                String maxMessagesPerPoll) {
            doSetProperty("maxMessagesPerPoll", maxMessagesPerPoll);
            return this;
        }
        /**
         * Synchronously pull batches of messages.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default GooglePubsubEndpointProducerBuilder synchronousPull(
                boolean synchronousPull) {
            doSetProperty("synchronousPull", synchronousPull);
            return this;
        }
        /**
         * Synchronously pull batches of messages.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default GooglePubsubEndpointProducerBuilder synchronousPull(
                String synchronousPull) {
            doSetProperty("synchronousPull", synchronousPull);
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
        default GooglePubsubEndpointProducerBuilder lazyStartProducer(
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
        default GooglePubsubEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Google Pubsub component.
     */
    public interface AdvancedGooglePubsubEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default GooglePubsubEndpointProducerBuilder basic() {
            return (GooglePubsubEndpointProducerBuilder) this;
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
        default AdvancedGooglePubsubEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedGooglePubsubEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedGooglePubsubEndpointProducerBuilder synchronous(
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
        default AdvancedGooglePubsubEndpointProducerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Google Pubsub component.
     */
    public interface GooglePubsubEndpointBuilder
            extends
                GooglePubsubEndpointConsumerBuilder,
                GooglePubsubEndpointProducerBuilder {
        default AdvancedGooglePubsubEndpointBuilder advanced() {
            return (AdvancedGooglePubsubEndpointBuilder) this;
        }
        /**
         * AUTO = exchange gets ack'ed/nack'ed on completion. NONE = downstream
         * process has to ack/nack explicitly.
         * 
         * The option is a:
         * <code>org.apache.camel.component.google.pubsub.GooglePubsubConstants$AckMode</code> type.
         * 
         * Default: AUTO
         * Group: common
         */
        default GooglePubsubEndpointBuilder ackMode(AckMode ackMode) {
            doSetProperty("ackMode", ackMode);
            return this;
        }
        /**
         * AUTO = exchange gets ack'ed/nack'ed on completion. NONE = downstream
         * process has to ack/nack explicitly.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.google.pubsub.GooglePubsubConstants$AckMode</code> type.
         * 
         * Default: AUTO
         * Group: common
         */
        default GooglePubsubEndpointBuilder ackMode(String ackMode) {
            doSetProperty("ackMode", ackMode);
            return this;
        }
        /**
         * The number of parallel streams consuming from the subscription.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Default: 1
         * Group: common
         */
        default GooglePubsubEndpointBuilder concurrentConsumers(
                Integer concurrentConsumers) {
            doSetProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * The number of parallel streams consuming from the subscription.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Default: 1
         * Group: common
         */
        default GooglePubsubEndpointBuilder concurrentConsumers(
                String concurrentConsumers) {
            doSetProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * Logger ID to use when a match to the parent route required.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GooglePubsubEndpointBuilder loggerId(String loggerId) {
            doSetProperty("loggerId", loggerId);
            return this;
        }
        /**
         * The max number of messages to receive from the server in a single API
         * call.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Default: 1
         * Group: common
         */
        default GooglePubsubEndpointBuilder maxMessagesPerPoll(
                Integer maxMessagesPerPoll) {
            doSetProperty("maxMessagesPerPoll", maxMessagesPerPoll);
            return this;
        }
        /**
         * The max number of messages to receive from the server in a single API
         * call.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Default: 1
         * Group: common
         */
        default GooglePubsubEndpointBuilder maxMessagesPerPoll(
                String maxMessagesPerPoll) {
            doSetProperty("maxMessagesPerPoll", maxMessagesPerPoll);
            return this;
        }
        /**
         * Synchronously pull batches of messages.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default GooglePubsubEndpointBuilder synchronousPull(
                boolean synchronousPull) {
            doSetProperty("synchronousPull", synchronousPull);
            return this;
        }
        /**
         * Synchronously pull batches of messages.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default GooglePubsubEndpointBuilder synchronousPull(
                String synchronousPull) {
            doSetProperty("synchronousPull", synchronousPull);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Google Pubsub component.
     */
    public interface AdvancedGooglePubsubEndpointBuilder
            extends
                AdvancedGooglePubsubEndpointConsumerBuilder,
                AdvancedGooglePubsubEndpointProducerBuilder {
        default GooglePubsubEndpointBuilder basic() {
            return (GooglePubsubEndpointBuilder) this;
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
        default AdvancedGooglePubsubEndpointBuilder basicPropertyBinding(
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
        default AdvancedGooglePubsubEndpointBuilder basicPropertyBinding(
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
        default AdvancedGooglePubsubEndpointBuilder synchronous(
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
        default AdvancedGooglePubsubEndpointBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.google.pubsub.GooglePubsubConstants$AckMode</code> enum.
     */
    enum AckMode {
        AUTO,
        NONE;
    }

    public interface GooglePubsubBuilders {
        /**
         * Google Pubsub (camel-google-pubsub)
         * Send and receive messages to/from Google Cloud Platform PubSub
         * Service.
         * 
         * Category: messaging
         * Since: 2.19
         * Maven coordinates: org.apache.camel:camel-google-pubsub
         * 
         * Syntax: <code>google-pubsub:projectId:destinationName</code>
         * 
         * Path parameter: projectId (required)
         * Project Id
         * 
         * Path parameter: destinationName (required)
         * Destination Name
         * 
         * @param path projectId:destinationName
         */
        default GooglePubsubEndpointBuilder googlePubsub(String path) {
            return GooglePubsubEndpointBuilderFactory.endpointBuilder("google-pubsub", path);
        }
        /**
         * Google Pubsub (camel-google-pubsub)
         * Send and receive messages to/from Google Cloud Platform PubSub
         * Service.
         * 
         * Category: messaging
         * Since: 2.19
         * Maven coordinates: org.apache.camel:camel-google-pubsub
         * 
         * Syntax: <code>google-pubsub:projectId:destinationName</code>
         * 
         * Path parameter: projectId (required)
         * Project Id
         * 
         * Path parameter: destinationName (required)
         * Destination Name
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path projectId:destinationName
         */
        default GooglePubsubEndpointBuilder googlePubsub(
                String componentName,
                String path) {
            return GooglePubsubEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static GooglePubsubEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class GooglePubsubEndpointBuilderImpl extends AbstractEndpointBuilder implements GooglePubsubEndpointBuilder, AdvancedGooglePubsubEndpointBuilder {
            public GooglePubsubEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new GooglePubsubEndpointBuilderImpl(path);
    }
}