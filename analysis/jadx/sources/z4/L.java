package Z4;

import A.AbstractC0017n;
import B0.C0044i;
import B0.C0045j;
import B0.InterfaceC0046k;
import C0.AbstractC0103t0;
import M.N0;
import O3.C0285g0;
import P.C0345b;
import P.C0348c0;
import P.C0363k;
import P.C0371o;
import P.C0372o0;
import P.InterfaceC0360i0;
import P.W;
import R4.Z;
import a.AbstractC0597a;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.VideoView;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0660x;
import c0.AbstractC0727o;
import c0.C0714b;
import c0.C0717e;
import c0.C0722j;
import c0.InterfaceC0725m;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.web2native.MainActivity;
import g1.C1075e;
import j0.AbstractC1145B;
import m5.C1386y;
import t2.C1616a;
import z0.InterfaceC1926C;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static float f8475a = 300;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static float f8476b = 500;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(C0567i c0567i, B5.a aVar, C0371o c0371o, int i) {
        boolean z5;
        String str;
        long jB;
        long jB2;
        boolean z6;
        C0371o c0371o2 = c0371o;
        c0371o2.U(965254413);
        int i7 = i | (c0371o2.g(c0567i) ? 4 : 2) | (c0371o2.i(aVar) ? 32 : 16);
        if (c0371o2.K(i7 & 1, (i7 & 19) != 18)) {
            String str2 = c0567i != null ? c0567i.f8493c : null;
            if (str2 == null || str2.length() == 0) {
                z5 = false;
                c0371o2.S(-1789615641);
            } else {
                c0371o2.S(-1770293558);
                if (c0567i != null) {
                    try {
                        str = c0567i.f8492b;
                    } catch (Exception unused) {
                        jB = AbstractC1145B.b(Color.parseColor("#ffffff"));
                        jB2 = AbstractC1145B.b(Color.parseColor("#000000"));
                    }
                } else {
                    str = null;
                }
                jB = AbstractC1145B.b(Color.parseColor(str));
                jB2 = AbstractC1145B.b(Color.parseColor(c0567i != null ? c0567i.f8491a : null));
                C0717e c0717e = C0714b.f10083x;
                InterfaceC0725m interfaceC0725mD = androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.c.f9279c, 0.0f, 0.0f, 0.0f, 20, 7);
                InterfaceC1926C interfaceC1926CD = AbstractC0017n.d(c0717e, false);
                int i8 = c0371o2.f5454P;
                InterfaceC0360i0 interfaceC0360i0M = c0371o2.m();
                InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o2, interfaceC0725mD);
                InterfaceC0046k.f452a.getClass();
                B0.D d5 = C0045j.f445b;
                c0371o2.W();
                if (c0371o2.f5453O) {
                    c0371o2.l(d5);
                } else {
                    c0371o2.g0();
                }
                C0044i c0044i = C0045j.f448e;
                C0345b.u(c0044i, c0371o2, interfaceC1926CD);
                C0044i c0044i2 = C0045j.f447d;
                C0345b.u(c0044i2, c0371o2, interfaceC0360i0M);
                C0044i c0044i3 = C0045j.f;
                if (c0371o2.f5453O || !kotlin.jvm.internal.m.a(c0371o2.H(), Integer.valueOf(i8))) {
                    k1.i.o(i8, c0371o2, i8, c0044i3);
                }
                C0044i c0044i4 = C0045j.f446c;
                C0345b.u(c0044i4, c0371o2, interfaceC0725mC);
                String str3 = c0567i != null ? c0567i.f8493c : null;
                if (str3 == null) {
                    c0371o2.S(-1084272673);
                    c0371o2.p(false);
                    z5 = false;
                    z6 = true;
                } else {
                    c0371o2.S(-1084272672);
                    long jY = AbstractC0836n2.y(12);
                    InterfaceC0725m interfaceC0725mN = AbstractC0597a.n(androidx.compose.foundation.a.a(androidx.compose.foundation.layout.c.a(androidx.compose.foundation.layout.c.e(C0722j.f10095q, 70), 30), jB, AbstractC1145B.f13658a), H.e.a(20));
                    boolean z7 = (i7 & 112) == 32;
                    Object objH = c0371o2.H();
                    if (z7 || objH == C0363k.f5418a) {
                        objH = new E(aVar, 0);
                        c0371o2.d0(objH);
                    }
                    InterfaceC0725m interfaceC0725mA = v0.u.a(interfaceC0725mN, C1386y.f15098a, (PointerInputEventHandler) objH);
                    InterfaceC1926C interfaceC1926CD2 = AbstractC0017n.d(C0714b.f10080u, false);
                    int i9 = c0371o2.f5454P;
                    InterfaceC0360i0 interfaceC0360i0M2 = c0371o2.m();
                    InterfaceC0725m interfaceC0725mC2 = AbstractC0727o.c(c0371o2, interfaceC0725mA);
                    c0371o2.W();
                    if (c0371o2.f5453O) {
                        c0371o2.l(d5);
                    } else {
                        c0371o2.g0();
                    }
                    C0345b.u(c0044i, c0371o2, interfaceC1926CD2);
                    C0345b.u(c0044i2, c0371o2, interfaceC0360i0M2);
                    if (c0371o2.f5453O || !kotlin.jvm.internal.m.a(c0371o2.H(), Integer.valueOf(i9))) {
                        k1.i.o(i9, c0371o2, i9, c0044i3);
                    }
                    C0345b.u(c0044i4, c0371o2, interfaceC0725mC2);
                    z6 = true;
                    z5 = false;
                    N0.b(str3, null, jB2, jY, null, 0L, null, 0L, 0, false, 0, 0, null, c0371o, 3072, 0, 131058);
                    c0371o2 = c0371o;
                    c0371o2.p(true);
                    c0371o2.p(false);
                }
                c0371o2.p(z6);
            }
            c0371o2.p(z5);
        } else {
            c0371o2.N();
        }
        C0372o0 c0372o0R = c0371o2.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new Z(i, 7, c0567i, aVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(Z4.o r20, B5.a r21, P.C0371o r22, int r23) {
        /*
            r0 = r20
            r1 = r21
            r9 = r22
            r12 = r23
            r2 = 586712155(0x22f8845b, float:6.736067E-18)
            r9.U(r2)
            boolean r2 = r9.g(r0)
            if (r2 == 0) goto L16
            r2 = 4
            goto L17
        L16:
            r2 = 2
        L17:
            r2 = r2 | r12
            boolean r3 = r9.i(r1)
            r4 = 32
            if (r3 == 0) goto L22
            r3 = r4
            goto L24
        L22:
            r3 = 16
        L24:
            r2 = r2 | r3
            r3 = r2 & 19
            r5 = 18
            r6 = 0
            r13 = 1
            if (r3 == r5) goto L2f
            r3 = r13
            goto L30
        L2f:
            r3 = r6
        L30:
            r5 = r2 & 1
            boolean r3 = r9.K(r5, r3)
            if (r3 == 0) goto L17d
            c0.e r3 = c0.C0714b.f10078s
            androidx.compose.foundation.layout.FillElement r14 = androidx.compose.foundation.layout.c.f9279c
            r5 = 10
            float r5 = (float) r5
            r18 = 0
            r19 = 9
            r15 = 0
            r17 = r5
            r16 = r5
            c0.m r5 = androidx.compose.foundation.layout.b.d(r14, r15, r16, r17, r18, r19)
            z0.C r3 = A.AbstractC0017n.d(r3, r6)
            int r7 = r9.f5454P
            P.i0 r8 = r9.m()
            c0.m r5 = c0.AbstractC0727o.c(r9, r5)
            B0.j r10 = B0.InterfaceC0046k.f452a
            r10.getClass()
            B0.D r10 = B0.C0045j.f445b
            r9.W()
            boolean r11 = r9.f5453O
            if (r11 == 0) goto L6c
            r9.l(r10)
            goto L6f
        L6c:
            r9.g0()
        L6f:
            B0.i r10 = B0.C0045j.f448e
            P.C0345b.u(r10, r9, r3)
            B0.i r3 = B0.C0045j.f447d
            P.C0345b.u(r3, r9, r8)
            B0.i r3 = B0.C0045j.f
            boolean r8 = r9.f5453O
            if (r8 != 0) goto L8d
            java.lang.Object r8 = r9.H()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.m.a(r8, r10)
            if (r8 != 0) goto L90
        L8d:
            k1.i.o(r7, r9, r7, r3)
        L90:
            B0.i r3 = B0.C0045j.f446c
            P.C0345b.u(r3, r9, r5)
            r3 = 0
            if (r0 == 0) goto La3
            Z4.c r5 = r0.f8499b     // Catch: java.lang.Exception -> Lc1
            if (r5 == 0) goto La3
            Z4.i r5 = r5.f8484b     // Catch: java.lang.Exception -> Lc1
            if (r5 == 0) goto La3
            java.lang.String r5 = r5.f8491a     // Catch: java.lang.Exception -> Lc1
            goto La4
        La3:
            r5 = r3
        La4:
            int r5 = android.graphics.Color.parseColor(r5)     // Catch: java.lang.Exception -> Lc1
            long r7 = j0.AbstractC1145B.b(r5)     // Catch: java.lang.Exception -> Lc1
            if (r0 == 0) goto Lb8
            Z4.c r5 = r0.f8499b     // Catch: java.lang.Exception -> Lc1
            if (r5 == 0) goto Lb8
            Z4.i r5 = r5.f8484b     // Catch: java.lang.Exception -> Lc1
            if (r5 == 0) goto Lb8
            java.lang.String r3 = r5.f8492b     // Catch: java.lang.Exception -> Lc1
        Lb8:
            int r3 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Exception -> Lc1
            long r10 = j0.AbstractC1145B.b(r3)     // Catch: java.lang.Exception -> Lc1
            goto Ld5
        Lc1:
            java.lang.String r3 = "#ffffff"
            int r3 = android.graphics.Color.parseColor(r3)
            long r7 = j0.AbstractC1145B.b(r3)
            java.lang.String r3 = "#000000"
            int r3 = android.graphics.Color.parseColor(r3)
            long r10 = j0.AbstractC1145B.b(r3)
        Ld5:
            r3 = 25
            float r3 = (float) r3
            c0.j r5 = c0.C0722j.f10095q
            c0.m r3 = androidx.compose.foundation.layout.c.c(r5, r3)
            H.d r14 = H.e.f2031a
            c0.m r3 = a.AbstractC0597a.n(r3, r14)
            O3.D r14 = j0.AbstractC1145B.f13658a
            c0.m r3 = androidx.compose.foundation.a.a(r3, r7, r14)
            r2 = r2 & 112(0x70, float:1.57E-43)
            if (r2 != r4) goto Lf0
            r2 = r13
            goto Lf1
        Lf0:
            r2 = r6
        Lf1:
            java.lang.Object r4 = r9.H()
            if (r2 != 0) goto Lfb
            P.S r2 = P.C0363k.f5418a
            if (r4 != r2) goto L104
        Lfb:
            Z4.E r4 = new Z4.E
            r2 = 1
            r4.<init>(r1, r2)
            r9.d0(r4)
        L104:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r4 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r4
            m5.y r2 = m5.C1386y.f15098a
            c0.m r2 = v0.u.a(r3, r2, r4)
            c0.e r3 = c0.C0714b.f10076q
            z0.C r3 = A.AbstractC0017n.d(r3, r6)
            int r4 = r9.f5454P
            P.i0 r7 = r9.m()
            c0.m r2 = c0.AbstractC0727o.c(r9, r2)
            B0.j r8 = B0.InterfaceC0046k.f452a
            r8.getClass()
            B0.D r8 = B0.C0045j.f445b
            r9.W()
            boolean r14 = r9.f5453O
            if (r14 == 0) goto L12e
            r9.l(r8)
            goto L131
        L12e:
            r9.g0()
        L131:
            B0.i r8 = B0.C0045j.f448e
            P.C0345b.u(r8, r9, r3)
            B0.i r3 = B0.C0045j.f447d
            P.C0345b.u(r3, r9, r7)
            B0.i r3 = B0.C0045j.f
            boolean r7 = r9.f5453O
            if (r7 != 0) goto L14f
            java.lang.Object r7 = r9.H()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            boolean r7 = kotlin.jvm.internal.m.a(r7, r8)
            if (r7 != 0) goto L152
        L14f:
            k1.i.o(r4, r9, r4, r3)
        L152:
            B0.i r3 = B0.C0045j.f446c
            P.C0345b.u(r3, r9, r2)
            r2 = 2131165321(0x7f070089, float:1.7944856E38)
            o0.b r2 = com.google.android.gms.internal.measurement.AbstractC0836n2.F(r2, r9, r6)
            r3 = 3
            float r3 = (float) r3
            c0.m r4 = androidx.compose.foundation.layout.b.a(r5, r3)
            j0.j r8 = new j0.j
            r3 = 5
            r8.<init>(r10, r3)
            r10 = 432(0x1b0, float:6.05E-43)
            r11 = 56
            java.lang.String r3 = "closeBtn"
            r5 = 0
            r6 = 0
            r7 = 0
            D5.a.c(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r9.p(r13)
            r9.p(r13)
            goto L180
        L17d:
            r9.N()
        L180:
            P.o0 r2 = r9.r()
            if (r2 == 0) goto L18e
            R4.Z r3 = new R4.Z
            r4 = 6
            r3.<init>(r12, r4, r0, r1)
            r2.f5482d = r3
        L18e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z4.L.b(Z4.o, B5.a, P.o, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(final MainActivity mainActivity, final String str, final String str2, final long j, final B5.c cVar, C0371o c0371o, final int i) {
        Object obj;
        int i7;
        int i8;
        c0371o.U(-1839159602);
        int i9 = i | (c0371o.i(mainActivity) ? 4 : 2) | (c0371o.g(str) ? 32 : 16) | (c0371o.g(str2) ? 256 : 128) | (c0371o.f(j) ? 2048 : 1024) | (c0371o.i(cVar) ? 16384 : 8192);
        if (c0371o.K(i9 & 1, (i9 & 9363) != 9362)) {
            Object objH = c0371o.H();
            Object obj2 = C0363k.f5418a;
            if (objH == obj2) {
                objH = C0345b.q(null);
                c0371o.d0(objH);
            }
            final W w3 = (W) objH;
            final W0.c cVar2 = (W0.c) c0371o.k(AbstractC0103t0.f1116h);
            Configuration configuration = (Configuration) c0371o.k(AndroidCompositionLocals_androidKt.f9340a);
            float f = configuration.screenWidthDp / 2;
            float f7 = configuration.screenHeightDp / 2;
            if (((ImageView) w3.getValue()) != null) {
                ImageView imageView = (ImageView) w3.getValue();
                kotlin.jvm.internal.m.b(imageView);
                t2.l lVarA = C1616a.a(imageView.getContext());
                D2.h hVar = new D2.h(imageView.getContext());
                hVar.f1383c = str;
                hVar.f1384d = new F2.a(imageView);
                hVar.b();
                obj = obj2;
                i7 = 16384;
                i8 = 2048;
                hVar.f1385e = new F(cVar2, str2, f, f7, j, cVar);
                lVarA.b(hVar.a());
            } else {
                obj = obj2;
                i7 = 16384;
                i8 = 2048;
            }
            boolean zI = ((i9 & 7168) == i8) | c0371o.i(mainActivity) | ((i9 & 112) == 32) | c0371o.g(cVar2) | ((i9 & 896) == 256) | ((i9 & 57344) == i7);
            Object objH2 = c0371o.H();
            if (zI || objH2 == obj) {
                Object obj3 = new B5.c() { // from class: Z4.x
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // B5.c
                    public final Object invoke(Object obj4) {
                        Context it = (Context) obj4;
                        kotlin.jvm.internal.m.e(it, "it");
                        W w6 = w3;
                        ImageView imageView2 = (ImageView) w6.getValue();
                        String str3 = str;
                        if (imageView2 == null) {
                            ImageView imageView3 = new ImageView(mainActivity);
                            imageView3.setId(View.generateViewId());
                            imageView3.setScaleType(ImageView.ScaleType.FIT_XY);
                            imageView3.setVisibility(4);
                            imageView3.setLayoutParams(new C1075e());
                            t2.l lVarA2 = C1616a.a(imageView3.getContext());
                            D2.h hVar2 = new D2.h(imageView3.getContext());
                            hVar2.f1383c = str3;
                            hVar2.f1384d = new F2.a(imageView3);
                            hVar2.b();
                            hVar2.f1385e = new C0285g0(cVar2, str2, j, cVar, imageView3);
                            lVarA2.b(hVar2.a());
                            w6.setValue(imageView3);
                        } else {
                            ImageView imageView4 = (ImageView) w6.getValue();
                            kotlin.jvm.internal.m.b(imageView4);
                            t2.l lVarA3 = C1616a.a(imageView4.getContext());
                            D2.h hVar3 = new D2.h(imageView4.getContext());
                            hVar3.f1383c = str3;
                            hVar3.f1384d = new F2.a(imageView4);
                            hVar3.b();
                            lVarA3.b(hVar3.a());
                        }
                        ImageView imageView5 = (ImageView) w6.getValue();
                        kotlin.jvm.internal.m.b(imageView5);
                        return imageView5;
                    }
                };
                c0371o.d0(obj3);
                objH2 = obj3;
            }
            androidx.compose.ui.viewinterop.a.b((B5.c) objH2, null, null, c0371o, 0, 6);
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new B5.e(str, str2, j, cVar, i) { // from class: Z4.y

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public final /* synthetic */ String f8523r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ String f8524s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ long f8525t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ B5.c f8526u;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // B5.e
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int iW = C0345b.w(1);
                    L.c(this.f8522q, this.f8523r, this.f8524s, this.f8525t, this.f8526u, (C0371o) obj4, iW);
                    return C1386y.f15098a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:123:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(com.web2native.MainActivity r34, android.webkit.WebView r35, com.web2native.MainActivity r36, Z4.M r37, P.C0371o r38, int r39) {
        /*
            r2 = r35
            r3 = r36
            r4 = r37
            r0 = r38
            c0.e r1 = c0.C0714b.f10080u
            r5 = -1583755406(0xffffffffa199cf72, float:-1.0422594E-18)
            r0.U(r5)
            r5 = r34
            boolean r6 = r0.i(r5)
            if (r6 == 0) goto L1a
            r6 = 4
            goto L1b
        L1a:
            r6 = 2
        L1b:
            r6 = r39 | r6
            boolean r7 = r0.i(r2)
            if (r7 == 0) goto L26
            r7 = 32
            goto L28
        L26:
            r7 = 16
        L28:
            r6 = r6 | r7
            boolean r7 = r0.i(r3)
            if (r7 == 0) goto L32
            r7 = 256(0x100, float:3.59E-43)
            goto L34
        L32:
            r7 = 128(0x80, float:1.794E-43)
        L34:
            r6 = r6 | r7
            boolean r7 = r0.i(r4)
            if (r7 == 0) goto L3e
            r7 = 2048(0x800, float:2.87E-42)
            goto L40
        L3e:
            r7 = 1024(0x400, float:1.435E-42)
        L40:
            r6 = r6 | r7
            r7 = r6 & 1171(0x493, float:1.641E-42)
            r8 = 1170(0x492, float:1.64E-42)
            if (r7 == r8) goto L49
            r7 = 1
            goto L4a
        L49:
            r7 = 0
        L4a:
            r8 = r6 & 1
            boolean r7 = r0.K(r8, r7)
            if (r7 == 0) goto L5fb
            java.lang.Object r7 = r0.H()
            P.S r8 = P.C0363k.f5418a
            if (r7 != r8) goto L63
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            P.f0 r7 = P.C0345b.q(r7)
            r0.d0(r7)
        L63:
            P.W r7 = (P.W) r7
            java.lang.Object r11 = r0.H()
            r12 = 0
            if (r11 != r8) goto L73
            P.f0 r11 = P.C0345b.q(r12)
            r0.d0(r11)
        L73:
            P.W r11 = (P.W) r11
            if (r4 == 0) goto L7a
            P5.D r13 = r4.f8478c
            goto L7b
        L7a:
            r13 = r12
        L7b:
            kotlin.jvm.internal.m.b(r13)
            P.W r13 = P.C0345b.j(r13, r0)
            java.lang.Object r14 = r0.H()
            if (r14 != r8) goto L8f
            P.f0 r14 = P.C0345b.q(r12)
            r0.d0(r14)
        L8f:
            P.W r14 = (P.W) r14
            java.lang.Object r15 = r0.H()
            if (r15 != r8) goto L9e
            P.f0 r15 = P.C0345b.q(r12)
            r0.d0(r15)
        L9e:
            P.W r15 = (P.W) r15
            java.lang.Object r9 = r0.H()
            java.lang.String r10 = "IMAGE"
            if (r9 != r8) goto Laf
            P.f0 r9 = P.C0345b.q(r10)
            r0.d0(r9)
        Laf:
            P.W r9 = (P.W) r9
            r18 = r12
            java.lang.Object r12 = r0.H()
            r20 = r1
            java.lang.String r1 = "SMALL"
            if (r12 != r8) goto Lc4
            P.f0 r12 = P.C0345b.q(r1)
            r0.d0(r12)
        Lc4:
            P.W r12 = (P.W) r12
            java.lang.Object r5 = r0.H()
            if (r5 != r8) goto Ld5
            java.lang.String r5 = "RIGHT"
            P.f0 r5 = P.C0345b.q(r5)
            r0.d0(r5)
        Ld5:
            P.W r5 = (P.W) r5
            r19 = r5
            java.lang.Object r5 = r0.H()
            if (r5 != r8) goto Lec
            P.c0 r5 = new P.c0
            r21 = r6
            r6 = 10
            r5.<init>(r6)
            r0.d0(r5)
            goto Lee
        Lec:
            r21 = r6
        Lee:
            P.c0 r5 = (P.C0348c0) r5
            P.z r6 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f9340a
            java.lang.Object r6 = r0.k(r6)
            android.content.res.Configuration r6 = (android.content.res.Configuration) r6
            int r6 = r6.screenHeightDp
            r22 = r5
            java.lang.Object r5 = r0.H()
            if (r5 != r8) goto L109
            P.f0 r5 = P.C0345b.q(r18)
            r0.d0(r5)
        L109:
            P.W r5 = (P.W) r5
            r23 = r5
            java.lang.Object r5 = r0.H()
            if (r5 != r8) goto L11a
            P.f0 r5 = P.C0345b.q(r18)
            r0.d0(r5)
        L11a:
            P.W r5 = (P.W) r5
            r24 = r5
            java.lang.Object r5 = r0.H()
            if (r5 != r8) goto L13f
            java.lang.String r5 = "#000000"
            int r5 = android.graphics.Color.parseColor(r5)
            r26 = r9
            r25 = r10
            long r9 = j0.AbstractC1145B.b(r5)
            j0.o r5 = new j0.o
            r5.<init>(r9)
            P.f0 r5 = P.C0345b.q(r5)
            r0.d0(r5)
            goto L143
        L13f:
            r26 = r9
            r25 = r10
        L143:
            P.W r5 = (P.W) r5
            if (r4 == 0) goto L14a
            P5.S r9 = r4.f8480e
            goto L14c
        L14a:
            r9 = r18
        L14c:
            if (r9 != 0) goto L15b
            r9 = -1440403361(0xffffffffaa25305f, float:-1.4671726E-13)
            r0.S(r9)
            r10 = 0
            r0.p(r10)
            r27 = r18
            goto L16b
        L15b:
            r10 = -1570485278(0xffffffffa2644be2, float:-3.0939934E-18)
            r0.S(r10)
            P.W r9 = P.C0345b.j(r9, r0)
            r10 = 0
            r0.p(r10)
            r27 = r9
        L16b:
            java.lang.Object r9 = r13.getValue()
            java.lang.String r9 = (java.lang.String) r9
            boolean r17 = r0.g(r13)
            boolean r28 = r0.i(r3)
            r17 = r17 | r28
            boolean r28 = r0.i(r4)
            r17 = r17 | r28
            boolean r28 = r0.e(r6)
            r17 = r17 | r28
            java.lang.Object r10 = r0.H()
            if (r17 != 0) goto L19f
            if (r10 != r8) goto L190
            goto L19f
        L190:
            r13 = r4
            r17 = r5
            r14 = r7
            r2 = r9
            r16 = r12
            r11 = r22
            r12 = r23
            r22 = r1
            r1 = r8
            goto L1cf
        L19f:
            Z4.H r3 = new Z4.H
            r10 = r8
            r8 = r14
            r14 = r19
            r19 = 0
            r17 = r5
            r2 = r9
            r9 = r15
            r15 = r22
            r18 = r23
            r16 = r26
            r5 = r36
            r22 = r1
            r1 = r10
            r10 = r7
            r7 = r11
            r11 = r6
            r6 = r4
            r4 = r13
            r13 = r12
            r12 = r24
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r19 = r14
            r11 = r15
            r12 = r18
            r15 = r9
            r14 = r10
            r16 = r13
            r13 = r6
            r0.d0(r3)
            r10 = r3
        L1cf:
            B5.e r10 = (B5.e) r10
            P.C0345b.e(r10, r0, r2)
            java.lang.Object r2 = r14.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = -1444392688(0xffffffffa9e85110, float:-1.0316932E-13)
            if (r2 == 0) goto L5f1
            r2 = -1437559141(0xffffffffaa50969b, float:-1.8526363E-13)
            r0.S(r2)
            java.lang.Object r2 = r0.H()
            if (r2 != r1) goto L1fa
            c0.m r2 = androidx.compose.foundation.layout.c.h()
            P.f0 r2 = P.C0345b.q(r2)
            r0.d0(r2)
        L1fa:
            P.W r2 = (P.W) r2
            java.lang.Object r4 = r26.getValue()
            java.lang.String r4 = (java.lang.String) r4
            r5 = r25
            boolean r4 = kotlin.jvm.internal.m.a(r4, r5)
            if (r4 == 0) goto L25d
            r4 = -1437536325(0xffffffffaa50efbb, float:-1.8557284E-13)
            r0.S(r4)
            java.lang.Object r4 = r15.getValue()
            Z4.o r4 = (Z4.o) r4
            if (r4 == 0) goto L223
            Z4.f r4 = r4.f8500c
            if (r4 == 0) goto L223
            Z4.l r4 = r4.f8489d
            if (r4 == 0) goto L223
            java.lang.String r4 = r4.f8496b
            goto L224
        L223:
            r4 = 0
        L224:
            kotlin.jvm.internal.m.b(r4)
            java.lang.Object r6 = r16.getValue()
            java.lang.String r6 = (java.lang.String) r6
            r25 = r5
            r5 = r6
            long r6 = f(r17)
            boolean r8 = r0.i(r13)
            java.lang.Object r9 = r0.H()
            if (r8 != 0) goto L240
            if (r9 != r1) goto L249
        L240:
            R4.y2 r9 = new R4.y2
            r8 = 2
            r9.<init>(r13, r2, r12, r8)
            r0.d0(r9)
        L249:
            r8 = r9
            B5.c r8 = (B5.c) r8
            r10 = r21 & 14
            r3 = r34
            r9 = r0
            r0 = r25
            c(r3, r4, r5, r6, r8, r9, r10)
            r10 = r9
            r3 = 0
            r10.p(r3)
            r3 = 1
            goto L26f
        L25d:
            r10 = r0
            r0 = r5
            r3 = 0
            r4 = -1437139463(0xffffffffaa56fdf9, float:-1.9095133E-13)
            r10.S(r4)
            r10.p(r3)
            r3 = 1
            if (r13 == 0) goto L26f
            r13.c(r3)
        L26f:
            if (r27 == 0) goto L27c
            java.lang.Object r4 = r27.getValue()
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r4 = kotlin.jvm.internal.m.a(r4, r5)
            goto L27d
        L27c:
            r4 = 0
        L27d:
            if (r4 == 0) goto L5e2
            r4 = -1436922308(0xffffffffaa5a4e3c, float:-1.9389433E-13)
            r10.S(r4)
            java.lang.Object r4 = r16.getValue()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "FULL_SCREEN"
            boolean r4 = kotlin.jvm.internal.m.a(r4, r5)
            if (r4 == 0) goto L29f
            P5.S r4 = r13.f
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r4.getClass()
            r7 = 0
            r4.h(r7, r6)
            goto L2a0
        L29f:
            r7 = 0
        L2a0:
            androidx.compose.foundation.layout.FillElement r4 = androidx.compose.foundation.layout.c.f9279c
            java.lang.String r6 = "#88222222"
            int r6 = android.graphics.Color.parseColor(r6)
            long r8 = j0.AbstractC1145B.b(r6)
            O3.D r6 = j0.AbstractC1145B.f13658a
            c0.m r8 = androidx.compose.foundation.a.a(r4, r8, r6)
            java.lang.Object r9 = r10.H()
            if (r9 != r1) goto L2bd
            Z4.I r9 = Z4.I.f8469q
            r10.d0(r9)
        L2bd:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r9 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r9
            m5.y r3 = m5.C1386y.f15098a
            c0.m r8 = v0.u.a(r8, r3, r9)
            c0.e r9 = c0.C0714b.f10076q
            r23 = r2
            r7 = 0
            z0.C r2 = A.AbstractC0017n.d(r9, r7)
            int r7 = r10.f5454P
            r25 = r9
            P.i0 r9 = r10.m()
            c0.m r8 = c0.AbstractC0727o.c(r10, r8)
            B0.j r27 = B0.InterfaceC0046k.f452a
            r27.getClass()
            r27 = r11
            B0.D r11 = B0.C0045j.f445b
            r10.W()
            r29 = r12
            boolean r12 = r10.f5453O
            if (r12 == 0) goto L2f0
            r10.l(r11)
            goto L2f3
        L2f0:
            r10.g0()
        L2f3:
            B0.i r12 = B0.C0045j.f448e
            P.C0345b.u(r12, r10, r2)
            B0.i r2 = B0.C0045j.f447d
            P.C0345b.u(r2, r10, r9)
            B0.i r9 = B0.C0045j.f
            r30 = r0
            boolean r0 = r10.f5453O
            if (r0 != 0) goto L316
            java.lang.Object r0 = r10.H()
            r31 = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            boolean r0 = kotlin.jvm.internal.m.a(r0, r3)
            if (r0 != 0) goto L31b
            goto L318
        L316:
            r31 = r3
        L318:
            k1.i.o(r7, r10, r7, r9)
        L31b:
            B0.i r0 = B0.C0045j.f446c
            P.C0345b.u(r0, r10, r8)
            java.lang.Object r3 = r16.getValue()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = kotlin.jvm.internal.m.a(r3, r5)
            if (r3 == 0) goto L33e
            long r7 = f(r17)
            c0.m r3 = androidx.compose.foundation.a.a(r4, r7, r6)
            int r4 = r27.e()
            float r4 = (float) r4
            c0.m r3 = androidx.compose.foundation.layout.b.a(r3, r4)
            goto L347
        L33e:
            int r3 = r27.e()
            float r3 = (float) r3
            c0.m r3 = androidx.compose.foundation.layout.b.a(r4, r3)
        L347:
            java.lang.Object r4 = r16.getValue()
            java.lang.String r4 = (java.lang.String) r4
            r6 = r22
            boolean r6 = kotlin.jvm.internal.m.a(r4, r6)
            if (r6 == 0) goto L36a
            java.lang.Object r4 = r19.getValue()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r6 = "LEFT"
            boolean r4 = kotlin.jvm.internal.m.a(r4, r6)
            if (r4 == 0) goto L367
            c0.e r4 = c0.C0714b.f10082w
        L365:
            r7 = 0
            goto L378
        L367:
            c0.e r4 = c0.C0714b.f10084y
            goto L365
        L36a:
            java.lang.String r6 = "FULL_WIDTH"
            boolean r4 = kotlin.jvm.internal.m.a(r4, r6)
            if (r4 == 0) goto L375
            c0.e r4 = c0.C0714b.f10083x
            goto L365
        L375:
            r4 = r20
            goto L365
        L378:
            z0.C r4 = A.AbstractC0017n.d(r4, r7)
            int r6 = r10.f5454P
            P.i0 r7 = r10.m()
            c0.m r3 = c0.AbstractC0727o.c(r10, r3)
            r10.W()
            boolean r8 = r10.f5453O
            if (r8 == 0) goto L391
            r10.l(r11)
            goto L394
        L391:
            r10.g0()
        L394:
            P.C0345b.u(r12, r10, r4)
            P.C0345b.u(r2, r10, r7)
            boolean r4 = r10.f5453O
            if (r4 != 0) goto L3ac
            java.lang.Object r4 = r10.H()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            boolean r4 = kotlin.jvm.internal.m.a(r4, r7)
            if (r4 != 0) goto L3af
        L3ac:
            k1.i.o(r6, r10, r6, r9)
        L3af:
            P.C0345b.u(r0, r10, r3)
            java.lang.Object r3 = r29.getValue()
            c0.m r3 = (c0.InterfaceC0725m) r3
            kotlin.jvm.internal.m.b(r3)
            r4 = r35
            boolean r6 = r10.i(r4)
            boolean r7 = r10.i(r13)
            r6 = r6 | r7
            java.lang.Object r7 = r10.H()
            if (r6 != 0) goto L3ce
            if (r7 != r1) goto L3d6
        L3ce:
            Z4.J r7 = new Z4.J
            r7.<init>(r15, r4, r13, r14)
            r10.d0(r7)
        L3d6:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r7 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r7
            r6 = r31
            c0.m r3 = v0.u.a(r3, r6, r7)
            r6 = r20
            r7 = 0
            z0.C r6 = A.AbstractC0017n.d(r6, r7)
            int r7 = r10.f5454P
            P.i0 r8 = r10.m()
            c0.m r3 = c0.AbstractC0727o.c(r10, r3)
            r10.W()
            boolean r4 = r10.f5453O
            if (r4 == 0) goto L3fa
            r10.l(r11)
            goto L3fd
        L3fa:
            r10.g0()
        L3fd:
            P.C0345b.u(r12, r10, r6)
            P.C0345b.u(r2, r10, r8)
            boolean r4 = r10.f5453O
            if (r4 != 0) goto L415
            java.lang.Object r4 = r10.H()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            boolean r4 = kotlin.jvm.internal.m.a(r4, r6)
            if (r4 != 0) goto L418
        L415:
            k1.i.o(r7, r10, r7, r9)
        L418:
            P.C0345b.u(r0, r10, r3)
            java.lang.Object r3 = r26.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r4 = r30
            boolean r3 = kotlin.jvm.internal.m.a(r3, r4)
            if (r3 == 0) goto L481
            r3 = -1640573234(0xffffffff9e36d6ce, float:-9.67942E-21)
            r10.S(r3)
            java.lang.Object r3 = r15.getValue()
            Z4.o r3 = (Z4.o) r3
            if (r3 == 0) goto L442
            Z4.f r3 = r3.f8500c
            if (r3 == 0) goto L442
            Z4.l r3 = r3.f8489d
            if (r3 == 0) goto L442
            java.lang.String r3 = r3.f8496b
            goto L443
        L442:
            r3 = 0
        L443:
            kotlin.jvm.internal.m.b(r3)
            u2.n r3 = u2.u.e(r3, r10)
            java.lang.Object r4 = r23.getValue()
            c0.m r4 = (c0.InterfaceC0725m) r4
            r6 = r11
            r11 = 24624(0x6030, float:3.4506E-41)
            r7 = r12
            r12 = 104(0x68, float:1.46E-43)
            r8 = r5
            r5 = r4
            r4 = 0
            r17 = r6
            r6 = 0
            r19 = r7
            z0.F r7 = z0.C1949i.f18697d
            r20 = r8
            r8 = 0
            r21 = r9
            r9 = 0
            r13 = r35
            r18 = r0
            r32 = r19
            r33 = r21
            r0 = 1
            r22 = 0
            r19 = r2
            r2 = r20
            r20 = r17
            D5.a.c(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r7 = 0
            r10.p(r7)
            r4 = r37
            goto L4d9
        L481:
            r13 = r35
            r18 = r0
            r19 = r2
            r2 = r5
            r33 = r9
            r20 = r11
            r32 = r12
            r0 = 1
            r22 = 0
            r3 = -1640131763(0xffffffff9e3d934d, float:-1.0036038E-20)
            r10.S(r3)
            java.lang.Object r3 = r24.getValue()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            kotlin.jvm.internal.m.b(r4)
            java.lang.Object r3 = r16.getValue()
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            long r6 = f(r17)
            java.lang.Object r3 = r10.H()
            if (r3 != r1) goto L4bd
            U4.m r3 = new U4.m
            r8 = 3
            r12 = r29
            r3.<init>(r12, r8)
            r10.d0(r3)
        L4bd:
            r9 = r3
            B5.c r9 = (B5.c) r9
            r3 = 196608(0x30000, float:2.75506E-40)
            r8 = r21 & 14
            r3 = r3 | r8
            r8 = 57344(0xe000, float:8.0356E-41)
            int r11 = r21 << 3
            r8 = r8 & r11
            r11 = r3 | r8
            r3 = r34
            r8 = r37
            g(r3, r4, r5, r6, r8, r9, r10, r11)
            r4 = r8
            r7 = 0
            r10.p(r7)
        L4d9:
            java.lang.Object r3 = r15.getValue()
            Z4.o r3 = (Z4.o) r3
            if (r3 == 0) goto L4e8
            Z4.c r3 = r3.f8499b
            if (r3 == 0) goto L4e8
            Z4.i r12 = r3.f8484b
            goto L4ea
        L4e8:
            r12 = r22
        L4ea:
            boolean r3 = r10.i(r13)
            boolean r5 = r10.i(r4)
            r3 = r3 | r5
            java.lang.Object r5 = r10.H()
            if (r3 != 0) goto L4fb
            if (r5 != r1) goto L503
        L4fb:
            Z4.z r5 = new Z4.z
            r5.<init>(r15, r13, r4, r14)
            r10.d0(r5)
        L503:
            B5.a r5 = (B5.a) r5
            r7 = 0
            a(r12, r5, r10, r7)
            java.lang.Object r3 = r16.getValue()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = kotlin.jvm.internal.m.a(r3, r2)
            if (r3 != 0) goto L540
            r3 = -1639236421(0xffffffff9e4b3cbb, float:-1.0759289E-20)
            r10.S(r3)
            java.lang.Object r3 = r15.getValue()
            Z4.o r3 = (Z4.o) r3
            boolean r5 = r10.i(r4)
            java.lang.Object r6 = r10.H()
            if (r5 != 0) goto L52d
            if (r6 != r1) goto L536
        L52d:
            Z4.A r6 = new Z4.A
            r5 = 0
            r6.<init>()
            r10.d0(r6)
        L536:
            B5.a r6 = (B5.a) r6
            r7 = 0
            b(r3, r6, r10, r7)
        L53c:
            r10.p(r7)
            goto L548
        L540:
            r7 = 0
            r3 = -1650329585(0xffffffff9da1f80f, float:-4.287283E-21)
            r10.S(r3)
            goto L53c
        L548:
            r10.p(r0)
            java.lang.Object r3 = r16.getValue()
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = kotlin.jvm.internal.m.a(r3, r2)
            if (r2 == 0) goto L5d1
            r2 = -187460742(0xfffffffff4d3937a, float:-1.3410227E32)
            r10.S(r2)
            r2 = r25
            z0.C r2 = A.AbstractC0017n.d(r2, r7)
            int r3 = r10.f5454P
            P.i0 r5 = r10.m()
            c0.j r6 = c0.C0722j.f10095q
            c0.m r6 = c0.AbstractC0727o.c(r10, r6)
            r10.W()
            boolean r7 = r10.f5453O
            if (r7 == 0) goto L57e
            r7 = r20
            r10.l(r7)
        L57b:
            r7 = r32
            goto L582
        L57e:
            r10.g0()
            goto L57b
        L582:
            P.C0345b.u(r7, r10, r2)
            r2 = r19
            P.C0345b.u(r2, r10, r5)
            boolean r2 = r10.f5453O
            if (r2 != 0) goto L59c
            java.lang.Object r2 = r10.H()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            boolean r2 = kotlin.jvm.internal.m.a(r2, r5)
            if (r2 != 0) goto L59f
        L59c:
            r2 = r33
            goto L5a2
        L59f:
            r2 = r18
            goto L5a6
        L5a2:
            k1.i.o(r3, r10, r3, r2)
            goto L59f
        L5a6:
            P.C0345b.u(r2, r10, r6)
            java.lang.Object r2 = r15.getValue()
            Z4.o r2 = (Z4.o) r2
            boolean r3 = r10.i(r4)
            java.lang.Object r5 = r10.H()
            if (r3 != 0) goto L5bb
            if (r5 != r1) goto L5c4
        L5bb:
            Z4.A r5 = new Z4.A
            r1 = 1
            r5.<init>()
            r10.d0(r5)
        L5c4:
            B5.a r5 = (B5.a) r5
            r7 = 0
            b(r2, r5, r10, r7)
            r10.p(r0)
        L5cd:
            r10.p(r7)
            goto L5d8
        L5d1:
            r1 = -199033879(0xfffffffff422fbe9, float:-5.16517E31)
            r10.S(r1)
            goto L5cd
        L5d8:
            r10.p(r0)
            r10.p(r0)
        L5de:
            r10.p(r7)
            goto L5ed
        L5e2:
            r4 = r13
            r0 = -1444392688(0xffffffffa9e85110, float:-1.0316932E-13)
            r7 = 0
            r13 = r35
            r10.S(r0)
            goto L5de
        L5ed:
            r10.p(r7)
            goto L600
        L5f1:
            r10 = r0
            r0 = r3
            r4 = r13
            r7 = 0
            r13 = r35
            r10.S(r0)
            goto L5ed
        L5fb:
            r10 = r0
            r13 = r2
            r10.N()
        L600:
            P.o0 r6 = r10.r()
            if (r6 == 0) goto L614
            U4.Q r0 = new U4.Q
            r1 = r34
            r3 = r36
            r5 = r39
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f5482d = r0
        L614:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z4.L.d(com.web2native.MainActivity, android.webkit.WebView, com.web2native.MainActivity, Z4.M, P.o, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void e(W w3, boolean z5) {
        w3.setValue(Boolean.valueOf(z5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long f(W w3) {
        return ((j0.o) w3.getValue()).f13724a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void g(final MainActivity mainActivity, final String str, final String str2, final long j, final M m4, final B5.c cVar, C0371o c0371o, final int i) {
        c0371o.U(201341975);
        int i7 = (c0371o.i(mainActivity) ? 4 : 2) | i | (c0371o.g(str) ? 32 : 16) | (c0371o.g(str2) ? 256 : 128) | (c0371o.f(j) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i7 |= c0371o.i(m4) ? 16384 : 8192;
        }
        if (c0371o.K(i7 & 1, (74899 & i7) != 74898)) {
            Object obj = (InterfaceC0660x) c0371o.k(N1.a.f4029a);
            Configuration configuration = (Configuration) c0371o.k(AndroidCompositionLocals_androidKt.f9340a);
            final float f = configuration.screenWidthDp / 2;
            final float f7 = configuration.screenHeightDp / 2;
            final W0.c cVar2 = (W0.c) c0371o.k(AbstractC0103t0.f1116h);
            Object objH = c0371o.H();
            Object obj2 = C0363k.f5418a;
            if (objH == obj2) {
                objH = new C0348c0(0);
                c0371o.d0(objH);
            }
            C0348c0 c0348c0 = (C0348c0) objH;
            boolean zI = c0371o.i(obj);
            Object objH2 = c0371o.H();
            if (zI || objH2 == obj2) {
                objH2 = new N5.d(8, obj, c0348c0);
                c0371o.d0(objH2);
            }
            C0345b.c(obj, (B5.c) objH2, c0371o);
            boolean zE = c0371o.e(c0348c0.e());
            Object objH3 = c0371o.H();
            Object obj3 = objH3;
            if (zE || objH3 == obj2) {
                final VideoView videoView = new VideoView(mainActivity);
                videoView.setId(View.generateViewId());
                videoView.setVideoURI(Uri.parse(str));
                final VideoView videoView2 = videoView;
                videoView2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: Z4.B
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public final void onPrepared(MediaPlayer mediaPlayer) {
                        int videoWidth = mediaPlayer.getVideoWidth();
                        W0.c cVar3 = cVar2;
                        float fF0 = cVar3.f0(videoWidth);
                        float fF02 = cVar3.f0(mediaPlayer.getVideoHeight());
                        String str3 = str2;
                        boolean zA = kotlin.jvm.internal.m.a(str3, "SMALL");
                        float f8 = f;
                        float f9 = zA ? f8 : 2 * f8;
                        if (Float.compare(fF0, fF02) < 0) {
                            boolean zA2 = kotlin.jvm.internal.m.a(str3, "SMALL");
                            float f10 = f7;
                            float f11 = (zA2 || kotlin.jvm.internal.m.a(str3, "FULL_WIDTH")) ? f10 : 2 * f10;
                            if (Float.compare(fF02, f11) > 0) {
                                l6.d.m(fF0, fF02, f11, "height");
                            } else if (!kotlin.jvm.internal.m.a(str3, "FULL_SCREEN") || Float.compare(fF02, f11) >= 0) {
                                L.f8475a = f8;
                                L.f8476b = f10;
                            } else {
                                l6.d.t(fF0, fF02, f11, "height", f8);
                            }
                        } else if (Float.compare(fF0, f9) > 0) {
                            l6.d.m(fF0, fF02, f9, "width");
                        } else if (Float.compare(fF0, f9) < 0) {
                            l6.d.t(fF0, fF02, f9, "width", f9);
                        }
                        boolean zA3 = kotlin.jvm.internal.m.a(str3, "FULL_SCREEN");
                        O3.D d5 = AbstractC1145B.f13658a;
                        C0722j c0722j = C0722j.f10095q;
                        long j7 = j;
                        InterfaceC0725m interfaceC0725mA = zA3 ? androidx.compose.foundation.a.a(androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.a(c0722j, L.f8476b), L.f8475a), j7, d5) : kotlin.jvm.internal.m.a(str3, "FULL_WIDTH") ? Float.compare(fF0, fF02) < 0 ? androidx.compose.foundation.a.a(AbstractC0597a.n(androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.a(c0722j, L.f8476b), L.f8475a), H.e.a(5)), j7, d5) : androidx.compose.foundation.a.a(AbstractC0597a.n(androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.a(c0722j, L.f8476b), L.f8475a), H.e.a(5)), j7, d5) : Float.compare(fF02, fF0) > 0 ? androidx.compose.foundation.a.a(AbstractC0597a.n(androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.a(c0722j, L.f8476b), L.f8475a), H.e.a(10)), j7, d5) : androidx.compose.foundation.a.a(AbstractC0597a.n(androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.a(c0722j, L.f8476b), L.f8475a), H.e.a(10)), j7, d5);
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                        VideoView videoView3 = videoView;
                        videoView3.setLayoutParams(layoutParams);
                        cVar.invoke(interfaceC0725mA);
                        videoView3.start();
                    }
                });
                videoView2.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: Z4.C
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.media.MediaPlayer.OnErrorListener
                    public final boolean onError(MediaPlayer mediaPlayer, int i8, int i9) {
                        M m7 = m4;
                        if (m7 != null) {
                            m7.c(false);
                        }
                        if (m7 != null) {
                            m7.d("");
                        }
                        return false;
                    }
                });
                videoView2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: Z4.v
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer) {
                        videoView2.start();
                    }
                });
                c0371o.d0(videoView2);
                obj3 = videoView2;
            }
            Object obj4 = (VideoView) obj3;
            boolean zI2 = c0371o.i(obj4);
            Object objH4 = c0371o.H();
            if (zI2 || objH4 == obj2) {
                objH4 = new J5.i(7, obj4);
                c0371o.d0(objH4);
            }
            androidx.compose.ui.viewinterop.a.b((B5.c) objH4, null, null, c0371o, 0, 6);
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new B5.e() { // from class: Z4.w
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // B5.e
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    L.g(mainActivity, str, str2, j, m4, cVar, (C0371o) obj5, C0345b.w(i | 1));
                    return C1386y.f15098a;
                }
            };
        }
    }
}
