package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class E2 extends AbstractC0803h {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f10626s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E2(String str, int i) {
        super(str);
        this.f10626s = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC0803h
    public final InterfaceC0833n a(E.c0 c0Var, List list) {
        switch (this.f10626s) {
            case 0:
                return InterfaceC0833n.f10907d;
            case 1:
            case 2:
                return this;
            case 3:
                return new C0798g(Double.valueOf(0.0d));
            default:
                return InterfaceC0833n.f10907d;
        }
    }
}
