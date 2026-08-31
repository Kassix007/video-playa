package C0;

import android.graphics.Matrix;
import c0.AbstractC0724l;
import com.google.android.gms.internal.measurement.O1;
import j0.AbstractC1145B;
import r.C1544C;
import r.C1566q;
import v0.C1735d;
import v0.C1736e;
import z0.InterfaceC1953m;

/* JADX INFO: loaded from: classes.dex */
public final class H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f835e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f837h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: B5.e */
    /* JADX WARN: Multi-variable type inference failed */
    public H0(B5.e eVar) {
        this.f835e = (kotlin.jvm.internal.n) eVar;
        this.f836g = AbstractC1145B.j();
        this.f837h = AbstractC1145B.j();
        this.f833c = true;
        this.f834d = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r18, java.util.List r20, boolean r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r20
            java.lang.Object r4 = r0.f836g
            v0.e r4 = (v0.C1736e) r4
            java.lang.Object r5 = r0.f837h
            r.y r5 = (r.y) r5
            r5.a()
            r6 = r3
            java.util.Collection r6 = (java.util.Collection) r6
            int r6 = r6.size()
            r7 = 1
            r11 = r4
            r10 = r7
            r9 = 0
        L1c:
            if (r9 >= r6) goto L99
            java.lang.Object r12 = r3.get(r9)
            c0.l r12 = (c0.AbstractC0724l) r12
            boolean r13 = r12.f10099D
            if (r13 == 0) goto L96
            B0.K r13 = new B0.K
            r14 = 19
            r13.<init>(r14, r0, r12)
            r12.f10098C = r13
            if (r10 == 0) goto L73
            R.e r13 = r11.f17449a
            java.lang.Object[] r14 = r13.f6676q
            int r13 = r13.f6678s
            r15 = 0
        L3a:
            if (r15 >= r13) goto L4e
            r16 = r14[r15]
            r8 = r16
            v0.d r8 = (v0.C1735d) r8
            c0.l r8 = r8.f17444c
            boolean r8 = kotlin.jvm.internal.m.a(r8, r12)
            if (r8 == 0) goto L4b
            goto L50
        L4b:
            int r15 = r15 + 1
            goto L3a
        L4e:
            r16 = 0
        L50:
            r8 = r16
            v0.d r8 = (v0.C1735d) r8
            if (r8 == 0) goto L72
            r8.i = r7
            U.l r11 = r8.f17445d
            r11.c(r1)
            java.lang.Object r11 = r5.d(r1)
            if (r11 != 0) goto L6b
            r.C r11 = new r.C
            r11.<init>()
            r5.f(r1, r11)
        L6b:
            r.C r11 = (r.C1544C) r11
            r11.a(r8)
        L70:
            r11 = r8
            goto L96
        L72:
            r10 = 0
        L73:
            v0.d r8 = new v0.d
            r8.<init>(r12)
            U.l r12 = r8.f17445d
            r12.c(r1)
            java.lang.Object r12 = r5.d(r1)
            if (r12 != 0) goto L8b
            r.C r12 = new r.C
            r12.<init>()
            r5.f(r1, r12)
        L8b:
            r.C r12 = (r.C1544C) r12
            r12.a(r8)
            R.e r11 = r11.f17449a
            r11.c(r8)
            goto L70
        L96:
            int r9 = r9 + 1
            goto L1c
        L99:
            if (r21 == 0) goto L103
            long[] r1 = r5.f16261b
            java.lang.Object[] r2 = r5.f16262c
            long[] r3 = r5.f16260a
            int r5 = r3.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L103
            r6 = 0
        La7:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto Lfc
            int r9 = r6 - r5
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = 0
        Lc1:
            if (r11 >= r9) goto Lf9
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.32E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto Lee
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r1[r12]
            r12 = r2[r12]
            r.C r12 = (r.C1544C) r12
            R.e r15 = r4.f17449a
            r18 = r10
            java.lang.Object[] r10 = r15.f6676q
            int r15 = r15.f6678s
            r0 = 0
        Lde:
            if (r0 >= r15) goto Lf0
            r16 = r10[r0]
            r19 = r0
            r0 = r16
            v0.d r0 = (v0.C1735d) r0
            r0.f(r13, r12)
            int r0 = r19 + 1
            goto Lde
        Lee:
            r18 = r10
        Lf0:
            long r7 = r7 >> r18
            int r11 = r11 + 1
            r0 = r17
            r10 = r18
            goto Lc1
        Lf9:
            r0 = r10
            if (r9 != r0) goto L103
        Lfc:
            if (r6 == r5) goto L103
            int r6 = r6 + 1
            r0 = r17
            goto La7
        L103:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.H0.a(long, java.util.List, boolean):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v1, types: [B5.e, kotlin.jvm.internal.n] */
    public float[] b(Object obj) {
        float[] fArr = (float[]) this.f836g;
        if (!this.f831a) {
            return fArr;
        }
        Matrix matrix = (Matrix) this.f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f = matrix;
        }
        ((kotlin.jvm.internal.n) this.f835e).invoke(obj, matrix);
        AbstractC1145B.r(fArr, matrix);
        this.f831a = false;
        this.f834d = AbstractC1145B.m(fArr);
        return fArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean c(O1 o12, boolean z5) {
        C1544C c1544c = (C1544C) this.f;
        C1736e c1736e = (C1736e) this.f836g;
        boolean zA = c1736e.a((C1566q) o12.f10680b, (InterfaceC1953m) this.f835e, o12, z5);
        R.e eVar = c1736e.f17449a;
        if (!zA) {
            return false;
        }
        boolean z6 = true;
        this.f831a = true;
        Object[] objArr = eVar.f6676q;
        int i = eVar.f6678s;
        boolean z7 = false;
        for (int i7 = 0; i7 < i; i7++) {
            z7 = ((C1735d) objArr[i7]).e(o12, z5) || z7;
        }
        Object[] objArr2 = eVar.f6676q;
        int i8 = eVar.f6678s;
        boolean z8 = false;
        for (int i9 = 0; i9 < i8; i9++) {
            z8 = ((C1735d) objArr2[i9]).d(o12) || z8;
        }
        c1736e.b(o12);
        if (!z8 && !z7) {
            z6 = false;
        }
        this.f831a = false;
        if (this.f834d) {
            this.f834d = false;
            int i10 = c1544c.f16115b;
            for (int i11 = 0; i11 < i10; i11++) {
                f((AbstractC0724l) c1544c.e(i11));
            }
            c1544c.c();
        }
        if (this.f832b) {
            this.f832b = false;
            e();
        }
        if (this.f833c) {
            this.f833c = false;
            c1736e.f17449a.i();
        }
        return z6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d() {
        this.f831a = true;
        this.f832b = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void e() {
        C1736e c1736e = (C1736e) this.f836g;
        if (this.f831a) {
            this.f832b = true;
            return;
        }
        R.e eVar = c1736e.f17449a;
        Object[] objArr = eVar.f6676q;
        int i = eVar.f6678s;
        for (int i7 = 0; i7 < i; i7++) {
            ((C1735d) objArr[i7]).c();
        }
        if (this.f833c) {
            this.f833c = true;
        } else {
            c1736e.f17449a.i();
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
    public void f(AbstractC0724l abstractC0724l) {
        if (this.f831a) {
            this.f834d = true;
            ((C1544C) this.f).a(abstractC0724l);
            return;
        }
        C1736e c1736e = (C1736e) this.f836g;
        C1544C c1544c = c1736e.f17450b;
        c1544c.c();
        c1544c.a(c1736e);
        while (c1544c.h()) {
            C1736e c1736e2 = (C1736e) c1544c.i(c1544c.f16115b - 1);
            int i = 0;
            while (true) {
                R.e eVar = c1736e2.f17449a;
                if (i < eVar.f6678s) {
                    C1735d c1735d = (C1735d) eVar.f6676q[i];
                    if (kotlin.jvm.internal.m.a(c1735d.f17444c, abstractC0724l)) {
                        c1736e2.f17449a.l(c1735d);
                        c1735d.c();
                    } else {
                        c1544c.a(c1735d);
                        i++;
                    }
                }
            }
        }
    }

    public H0(InterfaceC1953m interfaceC1953m) {
        this.f835e = interfaceC1953m;
        this.f = new C1544C();
        this.f836g = new C1736e();
        this.f837h = new r.y(10);
    }
}
