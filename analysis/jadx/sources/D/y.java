package D;

import B0.C0029a;
import B0.L;
import C.C0061a;
import E.C;
import E.C0122e;
import E.C0128k;
import E.H;
import E.J;
import E.K;
import P.C0345b;
import P.C0354f0;
import P.S;
import P.W;
import a0.AbstractC0606h;
import com.google.android.gms.internal.measurement.K1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import m5.C1371j;
import p3.z0;
import w.A0;
import w.EnumC1778d0;

/* JADX INFO: loaded from: classes.dex */
public final class y implements A0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Z.m f1304w = K1.y(g.f1211s, n.f1244s);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0061a f1305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f1307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C.u f1308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0354f0 f1309e;
    public final y.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f1310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z0 f1311h;
    public final boolean i;
    public L j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C.x f1312k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0122e f1313l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.b f1314m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0128k f1315n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final K f1316o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k3.d f1317p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final H f1318q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final W f1319r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final W f1320s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0354f0 f1321t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0354f0 f1322u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k3.c f1323v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y(int i, int i7) {
        C0061a c0061a = new C0061a();
        c0061a.f584a = -1;
        c0061a.f586c = new R.e(new J[16]);
        this.f1305a = c0061a;
        this.f1308d = new C.u(i, i7, 1);
        this.f1309e = new C0354f0(A.f1188a, S.f5374s);
        this.f = new y.i();
        this.f1311h = new z0(new C0029a(8, this));
        this.i = true;
        this.f1312k = new C.x(this, 1);
        this.f1313l = new C0122e();
        this.f1314m = new androidx.compose.foundation.lazy.layout.b();
        this.f1315n = new C0128k(0);
        this.f1316o = new K(new v(i, 0, this));
        this.f1317p = new k3.d(3, this);
        this.f1318q = new H();
        this.f1319r = C.h();
        this.f1320s = C.h();
        Boolean bool = Boolean.FALSE;
        this.f1321t = C0345b.q(bool);
        this.f1322u = C0345b.q(bool);
        this.f1323v = new k3.c(4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w.A0
    public final boolean a() {
        return ((Boolean) this.f1322u.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w.A0
    public final boolean b() {
        return this.f1311h.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w.A0
    public final boolean c() {
        return ((Boolean) this.f1321t.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w.A0
    public final float d(float f) {
        return this.f1311h.d(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: B5.e */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r8.e(r6, r7, r0) == r4) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // w.A0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(v.W r6, B5.e r7, s5.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof D.w
            if (r0 == 0) goto L13
            r0 = r8
            D.w r0 = (D.w) r0
            int r1 = r0.f1301v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1301v = r1
            goto L18
        L13:
            D.w r0 = new D.w
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f1299t
            int r1 = r0.f1301v
            r2 = 2
            r3 = 1
            r5.a r4 = r5.EnumC1580a.f16356q
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            m5.AbstractC1362a.e(r8)
            goto L69
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            s5.i r6 = r0.f1298s
            r7 = r6
            B5.e r7 = (B5.e) r7
            v.W r6 = r0.f1297r
            D.y r1 = r0.f1296q
            m5.AbstractC1362a.e(r8)
            goto L57
        L3f:
            m5.AbstractC1362a.e(r8)
            r0.f1296q = r5
            r0.f1297r = r6
            r8 = r7
            s5.i r8 = (s5.i) r8
            r0.f1298s = r8
            r0.f1301v = r3
            E.e r8 = r5.f1313l
            java.lang.Object r8 = r8.f(r0)
            if (r8 != r4) goto L56
            goto L68
        L56:
            r1 = r5
        L57:
            p3.z0 r8 = r1.f1311h
            r1 = 0
            r0.f1296q = r1
            r0.f1297r = r1
            r0.f1298s = r1
            r0.f1301v = r2
            java.lang.Object r6 = r8.e(r6, r7, r0)
            if (r6 != r4) goto L69
        L68:
            return r4
        L69:
            m5.y r6 = m5.C1386y.f15098a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: D.y.e(v.W, B5.e, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(D.o r11, boolean r12, boolean r13) {
        /*
            r10 = this;
            if (r12 != 0) goto L9
            boolean r0 = r10.f1306b
            if (r0 == 0) goto L9
            r10.f1307c = r11
            return
        L9:
            r0 = 1
            if (r12 == 0) goto Le
            r10.f1306b = r0
        Le:
            float r1 = r10.f1310g
            float r2 = r11.f1250d
            w.d0 r3 = r11.f1259p
            java.lang.Object r4 = r11.f1255l
            int r5 = r11.f1248b
            D.q r6 = r11.f1247a
            float r1 = r1 - r2
            r10.f1310g = r1
            P.f0 r1 = r10.f1309e
            r1.setValue(r11)
            r1 = 0
            if (r6 == 0) goto L28
            int r2 = r6.f1277a
            goto L29
        L28:
            r2 = r1
        L29:
            if (r2 != 0) goto L30
            if (r5 == 0) goto L2e
            goto L30
        L2e:
            r2 = r1
            goto L31
        L30:
            r2 = r0
        L31:
            P.f0 r7 = r10.f1322u
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r7.setValue(r2)
            boolean r2 = r11.f1249c
            P.f0 r7 = r10.f1321t
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r7.setValue(r2)
            r2 = 0
            C.u r7 = r10.f1308d
            if (r13 == 0) goto L62
            r7.getClass()
            float r13 = (float) r5
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 < 0) goto L53
            goto L54
        L53:
            r0 = r1
        L54:
            if (r0 != 0) goto L5b
            java.lang.String r13 = "scrollOffset should be non-negative"
            z.AbstractC1923a.c(r13)
        L5b:
            P.c0 r13 = r7.f686c
            r13.f(r5)
            goto L10a
        L62:
            r7.getClass()
            r13 = 0
            if (r6 == 0) goto L76
            D.p[] r8 = r6.f1278b
            int r9 = r8.length
            if (r9 != 0) goto L6f
            r8 = r13
            goto L71
        L6f:
            r8 = r8[r1]
        L71:
            if (r8 == 0) goto L76
            java.lang.Object r8 = r8.f1263b
            goto L77
        L76:
            r8 = r13
        L77:
            r7.f688e = r8
            boolean r8 = r7.f687d
            if (r8 != 0) goto L81
            int r8 = r11.f1258o
            if (r8 <= 0) goto Lb6
        L81:
            r7.f687d = r0
            float r8 = (float) r5
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 < 0) goto L8a
            r2 = r0
            goto L8b
        L8a:
            r2 = r1
        L8b:
            if (r2 != 0) goto La3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r8 = "scrollOffset should be non-negative ("
            r2.<init>(r8)
            r2.append(r5)
            r8 = 41
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            z.AbstractC1923a.c(r2)
        La3:
            if (r6 == 0) goto Lb2
            D.p[] r2 = r6.f1278b
            int r6 = r2.length
            if (r6 != 0) goto Lab
            goto Lad
        Lab:
            r13 = r2[r1]
        Lad:
            if (r13 == 0) goto Lb2
            int r13 = r13.f1262a
            goto Lb3
        Lb2:
            r13 = r1
        Lb3:
            r7.a(r13, r5)
        Lb6:
            boolean r13 = r10.i
            if (r13 == 0) goto L10a
            C.a r13 = r10.f1305a
            java.lang.Object r2 = r13.f586c
            R.e r2 = (R.e) r2
            int r5 = r13.f584a
            r6 = -1
            if (r5 == r6) goto L10a
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L10a
            boolean r5 = r13.f585b
            w.d0 r7 = w.EnumC1778d0.f17945q
            if (r5 == 0) goto Le3
            java.lang.Object r4 = n5.l.r0(r4)
            D.p r4 = (D.p) r4
            if (r3 != r7) goto Ldf
            int r3 = r4.f1274p
            goto Le1
        Ldf:
            int r3 = r4.f1275q
        Le1:
            int r3 = r3 + r0
            goto Lf1
        Le3:
            java.lang.Object r4 = n5.l.l0(r4)
            D.p r4 = (D.p) r4
            if (r3 != r7) goto Lee
            int r3 = r4.f1274p
            goto Lf0
        Lee:
            int r3 = r4.f1275q
        Lf0:
            int r3 = r3 - r0
        Lf1:
            int r0 = r13.f584a
            if (r0 == r3) goto L10a
            r13.f584a = r6
            java.lang.Object[] r13 = r2.f6676q
            int r0 = r2.f6678s
        Lfb:
            if (r1 >= r0) goto L107
            r3 = r13[r1]
            E.J r3 = (E.J) r3
            r3.cancel()
            int r1 = r1 + 1
            goto Lfb
        L107:
            r2.i()
        L10a:
            if (r12 == 0) goto L117
            float r12 = r11.f
            W0.c r13 = r11.i
            M5.w r11 = r11.f1253h
            k3.c r0 = r10.f1323v
            r0.r(r12, r13, r11)
        L117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D.y.f(D.o, boolean, boolean):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final o g() {
        return (o) this.f1309e.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:44:0x00b2 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5, types: [B5.c, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final void h(float f, o oVar) {
        int i;
        int i7;
        boolean z5;
        ?? r18;
        if (this.i) {
            C0061a c0061a = this.f1305a;
            R.e eVar = (R.e) c0061a.f586c;
            Object obj = oVar.f1255l;
            EnumC1778d0 enumC1778d0 = oVar.f1259p;
            ?? r7 = oVar.f1255l;
            if (((Collection) obj).isEmpty()) {
                return;
            }
            boolean z6 = f < 0.0f;
            EnumC1778d0 enumC1778d02 = EnumC1778d0.f17945q;
            if (z6) {
                p pVar = (p) n5.l.r0(r7);
                i = (enumC1778d0 == enumC1778d02 ? pVar.f1274p : pVar.f1275q) + 1;
                i7 = ((p) n5.l.r0(r7)).f1262a + 1;
            } else {
                p pVar2 = (p) n5.l.l0(r7);
                i = (enumC1778d0 == enumC1778d02 ? pVar2.f1274p : pVar2.f1275q) - 1;
                i7 = ((p) n5.l.l0(r7)).f1262a - 1;
            }
            if (i7 < 0 || i7 >= oVar.f1258o) {
                return;
            }
            if (i == c0061a.f584a || i < 0) {
                z5 = z6;
                r18 = r7;
            } else {
                if (c0061a.f585b != z6) {
                    Object[] objArr = eVar.f6676q;
                    int i8 = eVar.f6678s;
                    for (int i9 = 0; i9 < i8; i9++) {
                        ((J) objArr[i9]).cancel();
                    }
                }
                c0061a.f585b = z6;
                c0061a.f584a = i;
                eVar.i();
                k3.d dVar = this.f1317p;
                dVar.getClass();
                ArrayList arrayList = new ArrayList();
                y yVar = (y) dVar.f14122r;
                AbstractC0606h abstractC0606hC = a0.r.c();
                B5.c cVarE = abstractC0606hC != null ? abstractC0606hC.e() : null;
                AbstractC0606h abstractC0606hD = a0.r.d(abstractC0606hC);
                try {
                    o oVar2 = yVar.f1306b ? yVar.f1307c : (o) yVar.f1309e.getValue();
                    if (oVar2 != null) {
                        List list = (List) oVar2.f1254k.invoke(Integer.valueOf(i));
                        int size = list.size();
                        int i10 = 0;
                        r7 = r7;
                        while (i10 < size) {
                            C1371j c1371j = (C1371j) list.get(i10);
                            boolean z7 = z6;
                            y yVar2 = yVar;
                            ?? r182 = r7;
                            int i11 = i10;
                            arrayList.add(yVar.f1316o.a(((Number) c1371j.f15080q).intValue(), ((W0.a) c1371j.f15081r).f8007a));
                            i10 = i11 + 1;
                            z6 = z7;
                            yVar = yVar2;
                            r7 = r182;
                        }
                    }
                    z5 = z6;
                    r18 = r7;
                    a0.r.f(abstractC0606hC, abstractC0606hD, cVarE);
                    eVar.e(eVar.f6678s, arrayList);
                } catch (Throwable th) {
                    a0.r.f(abstractC0606hC, abstractC0606hD, cVarE);
                    throw th;
                }
            }
            if (!z5) {
                if (oVar.f1256m - D5.a.y((p) n5.l.l0(r18), enumC1778d0) < f) {
                    Object[] objArr2 = eVar.f6676q;
                    int i12 = eVar.f6678s;
                    for (int i13 = 0; i13 < i12; i13++) {
                        ((J) objArr2[i13]).a();
                    }
                    return;
                }
                return;
            }
            p pVar3 = (p) n5.l.r0(r18);
            if (((D5.a.y(pVar3, enumC1778d0) + ((int) (enumC1778d0 == enumC1778d02 ? pVar3.f1272n & 4294967295L : pVar3.f1272n >> 32))) + oVar.f1261r) - oVar.f1257n < (-f)) {
                Object[] objArr3 = eVar.f6676q;
                int i14 = eVar.f6678s;
                for (int i15 = 0; i15 < i14; i15++) {
                    ((J) objArr3[i15]).a();
                }
            }
        }
    }
}
