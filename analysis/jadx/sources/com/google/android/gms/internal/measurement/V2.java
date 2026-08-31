package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class V2 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Comparable f10728q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f10729r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ U2 f10730s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public V2(U2 u22, Comparable comparable, Object obj) {
        this.f10730s = u22;
        this.f10728q = comparable;
        this.f10729r = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f10728q.compareTo(((V2) obj).f10728q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f10728q;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f10729r;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f10728q;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f10729r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f10728q;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f10729r;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f10730s.f();
        Object obj2 = this.f10729r;
        this.f10729r = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strValueOf = String.valueOf(this.f10728q);
        String strValueOf2 = String.valueOf(this.f10729r);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return sb.toString();
    }
}
