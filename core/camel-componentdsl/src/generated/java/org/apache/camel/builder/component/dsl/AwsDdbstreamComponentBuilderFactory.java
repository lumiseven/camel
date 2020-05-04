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
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.aws.ddbstream.DdbStreamComponent;

/**
 * Receive messages from AWS DynamoDB Stream service.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface AwsDdbstreamComponentBuilderFactory {

    /**
     * AWS DynamoDB Streams (camel-aws-ddb)
     * Receive messages from AWS DynamoDB Stream service.
     * 
     * Category: cloud,messaging,streams
     * Since: 2.17
     * Maven coordinates: org.apache.camel:camel-aws-ddb
     */
    static AwsDdbstreamComponentBuilder awsDdbstream() {
        return new AwsDdbstreamComponentBuilderImpl();
    }

    /**
     * Builder for the AWS DynamoDB Streams component.
     */
    interface AwsDdbstreamComponentBuilder
            extends
                ComponentBuilder<DdbStreamComponent> {
        /**
         * Amazon DynamoDB client to use for all requests for this endpoint.
         * 
         * The option is a:
         * <code>com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreams</code>
         * type.
         * 
         * Group: consumer
         */
        default AwsDdbstreamComponentBuilder amazonDynamoDbStreamsClient(
                com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreams amazonDynamoDbStreamsClient) {
            doSetProperty("amazonDynamoDbStreamsClient", amazonDynamoDbStreamsClient);
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
        default AwsDdbstreamComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * The component configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws.ddbstream.DdbStreamConfiguration</code> type.
         * 
         * Group: consumer
         */
        default AwsDdbstreamComponentBuilder configuration(
                org.apache.camel.component.aws.ddbstream.DdbStreamConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Defines where in the DynaboDB stream to start getting records. Note
         * that using TRIM_HORIZON can cause a significant delay before the
         * stream has caught up to real-time. if {AT,AFTER}_SEQUENCE_NUMBER are
         * used, then a sequenceNumberProvider MUST be supplied.
         * 
         * The option is a:
         * <code>com.amazonaws.services.dynamodbv2.model.ShardIteratorType</code> type.
         * 
         * Default: LATEST
         * Group: consumer
         */
        default AwsDdbstreamComponentBuilder iteratorType(
                com.amazonaws.services.dynamodbv2.model.ShardIteratorType iteratorType) {
            doSetProperty("iteratorType", iteratorType);
            return this;
        }
        /**
         * Maximum number of records that will be fetched in each poll.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: consumer
         */
        default AwsDdbstreamComponentBuilder maxResultsPerRequest(
                int maxResultsPerRequest) {
            doSetProperty("maxResultsPerRequest", maxResultsPerRequest);
            return this;
        }
        /**
         * To define a proxy host when instantiating the DDBStreams client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default AwsDdbstreamComponentBuilder proxyHost(
                java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the DDBStreams client.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: consumer
         */
        default AwsDdbstreamComponentBuilder proxyPort(
                java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the DDBStreams client.
         * 
         * The option is a: <code>com.amazonaws.Protocol</code> type.
         * 
         * Default: HTTPS
         * Group: consumer
         */
        default AwsDdbstreamComponentBuilder proxyProtocol(
                com.amazonaws.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The region in which DDBStreams client needs to work.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default AwsDdbstreamComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Provider for the sequence number when using one of the two
         * ShardIteratorType.{AT,AFTER}_SEQUENCE_NUMBER iterator types. Can be a
         * registry reference or a literal sequence number.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws.ddbstream.SequenceNumberProvider</code> type.
         * 
         * Group: consumer
         */
        default AwsDdbstreamComponentBuilder sequenceNumberProvider(
                org.apache.camel.component.aws.ddbstream.SequenceNumberProvider sequenceNumberProvider) {
            doSetProperty("sequenceNumberProvider", sequenceNumberProvider);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AwsDdbstreamComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default AwsDdbstreamComponentBuilder accessKey(
                java.lang.String accessKey) {
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
        default AwsDdbstreamComponentBuilder secretKey(
                java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    class AwsDdbstreamComponentBuilderImpl
            extends
                AbstractComponentBuilder<DdbStreamComponent>
            implements
                AwsDdbstreamComponentBuilder {
        @Override
        protected DdbStreamComponent buildConcreteComponent() {
            return new DdbStreamComponent();
        }
        private org.apache.camel.component.aws.ddbstream.DdbStreamConfiguration getOrCreateConfiguration(
                org.apache.camel.component.aws.ddbstream.DdbStreamComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.aws.ddbstream.DdbStreamConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "amazonDynamoDbStreamsClient": getOrCreateConfiguration((DdbStreamComponent) component).setAmazonDynamoDbStreamsClient((com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreams) value); return true;
            case "bridgeErrorHandler": ((DdbStreamComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "configuration": ((DdbStreamComponent) component).setConfiguration((org.apache.camel.component.aws.ddbstream.DdbStreamConfiguration) value); return true;
            case "iteratorType": getOrCreateConfiguration((DdbStreamComponent) component).setIteratorType((com.amazonaws.services.dynamodbv2.model.ShardIteratorType) value); return true;
            case "maxResultsPerRequest": getOrCreateConfiguration((DdbStreamComponent) component).setMaxResultsPerRequest((int) value); return true;
            case "proxyHost": getOrCreateConfiguration((DdbStreamComponent) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPort": getOrCreateConfiguration((DdbStreamComponent) component).setProxyPort((java.lang.Integer) value); return true;
            case "proxyProtocol": getOrCreateConfiguration((DdbStreamComponent) component).setProxyProtocol((com.amazonaws.Protocol) value); return true;
            case "region": getOrCreateConfiguration((DdbStreamComponent) component).setRegion((java.lang.String) value); return true;
            case "sequenceNumberProvider": getOrCreateConfiguration((DdbStreamComponent) component).setSequenceNumberProvider((org.apache.camel.component.aws.ddbstream.SequenceNumberProvider) value); return true;
            case "basicPropertyBinding": ((DdbStreamComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "accessKey": getOrCreateConfiguration((DdbStreamComponent) component).setAccessKey((java.lang.String) value); return true;
            case "secretKey": getOrCreateConfiguration((DdbStreamComponent) component).setSecretKey((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}