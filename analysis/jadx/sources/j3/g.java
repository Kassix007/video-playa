package j3;

import L0.l;
import Z.m;
import a3.C;
import a3.C0632k;
import a3.y;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import i3.C1136a;
import i3.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n3.C1395a;

/* JADX INFO: loaded from: classes.dex */
public final class g extends b {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final c3.e f13812D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final c f13813E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final d3.h f13814F;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g(y yVar, e eVar, c cVar, C0632k c0632k) {
        super(yVar, eVar);
        this.f13813E = cVar;
        c3.e eVar2 = new c3.e(yVar, this, new n("__container", eVar.f13790a, false), c0632k);
        this.f13812D = eVar2;
        List list = Collections.EMPTY_LIST;
        eVar2.c(list, list);
        l lVar = this.f13759p.f13810x;
        if (lVar != null) {
            this.f13814F = new d3.h(this, this, lVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j3.b, c3.f
    public final void a(RectF rectF, Matrix matrix, boolean z5) {
        super.a(rectF, matrix, z5);
        this.f13812D.a(rectF, this.f13757n, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j3.b, g3.f
    public final void f(m mVar, Object obj) {
        super.f(mVar, obj);
        PointF pointF = C.f8770a;
        d3.h hVar = this.f13814F;
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
        d3.h hVar = this.f13814F;
        if (hVar != null) {
            c1395a = hVar.a(matrix, i);
        }
        this.f13812D.g(canvas, matrix, i, c1395a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j3.b
    public final C1136a l() {
        C1136a c1136a = this.f13759p.f13809w;
        return c1136a != null ? c1136a : this.f13813E.f13759p.f13809w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j3.b
    public final void p(g3.e eVar, int i, ArrayList arrayList, g3.e eVar2) {
        this.f13812D.h(eVar, i, arrayList, eVar2);
    }
}
