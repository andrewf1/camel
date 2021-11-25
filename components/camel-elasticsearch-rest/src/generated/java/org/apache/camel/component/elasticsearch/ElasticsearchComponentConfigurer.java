/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.elasticsearch;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ElasticsearchComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        ElasticsearchComponent target = (ElasticsearchComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "client": target.setClient(property(camelContext, org.elasticsearch.client.RestClient.class, value)); return true;
        case "connectiontimeout":
        case "connectionTimeout": target.setConnectionTimeout(property(camelContext, int.class, value)); return true;
        case "enablessl":
        case "enableSSL": target.setEnableSSL(property(camelContext, boolean.class, value)); return true;
        case "enablesniffer":
        case "enableSniffer": target.setEnableSniffer(property(camelContext, boolean.class, value)); return true;
        case "hostaddresses":
        case "hostAddresses": target.setHostAddresses(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxretrytimeout":
        case "maxRetryTimeout": target.setMaxRetryTimeout(property(camelContext, int.class, value)); return true;
        case "password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sniffafterfailuredelay":
        case "sniffAfterFailureDelay": target.setSniffAfterFailureDelay(property(camelContext, int.class, value)); return true;
        case "snifferinterval":
        case "snifferInterval": target.setSnifferInterval(property(camelContext, int.class, value)); return true;
        case "sockettimeout":
        case "socketTimeout": target.setSocketTimeout(property(camelContext, int.class, value)); return true;
        case "user": target.setUser(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public String[] getAutowiredNames() {
        return new String[]{"client"};
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "client": return org.elasticsearch.client.RestClient.class;
        case "connectiontimeout":
        case "connectionTimeout": return int.class;
        case "enablessl":
        case "enableSSL": return boolean.class;
        case "enablesniffer":
        case "enableSniffer": return boolean.class;
        case "hostaddresses":
        case "hostAddresses": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "maxretrytimeout":
        case "maxRetryTimeout": return int.class;
        case "password": return java.lang.String.class;
        case "sniffafterfailuredelay":
        case "sniffAfterFailureDelay": return int.class;
        case "snifferinterval":
        case "snifferInterval": return int.class;
        case "sockettimeout":
        case "socketTimeout": return int.class;
        case "user": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        ElasticsearchComponent target = (ElasticsearchComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "client": return target.getClient();
        case "connectiontimeout":
        case "connectionTimeout": return target.getConnectionTimeout();
        case "enablessl":
        case "enableSSL": return target.isEnableSSL();
        case "enablesniffer":
        case "enableSniffer": return target.isEnableSniffer();
        case "hostaddresses":
        case "hostAddresses": return target.getHostAddresses();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxretrytimeout":
        case "maxRetryTimeout": return target.getMaxRetryTimeout();
        case "password": return target.getPassword();
        case "sniffafterfailuredelay":
        case "sniffAfterFailureDelay": return target.getSniffAfterFailureDelay();
        case "snifferinterval":
        case "snifferInterval": return target.getSnifferInterval();
        case "sockettimeout":
        case "socketTimeout": return target.getSocketTimeout();
        case "user": return target.getUser();
        default: return null;
        }
    }
}

