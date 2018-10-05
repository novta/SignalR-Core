// Copyright (c) .NET Foundation. All rights reserved.
// Licensed under the Apache License, Version 2.0. See License.txt in the project root for license information.

package com.microsoft.aspnet.signalr;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

import io.reactivex.Observable;

public class HttpConnectionOptions {
    private Transport transport;
    private LogLevel loglevel;
    private Logger logger;
    private boolean skipNegotiate;
    private Supplier<Observable<String>> accessTokenProvider;
    private HttpClient client;

    public HttpConnectionOptions() {}

    public HttpConnectionOptions(Transport transport, LogLevel logLevel, boolean skipNegotiate) {
        this.transport = transport;
        this.skipNegotiate = skipNegotiate;
        this.loglevel = logLevel;
    }

    public HttpConnectionOptions(Transport transport, Logger logger, boolean skipNegotiate) {
        this.transport = transport;
        this.skipNegotiate = skipNegotiate;
        this.logger = logger;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public void setLoglevel(LogLevel loglevel) {
        this.loglevel = loglevel;
    }

    public void setSkipNegotiate(boolean skipNegotiate) {
        this.skipNegotiate = skipNegotiate;
    }

    public Transport getTransport() {
        return transport;
    }

    public LogLevel getLoglevel() {
        return loglevel;
    }

    public boolean getSkipNegotiate() {
        return skipNegotiate;
    }

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public void setAccessTokenProvider(Supplier<Observable<String>> accessTokenProvider) {
        this.accessTokenProvider = accessTokenProvider;
    }

    public Supplier<Observable<String>> getAccessTokenProvider() {
        return accessTokenProvider;
    }

    // For testing purposes only
    void setHttpClient(HttpClient client) {
        this.client = client;
    }

    HttpClient getHttpClient() {
        return client;
    }
}
