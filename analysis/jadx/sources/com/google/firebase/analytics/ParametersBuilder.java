package com.google.firebase.analytics;

import android.os.Bundle;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class ParametersBuilder {
    private final Bundle zza = new Bundle();

    public final Bundle getBundle() {
        return this.zza;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void param(String key, double d5) {
        m.e(key, "key");
        this.zza.putDouble(key, d5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final void param(String key, long j) {
        m.e(key, "key");
        this.zza.putLong(key, j);
    }

    public final void param(String key, Bundle value) {
        m.e(key, "key");
        m.e(value, "value");
        this.zza.putBundle(key, value);
    }

    public final void param(String key, String value) {
        m.e(key, "key");
        m.e(value, "value");
        this.zza.putString(key, value);
    }

    public final void param(String key, Bundle[] value) {
        m.e(key, "key");
        m.e(value, "value");
        this.zza.putParcelableArray(key, value);
    }
}
