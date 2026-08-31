package j3;

import U.l;
import Z.m;
import a3.C;
import a3.C0632k;
import a3.y;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import d3.r;
import h3.C1123b;
import java.util.ArrayList;
import java.util.List;
import n3.C1395a;
import r.C1566q;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public d3.e f13770D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ArrayList f13771E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final RectF f13772F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final RectF f13773G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final RectF f13774H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final n3.h f13775I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final l f13776J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f13777K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f13778L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final d3.h f13779M;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(y yVar, e eVar, List list, C0632k c0632k) {
        b bVar;
        b cVar;
        String str;
        super(yVar, eVar);
        this.f13771E = new ArrayList();
        this.f13772F = new RectF();
        this.f13773G = new RectF();
        this.f13774H = new RectF();
        this.f13775I = new n3.h();
        this.f13776J = new l(6);
        this.f13778L = true;
        C1123b c1123b = eVar.f13805s;
        if (c1123b != null) {
            d3.i iVarF = c1123b.f();
            this.f13770D = iVarF;
            d(iVarF);
            this.f13770D.a(this);
        } else {
            this.f13770D = null;
        }
        C1566q c1566q = new C1566q(c0632k.j.size());
        int size = list.size() - 1;
        b bVar2 = null;
        while (true) {
            if (size < 0) {
                for (int i = 0; i < c1566q.g(); i++) {
                    b bVar3 = (b) c1566q.b(c1566q.d(i));
                    if (bVar3 != null && (bVar = (b) c1566q.b(bVar3.f13759p.f)) != null) {
                        bVar3.f13763t = bVar;
                    }
                }
                L0.l lVar = this.f13759p.f13810x;
                if (lVar != null) {
                    this.f13779M = new d3.h(this, this, lVar);
                    return;
                }
                return;
            }
            e eVar2 = (e) list.get(size);
            int iA = O.c.a(eVar2.f13794e);
            if (iA == 0) {
                cVar = new c(yVar, eVar2, (List) c0632k.f8835c.get(eVar2.f13795g), c0632k);
            } else if (iA == 1) {
                cVar = new h(yVar, eVar2);
            } else if (iA == 2) {
                cVar = new d(yVar, eVar2);
            } else if (iA == 3) {
                cVar = new f(yVar, eVar2);
            } else if (iA == 4) {
                cVar = new g(yVar, eVar2, this, c0632k);
            } else if (iA != 5) {
                switch (eVar2.f13794e) {
                    case 1:
                        str = "PRE_COMP";
                        break;
                    case 2:
                        str = "SOLID";
                        break;
                    case 3:
                        str = "IMAGE";
                        break;
                    case 4:
                        str = "NULL";
                        break;
                    case 5:
                        str = "SHAPE";
                        break;
                    case 6:
                        str = "TEXT";
                        break;
                    case 7:
                        str = "UNKNOWN";
                        break;
                    default:
                        str = "null";
                        break;
                }
                n3.c.b("Unknown layer type ".concat(str));
                cVar = null;
            } else {
                cVar = new j(yVar, eVar2);
            }
            if (cVar != null) {
                c1566q.e(cVar.f13759p.f13793d, cVar);
                if (bVar2 != null) {
                    bVar2.f13762s = cVar;
                    bVar2 = null;
                } else {
                    this.f13771E.add(0, cVar);
                    int iA2 = O.c.a(eVar2.f13807u);
                    if (iA2 == 1 || iA2 == 2) {
                        bVar2 = cVar;
                    }
                }
            }
            size--;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j3.b, c3.f
    public final void a(RectF rectF, Matrix matrix, boolean z5) {
        super.a(rectF, matrix, z5);
        ArrayList arrayList = this.f13771E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.f13772F;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((b) arrayList.get(size)).a(rectF2, this.f13757n, true);
            rectF.union(rectF2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j3.b, g3.f
    public final void f(m mVar, Object obj) {
        super.f(mVar, obj);
        if (obj == C.f8792z) {
            r rVar = new r(mVar, null);
            this.f13770D = rVar;
            rVar.a(this);
            d(this.f13770D);
            return;
        }
        d3.h hVar = this.f13779M;
        if (obj == 5 && hVar != null) {
            hVar.f12240c.j(mVar);
            return;
        }
        if (obj == C.f8760B && hVar != null) {
            hVar.c(mVar);
            return;
        }
        if (obj == C.f8761C && hVar != null) {
            hVar.f12242e.j(mVar);
            return;
        }
        if (obj == C.f8762D && hVar != null) {
            hVar.f.j(mVar);
        } else {
            if (obj != C.f8763E || hVar == null) {
                return;
            }
            hVar.f12243g.j(mVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j3.b
    public final void k(Canvas canvas, Matrix matrix, int i, C1395a c1395a) {
        Canvas canvasE;
        d3.h hVar = this.f13779M;
        int i7 = 0;
        boolean z5 = (c1395a == null && hVar == null) ? false : true;
        y yVar = this.f13758o;
        boolean z6 = yVar.f8894I;
        ArrayList arrayList = this.f13771E;
        boolean z7 = (z6 && arrayList.size() > 1 && i != 255) || (z5 && yVar.f8895J);
        int i8 = z7 ? 255 : i;
        if (hVar != null) {
            c1395a = hVar.a(matrix, i8);
        }
        boolean z8 = this.f13778L;
        e eVar = this.f13759p;
        RectF rectF = this.f13773G;
        if (z8 || !"__container".equals(eVar.f13792c)) {
            rectF.set(0.0f, 0.0f, eVar.f13801o, eVar.f13802p);
            matrix.mapRect(rectF);
        } else {
            rectF.setEmpty();
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                RectF rectF2 = this.f13774H;
                ((b) obj).a(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        }
        n3.h hVar2 = this.f13775I;
        if (z7) {
            l lVar = this.f13776J;
            lVar.f7511r = null;
            lVar.f7510q = i;
            if (c1395a != null) {
                if (Color.alpha(c1395a.f15150d) > 0) {
                    lVar.f7511r = c1395a;
                } else {
                    lVar.f7511r = null;
                }
                c1395a = null;
            }
            canvasE = hVar2.e(canvas, rectF, lVar);
        } else {
            canvasE = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((b) arrayList.get(size2)).g(canvasE, matrix, i8, c1395a);
            }
        }
        if (z7) {
            hVar2.c();
        }
        canvas.restore();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j3.b
    public final void p(g3.e eVar, int i, ArrayList arrayList, g3.e eVar2) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f13771E;
            if (i7 >= arrayList2.size()) {
                return;
            }
            ((b) arrayList2.get(i7)).h(eVar, i, arrayList, eVar2);
            i7++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j3.b
    public final void q(boolean z5) {
        super.q(z5);
        ArrayList arrayList = this.f13771E;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((b) obj).q(z5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j3.b
    public final void r(float f) {
        this.f13777K = f;
        super.r(f);
        d3.e eVar = this.f13770D;
        e eVar2 = this.f13759p;
        if (eVar != null) {
            C0632k c0632k = this.f13758o.f8920q;
            f = ((((Float) eVar.e()).floatValue() * eVar2.f13791b.f8843n) - eVar2.f13791b.f8841l) / ((c0632k.f8842m - c0632k.f8841l) + 0.01f);
        }
        if (this.f13770D == null) {
            float f7 = eVar2.f13800n;
            C0632k c0632k2 = eVar2.f13791b;
            f -= f7 / (c0632k2.f8842m - c0632k2.f8841l);
        }
        if (eVar2.f13799m != 0.0f && !"__container".equals(eVar2.f13792c)) {
            f /= eVar2.f13799m;
        }
        ArrayList arrayList = this.f13771E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((b) arrayList.get(size)).r(f);
        }
    }
}
