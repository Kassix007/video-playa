package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0838o implements InterfaceC0833n {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f10997q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f10998r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0838o(ArrayList arrayList, String str) {
        this.f10997q = str;
        ArrayList arrayList2 = new ArrayList();
        this.f10998r = arrayList2;
        arrayList2.addAll(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final Double b() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final Boolean c() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
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
        if (!(obj instanceof C0838o)) {
            return false;
        }
        C0838o c0838o = (C0838o) obj;
        String str = this.f10997q;
        if (str == null ? c0838o.f10997q == null : str.equals(c0838o.f10997q)) {
            return this.f10998r.equals(c0838o.f10998r);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final InterfaceC0833n g(String str, E.c0 c0Var, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f10997q;
        return this.f10998r.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final InterfaceC0833n l() {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final String zzc() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }
}
