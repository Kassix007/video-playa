package o5;

import U.i;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: o5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1423e implements Map, Serializable, C5.c {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final C1423e f15449D;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public i f15450A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C1424f f15451B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f15452C;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object[] f15453q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object[] f15454r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f15455s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int[] f15456t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15457u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15458v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15459w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f15460x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f15461y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C1424f f15462z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C1423e c1423e = new C1423e(0);
        c1423e.f15452C = true;
        f15449D = c1423e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1423e() {
        this(8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a(Object obj) {
        c();
        while (true) {
            int iJ = j(obj);
            int i = this.f15457u * 2;
            int length = this.f15456t.length / 2;
            if (i > length) {
                i = length;
            }
            int i7 = 0;
            while (true) {
                int[] iArr = this.f15456t;
                int i8 = iArr[iJ];
                if (i8 <= 0) {
                    int i9 = this.f15458v;
                    Object[] objArr = this.f15453q;
                    if (i9 < objArr.length) {
                        int i10 = i9 + 1;
                        this.f15458v = i10;
                        objArr[i9] = obj;
                        this.f15455s[i9] = iJ;
                        iArr[iJ] = i10;
                        this.f15461y++;
                        this.f15460x++;
                        if (i7 > this.f15457u) {
                            this.f15457u = i7;
                        }
                        return i9;
                    }
                    g(1);
                } else {
                    if (m.a(this.f15453q[i8 - 1], obj)) {
                        return -i8;
                    }
                    i7++;
                    if (i7 > i) {
                        k(this.f15456t.length * 2);
                        break;
                    }
                    iJ = iJ == 0 ? this.f15456t.length - 1 : iJ - 1;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1423e b() {
        c();
        this.f15452C = true;
        if (this.f15461y > 0) {
            return this;
        }
        C1423e c1423e = f15449D;
        m.c(c1423e, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c1423e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        if (this.f15452C) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.f15458v - 1;
        if (i >= 0) {
            int i7 = 0;
            while (true) {
                int[] iArr = this.f15455s;
                int i8 = iArr[i7];
                if (i8 >= 0) {
                    this.f15456t[i8] = 0;
                    iArr[i7] = -1;
                }
                if (i7 == i) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        D5.a.E(this.f15453q, 0, this.f15458v);
        Object[] objArr = this.f15454r;
        if (objArr != null) {
            D5.a.E(objArr, 0, this.f15458v);
        }
        this.f15461y = 0;
        this.f15458v = 0;
        this.f15460x++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(boolean z5) {
        int i;
        Object[] objArr = this.f15454r;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i = this.f15458v;
            if (i7 >= i) {
                break;
            }
            int[] iArr = this.f15455s;
            int i9 = iArr[i7];
            if (i9 >= 0) {
                Object[] objArr2 = this.f15453q;
                objArr2[i8] = objArr2[i7];
                if (objArr != null) {
                    objArr[i8] = objArr[i7];
                }
                if (z5) {
                    iArr[i8] = i9;
                    this.f15456t[i9] = i8 + 1;
                }
                i8++;
            }
            i7++;
        }
        D5.a.E(this.f15453q, i8, i);
        if (objArr != null) {
            D5.a.E(objArr, i8, this.f15458v);
        }
        this.f15458v = i8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean e(Collection m4) {
        m.e(m4, "m");
        for (Object obj : m4) {
            if (obj != null) {
                try {
                    if (!f((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Set entrySet() {
        C1424f c1424f = this.f15451B;
        if (c1424f != null) {
            return c1424f;
        }
        C1424f c1424f2 = new C1424f(this, 0);
        this.f15451B = c1424f2;
        return c1424f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f15461y == map.size() && e(map.entrySet());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean f(Map.Entry entry) {
        m.e(entry, "entry");
        int iH = h(entry.getKey());
        if (iH < 0) {
            return false;
        }
        Object[] objArr = this.f15454r;
        m.b(objArr);
        return m.a(objArr[iH], entry.getValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(int i) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f15453q;
        int length = objArr.length;
        int i7 = this.f15458v;
        int i8 = length - i7;
        int i9 = i7 - this.f15461y;
        if (i8 < i && i8 + i9 >= i && i9 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i10 = i7 + i;
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        if (i10 > objArr.length) {
            int length2 = objArr.length;
            int i11 = length2 + (length2 >> 1);
            if (i11 - i10 < 0) {
                i11 = i10;
            }
            if (i11 - 2147483639 > 0) {
                i11 = i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i11);
            m.d(objArrCopyOf2, "copyOf(...)");
            this.f15453q = objArrCopyOf2;
            Object[] objArr2 = this.f15454r;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, i11);
                m.d(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.f15454r = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f15455s, i11);
            m.d(iArrCopyOf, "copyOf(...)");
            this.f15455s = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i11 >= 1 ? i11 : 1) * 3);
            if (iHighestOneBit > this.f15456t.length) {
                k(iHighestOneBit);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Object get(Object obj) {
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.f15454r;
        m.b(objArr);
        return objArr[iH];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int h(Object obj) {
        int iJ = j(obj);
        int i = this.f15457u;
        while (true) {
            int i7 = this.f15456t[iJ];
            if (i7 == 0) {
                return -1;
            }
            if (i7 > 0) {
                int i8 = i7 - 1;
                if (m.a(this.f15453q[i8], obj)) {
                    return i8;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iJ = iJ == 0 ? this.f15456t.length - 1 : iJ - 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final int hashCode() {
        C1421c c1421c = new C1421c(this, 0);
        int i = 0;
        while (c1421c.hasNext()) {
            int i7 = c1421c.f1941q;
            C1423e c1423e = (C1423e) c1421c.f1944t;
            if (i7 >= c1423e.f15458v) {
                throw new NoSuchElementException();
            }
            c1421c.f1941q = i7 + 1;
            c1421c.f1942r = i7;
            Object obj = c1423e.f15453q[i7];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = c1423e.f15454r;
            m.b(objArr);
            Object obj2 = objArr[c1421c.f1942r];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c1421c.e();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int i(Object obj) {
        int i = this.f15458v;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f15455s[i] >= 0) {
                Object[] objArr = this.f15454r;
                m.b(objArr);
                if (m.a(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f15461y == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f15459w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f15455s[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(int r6) {
        /*
            r5 = this;
            int r0 = r5.f15460x
            int r0 = r0 + 1
            r5.f15460x = r0
            int r0 = r5.f15458v
            int r1 = r5.f15461y
            r2 = 0
            if (r0 <= r1) goto L10
            r5.d(r2)
        L10:
            int[] r0 = new int[r6]
            r5.f15456t = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.f15459w = r6
        L1c:
            int r6 = r5.f15458v
            if (r2 >= r6) goto L50
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f15453q
            r0 = r0[r2]
            int r0 = r5.j(r0)
            int r1 = r5.f15457u
        L2c:
            int[] r3 = r5.f15456t
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.f15455s
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r6.<init>(r0)
            throw r6
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.C1423e.k(int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Set keySet() {
        C1424f c1424f = this.f15462z;
        if (c1424f != null) {
            return c1424f;
        }
        C1424f c1424f2 = new C1424f(this, 1);
        this.f15462z = c1424f2;
        return c1424f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x0024->B:33:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f15453q
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.m.e(r0, r1)
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.f15454r
            if (r0 == 0) goto L10
            r0[r12] = r1
        L10:
            int[] r0 = r11.f15455s
            r0 = r0[r12]
            int r1 = r11.f15457u
            int r1 = r1 * 2
            int[] r2 = r11.f15456t
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L20
            r1 = r2
        L20:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L24:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L2e
            int[] r0 = r11.f15456t
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2f
        L2e:
            r0 = r5
        L2f:
            int r4 = r4 + 1
            int r5 = r11.f15457u
            r6 = -1
            if (r4 <= r5) goto L3b
            int[] r0 = r11.f15456t
            r0[r1] = r2
            goto L6c
        L3b:
            int[] r5 = r11.f15456t
            r7 = r5[r0]
            if (r7 != 0) goto L44
            r5[r1] = r2
            goto L6c
        L44:
            if (r7 >= 0) goto L4b
            r5[r1] = r6
        L48:
            r1 = r0
            r4 = r2
            goto L65
        L4b:
            java.lang.Object[] r5 = r11.f15453q
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.j(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f15456t
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L65
            r9[r1] = r7
            int[] r4 = r11.f15455s
            r4[r8] = r1
            goto L48
        L65:
            int r3 = r3 + r6
            if (r3 >= 0) goto L24
            int[] r0 = r11.f15456t
            r0[r1] = r6
        L6c:
            int[] r0 = r11.f15455s
            r0[r12] = r6
            int r12 = r11.f15461y
            int r12 = r12 + r6
            r11.f15461y = r12
            int r12 = r11.f15460x
            int r12 = r12 + 1
            r11.f15460x = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.C1423e.l(int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.f15454r;
        if (objArr == null) {
            int length = this.f15453q.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f15454r = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final void putAll(Map from) {
        m.e(from, "from");
        c();
        Set<Map.Entry> setEntrySet = from.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        g(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.f15454r;
            if (objArr == null) {
                int length = this.f15453q.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f15454r = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!m.a(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.f15454r;
        m.b(objArr);
        Object obj2 = objArr[iH];
        l(iH);
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final int size() {
        return this.f15461y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f15461y * 3) + 2);
        sb.append("{");
        int i = 0;
        C1421c c1421c = new C1421c(this, 0);
        while (c1421c.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i7 = c1421c.f1941q;
            C1423e c1423e = (C1423e) c1421c.f1944t;
            if (i7 >= c1423e.f15458v) {
                throw new NoSuchElementException();
            }
            c1421c.f1941q = i7 + 1;
            c1421c.f1942r = i7;
            Object obj = c1423e.f15453q[i7];
            if (obj == c1423e) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = c1423e.f15454r;
            m.b(objArr);
            Object obj2 = objArr[c1421c.f1942r];
            if (obj2 == c1423e) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            c1421c.e();
            i++;
        }
        sb.append("}");
        String string = sb.toString();
        m.d(string, "toString(...)");
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Collection values() {
        i iVar = this.f15450A;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(1, this);
        this.f15450A = iVar2;
        return iVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1423e(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f15453q = objArr;
        this.f15454r = null;
        this.f15455s = iArr;
        this.f15456t = new int[iHighestOneBit];
        this.f15457u = 2;
        this.f15458v = 0;
        this.f15459w = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
