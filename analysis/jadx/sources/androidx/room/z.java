package androidx.room;

import j2.InterfaceC1159e;
import j2.InterfaceC1160f;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class z implements InterfaceC1160f, InterfaceC1159e {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final TreeMap f9784y = new TreeMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f9785q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile String f9786r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long[] f9787s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final double[] f9788t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String[] f9789u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final byte[][] f9790v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int[] f9791w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f9792x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z(int i) {
        this.f9785q = i;
        int i7 = i + 1;
        this.f9791w = new int[i7];
        this.f9787s = new long[i7];
        this.f9788t = new double[i7];
        this.f9789u = new String[i7];
        this.f9790v = new byte[i7][];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final z a(int i, String query) {
        kotlin.jvm.internal.m.e(query, "query");
        TreeMap treeMap = f9784y;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (entryCeilingEntry == null) {
                z zVar = new z(i);
                zVar.f9786r = query;
                zVar.f9792x = i;
                return zVar;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            z zVar2 = (z) entryCeilingEntry.getValue();
            zVar2.getClass();
            zVar2.f9786r = query;
            zVar2.f9792x = i;
            return zVar2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1159e
    public final void H(int i, long j) {
        this.f9791w[i] = 2;
        this.f9787s[i] = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1159e
    public final void N(int i, byte[] bArr) {
        this.f9791w[i] = 5;
        this.f9790v[i] = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        TreeMap treeMap = f9784y;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f9785q), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                kotlin.jvm.internal.m.d(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1160f
    public final String e() {
        String str = this.f9786r;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1160f
    public final void f(InterfaceC1159e interfaceC1159e) {
        int i = this.f9792x;
        if (1 > i) {
            return;
        }
        int i7 = 1;
        while (true) {
            int i8 = this.f9791w[i7];
            if (i8 == 1) {
                interfaceC1159e.s(i7);
            } else if (i8 == 2) {
                interfaceC1159e.H(i7, this.f9787s[i7]);
            } else if (i8 == 3) {
                interfaceC1159e.p(this.f9788t[i7], i7);
            } else if (i8 == 4) {
                String str = this.f9789u[i7];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                interfaceC1159e.m(i7, str);
            } else if (i8 == 5) {
                byte[] bArr = this.f9790v[i7];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                interfaceC1159e.N(i7, bArr);
            }
            if (i7 == i) {
                return;
            } else {
                i7++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1159e
    public final void m(int i, String value) {
        kotlin.jvm.internal.m.e(value, "value");
        this.f9791w[i] = 4;
        this.f9789u[i] = value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1159e
    public final void p(double d5, int i) {
        this.f9791w[i] = 3;
        this.f9788t[i] = d5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1159e
    public final void s(int i) {
        this.f9791w[i] = 1;
    }
}
