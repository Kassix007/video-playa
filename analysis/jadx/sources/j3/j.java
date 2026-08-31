package j3;

import L0.l;
import Z.m;
import a3.C;
import a3.C0632k;
import a3.y;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import b3.C0698a;
import d3.p;
import d3.r;
import g3.C1083b;
import h3.C1122a;
import h3.C1123b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o3.C1416b;
import r.C1566q;

/* JADX INFO: loaded from: classes.dex */
public final class j extends b {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final StringBuilder f13824D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final RectF f13825E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Matrix f13826F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final C0698a f13827G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C0698a f13828H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final HashMap f13829I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final C1566q f13830J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final ArrayList f13831K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final d3.f f13832L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final y f13833M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final C0632k f13834N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int f13835O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final d3.f f13836P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public r f13837Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final d3.f f13838R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public r f13839S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final d3.i f13840T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public r f13841U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final d3.i f13842V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public r f13843W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final d3.f f13844X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public r f13845Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public r f13846Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final d3.f f13847a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final d3.f f13848b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final d3.f f13849c0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j(y yVar, e eVar) {
        W1.d dVar;
        W1.d dVar2;
        C1122a c1122a;
        W1.d dVar3;
        C1122a c1122a2;
        W1.d dVar4;
        C1122a c1122a3;
        l lVar;
        C1122a c1122a4;
        l lVar2;
        C1123b c1123b;
        l lVar3;
        C1123b c1123b2;
        l lVar4;
        C1122a c1122a5;
        l lVar5;
        C1122a c1122a6;
        super(yVar, eVar);
        this.f13824D = new StringBuilder(2);
        this.f13825E = new RectF();
        this.f13826F = new Matrix();
        C0698a c0698a = new C0698a(1, 1);
        c0698a.setStyle(Paint.Style.FILL);
        this.f13827G = c0698a;
        C0698a c0698a2 = new C0698a(1, 2);
        c0698a2.setStyle(Paint.Style.STROKE);
        this.f13828H = c0698a2;
        this.f13829I = new HashMap();
        this.f13830J = new C1566q((Object) null);
        this.f13831K = new ArrayList();
        this.f13835O = 2;
        this.f13833M = yVar;
        this.f13834N = eVar.f13791b;
        d3.f fVar = new d3.f(2, (List) eVar.f13803q.f4346r);
        this.f13832L = fVar;
        fVar.a(this);
        d(fVar);
        m mVar = eVar.f13804r;
        if (mVar != null && (lVar5 = (l) mVar.f8312r) != null && (c1122a6 = (C1122a) lVar5.f3125b) != null) {
            d3.e eVarF = c1122a6.f();
            this.f13836P = (d3.f) eVarF;
            eVarF.a(this);
            d(eVarF);
        }
        if (mVar != null && (lVar4 = (l) mVar.f8312r) != null && (c1122a5 = (C1122a) lVar4.f3126c) != null) {
            d3.e eVarF2 = c1122a5.f();
            this.f13838R = (d3.f) eVarF2;
            eVarF2.a(this);
            d(eVarF2);
        }
        if (mVar != null && (lVar3 = (l) mVar.f8312r) != null && (c1123b2 = (C1123b) lVar3.f3127d) != null) {
            d3.i iVarF = c1123b2.f();
            this.f13840T = iVarF;
            iVarF.a(this);
            d(iVarF);
        }
        if (mVar != null && (lVar2 = (l) mVar.f8312r) != null && (c1123b = (C1123b) lVar2.f3128e) != null) {
            d3.i iVarF2 = c1123b.f();
            this.f13842V = iVarF2;
            iVarF2.a(this);
            d(iVarF2);
        }
        if (mVar != null && (lVar = (l) mVar.f8312r) != null && (c1122a4 = (C1122a) lVar.f3124a) != null) {
            d3.e eVarF3 = c1122a4.f();
            this.f13844X = (d3.f) eVarF3;
            eVarF3.a(this);
            d(eVarF3);
        }
        if (mVar != null && (dVar4 = (W1.d) mVar.f8313s) != null && (c1122a3 = (C1122a) dVar4.f8044b) != null) {
            d3.e eVarF4 = c1122a3.f();
            this.f13847a0 = (d3.f) eVarF4;
            eVarF4.a(this);
            d(eVarF4);
        }
        if (mVar != null && (dVar3 = (W1.d) mVar.f8313s) != null && (c1122a2 = (C1122a) dVar3.f8045c) != null) {
            d3.e eVarF5 = c1122a2.f();
            this.f13848b0 = (d3.f) eVarF5;
            eVarF5.a(this);
            d(eVarF5);
        }
        if (mVar != null && (dVar2 = (W1.d) mVar.f8313s) != null && (c1122a = (C1122a) dVar2.f8046d) != null) {
            d3.e eVarF6 = c1122a.f();
            this.f13849c0 = (d3.f) eVarF6;
            eVarF6.a(this);
            d(eVarF6);
        }
        if (mVar == null || (dVar = (W1.d) mVar.f8313s) == null) {
            return;
        }
        this.f13835O = dVar.f8043a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void t(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void u(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j3.b, c3.f
    public final void a(RectF rectF, Matrix matrix, boolean z5) {
        super.a(rectF, matrix, z5);
        C0632k c0632k = this.f13834N;
        rectF.set(0.0f, 0.0f, c0632k.f8840k.width(), c0632k.f8840k.height());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j3.b, g3.f
    public final void f(m mVar, Object obj) {
        super.f(mVar, obj);
        PointF pointF = C.f8770a;
        if (obj == 1) {
            r rVar = this.f13837Q;
            if (rVar != null) {
                o(rVar);
            }
            r rVar2 = new r(mVar, null);
            this.f13837Q = rVar2;
            rVar2.a(this);
            d(this.f13837Q);
            return;
        }
        if (obj == 2) {
            r rVar3 = this.f13839S;
            if (rVar3 != null) {
                o(rVar3);
            }
            r rVar4 = new r(mVar, null);
            this.f13839S = rVar4;
            rVar4.a(this);
            d(this.f13839S);
            return;
        }
        if (obj == C.f8780n) {
            r rVar5 = this.f13841U;
            if (rVar5 != null) {
                o(rVar5);
            }
            r rVar6 = new r(mVar, null);
            this.f13841U = rVar6;
            rVar6.a(this);
            d(this.f13841U);
            return;
        }
        if (obj == C.f8781o) {
            r rVar7 = this.f13843W;
            if (rVar7 != null) {
                o(rVar7);
            }
            r rVar8 = new r(mVar, null);
            this.f13843W = rVar8;
            rVar8.a(this);
            d(this.f13843W);
            return;
        }
        if (obj == C.f8759A) {
            r rVar9 = this.f13845Y;
            if (rVar9 != null) {
                o(rVar9);
            }
            r rVar10 = new r(mVar, null);
            this.f13845Y = rVar10;
            rVar10.a(this);
            d(this.f13845Y);
            return;
        }
        if (obj != C.f8766H) {
            if (obj == C.f8768J) {
                d3.f fVar = this.f13832L;
                fVar.getClass();
                fVar.j(new p(new C1416b(), mVar, new C1083b()));
                return;
            }
            return;
        }
        r rVar11 = this.f13846Z;
        if (rVar11 != null) {
            o(rVar11);
        }
        r rVar12 = new r(mVar, null);
        this.f13846Z = rVar12;
        rVar12.a(this);
        d(this.f13846Z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v49, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e6  */
    @Override // j3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(android.graphics.Canvas r31, android.graphics.Matrix r32, int r33, n3.C1395a r34) {
        /*
            r30 = this;
            r0 = r30
            r7 = r31
            r8 = r33
            d3.f r1 = r0.f13832L
            java.lang.Object r1 = r1.e()
            r9 = r1
            g3.b r9 = (g3.C1083b) r9
            a3.k r10 = r0.f13834N
            java.util.HashMap r1 = r10.f
            java.lang.String r2 = r9.f13042b
            java.lang.Object r1 = r1.get(r2)
            r3 = r1
            g3.c r3 = (g3.c) r3
            if (r3 != 0) goto L1f
            return
        L1f:
            java.lang.String r11 = r3.f13053c
            java.lang.String r12 = r3.f13051a
            r7.save()
            r31.concat(r32)
            r13 = 0
            r0.s(r9, r8, r13)
            a3.y r14 = r0.f13833M
            java.util.Map r1 = r14.f8929z
            java.lang.String r2 = "\n"
            java.lang.String r4 = "\u0003"
            java.lang.String r5 = "\r"
            java.lang.String r6 = "\r\n"
            d3.i r15 = r0.f13842V
            r16 = 1092616192(0x41200000, float:10.0)
            r17 = 3
            r18 = 2
            r19 = 1120403456(0x42c80000, float:100.0)
            r20 = r13
            b3.a r13 = r0.f13827G
            r21 = r15
            b3.a r15 = r0.f13828H
            r22 = 1
            r23 = r15
            if (r1 != 0) goto L28e
            a3.k r1 = r14.f8920q
            r.S r1 = r1.f8839h
            int r1 = r1.f()
            if (r1 <= 0) goto L28e
            d3.r r1 = r0.f13845Y
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r1.e()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L6c
        L6a:
            float r1 = r9.f13043c
        L6c:
            float r1 = r1 / r19
            C0.d0 r19 = n3.i.f15203e
            java.lang.Object r19 = r19.get()
            r24 = 0
            r15 = r19
            float[] r15 = (float[]) r15
            r15[r20] = r24
            r15[r22] = r24
            float r19 = n3.i.f
            r15[r18] = r19
            r15[r17] = r19
            r19 = r1
            r1 = r32
            r1.mapPoints(r15)
            r1 = r15[r18]
            r18 = r15[r20]
            float r1 = r1 - r18
            r17 = r15[r17]
            r15 = r15[r22]
            float r15 = r17 - r15
            r26 = r13
            r25 = r14
            double r13 = (double) r1
            r27 = r10
            r28 = r11
            double r10 = (double) r15
            java.lang.Math.hypot(r13, r10)
            java.lang.String r1 = r9.f13041a
            java.lang.String r1 = r1.replaceAll(r6, r5)
            java.lang.String r1 = r1.replaceAll(r4, r5)
            java.lang.String r1 = r1.replaceAll(r2, r5)
            java.lang.String[] r1 = r1.split(r5)
            java.util.List r10 = java.util.Arrays.asList(r1)
            int r11 = r10.size()
            int r1 = r9.f13045e
            float r1 = (float) r1
            float r1 = r1 / r16
            d3.r r2 = r0.f13843W
            if (r2 == 0) goto Ld4
            java.lang.Object r2 = r2.e()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
        Ld1:
            float r1 = r1 + r2
        Ld2:
            r5 = r1
            goto Le1
        Ld4:
            if (r21 == 0) goto Ld2
            java.lang.Object r2 = r21.e()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            goto Ld1
        Le1:
            r13 = r20
            r15 = -1
        Le4:
            if (r13 >= r11) goto L28b
            java.lang.Object r1 = r10.get(r13)
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r2 = r9.f13050m
            if (r2 != 0) goto Lf3
            r2 = r24
            goto Lf5
        Lf3:
            float r2 = r2.x
        Lf5:
            r6 = 1
            r4 = r19
            java.util.List r1 = r0.y(r1, r2, r3, r4, r5, r6)
            r2 = r20
        Lfe:
            int r6 = r1.size()
            if (r2 >= r6) goto L26e
            java.lang.Object r6 = r1.get(r2)
            j3.i r6 = (j3.i) r6
            int r15 = r15 + 1
            r7.save()
            float r14 = r6.f13823b
            boolean r14 = r0.x(r7, r9, r15, r14)
            if (r14 == 0) goto L24d
            java.lang.String r6 = r6.f13822a
            r32 = r1
            r14 = r20
        L11d:
            int r1 = r6.length()
            if (r14 >= r1) goto L23a
            char r1 = r6.charAt(r14)
            r17 = r10
            r10 = r28
            int r1 = g3.d.a(r1, r12, r10)
            r16 = r2
            r34 = r5
            r2 = r27
            r.S r5 = r2.f8839h
            java.lang.Object r1 = r5.c(r1)
            g3.d r1 = (g3.d) r1
            if (r1 != 0) goto L151
            r27 = r2
            r18 = r6
            r19 = r11
            r21 = r13
            r22 = r14
            r2 = r23
            r14 = r25
            r13 = r26
            goto L21d
        L151:
            r0.s(r9, r8, r14)
            java.util.HashMap r5 = r0.f13829I
            boolean r18 = r5.containsKey(r1)
            if (r18 == 0) goto L16d
            java.lang.Object r5 = r5.get(r1)
            java.util.List r5 = (java.util.List) r5
            r18 = r6
            r19 = r11
            r21 = r13
            r22 = r14
            r14 = r25
            goto L1aa
        L16d:
            r18 = r6
            java.util.ArrayList r6 = r1.f13055a
            r19 = r11
            int r11 = r6.size()
            r21 = r13
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r11)
            r22 = r14
            r14 = r20
        L182:
            if (r14 >= r11) goto L1a4
            java.lang.Object r27 = r6.get(r14)
            r28 = r6
            r6 = r27
            i3.n r6 = (i3.n) r6
            r27 = r11
            c3.e r11 = new c3.e
            r29 = r14
            r14 = r25
            r11.<init>(r14, r0, r6, r2)
            r13.add(r11)
            int r6 = r29 + 1
            r11 = r27
            r14 = r6
            r6 = r28
            goto L182
        L1a4:
            r14 = r25
            r5.put(r1, r13)
            r5 = r13
        L1aa:
            r6 = r20
        L1ac:
            int r11 = r5.size()
            if (r6 >= r11) goto L208
            java.lang.Object r11 = r5.get(r6)
            c3.e r11 = (c3.e) r11
            android.graphics.Path r11 = r11.e()
            android.graphics.RectF r13 = r0.f13825E
            r27 = r2
            r2 = r20
            r11.computeBounds(r13, r2)
            android.graphics.Matrix r2 = r0.f13826F
            r2.reset()
            float r13 = r9.f13046g
            float r13 = -r13
            float r25 = n3.i.c()
            float r13 = r13 * r25
            r25 = r5
            r5 = r24
            r2.preTranslate(r5, r13)
            r2.preScale(r4, r4)
            r11.transform(r2)
            boolean r2 = r9.f13048k
            if (r2 == 0) goto L1ef
            r13 = r26
            u(r11, r13, r7)
            r2 = r23
            u(r11, r2, r7)
            goto L1f9
        L1ef:
            r2 = r23
            r13 = r26
            u(r11, r2, r7)
            u(r11, r13, r7)
        L1f9:
            int r6 = r6 + 1
            r23 = r2
            r26 = r13
            r5 = r25
            r2 = r27
            r20 = 0
            r24 = 0
            goto L1ac
        L208:
            r27 = r2
            r2 = r23
            r13 = r26
            double r5 = r1.f13057c
            float r1 = (float) r5
            float r1 = r1 * r4
            float r5 = n3.i.c()
            float r5 = r5 * r1
            float r5 = r5 + r34
            r1 = 0
            r7.translate(r5, r1)
        L21d:
            int r1 = r22 + 1
            r5 = r34
            r23 = r2
            r28 = r10
            r26 = r13
            r25 = r14
            r2 = r16
            r10 = r17
            r6 = r18
            r11 = r19
            r13 = r21
            r20 = 0
            r24 = 0
            r14 = r1
            goto L11d
        L23a:
            r16 = r2
            r34 = r5
            r17 = r10
            r19 = r11
            r21 = r13
            r2 = r23
            r14 = r25
            r13 = r26
            r10 = r28
            goto L250
        L24d:
            r32 = r1
            goto L23a
        L250:
            r7.restore()
            int r1 = r16 + 1
            r5 = r34
            r23 = r2
            r28 = r10
            r26 = r13
            r25 = r14
            r10 = r17
            r11 = r19
            r13 = r21
            r20 = 0
            r24 = 0
            r2 = r1
            r1 = r32
            goto Lfe
        L26e:
            r34 = r5
            r17 = r10
            r19 = r11
            r21 = r13
            r2 = r23
            r14 = r25
            r13 = r26
            r10 = r28
            int r1 = r21 + 1
            r10 = r17
            r20 = 0
            r24 = 0
            r13 = r1
            r19 = r4
            goto Le4
        L28b:
            r8 = r7
            goto L53b
        L28e:
            r10 = r11
            r11 = r23
            d3.r r1 = r0.f13846Z
            if (r1 == 0) goto L2a1
            java.lang.Object r1 = r1.e()
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L2a1
            r23 = r2
            goto L376
        L2a1:
            java.util.Map r1 = r14.f8929z
            if (r1 == 0) goto L2e7
            boolean r15 = r1.containsKey(r12)
            if (r15 == 0) goto L2b5
            java.lang.Object r1 = r1.get(r12)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
        L2b1:
            r23 = r2
            goto L371
        L2b5:
            java.lang.String r15 = r3.f13052b
            boolean r23 = r1.containsKey(r15)
            if (r23 == 0) goto L2c4
            java.lang.Object r1 = r1.get(r15)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            goto L2b1
        L2c4:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r12)
            r25 = r14
            java.lang.String r14 = "-"
            r15.append(r14)
            r15.append(r10)
            java.lang.String r14 = r15.toString()
            boolean r15 = r1.containsKey(r14)
            if (r15 == 0) goto L2e9
            java.lang.Object r1 = r1.get(r14)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            goto L2b1
        L2e7:
            r25 = r14
        L2e9:
            L0.l r1 = r25.i()
            if (r1 == 0) goto L36e
            java.lang.Object r14 = r1.f3125b
            K5.g r14 = (K5.g) r14
            r14.f2987b = r12
            r14.f2988c = r10
            java.lang.Object r15 = r1.f3126c
            java.util.HashMap r15 = (java.util.HashMap) r15
            java.lang.Object r23 = r15.get(r14)
            android.graphics.Typeface r23 = (android.graphics.Typeface) r23
            if (r23 == 0) goto L306
            r1 = r23
            goto L2b1
        L306:
            java.lang.Object r8 = r1.f3127d
            java.util.HashMap r8 = (java.util.HashMap) r8
            java.lang.Object r23 = r8.get(r12)
            android.graphics.Typeface r23 = (android.graphics.Typeface) r23
            if (r23 == 0) goto L317
            r1 = r23
            r23 = r2
            goto L341
        L317:
            android.graphics.Typeface r7 = r3.f13054d
            if (r7 == 0) goto L31f
            r23 = r2
            r1 = r7
            goto L341
        L31f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r23 = r2
            java.lang.String r2 = "fonts/"
            r7.<init>(r2)
            r7.append(r12)
            java.lang.Object r2 = r1.f3124a
            java.lang.String r2 = (java.lang.String) r2
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            java.lang.Object r1 = r1.f3128e
            android.content.res.AssetManager r1 = (android.content.res.AssetManager) r1
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r2)
            r8.put(r12, r1)
        L341:
            java.lang.String r2 = "Italic"
            boolean r2 = r10.contains(r2)
            java.lang.String r7 = "Bold"
            boolean r7 = r10.contains(r7)
            if (r2 == 0) goto L354
            if (r7 == 0) goto L354
            r2 = r17
            goto L35f
        L354:
            if (r2 == 0) goto L359
            r2 = r18
            goto L35f
        L359:
            if (r7 == 0) goto L35e
            r2 = r22
            goto L35f
        L35e:
            r2 = 0
        L35f:
            int r7 = r1.getStyle()
            if (r7 != r2) goto L366
            goto L36a
        L366:
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r1, r2)
        L36a:
            r15.put(r14, r1)
            goto L371
        L36e:
            r23 = r2
            r1 = 0
        L371:
            if (r1 == 0) goto L374
            goto L376
        L374:
            android.graphics.Typeface r1 = r3.f13054d
        L376:
            if (r1 != 0) goto L37c
        L378:
            r8 = r31
            goto L53b
        L37c:
            java.lang.String r2 = r9.f13041a
            r13.setTypeface(r1)
            d3.r r1 = r0.f13845Y
            if (r1 == 0) goto L390
            java.lang.Object r1 = r1.e()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L392
        L390:
            float r1 = r9.f13043c
        L392:
            float r7 = n3.i.c()
            float r7 = r7 * r1
            r13.setTextSize(r7)
            android.graphics.Typeface r7 = r13.getTypeface()
            r11.setTypeface(r7)
            float r7 = r13.getTextSize()
            r11.setTextSize(r7)
            int r7 = r9.f13045e
            float r7 = (float) r7
            float r7 = r7 / r16
            d3.r r8 = r0.f13843W
            if (r8 == 0) goto L3bd
            java.lang.Object r8 = r8.e()
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
        L3bb:
            float r7 = r7 + r8
            goto L3ca
        L3bd:
            if (r21 == 0) goto L3ca
            java.lang.Object r8 = r21.e()
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            goto L3bb
        L3ca:
            float r8 = n3.i.c()
            float r8 = r8 * r7
            float r8 = r8 * r1
            float r8 = r8 / r19
            java.lang.String r1 = r2.replaceAll(r6, r5)
            java.lang.String r1 = r1.replaceAll(r4, r5)
            r2 = r23
            java.lang.String r1 = r1.replaceAll(r2, r5)
            java.lang.String[] r1 = r1.split(r5)
            java.util.List r7 = java.util.Arrays.asList(r1)
            int r10 = r7.size()
            r12 = 0
            r14 = 0
            r15 = -1
        L3ef:
            if (r12 >= r10) goto L378
            java.lang.Object r1 = r7.get(r12)
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r2 = r9.f13050m
            if (r2 != 0) goto L3fd
            r2 = 0
            goto L400
        L3fd:
            float r5 = r2.x
            r2 = r5
        L400:
            r4 = 0
            r6 = 0
            r5 = r8
            java.util.List r1 = r0.y(r1, r2, r3, r4, r5, r6)
            r2 = 0
        L408:
            int r4 = r1.size()
            if (r2 >= r4) goto L526
            java.lang.Object r4 = r1.get(r2)
            j3.i r4 = (j3.i) r4
            int r15 = r15 + 1
            r31.save()
            java.lang.String r6 = r4.f13822a
            float r6 = r13.measureText(r6)
            r8 = r31
            boolean r6 = r0.x(r8, r9, r15, r6)
            if (r6 == 0) goto L509
            java.lang.String r6 = r4.f13822a
            r32 = r1
            r16 = r2
            r1 = 0
        L42e:
            int r2 = r6.length()
            if (r1 >= r2) goto L4fd
            int r2 = r6.codePointAt(r1)
            int r17 = java.lang.Character.charCount(r2)
            int r17 = r17 + r1
            r34 = r17
            r17 = r1
            r1 = r34
            r34 = r3
        L446:
            int r3 = r6.length()
            if (r1 >= r3) goto L48f
            int r3 = r6.codePointAt(r1)
            r18 = r3
            int r3 = java.lang.Character.getType(r18)
            r19 = r5
            r5 = 16
            if (r3 == r5) goto L483
            int r3 = java.lang.Character.getType(r18)
            r5 = 27
            if (r3 == r5) goto L483
            int r3 = java.lang.Character.getType(r18)
            r5 = 6
            if (r3 == r5) goto L483
            int r3 = java.lang.Character.getType(r18)
            r5 = 28
            if (r3 == r5) goto L483
            int r3 = java.lang.Character.getType(r18)
            r5 = 8
            if (r3 == r5) goto L483
            int r3 = java.lang.Character.getType(r18)
            r5 = 19
            if (r3 != r5) goto L491
        L483:
            int r3 = java.lang.Character.charCount(r18)
            int r1 = r1 + r3
            int r2 = r2 * 31
            int r2 = r2 + r18
            r5 = r19
            goto L446
        L48f:
            r19 = r5
        L491:
            long r2 = (long) r2
            r.q r5 = r0.f13830J
            int r18 = r5.c(r2)
            if (r18 < 0) goto L4a5
            java.lang.Object r1 = r5.b(r2)
            java.lang.String r1 = (java.lang.String) r1
            r18 = r7
            r21 = r10
            goto L4cb
        L4a5:
            r18 = r7
            java.lang.StringBuilder r7 = r0.f13824D
            r21 = r10
            r10 = 0
            r7.setLength(r10)
            r10 = r17
        L4b1:
            if (r10 >= r1) goto L4c4
            r22 = r1
            int r1 = r6.codePointAt(r10)
            r7.appendCodePoint(r1)
            int r1 = java.lang.Character.charCount(r1)
            int r10 = r10 + r1
            r1 = r22
            goto L4b1
        L4c4:
            java.lang.String r1 = r7.toString()
            r5.e(r2, r1)
        L4cb:
            int r2 = r14 + r17
            r3 = r33
            r0.s(r9, r3, r2)
            boolean r2 = r9.f13048k
            if (r2 == 0) goto L4dd
            t(r1, r13, r8)
            t(r1, r11, r8)
            goto L4e3
        L4dd:
            t(r1, r11, r8)
            t(r1, r13, r8)
        L4e3:
            float r2 = r13.measureText(r1)
            float r2 = r2 + r19
            r5 = 0
            r8.translate(r2, r5)
            int r1 = r1.length()
            int r1 = r1 + r17
            r3 = r34
            r7 = r18
            r5 = r19
            r10 = r21
            goto L42e
        L4fd:
            r34 = r3
            r19 = r5
            r18 = r7
            r21 = r10
            r5 = 0
            r3 = r33
            goto L50e
        L509:
            r32 = r1
            r16 = r2
            goto L4fd
        L50e:
            java.lang.String r1 = r4.f13822a
            int r1 = r1.length()
            int r14 = r14 + r1
            r8.restore()
            int r2 = r16 + 1
            r1 = r32
            r3 = r34
            r7 = r18
            r5 = r19
            r10 = r21
            goto L408
        L526:
            r8 = r31
            r34 = r3
            r19 = r5
            r18 = r7
            r21 = r10
            r5 = 0
            r3 = r33
            int r12 = r12 + 1
            r3 = r34
            r8 = r19
            goto L3ef
        L53b:
            r8.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.j.k(android.graphics.Canvas, android.graphics.Matrix, int, n3.a):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s(C1083b c1083b, int i, int i7) {
        r rVar = this.f13837Q;
        C0698a c0698a = this.f13827G;
        if (rVar != null) {
            c0698a.setColor(((Integer) rVar.e()).intValue());
        } else {
            d3.f fVar = this.f13836P;
            if (fVar == null || !w(i7)) {
                c0698a.setColor(c1083b.f13047h);
            } else {
                c0698a.setColor(((Integer) fVar.e()).intValue());
            }
        }
        r rVar2 = this.f13839S;
        C0698a c0698a2 = this.f13828H;
        if (rVar2 != null) {
            c0698a2.setColor(((Integer) rVar2.e()).intValue());
        } else {
            d3.f fVar2 = this.f13838R;
            if (fVar2 == null || !w(i7)) {
                c0698a2.setColor(c1083b.i);
            } else {
                c0698a2.setColor(((Integer) fVar2.e()).intValue());
            }
        }
        d3.e eVar = this.f13766w.j;
        int iIntValue = 100;
        int iIntValue2 = eVar == null ? 100 : ((Integer) eVar.e()).intValue();
        d3.f fVar3 = this.f13844X;
        if (fVar3 != null && w(i7)) {
            iIntValue = ((Integer) fVar3.e()).intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i) / 255.0f);
        c0698a.setAlpha(iRound);
        c0698a2.setAlpha(iRound);
        r rVar3 = this.f13841U;
        if (rVar3 != null) {
            c0698a2.setStrokeWidth(((Float) rVar3.e()).floatValue());
            return;
        }
        d3.i iVar = this.f13840T;
        if (iVar == null || !w(i7)) {
            c0698a2.setStrokeWidth(n3.i.c() * c1083b.j);
        } else {
            c0698a2.setStrokeWidth(((Float) iVar.e()).floatValue());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final i v(int i) {
        ArrayList arrayList = this.f13831K;
        for (int size = arrayList.size(); size < i; size++) {
            i iVar = new i();
            iVar.f13822a = "";
            iVar.f13823b = 0.0f;
            arrayList.add(iVar);
        }
        return (i) arrayList.get(i - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean w(int i) {
        d3.f fVar;
        int length = ((C1083b) this.f13832L.e()).f13041a.length();
        d3.f fVar2 = this.f13847a0;
        if (fVar2 == null || (fVar = this.f13848b0) == null) {
            return true;
        }
        int iMin = Math.min(((Integer) fVar2.e()).intValue(), ((Integer) fVar.e()).intValue());
        int iMax = Math.max(((Integer) fVar2.e()).intValue(), ((Integer) fVar.e()).intValue());
        d3.f fVar3 = this.f13849c0;
        if (fVar3 != null) {
            int iIntValue = ((Integer) fVar3.e()).intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.f13835O == 2) {
            return i >= iMin && i < iMax;
        }
        float f = (i / length) * 100.0f;
        return f >= ((float) iMin) && f < ((float) iMax);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean x(Canvas canvas, C1083b c1083b, int i, float f) {
        PointF pointF = c1083b.f13049l;
        PointF pointF2 = c1083b.f13050m;
        float fC = n3.i.c();
        float f7 = (i * c1083b.f * fC) + (pointF == null ? 0.0f : (c1083b.f * fC) + pointF.y);
        if (this.f13833M.f8896K && pointF2 != null && pointF != null && f7 >= pointF.y + pointF2.y + c1083b.f13043c) {
            return false;
        }
        float f8 = pointF == null ? 0.0f : pointF.x;
        float f9 = pointF2 != null ? pointF2.x : 0.0f;
        int iA = O.c.a(c1083b.f13044d);
        if (iA == 0) {
            canvas.translate(f8, f7);
            return true;
        }
        if (iA == 1) {
            canvas.translate((f8 + f9) - f, f7);
            return true;
        }
        if (iA != 2) {
            return true;
        }
        canvas.translate(((f9 / 2.0f) + f8) - (f / 2.0f), f7);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List y(String str, float f, g3.c cVar, float f7, float f8, boolean z5) {
        float fMeasureText;
        int i = 0;
        int i7 = 0;
        boolean z6 = false;
        int i8 = 0;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i9 = 0; i9 < str.length(); i9++) {
            char cCharAt = str.charAt(i9);
            if (z5) {
                g3.d dVar = (g3.d) this.f13834N.f8839h.c(g3.d.a(cCharAt, cVar.f13051a, cVar.f13053c));
                if (dVar != null) {
                    fMeasureText = (n3.i.c() * ((float) dVar.f13057c) * f7) + f8;
                }
            } else {
                fMeasureText = this.f13827G.measureText(str.substring(i9, i9 + 1)) + f8;
            }
            if (cCharAt == ' ') {
                z6 = true;
                f11 = fMeasureText;
            } else if (z6) {
                z6 = false;
                i8 = i9;
                f10 = fMeasureText;
            } else {
                f10 += fMeasureText;
            }
            f9 += fMeasureText;
            if (f > 0.0f && f9 >= f && cCharAt != ' ') {
                i++;
                i iVarV = v(i);
                if (i8 == i7) {
                    iVarV.f13822a = str.substring(i7, i9).trim();
                    iVarV.f13823b = (f9 - fMeasureText) - ((r10.length() - r8.length()) * f11);
                    i7 = i9;
                    i8 = i7;
                    f9 = fMeasureText;
                    f10 = f9;
                } else {
                    iVarV.f13822a = str.substring(i7, i8 - 1).trim();
                    iVarV.f13823b = ((f9 - f10) - ((r8.length() - r14.length()) * f11)) - f11;
                    f9 = f10;
                    i7 = i8;
                }
            }
        }
        if (f9 > 0.0f) {
            i++;
            i iVarV2 = v(i);
            iVarV2.f13822a = str.substring(i7);
            iVarV2.f13823b = f9;
        }
        return this.f13831K.subList(0, i);
    }
}
