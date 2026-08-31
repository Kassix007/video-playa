package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0849q0 extends P {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O3.M0 f11015c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BinderC0849q0(O3.M0 m02) {
        this.f11015c = m02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.S
    public final int d() {
        return System.identityHashCode(this.f11015c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.S
    public final void j(String str, String str2, Bundle bundle, long j) {
        this.f11015c.onEvent(str, str2, bundle, j);
    }
}
