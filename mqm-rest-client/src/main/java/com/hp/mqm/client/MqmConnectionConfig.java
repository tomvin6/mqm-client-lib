/*
 * Copyright 2017 Hewlett-Packard Development Company, L.P.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hp.mqm.client;

public class MqmConnectionConfig {

    private String location;
    private String sharedSpace;
    private String username;
    private String password;
    private String clientType;

    private String proxyHost;
    private Integer proxyPort;
    private ProxyCredentials proxyCredentials;
    private Integer defaultSocketTimeout;
    private Integer defaultConnectionTimeout;
    private Integer defaultConnectionRequestTimeout;

    public MqmConnectionConfig(String location, String sharedSpace, String username, String password, String clientType) {
        this.location = location;
        this.sharedSpace = sharedSpace;
        this.username = username;
        this.password = password;
        this.clientType = clientType;
    }

    MqmConnectionConfig(String location, String sharedSpace, String username, String password, String clientType, String proxyHost, Integer proxyPort) {
        this.location = location;
        this.sharedSpace = sharedSpace;
        this.username = username;
        this.password = password;
        this.proxyHost = proxyHost;
        this.proxyPort = proxyPort;
        this.clientType = clientType;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setSharedSpace(String sharedSpace) {
        this.sharedSpace = sharedSpace;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    public void setProxyPort(Integer proxyPort) {
        this.proxyPort = proxyPort;
    }

    public String getLocation() {
        return location;
    }

    public String getSharedSpace() {
        return sharedSpace;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getProxyHost() {
        return proxyHost;
    }

    public Integer getProxyPort() {
        return proxyPort;
    }

    public Integer getDefaultSocketTimeout() {
        return defaultSocketTimeout;
    }

    public void setDefaultSocketTimeout(Integer defaultSocketTimeout) {
        this.defaultSocketTimeout = defaultSocketTimeout;
    }

    public Integer getDefaultConnectionTimeout() {
        return defaultConnectionTimeout;
    }

    public void setDefaultConnectionTimeout(Integer defaultConnectionTimeout) {
        this.defaultConnectionTimeout = defaultConnectionTimeout;
    }

    public Integer getDefaultConnectionRequestTimeout() {
        return defaultConnectionRequestTimeout;
    }

    public void setDefaultConnectionRequestTimeout(Integer defaultConnectionRequestTimeout) {
        this.defaultConnectionRequestTimeout = defaultConnectionRequestTimeout;
    }

    public ProxyCredentials getProxyCredentials() {
        return proxyCredentials;
    }

    public void setProxyCredentials(ProxyCredentials proxyCredentials) {
        this.proxyCredentials = proxyCredentials;
    }
}
