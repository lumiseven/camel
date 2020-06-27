
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.as2;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for org.apache.camel.component.as2.api.AS2ClientManager
 */
@UriParams
@Configurer
public final class AS2ClientManagerEndpointConfiguration extends AS2Configuration {

    @UriParam
    private String as2From;

    @UriParam
    private org.apache.camel.component.as2.api.AS2MessageStructure as2MessageStructure;

    @UriParam
    private String as2To;

    @UriParam
    private org.apache.camel.component.as2.api.AS2CompressionAlgorithm compressionAlgorithm;

    @UriParam
    private String dispositionNotificationTo;

    @UriParam
    private String ediMessage;

    @UriParam
    private org.apache.http.entity.ContentType ediMessageContentType;

    @UriParam
    private String ediMessageTransferEncoding;

    @UriParam
    private org.apache.camel.component.as2.api.AS2EncryptionAlgorithm encryptingAlgorithm;

    @UriParam
    private java.security.cert.Certificate[] encryptingCertificateChain;

    @UriParam
    private String from;

    @UriParam
    private String requestUri;

    @UriParam
    private String[] signedReceiptMicAlgorithms;

    @UriParam
    private org.apache.camel.component.as2.api.AS2SignatureAlgorithm signingAlgorithm;

    @UriParam
    private java.security.cert.Certificate[] signingCertificateChain;

    @UriParam
    private java.security.PrivateKey signingPrivateKey;

    @UriParam
    private String subject;

    public String getAs2From() {
        return as2From;
    }

    public void setAs2From(String as2From) {
        this.as2From = as2From;
    }

    public org.apache.camel.component.as2.api.AS2MessageStructure getAs2MessageStructure() {
        return as2MessageStructure;
    }

    public void setAs2MessageStructure(org.apache.camel.component.as2.api.AS2MessageStructure as2MessageStructure) {
        this.as2MessageStructure = as2MessageStructure;
    }

    public String getAs2To() {
        return as2To;
    }

    public void setAs2To(String as2To) {
        this.as2To = as2To;
    }

    public org.apache.camel.component.as2.api.AS2CompressionAlgorithm getCompressionAlgorithm() {
        return compressionAlgorithm;
    }

    public void setCompressionAlgorithm(org.apache.camel.component.as2.api.AS2CompressionAlgorithm compressionAlgorithm) {
        this.compressionAlgorithm = compressionAlgorithm;
    }

    public String getDispositionNotificationTo() {
        return dispositionNotificationTo;
    }

    public void setDispositionNotificationTo(String dispositionNotificationTo) {
        this.dispositionNotificationTo = dispositionNotificationTo;
    }

    public String getEdiMessage() {
        return ediMessage;
    }

    public void setEdiMessage(String ediMessage) {
        this.ediMessage = ediMessage;
    }

    public org.apache.http.entity.ContentType getEdiMessageContentType() {
        return ediMessageContentType;
    }

    public void setEdiMessageContentType(org.apache.http.entity.ContentType ediMessageContentType) {
        this.ediMessageContentType = ediMessageContentType;
    }

    public String getEdiMessageTransferEncoding() {
        return ediMessageTransferEncoding;
    }

    public void setEdiMessageTransferEncoding(String ediMessageTransferEncoding) {
        this.ediMessageTransferEncoding = ediMessageTransferEncoding;
    }

    public org.apache.camel.component.as2.api.AS2EncryptionAlgorithm getEncryptingAlgorithm() {
        return encryptingAlgorithm;
    }

    public void setEncryptingAlgorithm(org.apache.camel.component.as2.api.AS2EncryptionAlgorithm encryptingAlgorithm) {
        this.encryptingAlgorithm = encryptingAlgorithm;
    }

    public java.security.cert.Certificate[] getEncryptingCertificateChain() {
        return encryptingCertificateChain;
    }

    public void setEncryptingCertificateChain(java.security.cert.Certificate[] encryptingCertificateChain) {
        this.encryptingCertificateChain = encryptingCertificateChain;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getRequestUri() {
        return requestUri;
    }

    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri;
    }

    public String[] getSignedReceiptMicAlgorithms() {
        return signedReceiptMicAlgorithms;
    }

    public void setSignedReceiptMicAlgorithms(String[] signedReceiptMicAlgorithms) {
        this.signedReceiptMicAlgorithms = signedReceiptMicAlgorithms;
    }

    public org.apache.camel.component.as2.api.AS2SignatureAlgorithm getSigningAlgorithm() {
        return signingAlgorithm;
    }

    public void setSigningAlgorithm(org.apache.camel.component.as2.api.AS2SignatureAlgorithm signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
    }

    public java.security.cert.Certificate[] getSigningCertificateChain() {
        return signingCertificateChain;
    }

    public void setSigningCertificateChain(java.security.cert.Certificate[] signingCertificateChain) {
        this.signingCertificateChain = signingCertificateChain;
    }

    public java.security.PrivateKey getSigningPrivateKey() {
        return signingPrivateKey;
    }

    public void setSigningPrivateKey(java.security.PrivateKey signingPrivateKey) {
        this.signingPrivateKey = signingPrivateKey;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
