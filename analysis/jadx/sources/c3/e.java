package c3;

import a3.C0632k;
import a3.y;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import d3.InterfaceC1001a;
import h3.C1125d;
import i3.InterfaceC1138c;
import java.util.ArrayList;
import java.util.List;
import n3.C1395a;

/* JADX INFO: loaded from: classes.dex */
public final class e implements f, n, InterfaceC1001a, g3.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U.l f10130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f10131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n3.h f10132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f10133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f10134e;
    public final RectF f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f10135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f10136h;
    public final ArrayList i;
    public final y j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f10137k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d3.q f10138l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(y yVar, j3.b bVar, i3.n nVar, C0632k c0632k) {
        C1125d c1125d;
        String str = nVar.f13615a;
        boolean z5 = nVar.f13617c;
        List list = nVar.f13616b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            d dVarA = ((InterfaceC1138c) list.get(i7)).a(yVar, c0632k, bVar);
            if (dVarA != null) {
                arrayList.add(dVarA);
            }
        }
        while (true) {
            if (i >= list.size()) {
                c1125d = null;
                break;
            }
            InterfaceC1138c interfaceC1138c = (InterfaceC1138c) list.get(i);
            if (interfaceC1138c instanceof C1125d) {
                c1125d = (C1125d) interfaceC1138c;
                break;
            }
            i++;
        }
        this(yVar, bVar, str, z5, arrayList, c1125d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.f
    public final void a(RectF rectF, Matrix matrix, boolean z5) {
        Matrix matrix2 = this.f10133d;
        matrix2.set(matrix);
        d3.q qVar = this.f10138l;
        if (qVar != null) {
            matrix2.preConcat(qVar.e());
        }
        RectF rectF2 = this.f;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d dVar = (d) arrayList.get(size);
            if (dVar instanceof f) {
                ((f) dVar).a(rectF2, matrix2, z5);
                rectF.union(rectF2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.InterfaceC1001a
    public final void b() {
        this.j.invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.d
    public final void c(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            d dVar = (d) arrayList.get(size2);
            dVar.c(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(dVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List d() {
        if (this.f10137k == null) {
            this.f10137k = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.i;
                if (i >= arrayList.size()) {
                    break;
                }
                d dVar = (d) arrayList.get(i);
                if (dVar instanceof n) {
                    this.f10137k.add((n) dVar);
                }
                i++;
            }
        }
        return this.f10137k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.n
    public final Path e() {
        Matrix matrix = this.f10133d;
        matrix.reset();
        d3.q qVar = this.f10138l;
        if (qVar != null) {
            matrix.set(qVar.e());
        }
        Path path = this.f10134e;
        path.reset();
        if (!this.f10136h) {
            ArrayList arrayList = this.i;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                d dVar = (d) arrayList.get(size);
                if (dVar instanceof n) {
                    path.addPath(((n) dVar).e(), matrix);
                }
            }
        }
        return path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g3.f
    public final void f(Z.m mVar, Object obj) {
        d3.q qVar = this.f10138l;
        if (qVar != null) {
            qVar.c(mVar, obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.f
    public final void g(Canvas canvas, Matrix matrix, int i, C1395a c1395a) {
        if (this.f10136h) {
            return;
        }
        Matrix matrix2 = this.f10133d;
        matrix2.set(matrix);
        d3.q qVar = this.f10138l;
        if (qVar != null) {
            matrix2.preConcat(qVar.e());
            i = (int) (((((qVar.j == null ? 100 : ((Integer) r1.e()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        y yVar = this.j;
        boolean z5 = (yVar.f8894I && i() && i != 255) || (c1395a != null && yVar.f8895J && i());
        int i7 = z5 ? 255 : i;
        n3.h hVar = this.f10132c;
        if (z5) {
            RectF rectF = this.f10131b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            a(rectF, matrix, true);
            U.l lVar = this.f10130a;
            lVar.f7510q = i;
            if (c1395a != null) {
                if (Color.alpha(c1395a.f15150d) > 0) {
                    lVar.f7511r = c1395a;
                } else {
                    lVar.f7511r = null;
                }
                c1395a = null;
            } else {
                lVar.f7511r = null;
            }
            canvas = hVar.e(canvas, rectF, lVar);
        } else if (c1395a != null) {
            C1395a c1395a2 = new C1395a(c1395a);
            c1395a2.b(i7);
            c1395a = c1395a2;
        }
        ArrayList arrayList = this.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof f) {
                ((f) obj).g(canvas, matrix2, i7, c1395a);
            }
        }
        if (z5) {
            hVar.c();
        }
    }

    @Override // c3.d
    public final String getName() {
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g3.f
    public final void h(g3.e eVar, int i, ArrayList arrayList, g3.e eVar2) {
        String str = this.f10135g;
        if (!eVar.c(i, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            g3.e eVar3 = new g3.e(eVar2);
            eVar3.f13061a.add(str);
            if (eVar.a(i, str)) {
                g3.e eVar4 = new g3.e(eVar3);
                eVar4.f13062b = this;
                arrayList.add(eVar4);
            }
            eVar2 = eVar3;
        }
        if (!eVar.d(i, str)) {
            return;
        }
        int iB = eVar.b(i, str) + i;
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.i;
            if (i7 >= arrayList2.size()) {
                return;
            }
            d dVar = (d) arrayList2.get(i7);
            if (dVar instanceof g3.f) {
                ((g3.f) dVar).h(eVar, iB, arrayList, eVar2);
            }
            i7++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i() {
        int i = 0;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                return false;
            }
            if ((arrayList.get(i) instanceof f) && (i7 = i7 + 1) >= 2) {
                return true;
            }
            i++;
        }
    }

    public e(y yVar, j3.b bVar, String str, boolean z5, ArrayList arrayList, C1125d c1125d) {
        this.f10130a = new U.l(6);
        this.f10131b = new RectF();
        this.f10132c = new n3.h();
        this.f10133d = new Matrix();
        this.f10134e = new Path();
        this.f = new RectF();
        this.f10135g = str;
        this.j = yVar;
        this.f10136h = z5;
        this.i = arrayList;
        if (c1125d != null) {
            d3.q qVar = new d3.q(c1125d);
            this.f10138l = qVar;
            qVar.a(bVar);
            qVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d dVar = (d) arrayList.get(size);
            if (dVar instanceof k) {
                arrayList2.add((k) dVar);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((k) arrayList2.get(size2)).d(arrayList.listIterator(arrayList.size()));
        }
    }
}
