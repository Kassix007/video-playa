package com.google.android.gms.internal.measurement;

import B0.C0050o;
import O3.C0300l0;
import O3.CallableC0297k0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class R1 extends AbstractC0803h {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f10695s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f10696t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public R1(B0.G0 g02) {
        super("internal.eventLogger");
        this.f10696t = g02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC0803h
    public final InterfaceC0833n a(E.c0 c0Var, List list) {
        TreeMap treeMap;
        switch (this.f10695s) {
            case 0:
                I1.I0(3, this.f10855q, list);
                String strZzc = ((C0862t) c0Var.f1553r).c(c0Var, (InterfaceC0833n) list.get(0)).zzc();
                InterfaceC0833n interfaceC0833n = (InterfaceC0833n) list.get(1);
                C0862t c0862t = (C0862t) c0Var.f1553r;
                long jP0 = (long) I1.P0(c0862t.c(c0Var, interfaceC0833n).b().doubleValue());
                InterfaceC0833n interfaceC0833nC = c0862t.c(c0Var, (InterfaceC0833n) list.get(2));
                HashMap mapR0 = interfaceC0833nC instanceof C0818k ? I1.R0((C0818k) interfaceC0833nC) : new HashMap();
                B0.G0 g02 = (B0.G0) this.f10696t;
                g02.getClass();
                HashMap map = new HashMap();
                for (String str : mapR0.keySet()) {
                    HashMap map2 = ((C0773b) g02.f234r).f10801c;
                    map.put(str, C0773b.b(map2.containsKey(str) ? map2.get(str) : null, mapR0.get(str), str));
                }
                ((ArrayList) g02.f236t).add(new C0773b(strZzc, jP0, map));
                return InterfaceC0833n.f10907d;
            case 1:
                I1.I0(2, "getValue", list);
                InterfaceC0833n interfaceC0833nC2 = ((C0862t) c0Var.f1553r).c(c0Var, (InterfaceC0833n) list.get(0));
                InterfaceC0833n interfaceC0833nC3 = ((C0862t) c0Var.f1553r).c(c0Var, (InterfaceC0833n) list.get(1));
                String strZzc2 = interfaceC0833nC2.zzc();
                C0050o c0050o = (C0050o) this.f10696t;
                Map map3 = (Map) ((C0300l0) c0050o.f500r).f4950u.get((String) c0050o.f499q);
                String str2 = (map3 == null || !map3.containsKey(strZzc2)) ? null : (String) map3.get(strZzc2);
                return str2 != null ? new C0848q(str2) : interfaceC0833nC3;
            case 2:
                return InterfaceC0833n.f10907d;
            case 3:
                try {
                    return K1.O(((CallableC0297k0) this.f10696t).call());
                } catch (Exception unused) {
                    return InterfaceC0833n.f10907d;
                }
            default:
                I1.I0(3, this.f10855q, list);
                ((C0862t) c0Var.f1553r).c(c0Var, (InterfaceC0833n) list.get(0)).zzc();
                InterfaceC0833n interfaceC0833n2 = (InterfaceC0833n) list.get(1);
                C0862t c0862t2 = (C0862t) c0Var.f1553r;
                InterfaceC0833n interfaceC0833nC4 = c0862t2.c(c0Var, interfaceC0833n2);
                if (!(interfaceC0833nC4 instanceof C0828m)) {
                    throw new IllegalArgumentException("Invalid callback type");
                }
                InterfaceC0833n interfaceC0833nC5 = c0862t2.c(c0Var, (InterfaceC0833n) list.get(2));
                if (!(interfaceC0833nC5 instanceof C0818k)) {
                    throw new IllegalArgumentException("Invalid callback params");
                }
                C0818k c0818k = (C0818k) interfaceC0833nC5;
                if (!c0818k.f10881q.containsKey("type")) {
                    throw new IllegalArgumentException("Undefined rule type");
                }
                String strZzc3 = c0818k.h("type").zzc();
                int iO0 = c0818k.f10881q.containsKey("priority") ? I1.O0(c0818k.h("priority").b().doubleValue()) : 1000;
                C0862t c0862t3 = (C0862t) this.f10696t;
                C0828m c0828m = (C0828m) interfaceC0833nC4;
                c0862t3.getClass();
                if ("create".equals(strZzc3)) {
                    treeMap = (TreeMap) c0862t3.f11034b;
                } else {
                    if (!"edit".equals(strZzc3)) {
                        throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(strZzc3)));
                    }
                    treeMap = (TreeMap) c0862t3.f11033a;
                }
                if (treeMap.containsKey(Integer.valueOf(iO0))) {
                    iO0 = ((Integer) treeMap.lastKey()).intValue() + 1;
                }
                treeMap.put(Integer.valueOf(iO0), c0828m);
                return InterfaceC0833n.f10907d;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public R1(CallableC0297k0 callableC0297k0) {
        super("internal.appMetadata");
        this.f10696t = callableC0297k0;
    }

    public R1(C0862t c0862t) {
        super("internal.registerCallback");
        this.f10696t = c0862t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R1(E2 e22, C0050o c0050o) {
        super("getValue");
        this.f10696t = c0050o;
    }

    public R1(k3.d dVar) {
        super("internal.logger");
        this.f10696t = dVar;
        this.f10856r.put("log", new z4(this, false, true));
        this.f10856r.put("silent", new E2("silent", 1));
        ((AbstractC0803h) this.f10856r.get("silent")).k("log", new z4(this, true, true));
        this.f10856r.put("unmonitored", new E2("unmonitored", 2));
        ((AbstractC0803h) this.f10856r.get("unmonitored")).k("log", new z4(this, false, false));
    }
}
