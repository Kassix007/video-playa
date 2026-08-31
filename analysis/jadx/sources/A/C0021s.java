package A;

import B0.AbstractC0041g;
import h0.AbstractC1111d;
import h0.C1115h;
import i0.C1131c;
import java.io.Serializable;
import m5.C1386y;
import z0.AbstractC1932I;
import z0.AbstractC1933J;
import z0.InterfaceC1944d;

/* JADX INFO: renamed from: A.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0021s extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f141q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f142r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f143s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f144t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f145u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Serializable f146v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0021s(h0.p pVar, h0.o oVar, h0.o oVar2, Object obj, int i, J j, int i7) {
        super(1);
        this.f141q = i7;
        this.f143s = oVar;
        this.f144t = oVar2;
        this.f145u = obj;
        this.f142r = i;
        this.f146v = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f141q) {
            case 0:
                AbstractC1932I abstractC1932I = (AbstractC1932I) obj;
                AbstractC1933J[] abstractC1933JArr = (AbstractC1933J[]) this.f143s;
                C0022t c0022t = (C0022t) this.f144t;
                B0.T t6 = (B0.T) this.f145u;
                int[] iArr = (int[]) this.f146v;
                int length = abstractC1933JArr.length;
                int i = 0;
                int i7 = 0;
                while (i < length) {
                    AbstractC1933J abstractC1933J = abstractC1933JArr[i];
                    int i8 = i7 + 1;
                    kotlin.jvm.internal.m.b(abstractC1933J);
                    Object objG = abstractC1933J.g();
                    N n7 = objG instanceof N ? (N) objG : null;
                    W0.l layoutDirection = t6.getLayoutDirection();
                    C0025w c0025w = n7 != null ? n7.f36c : null;
                    int i9 = this.f142r;
                    AbstractC1932I.d(abstractC1932I, abstractC1933J, c0025w != null ? c0025w.a(i9 - abstractC1933J.f18664q, layoutDirection) : c0022t.f148b.a(0, i9 - abstractC1933J.f18664q, layoutDirection), iArr[i7]);
                    i++;
                    i7 = i8;
                }
                return C1386y.f15098a;
            case 1:
                InterfaceC1944d interfaceC1944d = (InterfaceC1944d) obj;
                h0.o oVar = (h0.o) this.f144t;
                if (((h0.o) this.f143s) != ((C1115h) ((C0.A) AbstractC0041g.v(oVar)).getFocusOwner()).j) {
                    return Boolean.TRUE;
                }
                boolean zC = AbstractC1111d.C(oVar, (h0.o) this.f145u, this.f142r, (J) this.f146v);
                Boolean boolValueOf = Boolean.valueOf(zC);
                if (zC || !interfaceC1944d.a()) {
                    return boolValueOf;
                }
                return null;
            default:
                InterfaceC1944d interfaceC1944d2 = (InterfaceC1944d) obj;
                h0.o oVar2 = (h0.o) this.f144t;
                if (((h0.o) this.f143s) != ((C1115h) ((C0.A) AbstractC0041g.v(oVar2)).getFocusOwner()).j) {
                    return Boolean.TRUE;
                }
                boolean zB = AbstractC1111d.B(this.f142r, (J) this.f146v, oVar2, (C1131c) this.f145u);
                Boolean boolValueOf2 = Boolean.valueOf(zB);
                if (zB || !interfaceC1944d2.a()) {
                    return boolValueOf2;
                }
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: int[] */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0021s(AbstractC1933J[] abstractC1933JArr, C0022t c0022t, int i, B0.T t6, int[] iArr) {
        super(1);
        this.f141q = 0;
        this.f143s = abstractC1933JArr;
        this.f144t = c0022t;
        this.f142r = i;
        this.f145u = t6;
        this.f146v = iArr;
    }
}
