package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E.c0 f10615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public E.c0 f10616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B0.G0 f10617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0862t f10618d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public D() {
        E.c0 c0Var = new E.c0(7);
        this.f10615a = c0Var;
        this.f10616b = ((E.c0) c0Var.f1553r).G();
        this.f10617c = new B0.G0(20);
        this.f10618d = new C0862t(3);
        final int i = 1;
        Callable callable = new Callable(this) { // from class: com.google.android.gms.internal.measurement.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ D f10784b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f10784b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i) {
                    case 0:
                        return new R1(this.f10784b.f10617c);
                    default:
                        return new R1(this.f10784b.f10618d);
                }
            }
        };
        F2 f22 = (F2) c0Var.f1555t;
        ((HashMap) f22.f10630q).put("internal.registerCallback", callable);
        final int i7 = 0;
        ((HashMap) f22.f10630q).put("internal.eventLogger", new Callable(this) { // from class: com.google.android.gms.internal.measurement.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ D f10784b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f10784b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i7) {
                    case 0:
                        return new R1(this.f10784b.f10617c);
                    default:
                        return new R1(this.f10784b.f10618d);
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(C0773b c0773b) throws Q {
        B0.G0 g02 = this.f10617c;
        try {
            g02.f234r = c0773b;
            g02.f235s = c0773b.clone();
            ((ArrayList) g02.f236t).clear();
            ((E.c0) this.f10615a.f1554s).I("runtime.counter", new C0798g(Double.valueOf(0.0d)));
            this.f10618d.d(this.f10616b.G(), g02);
            if (((C0773b) g02.f235s).equals((C0773b) g02.f234r)) {
                return !((ArrayList) g02.f236t).isEmpty();
            }
            return true;
        } catch (Throwable th) {
            throw new Q(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(E1 e12) {
        AbstractC0803h abstractC0803h;
        try {
            E.c0 c0Var = this.f10615a;
            this.f10616b = ((E.c0) c0Var.f1553r).G();
            if (c0Var.C(this.f10616b, (F1[]) e12.p().toArray(new F1[0])) instanceof C0793f) {
                throw new IllegalStateException("Program loading failed");
            }
            for (D1 d12 : e12.q().p()) {
                List listQ = d12.q();
                String strP = d12.p();
                Iterator it = listQ.iterator();
                while (it.hasNext()) {
                    InterfaceC0833n interfaceC0833nC = c0Var.C(this.f10616b, (F1) it.next());
                    if (!(interfaceC0833nC instanceof C0818k)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    E.c0 c0Var2 = this.f10616b;
                    if (c0Var2.H(strP)) {
                        InterfaceC0833n interfaceC0833nK = c0Var2.K(strP);
                        if (!(interfaceC0833nK instanceof AbstractC0803h)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strP)));
                        }
                        abstractC0803h = (AbstractC0803h) interfaceC0833nK;
                    } else {
                        abstractC0803h = null;
                    }
                    if (abstractC0803h == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strP)));
                    }
                    abstractC0803h.a(this.f10616b, Collections.singletonList(interfaceC0833nC));
                }
            }
        } catch (Throwable th) {
            throw new Q(th);
        }
    }
}
