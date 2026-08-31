package j3;

import B0.G0;
import Z.m;
import a3.G;
import a3.y;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import b3.C0698a;
import d3.InterfaceC1001a;
import d3.q;
import h3.C1125d;
import i3.C1136a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import n3.C1395a;
import r.C1550a;
import r.C1555f;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements c3.f, InterfaceC1001a, g3.f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f13744A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public BlurMaskFilter f13745B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C0698a f13746C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f13747a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f13748b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f13749c = new Matrix();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0698a f13750d = new C0698a(1, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0698a f13751e;
    public final C0698a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0698a f13752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0698a f13753h;
    public final RectF i;
    public final RectF j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RectF f13754k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RectF f13755l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RectF f13756m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Matrix f13757n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y f13758o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f13759p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final G0 f13760q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d3.i f13761r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b f13762s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b f13763t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public List f13764u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f13765v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final q f13766w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f13767x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f13768y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0698a f13769z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(y yVar, e eVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f13751e = new C0698a(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f = new C0698a(mode2);
        C0698a c0698a = new C0698a(1, 0);
        this.f13752g = c0698a;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        C0698a c0698a2 = new C0698a();
        c0698a2.setXfermode(new PorterDuffXfermode(mode3));
        this.f13753h = c0698a2;
        this.i = new RectF();
        this.j = new RectF();
        this.f13754k = new RectF();
        this.f13755l = new RectF();
        this.f13756m = new RectF();
        this.f13757n = new Matrix();
        this.f13765v = new ArrayList();
        this.f13767x = true;
        this.f13744A = 0.0f;
        this.f13758o = yVar;
        this.f13759p = eVar;
        List list = eVar.f13796h;
        if (eVar.f13807u == 3) {
            c0698a.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            c0698a.setXfermode(new PorterDuffXfermode(mode));
        }
        C1125d c1125d = eVar.i;
        c1125d.getClass();
        q qVar = new q(c1125d);
        this.f13766w = qVar;
        qVar.b(this);
        if (list != null && !list.isEmpty()) {
            G0 g02 = new G0(list);
            this.f13760q = g02;
            ArrayList arrayList = (ArrayList) g02.f236t;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((d3.e) obj).a(this);
            }
            ArrayList arrayList2 = (ArrayList) this.f13760q.f234r;
            int size2 = arrayList2.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj2 = arrayList2.get(i7);
                i7++;
                d3.e eVar2 = (d3.e) obj2;
                d(eVar2);
                eVar2.a(this);
            }
        }
        e eVar3 = this.f13759p;
        if (eVar3.f13806t.isEmpty()) {
            if (true != this.f13767x) {
                this.f13767x = true;
                this.f13758o.invalidateSelf();
                return;
            }
            return;
        }
        d3.i iVar = new d3.i(eVar3.f13806t);
        this.f13761r = iVar;
        iVar.f12231b = true;
        iVar.a(new InterfaceC1001a() { // from class: j3.a
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // d3.InterfaceC1001a
            public final void b() {
                b bVar = this.f13743a;
                boolean z5 = bVar.f13761r.l() == 1.0f;
                if (z5 != bVar.f13767x) {
                    bVar.f13767x = z5;
                    bVar.f13758o.invalidateSelf();
                }
            }
        });
        boolean z5 = ((Float) this.f13761r.e()).floatValue() == 1.0f;
        if (z5 != this.f13767x) {
            this.f13767x = z5;
            this.f13758o.invalidateSelf();
        }
        d(this.f13761r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.f
    public void a(RectF rectF, Matrix matrix, boolean z5) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        i();
        Matrix matrix2 = this.f13757n;
        matrix2.set(matrix);
        if (z5) {
            List list = this.f13764u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((b) this.f13764u.get(size)).f13766w.e());
                }
            } else {
                b bVar = this.f13763t;
                if (bVar != null) {
                    matrix2.preConcat(bVar.f13766w.e());
                }
            }
        }
        matrix2.preConcat(this.f13766w.e());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.InterfaceC1001a
    public final void b() {
        this.f13758o.invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(d3.e eVar) {
        if (eVar == null) {
            return;
        }
        this.f13765v.add(eVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g3.f
    public void f(m mVar, Object obj) {
        this.f13766w.c(mVar, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116  */
    @Override // c3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23, n3.C1395a r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            boolean r2 = r0.f13767x
            if (r2 == 0) goto L3e3
            j3.e r2 = r0.f13759p
            boolean r3 = r2.f13808v
            int r4 = r2.f13811y
            if (r3 == 0) goto L18
            goto L3e3
        L18:
            r0.i()
            android.graphics.Matrix r10 = r0.f13748b
            r10.reset()
            r10.set(r7)
            java.util.List r3 = r0.f13764u
            int r3 = r3.size()
            r11 = 1
            int r3 = r3 - r11
        L2b:
            if (r3 < 0) goto L41
            java.util.List r5 = r0.f13764u
            java.lang.Object r5 = r5.get(r3)
            j3.b r5 = (j3.b) r5
            d3.q r5 = r5.f13766w
            android.graphics.Matrix r5 = r5.e()
            r10.preConcat(r5)
            int r3 = r3 + (-1)
            goto L2b
        L41:
            d3.q r3 = r0.f13766w
            d3.e r5 = r3.j
            if (r5 == 0) goto L54
            java.lang.Object r5 = r5.e()
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L54
            int r5 = r5.intValue()
            goto L56
        L54:
            r5 = 100
        L56:
            float r6 = (float) r8
            r12 = 1132396544(0x437f0000, float:255.0)
            float r6 = r6 / r12
            float r5 = (float) r5
            float r6 = r6 * r5
            r5 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 / r5
            float r6 = r6 * r12
            int r12 = (int) r6
            j3.b r5 = r0.f13762s
            if (r5 == 0) goto L66
            goto L7c
        L66:
            boolean r5 = r0.m()
            if (r5 != 0) goto L7c
            if (r4 != r11) goto L7c
            android.graphics.Matrix r2 = r3.e()
            r10.preConcat(r2)
            r0.k(r1, r10, r12, r9)
            r0.n()
            return
        L7c:
            android.graphics.RectF r13 = r0.i
            r14 = 0
            r0.a(r13, r10, r14)
            j3.b r5 = r0.f13762s
            r15 = 3
            r6 = 0
            if (r5 == 0) goto La0
            int r2 = r2.f13807u
            if (r2 != r15) goto L8d
            goto La0
        L8d:
            android.graphics.RectF r2 = r0.f13755l
            r2.set(r6, r6, r6, r6)
            j3.b r5 = r0.f13762s
            r5.a(r2, r7, r11)
            boolean r2 = r13.intersect(r2)
            if (r2 != 0) goto La0
            r13.set(r6, r6, r6, r6)
        La0:
            android.graphics.Matrix r2 = r3.e()
            r10.preConcat(r2)
            android.graphics.RectF r2 = r0.f13754k
            r2.set(r6, r6, r6, r6)
            boolean r3 = r0.m()
            B0.G0 r5 = r0.f13760q
            android.graphics.Path r6 = r0.f13747a
            if (r3 != 0) goto Lbd
        Lb6:
            r17 = r5
            r18 = r6
        Lba:
            r2 = 0
            goto L156
        Lbd:
            java.lang.Object r3 = r5.f235s
            java.util.List r3 = (java.util.List) r3
            int r3 = r3.size()
            r15 = 0
        Lc6:
            if (r15 >= r3) goto L148
            java.lang.Object r14 = r5.f235s
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r14 = r14.get(r15)
            i3.g r14 = (i3.g) r14
            java.lang.Object r11 = r5.f236t
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            java.lang.Object r11 = r11.get(r15)
            d3.e r11 = (d3.e) r11
            java.lang.Object r11 = r11.e()
            android.graphics.Path r11 = (android.graphics.Path) r11
            if (r11 != 0) goto Leb
            r16 = r3
        Le6:
            r17 = r5
            r18 = r6
            goto L13d
        Leb:
            r6.set(r11)
            r6.transform(r10)
            int r11 = r14.f13587a
            int r11 = O.c.a(r11)
            r16 = r3
            if (r11 == 0) goto L105
            r3 = 1
            if (r11 == r3) goto Lb6
            r3 = 2
            if (r11 == r3) goto L105
            r3 = 3
            if (r11 == r3) goto Lb6
            goto L10a
        L105:
            boolean r3 = r14.f13590d
            if (r3 == 0) goto L10a
            goto Lb6
        L10a:
            android.graphics.RectF r3 = r0.f13756m
            r11 = 0
            r6.computeBounds(r3, r11)
            if (r15 != 0) goto L116
            r2.set(r3)
            goto Le6
        L116:
            float r14 = r2.left
            float r11 = r3.left
            float r11 = java.lang.Math.min(r14, r11)
            float r14 = r2.top
            r17 = r5
            float r5 = r3.top
            float r5 = java.lang.Math.min(r14, r5)
            float r14 = r2.right
            r18 = r6
            float r6 = r3.right
            float r6 = java.lang.Math.max(r14, r6)
            float r14 = r2.bottom
            float r3 = r3.bottom
            float r3 = java.lang.Math.max(r14, r3)
            r2.set(r11, r5, r6, r3)
        L13d:
            int r15 = r15 + 1
            r3 = r16
            r5 = r17
            r6 = r18
            r11 = 1
            goto Lc6
        L148:
            r17 = r5
            r18 = r6
            boolean r2 = r13.intersect(r2)
            if (r2 != 0) goto Lba
            r2 = 0
            r13.set(r2, r2, r2, r2)
        L156:
            int r3 = r1.getWidth()
            float r3 = (float) r3
            int r5 = r1.getHeight()
            float r5 = (float) r5
            android.graphics.RectF r6 = r0.j
            r6.set(r2, r2, r3, r5)
            android.graphics.Matrix r3 = r0.f13749c
            r1.getMatrix(r3)
            boolean r5 = r3.isIdentity()
            if (r5 != 0) goto L176
            r3.invert(r3)
            r3.mapRect(r6)
        L176:
            boolean r3 = r13.intersect(r6)
            if (r3 != 0) goto L17f
            r13.set(r2, r2, r2, r2)
        L17f:
            float r2 = r13.width()
            r3 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L3ab
            float r2 = r13.height()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L3ab
            b3.a r11 = r0.f13750d
            r14 = 255(0xff, float:3.57E-43)
            r11.setAlpha(r14)
            int r2 = O.c.a(r4)
            r15 = 4
            r5 = 1
            if (r2 == r5) goto L1bd
            r5 = 2
            if (r2 == r5) goto L1ba
            r5 = 16
            r6 = 3
            if (r2 == r6) goto L1bf
            if (r2 == r15) goto L1b7
            r6 = 5
            if (r2 == r6) goto L1b4
            if (r2 == r5) goto L1b1
            r5 = 0
            goto L1bf
        L1b1:
            r5 = 13
            goto L1bf
        L1b4:
            r5 = 18
            goto L1bf
        L1b7:
            r5 = 17
            goto L1bf
        L1ba:
            r5 = 15
            goto L1bf
        L1bd:
            r5 = 14
        L1bf:
            n1.c.a(r5, r11)
            android.graphics.Matrix r2 = n3.i.f15199a
            r1.saveLayer(r13, r11)
            r5 = 2
            if (r4 == r5) goto L1d2
            r20.j(r21)
            r14 = r17
            r19 = r18
            goto L1f9
        L1d2:
            b3.a r2 = r0.f13746C
            if (r2 != 0) goto L1e1
            b3.a r2 = new b3.a
            r2.<init>()
            r0.f13746C = r2
            r4 = -1
            r2.setColor(r4)
        L1e1:
            float r2 = r13.left
            float r2 = r2 - r3
            float r4 = r13.top
            float r4 = r4 - r3
            float r5 = r13.right
            float r5 = r5 + r3
            float r6 = r13.bottom
            float r6 = r6 + r3
            r3 = r4
            r4 = r5
            r5 = r6
            b3.a r6 = r0.f13746C
            r14 = r17
            r19 = r18
            r1.drawRect(r2, r3, r4, r5, r6)
        L1f9:
            r0.k(r1, r10, r12, r9)
            boolean r2 = r0.m()
            if (r2 == 0) goto L393
            b3.a r2 = r0.f13751e
            r1.saveLayer(r13, r2)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 >= r4) goto L210
            r20.j(r21)
        L210:
            r3 = 0
        L211:
            java.lang.Object r4 = r14.f235s
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r14.f236t
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r4.size()
            if (r3 >= r6) goto L390
            java.lang.Object r6 = r4.get(r3)
            i3.g r6 = (i3.g) r6
            java.lang.Object r9 = r5.get(r3)
            d3.e r9 = (d3.e) r9
            java.lang.Object r12 = r14.f234r
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.lang.Object r12 = r12.get(r3)
            d3.e r12 = (d3.e) r12
            int r15 = r6.f13587a
            boolean r6 = r6.f13590d
            int r15 = O.c.a(r15)
            r17 = r3
            b3.a r3 = r0.f
            r18 = 1076048691(0x40233333, float:2.55)
            if (r15 == 0) goto L337
            r24 = r5
            r5 = 1
            if (r15 == r5) goto L2e3
            r5 = 2
            if (r15 == r5) goto L285
            r5 = 3
            if (r15 == r5) goto L258
            r4 = r19
            r5 = 255(0xff, float:3.57E-43)
            r15 = 4
            goto L38a
        L258:
            boolean r3 = r24.isEmpty()
            if (r3 == 0) goto L260
            r15 = 4
            goto L272
        L260:
            r3 = 0
        L261:
            int r6 = r4.size()
            if (r3 >= r6) goto L27b
            java.lang.Object r6 = r4.get(r3)
            i3.g r6 = (i3.g) r6
            int r6 = r6.f13587a
            r15 = 4
            if (r6 == r15) goto L278
        L272:
            r4 = r19
        L274:
            r5 = 255(0xff, float:3.57E-43)
            goto L38a
        L278:
            int r3 = r3 + 1
            goto L261
        L27b:
            r3 = 255(0xff, float:3.57E-43)
            r15 = 4
            r11.setAlpha(r3)
            r1.drawRect(r13, r11)
            goto L272
        L285:
            r5 = 3
            r15 = 4
            if (r6 == 0) goto L2b8
            android.graphics.Matrix r4 = n3.i.f15199a
            r1.saveLayer(r13, r2)
            r1.drawRect(r13, r11)
            java.lang.Object r4 = r12.e()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            float r4 = (float) r4
            float r4 = r4 * r18
            int r4 = (int) r4
            r3.setAlpha(r4)
            java.lang.Object r4 = r9.e()
            android.graphics.Path r4 = (android.graphics.Path) r4
            r6 = r19
            r6.set(r4)
            r6.transform(r10)
            r1.drawPath(r6, r3)
            r1.restore()
        L2b6:
            r4 = r6
            goto L274
        L2b8:
            r6 = r19
            android.graphics.Matrix r3 = n3.i.f15199a
            r1.saveLayer(r13, r2)
            java.lang.Object r3 = r9.e()
            android.graphics.Path r3 = (android.graphics.Path) r3
            r6.set(r3)
            r6.transform(r10)
            java.lang.Object r3 = r12.e()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            float r3 = (float) r3
            float r3 = r3 * r18
            int r3 = (int) r3
            r11.setAlpha(r3)
            r1.drawPath(r6, r11)
            r1.restore()
            goto L2b6
        L2e3:
            r4 = r19
            r5 = 3
            r15 = 4
            if (r17 != 0) goto L2f7
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r11.setColor(r5)
            r5 = 255(0xff, float:3.57E-43)
            r11.setAlpha(r5)
            r1.drawRect(r13, r11)
            goto L2f9
        L2f7:
            r5 = 255(0xff, float:3.57E-43)
        L2f9:
            if (r6 == 0) goto L327
            android.graphics.Matrix r6 = n3.i.f15199a
            r1.saveLayer(r13, r3)
            r1.drawRect(r13, r11)
            java.lang.Object r6 = r12.e()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            float r6 = (float) r6
            float r6 = r6 * r18
            int r6 = (int) r6
            r3.setAlpha(r6)
            java.lang.Object r6 = r9.e()
            android.graphics.Path r6 = (android.graphics.Path) r6
            r4.set(r6)
            r4.transform(r10)
            r1.drawPath(r4, r3)
            r1.restore()
            goto L38a
        L327:
            java.lang.Object r6 = r9.e()
            android.graphics.Path r6 = (android.graphics.Path) r6
            r4.set(r6)
            r4.transform(r10)
            r1.drawPath(r4, r3)
            goto L38a
        L337:
            r4 = r19
            r5 = 255(0xff, float:3.57E-43)
            r15 = 4
            if (r6 == 0) goto L36a
            android.graphics.Matrix r6 = n3.i.f15199a
            r1.saveLayer(r13, r11)
            r1.drawRect(r13, r11)
            java.lang.Object r6 = r9.e()
            android.graphics.Path r6 = (android.graphics.Path) r6
            r4.set(r6)
            r4.transform(r10)
            java.lang.Object r6 = r12.e()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            float r6 = (float) r6
            float r6 = r6 * r18
            int r6 = (int) r6
            r11.setAlpha(r6)
            r1.drawPath(r4, r3)
            r1.restore()
            goto L38a
        L36a:
            java.lang.Object r3 = r9.e()
            android.graphics.Path r3 = (android.graphics.Path) r3
            r4.set(r3)
            r4.transform(r10)
            java.lang.Object r3 = r12.e()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            float r3 = (float) r3
            float r3 = r3 * r18
            int r3 = (int) r3
            r11.setAlpha(r3)
            r1.drawPath(r4, r11)
        L38a:
            int r3 = r17 + 1
            r19 = r4
            goto L211
        L390:
            r1.restore()
        L393:
            j3.b r2 = r0.f13762s
            if (r2 == 0) goto L3a8
            b3.a r2 = r0.f13752g
            r1.saveLayer(r13, r2)
            r20.j(r21)
            j3.b r2 = r0.f13762s
            r3 = 0
            r2.g(r1, r7, r8, r3)
            r1.restore()
        L3a8:
            r1.restore()
        L3ab:
            boolean r2 = r0.f13768y
            if (r2 == 0) goto L3e0
            b3.a r2 = r0.f13769z
            if (r2 == 0) goto L3e0
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r3)
            b3.a r2 = r0.f13769z
            r3 = -251901(0xfffffffffffc2803, float:NaN)
            r2.setColor(r3)
            b3.a r2 = r0.f13769z
            r3 = 1082130432(0x40800000, float:4.0)
            r2.setStrokeWidth(r3)
            b3.a r2 = r0.f13769z
            r1.drawRect(r13, r2)
            b3.a r2 = r0.f13769z
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r2.setStyle(r3)
            b3.a r2 = r0.f13769z
            r3 = 1357638635(0x50ebebeb, float:3.1664855E10)
            r2.setColor(r3)
            b3.a r2 = r0.f13769z
            r1.drawRect(r13, r2)
        L3e0:
            r0.n()
        L3e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.b.g(android.graphics.Canvas, android.graphics.Matrix, int, n3.a):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g3.f
    public final void h(g3.e eVar, int i, ArrayList arrayList, g3.e eVar2) {
        b bVar = this.f13762s;
        e eVar3 = this.f13759p;
        if (bVar != null) {
            String str = bVar.f13759p.f13792c;
            g3.e eVar4 = new g3.e(eVar2);
            eVar4.f13061a.add(str);
            if (eVar.a(i, this.f13762s.f13759p.f13792c)) {
                b bVar2 = this.f13762s;
                g3.e eVar5 = new g3.e(eVar4);
                eVar5.f13062b = bVar2;
                arrayList.add(eVar5);
            }
            if (eVar.c(i, this.f13762s.f13759p.f13792c) && eVar.d(i, eVar3.f13792c)) {
                this.f13762s.p(eVar, eVar.b(i, this.f13762s.f13759p.f13792c) + i, arrayList, eVar4);
            }
        }
        String str2 = eVar3.f13792c;
        String str3 = eVar3.f13792c;
        if (eVar.c(i, str2)) {
            if (!"__container".equals(str3)) {
                g3.e eVar6 = new g3.e(eVar2);
                eVar6.f13061a.add(str3);
                if (eVar.a(i, str3)) {
                    g3.e eVar7 = new g3.e(eVar6);
                    eVar7.f13062b = this;
                    arrayList.add(eVar7);
                }
                eVar2 = eVar6;
            }
            if (eVar.d(i, str3)) {
                p(eVar, eVar.b(i, str3) + i, arrayList, eVar2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i() {
        if (this.f13764u != null) {
            return;
        }
        if (this.f13763t == null) {
            this.f13764u = Collections.EMPTY_LIST;
            return;
        }
        this.f13764u = new ArrayList();
        for (b bVar = this.f13763t; bVar != null; bVar = bVar.f13763t) {
            this.f13764u.add(bVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(Canvas canvas) {
        RectF rectF = this.i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f13753h);
    }

    public abstract void k(Canvas canvas, Matrix matrix, int i, C1395a c1395a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1136a l() {
        return this.f13759p.f13809w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean m() {
        G0 g02 = this.f13760q;
        return (g02 == null || ((ArrayList) g02.f236t).isEmpty()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n() {
        G g7 = this.f13758o.f8920q.f8833a;
        String str = this.f13759p.f13792c;
        HashMap map = g7.f8803c;
        if (g7.f8801a) {
            n3.f fVar = (n3.f) map.get(str);
            if (fVar == null) {
                fVar = new n3.f();
                map.put(str, fVar);
            }
            int i = fVar.f15172a + 1;
            fVar.f15172a = i;
            if (i == Integer.MAX_VALUE) {
                fVar.f15172a = i / 2;
            }
            if (str.equals("__container")) {
                C1555f c1555f = g7.f8802b;
                c1555f.getClass();
                C1550a c1550a = new C1550a(c1555f);
                if (c1550a.hasNext()) {
                    c1550a.next().getClass();
                    throw new ClassCastException();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o(d3.e eVar) {
        this.f13765v.remove(eVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void q(boolean z5) {
        if (z5 && this.f13769z == null) {
            this.f13769z = new C0698a();
        }
        this.f13768y = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void r(float f) {
        q qVar = this.f13766w;
        d3.e eVar = qVar.j;
        if (eVar != null) {
            eVar.i(f);
        }
        d3.e eVar2 = qVar.f12269m;
        if (eVar2 != null) {
            eVar2.i(f);
        }
        d3.e eVar3 = qVar.f12270n;
        if (eVar3 != null) {
            eVar3.i(f);
        }
        d3.e eVar4 = qVar.f;
        if (eVar4 != null) {
            eVar4.i(f);
        }
        d3.e eVar5 = qVar.f12265g;
        if (eVar5 != null) {
            eVar5.i(f);
        }
        d3.e eVar6 = qVar.f12266h;
        if (eVar6 != null) {
            eVar6.i(f);
        }
        d3.e eVar7 = qVar.i;
        if (eVar7 != null) {
            eVar7.i(f);
        }
        d3.i iVar = qVar.f12267k;
        if (iVar != null) {
            iVar.i(f);
        }
        d3.i iVar2 = qVar.f12268l;
        if (iVar2 != null) {
            iVar2.i(f);
        }
        int i = 0;
        G0 g02 = this.f13760q;
        if (g02 != null) {
            ArrayList arrayList = (ArrayList) g02.f236t;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((d3.e) arrayList.get(i7)).i(f);
            }
        }
        d3.i iVar3 = this.f13761r;
        if (iVar3 != null) {
            iVar3.i(f);
        }
        b bVar = this.f13762s;
        if (bVar != null) {
            bVar.r(f);
        }
        while (true) {
            ArrayList arrayList2 = this.f13765v;
            if (i >= arrayList2.size()) {
                return;
            }
            ((d3.e) arrayList2.get(i)).i(f);
            i++;
        }
    }

    @Override // c3.d
    public final void c(List list, List list2) {
    }

    public void p(g3.e eVar, int i, ArrayList arrayList, g3.e eVar2) {
    }
}
