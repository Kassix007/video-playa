package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0813j {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static InterfaceC0833n i(InterfaceC0813j interfaceC0813j, C0848q c0848q, E.c0 c0Var, ArrayList arrayList) {
        String str = c0848q.f11014q;
        if (interfaceC0813j.j(str)) {
            InterfaceC0833n interfaceC0833nH = interfaceC0813j.h(str);
            if (interfaceC0833nH instanceof AbstractC0803h) {
                return ((AbstractC0803h) interfaceC0833nH).a(c0Var, arrayList);
            }
            throw new IllegalArgumentException(C0.S.l(str, " is not a function"));
        }
        if (!"hasOwnProperty".equals(str)) {
            throw new IllegalArgumentException(C0.S.w("Object has no function ", str));
        }
        I1.I0(1, "hasOwnProperty", arrayList);
        return interfaceC0813j.j(((C0862t) c0Var.f1553r).c(c0Var, (InterfaceC0833n) arrayList.get(0)).zzc()) ? InterfaceC0833n.i : InterfaceC0833n.j;
    }

    InterfaceC0833n h(String str);

    boolean j(String str);

    void k(String str, InterfaceC0833n interfaceC0833n);
}
