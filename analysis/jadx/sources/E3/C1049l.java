package e3;

import A.C0028z;
import B0.InterfaceC0060z;
import B0.T;
import c0.AbstractC0724l;
import com.google.android.gms.internal.measurement.P1;
import z0.AbstractC1933J;
import z0.InterfaceC1925B;
import z0.InterfaceC1927D;

/* JADX INFO: renamed from: e3.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1049l extends AbstractC0724l implements InterfaceC0060z {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f12599E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f12600F;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0060z
    public final InterfaceC1927D c(T t6, InterfaceC1925B measurable, long j) {
        long jA;
        kotlin.jvm.internal.m.e(measurable, "measurable");
        long jD = W0.b.d(j, P1.a(this.f12599E, this.f12600F));
        if (W0.a.g(j) == Integer.MAX_VALUE && W0.a.h(j) != Integer.MAX_VALUE) {
            int i = (int) (jD >> 32);
            int i7 = (this.f12600F * i) / this.f12599E;
            jA = W0.b.a(i, i, i7, i7);
        } else if (W0.a.h(j) != Integer.MAX_VALUE || W0.a.g(j) == Integer.MAX_VALUE) {
            int i8 = (int) (jD >> 32);
            int i9 = (int) (jD & 4294967295L);
            jA = W0.b.a(i8, i8, i9, i9);
        } else {
            int i10 = (int) (jD & 4294967295L);
            int i11 = (this.f12599E * i10) / this.f12600F;
            jA = W0.b.a(i11, i11, i10, i10);
        }
        AbstractC1933J abstractC1933JA = measurable.a(jA);
        return t6.f(abstractC1933JA.f18664q, abstractC1933JA.f18665r, n5.t.f15300q, new C0028z(abstractC1933JA, 4));
    }
}
