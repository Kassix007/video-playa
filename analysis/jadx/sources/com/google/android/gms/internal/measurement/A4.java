package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class A4 extends AbstractC0803h {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final F2 f10596s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashMap f10597t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public A4(F2 f22) {
        super("require");
        this.f10597t = new HashMap();
        this.f10596s = f22;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC0803h
    public final InterfaceC0833n a(E.c0 c0Var, List list) {
        InterfaceC0833n interfaceC0833n;
        I1.I0(1, "require", list);
        String strZzc = ((C0862t) c0Var.f1553r).c(c0Var, (InterfaceC0833n) list.get(0)).zzc();
        HashMap map = this.f10597t;
        if (map.containsKey(strZzc)) {
            return (InterfaceC0833n) map.get(strZzc);
        }
        HashMap map2 = (HashMap) this.f10596s.f10630q;
        if (map2.containsKey(strZzc)) {
            try {
                interfaceC0833n = (InterfaceC0833n) ((Callable) map2.get(strZzc)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strZzc)));
            }
        } else {
            interfaceC0833n = InterfaceC0833n.f10907d;
        }
        if (interfaceC0833n instanceof AbstractC0803h) {
            map.put(strZzc, (AbstractC0803h) interfaceC0833n);
        }
        return interfaceC0833n;
    }
}
