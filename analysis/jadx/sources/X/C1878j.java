package x;

import P.C0354f0;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.v;
import m5.C1386y;
import u.C1656j;
import w.InterfaceC1788i0;

/* JADX INFO: renamed from: x.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1878j extends n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f18313q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f18314r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v f18315s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1788i0 f18316t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ B5.c f18317u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1878j(float f, v vVar, InterfaceC1788i0 interfaceC1788i0, B5.c cVar, int i) {
        super(1);
        this.f18313q = i;
        this.f18314r = f;
        this.f18315s = vVar;
        this.f18316t = interfaceC1788i0;
        this.f18317u = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        float fA;
        switch (this.f18313q) {
            case 0:
                C1656j c1656j = (C1656j) obj;
                C0354f0 c0354f0 = c1656j.f16949e;
                float fAbs = Math.abs(((Number) c0354f0.getValue()).floatValue());
                float f = this.f18314r;
                float fAbs2 = Math.abs(f);
                B5.c cVar = this.f18317u;
                InterfaceC1788i0 interfaceC1788i0 = this.f18316t;
                v vVar = this.f18315s;
                if (fAbs >= fAbs2) {
                    float fD = AbstractC1880l.d(((Number) c0354f0.getValue()).floatValue(), f);
                    AbstractC1880l.b(c1656j, interfaceC1788i0, cVar, fD - vVar.f14265q);
                    c1656j.a();
                    vVar.f14265q = fD;
                } else {
                    AbstractC1880l.b(c1656j, interfaceC1788i0, cVar, ((Number) c0354f0.getValue()).floatValue() - vVar.f14265q);
                    vVar.f14265q = ((Number) c0354f0.getValue()).floatValue();
                }
                break;
            default:
                C1656j c1656j2 = (C1656j) obj;
                float fD2 = AbstractC1880l.d(((Number) c1656j2.f16949e.getValue()).floatValue(), this.f18314r);
                v vVar2 = this.f18315s;
                float f7 = fD2 - vVar2.f14265q;
                try {
                    fA = this.f18316t.a(f7);
                } catch (CancellationException unused) {
                    c1656j2.a();
                    fA = 0.0f;
                }
                this.f18317u.invoke(Float.valueOf(fA));
                if (Math.abs(f7 - fA) > 0.5f || fD2 != ((Number) c1656j2.f16949e.getValue()).floatValue()) {
                    c1656j2.a();
                }
                vVar2.f14265q += fA;
                break;
        }
        return C1386y.f15098a;
    }
}
