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
import org.apache.camel.component.mail.MailComponent;

/**
 * Send and receive emails using imap, pop3 and smtp protocols.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface ImapsComponentBuilderFactory {

    /**
     * IMAPS (Secure) (camel-mail)
     * Send and receive emails using imap, pop3 and smtp protocols.
     * 
     * Category: mail
     * Since: 1.0
     * Maven coordinates: org.apache.camel:camel-mail
     */
    static ImapsComponentBuilder imaps() {
        return new ImapsComponentBuilderImpl();
    }

    /**
     * Builder for the IMAPS (Secure) component.
     */
    interface ImapsComponentBuilder extends ComponentBuilder<MailComponent> {
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
        default ImapsComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Whether the consumer should close the folder after polling. Setting
         * this option to false and having disconnect=false as well, then the
         * consumer keep the folder open between polls.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default ImapsComponentBuilder closeFolder(boolean closeFolder) {
            doSetProperty("closeFolder", closeFolder);
            return this;
        }
        /**
         * After processing a mail message, it can be copied to a mail folder
         * with the given name. You can override this configuration value, with
         * a header with the key copyTo, allowing you to copy messages to folder
         * names configured at runtime.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default ImapsComponentBuilder copyTo(java.lang.String copyTo) {
            doSetProperty("copyTo", copyTo);
            return this;
        }
        /**
         * Deletes the messages after they have been processed. This is done by
         * setting the DELETED flag on the mail message. If false, the SEEN flag
         * is set instead. As of Camel 2.10 you can override this configuration
         * option by setting a header with the key delete to determine if the
         * mail should be deleted or not.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default ImapsComponentBuilder delete(boolean delete) {
            doSetProperty("delete", delete);
            return this;
        }
        /**
         * Whether the consumer should disconnect after polling. If enabled this
         * forces Camel to connect on each poll.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default ImapsComponentBuilder disconnect(boolean disconnect) {
            doSetProperty("disconnect", disconnect);
            return this;
        }
        /**
         * If the mail consumer cannot retrieve a given mail message, then this
         * option allows to handle the caused exception by the consumer's error
         * handler. By enable the bridge error handler on the consumer, then the
         * Camel routing error handler can handle the exception instead. The
         * default behavior would be the consumer throws an exception and no
         * mails from the batch would be able to be routed by Camel.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default ImapsComponentBuilder handleFailedMessage(
                boolean handleFailedMessage) {
            doSetProperty("handleFailedMessage", handleFailedMessage);
            return this;
        }
        /**
         * This option enables transparent MIME decoding and unfolding for mail
         * headers.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default ImapsComponentBuilder mimeDecodeHeaders(
                boolean mimeDecodeHeaders) {
            doSetProperty("mimeDecodeHeaders", mimeDecodeHeaders);
            return this;
        }
        /**
         * After processing a mail message, it can be moved to a mail folder
         * with the given name. You can override this configuration value, with
         * a header with the key moveTo, allowing you to move messages to folder
         * names configured at runtime.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default ImapsComponentBuilder moveTo(java.lang.String moveTo) {
            doSetProperty("moveTo", moveTo);
            return this;
        }
        /**
         * Will mark the javax.mail.Message as peeked before processing the mail
         * message. This applies to IMAPMessage messages types only. By using
         * peek the mail will not be eager marked as SEEN on the mail server,
         * which allows us to rollback the mail message if there is an error
         * processing in Camel.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default ImapsComponentBuilder peek(boolean peek) {
            doSetProperty("peek", peek);
            return this;
        }
        /**
         * If the mail consumer cannot retrieve a given mail message, then this
         * option allows to skip the message and move on to retrieve the next
         * mail message. The default behavior would be the consumer throws an
         * exception and no mails from the batch would be able to be routed by
         * Camel.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default ImapsComponentBuilder skipFailedMessage(
                boolean skipFailedMessage) {
            doSetProperty("skipFailedMessage", skipFailedMessage);
            return this;
        }
        /**
         * Whether to limit by unseen mails only.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default ImapsComponentBuilder unseen(boolean unseen) {
            doSetProperty("unseen", unseen);
            return this;
        }
        /**
         * Sets the maximum number of messages to consume during a poll. This
         * can be used to avoid overloading a mail server, if a mailbox folder
         * contains a lot of messages. Default value of -1 means no fetch size
         * and all messages will be consumed. Setting the value to 0 is a
         * special corner case, where Camel will not consume any messages at
         * all.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: -1
         * Group: consumer (advanced)
         */
        default ImapsComponentBuilder fetchSize(int fetchSize) {
            doSetProperty("fetchSize", fetchSize);
            return this;
        }
        /**
         * The folder to poll.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: INBOX
         * Group: consumer (advanced)
         */
        default ImapsComponentBuilder folderName(java.lang.String folderName) {
            doSetProperty("folderName", folderName);
            return this;
        }
        /**
         * Specifies whether Camel should map the received mail message to Camel
         * body/headers/attachments. If set to true, the body of the mail
         * message is mapped to the body of the Camel IN message, the mail
         * headers are mapped to IN headers, and the attachments to Camel IN
         * attachment message. If this option is set to false then the IN
         * message contains a raw javax.mail.Message. You can retrieve this raw
         * message by calling
         * exchange.getIn().getBody(javax.mail.Message.class).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer (advanced)
         */
        default ImapsComponentBuilder mapMailMessage(boolean mapMailMessage) {
            doSetProperty("mapMailMessage", mapMailMessage);
            return this;
        }
        /**
         * Sets the BCC email address. Separate multiple email addresses with
         * comma.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default ImapsComponentBuilder bcc(java.lang.String bcc) {
            doSetProperty("bcc", bcc);
            return this;
        }
        /**
         * Sets the CC email address. Separate multiple email addresses with
         * comma.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default ImapsComponentBuilder cc(java.lang.String cc) {
            doSetProperty("cc", cc);
            return this;
        }
        /**
         * The from email address.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: camel@localhost
         * Group: producer
         */
        default ImapsComponentBuilder from(java.lang.String from) {
            doSetProperty("from", from);
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
        default ImapsComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The Reply-To recipients (the receivers of the response mail).
         * Separate multiple email addresses with a comma.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default ImapsComponentBuilder replyTo(java.lang.String replyTo) {
            doSetProperty("replyTo", replyTo);
            return this;
        }
        /**
         * The Subject of the message being sent. Note: Setting the subject in
         * the header takes precedence over this option.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default ImapsComponentBuilder subject(java.lang.String subject) {
            doSetProperty("subject", subject);
            return this;
        }
        /**
         * Sets the To email address. Separate multiple email addresses with
         * comma.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default ImapsComponentBuilder to(java.lang.String to) {
            doSetProperty("to", to);
            return this;
        }
        /**
         * To use a custom org.apache.camel.component.mail.JavaMailSender for
         * sending emails.
         * 
         * The option is a:
         * <code>org.apache.camel.component.mail.JavaMailSender</code> type.
         * 
         * Group: producer (advanced)
         */
        default ImapsComponentBuilder javaMailSender(
                org.apache.camel.component.mail.JavaMailSender javaMailSender) {
            doSetProperty("javaMailSender", javaMailSender);
            return this;
        }
        /**
         * Sets additional java mail properties, that will append/override any
         * default properties that is set based on all the other options. This
         * is useful if you need to add some special options but want to keep
         * the others as is.
         * 
         * The option is a: <code>java.util.Properties</code> type.
         * 
         * Group: advanced
         */
        default ImapsComponentBuilder additionalJavaMailProperties(
                java.util.Properties additionalJavaMailProperties) {
            doSetProperty("additionalJavaMailProperties", additionalJavaMailProperties);
            return this;
        }
        /**
         * Specifies the key to an IN message header that contains an
         * alternative email body. For example, if you send emails in text/html
         * format and want to provide an alternative mail body for non-HTML
         * email clients, set the alternative mail body with this key as a
         * header.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: CamelMailAlternativeBody
         * Group: advanced
         */
        default ImapsComponentBuilder alternativeBodyHeader(
                java.lang.String alternativeBodyHeader) {
            doSetProperty("alternativeBodyHeader", alternativeBodyHeader);
            return this;
        }
        /**
         * To use a custom AttachmentsContentTransferEncodingResolver to resolve
         * what content-type-encoding to use for attachments.
         * 
         * The option is a:
         * <code>org.apache.camel.component.mail.AttachmentsContentTransferEncodingResolver</code> type.
         * 
         * Group: advanced
         */
        default ImapsComponentBuilder attachmentsContentTransferEncodingResolver(
                org.apache.camel.component.mail.AttachmentsContentTransferEncodingResolver attachmentsContentTransferEncodingResolver) {
            doSetProperty("attachmentsContentTransferEncodingResolver", attachmentsContentTransferEncodingResolver);
            return this;
        }
        /**
         * The authenticator for login. If set then the password and username
         * are ignored. Can be used for tokens which can expire and therefore
         * must be read dynamically.
         * 
         * The option is a:
         * <code>org.apache.camel.component.mail.MailAuthenticator</code> type.
         * 
         * Group: advanced
         */
        default ImapsComponentBuilder authenticator(
                org.apache.camel.component.mail.MailAuthenticator authenticator) {
            doSetProperty("authenticator", authenticator);
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
        default ImapsComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets the Mail configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.mail.MailConfiguration</code> type.
         * 
         * Group: advanced
         */
        default ImapsComponentBuilder configuration(
                org.apache.camel.component.mail.MailConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * The connection timeout in milliseconds.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 30000
         * Group: advanced
         */
        default ImapsComponentBuilder connectionTimeout(int connectionTimeout) {
            doSetProperty("connectionTimeout", connectionTimeout);
            return this;
        }
        /**
         * The mail message content type. Use text/html for HTML mails.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: text/plain
         * Group: advanced
         */
        default ImapsComponentBuilder contentType(java.lang.String contentType) {
            doSetProperty("contentType", contentType);
            return this;
        }
        /**
         * Resolver to determine Content-Type for file attachments.
         * 
         * The option is a:
         * <code>org.apache.camel.component.mail.ContentTypeResolver</code>
         * type.
         * 
         * Group: advanced
         */
        default ImapsComponentBuilder contentTypeResolver(
                org.apache.camel.component.mail.ContentTypeResolver contentTypeResolver) {
            doSetProperty("contentTypeResolver", contentTypeResolver);
            return this;
        }
        /**
         * Enable debug mode on the underlying mail framework. The SUN Mail
         * framework logs the debug messages to System.out by default.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default ImapsComponentBuilder debugMode(boolean debugMode) {
            doSetProperty("debugMode", debugMode);
            return this;
        }
        /**
         * Option to let Camel ignore unsupported charset in the local JVM when
         * sending mails. If the charset is unsupported then charset=XXX (where
         * XXX represents the unsupported charset) is removed from the
         * content-type and it relies on the platform default instead.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default ImapsComponentBuilder ignoreUnsupportedCharset(
                boolean ignoreUnsupportedCharset) {
            doSetProperty("ignoreUnsupportedCharset", ignoreUnsupportedCharset);
            return this;
        }
        /**
         * Option to let Camel ignore unsupported charset in the local JVM when
         * sending mails. If the charset is unsupported then charset=XXX (where
         * XXX represents the unsupported charset) is removed from the
         * content-type and it relies on the platform default instead.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default ImapsComponentBuilder ignoreUriScheme(boolean ignoreUriScheme) {
            doSetProperty("ignoreUriScheme", ignoreUriScheme);
            return this;
        }
        /**
         * Sets the java mail options. Will clear any default properties and
         * only use the properties provided for this method.
         * 
         * The option is a: <code>java.util.Properties</code> type.
         * 
         * Group: advanced
         */
        default ImapsComponentBuilder javaMailProperties(
                java.util.Properties javaMailProperties) {
            doSetProperty("javaMailProperties", javaMailProperties);
            return this;
        }
        /**
         * Specifies the mail session that camel should use for all mail
         * interactions. Useful in scenarios where mail sessions are created and
         * managed by some other resource, such as a JavaEE container. When
         * using a custom mail session, then the hostname and port from the mail
         * session will be used (if configured on the session).
         * 
         * The option is a: <code>javax.mail.Session</code> type.
         * 
         * Group: advanced
         */
        default ImapsComponentBuilder session(javax.mail.Session session) {
            doSetProperty("session", session);
            return this;
        }
        /**
         * Whether to use disposition inline or attachment.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default ImapsComponentBuilder useInlineAttachments(
                boolean useInlineAttachments) {
            doSetProperty("useInlineAttachments", useInlineAttachments);
            return this;
        }
        /**
         * To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter
         * header to and from Camel message.
         * 
         * The option is a:
         * <code>org.apache.camel.spi.HeaderFilterStrategy</code> type.
         * 
         * Group: filter
         */
        default ImapsComponentBuilder headerFilterStrategy(
                org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy) {
            doSetProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
        /**
         * The password for login. See also setAuthenticator(MailAuthenticator).
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default ImapsComponentBuilder password(java.lang.String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option is a:
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: security
         */
        default ImapsComponentBuilder sslContextParameters(
                org.apache.camel.support.jsse.SSLContextParameters sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * Enable usage of global SSL context parameters.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: security
         */
        default ImapsComponentBuilder useGlobalSslContextParameters(
                boolean useGlobalSslContextParameters) {
            doSetProperty("useGlobalSslContextParameters", useGlobalSslContextParameters);
            return this;
        }
        /**
         * The username for login. See also setAuthenticator(MailAuthenticator).
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default ImapsComponentBuilder username(java.lang.String username) {
            doSetProperty("username", username);
            return this;
        }
    }

    class ImapsComponentBuilderImpl
            extends
                AbstractComponentBuilder<MailComponent>
            implements
                ImapsComponentBuilder {
        @Override
        protected MailComponent buildConcreteComponent() {
            return new MailComponent();
        }
        private org.apache.camel.component.mail.MailConfiguration getOrCreateConfiguration(
                org.apache.camel.component.mail.MailComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.mail.MailConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "bridgeErrorHandler": ((MailComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "closeFolder": getOrCreateConfiguration((MailComponent) component).setCloseFolder((boolean) value); return true;
            case "copyTo": getOrCreateConfiguration((MailComponent) component).setCopyTo((java.lang.String) value); return true;
            case "delete": getOrCreateConfiguration((MailComponent) component).setDelete((boolean) value); return true;
            case "disconnect": getOrCreateConfiguration((MailComponent) component).setDisconnect((boolean) value); return true;
            case "handleFailedMessage": getOrCreateConfiguration((MailComponent) component).setHandleFailedMessage((boolean) value); return true;
            case "mimeDecodeHeaders": getOrCreateConfiguration((MailComponent) component).setMimeDecodeHeaders((boolean) value); return true;
            case "moveTo": getOrCreateConfiguration((MailComponent) component).setMoveTo((java.lang.String) value); return true;
            case "peek": getOrCreateConfiguration((MailComponent) component).setPeek((boolean) value); return true;
            case "skipFailedMessage": getOrCreateConfiguration((MailComponent) component).setSkipFailedMessage((boolean) value); return true;
            case "unseen": getOrCreateConfiguration((MailComponent) component).setUnseen((boolean) value); return true;
            case "fetchSize": getOrCreateConfiguration((MailComponent) component).setFetchSize((int) value); return true;
            case "folderName": getOrCreateConfiguration((MailComponent) component).setFolderName((java.lang.String) value); return true;
            case "mapMailMessage": getOrCreateConfiguration((MailComponent) component).setMapMailMessage((boolean) value); return true;
            case "bcc": getOrCreateConfiguration((MailComponent) component).setBcc((java.lang.String) value); return true;
            case "cc": getOrCreateConfiguration((MailComponent) component).setCc((java.lang.String) value); return true;
            case "from": getOrCreateConfiguration((MailComponent) component).setFrom((java.lang.String) value); return true;
            case "lazyStartProducer": ((MailComponent) component).setLazyStartProducer((boolean) value); return true;
            case "replyTo": getOrCreateConfiguration((MailComponent) component).setReplyTo((java.lang.String) value); return true;
            case "subject": getOrCreateConfiguration((MailComponent) component).setSubject((java.lang.String) value); return true;
            case "to": getOrCreateConfiguration((MailComponent) component).setTo((java.lang.String) value); return true;
            case "javaMailSender": getOrCreateConfiguration((MailComponent) component).setJavaMailSender((org.apache.camel.component.mail.JavaMailSender) value); return true;
            case "additionalJavaMailProperties": getOrCreateConfiguration((MailComponent) component).setAdditionalJavaMailProperties((java.util.Properties) value); return true;
            case "alternativeBodyHeader": getOrCreateConfiguration((MailComponent) component).setAlternativeBodyHeader((java.lang.String) value); return true;
            case "attachmentsContentTransferEncodingResolver": getOrCreateConfiguration((MailComponent) component).setAttachmentsContentTransferEncodingResolver((org.apache.camel.component.mail.AttachmentsContentTransferEncodingResolver) value); return true;
            case "authenticator": getOrCreateConfiguration((MailComponent) component).setAuthenticator((org.apache.camel.component.mail.MailAuthenticator) value); return true;
            case "basicPropertyBinding": ((MailComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "configuration": ((MailComponent) component).setConfiguration((org.apache.camel.component.mail.MailConfiguration) value); return true;
            case "connectionTimeout": getOrCreateConfiguration((MailComponent) component).setConnectionTimeout((int) value); return true;
            case "contentType": getOrCreateConfiguration((MailComponent) component).setContentType((java.lang.String) value); return true;
            case "contentTypeResolver": ((MailComponent) component).setContentTypeResolver((org.apache.camel.component.mail.ContentTypeResolver) value); return true;
            case "debugMode": getOrCreateConfiguration((MailComponent) component).setDebugMode((boolean) value); return true;
            case "ignoreUnsupportedCharset": getOrCreateConfiguration((MailComponent) component).setIgnoreUnsupportedCharset((boolean) value); return true;
            case "ignoreUriScheme": getOrCreateConfiguration((MailComponent) component).setIgnoreUriScheme((boolean) value); return true;
            case "javaMailProperties": getOrCreateConfiguration((MailComponent) component).setJavaMailProperties((java.util.Properties) value); return true;
            case "session": getOrCreateConfiguration((MailComponent) component).setSession((javax.mail.Session) value); return true;
            case "useInlineAttachments": getOrCreateConfiguration((MailComponent) component).setUseInlineAttachments((boolean) value); return true;
            case "headerFilterStrategy": ((MailComponent) component).setHeaderFilterStrategy((org.apache.camel.spi.HeaderFilterStrategy) value); return true;
            case "password": getOrCreateConfiguration((MailComponent) component).setPassword((java.lang.String) value); return true;
            case "sslContextParameters": getOrCreateConfiguration((MailComponent) component).setSslContextParameters((org.apache.camel.support.jsse.SSLContextParameters) value); return true;
            case "useGlobalSslContextParameters": ((MailComponent) component).setUseGlobalSslContextParameters((boolean) value); return true;
            case "username": getOrCreateConfiguration((MailComponent) component).setUsername((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}