package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0788e implements InterfaceC0833n {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f10828q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0788e(Boolean bool) {
        this.f10828q = bool == null ? false : bool.booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final Double b() {
        return Double.valueOf(true != this.f10828q ? 0.0d : 1.0d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final Boolean c() {
        return Boolean.valueOf(this.f10828q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final Iterator d() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0788e) && this.f10828q == ((C0788e) obj).f10828q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final InterfaceC0833n g(String str, E.c0 c0Var, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z5 = this.f10828q;
        if (zEquals) {
            return new C0848q(Boolean.toString(z5));
        }
        throw new IllegalArgumentException(Boolean.toString(z5) + "." + str + " is not a function.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.valueOf(this.f10828q).hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final InterfaceC0833n l() {
        return new C0788e(Boolean.valueOf(this.f10828q));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return String.valueOf(this.f10828q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final String zzc() {
        return Boolean.toString(this.f10828q);
    }
}
