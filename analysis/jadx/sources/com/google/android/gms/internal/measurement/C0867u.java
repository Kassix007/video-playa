package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0867u implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0803h f11045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E.c0 f11046b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0867u(AbstractC0803h abstractC0803h, E.c0 c0Var) {
        this.f11045a = abstractC0803h;
        this.f11046b = c0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC0833n interfaceC0833n = (InterfaceC0833n) obj;
        InterfaceC0833n interfaceC0833n2 = (InterfaceC0833n) obj2;
        if (interfaceC0833n instanceof r) {
            return !(interfaceC0833n2 instanceof r) ? 1 : 0;
        }
        if (interfaceC0833n2 instanceof r) {
            return -1;
        }
        AbstractC0803h abstractC0803h = this.f11045a;
        return abstractC0803h == null ? interfaceC0833n.zzc().compareTo(interfaceC0833n2.zzc()) : (int) I1.P0(abstractC0803h.a(this.f11046b, Arrays.asList(interfaceC0833n, interfaceC0833n2)).b().doubleValue());
    }
}
