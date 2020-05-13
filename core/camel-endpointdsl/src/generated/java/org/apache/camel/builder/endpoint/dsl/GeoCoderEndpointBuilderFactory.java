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
 * Find geocodes (latitude and longitude) for a given address or the other way
 * round.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface GeoCoderEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Geocoder component.
     */
    public interface GeoCoderEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedGeoCoderEndpointBuilder advanced() {
            return (AdvancedGeoCoderEndpointBuilder) this;
        }
        /**
         * Whether to only enrich the Exchange with headers, and leave the body
         * as-is.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default GeoCoderEndpointBuilder headersOnly(boolean headersOnly) {
            doSetProperty("headersOnly", headersOnly);
            return this;
        }
        /**
         * Whether to only enrich the Exchange with headers, and leave the body
         * as-is.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default GeoCoderEndpointBuilder headersOnly(String headersOnly) {
            doSetProperty("headersOnly", headersOnly);
            return this;
        }
        /**
         * The language to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: en
         * Group: producer
         */
        default GeoCoderEndpointBuilder language(String language) {
            doSetProperty("language", language);
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
        default GeoCoderEndpointBuilder lazyStartProducer(
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
        default GeoCoderEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * URL to the geocoder server. Mandatory for Nominatim server.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default GeoCoderEndpointBuilder serverUrl(String serverUrl) {
            doSetProperty("serverUrl", serverUrl);
            return this;
        }
        /**
         * Type of GeoCoding server. Supported Nominatim and Google.
         * 
         * The option is a:
         * <code>org.apache.camel.component.geocoder.GeoCoderType</code> type.
         * 
         * Group: producer
         */
        default GeoCoderEndpointBuilder type(GeoCoderType type) {
            doSetProperty("type", type);
            return this;
        }
        /**
         * Type of GeoCoding server. Supported Nominatim and Google.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.geocoder.GeoCoderType</code> type.
         * 
         * Group: producer
         */
        default GeoCoderEndpointBuilder type(String type) {
            doSetProperty("type", type);
            return this;
        }
        /**
         * Proxy Authentication Domain to access Google GeoCoding server.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default GeoCoderEndpointBuilder proxyAuthDomain(String proxyAuthDomain) {
            doSetProperty("proxyAuthDomain", proxyAuthDomain);
            return this;
        }
        /**
         * Proxy Authentication Host to access Google GeoCoding server.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default GeoCoderEndpointBuilder proxyAuthHost(String proxyAuthHost) {
            doSetProperty("proxyAuthHost", proxyAuthHost);
            return this;
        }
        /**
         * Authentication Method to Google GeoCoding server.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default GeoCoderEndpointBuilder proxyAuthMethod(String proxyAuthMethod) {
            doSetProperty("proxyAuthMethod", proxyAuthMethod);
            return this;
        }
        /**
         * Proxy Password to access GeoCoding server.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default GeoCoderEndpointBuilder proxyAuthPassword(
                String proxyAuthPassword) {
            doSetProperty("proxyAuthPassword", proxyAuthPassword);
            return this;
        }
        /**
         * Proxy Username to access GeoCoding server.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default GeoCoderEndpointBuilder proxyAuthUsername(
                String proxyAuthUsername) {
            doSetProperty("proxyAuthUsername", proxyAuthUsername);
            return this;
        }
        /**
         * Proxy Host to access GeoCoding server.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default GeoCoderEndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * Proxy Port to access GeoCoding server.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: proxy
         */
        default GeoCoderEndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * Proxy Port to access GeoCoding server.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: proxy
         */
        default GeoCoderEndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * API Key to access Google. Mandatory for Google GeoCoding server.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default GeoCoderEndpointBuilder apiKey(String apiKey) {
            doSetProperty("apiKey", apiKey);
            return this;
        }
        /**
         * Client ID to access Google GeoCoding server.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default GeoCoderEndpointBuilder clientId(String clientId) {
            doSetProperty("clientId", clientId);
            return this;
        }
        /**
         * Client Key to access Google GeoCoding server.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default GeoCoderEndpointBuilder clientKey(String clientKey) {
            doSetProperty("clientKey", clientKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Geocoder component.
     */
    public interface AdvancedGeoCoderEndpointBuilder
            extends
                EndpointProducerBuilder {
        default GeoCoderEndpointBuilder basic() {
            return (GeoCoderEndpointBuilder) this;
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
        default AdvancedGeoCoderEndpointBuilder basicPropertyBinding(
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
        default AdvancedGeoCoderEndpointBuilder basicPropertyBinding(
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
        default AdvancedGeoCoderEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedGeoCoderEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.geocoder.GeoCoderType</code> enum.
     */
    enum GeoCoderType {
        NOMINATIM,
        GOOGLE;
    }

    public interface GeoCoderBuilders {
        /**
         * Geocoder (camel-geocoder)
         * Find geocodes (latitude and longitude) for a given address or the
         * other way round.
         * 
         * Category: api,location
         * Since: 2.12
         * Maven coordinates: org.apache.camel:camel-geocoder
         * 
         * Syntax: <code>geocoder:address:latlng</code>
         * 
         * Path parameter: address
         * The geo address which should be prefixed with address:
         * 
         * Path parameter: latlng
         * The geo latitude and longitude which should be prefixed with latlng:
         * 
         * @param path address:latlng
         */
        default GeoCoderEndpointBuilder geocoder(String path) {
            return GeoCoderEndpointBuilderFactory.endpointBuilder("geocoder", path);
        }
        /**
         * Geocoder (camel-geocoder)
         * Find geocodes (latitude and longitude) for a given address or the
         * other way round.
         * 
         * Category: api,location
         * Since: 2.12
         * Maven coordinates: org.apache.camel:camel-geocoder
         * 
         * Syntax: <code>geocoder:address:latlng</code>
         * 
         * Path parameter: address
         * The geo address which should be prefixed with address:
         * 
         * Path parameter: latlng
         * The geo latitude and longitude which should be prefixed with latlng:
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path address:latlng
         */
        default GeoCoderEndpointBuilder geocoder(
                String componentName,
                String path) {
            return GeoCoderEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static GeoCoderEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class GeoCoderEndpointBuilderImpl extends AbstractEndpointBuilder implements GeoCoderEndpointBuilder, AdvancedGeoCoderEndpointBuilder {
            public GeoCoderEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new GeoCoderEndpointBuilderImpl(path);
    }
}