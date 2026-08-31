package k3;

import B2.g;
import B2.h;
import C0.S;
import E.M;
import E.N;
import E.O;
import E1.l;
import I2.B;
import I2.i;
import I2.q;
import I2.y;
import M.u0;
import M5.AbstractC0263y;
import M5.InterfaceC0261w;
import O3.C0271b1;
import O3.C0288h0;
import O3.C0323t0;
import O3.D;
import O3.E1;
import O3.G0;
import O3.J0;
import O3.T1;
import O3.X;
import O3.X1;
import O3.Y;
import O3.Z;
import P.C0345b;
import P.C0354f0;
import P.S0;
import R4.W1;
import S0.k;
import U2.n;
import Y2.j;
import a.AbstractC0597a;
import a0.AbstractC0606h;
import a0.r;
import a3.C0625d;
import android.app.ActivityManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import d2.AbstractC0960G;
import d2.C0961H;
import d2.f0;
import j0.p;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import m5.C1371j;
import q6.C1541j;
import q6.x;
import s4.e;
import u.A0;
import u.AbstractC1644d;
import u.C1658l;
import u.C1659m;
import x3.C1899k;

/* JADX INFO: loaded from: classes.dex */
public final class c implements h, p, X1, Z, W1, f0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f14120q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [C.A.<init>(int, int):void, D5.a.l(Q2.t, s5.c):d6.s, O3.E1.<init>(O3.t0):void, O3.T1.y(O3.c0):void, O3.b1.<init>(O3.t0):void, Q2.q.c(Q2.q, K2.h, Q2.u, Q2.u, s5.c):java.lang.Object, a3.l.call():java.lang.Object, androidx.core.widget.NestedScrollView.<init>(android.content.Context, android.util.AttributeSet):void, androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void, com.google.android.material.datepicker.l.t(android.view.LayoutInflater, android.view.ViewGroup):android.view.View, d2.G.<init>():void, e0.c.m(int, I0.m):void, k3.c.v(java.lang.String):k3.c] */
    public /* synthetic */ c(Object obj) {
        this.f14120q = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String d(String str, EnumC1187b enumC1187b, boolean z5) {
        String strConcat = enumC1187b.f14119q;
        if (z5) {
            strConcat = ".temp".concat(strConcat);
        }
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strConcat.length();
        if (strReplaceAll.length() > length) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(strReplaceAll.getBytes());
                StringBuilder sb = new StringBuilder();
                for (byte b7 : bArrDigest) {
                    sb.append(String.format("%02x", Byte.valueOf(b7)));
                }
                strReplaceAll = sb.toString();
            } catch (NoSuchAlgorithmException unused) {
                strReplaceAll = strReplaceAll.substring(0, length);
            }
        }
        return S.n("lottie_cache_", strReplaceAll, strConcat);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static c v(String str) {
        return new c((TextUtils.isEmpty(str) || str.length() > 1) ? G0.UNINITIALIZED : J0.e(str.charAt(0)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B2.h
    public void a(B2.a aVar, Bitmap bitmap, Map map) {
        ((g) this.f14120q).c(aVar, bitmap, map, AbstractC0597a.y(bitmap));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j0.p
    public long b() {
        return ((u0) this.f14120q).f3628c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long c() {
        return ((C1541j) this.f14120q).c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.Z
    public /* synthetic */ void e(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((T1) this.f14120q).z(str, i, th, bArr, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.f0
    public int f() {
        AbstractC0960G abstractC0960G = (AbstractC0960G) this.f14120q;
        return abstractC0960G.f11988o - abstractC0960G.D();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B2.h
    public B2.b g(B2.a aVar) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.f0
    public int h(View view) {
        return (view.getTop() - ((C0961H) view.getLayoutParams()).f11990b.top) - ((ViewGroup.MarginLayoutParams) ((C0961H) view.getLayoutParams())).topMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v16, resolved type: java.lang.Boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: java.lang.Boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: java.lang.Boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r6v25, resolved type: I2.a */
    /* JADX DEBUG: Multi-variable search result rejected for r6v7, resolved type: I2.a */
    /* JADX DEBUG: Multi-variable search result rejected for r6v8, resolved type: I2.a */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ec, code lost:
    
        if (r1.equals(r20.toString()) != false) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d4 A[PHI: r2
  0x00d4: PHI (r2v10 P2.b) = (r2v4 P2.b), (r2v4 P2.b), (r2v11 P2.b) binds: [B:132:0x01c4, B:127:0x01b9, B:62:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public P2.b i(U2.g r18, P2.a r19, V2.h r20, V2.g r21) {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            U2.b r3 = r0.f7664h
            V2.d r4 = r0.f7670p
            boolean r3 = r3.f7628q
            if (r3 != 0) goto L14
            r3 = r17
            r16 = 0
            goto L1ca
        L14:
            r3 = r17
            java.lang.Object r6 = r3.f14120q
            I2.y r6 = (I2.y) r6
            I2.t r6 = r6.f2404a
            m5.o r6 = r6.f2380c
            java.lang.Object r6 = r6.getValue()
            P2.c r6 = (P2.c) r6
            if (r6 == 0) goto L9f
            java.lang.Object r7 = r6.f5620c
            monitor-enter(r7)
            P2.f r8 = r6.f5618a     // Catch: java.lang.Throwable -> L74
            P2.b r8 = r8.i(r1)     // Catch: java.lang.Throwable -> L74
            r9 = 0
            if (r8 != 0) goto L76
            B2.g r8 = r6.f5619b     // Catch: java.lang.Throwable -> L74
            java.util.LinkedHashMap r10 = r8.f549a     // Catch: java.lang.Throwable -> L74
            java.lang.Object r10 = r10.get(r1)     // Catch: java.lang.Throwable -> L74
            java.util.ArrayList r10 = (java.util.ArrayList) r10     // Catch: java.lang.Throwable -> L74
            r11 = 0
            if (r10 != 0) goto L43
            r16 = 0
        L41:
            r8 = r11
            goto L78
        L43:
            int r12 = r10.size()     // Catch: java.lang.Throwable -> L74
            r13 = r9
        L48:
            if (r13 >= r12) goto L6e
            java.lang.Object r14 = r10.get(r13)     // Catch: java.lang.Throwable -> L74
            P2.e r14 = (P2.e) r14     // Catch: java.lang.Throwable -> L74
            java.lang.ref.WeakReference r15 = r14.f5624a     // Catch: java.lang.Throwable -> L74
            java.lang.Object r15 = r15.get()     // Catch: java.lang.Throwable -> L74
            I2.n r15 = (I2.n) r15     // Catch: java.lang.Throwable -> L74
            if (r15 == 0) goto L64
            r16 = 0
            P2.b r5 = new P2.b     // Catch: java.lang.Throwable -> L74
            java.util.Map r14 = r14.f5625b     // Catch: java.lang.Throwable -> L74
            r5.<init>(r15, r14)     // Catch: java.lang.Throwable -> L74
            goto L67
        L64:
            r16 = 0
            r5 = r11
        L67:
            if (r5 == 0) goto L6b
            r11 = r5
            goto L70
        L6b:
            int r13 = r13 + 1
            goto L48
        L6e:
            r16 = 0
        L70:
            r8.b()     // Catch: java.lang.Throwable -> L74
            goto L41
        L74:
            r0 = move-exception
            goto L9d
        L76:
            r16 = 0
        L78:
            if (r8 == 0) goto L9b
            I2.n r5 = r8.f5616a     // Catch: java.lang.Throwable -> L74
            boolean r5 = r5.d()     // Catch: java.lang.Throwable -> L74
            if (r5 != 0) goto L9b
            java.lang.Object r5 = r6.f5620c     // Catch: java.lang.Throwable -> L74
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L74
            P2.f r10 = r6.f5618a     // Catch: java.lang.Throwable -> L98
            boolean r10 = r10.e(r1)     // Catch: java.lang.Throwable -> L98
            B2.g r6 = r6.f5619b     // Catch: java.lang.Throwable -> L98
            java.util.LinkedHashMap r6 = r6.f549a     // Catch: java.lang.Throwable -> L98
            java.lang.Object r6 = r6.remove(r1)     // Catch: java.lang.Throwable -> L98
            if (r6 == 0) goto L96
            r9 = 1
        L96:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L74
            goto L9b
        L98:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L74
            throw r0     // Catch: java.lang.Throwable -> L74
        L9b:
            monitor-exit(r7)
            goto La3
        L9d:
            monitor-exit(r7)
            throw r0
        L9f:
            r16 = 0
            r8 = r16
        La3:
            if (r8 == 0) goto L1ca
            I2.n r5 = r8.f5616a
            boolean r6 = r5 instanceof I2.C0167a
            if (r6 == 0) goto Laf
            r6 = r5
            I2.a r6 = (I2.C0167a) r6
            goto Lb1
        Laf:
            r6 = r16
        Lb1:
            if (r6 != 0) goto Lb4
            goto Ld7
        Lb4:
            android.graphics.Bitmap r6 = r6.f2339a
            android.graphics.Bitmap$Config r6 = r6.getConfig()
            if (r6 != 0) goto Lbe
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
        Lbe:
            boolean r6 = l6.d.v(r6)
            if (r6 != 0) goto Lc5
            goto Ld7
        Lc5:
            I2.l r6 = U2.i.f7682e
            java.lang.Object r6 = I2.q.d(r0, r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto Ld7
        Ld3:
            r2 = r8
        Ld4:
            r7 = 0
            goto L1c7
        Ld7:
            java.util.Map r1 = r1.f5615b
            java.lang.String r6 = "coil#size"
            java.lang.Object r1 = r1.get(r6)
            java.lang.String r1 = (java.lang.String) r1
            r6 = 1
            if (r1 == 0) goto Lf1
            java.lang.String r0 = r2.toString()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld3
        Lee:
            r2 = r8
            goto L1c6
        Lf1:
            java.util.Map r1 = r8.f5617b
            java.lang.String r9 = "coil#is_sampled"
            java.lang.Object r1 = r1.get(r9)
            boolean r9 = r1 instanceof java.lang.Boolean
            if (r9 == 0) goto L100
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            goto L102
        L100:
            r1 = r16
        L102:
            if (r1 == 0) goto L109
            boolean r1 = r1.booleanValue()
            goto L10a
        L109:
            r1 = 0
        L10a:
            if (r1 != 0) goto L119
            V2.h r1 = V2.h.f7964c
            boolean r1 = kotlin.jvm.internal.m.a(r2, r1)
            if (r1 != 0) goto Lee
            V2.d r1 = V2.d.f7960r
            if (r4 != r1) goto L119
            goto Lee
        L119:
            int r1 = r5.b()
            int r9 = r5.a()
            boolean r5 = r5 instanceof I2.C0167a
            if (r5 == 0) goto L12e
            I2.l r5 = U2.h.f7675b
            java.lang.Object r0 = I2.q.d(r0, r5)
            V2.h r0 = (V2.h) r0
            goto L130
        L12e:
            V2.h r0 = V2.h.f7964c
        L130:
            V2.c r5 = r2.f7965a
            boolean r10 = r5 instanceof V2.a
            r11 = 2147483647(0x7fffffff, float:NaN)
            if (r10 == 0) goto L13e
            V2.a r5 = (V2.a) r5
            int r5 = r5.f7957a
            goto L13f
        L13e:
            r5 = r11
        L13f:
            V2.c r10 = r0.f7965a
            boolean r12 = r10 instanceof V2.a
            if (r12 == 0) goto L14a
            V2.a r10 = (V2.a) r10
            int r10 = r10.f7957a
            goto L14b
        L14a:
            r10 = r11
        L14b:
            int r5 = java.lang.Math.min(r5, r10)
            V2.c r2 = r2.f7966b
            boolean r10 = r2 instanceof V2.a
            if (r10 == 0) goto L15a
            V2.a r2 = (V2.a) r2
            int r2 = r2.f7957a
            goto L15b
        L15a:
            r2 = r11
        L15b:
            V2.c r0 = r0.f7966b
            boolean r10 = r0 instanceof V2.a
            if (r10 == 0) goto L166
            V2.a r0 = (V2.a) r0
            int r0 = r0.f7957a
            goto L167
        L166:
            r0 = r11
        L167:
            int r0 = java.lang.Math.min(r2, r0)
            double r12 = (double) r5
            double r14 = (double) r1
            double r12 = r12 / r14
            double r14 = (double) r0
            r2 = r8
            double r7 = (double) r9
            double r14 = r14 / r7
            if (r5 == r11) goto L179
            if (r0 == r11) goto L179
            r7 = r21
            goto L17b
        L179:
            V2.g r7 = V2.g.f7962q
        L17b:
            int r7 = r7.ordinal()
            if (r7 == 0) goto L19a
            if (r7 != r6) goto L194
            int r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r7 >= 0) goto L18d
            int r5 = r5 - r1
            int r0 = java.lang.Math.abs(r5)
            goto L1aa
        L18d:
            int r0 = r0 - r9
            int r0 = java.lang.Math.abs(r0)
        L192:
            r12 = r14
            goto L1aa
        L194:
            C2.e r0 = new C2.e
            r0.<init>()
            throw r0
        L19a:
            int r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r7 <= 0) goto L1a4
            int r5 = r5 - r1
            int r0 = java.lang.Math.abs(r5)
            goto L1aa
        L1a4:
            int r0 = r0 - r9
            int r0 = java.lang.Math.abs(r0)
            goto L192
        L1aa:
            if (r0 > r6) goto L1ad
            goto L1c6
        L1ad:
            int r0 = r4.ordinal()
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r0 == 0) goto L1c2
            if (r0 != r6) goto L1bc
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 > 0) goto Ld4
            goto L1c6
        L1bc:
            C2.e r0 = new C2.e
            r0.<init>()
            throw r0
        L1c2:
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 != 0) goto Ld4
        L1c6:
            r7 = r6
        L1c7:
            if (r7 == 0) goto L1ca
            return r2
        L1ca:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.c.i(U2.g, P2.a, V2.h, V2.g):P2.b");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public File k(String str) {
        File file = new File(q(), d(str, EnumC1187b.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(q(), d(str, EnumC1187b.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(q(), d(str, EnumC1187b.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.f0
    public View l(int i) {
        return ((AbstractC0960G) this.f14120q).u(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public S0 m() {
        l lVarA = l.a();
        if (lVarA.b() == 1) {
            return new k(true);
        }
        C0354f0 c0354f0Q = C0345b.q(Boolean.FALSE);
        lVarA.g(new S0.g(c0354f0Q, this));
        return c0354f0Q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.f0
    public int n() {
        return ((AbstractC0960G) this.f14120q).G();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.f0
    public int o(View view) {
        return view.getBottom() + ((C0961H) view.getLayoutParams()).f11990b.bottom + ((ViewGroup.MarginLayoutParams) ((C0961H) view.getLayoutParams())).bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r4v21, 45, r5v18 */
    public P2.a p(U2.g gVar, Object obj, n nVar, i iVar) {
        String string;
        String strF;
        gVar.getClass();
        Map map = gVar.f7660c;
        List list = ((y) this.f14120q).f2406c.f2356c;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                C1371j c1371j = (C1371j) list.get(i);
                N2.a aVar = (N2.a) c1371j.f15080q;
                if (((f) ((H5.c) c1371j.f15081r)).d(obj)) {
                    m.c(aVar, "null cannot be cast to non-null type coil3.key.Keyer<kotlin.Any>");
                    switch (aVar.f4030a) {
                        case 0:
                            B b7 = (B) obj;
                            if (!m.a(b7.f2336c, "android.resource")) {
                                string = null;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append(b7);
                                sb.append(':');
                                Configuration configuration = nVar.f7686a.getResources().getConfiguration();
                                Bitmap.Config[] configArr = j.f8215a;
                                sb.append(configuration.uiMode & 48);
                                string = sb.toString();
                            }
                            break;
                        case 1:
                            B b8 = (B) obj;
                            String str = b8.f2336c;
                            if ((str == null || str.equals("file")) && b8.f2338e != null) {
                                Bitmap.Config[] configArr2 = j.f8215a;
                                if ((!m.a(b8.f2336c, "file") || !m.a(n5.l.m0(q.g(b8)), "android_asset")) && ((Boolean) q.e(nVar, U2.h.f7676c)).booleanValue() && (strF = q.f(b8)) != null) {
                                    q6.l lVar = nVar.f;
                                    String str2 = x.f16093r;
                                    Long l7 = (Long) lVar.G(D.r(strF)).f12516g;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(b8);
                                    sb2.append('-');
                                    sb2.append(l7);
                                    string = sb2.toString();
                                }
                            }
                            string = null;
                            break;
                        default:
                            string = ((B) obj).f2334a;
                            break;
                    }
                    if (string != null) {
                    }
                }
                i++;
            } else {
                string = null;
            }
        }
        if (string == null) {
            return null;
        }
        if (((List) q.d(gVar, U2.h.f7674a)).isEmpty()) {
            return new P2.a(string, map);
        }
        LinkedHashMap linkedHashMapP = n5.x.P(map);
        linkedHashMapP.put("coil#size", nVar.f7687b.toString());
        return new P2.a(string, linkedHashMapP);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public File q() {
        File file = new File(((C0625d) this.f14120q).f8812q.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void r(float f, W0.c cVar, InterfaceC0261w interfaceC0261w) {
        if (f <= cVar.u(O.f1497a)) {
            return;
        }
        AbstractC0606h abstractC0606hC = r.c();
        B5.c cVarE = abstractC0606hC != null ? abstractC0606hC.e() : null;
        AbstractC0606h abstractC0606hD = r.d(abstractC0606hC);
        try {
            float fFloatValue = ((Number) ((C1658l) this.f14120q).f16962r.getValue()).floatValue();
            C1658l c1658l = (C1658l) this.f14120q;
            if (c1658l.f16966v) {
                this.f14120q = AbstractC1644d.k(c1658l, fFloatValue - f, 0.0f, 30);
                AbstractC0263y.t(interfaceC0261w, null, null, new M(this, null), 3);
            } else {
                this.f14120q = new C1658l(A0.f16746a, Float.valueOf(-f), null, 60);
                AbstractC0263y.t(interfaceC0261w, null, null, new N(this, null), 3);
            }
            r.f(abstractC0606hC, abstractC0606hD, cVarE);
        } catch (Throwable th) {
            r.f(abstractC0606hC, abstractC0606hD, cVarE);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public File s(String str, InputStream inputStream, EnumC1187b enumC1187b) throws IOException {
        File file = new File(q(), d(str, enumC1187b, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void t() {
        E1 e12 = (E1) this.f14120q;
        e12.o();
        C0323t0 c0323t0 = (C0323t0) e12.f4346r;
        C0288h0 c0288h0 = c0323t0.f5076u;
        C0323t0.j(c0288h0);
        B3.a aVar = c0323t0.f5052A;
        aVar.getClass();
        if (c0288h0.y(System.currentTimeMillis())) {
            C0288h0 c0288h02 = c0323t0.f5076u;
            C0323t0.j(c0288h02);
            c0288h02.f4879C.e(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                X x6 = c0323t0.f5077v;
                C0323t0.l(x6);
                x6.f4666E.b("Detected application was in foreground");
                aVar.getClass();
                w(System.currentTimeMillis());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void u(long j) {
        E1 e12 = (E1) this.f14120q;
        e12.o();
        e12.s();
        C0323t0 c0323t0 = (C0323t0) e12.f4346r;
        C0288h0 c0288h0 = c0323t0.f5076u;
        C0323t0.j(c0288h0);
        if (c0288h0.y(j)) {
            C0323t0.j(c0288h0);
            c0288h0.f4879C.e(true);
            c0323t0.q().t();
        }
        C0323t0.j(c0288h0);
        c0288h0.f4883G.b(j);
        if (c0288h0.f4879C.d()) {
            w(j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void w(long j) {
        E1 e12 = (E1) this.f14120q;
        e12.o();
        C0323t0 c0323t0 = (C0323t0) e12.f4346r;
        if (c0323t0.a()) {
            C0288h0 c0288h0 = c0323t0.f5076u;
            C0323t0.j(c0288h0);
            c0288h0.f4883G.b(j);
            c0323t0.f5052A.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4666E.c(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j7 = j / 1000;
            Long lValueOf = Long.valueOf(j7);
            C0271b1 c0271b1 = c0323t0.f5054C;
            C0323t0.k(c0271b1);
            c0271b1.z(j, lValueOf, "auto", "_sid");
            C0323t0.j(c0288h0);
            c0288h0.f4884H.b(j7);
            c0288h0.f4879C.e(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j7);
            C0323t0.k(c0271b1);
            c0271b1.w("auto", "_s", bundle, j);
            String strE = c0288h0.f4889M.e();
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strE);
            C0323t0.k(c0271b1);
            c0271b1.w("auto", "_ssr", bundle2, j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.X1
    public void zza(String str, String str2, Bundle bundle) {
        C0271b1 c0271b1 = (C0271b1) this.f14120q;
        if (!TextUtils.isEmpty(str)) {
            c0271b1.getClass();
            throw new IllegalStateException("Unexpected call on client side");
        }
        ((C0323t0) c0271b1.f4346r).f5052A.getClass();
        c0271b1.t("auto", "_err", bundle, true, true, System.currentTimeMillis());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public c(int i) {
        switch (i) {
            case 9:
                this.f14120q = Build.VERSION.SDK_INT >= 28 ? new e(11) : new C1899k(11);
                break;
            case 22:
                this.f14120q = new ConcurrentHashMap(16);
                break;
            case 26:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                m.e(timeUnit, "timeUnit");
                this.f14120q = new Y(g6.d.i);
                break;
            default:
                this.f14120q = new C1658l(A0.f16746a, Float.valueOf(0.0f), new C1659m(0.0f), Long.MIN_VALUE, Long.MIN_VALUE, false);
                break;
        }
    }

    @Override // B2.h
    public void j(int i) {
    }
}
