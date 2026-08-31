package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0792e3 extends IllegalArgumentException {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0792e3(int i, int i7) {
        super(C0776b2.a(i7, i, (byte) 32, "Unpaired surrogate at index ", " of "));
    }
}
