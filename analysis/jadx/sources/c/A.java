package C;

import B0.C0029a;
import B0.L;
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
import java.util.Collection;
import p3.z0;
import w.A0;
import z.AbstractC1923a;

/* JADX INFO: loaded from: classes.dex */
public final class A implements A0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Z.m f562w = K1.y(v.f689q, p.f647s);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0061a f563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0354f0 f567e;
    public final y.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f568g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z0 f569h;
    public final boolean i;
    public L j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x f570k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0122e f571l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.b f572m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0128k f573n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final K f574o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k3.c f575p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final H f576q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final W f577r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0354f0 f578s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0354f0 f579t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final W f580u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k3.c f581v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public A(int i, int i7) {
        C0061a c0061a = new C0061a();
        c0061a.f584a = -1;
        this.f563a = c0061a;
        this.f566d = new u(i, i7, 0);
        this.f567e = new C0354f0(D.f583a, S.f5374s);
        this.f = new y.i();
        this.f569h = new z0(new C0029a(3, this));
        this.i = true;
        this.f570k = new x(this, 0);
        this.f571l = new C0122e();
        this.f572m = new androidx.compose.foundation.lazy.layout.b();
        this.f573n = new C0128k(0);
        this.f574o = new K(new w(this, i));
        this.f575p = new k3.c(this);
        this.f576q = new H();
        this.f577r = E.C.h();
        Boolean bool = Boolean.FALSE;
        this.f578s = C0345b.q(bool);
        this.f579t = C0345b.q(bool);
        this.f580u = E.C.h();
        this.f581v = new k3.c(4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w.A0
    public final boolean a() {
        return ((Boolean) this.f579t.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w.A0
    public final boolean b() {
        return this.f569h.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w.A0
    public final boolean c() {
        return ((Boolean) this.f578s.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w.A0
    public final float d(float f) {
        return this.f569h.d(f);
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
            boolean r0 = r8 instanceof C.y
            if (r0 == 0) goto L13
            r0 = r8
            C.y r0 = (C.y) r0
            int r1 = r0.f699v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f699v = r1
            goto L18
        L13:
            C.y r0 = new C.y
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f697t
            int r1 = r0.f699v
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
            s5.i r6 = r0.f696s
            r7 = r6
            B5.e r7 = (B5.e) r7
            v.W r6 = r0.f695r
            C.A r1 = r0.f694q
            m5.AbstractC1362a.e(r8)
            goto L57
        L3f:
            m5.AbstractC1362a.e(r8)
            r0.f694q = r5
            r0.f695r = r6
            r8 = r7
            s5.i r8 = (s5.i) r8
            r0.f696s = r8
            r0.f699v = r3
            E.e r8 = r5.f571l
            java.lang.Object r8 = r8.f(r0)
            if (r8 != r4) goto L56
            goto L68
        L56:
            r1 = r5
        L57:
            p3.z0 r8 = r1.f569h
            r1 = 0
            r0.f694q = r1
            r0.f695r = r1
            r0.f696s = r1
            r0.f699v = r2
            java.lang.Object r6 = r8.e(r6, r7, r0)
            if (r6 != r4) goto L69
        L68:
            return r4
        L69:
            m5.y r6 = m5.C1386y.f15098a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: C.A.e(v.W, B5.e, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    public final void f(s sVar, boolean z5, boolean z6) {
        if (!z5 && this.f564b) {
            this.f565c = sVar;
            return;
        }
        if (z5) {
            this.f564b = true;
        }
        t tVar = sVar.f657a;
        ?? r22 = sVar.f664k;
        int i = sVar.f658b;
        this.f579t.setValue(Boolean.valueOf(((tVar != null ? tVar.f671a : 0) == 0 && i == 0) ? false : true));
        this.f578s.setValue(Boolean.valueOf(sVar.f659c));
        this.f568g -= sVar.f660d;
        this.f567e.setValue(sVar);
        u uVar = this.f566d;
        if (z6) {
            uVar.getClass();
            if (!(((float) i) >= 0.0f)) {
                AbstractC1923a.c("scrollOffset should be non-negative");
            }
            uVar.f686c.f(i);
        } else {
            uVar.getClass();
            uVar.f688e = tVar != null ? tVar.f676g : null;
            if (uVar.f687d || sVar.f667n > 0) {
                uVar.f687d = true;
                if (!(((float) i) >= 0.0f)) {
                    AbstractC1923a.c("scrollOffset should be non-negative");
                }
                uVar.a(tVar != null ? tVar.f671a : 0, i);
            }
            if (this.i) {
                C0061a c0061a = this.f563a;
                if (c0061a.f584a != -1 && !((Collection) r22).isEmpty()) {
                    if (c0061a.f584a != (c0061a.f585b ? ((t) n5.l.r0(r22)).f671a + 1 : ((t) n5.l.l0(r22)).f671a - 1)) {
                        c0061a.f584a = -1;
                        J j = (J) c0061a.f586c;
                        if (j != null) {
                            j.cancel();
                        }
                        c0061a.f586c = null;
                    }
                }
            }
        }
        if (z5) {
            this.f581v.r(sVar.f, sVar.i, sVar.f663h);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final s g() {
        return (s) this.f567e.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final void h(float f, s sVar) {
        J j;
        J j7;
        J j8;
        if (this.i) {
            Object obj = sVar.f664k;
            ?? r12 = sVar.f664k;
            if (((Collection) obj).isEmpty()) {
                return;
            }
            boolean z5 = f < 0.0f;
            int i = z5 ? ((t) n5.l.r0(r12)).f671a + 1 : ((t) n5.l.l0(r12)).f671a - 1;
            if (i < 0 || i >= sVar.f667n) {
                return;
            }
            C0061a c0061a = this.f563a;
            if (i != c0061a.f584a) {
                if (c0061a.f585b != z5 && (j8 = (J) c0061a.f586c) != null) {
                    j8.cancel();
                }
                c0061a.f585b = z5;
                c0061a.f584a = i;
                A a7 = (A) this.f575p.f14120q;
                AbstractC0606h abstractC0606hC = a0.r.c();
                B5.c cVarE = abstractC0606hC != null ? abstractC0606hC.e() : null;
                AbstractC0606h abstractC0606hD = a0.r.d(abstractC0606hC);
                try {
                    long j9 = ((s) a7.f567e.getValue()).j;
                    a0.r.f(abstractC0606hC, abstractC0606hD, cVarE);
                    c0061a.f586c = a7.f574o.a(i, j9);
                } catch (Throwable th) {
                    a0.r.f(abstractC0606hC, abstractC0606hD, cVarE);
                    throw th;
                }
            }
            if (!z5) {
                if (sVar.f665l - ((t) n5.l.l0(r12)).j >= f || (j = (J) c0061a.f586c) == null) {
                    return;
                }
                j.a();
                return;
            }
            t tVar = (t) n5.l.r0(r12);
            if (((tVar.j + tVar.f678k) + sVar.f670q) - sVar.f666m >= (-f) || (j7 = (J) c0061a.f586c) == null) {
                return;
            }
            j7.a();
        }
    }
}
