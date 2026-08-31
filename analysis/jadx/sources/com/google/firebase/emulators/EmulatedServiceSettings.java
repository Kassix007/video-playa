package com.google.firebase.emulators;

/* JADX INFO: loaded from: classes.dex */
public final class EmulatedServiceSettings {
    private final String host;
    private final int port;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EmulatedServiceSettings(String str, int i) {
        this.host = str;
        this.port = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getHost() {
        return this.host;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getPort() {
        return this.port;
    }
}
