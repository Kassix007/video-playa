package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0828m extends AbstractC0803h {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f10900s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f10901t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final E.c0 f10902u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0828m(C0828m c0828m) {
        super(c0828m.f10855q);
        ArrayList arrayList = new ArrayList(c0828m.f10900s.size());
        this.f10900s = arrayList;
        arrayList.addAll(c0828m.f10900s);
        ArrayList arrayList2 = new ArrayList(c0828m.f10901t.size());
        this.f10901t = arrayList2;
        arrayList2.addAll(c0828m.f10901t);
        this.f10902u = c0828m.f10902u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC0803h
    public final InterfaceC0833n a(E.c0 c0Var, List list) {
        r rVar;
        E.c0 c0VarG = this.f10902u.G();
        C0862t c0862t = (C0862t) c0VarG.f1553r;
        int i = 0;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f10900s;
            int size = arrayList.size();
            rVar = InterfaceC0833n.f10907d;
            if (i7 >= size) {
                break;
            }
            if (i7 < list.size()) {
                c0VarG.J((String) arrayList.get(i7), ((C0862t) c0Var.f1553r).c(c0Var, (InterfaceC0833n) list.get(i7)));
            } else {
                c0VarG.J((String) arrayList.get(i7), rVar);
            }
            i7++;
        }
        ArrayList arrayList2 = this.f10901t;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj = arrayList2.get(i);
            i++;
            InterfaceC0833n interfaceC0833n = (InterfaceC0833n) obj;
            InterfaceC0833n interfaceC0833nC = c0862t.c(c0VarG, interfaceC0833n);
            if (interfaceC0833nC instanceof C0838o) {
                interfaceC0833nC = c0862t.c(c0VarG, interfaceC0833n);
            }
            if (interfaceC0833nC instanceof C0793f) {
                return ((C0793f) interfaceC0833nC).f10834q;
            }
        }
        return rVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC0803h, com.google.android.gms.internal.measurement.InterfaceC0833n
    public final InterfaceC0833n l() {
        return new C0828m(this);
    }

    public C0828m(String str, ArrayList arrayList, List list, E.c0 c0Var) {
        super(str);
        this.f10900s = new ArrayList();
        this.f10902u = c0Var;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                this.f10900s.add(((InterfaceC0833n) obj).zzc());
            }
        }
        this.f10901t = new ArrayList(list);
    }
}
