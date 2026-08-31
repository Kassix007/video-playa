package c3;

import a3.C;
import a3.y;
import android.graphics.Path;
import android.graphics.PointF;
import d3.InterfaceC1001a;
import i3.C1137b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g implements n, InterfaceC1001a, l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f10141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d3.j f10142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d3.e f10143e;
    public final C1137b f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10145h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f10139a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0733c f10144g = new C0733c(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g(y yVar, j3.b bVar, C1137b c1137b) {
        this.f10140b = c1137b.f13563a;
        this.f10141c = yVar;
        d3.e eVarF = c1137b.f13565c.f();
        this.f10142d = (d3.j) eVarF;
        d3.e eVarF2 = c1137b.f13564b.f();
        this.f10143e = eVarF2;
        this.f = c1137b;
        bVar.d(eVarF);
        bVar.d(eVarF2);
        eVarF.a(this);
        eVarF2.a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.InterfaceC1001a
    public final void b() {
        this.f10145h = false;
        this.f10141c.invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.d
    public final void c(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            d dVar = (d) arrayList.get(i);
            if (dVar instanceof u) {
                u uVar = (u) dVar;
                if (uVar.f10234c == 1) {
                    this.f10144g.f10129a.add(uVar);
                    uVar.d(this);
                }
            }
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.n
    public final Path e() {
        boolean z5 = this.f10145h;
        Path path = this.f10139a;
        if (z5) {
            return path;
        }
        path.reset();
        C1137b c1137b = this.f;
        if (c1137b.f13567e) {
            this.f10145h = true;
            return path;
        }
        PointF pointF = (PointF) this.f10142d.e();
        float f = pointF.x / 2.0f;
        float f7 = pointF.y / 2.0f;
        float f8 = f * 0.55228f;
        float f9 = f7 * 0.55228f;
        path.reset();
        if (c1137b.f13566d) {
            float f10 = -f7;
            path.moveTo(0.0f, f10);
            float f11 = 0.0f - f8;
            float f12 = -f;
            float f13 = 0.0f - f9;
            path.cubicTo(f11, f10, f12, f13, f12, 0.0f);
            float f14 = f9 + 0.0f;
            path.cubicTo(f12, f14, f11, f7, 0.0f, f7);
            float f15 = f8 + 0.0f;
            path.cubicTo(f15, f7, f, f14, f, 0.0f);
            path.cubicTo(f, f13, f15, f10, 0.0f, f10);
        } else {
            float f16 = -f7;
            path.moveTo(0.0f, f16);
            float f17 = f8 + 0.0f;
            float f18 = 0.0f - f9;
            path.cubicTo(f17, f16, f, f18, f, 0.0f);
            float f19 = f9 + 0.0f;
            path.cubicTo(f, f19, f17, f7, 0.0f, f7);
            float f20 = 0.0f - f8;
            float f21 = -f;
            path.cubicTo(f20, f7, f21, f19, f21, 0.0f);
            path.cubicTo(f21, f18, f20, f16, 0.0f, f16);
        }
        PointF pointF2 = (PointF) this.f10143e.e();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.f10144g.c(path);
        this.f10145h = true;
        return path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g3.f
    public final void f(Z.m mVar, Object obj) {
        if (obj == C.f) {
            this.f10142d.j(mVar);
        } else if (obj == C.i) {
            this.f10143e.j(mVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.d
    public final String getName() {
        return this.f10140b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g3.f
    public final void h(g3.e eVar, int i, ArrayList arrayList, g3.e eVar2) {
        n3.g.g(eVar, i, arrayList, eVar2, this);
    }
}
