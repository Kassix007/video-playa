package A;

import m5.C1386y;
import r.C1543B;
import z0.AbstractC1932I;
import z0.AbstractC1933J;

/* JADX INFO: loaded from: classes.dex */
public final class P extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f38q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f39r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f40s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f41t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f42u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P(Object obj, Object obj2, Object obj3, int i, int i7) {
        super(1);
        this.f38q = i7;
        this.f40s = obj;
        this.f41t = obj2;
        this.f42u = obj3;
        this.f39r = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f38q) {
            case 0:
                AbstractC1932I abstractC1932I = (AbstractC1932I) obj;
                AbstractC1933J[] abstractC1933JArr = (AbstractC1933J[]) this.f40s;
                Q q7 = (Q) this.f41t;
                int[] iArr = (int[]) this.f42u;
                int length = abstractC1933JArr.length;
                int i = 0;
                int i7 = 0;
                while (i < length) {
                    AbstractC1933J abstractC1933J = abstractC1933JArr[i];
                    int i8 = i7 + 1;
                    kotlin.jvm.internal.m.b(abstractC1933J);
                    Object objG = abstractC1933J.g();
                    N n7 = objG instanceof N ? (N) objG : null;
                    C0025w c0025w = n7 != null ? n7.f36c : null;
                    int i9 = this.f39r;
                    AbstractC1932I.d(abstractC1932I, abstractC1933J, iArr[i7], c0025w != null ? c0025w.a(i9 - abstractC1933J.f18665r, W0.l.f8022q) : q7.f44b.a(0, i9 - abstractC1933J.f18665r));
                    i++;
                    i7 = i8;
                }
                return C1386y.f15098a;
            case 1:
                K4.d applyShadow = (K4.d) obj;
                kotlin.jvm.internal.m.e(applyShadow, "$this$applyShadow");
                applyShadow.f2964z = ((Integer) this.f40s).intValue();
                applyShadow.j();
                applyShadow.f2935A = ((Integer) this.f41t).intValue();
                applyShadow.j();
                applyShadow.f2936B = ((Integer) this.f42u).intValue();
                applyShadow.j();
                applyShadow.f2937C = this.f39r;
                applyShadow.j();
                applyShadow.a();
                return C1386y.f15098a;
            default:
                if (obj == ((P.C) this.f40s)) {
                    throw new IllegalStateException("A derived state calculation cannot read itself");
                }
                if (obj instanceof a0.u) {
                    int i10 = ((X.f) this.f41t).f8141a;
                    C1543B c1543b = (C1543B) this.f42u;
                    int i11 = i10 - this.f39r;
                    int iD = c1543b.d(obj);
                    c1543b.g(Math.min(i11, iD >= 0 ? c1543b.f16111c[iD] : Integer.MAX_VALUE), obj);
                }
                return C1386y.f15098a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(AbstractC1933J[] abstractC1933JArr, Q q7, int i, int[] iArr) {
        super(1);
        this.f38q = 0;
        this.f40s = abstractC1933JArr;
        this.f41t = q7;
        this.f39r = i;
        this.f42u = iArr;
    }
}
