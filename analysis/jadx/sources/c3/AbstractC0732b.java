package c3;

import a3.C;
import a3.y;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import b3.C0698a;
import d3.InterfaceC1001a;
import h3.C1122a;
import h3.C1123b;
import java.util.ArrayList;

/* JADX INFO: renamed from: c3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0732b implements InterfaceC1001a, l, f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y f10120e;
    public final j3.b f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f10122h;
    public final C0698a i;
    public final d3.i j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d3.f f10123k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f10124l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d3.i f10125m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d3.r f10126n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public d3.e f10127o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f10128p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathMeasure f10116a = new PathMeasure();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f10117b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f10118c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f10119d = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f10121g = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0732b(y yVar, j3.b bVar, Paint.Cap cap, Paint.Join join, float f, C1122a c1122a, C1123b c1123b, ArrayList arrayList, C1123b c1123b2) {
        C0698a c0698a = new C0698a(1, 0);
        this.i = c0698a;
        this.f10128p = 0.0f;
        this.f10120e = yVar;
        this.f = bVar;
        c0698a.setStyle(Paint.Style.STROKE);
        c0698a.setStrokeCap(cap);
        c0698a.setStrokeJoin(join);
        c0698a.setStrokeMiter(f);
        this.f10123k = (d3.f) c1122a.f();
        this.j = c1123b.f();
        if (c1123b2 == null) {
            this.f10125m = null;
        } else {
            this.f10125m = c1123b2.f();
        }
        this.f10124l = new ArrayList(arrayList.size());
        this.f10122h = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.f10124l.add(((C1123b) arrayList.get(i)).f());
        }
        bVar.d(this.f10123k);
        bVar.d(this.j);
        for (int i7 = 0; i7 < this.f10124l.size(); i7++) {
            bVar.d((d3.e) this.f10124l.get(i7));
        }
        d3.i iVar = this.f10125m;
        if (iVar != null) {
            bVar.d(iVar);
        }
        this.f10123k.a(this);
        this.j.a(this);
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            ((d3.e) this.f10124l.get(i8)).a(this);
        }
        d3.i iVar2 = this.f10125m;
        if (iVar2 != null) {
            iVar2.a(this);
        }
        if (bVar.l() != null) {
            d3.i iVarF = ((C1123b) bVar.l().f13562r).f();
            this.f10127o = iVarF;
            iVarF.a(this);
            bVar.d(this.f10127o);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.f
    public final void a(RectF rectF, Matrix matrix, boolean z5) {
        Path path = this.f10117b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f10121g;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.f10119d;
                path.computeBounds(rectF2, false);
                float fL = this.j.l() / 2.0f;
                rectF2.set(rectF2.left - fL, rectF2.top - fL, rectF2.right + fL, rectF2.bottom + fL);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            C0731a c0731a = (C0731a) arrayList.get(i);
            for (int i7 = 0; i7 < c0731a.f10114a.size(); i7++) {
                path.addPath(((n) c0731a.f10114a.get(i7)).e(), matrix);
            }
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.InterfaceC1001a
    public final void b() {
        this.f10120e.invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:14:0x002c */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    @Override // c3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.util.List r8, java.util.List r9) {
        /*
            r7 = this;
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        La:
            r3 = 2
            if (r0 < 0) goto L21
            java.lang.Object r4 = r8.get(r0)
            c3.d r4 = (c3.d) r4
            boolean r5 = r4 instanceof c3.u
            if (r5 == 0) goto L1e
            c3.u r4 = (c3.u) r4
            int r5 = r4.f10234c
            if (r5 != r3) goto L1e
            r2 = r4
        L1e:
            int r0 = r0 + (-1)
            goto La
        L21:
            if (r2 == 0) goto L26
            r2.d(r7)
        L26:
            int r8 = r9.size()
            int r8 = r8 + (-1)
        L2c:
            java.util.ArrayList r0 = r7.f10121g
            if (r8 < 0) goto L65
            java.lang.Object r4 = r9.get(r8)
            c3.d r4 = (c3.d) r4
            boolean r5 = r4 instanceof c3.u
            if (r5 == 0) goto L50
            r5 = r4
            c3.u r5 = (c3.u) r5
            int r6 = r5.f10234c
            if (r6 != r3) goto L50
            if (r1 == 0) goto L46
            r0.add(r1)
        L46:
            c3.a r0 = new c3.a
            r0.<init>(r5)
            r5.d(r7)
            r1 = r0
            goto L62
        L50:
            boolean r0 = r4 instanceof c3.n
            if (r0 == 0) goto L62
            if (r1 != 0) goto L5b
            c3.a r1 = new c3.a
            r1.<init>(r2)
        L5b:
            java.util.ArrayList r0 = r1.f10114a
            c3.n r4 = (c3.n) r4
            r0.add(r4)
        L62:
            int r8 = r8 + (-1)
            goto L2c
        L65:
            if (r1 == 0) goto L6a
            r0.add(r1)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.AbstractC0732b.c(java.util.List, java.util.List):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g3.f
    public void f(Z.m mVar, Object obj) {
        PointF pointF = C.f8770a;
        if (obj == 4) {
            this.f10123k.j(mVar);
            return;
        }
        if (obj == C.f8780n) {
            this.j.j(mVar);
            return;
        }
        ColorFilter colorFilter = C.f8764F;
        j3.b bVar = this.f;
        if (obj == colorFilter) {
            d3.r rVar = this.f10126n;
            if (rVar != null) {
                bVar.o(rVar);
            }
            d3.r rVar2 = new d3.r(mVar, null);
            this.f10126n = rVar2;
            rVar2.a(this);
            bVar.d(this.f10126n);
            return;
        }
        if (obj == C.f8774e) {
            d3.e eVar = this.f10127o;
            if (eVar != null) {
                eVar.j(mVar);
                return;
            }
            d3.r rVar3 = new d3.r(mVar, null);
            this.f10127o = rVar3;
            rVar3.a(this);
            bVar.d(this.f10127o);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f0  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23, n3.C1395a r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r24
            C0.d0 r3 = n3.i.f15203e
            java.lang.Object r3 = r3.get()
            float[] r3 = (float[]) r3
            r4 = 0
            r5 = 0
            r3[r4] = r5
            r6 = 1
            r3[r6] = r5
            r7 = 1192366779(0x471212bb, float:37394.73)
            r8 = 2
            r3[r8] = r7
            r7 = 1192924988(0x471a973c, float:39575.234)
            r9 = 3
            r3[r9] = r7
            r7 = r22
            r7.mapPoints(r3)
            r10 = r3[r4]
            r8 = r3[r8]
            int r8 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r8 == 0) goto L258
            r8 = r3[r6]
            r3 = r3[r9]
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 != 0) goto L38
            goto L258
        L38:
            d3.f r3 = r0.f10123k
            java.lang.Object r3 = r3.e()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            float r3 = (float) r3
            r8 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 / r8
            r9 = r23
            float r9 = (float) r9
            float r9 = r9 * r3
            int r9 = (int) r9
            int r9 = n3.g.c(r9)
            b3.a r10 = r0.i
            r10.setAlpha(r9)
            d3.i r9 = r0.j
            float r9 = r9.l()
            r10.setStrokeWidth(r9)
            float r9 = r10.getStrokeWidth()
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 > 0) goto L69
            goto L258
        L69:
            java.util.ArrayList r9 = r0.f10124l
            boolean r11 = r9.isEmpty()
            r12 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto L74
            goto Lbe
        L74:
            r11 = r4
        L75:
            int r13 = r9.size()
            float[] r14 = r0.f10122h
            if (r11 >= r13) goto La6
            java.lang.Object r13 = r9.get(r11)
            d3.e r13 = (d3.e) r13
            java.lang.Object r13 = r13.e()
            java.lang.Float r13 = (java.lang.Float) r13
            float r13 = r13.floatValue()
            r14[r11] = r13
            int r15 = r11 % 2
            if (r15 != 0) goto L9a
            int r13 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r13 >= 0) goto La3
            r14[r11] = r12
            goto La3
        L9a:
            r15 = 1036831949(0x3dcccccd, float:0.1)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto La3
            r14[r11] = r15
        La3:
            int r11 = r11 + 1
            goto L75
        La6:
            d3.i r9 = r0.f10125m
            if (r9 != 0) goto Lac
            r9 = r5
            goto Lb6
        Lac:
            java.lang.Object r9 = r9.e()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
        Lb6:
            android.graphics.DashPathEffect r11 = new android.graphics.DashPathEffect
            r11.<init>(r14, r9)
            r10.setPathEffect(r11)
        Lbe:
            d3.r r9 = r0.f10126n
            if (r9 == 0) goto Lcb
            java.lang.Object r9 = r9.e()
            android.graphics.ColorFilter r9 = (android.graphics.ColorFilter) r9
            r10.setColorFilter(r9)
        Lcb:
            d3.e r9 = r0.f10127o
            if (r9 == 0) goto L108
            java.lang.Object r9 = r9.e()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 != 0) goto Le2
            r11 = 0
            r10.setMaskFilter(r11)
            goto L106
        Le2:
            float r11 = r0.f10128p
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 == 0) goto L106
            j3.b r11 = r0.f
            float r13 = r11.f13744A
            int r13 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r13 != 0) goto Lf3
            android.graphics.BlurMaskFilter r11 = r11.f13745B
            goto L103
        Lf3:
            android.graphics.BlurMaskFilter r13 = new android.graphics.BlurMaskFilter
            r14 = 1073741824(0x40000000, float:2.0)
            float r14 = r9 / r14
            android.graphics.BlurMaskFilter$Blur r15 = android.graphics.BlurMaskFilter.Blur.NORMAL
            r13.<init>(r14, r15)
            r11.f13745B = r13
            r11.f13744A = r9
            r11 = r13
        L103:
            r10.setMaskFilter(r11)
        L106:
            r0.f10128p = r9
        L108:
            if (r2 == 0) goto L111
            r9 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r9
            int r3 = (int) r3
            r2.a(r3, r10)
        L111:
            r1.save()
            r21.concat(r22)
            r2 = r4
        L118:
            java.util.ArrayList r3 = r0.f10121g
            int r7 = r3.size()
            if (r2 >= r7) goto L255
            java.lang.Object r3 = r3.get(r2)
            c3.a r3 = (c3.C0731a) r3
            c3.u r7 = r3.f10115b
            java.util.ArrayList r3 = r3.f10114a
            android.graphics.Path r9 = r0.f10117b
            if (r7 == 0) goto L22a
            r9.reset()
            int r11 = r3.size()
            int r11 = r11 - r6
        L136:
            if (r11 < 0) goto L148
            java.lang.Object r13 = r3.get(r11)
            c3.n r13 = (c3.n) r13
            android.graphics.Path r13 = r13.e()
            r9.addPath(r13)
            int r11 = r11 + (-1)
            goto L136
        L148:
            d3.i r11 = r7.f10235d
            java.lang.Object r11 = r11.e()
            java.lang.Float r11 = (java.lang.Float) r11
            float r11 = r11.floatValue()
            float r11 = r11 / r8
            d3.i r13 = r7.f10236e
            java.lang.Object r13 = r13.e()
            java.lang.Float r13 = (java.lang.Float) r13
            float r13 = r13.floatValue()
            float r13 = r13 / r8
            d3.i r7 = r7.f
            java.lang.Object r7 = r7.e()
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            r14 = 1135869952(0x43b40000, float:360.0)
            float r7 = r7 / r14
            r14 = 1008981770(0x3c23d70a, float:0.01)
            int r14 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r14 >= 0) goto L186
            r14 = 1065185444(0x3f7d70a4, float:0.99)
            int r14 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r14 <= 0) goto L186
            r1.drawPath(r9, r10)
        L182:
            r17 = r6
            goto L24a
        L186:
            android.graphics.PathMeasure r14 = r0.f10116a
            r14.setPath(r9, r4)
            float r9 = r14.getLength()
        L18f:
            boolean r15 = r14.nextContour()
            if (r15 == 0) goto L19b
            float r15 = r14.getLength()
            float r9 = r9 + r15
            goto L18f
        L19b:
            float r7 = r7 * r9
            float r11 = r11 * r9
            float r11 = r11 + r7
            float r13 = r13 * r9
            float r13 = r13 + r7
            float r7 = r11 + r9
            float r7 = r7 - r12
            float r7 = java.lang.Math.min(r13, r7)
            int r13 = r3.size()
            int r13 = r13 - r6
            r15 = r5
        L1ad:
            if (r13 < 0) goto L182
            java.lang.Object r16 = r3.get(r13)
            c3.n r16 = (c3.n) r16
            r17 = r6
            android.graphics.Path r6 = r16.e()
            android.graphics.Path r8 = r0.f10118c
            r8.set(r6)
            r14.setPath(r8, r4)
            float r6 = r14.getLength()
            int r18 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r18 <= 0) goto L1f0
            float r18 = r7 - r9
            float r19 = r15 + r6
            int r19 = (r18 > r19 ? 1 : (r18 == r19 ? 0 : -1))
            if (r19 >= 0) goto L1f0
            int r19 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r19 >= 0) goto L1f0
            int r19 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r19 <= 0) goto L1e2
            float r19 = r11 - r9
            float r19 = r19 / r6
            r4 = r19
            goto L1e3
        L1e2:
            r4 = r5
        L1e3:
            float r0 = r18 / r6
            float r0 = java.lang.Math.min(r0, r12)
            n3.i.a(r8, r4, r0, r5)
            r1.drawPath(r8, r10)
            goto L21f
        L1f0:
            float r0 = r15 + r6
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 < 0) goto L21f
            int r4 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r4 <= 0) goto L1fb
            goto L21f
        L1fb:
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 > 0) goto L207
            int r4 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r4 >= 0) goto L207
            r1.drawPath(r8, r10)
            goto L21f
        L207:
            int r4 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r4 >= 0) goto L20d
            r4 = r5
            goto L210
        L20d:
            float r4 = r11 - r15
            float r4 = r4 / r6
        L210:
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L216
            r0 = r12
            goto L219
        L216:
            float r0 = r7 - r15
            float r0 = r0 / r6
        L219:
            n3.i.a(r8, r4, r0, r5)
            r1.drawPath(r8, r10)
        L21f:
            float r15 = r15 + r6
            int r13 = r13 + (-1)
            r0 = r20
            r6 = r17
            r4 = 0
            r8 = 1120403456(0x42c80000, float:100.0)
            goto L1ad
        L22a:
            r17 = r6
            r9.reset()
            int r0 = r3.size()
            int r0 = r0 + (-1)
        L235:
            if (r0 < 0) goto L247
            java.lang.Object r4 = r3.get(r0)
            c3.n r4 = (c3.n) r4
            android.graphics.Path r4 = r4.e()
            r9.addPath(r4)
            int r0 = r0 + (-1)
            goto L235
        L247:
            r1.drawPath(r9, r10)
        L24a:
            int r2 = r2 + 1
            r0 = r20
            r6 = r17
            r4 = 0
            r8 = 1120403456(0x42c80000, float:100.0)
            goto L118
        L255:
            r1.restore()
        L258:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.AbstractC0732b.g(android.graphics.Canvas, android.graphics.Matrix, int, n3.a):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g3.f
    public final void h(g3.e eVar, int i, ArrayList arrayList, g3.e eVar2) {
        n3.g.g(eVar, i, arrayList, eVar2, this);
    }
}
