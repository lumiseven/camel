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
 * Perform operations on git repositories.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface GitEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Git component.
     */
    public interface GitEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedGitEndpointConsumerBuilder advanced() {
            return (AdvancedGitEndpointConsumerBuilder) this;
        }
        /**
         * The branch name to work on.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GitEndpointConsumerBuilder branchName(String branchName) {
            doSetProperty("branchName", branchName);
            return this;
        }
        /**
         * Remote repository password.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GitEndpointConsumerBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * The remote repository name to use in particular operation like pull.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GitEndpointConsumerBuilder remoteName(String remoteName) {
            doSetProperty("remoteName", remoteName);
            return this;
        }
        /**
         * The remote repository path.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GitEndpointConsumerBuilder remotePath(String remotePath) {
            doSetProperty("remotePath", remotePath);
            return this;
        }
        /**
         * The tag name to work on.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GitEndpointConsumerBuilder tagName(String tagName) {
            doSetProperty("tagName", tagName);
            return this;
        }
        /**
         * Remote repository username.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GitEndpointConsumerBuilder username(String username) {
            doSetProperty("username", username);
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
        default GitEndpointConsumerBuilder bridgeErrorHandler(
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
        default GitEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * The consumer type.
         * 
         * The option is a:
         * <code>org.apache.camel.component.git.consumer.GitType</code> type.
         * 
         * Group: consumer
         */
        default GitEndpointConsumerBuilder type(GitType type) {
            doSetProperty("type", type);
            return this;
        }
        /**
         * The consumer type.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.git.consumer.GitType</code> type.
         * 
         * Group: consumer
         */
        default GitEndpointConsumerBuilder type(String type) {
            doSetProperty("type", type);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Git component.
     */
    public interface AdvancedGitEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default GitEndpointConsumerBuilder basic() {
            return (GitEndpointConsumerBuilder) this;
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
        default AdvancedGitEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedGitEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedGitEndpointConsumerBuilder exchangePattern(
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
        default AdvancedGitEndpointConsumerBuilder exchangePattern(
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
        default AdvancedGitEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedGitEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedGitEndpointConsumerBuilder synchronous(
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
        default AdvancedGitEndpointConsumerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Git component.
     */
    public interface GitEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedGitEndpointProducerBuilder advanced() {
            return (AdvancedGitEndpointProducerBuilder) this;
        }
        /**
         * The branch name to work on.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GitEndpointProducerBuilder branchName(String branchName) {
            doSetProperty("branchName", branchName);
            return this;
        }
        /**
         * Remote repository password.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GitEndpointProducerBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * The remote repository name to use in particular operation like pull.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GitEndpointProducerBuilder remoteName(String remoteName) {
            doSetProperty("remoteName", remoteName);
            return this;
        }
        /**
         * The remote repository path.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GitEndpointProducerBuilder remotePath(String remotePath) {
            doSetProperty("remotePath", remotePath);
            return this;
        }
        /**
         * The tag name to work on.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GitEndpointProducerBuilder tagName(String tagName) {
            doSetProperty("tagName", tagName);
            return this;
        }
        /**
         * Remote repository username.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GitEndpointProducerBuilder username(String username) {
            doSetProperty("username", username);
            return this;
        }
        /**
         * The flag to manage empty git commits.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default GitEndpointProducerBuilder allowEmpty(boolean allowEmpty) {
            doSetProperty("allowEmpty", allowEmpty);
            return this;
        }
        /**
         * The flag to manage empty git commits.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default GitEndpointProducerBuilder allowEmpty(String allowEmpty) {
            doSetProperty("allowEmpty", allowEmpty);
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
        default GitEndpointProducerBuilder lazyStartProducer(
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
        default GitEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The operation to do on the repository.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default GitEndpointProducerBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Git component.
     */
    public interface AdvancedGitEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default GitEndpointProducerBuilder basic() {
            return (GitEndpointProducerBuilder) this;
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
        default AdvancedGitEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedGitEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedGitEndpointProducerBuilder synchronous(
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
        default AdvancedGitEndpointProducerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Git component.
     */
    public interface GitEndpointBuilder
            extends
                GitEndpointConsumerBuilder,
                GitEndpointProducerBuilder {
        default AdvancedGitEndpointBuilder advanced() {
            return (AdvancedGitEndpointBuilder) this;
        }
        /**
         * The branch name to work on.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GitEndpointBuilder branchName(String branchName) {
            doSetProperty("branchName", branchName);
            return this;
        }
        /**
         * Remote repository password.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GitEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * The remote repository name to use in particular operation like pull.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GitEndpointBuilder remoteName(String remoteName) {
            doSetProperty("remoteName", remoteName);
            return this;
        }
        /**
         * The remote repository path.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GitEndpointBuilder remotePath(String remotePath) {
            doSetProperty("remotePath", remotePath);
            return this;
        }
        /**
         * The tag name to work on.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GitEndpointBuilder tagName(String tagName) {
            doSetProperty("tagName", tagName);
            return this;
        }
        /**
         * Remote repository username.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GitEndpointBuilder username(String username) {
            doSetProperty("username", username);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Git component.
     */
    public interface AdvancedGitEndpointBuilder
            extends
                AdvancedGitEndpointConsumerBuilder,
                AdvancedGitEndpointProducerBuilder {
        default GitEndpointBuilder basic() {
            return (GitEndpointBuilder) this;
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
        default AdvancedGitEndpointBuilder basicPropertyBinding(
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
        default AdvancedGitEndpointBuilder basicPropertyBinding(
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
        default AdvancedGitEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedGitEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.git.consumer.GitType</code> enum.
     */
    enum GitType {
        COMMIT,
        TAG,
        BRANCH;
    }

    public interface GitBuilders {
        /**
         * Git (camel-git)
         * Perform operations on git repositories.
         * 
         * Category: file
         * Since: 2.16
         * Maven coordinates: org.apache.camel:camel-git
         * 
         * Syntax: <code>git:localPath</code>
         * 
         * Path parameter: localPath (required)
         * Local repository path
         * 
         * @param path localPath
         */
        default GitEndpointBuilder git(String path) {
            return GitEndpointBuilderFactory.endpointBuilder("git", path);
        }
        /**
         * Git (camel-git)
         * Perform operations on git repositories.
         * 
         * Category: file
         * Since: 2.16
         * Maven coordinates: org.apache.camel:camel-git
         * 
         * Syntax: <code>git:localPath</code>
         * 
         * Path parameter: localPath (required)
         * Local repository path
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path localPath
         */
        default GitEndpointBuilder git(String componentName, String path) {
            return GitEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static GitEndpointBuilder endpointBuilder(String componentName, String path) {
        class GitEndpointBuilderImpl extends AbstractEndpointBuilder implements GitEndpointBuilder, AdvancedGitEndpointBuilder {
            public GitEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new GitEndpointBuilderImpl(path);
    }
}