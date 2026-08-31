package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0793f implements InterfaceC0833n {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC0833n f10834q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f10835r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0793f(String str) {
        this.f10834q = InterfaceC0833n.f10907d;
        this.f10835r = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final Double b() {
        throw new IllegalStateException("Control is not a double");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final Boolean c() {
        throw new IllegalStateException("Control is not a boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final Iterator d() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0793f)) {
            return false;
        }
        C0793f c0793f = (C0793f) obj;
        return this.f10835r.equals(c0793f.f10835r) && this.f10834q.equals(c0793f.f10834q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final InterfaceC0833n g(String str, E.c0 c0Var, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10834q.hashCode() + (this.f10835r.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final InterfaceC0833n l() {
        return new C0793f(this.f10835r, this.f10834q.l());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final String zzc() {
        throw new IllegalStateException("Control is not a String");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0793f(String str, InterfaceC0833n interfaceC0833n) {
        this.f10834q = interfaceC0833n;
        this.f10835r = str;
    }
}
