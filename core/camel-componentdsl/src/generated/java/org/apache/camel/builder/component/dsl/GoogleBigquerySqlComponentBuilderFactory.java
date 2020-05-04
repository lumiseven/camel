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
import org.apache.camel.component.google.bigquery.sql.GoogleBigQuerySQLComponent;

/**
 * Access Google Cloud BigQuery service using SQL queries.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface GoogleBigquerySqlComponentBuilderFactory {

    /**
     * Google BigQuery Standard SQL (camel-google-bigquery)
     * Access Google Cloud BigQuery service using SQL queries.
     * 
     * Category: cloud,messaging
     * Since: 2.23
     * Maven coordinates: org.apache.camel:camel-google-bigquery
     */
    static GoogleBigquerySqlComponentBuilder googleBigquerySql() {
        return new GoogleBigquerySqlComponentBuilderImpl();
    }

    /**
     * Builder for the Google BigQuery Standard SQL component.
     */
    interface GoogleBigquerySqlComponentBuilder
            extends
                ComponentBuilder<GoogleBigQuerySQLComponent> {
        /**
         * ConnectionFactory to obtain connection to Bigquery Service. If non
         * provided the default one will be used.
         * 
         * The option is a:
         * <code>org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory</code> type.
         * 
         * Group: producer
         */
        default GoogleBigquerySqlComponentBuilder connectionFactory(
                org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory connectionFactory) {
            doSetProperty("connectionFactory", connectionFactory);
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
        default GoogleBigquerySqlComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Google Cloud Project Id.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default GoogleBigquerySqlComponentBuilder projectId(
                java.lang.String projectId) {
            doSetProperty("projectId", projectId);
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
        default GoogleBigquerySqlComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
    }

    class GoogleBigquerySqlComponentBuilderImpl
            extends
                AbstractComponentBuilder<GoogleBigQuerySQLComponent>
            implements
                GoogleBigquerySqlComponentBuilder {
        @Override
        protected GoogleBigQuerySQLComponent buildConcreteComponent() {
            return new GoogleBigQuerySQLComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "connectionFactory": ((GoogleBigQuerySQLComponent) component).setConnectionFactory((org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory) value); return true;
            case "lazyStartProducer": ((GoogleBigQuerySQLComponent) component).setLazyStartProducer((boolean) value); return true;
            case "projectId": ((GoogleBigQuerySQLComponent) component).setProjectId((java.lang.String) value); return true;
            case "basicPropertyBinding": ((GoogleBigQuerySQLComponent) component).setBasicPropertyBinding((boolean) value); return true;
            default: return false;
            }
        }
    }
}