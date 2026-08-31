package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0803h implements InterfaceC0833n, InterfaceC0813j {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f10855q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final HashMap f10856r = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0803h(String str) {
        this.f10855q = str;
    }

    public abstract InterfaceC0833n a(E.c0 c0Var, List list);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final Double b() {
        return Double.valueOf(Double.NaN);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final Boolean c() {
        return Boolean.TRUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final Iterator d() {
        return new C0808i(this.f10856r.keySet().iterator());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0803h)) {
            return false;
        }
        AbstractC0803h abstractC0803h = (AbstractC0803h) obj;
        String str = this.f10855q;
        if (str != null) {
            return str.equals(abstractC0803h.f10855q);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final InterfaceC0833n g(String str, E.c0 c0Var, ArrayList arrayList) {
        return "toString".equals(str) ? new C0848q(this.f10855q) : InterfaceC0813j.i(this, new C0848q(str), c0Var, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0813j
    public final InterfaceC0833n h(String str) {
        HashMap map = this.f10856r;
        return map.containsKey(str) ? (InterfaceC0833n) map.get(str) : InterfaceC0833n.f10907d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f10855q;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0813j
    public final boolean j(String str) {
        return this.f10856r.containsKey(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0813j
    public final void k(String str, InterfaceC0833n interfaceC0833n) {
        HashMap map = this.f10856r;
        if (interfaceC0833n == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC0833n);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public InterfaceC0833n l() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final String zzc() {
        return this.f10855q;
    }
}
