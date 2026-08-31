package B0;

import C0.C0115z0;
import C0.R0;
import C0.d1;
import C0.e1;
import android.view.View;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: classes.dex */
public interface t0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static s0 d(t0 t0Var, B5.e eVar, k0 k0Var, boolean z5, int i) {
        R.e eVar2;
        Reference referencePoll;
        Object obj;
        if ((i & 8) != 0) {
            z5 = false;
        }
        C0.A a7 = (C0.A) t0Var;
        if (z5) {
            if (a7.isHardwareAccelerated() && a7.f756n0) {
                try {
                    return new R0(a7, eVar, k0Var);
                } catch (Throwable unused) {
                    a7.f756n0 = false;
                }
            }
            if (a7.f745c0 == null) {
                if (!d1.f1007I) {
                    C0.W.s(new View(a7.getContext()));
                }
                C0115z0 c0115z0 = d1.f1008J ? new C0115z0(a7.getContext()) : new e1(a7.getContext());
                a7.f745c0 = c0115z0;
                a7.addView(c0115z0, -1);
            }
            C0115z0 c0115z02 = a7.f745c0;
            kotlin.jvm.internal.m.b(c0115z02);
            return new d1(a7, c0115z02, eVar, k0Var);
        }
        C0050o c0050o = a7.f719I0;
        do {
            ReferenceQueue referenceQueue = (ReferenceQueue) c0050o.f500r;
            eVar2 = (R.e) c0050o.f499q;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                eVar2.l(referencePoll);
            }
        } while (referencePoll != null);
        while (true) {
            int i7 = eVar2.f6678s;
            if (i7 == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) eVar2.m(i7 - 1)).get();
            if (obj != null) {
                break;
            }
        }
        s0 s0Var = (s0) obj;
        if (s0Var == null) {
            return new C0.C0(a7.getGraphicsContext().b(), a7.getGraphicsContext(), a7, eVar, k0Var);
        }
        s0Var.i(eVar, k0Var);
        return s0Var;
    }
}
