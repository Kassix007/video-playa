package com.google.android.gms.internal.measurement;

import B0.C0050o;
import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0844p0 extends P {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O3.L0 f11010c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BinderC0844p0(O3.L0 l02) {
        this.f11010c = l02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.S
    public final int d() {
        return System.identityHashCode(this.f11010c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.S
    public final void j(String str, String str2, Bundle bundle, long j) {
        ((C0050o) this.f11010c).D(str, str2, bundle, j);
    }
}
