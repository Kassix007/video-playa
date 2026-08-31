package X;

import P.InterfaceC0359i;
import P.w0;
import P.x0;
import android.os.Trace;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import r.C1549H;
import r.C1569u;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f8149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R.e f8150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public R.e f8151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final R.e f8152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final R.e f8153e;
    public C1549H f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f8154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1569u f8155h;
    public final C1569u i;
    public ArrayList j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j(Set set) {
        this.f8149a = set;
        R.e eVar = new R.e(new x0[16]);
        this.f8150b = eVar;
        this.f8151c = eVar;
        this.f8152d = new R.e(new Object[16]);
        this.f8153e = new R.e(new B5.a[16]);
        this.f8154g = new ArrayList();
        this.f8155h = new C1569u();
        this.i = new C1569u();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        Set set = this.f8149a;
        if (set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                w0 w0Var = (w0) it.next();
                it.remove();
                w0Var.c();
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:6:0x0018 */
    public final void b() {
        c(Integer.MIN_VALUE);
        R.e eVar = this.f8152d;
        int i = eVar.f6678s;
        Set set = this.f8149a;
        if (i != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                C1549H c1549h = this.f;
                int i7 = eVar.f6678s;
                while (true) {
                    i7--;
                    if (-1 >= i7) {
                        break;
                    }
                    Object obj = eVar.f6676q[i7];
                    if (obj instanceof x0) {
                        w0 w0Var = ((x0) obj).f5576a;
                        set.remove(w0Var);
                        w0Var.e();
                    }
                    if (obj instanceof InterfaceC0359i) {
                        if (c1549h == null || !c1549h.c(obj)) {
                            ((InterfaceC0359i) obj).g();
                        } else {
                            ((InterfaceC0359i) obj).f();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        R.e eVar2 = this.f8150b;
        if (eVar2.f6678s != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Object[] objArr = eVar2.f6676q;
                int i8 = eVar2.f6678s;
                for (int i9 = 0; i9 < i8; i9++) {
                    w0 w0Var2 = ((x0) objArr[i9]).f5576a;
                    set.remove(w0Var2);
                    w0Var2.b();
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(int i) {
        ArrayList arrayList = this.f8154g;
        if (arrayList.isEmpty()) {
            return;
        }
        int i7 = 0;
        ArrayList arrayListC = null;
        int i8 = 0;
        C1569u c1569u = null;
        C1569u c1569u2 = null;
        while (true) {
            C1569u c1569u3 = this.i;
            if (i8 >= c1569u3.f16252b) {
                break;
            }
            if (i <= c1569u3.c(i8)) {
                Object objRemove = arrayList.remove(i8);
                int iD = c1569u3.d(i8);
                int iD2 = this.f8155h.d(i8);
                if (arrayListC == null) {
                    arrayListC = AbstractC0836n2.C(objRemove);
                    c1569u2 = new C1569u();
                    c1569u2.a(iD);
                    c1569u = new C1569u();
                    c1569u.a(iD2);
                } else {
                    kotlin.jvm.internal.m.c(c1569u, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    kotlin.jvm.internal.m.c(c1569u2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    arrayListC.add(objRemove);
                    c1569u2.a(iD);
                    c1569u.a(iD2);
                }
            } else {
                i8++;
            }
        }
        if (arrayListC != null) {
            kotlin.jvm.internal.m.c(c1569u, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            kotlin.jvm.internal.m.c(c1569u2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            int size = arrayListC.size() - 1;
            while (i7 < size) {
                int i9 = i7 + 1;
                int size2 = arrayListC.size();
                for (int i10 = i9; i10 < size2; i10++) {
                    int iC = c1569u2.c(i7);
                    int iC2 = c1569u2.c(i10);
                    if (iC < iC2 || (iC2 == iC && c1569u.c(i7) < c1569u.c(i10))) {
                        Object obj = arrayListC.get(i7);
                        arrayListC.set(i7, arrayListC.get(i10));
                        arrayListC.set(i10, obj);
                        int iC3 = c1569u.c(i7);
                        c1569u.e(i7, c1569u.c(i10));
                        c1569u.e(i10, iC3);
                        int iC4 = c1569u2.c(i7);
                        c1569u2.e(i7, c1569u2.c(i10));
                        c1569u2.e(i10, iC4);
                    }
                }
                i7 = i9;
            }
            R.e eVar = this.f8152d;
            eVar.e(eVar.f6678s, arrayListC);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(Object obj, int i, int i7, int i8) {
        c(i);
        if (i8 < 0 || i8 >= i) {
            this.f8152d.c(obj);
            return;
        }
        this.f8154g.add(obj);
        this.f8155h.a(i7);
        this.i.a(i8);
    }
}
