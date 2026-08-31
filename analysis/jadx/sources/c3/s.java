package c3;

import a3.C;
import a3.y;
import android.graphics.Path;
import d3.InterfaceC1001a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s implements n, InterfaceC1001a, l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f10224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d3.n f10225e;
    public boolean f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f10221a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0733c f10226g = new C0733c(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s(y yVar, j3.b bVar, i3.o oVar) {
        this.f10222b = oVar.f13618a;
        this.f10223c = oVar.f13621d;
        this.f10224d = yVar;
        d3.n nVar = new d3.n((List) oVar.f13620c.f4346r);
        this.f10225e = nVar;
        bVar.d(nVar);
        nVar.a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.InterfaceC1001a
    public final void b() {
        this.f = false;
        this.f10224d.invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    @Override // c3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.util.List r6, java.util.List r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            r1 = r6
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            if (r0 >= r2) goto L40
            java.lang.Object r1 = r1.get(r0)
            c3.d r1 = (c3.d) r1
            boolean r2 = r1 instanceof c3.u
            if (r2 == 0) goto L28
            r2 = r1
            c3.u r2 = (c3.u) r2
            int r3 = r2.f10234c
            r4 = 1
            if (r3 != r4) goto L28
            c3.c r1 = r5.f10226g
            java.util.ArrayList r1 = r1.f10129a
            r1.add(r2)
            r2.d(r5)
            goto L3d
        L28:
            boolean r2 = r1 instanceof c3.r
            if (r2 == 0) goto L3d
            if (r7 != 0) goto L33
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L33:
            c3.r r1 = (c3.r) r1
            d3.e r2 = r1.f10219b
            r2.a(r5)
            r7.add(r1)
        L3d:
            int r0 = r0 + 1
            goto L2
        L40:
            d3.n r6 = r5.f10225e
            r6.f12252m = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.s.c(java.util.List, java.util.List):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.n
    public final Path e() {
        boolean z5 = this.f;
        d3.n nVar = this.f10225e;
        Path path = this.f10221a;
        if (z5 && nVar.f12234e == null) {
            return path;
        }
        path.reset();
        if (this.f10223c) {
            this.f = true;
            return path;
        }
        Path path2 = (Path) nVar.e();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f10226g.c(path);
        this.f = true;
        return path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g3.f
    public final void f(Z.m mVar, Object obj) {
        if (obj == C.f8769K) {
            this.f10225e.j(mVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.d
    public final String getName() {
        return this.f10222b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g3.f
    public final void h(g3.e eVar, int i, ArrayList arrayList, g3.e eVar2) {
        n3.g.g(eVar, i, arrayList, eVar2, this);
    }
}
