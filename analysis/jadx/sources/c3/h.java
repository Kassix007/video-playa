package c3;

import a3.C;
import a3.y;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import b3.C0698a;
import d3.InterfaceC1001a;
import h3.C1122a;
import h3.C1123b;
import java.util.ArrayList;
import java.util.List;
import n3.C1395a;

/* JADX INFO: loaded from: classes.dex */
public final class h implements f, InterfaceC1001a, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f10146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0698a f10147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j3.b f10148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10150e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d3.f f10151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d3.f f10152h;
    public d3.r i;
    public final y j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d3.e f10153k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f10154l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(y yVar, j3.b bVar, i3.m mVar) {
        Path path = new Path();
        this.f10146a = path;
        this.f10147b = new C0698a(1, 0);
        this.f = new ArrayList();
        this.f10148c = bVar;
        String str = mVar.f13612c;
        C1122a c1122a = mVar.f13614e;
        C1122a c1122a2 = mVar.f13613d;
        this.f10149d = str;
        this.f10150e = mVar.f;
        this.j = yVar;
        if (bVar.l() != null) {
            d3.i iVarF = ((C1123b) bVar.l().f13562r).f();
            this.f10153k = iVarF;
            iVarF.a(this);
            bVar.d(this.f10153k);
        }
        if (c1122a2 == null) {
            this.f10151g = null;
            this.f10152h = null;
            return;
        }
        path.setFillType(mVar.f13611b);
        d3.e eVarF = c1122a2.f();
        this.f10151g = (d3.f) eVarF;
        eVarF.a(this);
        bVar.d(eVarF);
        d3.e eVarF2 = c1122a.f();
        this.f10152h = (d3.f) eVarF2;
        eVarF2.a(this);
        bVar.d(eVarF2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.f
    public final void a(RectF rectF, Matrix matrix, boolean z5) {
        Path path = this.f10146a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((n) arrayList.get(i)).e(), matrix);
                i++;
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
        for (int i = 0; i < list2.size(); i++) {
            d dVar = (d) list2.get(i);
            if (dVar instanceof n) {
                this.f.add((n) dVar);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g3.f
    public final void f(Z.m mVar, Object obj) {
        PointF pointF = C.f8770a;
        if (obj == 1) {
            this.f10151g.j(mVar);
            return;
        }
        if (obj == 4) {
            this.f10152h.j(mVar);
            return;
        }
        ColorFilter colorFilter = C.f8764F;
        j3.b bVar = this.f10148c;
        if (obj == colorFilter) {
            d3.r rVar = this.i;
            if (rVar != null) {
                bVar.o(rVar);
            }
            d3.r rVar2 = new d3.r(mVar, null);
            this.i = rVar2;
            rVar2.a(this);
            bVar.d(this.i);
            return;
        }
        if (obj == C.f8774e) {
            d3.e eVar = this.f10153k;
            if (eVar != null) {
                eVar.j(mVar);
                return;
            }
            d3.r rVar3 = new d3.r(mVar, null);
            this.f10153k = rVar3;
            rVar3.a(this);
            bVar.d(this.f10153k);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // c3.f
    public final void g(Canvas canvas, Matrix matrix, int i, C1395a c1395a) {
        MaskFilter maskFilter;
        if (this.f10150e) {
            return;
        }
        d3.f fVar = this.f10151g;
        float fIntValue = ((Integer) this.f10152h.e()).intValue() / 100.0f;
        int iC = (n3.g.c((int) (i * fIntValue)) << 24) | (fVar.l(fVar.f12232c.f(), fVar.c()) & 16777215);
        C0698a c0698a = this.f10147b;
        c0698a.setColor(iC);
        d3.r rVar = this.i;
        if (rVar != null) {
            c0698a.setColorFilter((ColorFilter) rVar.e());
        }
        d3.e eVar = this.f10153k;
        if (eVar != null) {
            float fFloatValue = ((Float) eVar.e()).floatValue();
            if (fFloatValue == 0.0f) {
                c0698a.setMaskFilter(null);
            } else if (fFloatValue != this.f10154l) {
                j3.b bVar = this.f10148c;
                if (bVar.f13744A == fFloatValue) {
                    maskFilter = bVar.f13745B;
                } else {
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    bVar.f13745B = blurMaskFilter;
                    bVar.f13744A = fFloatValue;
                    maskFilter = blurMaskFilter;
                }
                c0698a.setMaskFilter(maskFilter);
            }
            this.f10154l = fFloatValue;
        }
        if (c1395a != null) {
            c1395a.a((int) (fIntValue * 255.0f), c0698a);
        } else {
            c0698a.clearShadowLayer();
        }
        Path path = this.f10146a;
        path.reset();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i7 >= arrayList.size()) {
                canvas.drawPath(path, c0698a);
                return;
            } else {
                path.addPath(((n) arrayList.get(i7)).e(), matrix);
                i7++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.d
    public final String getName() {
        return this.f10149d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g3.f
    public final void h(g3.e eVar, int i, ArrayList arrayList, g3.e eVar2) {
        n3.g.g(eVar, i, arrayList, eVar2, this);
    }
}
