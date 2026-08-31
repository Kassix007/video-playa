package M2;

import D2.l;
import android.content.Context;
import java.util.List;
import y2.C1913i;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f3799e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f3800g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ k(Object obj, List list, int i, Object obj2, Object obj3, Object obj4, boolean z5) {
        this.f3798d = obj;
        this.f3795a = list;
        this.f3796b = i;
        this.f3799e = obj2;
        this.f = obj3;
        this.f3800g = obj4;
        this.f3797c = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(D2.j jVar, C1913i c1913i) {
        Context context = jVar.f1396a;
        D2.j jVar2 = (D2.j) this.f3798d;
        if (context != jVar2.f1396a) {
            throw new IllegalStateException(("Interceptor '" + c1913i + "' cannot modify the request's context.").toString());
        }
        if (jVar.f1397b == l.f1419b) {
            throw new IllegalStateException(("Interceptor '" + c1913i + "' cannot set the request's data to null.").toString());
        }
        if (jVar.f1398c != jVar2.f1398c) {
            throw new IllegalStateException(("Interceptor '" + c1913i + "' cannot modify the request's target.").toString());
        }
        if (jVar.f1414v != jVar2.f1414v) {
            throw new IllegalStateException(("Interceptor '" + c1913i + "' cannot modify the request's lifecycle.").toString());
        }
        if (jVar.f1415w == jVar2.f1415w) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + c1913i + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(D2.j r12, s5.c r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof y2.C1914j
            if (r0 == 0) goto L13
            r0 = r13
            y2.j r0 = (y2.C1914j) r0
            int r1 = r0.f18617u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18617u = r1
            goto L18
        L13:
            y2.j r0 = new y2.j
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f18615s
            int r1 = r0.f18617u
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            y2.i r12 = r0.f18614r
            M2.k r0 = r0.f18613q
            m5.AbstractC1362a.e(r13)
            goto L79
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            m5.AbstractC1362a.e(r13)
            java.util.List r13 = r11.f3795a
            int r1 = r11.f3796b
            if (r1 <= 0) goto L45
            int r3 = r1 + (-1)
            java.lang.Object r3 = r13.get(r3)
            y2.i r3 = (y2.C1913i) r3
            r11.a(r12, r3)
        L45:
            java.lang.Object r13 = r13.get(r1)
            y2.i r13 = (y2.C1913i) r13
            int r6 = r1 + 1
            java.lang.Object r1 = r11.f
            r8 = r1
            E2.h r8 = (E2.h) r8
            M2.k r3 = new M2.k
            java.lang.Object r1 = r11.f3798d
            r4 = r1
            D2.j r4 = (D2.j) r4
            java.lang.Object r1 = r11.f3800g
            r9 = r1
            t2.c r9 = (t2.C1618c) r9
            boolean r10 = r11.f3797c
            java.util.List r5 = r11.f3795a
            r7 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.f18613q = r11
            r0.f18614r = r13
            r0.f18617u = r2
            java.lang.Object r12 = r13.d(r3, r0)
            r5.a r0 = r5.EnumC1580a.f16356q
            if (r12 != r0) goto L75
            return r0
        L75:
            r0 = r13
            r13 = r12
            r12 = r0
            r0 = r11
        L79:
            D2.k r13 = (D2.k) r13
            D2.j r1 = r13.a()
            r0.a(r1, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.k.b(D2.j, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(s5.c r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f3798d
            r2 = r0
            U2.g r2 = (U2.g) r2
            boolean r0 = r12 instanceof M2.j
            if (r0 == 0) goto L18
            r0 = r12
            M2.j r0 = (M2.j) r0
            int r1 = r0.f3794t
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r1 & r3
            if (r4 == 0) goto L18
            int r1 = r1 - r3
            r0.f3794t = r1
            goto L1d
        L18:
            M2.j r0 = new M2.j
            r0.<init>(r11, r12)
        L1d:
            java.lang.Object r12 = r0.f3792r
            int r1 = r0.f3794t
            r9 = 1
            if (r1 == 0) goto L34
            if (r1 != r9) goto L2c
            M2.h r0 = r0.f3791q
            m5.AbstractC1362a.e(r12)
            goto L6b
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L34:
            m5.AbstractC1362a.e(r12)
            java.util.List r12 = r11.f3795a
            int r1 = r11.f3796b
            java.lang.Object r12 = r12.get(r1)
            M2.h r12 = (M2.h) r12
            int r4 = r1 + 1
            java.lang.Object r1 = r11.f3799e
            r5 = r1
            U2.g r5 = (U2.g) r5
            java.lang.Object r1 = r11.f
            r6 = r1
            V2.h r6 = (V2.h) r6
            M2.k r1 = new M2.k
            java.lang.Object r3 = r11.f3800g
            r7 = r3
            I2.i r7 = (I2.i) r7
            boolean r8 = r11.f3797c
            java.util.List r3 = r11.f3795a
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.f3791q = r12
            r0.f3794t = r9
            java.lang.Object r0 = r12.d(r1, r0)
            r5.a r1 = r5.EnumC1580a.f16356q
            if (r0 != r1) goto L68
            return r1
        L68:
            r10 = r0
            r0 = r12
            r12 = r10
        L6b:
            U2.j r12 = (U2.j) r12
            U2.g r1 = r12.a()
            android.content.Context r3 = r1.f7658a
            android.content.Context r4 = r2.f7658a
            java.lang.String r5 = "Interceptor '"
            if (r3 != r4) goto Lbc
            java.lang.Object r3 = r1.f7659b
            U2.l r4 = U2.l.f7685a
            if (r3 == r4) goto La1
            V2.i r1 = r1.f7668n
            V2.i r2 = r2.f7668n
            if (r1 != r2) goto L86
            return r12
        L86:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r5)
            r12.append(r0)
            java.lang.String r0 = "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead."
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r12 = r12.toString()
            r0.<init>(r12)
            throw r0
        La1:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r5)
            r12.append(r0)
            java.lang.String r0 = "' cannot set the request's data to null."
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r12 = r12.toString()
            r0.<init>(r12)
            throw r0
        Lbc:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r5)
            r12.append(r0)
            java.lang.String r0 = "' cannot modify the request's context."
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r12 = r12.toString()
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.k.c(s5.c):java.lang.Object");
    }
}
