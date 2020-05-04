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
 * Consume data from AWS Kinesis Firehose streams.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface KinesisFirehoseEndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS Kinesis Firehose component.
     */
    public interface KinesisFirehoseEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedKinesisFirehoseEndpointBuilder advanced() {
            return (AdvancedKinesisFirehoseEndpointBuilder) this;
        }
        /**
         * Amazon Kinesis Firehose client to use for all requests for this
         * endpoint.
         * 
         * The option is a:
         * <code>com.amazonaws.services.kinesisfirehose.AmazonKinesisFirehose</code> type.
         * 
         * Group: producer
         */
        default KinesisFirehoseEndpointBuilder amazonKinesisFirehoseClient(
                Object amazonKinesisFirehoseClient) {
            doSetProperty("amazonKinesisFirehoseClient", amazonKinesisFirehoseClient);
            return this;
        }
        /**
         * Amazon Kinesis Firehose client to use for all requests for this
         * endpoint.
         * 
         * The option will be converted to a
         * <code>com.amazonaws.services.kinesisfirehose.AmazonKinesisFirehose</code> type.
         * 
         * Group: producer
         */
        default KinesisFirehoseEndpointBuilder amazonKinesisFirehoseClient(
                String amazonKinesisFirehoseClient) {
            doSetProperty("amazonKinesisFirehoseClient", amazonKinesisFirehoseClient);
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
        default KinesisFirehoseEndpointBuilder lazyStartProducer(
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
        default KinesisFirehoseEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * To define a proxy host when instantiating the Kinesis Firehose
         * client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default KinesisFirehoseEndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the Kinesis Firehose
         * client.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default KinesisFirehoseEndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy port when instantiating the Kinesis Firehose
         * client.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: producer
         */
        default KinesisFirehoseEndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the Kinesis Firehose
         * client.
         * 
         * The option is a: <code>com.amazonaws.Protocol</code> type.
         * 
         * Default: HTTPS
         * Group: producer
         */
        default KinesisFirehoseEndpointBuilder proxyProtocol(
                Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the Kinesis Firehose
         * client.
         * 
         * The option will be converted to a <code>com.amazonaws.Protocol</code>
         * type.
         * 
         * Default: HTTPS
         * Group: producer
         */
        default KinesisFirehoseEndpointBuilder proxyProtocol(
                String proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The region in which Kinesis client needs to work. When using this
         * parameter, the configuration will expect the capitalized name of the
         * region (for example AP_EAST_1)You'll need to use the name
         * Regions.EU_WEST_1.name().
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default KinesisFirehoseEndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KinesisFirehoseEndpointBuilder accessKey(String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KinesisFirehoseEndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS Kinesis Firehose component.
     */
    public interface AdvancedKinesisFirehoseEndpointBuilder
            extends
                EndpointProducerBuilder {
        default KinesisFirehoseEndpointBuilder basic() {
            return (KinesisFirehoseEndpointBuilder) this;
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
        default AdvancedKinesisFirehoseEndpointBuilder basicPropertyBinding(
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
        default AdvancedKinesisFirehoseEndpointBuilder basicPropertyBinding(
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
        default AdvancedKinesisFirehoseEndpointBuilder synchronous(
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
        default AdvancedKinesisFirehoseEndpointBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for <code>com.amazonaws.Protocol</code> enum.
     */
    enum Protocol {
        HTTP,
        HTTPS;
    }

    public interface KinesisFirehoseBuilders {
        /**
         * AWS Kinesis Firehose (camel-aws-kinesis)
         * Consume data from AWS Kinesis Firehose streams.
         * 
         * Category: cloud,messaging
         * Since: 2.19
         * Maven coordinates: org.apache.camel:camel-aws-kinesis
         * 
         * Syntax: <code>aws-kinesis-firehose:streamName</code>
         * 
         * Path parameter: streamName (required)
         * Name of the stream
         */
        default KinesisFirehoseEndpointBuilder awsKinesisFirehose(String path) {
            return KinesisFirehoseEndpointBuilderFactory.awsKinesisFirehose(path);
        }
    }
    /**
     * AWS Kinesis Firehose (camel-aws-kinesis)
     * Consume data from AWS Kinesis Firehose streams.
     * 
     * Category: cloud,messaging
     * Since: 2.19
     * Maven coordinates: org.apache.camel:camel-aws-kinesis
     * 
     * Syntax: <code>aws-kinesis-firehose:streamName</code>
     * 
     * Path parameter: streamName (required)
     * Name of the stream
     */
    static KinesisFirehoseEndpointBuilder awsKinesisFirehose(String path) {
        class KinesisFirehoseEndpointBuilderImpl extends AbstractEndpointBuilder implements KinesisFirehoseEndpointBuilder, AdvancedKinesisFirehoseEndpointBuilder {
            public KinesisFirehoseEndpointBuilderImpl(String path) {
                super("aws-kinesis-firehose", path);
            }
        }
        return new KinesisFirehoseEndpointBuilderImpl(path);
    }
}