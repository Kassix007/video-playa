package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0818k implements InterfaceC0833n, InterfaceC0813j {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final HashMap f10881q = new HashMap();

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
        return new C0808i(this.f10881q.keySet().iterator());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0818k) {
            return this.f10881q.equals(((C0818k) obj).f10881q);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public InterfaceC0833n g(String str, E.c0 c0Var, ArrayList arrayList) {
        return "toString".equals(str) ? new C0848q(toString()) : InterfaceC0813j.i(this, new C0848q(str), c0Var, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0813j
    public final InterfaceC0833n h(String str) {
        HashMap map = this.f10881q;
        return map.containsKey(str) ? (InterfaceC0833n) map.get(str) : InterfaceC0833n.f10907d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10881q.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0813j
    public final boolean j(String str) {
        return this.f10881q.containsKey(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0813j
    public final void k(String str, InterfaceC0833n interfaceC0833n) {
        HashMap map = this.f10881q;
        if (interfaceC0833n == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC0833n);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final InterfaceC0833n l() {
        C0818k c0818k = new C0818k();
        for (Map.Entry entry : this.f10881q.entrySet()) {
            boolean z5 = entry.getValue() instanceof InterfaceC0813j;
            HashMap map = c0818k.f10881q;
            if (z5) {
                map.put((String) entry.getKey(), (InterfaceC0833n) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((InterfaceC0833n) entry.getValue()).l());
            }
        }
        return c0818k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap map = this.f10881q;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final String zzc() {
        return "[object Object]";
    }
}
