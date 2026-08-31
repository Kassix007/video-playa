package X;

import P.C0363k;
import P.C0371o;
import P.C0372o0;
import P.C0382u;
import java.util.ArrayList;
import kotlin.jvm.internal.B;
import m5.InterfaceC1366e;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f8156a = new l(0, new long[0], new Object[0]);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int a(int i, int i7) {
        return i << (((i7 % 10) * 3) + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long b() {
        return Thread.currentThread().getId();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(C0371o c0371o, B5.e eVar) {
        kotlin.jvm.internal.m.c(eVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        B.b(2, eVar);
        eVar.invoke(c0371o, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final e d(int i, InterfaceC1366e interfaceC1366e, C0371o c0371o) {
        Object objH = c0371o.H();
        if (objH == C0363k.f5418a) {
            objH = new e(i, true, interfaceC1366e);
            c0371o.d0(objH);
        }
        e eVar = (e) objH;
        if (!kotlin.jvm.internal.m.a(eVar.f8138s, interfaceC1366e)) {
            boolean z5 = eVar.f8138s == null;
            eVar.f8138s = interfaceC1366e;
            if (!z5 && eVar.f8137r) {
                C0372o0 c0372o0 = eVar.f8139t;
                if (c0372o0 != null) {
                    C0382u c0382u = c0372o0.f5480b;
                    if (c0382u != null) {
                        c0382u.q(c0372o0, null);
                    }
                    eVar.f8139t = null;
                }
                ArrayList arrayList = eVar.f8140u;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        C0372o0 c0372o02 = (C0372o0) arrayList.get(i7);
                        C0382u c0382u2 = c0372o02.f5480b;
                        if (c0382u2 != null) {
                            c0382u2.q(c0372o02, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean e(C0372o0 c0372o0, C0372o0 c0372o02) {
        if (c0372o0 == null) {
            return true;
        }
        if (c0372o0 instanceof C0372o0) {
            return !c0372o0.b() || c0372o0.equals(c0372o02) || kotlin.jvm.internal.m.a(c0372o0.f5481c, c0372o02.f5481c);
        }
        return false;
    }
}
