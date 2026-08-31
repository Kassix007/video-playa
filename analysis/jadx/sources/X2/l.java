package x2;

import D2.n;
import J5.t;
import a.AbstractC0597a;
import android.webkit.MimeTypeMap;
import d6.p;
import d6.s;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import k3.C1186a;
import m5.AbstractC1362a;
import m5.C1376o;
import q6.A;
import q6.x;
import w2.C1864b;

/* JADX INFO: loaded from: classes.dex */
public final class l implements g {
    public static final d6.c f = new d6.c(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d6.c f18372g = new d6.c(true, false, -1, -1, false, false, false, -1, -1, true, false, false, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f18374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1376o f18375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1376o f18376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18377e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l(String str, n nVar, C1376o c1376o, C1376o c1376o2, boolean z5) {
        this.f18373a = str;
        this.f18374b = nVar;
        this.f18375c = c1376o;
        this.f18376d = c1376o2;
        this.f18377e = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String d(String str, p pVar) {
        String strB;
        String str2 = pVar != null ? pVar.f12377a : null;
        if ((str2 == null || t.G0(str2, "text/plain", false)) && (strB = H2.f.b(MimeTypeMap.getSingleton(), str)) != null) {
            return strB;
        }
        if (str2 != null) {
            return J5.m.j1(str2, ';');
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0202 A[Catch: Exception -> 0x01ff, TryCatch #1 {Exception -> 0x01ff, blocks: (B:93:0x01d3, B:95:0x01d9, B:99:0x01fb, B:103:0x0202, B:104:0x0207), top: B:118:0x01d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094 A[Catch: Exception -> 0x00ce, TRY_ENTER, TryCatch #2 {Exception -> 0x00ce, blocks: (B:36:0x0094, B:38:0x00a0, B:47:0x00d2, B:49:0x00d6, B:52:0x00ef, B:62:0x0137, B:54:0x0105, B:56:0x0111, B:57:0x011a, B:41:0x00b6, B:43:0x00c0, B:59:0x0122, B:60:0x0129, B:61:0x012a), top: B:119:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012a A[Catch: Exception -> 0x00ce, TryCatch #2 {Exception -> 0x00ce, blocks: (B:36:0x0094, B:38:0x00a0, B:47:0x00d2, B:49:0x00d6, B:52:0x00ef, B:62:0x0137, B:54:0x0105, B:56:0x0111, B:57:0x011a, B:41:0x00b6, B:43:0x00c0, B:59:0x0122, B:60:0x0129, B:61:0x012a), top: B:119:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d9 A[Catch: Exception -> 0x01ff, TryCatch #1 {Exception -> 0x01ff, blocks: (B:93:0x01d3, B:95:0x01d9, B:99:0x01fb, B:103:0x0202, B:104:0x0207), top: B:118:0x01d3 }] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, m5.h] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, m5.h] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, m5.h] */
    @Override // x2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(q5.InterfaceC1524c r15) throws java.lang.Exception {
        /*
            r14 = this;
            boolean r0 = r15 instanceof x2.k
            if (r0 == 0) goto L13
            r0 = r15
            x2.k r0 = (x2.k) r0
            int r1 = r0.f18371v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18371v = r1
            goto L1a
        L13:
            x2.k r0 = new x2.k
            s5.c r15 = (s5.c) r15
            r0.<init>(r14, r15)
        L1a:
            java.lang.Object r15 = r0.f18369t
            int r1 = r0.f18371v
            java.lang.String r2 = "response body == null"
            v2.e r3 = v2.EnumC1757e.f17527t
            v2.e r4 = v2.EnumC1757e.f17526s
            r5 = 2
            r6 = 1
            r7 = 0
            r5.a r8 = r5.EnumC1580a.f16356q
            if (r1 == 0) goto L57
            if (r1 == r6) goto L47
            if (r1 != r5) goto L3f
            java.lang.Object r1 = r0.f18368s
            d6.u r1 = (d6.u) r1
            k3.a r5 = r0.f18367r
            x2.l r0 = r0.f18366q
            m5.AbstractC1362a.e(r15)     // Catch: java.lang.Exception -> L3c
            goto L1d1
        L3c:
            r15 = move-exception
            goto L20c
        L3f:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L47:
            java.lang.Object r1 = r0.f18368s
            C2.d r1 = (C2.d) r1
            k3.a r6 = r0.f18367r
            x2.l r9 = r0.f18366q
            m5.AbstractC1362a.e(r15)     // Catch: java.lang.Exception -> L54
            goto L151
        L54:
            r15 = move-exception
            goto L219
        L57:
            m5.AbstractC1362a.e(r15)
            D2.n r15 = r14.f18374b
            D2.b r1 = r15.f1431n
            boolean r1 = r1.f1363q
            java.lang.String r9 = r14.f18373a
            if (r1 == 0) goto L91
            m5.o r1 = r14.f18376d
            java.lang.Object r1 = r1.getValue()
            w2.g r1 = (w2.g) r1
            if (r1 == 0) goto L91
            java.lang.String r15 = r15.i
            if (r15 != 0) goto L73
            r15 = r9
        L73:
            w2.e r1 = r1.f18281b
            q6.j r10 = q6.C1541j.f16064t
            q6.j r15 = O3.B.h(r15)
            java.lang.String r10 = "SHA-256"
            q6.j r15 = r15.b(r10)
            java.lang.String r15 = r15.d()
            w2.b r15 = r1.c(r15)
            if (r15 == 0) goto L91
            k3.a r1 = new k3.a
            r1.<init>(r6, r15)
            goto L92
        L91:
            r1 = r7
        L92:
            if (r1 == 0) goto L12a
            q6.l r15 = r14.c()     // Catch: java.lang.Exception -> Lce
            java.lang.Object r10 = r1.f14114r     // Catch: java.lang.Exception -> Lce
            w2.b r10 = (w2.C1864b) r10     // Catch: java.lang.Exception -> Lce
            boolean r11 = r10.f18258r     // Catch: java.lang.Exception -> Lce
            if (r11 != 0) goto L122
            w2.a r10 = r10.f18257q     // Catch: java.lang.Exception -> Lce
            java.util.ArrayList r10 = r10.f18252c     // Catch: java.lang.Exception -> Lce
            r11 = 0
            java.lang.Object r10 = r10.get(r11)     // Catch: java.lang.Exception -> Lce
            q6.x r10 = (q6.x) r10     // Catch: java.lang.Exception -> Lce
            e1.e r15 = r15.G(r10)     // Catch: java.lang.Exception -> Lce
            java.lang.Object r15 = r15.f12515e     // Catch: java.lang.Exception -> Lce
            java.lang.Long r15 = (java.lang.Long) r15     // Catch: java.lang.Exception -> Lce
            if (r15 != 0) goto Lb6
            goto Ld2
        Lb6:
            long r10 = r15.longValue()     // Catch: java.lang.Exception -> Lce
            r12 = 0
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 != 0) goto Ld2
            x2.m r15 = new x2.m     // Catch: java.lang.Exception -> Lce
            v2.k r0 = r14.g(r1)     // Catch: java.lang.Exception -> Lce
            java.lang.String r2 = d(r9, r7)     // Catch: java.lang.Exception -> Lce
            r15.<init>(r0, r2, r4)     // Catch: java.lang.Exception -> Lce
            return r15
        Lce:
            r15 = move-exception
            r6 = r1
            goto L219
        Ld2:
            boolean r15 = r14.f18377e     // Catch: java.lang.Exception -> Lce
            if (r15 == 0) goto L105
            C2.c r15 = new C2.c     // Catch: java.lang.Exception -> Lce
            d6.s r10 = r14.e()     // Catch: java.lang.Exception -> Lce
            C2.b r11 = r14.f(r1)     // Catch: java.lang.Exception -> Lce
            r15.<init>(r10, r11)     // Catch: java.lang.Exception -> Lce
            C2.d r15 = r15.a()     // Catch: java.lang.Exception -> Lce
            C2.b r10 = r15.f1180b     // Catch: java.lang.Exception -> Lce
            d6.s r11 = r15.f1179a     // Catch: java.lang.Exception -> Lce
            if (r11 != 0) goto L137
            if (r10 == 0) goto L137
            x2.m r15 = new x2.m     // Catch: java.lang.Exception -> Lce
            v2.k r0 = r14.g(r1)     // Catch: java.lang.Exception -> Lce
            java.lang.Object r2 = r10.f1167b     // Catch: java.lang.Exception -> Lce
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Exception -> Lce
            d6.p r2 = (d6.p) r2     // Catch: java.lang.Exception -> Lce
            java.lang.String r2 = d(r9, r2)     // Catch: java.lang.Exception -> Lce
            r15.<init>(r0, r2, r4)     // Catch: java.lang.Exception -> Lce
            return r15
        L105:
            x2.m r15 = new x2.m     // Catch: java.lang.Exception -> Lce
            v2.k r0 = r14.g(r1)     // Catch: java.lang.Exception -> Lce
            C2.b r2 = r14.f(r1)     // Catch: java.lang.Exception -> Lce
            if (r2 == 0) goto L11a
            java.lang.Object r2 = r2.f1167b     // Catch: java.lang.Exception -> Lce
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Exception -> Lce
            r7 = r2
            d6.p r7 = (d6.p) r7     // Catch: java.lang.Exception -> Lce
        L11a:
            java.lang.String r2 = d(r9, r7)     // Catch: java.lang.Exception -> Lce
            r15.<init>(r0, r2, r4)     // Catch: java.lang.Exception -> Lce
            return r15
        L122:
            java.lang.String r15 = "snapshot is closed"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> Lce
            r0.<init>(r15)     // Catch: java.lang.Exception -> Lce
            throw r0     // Catch: java.lang.Exception -> Lce
        L12a:
            C2.c r15 = new C2.c     // Catch: java.lang.Exception -> Lce
            d6.s r9 = r14.e()     // Catch: java.lang.Exception -> Lce
            r15.<init>(r9, r7)     // Catch: java.lang.Exception -> Lce
            C2.d r15 = r15.a()     // Catch: java.lang.Exception -> Lce
        L137:
            d6.s r9 = r15.f1179a     // Catch: java.lang.Exception -> Lce
            kotlin.jvm.internal.m.b(r9)     // Catch: java.lang.Exception -> Lce
            r0.f18366q = r14     // Catch: java.lang.Exception -> Lce
            r0.f18367r = r1     // Catch: java.lang.Exception -> Lce
            r0.f18368s = r15     // Catch: java.lang.Exception -> Lce
            r0.f18371v = r6     // Catch: java.lang.Exception -> Lce
            java.lang.Object r6 = r14.b(r9, r0)     // Catch: java.lang.Exception -> Lce
            if (r6 != r8) goto L14c
            goto L1cc
        L14c:
            r9 = r1
            r1 = r15
            r15 = r6
            r6 = r9
            r9 = r14
        L151:
            d6.u r15 = (d6.u) r15     // Catch: java.lang.Exception -> L54
            android.graphics.Bitmap$Config[] r10 = H2.f.f2137a     // Catch: java.lang.Exception -> L54
            d6.w r10 = r15.f12438w     // Catch: java.lang.Exception -> L54
            if (r10 == 0) goto L213
            d6.s r11 = r1.f1179a     // Catch: java.lang.Exception -> L208
            C2.b r1 = r1.f1180b     // Catch: java.lang.Exception -> L208
            k3.a r1 = r9.h(r6, r11, r15, r1)     // Catch: java.lang.Exception -> L208
            java.lang.String r6 = r9.f18373a
            if (r1 == 0) goto L18a
            x2.m r0 = new x2.m     // Catch: java.lang.Exception -> L188
            v2.k r2 = r9.g(r1)     // Catch: java.lang.Exception -> L188
            C2.b r4 = r9.f(r1)     // Catch: java.lang.Exception -> L188
            if (r4 == 0) goto L180
            java.lang.Object r4 = r4.f1167b     // Catch: java.lang.Exception -> L188
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Exception -> L188
            r7 = r4
            d6.p r7 = (d6.p) r7     // Catch: java.lang.Exception -> L188
            goto L180
        L17b:
            r5 = r1
        L17c:
            r1 = r15
            r15 = r0
            goto L20c
        L180:
            java.lang.String r4 = d(r6, r7)     // Catch: java.lang.Exception -> L188
            r0.<init>(r2, r4, r3)     // Catch: java.lang.Exception -> L188
            return r0
        L188:
            r0 = move-exception
            goto L17b
        L18a:
            q6.i r11 = r10.O()     // Catch: java.lang.Exception -> L188
            r12 = 1
            boolean r11 = r11.o(r12)     // Catch: java.lang.Exception -> L188
            if (r11 == 0) goto L1b7
            x2.m r0 = new x2.m     // Catch: java.lang.Exception -> L188
            q6.i r2 = r10.O()     // Catch: java.lang.Exception -> L188
            D2.n r5 = r9.f18374b     // Catch: java.lang.Exception -> L188
            android.content.Context r5 = r5.f1421a     // Catch: java.lang.Exception -> L188
            v2.m r5 = new v2.m     // Catch: java.lang.Exception -> L188
            r5.<init>(r2, r7)     // Catch: java.lang.Exception -> L188
            d6.p r2 = r10.b()     // Catch: java.lang.Exception -> L188
            java.lang.String r2 = d(r6, r2)     // Catch: java.lang.Exception -> L188
            d6.u r6 = r15.f12439x     // Catch: java.lang.Exception -> L188
            if (r6 == 0) goto L1b2
            goto L1b3
        L1b2:
            r3 = r4
        L1b3:
            r0.<init>(r5, r2, r3)     // Catch: java.lang.Exception -> L188
            return r0
        L1b7:
            H2.f.a(r15)     // Catch: java.lang.Exception -> L188
            d6.s r6 = r9.e()     // Catch: java.lang.Exception -> L188
            r0.f18366q = r9     // Catch: java.lang.Exception -> L188
            r0.f18367r = r1     // Catch: java.lang.Exception -> L188
            r0.f18368s = r15     // Catch: java.lang.Exception -> L188
            r0.f18371v = r5     // Catch: java.lang.Exception -> L188
            java.lang.Object r0 = r9.b(r6, r0)     // Catch: java.lang.Exception -> L188
            if (r0 != r8) goto L1cd
        L1cc:
            return r8
        L1cd:
            r5 = r1
            r1 = r15
            r15 = r0
            r0 = r9
        L1d1:
            d6.u r15 = (d6.u) r15     // Catch: java.lang.Exception -> L3c
            android.graphics.Bitmap$Config[] r1 = H2.f.f2137a     // Catch: java.lang.Exception -> L1ff
            d6.w r1 = r15.f12438w     // Catch: java.lang.Exception -> L1ff
            if (r1 == 0) goto L202
            x2.m r2 = new x2.m     // Catch: java.lang.Exception -> L1ff
            r0.getClass()     // Catch: java.lang.Exception -> L1ff
            q6.i r6 = r1.O()     // Catch: java.lang.Exception -> L1ff
            D2.n r8 = r0.f18374b     // Catch: java.lang.Exception -> L1ff
            android.content.Context r8 = r8.f1421a     // Catch: java.lang.Exception -> L1ff
            v2.m r8 = new v2.m     // Catch: java.lang.Exception -> L1ff
            r8.<init>(r6, r7)     // Catch: java.lang.Exception -> L1ff
            java.lang.String r0 = r0.f18373a     // Catch: java.lang.Exception -> L1ff
            d6.p r1 = r1.b()     // Catch: java.lang.Exception -> L1ff
            java.lang.String r0 = d(r0, r1)     // Catch: java.lang.Exception -> L1ff
            d6.u r1 = r15.f12439x     // Catch: java.lang.Exception -> L1ff
            if (r1 == 0) goto L1fa
            goto L1fb
        L1fa:
            r3 = r4
        L1fb:
            r2.<init>(r8, r0, r3)     // Catch: java.lang.Exception -> L1ff
            return r2
        L1ff:
            r0 = move-exception
            goto L17c
        L202:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L1ff
            r0.<init>(r2)     // Catch: java.lang.Exception -> L1ff
            throw r0     // Catch: java.lang.Exception -> L1ff
        L208:
            r0 = move-exception
            r1 = r15
            r15 = r0
            r5 = r6
        L20c:
            H2.f.a(r1)     // Catch: java.lang.Exception -> L210
            throw r15     // Catch: java.lang.Exception -> L210
        L210:
            r15 = move-exception
            r6 = r5
            goto L219
        L213:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L54
            r15.<init>(r2)     // Catch: java.lang.Exception -> L54
            throw r15     // Catch: java.lang.Exception -> L54
        L219:
            if (r6 == 0) goto L21e
            H2.f.a(r6)
        L21e:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.l.a(q5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(d6.s r6, s5.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof x2.j
            if (r0 == 0) goto L13
            r0 = r7
            x2.j r0 = (x2.j) r0
            int r1 = r0.f18365s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18365s = r1
            goto L18
        L13:
            x2.j r0 = new x2.j
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f18363q
            r5.a r1 = r5.EnumC1580a.f16356q
            int r2 = r0.f18365s
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            m5.AbstractC1362a.e(r7)
            goto Le9
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            m5.AbstractC1362a.e(r7)
            android.graphics.Bitmap$Config[] r7 = H2.f.f2137a
            android.os.Looper r7 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            boolean r7 = kotlin.jvm.internal.m.a(r7, r2)
            r2 = 0
            if (r7 == 0) goto Lb2
            D2.n r7 = r5.f18374b
            D2.b r7 = r7.f1432o
            boolean r7 = r7.f1363q
            if (r7 != 0) goto Lac
            m5.o r7 = r5.f18375c
            java.lang.Object r7 = r7.getValue()
            d6.d r7 = (d6.d) r7
            d6.q r7 = (d6.q) r7
            r7.getClass()
            java.lang.String r0 = "request"
            kotlin.jvm.internal.m.e(r6, r0)
            h6.h r0 = new h6.h
            r0.<init>(r7, r6)
            java.util.concurrent.atomic.AtomicBoolean r6 = r0.f13493u
            boolean r6 = r6.compareAndSet(r2, r3)
            if (r6 == 0) goto La4
            h6.g r6 = r0.f13492t
            r6.h()
            l6.m r6 = l6.m.f14610a
            l6.m r6 = l6.m.f14610a
            java.lang.Object r6 = r6.g()
            r0.f13494v = r6
            E.c0 r6 = r7.f12395q     // Catch: java.lang.Throwable -> L93
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L93
            java.lang.Object r1 = r6.f1555t     // Catch: java.lang.Throwable -> L95
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> L95
            r1.add(r0)     // Catch: java.lang.Throwable -> L95
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L93
            d6.u r6 = r0.g()     // Catch: java.lang.Throwable -> L93
            E.c0 r7 = r7.f12395q
            java.lang.Object r1 = r7.f1555t
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1
            r7.i(r1, r0)
            goto Lec
        L93:
            r6 = move-exception
            goto L98
        L95:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L95
            throw r7     // Catch: java.lang.Throwable -> L93
        L98:
            d6.q r7 = r0.f13489q
            E.c0 r7 = r7.f12395q
            java.lang.Object r1 = r7.f1555t
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1
            r7.i(r1, r0)
            throw r6
        La4:
            java.lang.String r6 = "Already Executed"
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r6)
            throw r7
        Lac:
            android.os.NetworkOnMainThreadException r6 = new android.os.NetworkOnMainThreadException
            r6.<init>()
            throw r6
        Lb2:
            m5.o r7 = r5.f18375c
            java.lang.Object r7 = r7.getValue()
            d6.d r7 = (d6.d) r7
            d6.q r7 = (d6.q) r7
            r7.getClass()
            java.lang.String r4 = "request"
            kotlin.jvm.internal.m.e(r6, r4)
            h6.h r4 = new h6.h
            r4.<init>(r7, r6)
            r0.f18365s = r3
            M5.h r6 = new M5.h
            q5.c r7 = n5.AbstractC1397A.v(r0)
            r6.<init>(r3, r7)
            r6.s()
            H2.g r7 = new H2.g
            r7.<init>(r4, r6, r2)
            r4.e(r7)
            r6.u(r7)
            java.lang.Object r7 = r6.r()
            if (r7 != r1) goto Le9
            return r1
        Le9:
            r6 = r7
            d6.u r6 = (d6.u) r6
        Lec:
            int r7 = r6.f12435t
            r0 = 200(0xc8, float:2.8E-43)
            if (r0 > r7) goto Lf7
            r0 = 300(0x12c, float:4.2E-43)
            if (r7 >= r0) goto Lf7
            goto L122
        Lf7:
            r0 = 304(0x130, float:4.26E-43)
            if (r7 == r0) goto L122
            d6.w r7 = r6.f12438w
            if (r7 == 0) goto L102
            H2.f.a(r7)
        L102:
            C2.e r7 = new C2.e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HTTP "
            r0.<init>(r1)
            int r1 = r6.f12435t
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.String r6 = r6.f12434s
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L122:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.l.b(d6.s, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q6.l c() {
        Object value = this.f18376d.getValue();
        kotlin.jvm.internal.m.b(value);
        return ((w2.g) value).f18280a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final s e() {
        L0.l lVar = new L0.l();
        lVar.u(this.f18373a);
        n nVar = this.f18374b;
        d6.l headers = nVar.j;
        kotlin.jvm.internal.m.e(headers, "headers");
        lVar.f3127d = headers.h();
        for (Map.Entry entry : nVar.f1428k.f1443a.entrySet()) {
            Object key = entry.getKey();
            kotlin.jvm.internal.m.c(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            Class cls = (Class) key;
            Object value = entry.getValue();
            if (value == null) {
                ((LinkedHashMap) lVar.f3124a).remove(cls);
            } else {
                if (((LinkedHashMap) lVar.f3124a).isEmpty()) {
                    lVar.f3124a = new LinkedHashMap();
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) lVar.f3124a;
                Object objCast = cls.cast(value);
                kotlin.jvm.internal.m.b(objCast);
                linkedHashMap.put(cls, objCast);
            }
        }
        D2.b bVar = nVar.f1431n;
        boolean z5 = bVar.f1363q;
        boolean z6 = nVar.f1432o.f1363q;
        if (!z6 && z5) {
            lVar.d(d6.c.f12306o);
        } else if (!z6 || z5) {
            if (!z6 && !z5) {
                lVar.d(f18372g);
            }
        } else if (bVar.f1364r) {
            lVar.d(d6.c.f12305n);
        } else {
            lVar.d(f);
        }
        return lVar.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C2.b f(C1186a c1186a) throws Throwable {
        Throwable th;
        C2.b bVar;
        try {
            q6.l lVarC = c();
            C1864b c1864b = (C1864b) c1186a.f14114r;
            if (c1864b.f18258r) {
                throw new IllegalStateException("snapshot is closed");
            }
            A aJ = AbstractC0597a.j(lVarC.a0((x) c1864b.f18257q.f18252c.get(0)));
            try {
                bVar = new C2.b(aJ);
                try {
                    aJ.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    aJ.close();
                } catch (Throwable th4) {
                    AbstractC1362a.a(th3, th4);
                }
                th = th3;
                bVar = null;
            }
            if (th == null) {
                return bVar;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final v2.k g(C1186a c1186a) {
        C1864b c1864b = (C1864b) c1186a.f14114r;
        if (c1864b.f18258r) {
            throw new IllegalStateException("snapshot is closed");
        }
        x xVar = (x) c1864b.f18257q.f18252c.get(1);
        q6.l lVarC = c();
        String str = this.f18374b.i;
        if (str == null) {
            str = this.f18373a;
        }
        return new v2.k(xVar, lVarC, str, c1186a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k3.C1186a h(k3.C1186a r4, d6.s r5, d6.u r6, C2.b r7) {
        /*
            r3 = this;
            D2.n r0 = r3.f18374b
            D2.b r0 = r0.f1431n
            boolean r0 = r0.f1364r
            r1 = 0
            if (r0 == 0) goto L15e
            boolean r0 = r3.f18377e
            if (r0 == 0) goto L37
            d6.c r5 = r5.a()
            boolean r5 = r5.f12308b
            if (r5 != 0) goto L15e
            d6.c r5 = r6.f12431D
            if (r5 != 0) goto L23
            d6.c r5 = d6.c.f12305n
            d6.l r5 = r6.f12437v
            d6.c r5 = Q2.g.J(r5)
            r6.f12431D = r5
        L23:
            boolean r5 = r5.f12308b
            if (r5 != 0) goto L15e
            d6.l r5 = r6.f12437v
            java.lang.String r0 = "Vary"
            java.lang.String r5 = r5.d(r0)
            java.lang.String r0 = "*"
            boolean r5 = kotlin.jvm.internal.m.a(r5, r0)
            if (r5 != 0) goto L15e
        L37:
            r5 = 16
            if (r4 == 0) goto L59
            java.lang.Object r4 = r4.f14114r
            w2.b r4 = (w2.C1864b) r4
            w2.e r0 = r4.f18259s
            monitor-enter(r0)
            r4.close()     // Catch: java.lang.Throwable -> L56
            w2.a r4 = r4.f18257q     // Catch: java.lang.Throwable -> L56
            java.lang.String r4 = r4.f18250a     // Catch: java.lang.Throwable -> L56
            K2.a r4 = r0.b(r4)     // Catch: java.lang.Throwable -> L56
            monitor-exit(r0)
            if (r4 == 0) goto L89
            i3.a r0 = new i3.a
            r0.<init>(r5, r4)
            goto L8a
        L56:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        L59:
            m5.o r4 = r3.f18376d
            java.lang.Object r4 = r4.getValue()
            w2.g r4 = (w2.g) r4
            if (r4 == 0) goto L89
            D2.n r0 = r3.f18374b
            java.lang.String r0 = r0.i
            if (r0 != 0) goto L6b
            java.lang.String r0 = r3.f18373a
        L6b:
            w2.e r4 = r4.f18281b
            q6.j r2 = q6.C1541j.f16064t
            q6.j r0 = O3.B.h(r0)
            java.lang.String r2 = "SHA-256"
            q6.j r0 = r0.b(r2)
            java.lang.String r0 = r0.d()
            K2.a r4 = r4.b(r0)
            if (r4 == 0) goto L89
            i3.a r0 = new i3.a
            r0.<init>(r5, r4)
            goto L8a
        L89:
            r0 = r1
        L8a:
            if (r0 != 0) goto L8e
            goto L163
        L8e:
            r4 = 0
            int r5 = r6.f12435t     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
            r2 = 304(0x130, float:4.26E-43)
            if (r5 != r2) goto Le4
            if (r7 == 0) goto Le4
            d6.t r5 = r6.b()     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
            d6.l r7 = r7.f     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
            d6.l r2 = r6.f12437v     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
            d6.l r7 = C3.a.o(r7, r2)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
            c3.c r7 = r7.h()     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
            r5.f = r7     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
            d6.u r5 = r5.a()     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
            q6.l r7 = r3.c()     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
            java.lang.Object r2 = r0.f13562r     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
            K2.a r2 = (K2.a) r2     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
            q6.x r2 = r2.b(r4)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
            q6.E r7 = r7.W(r2, r4)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
            q6.z r7 = a.AbstractC0597a.i(r7)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
            C2.b r2 = new C2.b     // Catch: java.lang.Throwable -> Lcf
            r2.<init>(r5)     // Catch: java.lang.Throwable -> Lcf
            r2.a(r7)     // Catch: java.lang.Throwable -> Lcf
            r7.close()     // Catch: java.lang.Throwable -> Lcd
            goto Ld9
        Lcd:
            r1 = move-exception
            goto Ld9
        Lcf:
            r5 = move-exception
            r1 = r5
            r7.close()     // Catch: java.lang.Throwable -> Ld5
            goto Ld9
        Ld5:
            r5 = move-exception
            m5.AbstractC1362a.a(r1, r5)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
        Ld9:
            if (r1 != 0) goto Ldd
            goto L146
        Ldd:
            throw r1     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
        Lde:
            r4 = move-exception
            goto L15a
        Le1:
            r5 = move-exception
            goto L150
        Le4:
            q6.l r5 = r3.c()     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
            java.lang.Object r7 = r0.f13562r     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
            K2.a r7 = (K2.a) r7     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
            q6.x r7 = r7.b(r4)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
            q6.E r5 = r5.W(r7, r4)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
            q6.z r5 = a.AbstractC0597a.i(r5)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
            C2.b r7 = new C2.b     // Catch: java.lang.Throwable -> L107
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L107
            r7.a(r5)     // Catch: java.lang.Throwable -> L107
            r5.close()     // Catch: java.lang.Throwable -> L105
            r5 = r1
            goto L111
        L105:
            r5 = move-exception
            goto L111
        L107:
            r7 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L10c
            goto L110
        L10c:
            r5 = move-exception
            m5.AbstractC1362a.a(r7, r5)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
        L110:
            r5 = r7
        L111:
            if (r5 != 0) goto L14f
            q6.l r5 = r3.c()     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
            java.lang.Object r7 = r0.f13562r     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
            K2.a r7 = (K2.a) r7     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
            r2 = 1
            q6.x r7 = r7.b(r2)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
            q6.E r5 = r5.W(r7, r4)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
            q6.z r5 = a.AbstractC0597a.i(r5)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
            d6.w r7 = r6.f12438w     // Catch: java.lang.Throwable -> L13a
            kotlin.jvm.internal.m.b(r7)     // Catch: java.lang.Throwable -> L13a
            q6.i r7 = r7.O()     // Catch: java.lang.Throwable -> L13a
            r7.T(r5)     // Catch: java.lang.Throwable -> L13a
            r5.close()     // Catch: java.lang.Throwable -> L138
            goto L144
        L138:
            r1 = move-exception
            goto L144
        L13a:
            r7 = move-exception
            r1 = r7
            r5.close()     // Catch: java.lang.Throwable -> L140
            goto L144
        L140:
            r5 = move-exception
            m5.AbstractC1362a.a(r1, r5)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
        L144:
            if (r1 != 0) goto L14e
        L146:
            k3.a r4 = r0.k()     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
            H2.f.a(r6)
            return r4
        L14e:
            throw r1     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
        L14f:
            throw r5     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le1
        L150:
            android.graphics.Bitmap$Config[] r7 = H2.f.f2137a     // Catch: java.lang.Throwable -> Lde
            java.lang.Object r7 = r0.f13562r     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> L159
            K2.a r7 = (K2.a) r7     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> L159
            r7.a(r4)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> L159
        L159:
            throw r5     // Catch: java.lang.Throwable -> Lde
        L15a:
            H2.f.a(r6)
            throw r4
        L15e:
            if (r4 == 0) goto L163
            H2.f.a(r4)
        L163:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.l.h(k3.a, d6.s, d6.u, C2.b):k3.a");
    }
}
