/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.ehcache;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class EhcacheEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "cacheManager": ((EhcacheEndpoint) target).getConfiguration().setCacheManager(property(camelContext, org.ehcache.CacheManager.class, value)); return true;
        case "cacheManagerConfiguration": ((EhcacheEndpoint) target).getConfiguration().setCacheManagerConfiguration(property(camelContext, org.ehcache.config.Configuration.class, value)); return true;
        case "configurationUri": ((EhcacheEndpoint) target).getConfiguration().setConfigurationUri(property(camelContext, java.lang.String.class, value)); return true;
        case "createCacheIfNotExist": ((EhcacheEndpoint) target).getConfiguration().setCreateCacheIfNotExist(property(camelContext, boolean.class, value)); return true;
        case "bridgeErrorHandler": ((EhcacheEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "eventFiring": ((EhcacheEndpoint) target).getConfiguration().setEventFiring(property(camelContext, org.ehcache.event.EventFiring.class, value)); return true;
        case "eventOrdering": ((EhcacheEndpoint) target).getConfiguration().setEventOrdering(property(camelContext, org.ehcache.event.EventOrdering.class, value)); return true;
        case "eventTypes": ((EhcacheEndpoint) target).getConfiguration().setEventTypes(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionHandler": ((EhcacheEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((EhcacheEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "action": ((EhcacheEndpoint) target).getConfiguration().setAction(property(camelContext, java.lang.String.class, value)); return true;
        case "key": ((EhcacheEndpoint) target).getConfiguration().setKey(property(camelContext, java.lang.Object.class, value)); return true;
        case "lazyStartProducer": ((EhcacheEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((EhcacheEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "configuration": ((EhcacheEndpoint) target).getConfiguration().setConfiguration(property(camelContext, org.ehcache.config.CacheConfiguration.class, value)); return true;
        case "configurations": ((EhcacheEndpoint) target).getConfiguration().setConfigurations(property(camelContext, java.util.Map.class, value)); return true;
        case "keyType": ((EhcacheEndpoint) target).getConfiguration().setKeyType(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": ((EhcacheEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "valueType": ((EhcacheEndpoint) target).getConfiguration().setValueType(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "cachemanager": ((EhcacheEndpoint) target).getConfiguration().setCacheManager(property(camelContext, org.ehcache.CacheManager.class, value)); return true;
        case "cachemanagerconfiguration": ((EhcacheEndpoint) target).getConfiguration().setCacheManagerConfiguration(property(camelContext, org.ehcache.config.Configuration.class, value)); return true;
        case "configurationuri": ((EhcacheEndpoint) target).getConfiguration().setConfigurationUri(property(camelContext, java.lang.String.class, value)); return true;
        case "createcacheifnotexist": ((EhcacheEndpoint) target).getConfiguration().setCreateCacheIfNotExist(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler": ((EhcacheEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "eventfiring": ((EhcacheEndpoint) target).getConfiguration().setEventFiring(property(camelContext, org.ehcache.event.EventFiring.class, value)); return true;
        case "eventordering": ((EhcacheEndpoint) target).getConfiguration().setEventOrdering(property(camelContext, org.ehcache.event.EventOrdering.class, value)); return true;
        case "eventtypes": ((EhcacheEndpoint) target).getConfiguration().setEventTypes(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler": ((EhcacheEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((EhcacheEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "action": ((EhcacheEndpoint) target).getConfiguration().setAction(property(camelContext, java.lang.String.class, value)); return true;
        case "key": ((EhcacheEndpoint) target).getConfiguration().setKey(property(camelContext, java.lang.Object.class, value)); return true;
        case "lazystartproducer": ((EhcacheEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((EhcacheEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "configuration": ((EhcacheEndpoint) target).getConfiguration().setConfiguration(property(camelContext, org.ehcache.config.CacheConfiguration.class, value)); return true;
        case "configurations": ((EhcacheEndpoint) target).getConfiguration().setConfigurations(property(camelContext, java.util.Map.class, value)); return true;
        case "keytype": ((EhcacheEndpoint) target).getConfiguration().setKeyType(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": ((EhcacheEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "valuetype": ((EhcacheEndpoint) target).getConfiguration().setValueType(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

}
