package o5;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: o5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1422d implements Map.Entry, C5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1423e f15446q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f15447r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f15448s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1422d(C1423e map, int i) {
        m.e(map, "map");
        this.f15446q = map;
        this.f15447r = i;
        this.f15448s = map.f15460x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        if (this.f15446q.f15460x != this.f15448s) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m.a(entry.getKey(), getKey()) && m.a(entry.getValue(), getValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f15446q.f15453q[this.f15447r];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f15446q.f15454r;
        m.b(objArr);
        return objArr[this.f15447r];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        C1423e c1423e = this.f15446q;
        c1423e.c();
        Object[] objArr = c1423e.f15454r;
        if (objArr == null) {
            int length = c1423e.f15453q.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            c1423e.f15454r = objArr;
        }
        int i = this.f15447r;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: (wrap:java.lang.Object:INVOKE), 61, (wrap:java.lang.Object:INVOKE) */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
