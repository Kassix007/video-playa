package r;

import java.util.Arrays;
import s.AbstractC1585a;

/* JADX INFO: renamed from: r.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1566q implements Cloneable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ boolean f16235q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ long[] f16236r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object[] f16237s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ int f16238t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1566q(int i) {
        if (i == 0) {
            this.f16236r = AbstractC1585a.f16412b;
            this.f16237s = AbstractC1585a.f16413c;
            return;
        }
        int i7 = i * 8;
        int i8 = 4;
        while (true) {
            if (i8 >= 32) {
                break;
            }
            int i9 = (1 << i8) - 12;
            if (i7 <= i9) {
                i7 = i9;
                break;
            }
            i8++;
        }
        int i10 = i7 / 8;
        this.f16236r = new long[i10];
        this.f16237s = new Object[i10];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        int i = this.f16238t;
        Object[] objArr = this.f16237s;
        for (int i7 = 0; i7 < i; i7++) {
            objArr[i7] = null;
        }
        this.f16238t = 0;
        this.f16235q = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object b(long j) {
        Object obj;
        int iB = AbstractC1585a.b(this.f16236r, this.f16238t, j);
        if (iB < 0 || (obj = this.f16237s[iB]) == r.f16239a) {
            return null;
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int c(long j) {
        if (this.f16235q) {
            int i = this.f16238t;
            long[] jArr = this.f16236r;
            Object[] objArr = this.f16237s;
            int i7 = 0;
            for (int i8 = 0; i8 < i; i8++) {
                Object obj = objArr[i8];
                if (obj != r.f16239a) {
                    if (i8 != i7) {
                        jArr[i7] = jArr[i8];
                        objArr[i7] = obj;
                        objArr[i8] = null;
                    }
                    i7++;
                }
            }
            this.f16235q = false;
            this.f16238t = i7;
        }
        return AbstractC1585a.b(this.f16236r, this.f16238t, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        kotlin.jvm.internal.m.c(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C1566q c1566q = (C1566q) objClone;
        c1566q.f16236r = (long[]) this.f16236r.clone();
        c1566q.f16237s = (Object[]) this.f16237s.clone();
        return c1566q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long d(int i) {
        int i7;
        if (i < 0 || i >= (i7 = this.f16238t)) {
            AbstractC1585a.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.f16235q) {
            long[] jArr = this.f16236r;
            Object[] objArr = this.f16237s;
            int i8 = 0;
            for (int i9 = 0; i9 < i7; i9++) {
                Object obj = objArr[i9];
                if (obj != r.f16239a) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            this.f16235q = false;
            this.f16238t = i8;
        }
        return this.f16236r[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(long j, Object obj) {
        Object obj2 = r.f16239a;
        int iB = AbstractC1585a.b(this.f16236r, this.f16238t, j);
        if (iB >= 0) {
            this.f16237s[iB] = obj;
            return;
        }
        int i = ~iB;
        int i7 = this.f16238t;
        if (i < i7) {
            Object[] objArr = this.f16237s;
            if (objArr[i] == obj2) {
                this.f16236r[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f16235q) {
            long[] jArr = this.f16236r;
            if (i7 >= jArr.length) {
                Object[] objArr2 = this.f16237s;
                int i8 = 0;
                for (int i9 = 0; i9 < i7; i9++) {
                    Object obj3 = objArr2[i9];
                    if (obj3 != obj2) {
                        if (i9 != i8) {
                            jArr[i8] = jArr[i9];
                            objArr2[i8] = obj3;
                            objArr2[i9] = null;
                        }
                        i8++;
                    }
                }
                this.f16235q = false;
                this.f16238t = i8;
                i = ~AbstractC1585a.b(this.f16236r, i8, j);
            }
        }
        int i10 = this.f16238t;
        if (i10 >= this.f16236r.length) {
            int i11 = (i10 + 1) * 8;
            int i12 = 4;
            while (true) {
                if (i12 >= 32) {
                    break;
                }
                int i13 = (1 << i12) - 12;
                if (i11 <= i13) {
                    i11 = i13;
                    break;
                }
                i12++;
            }
            int i14 = i11 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f16236r, i14);
            kotlin.jvm.internal.m.d(jArrCopyOf, "copyOf(...)");
            this.f16236r = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f16237s, i14);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            this.f16237s = objArrCopyOf;
        }
        int i15 = this.f16238t;
        if (i15 - i != 0) {
            long[] jArr2 = this.f16236r;
            int i16 = i + 1;
            n5.k.E0(jArr2, jArr2, i16, i, i15);
            Object[] objArr3 = this.f16237s;
            n5.k.D0(i16, i, this.f16238t, objArr3, objArr3);
        }
        this.f16236r[i] = j;
        this.f16237s[i] = obj;
        this.f16238t++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(long j) {
        int iB = AbstractC1585a.b(this.f16236r, this.f16238t, j);
        if (iB >= 0) {
            Object[] objArr = this.f16237s;
            Object obj = objArr[iB];
            Object obj2 = r.f16239a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f16235q = true;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int g() {
        if (this.f16235q) {
            int i = this.f16238t;
            long[] jArr = this.f16236r;
            Object[] objArr = this.f16237s;
            int i7 = 0;
            for (int i8 = 0; i8 < i; i8++) {
                Object obj = objArr[i8];
                if (obj != r.f16239a) {
                    if (i8 != i7) {
                        jArr[i7] = jArr[i8];
                        objArr[i7] = obj;
                        objArr[i8] = null;
                    }
                    i7++;
                }
            }
            this.f16235q = false;
            this.f16238t = i7;
        }
        return this.f16238t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object h(int i) {
        int i7;
        if (i < 0 || i >= (i7 = this.f16238t)) {
            AbstractC1585a.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.f16235q) {
            long[] jArr = this.f16236r;
            Object[] objArr = this.f16237s;
            int i8 = 0;
            for (int i9 = 0; i9 < i7; i9++) {
                Object obj = objArr[i9];
                if (obj != r.f16239a) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            this.f16235q = false;
            this.f16238t = i8;
        }
        return this.f16237s[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16238t * 28);
        sb.append('{');
        int i = this.f16238t;
        for (int i7 = 0; i7 < i; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            sb.append(d(i7));
            sb.append('=');
            Object objH = h(i7);
            if (objH != sb) {
                sb.append(objH);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (10 int) A[MD:(int):void (m)] (LINE:7) call: r.q.<init>(int):void type: THIS */
    public /* synthetic */ C1566q(Object obj) {
        this(10);
    }
}
