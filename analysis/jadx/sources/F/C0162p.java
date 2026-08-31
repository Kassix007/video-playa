package F;

import B0.G0;
import M5.AbstractC0263y;
import O3.C0299l;
import P.C0363k;
import P.C0371o;
import android.graphics.Typeface;
import android.text.Spannable;
import com.google.android.gms.internal.measurement.P1;
import i0.C1130b;
import m5.C1386y;
import v0.C1743l;
import w.C1770B;
import w.C1803q;
import w.EnumC1778d0;
import x.AbstractC1880l;

/* JADX INFO: renamed from: F.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0162p extends kotlin.jvm.internal.n implements B5.f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1902q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f1903r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f1904s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0162p(int i, Object obj, Object obj2) {
        super(3);
        this.f1902q = i;
        this.f1903r = obj;
        this.f1904s = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v9, types: [B5.c, kotlin.jvm.internal.n] */
    @Override // B5.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        switch (this.f1902q) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                float fFloatValue2 = ((Number) obj2).floatValue();
                float fFloatValue3 = ((Number) obj3).floatValue();
                C0151e c0151e = (C0151e) this.f1903r;
                W0.l lVar = (W0.l) this.f1904s;
                boolean zF = E3.h.F(c0151e, fFloatValue);
                if (c0151e.k().f1764e != EnumC1778d0.f17945q && lVar != W0.l.f8022q) {
                    zF = !zF;
                }
                int i = c0151e.k().f1761b;
                float fY = i == 0 ? 0.0f : E3.h.y(c0151e) / i;
                float f = fY - ((int) fY);
                char c7 = Math.abs(fFloatValue) >= c0151e.f1831q.u(AbstractC1880l.f18324a) ? fFloatValue > 0.0f ? (char) 1 : (char) 2 : (char) 0;
                if (c7 == 0) {
                    fFloatValue2 = Math.abs(f) > 0.5f ? fFloatValue3 : fFloatValue3;
                } else if (c7 != 1) {
                    if (c7 != 2) {
                        fFloatValue2 = 0.0f;
                    }
                }
                return Float.valueOf(fFloatValue2);
            case 1:
                L0.y yVar = (L0.y) obj;
                int iIntValue = ((Number) obj2).intValue();
                int iIntValue2 = ((Number) obj3).intValue();
                Spannable spannable = (Spannable) this.f1903r;
                S0.c cVar = (S0.c) this.f1904s;
                O0.p pVar = yVar.f;
                O0.j jVar = yVar.f3229c;
                if (jVar == null) {
                    jVar = O0.j.f4281s;
                }
                O0.h hVar = yVar.f3230d;
                int i7 = hVar != null ? hVar.f4278a : 0;
                O0.i iVar = yVar.f3231e;
                int i8 = iVar != null ? iVar.f4279a : 65535;
                S0.d dVar = (S0.d) cVar.f7280r;
                O0.r rVarB = ((O0.e) dVar.f7285e).b(pVar, jVar, i7, i8);
                if (rVarB instanceof O0.r) {
                    Object obj4 = rVarB.f4294q;
                    kotlin.jvm.internal.m.c(obj4, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj4;
                } else {
                    G0 g02 = new G0(rVarB, dVar.j);
                    dVar.j = g02;
                    Object obj5 = g02.f234r;
                    kotlin.jvm.internal.m.c(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj5;
                }
                spannable.setSpan(new N0.b(1, typeface), iIntValue, iIntValue2, 33);
                return C1386y.f15098a;
            case 2:
                C0371o c0371o = (C0371o) obj2;
                ((Number) obj3).intValue();
                c0371o.S(-353972293);
                v.Q qA = ((v.P) this.f1903r).a((y.i) this.f1904s, c0371o);
                boolean zG = c0371o.g(qA);
                Object objH = c0371o.H();
                if (zG || objH == C0363k.f5418a) {
                    objH = new v.T(qA);
                    c0371o.d0(objH);
                }
                v.T t6 = (v.T) objH;
                c0371o.p(false);
                return t6;
            default:
                C1743l c1743l = (C1743l) obj;
                C1743l c1743l2 = (C1743l) obj2;
                long j = ((C1130b) obj3).f13520a;
                w.C c8 = (w.C) this.f1903r;
                if (((Boolean) c8.f17745H.invoke(c1743l)).booleanValue()) {
                    if (!c8.f17750M) {
                        if (c8.f17748K == null) {
                            c8.f17748K = l6.d.e(Integer.MAX_VALUE, null, 6);
                        }
                        c8.f17750M = true;
                        AbstractC0263y.t(c8.l0(), null, null, new C1770B(c8, null), 3);
                    }
                    P1.d((C0299l) this.f1904s, c1743l);
                    long jD = C1130b.d(c1743l2.f17462c, j);
                    O5.e eVar = c8.f17748K;
                    if (eVar != null) {
                        eVar.j(new C1803q(jD));
                    }
                }
                return C1386y.f15098a;
        }
    }
}
