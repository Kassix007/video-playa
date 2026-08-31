package c3;

import a3.C;
import a3.y;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import d3.InterfaceC1001a;
import h3.C1123b;
import h3.C1125d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import n3.C1395a;

/* JADX INFO: loaded from: classes.dex */
public final class q implements f, n, k, InterfaceC1001a, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f10211a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f10212b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f10213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j3.b f10214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10215e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d3.i f10216g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d3.i f10217h;
    public final d3.q i;
    public e j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q(y yVar, j3.b bVar, i3.j jVar) {
        this.f10213c = yVar;
        this.f10214d = bVar;
        this.f10215e = jVar.f13602b;
        this.f = jVar.f13604d;
        d3.i iVarF = jVar.f13603c.f();
        this.f10216g = iVarF;
        bVar.d(iVarF);
        iVarF.a(this);
        d3.i iVarF2 = ((C1123b) jVar.f13605e).f();
        this.f10217h = iVarF2;
        bVar.d(iVarF2);
        iVarF2.a(this);
        C1125d c1125d = (C1125d) jVar.f;
        c1125d.getClass();
        d3.q qVar = new d3.q(c1125d);
        this.i = qVar;
        qVar.a(bVar);
        qVar.b(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.f
    public final void a(RectF rectF, Matrix matrix, boolean z5) {
        this.j.a(rectF, matrix, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.InterfaceC1001a
    public final void b() {
        this.f10213c.invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.d
    public final void c(List list, List list2) {
        this.j.c(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.k
    public final void d(ListIterator listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((d) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new e(this.f10213c, this.f10214d, "Repeater", this.f, arrayList, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.n
    public final Path e() {
        Path pathE = this.j.e();
        Path path = this.f10212b;
        path.reset();
        float fFloatValue = ((Float) this.f10216g.e()).floatValue();
        float fFloatValue2 = ((Float) this.f10217h.e()).floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            Matrix matrixF = this.i.f(i + fFloatValue2);
            Matrix matrix = this.f10211a;
            matrix.set(matrixF);
            path.addPath(pathE, matrix);
        }
        return path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g3.f
    public final void f(Z.m mVar, Object obj) {
        if (this.i.c(mVar, obj)) {
            return;
        }
        if (obj == C.f8782p) {
            this.f10216g.j(mVar);
        } else if (obj == C.f8783q) {
            this.f10217h.j(mVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.f
    public final void g(Canvas canvas, Matrix matrix, int i, C1395a c1395a) {
        float fFloatValue = ((Float) this.f10216g.e()).floatValue();
        float fFloatValue2 = ((Float) this.f10217h.e()).floatValue();
        d3.q qVar = this.i;
        float fFloatValue3 = ((Float) qVar.f12269m.e()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) qVar.f12270n.e()).floatValue() / 100.0f;
        for (int i7 = ((int) fFloatValue) - 1; i7 >= 0; i7--) {
            Matrix matrix2 = this.f10211a;
            matrix2.set(matrix);
            float f = i7;
            matrix2.preConcat(qVar.f(f + fFloatValue2));
            this.j.g(canvas, matrix2, (int) (n3.g.f(fFloatValue3, fFloatValue4, f / fFloatValue) * i), c1395a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.d
    public final String getName() {
        return this.f10215e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g3.f
    public final void h(g3.e eVar, int i, ArrayList arrayList, g3.e eVar2) {
        n3.g.g(eVar, i, arrayList, eVar2, this);
        for (int i7 = 0; i7 < this.j.i.size(); i7++) {
            d dVar = (d) this.j.i.get(i7);
            if (dVar instanceof l) {
                n3.g.g(eVar, i, arrayList, eVar2, (l) dVar);
            }
        }
    }
}
