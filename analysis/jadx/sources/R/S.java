package r;

import java.util.Arrays;
import s.AbstractC1585a;

/* JADX INFO: loaded from: classes.dex */
public final class S implements Cloneable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ boolean f16167q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ int[] f16168r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object[] f16169s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ int f16170t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public S(int i) {
        int i7;
        int i8 = 4;
        while (true) {
            i7 = 40;
            if (i8 >= 32) {
                break;
            }
            int i9 = (1 << i8) - 12;
            if (40 <= i9) {
                i7 = i9;
                break;
            }
            i8++;
        }
        int i10 = i7 / 4;
        this.f16168r = new int[i10];
        this.f16169s = new Object[i10];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i, Object obj) {
        int i7 = this.f16170t;
        if (i7 != 0 && i <= this.f16168r[i7 - 1]) {
            e(i, obj);
            return;
        }
        if (this.f16167q && i7 >= this.f16168r.length) {
            r.a(this);
        }
        int i8 = this.f16170t;
        if (i8 >= this.f16168r.length) {
            int i9 = (i8 + 1) * 4;
            int i10 = 4;
            while (true) {
                if (i10 >= 32) {
                    break;
                }
                int i11 = (1 << i10) - 12;
                if (i9 <= i11) {
                    i9 = i11;
                    break;
                }
                i10++;
            }
            int i12 = i9 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f16168r, i12);
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            this.f16168r = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f16169s, i12);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            this.f16169s = objArrCopyOf;
        }
        this.f16168r[i8] = i;
        this.f16169s[i8] = obj;
        this.f16170t = i8 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final S clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        kotlin.jvm.internal.m.c(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        S s6 = (S) objClone;
        s6.f16168r = (int[]) this.f16168r.clone();
        s6.f16169s = (Object[]) this.f16169s.clone();
        return s6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object c(int i) {
        Object obj;
        int iA = AbstractC1585a.a(this.f16170t, i, this.f16168r);
        if (iA < 0 || (obj = this.f16169s[iA]) == r.f16241c) {
            return null;
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int d(int i) {
        if (this.f16167q) {
            r.a(this);
        }
        return this.f16168r[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(int i, Object obj) {
        int iA = AbstractC1585a.a(this.f16170t, i, this.f16168r);
        if (iA >= 0) {
            this.f16169s[iA] = obj;
            return;
        }
        int i7 = ~iA;
        int i8 = this.f16170t;
        if (i7 < i8) {
            Object[] objArr = this.f16169s;
            if (objArr[i7] == r.f16241c) {
                this.f16168r[i7] = i;
                objArr[i7] = obj;
                return;
            }
        }
        if (this.f16167q && i8 >= this.f16168r.length) {
            r.a(this);
            i7 = ~AbstractC1585a.a(this.f16170t, i, this.f16168r);
        }
        int i9 = this.f16170t;
        if (i9 >= this.f16168r.length) {
            int i10 = (i9 + 1) * 4;
            int i11 = 4;
            while (true) {
                if (i11 >= 32) {
                    break;
                }
                int i12 = (1 << i11) - 12;
                if (i10 <= i12) {
                    i10 = i12;
                    break;
                }
                i11++;
            }
            int i13 = i10 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f16168r, i13);
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            this.f16168r = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f16169s, i13);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            this.f16169s = objArrCopyOf;
        }
        int i14 = this.f16170t;
        if (i14 - i7 != 0) {
            int[] iArr = this.f16168r;
            int i15 = i7 + 1;
            n5.k.C0(i15, i7, i14, iArr, iArr);
            Object[] objArr2 = this.f16169s;
            n5.k.D0(i15, i7, this.f16170t, objArr2, objArr2);
        }
        this.f16168r[i7] = i;
        this.f16169s[i7] = obj;
        this.f16170t++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int f() {
        if (this.f16167q) {
            r.a(this);
        }
        return this.f16170t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object g(int i) {
        if (this.f16167q) {
            r.a(this);
        }
        Object[] objArr = this.f16169s;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16170t * 28);
        sb.append('{');
        int i = this.f16170t;
        for (int i7 = 0; i7 < i; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            sb.append(d(i7));
            sb.append('=');
            Object objG = g(i7);
            if (objG != this) {
                sb.append(objG);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }
}
