package a0;

import java.util.Arrays;
import java.util.HashMap;
import r.C1549H;

/* JADX INFO: renamed from: a0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0603e extends C0602d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0602d f8657o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f8658p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0603e(long j, l lVar, B5.c cVar, B5.c cVar2, C0602d c0602d) {
        super(j, lVar, cVar, cVar2);
        this.f8657o = c0602d;
        c0602d.k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.C0602d, a0.AbstractC0606h
    public final void c() {
        if (this.f8663c) {
            return;
        }
        super.c();
        if (this.f8658p) {
            return;
        }
        this.f8658p = true;
        this.f8657o.l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.C0602d
    public final r w() throws Throwable {
        C0603e c0603e;
        C0602d c0602d = this.f8657o;
        if (c0602d.f8656m || c0602d.f8663c) {
            return new C0607i();
        }
        C1549H c1549h = this.f8653h;
        long j = this.f8662b;
        HashMap mapC = c1549h != null ? n.c(c0602d.g(), this, this.f8657o.d()) : null;
        Object obj = n.f8680b;
        synchronized (obj) {
            try {
                n.d(this);
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (c1549h == null || c1549h.f16141d == 0) {
                    c0603e = this;
                    a();
                } else {
                    c0603e = this;
                    r rVarZ = c0603e.z(this.f8657o.g(), c1549h, mapC, this.f8657o.d());
                    if (!rVarZ.equals(j.f8665b)) {
                        return rVarZ;
                    }
                    C1549H c1549hX = c0603e.f8657o.x();
                    if (c1549hX != null) {
                        c1549hX.k(c1549h);
                    } else {
                        c0603e.f8657o.B(c1549h);
                        c0603e.f8653h = null;
                    }
                }
                if (c0603e.f8657o.g() < j) {
                    c0603e.f8657o.v();
                }
                C0602d c0602d2 = c0603e.f8657o;
                c0602d2.r(c0602d2.d().g(j).d(c0603e.j));
                c0603e.f8657o.A(j);
                C0602d c0602d3 = c0603e.f8657o;
                int i = c0603e.f8664d;
                c0603e.f8664d = -1;
                if (i >= 0) {
                    int[] iArr = c0602d3.f8654k;
                    kotlin.jvm.internal.m.e(iArr, "<this>");
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    c0602d3.f8654k = iArrCopyOf;
                } else {
                    c0602d3.getClass();
                }
                C0602d c0602d4 = c0603e.f8657o;
                l lVar = c0603e.j;
                c0602d4.getClass();
                synchronized (obj) {
                    c0602d4.j = c0602d4.j.i(lVar);
                    C0602d c0602d5 = c0603e.f8657o;
                    int[] iArr2 = c0603e.f8654k;
                    c0602d5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = c0602d5.f8654k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            kotlin.jvm.internal.m.b(iArrCopyOf2);
                            iArr2 = iArrCopyOf2;
                        }
                        c0602d5.f8654k = iArr2;
                    }
                }
                c0603e.f8656m = true;
                if (!c0603e.f8658p) {
                    c0603e.f8658p = true;
                    c0603e.f8657o.l();
                }
                return j.f8665b;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }
}
