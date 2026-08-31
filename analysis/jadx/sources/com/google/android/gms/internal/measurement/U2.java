package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class U2 extends AbstractMap {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object[] f10714q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10715r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Map f10716s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f10717t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile X2 f10718u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Map f10719v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public U2() {
        Map map = Collections.EMPTY_MAP;
        this.f10716s = map;
        this.f10719v = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final V2 a(int i) {
        if (i < this.f10715r) {
            return (V2) this.f10714q[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Set b() {
        return this.f10716s.isEmpty() ? Collections.EMPTY_SET : this.f10716s.entrySet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        f();
        int iE = e(comparable);
        if (iE >= 0) {
            return ((V2) this.f10714q[iE]).setValue(obj);
        }
        f();
        if (this.f10714q == null) {
            this.f10714q = new Object[16];
        }
        int i = -(iE + 1);
        if (i >= 16) {
            return g().put(comparable, obj);
        }
        if (this.f10715r == 16) {
            V2 v22 = (V2) this.f10714q[15];
            this.f10715r = 15;
            g().put(v22.f10728q, v22.f10729r);
        }
        Object[] objArr = this.f10714q;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.f10714q[i] = new V2(this, comparable, obj);
        this.f10715r++;
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
        if (this.f10715r != 0) {
            this.f10714q = null;
            this.f10715r = 0;
        }
        if (this.f10716s.isEmpty()) {
            return;
        }
        this.f10716s.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f10716s.containsKey(comparable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object d(int i) {
        f();
        Object[] objArr = this.f10714q;
        Object obj = ((V2) objArr[i]).f10729r;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f10715r - i) - 1);
        this.f10715r--;
        if (!this.f10716s.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.f10714q;
            int i7 = this.f10715r;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i7] = new V2(this, (Comparable) entry.getKey(), entry.getValue());
            this.f10715r++;
            it.remove();
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int e(Comparable comparable) {
        int i = this.f10715r;
        int i7 = i - 1;
        int i8 = 0;
        if (i7 >= 0) {
            int iCompareTo = comparable.compareTo(((V2) this.f10714q[i7]).f10728q);
            if (iCompareTo > 0) {
                return -(i + 1);
            }
            if (iCompareTo == 0) {
                return i7;
            }
        }
        while (i8 <= i7) {
            int i9 = (i8 + i7) / 2;
            int iCompareTo2 = comparable.compareTo(((V2) this.f10714q[i9]).f10728q);
            if (iCompareTo2 < 0) {
                i7 = i9 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i9;
                }
                i8 = i9 + 1;
            }
        }
        return -(i8 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f10718u == null) {
            this.f10718u = new X2(this, 0);
        }
        return this.f10718u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U2)) {
            return super.equals(obj);
        }
        U2 u22 = (U2) obj;
        int size = size();
        if (size == u22.size()) {
            int i = this.f10715r;
            if (i != u22.f10715r) {
                return entrySet().equals(u22.entrySet());
            }
            for (int i7 = 0; i7 < i; i7++) {
                if (a(i7).equals(u22.a(i7))) {
                }
            }
            if (i != size) {
                return this.f10716s.equals(u22.f10716s);
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f() {
        if (this.f10717t) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final SortedMap g() {
        f();
        if (this.f10716s.isEmpty() && !(this.f10716s instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f10716s = treeMap;
            this.f10719v = treeMap.descendingMap();
        }
        return (SortedMap) this.f10716s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        return iE >= 0 ? ((V2) this.f10714q[iE]).f10729r : this.f10716s.get(comparable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f10715r;
        int iHashCode = 0;
        for (int i7 = 0; i7 < i; i7++) {
            iHashCode += this.f10714q[i7].hashCode();
        }
        return this.f10716s.size() > 0 ? this.f10716s.hashCode() + iHashCode : iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        if (iE >= 0) {
            return d(iE);
        }
        if (this.f10716s.isEmpty()) {
            return null;
        }
        return this.f10716s.remove(comparable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f10716s.size() + this.f10715r;
    }
}
