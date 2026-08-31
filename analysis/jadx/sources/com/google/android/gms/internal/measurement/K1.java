package com.google.android.gms.internal.measurement;

import B0.AbstractC0041g;
import B0.AbstractC0049n;
import B0.C0042g0;
import B0.C0056v;
import B0.InterfaceC0048m;
import F.C0149c;
import P.C0345b;
import P.C0363k;
import P.C0368m0;
import P.C0371o;
import P.C0372o0;
import R4.C0458i;
import R4.C0468k1;
import U1.C0530a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.os.UserManager;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import androidx.lifecycle.InterfaceC0648k;
import androidx.lifecycle.InterfaceC0660x;
import c0.AbstractC0724l;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import e.C1008a;
import h2.AbstractC1121a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import m5.C1386y;
import n5.AbstractC1397A;
import r5.EnumC1580a;
import u3.InterfaceC1697b;
import w1.AbstractC1835K;
import y0.AbstractC1904a;

/* JADX INFO: loaded from: classes.dex */
public abstract class K1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static UserManager f10651a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f10652b = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float C(EdgeEffect edgeEffect, float f, float f7) {
        if (Build.VERSION.SDK_INT >= 31) {
            return A1.d.c(edgeEffect, f, f7);
        }
        A1.c.a(edgeEffect, f, f7);
        return f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long H(long j, long j7) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j7 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j7 & 4294967295L)))) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I(Q2.v r4, s5.c r5) {
        /*
            boolean r0 = r5 instanceof R2.c
            if (r0 == 0) goto L13
            r0 = r5
            R2.c r0 = (R2.c) r0
            int r1 = r0.f6704t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6704t = r1
            goto L18
        L13:
            R2.c r0 = new R2.c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f6703s
            int r1 = r0.f6704t
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            q6.g r4 = r0.f6702r
            Q2.v r0 = r0.f6701q
            m5.AbstractC1362a.e(r5)     // Catch: java.lang.Throwable -> L29
            goto L4f
        L29:
            r4 = move-exception
            goto L59
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            m5.AbstractC1362a.e(r5)
            q6.g r5 = new q6.g     // Catch: java.lang.Throwable -> L57
            r5.<init>()     // Catch: java.lang.Throwable -> L57
            r0.f6701q = r4     // Catch: java.lang.Throwable -> L57
            r0.f6702r = r5     // Catch: java.lang.Throwable -> L57
            r0.f6704t = r2     // Catch: java.lang.Throwable -> L57
            q6.i r0 = r4.f6586q     // Catch: java.lang.Throwable -> L57
            r0.T(r5)     // Catch: java.lang.Throwable -> L57
            m5.y r0 = m5.C1386y.f15098a     // Catch: java.lang.Throwable -> L57
            r5.a r1 = r5.EnumC1580a.f16356q
            if (r0 != r1) goto L4d
            return r1
        L4d:
            r0 = r4
            r4 = r5
        L4f:
            r5 = 0
            n5.AbstractC1397A.o(r0, r5)
            return r4
        L54:
            r0 = r4
            r4 = r5
            goto L59
        L57:
            r5 = move-exception
            goto L54
        L59:
            throw r4     // Catch: java.lang.Throwable -> L5a
        L5a:
            r5 = move-exception
            n5.AbstractC1397A.o(r0, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.K1.I(Q2.v, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void J(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long K(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void L(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z5 = onLongClickListener != null;
        boolean z6 = zHasOnClickListeners || z5;
        checkableImageButton.setFocusable(z6);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z5);
        checkableImageButton.setImportantForAccessibility(z6 ? 1 : 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String M(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f7 = f * fPow;
        int i = (int) f7;
        if (f7 - i >= 0.5f) {
            i++;
        }
        float f8 = i / fPow;
        return iMax > 0 ? String.valueOf(f8) : String.valueOf((int) f8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static InterfaceC0833n O(Object obj) {
        if (obj == null) {
            return InterfaceC0833n.f10908e;
        }
        if (obj instanceof String) {
            return new C0848q((String) obj);
        }
        if (obj instanceof Double) {
            return new C0798g((Double) obj);
        }
        if (obj instanceof Long) {
            return new C0798g(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C0798g(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C0788e((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            C0783d c0783d = new C0783d();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c0783d.r(c0783d.p(), O(it.next()));
            }
            return c0783d;
        }
        C0818k c0818k = new C0818k();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            InterfaceC0833n interfaceC0833nO = O(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                c0818k.k((String) string, interfaceC0833nO);
            }
        }
        return c0818k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static InterfaceC0833n P(F1 f12) {
        if (f12 == null) {
            return InterfaceC0833n.f10907d;
        }
        int iX = f12.x() - 1;
        if (iX == 1) {
            return f12.r() ? new C0848q(f12.s()) : InterfaceC0833n.f10911k;
        }
        if (iX == 2) {
            return f12.v() ? new C0798g(Double.valueOf(f12.w())) : new C0798g(null);
        }
        if (iX == 3) {
            return f12.t() ? new C0788e(Boolean.valueOf(f12.u())) : new C0788e(null);
        }
        if (iX != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listP = f12.p();
        ArrayList arrayList = new ArrayList();
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(P((F1) it.next()));
        }
        return new C0838o(arrayList, f12.q());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(T1.d dVar, Z.c cVar, X.e eVar, C0371o c0371o, int i) {
        c0371o.U(233973821);
        if ((((c0371o.i(dVar) ? 4 : 2) | i | (c0371o.i(cVar) ? 32 : 16)) & 147) == 146 && c0371o.x()) {
            c0371o.N();
        } else {
            C0345b.b(new C0368m0[]{Q1.a.f6524a.a(dVar), N1.a.f4029a.a(dVar), AbstractC1121a.f13442a.a(dVar)}, X.k.d(1808964477, new U1.m(1, cVar, eVar), c0371o), c0371o, 56);
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new U1.s(dVar, cVar, eVar, i, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(Z.c cVar, X.e eVar, C0371o c0371o, int i) {
        c0371o.U(832919318);
        int i7 = (c0371o.i(cVar) ? 4 : 2) | i | (c0371o.i(eVar) ? 32 : 16);
        if ((i7 & 19) == 18 && c0371o.x()) {
            c0371o.N();
        } else {
            Object objH = c0371o.H();
            if (objH == C0363k.f5418a) {
                objH = new I5.m(16);
                c0371o.d0(objH);
            }
            B5.c cVar2 = (B5.c) objH;
            androidx.lifecycle.l0 l0VarA = Q1.a.a(c0371o);
            if (l0VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            kotlin.jvm.internal.f fVarA = kotlin.jvm.internal.z.a(C0530a.class);
            D2.o oVar = new D2.o(1);
            oVar.a(kotlin.jvm.internal.z.a(C0530a.class), cVar2);
            P1.d dVarC = oVar.c();
            P1.c extras = l0VarA instanceof InterfaceC0648k ? ((InterfaceC0648k) l0VarA).e() : P1.a.f5609b;
            androidx.lifecycle.k0 store = l0VarA.f();
            kotlin.jvm.internal.m.e(store, "store");
            kotlin.jvm.internal.m.e(extras, "extras");
            E.c0 c0Var = new E.c0(store, dVarC, extras);
            String strB = fVarA.b();
            if (strB == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            C0530a c0530a = (C0530a) c0Var.v("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB), fVarA);
            c0530a.f7544d = new k3.d(cVar);
            cVar.f(c0530a.f7543c, eVar, c0371o, ((i7 << 6) & 896) | (i7 & 112));
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new R4.Z(i, 3, cVar, eVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean c(f0.f fVar, long j) {
        if (!fVar.f10100q.f10099D) {
            return false;
        }
        C0056v c0056v = AbstractC0041g.u(fVar).f268U.f430b;
        if (!c0056v.f517a0.f10099D) {
            return false;
        }
        long jF = c0056v.F(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jF >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jF & 4294967295L));
        long j7 = fVar.f12689G;
        float f = ((int) (j7 >> 32)) + fIntBitsToFloat;
        float f7 = ((int) (j7 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean d(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (kotlin.jvm.internal.m.f(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void e(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object f(InterfaceC0048m interfaceC0048m, C.k kVar, s5.i iVar) {
        Object obj;
        B0.n0 n0VarT;
        Object objX;
        C0042g0 c0042g0;
        AbstractC0724l abstractC0724l = (AbstractC0724l) interfaceC0048m;
        boolean z5 = abstractC0724l.f10100q.f10099D;
        if (z5) {
            if (!z5) {
                AbstractC1904a.b("visitAncestors called on an unattached node");
            }
            AbstractC0724l abstractC0724l2 = abstractC0724l.f10100q.f10104u;
            B0.L lU = AbstractC0041g.u(interfaceC0048m);
            loop0: while (true) {
                obj = null;
                if (lU == null) {
                    break;
                }
                if ((lU.f268U.f433e.f10103t & 524288) != 0) {
                    while (abstractC0724l2 != null) {
                        if ((abstractC0724l2.f10102s & 524288) != 0) {
                            AbstractC0724l abstractC0724lF = abstractC0724l2;
                            R.e eVar = null;
                            while (abstractC0724lF != null) {
                                if (abstractC0724lF instanceof F0.a) {
                                    obj = abstractC0724lF;
                                    break loop0;
                                }
                                if ((abstractC0724lF.f10102s & 524288) != 0 && (abstractC0724lF instanceof AbstractC0049n)) {
                                    int i = 0;
                                    for (AbstractC0724l abstractC0724l3 = ((AbstractC0049n) abstractC0724lF).f473F; abstractC0724l3 != null; abstractC0724l3 = abstractC0724l3.f10105v) {
                                        if ((abstractC0724l3.f10102s & 524288) != 0) {
                                            i++;
                                            if (i == 1) {
                                                abstractC0724lF = abstractC0724l3;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new R.e(new AbstractC0724l[16]);
                                                }
                                                if (abstractC0724lF != null) {
                                                    eVar.c(abstractC0724lF);
                                                    abstractC0724lF = null;
                                                }
                                                eVar.c(abstractC0724l3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                abstractC0724lF = AbstractC0041g.f(eVar);
                            }
                        }
                        abstractC0724l2 = abstractC0724l2.f10104u;
                    }
                }
                lU = lU.s();
                abstractC0724l2 = (lU == null || (c0042g0 = lU.f268U) == null) ? null : c0042g0.f432d;
            }
            F0.a aVar = (F0.a) obj;
            if (aVar != null && (objX = aVar.X((n0VarT = AbstractC0041g.t(interfaceC0048m)), new B0.K(10, kVar, n0VarT), iVar)) == EnumC1580a.f16356q) {
                return objX;
            }
        }
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void i(int i, int i7, int i8) {
        if (i >= 0 && i7 <= i8) {
            if (i > i7) {
                throw new IllegalArgumentException(C0.S.j(i, i7, "startIndex: ", " > endIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("startIndex: " + i + ", endIndex: " + i7 + ", size: " + i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void j(int i, int i7, int i8) {
        if (i >= 0 && i7 <= i8) {
            if (i > i7) {
                throw new IllegalArgumentException(C0.S.j(i, i7, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i7 + ", size: " + i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ImageView.ScaleType m(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void n(q6.l lVar, q6.x xVar) throws IOException {
        try {
            IOException iOException = null;
            for (q6.x xVar2 : lVar.z(xVar)) {
                try {
                    if (lVar.G(xVar2).f12513c) {
                        n(lVar, xVar2);
                    }
                    lVar.f(xVar2);
                } catch (IOException e7) {
                    if (iOException == null) {
                        iOException = e7;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static d6.k o(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        List listI = n5.s.f15299q;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        d6.g gVarC = d6.g.f12320b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        d6.y yVarQ = AbstractC1397A.q(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        List listI2 = peerCertificates != null ? e6.b.i(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listI;
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            listI = e6.b.i(Arrays.copyOf(localCertificates, localCertificates.length));
        }
        return new d6.k(yVarQ, gVarC, listI, new C0149c(1, listI2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int p(O0.j jVar, int i) {
        boolean z5 = kotlin.jvm.internal.m.f(jVar.f4284q, O0.j.f4280r.f4284q) >= 0;
        boolean z6 = i == 1;
        if (z6 && z5) {
            return 3;
        }
        if (z5) {
            return 1;
        }
        return z6 ? 2 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float q(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return A1.d.b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object r(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return b.f.b(str, bundle);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (C1008a.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int u(int i, int i7) {
        return (i >> i7) & 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void v(WebView webView, C0468k1 dataObject) {
        String str;
        kotlin.jvm.internal.m.e(dataObject, "dataObject");
        C0458i c0458i = dataObject.f7073d;
        if (c0458i != null) {
            try {
                str = c0458i.f7005k;
            } catch (Exception e7) {
                e7.printStackTrace();
                return;
            }
        } else {
            str = null;
        }
        if (kotlin.jvm.internal.m.a(str, "")) {
            return;
        }
        String str2 = c0458i != null ? c0458i.f7005k : null;
        kotlin.jvm.internal.m.b(str2);
        byte[] bytes = str2.getBytes(J5.a.f2809a);
        kotlin.jvm.internal.m.d(bytes, "getBytes(...)");
        webView.loadUrl("javascript:(function() {var parent = document.getElementsByTagName('head').item(0);var style = document.createElement('style');style.type = 'text/css';style.innerHTML = window.atob('" + Base64.encodeToString(bytes, 2) + "');parent.appendChild(style)})()");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static I5.j w(B5.e eVar) {
        I5.j jVar = new I5.j();
        jVar.f2440s = AbstractC1397A.p(eVar, jVar, jVar);
        return jVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void x(String key) {
        kotlin.jvm.internal.m.e(key, "key");
        throw new IllegalArgumentException(C0.S.n("No valid saved state was found for the key '", key, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Z.m y(B5.e eVar, B5.c cVar) {
        A.e0 e0Var = new A.e0(eVar);
        kotlin.jvm.internal.B.b(1, cVar);
        Z.m mVar = Z.n.f8314a;
        return new Z.m(0, e0Var, cVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final P.W z(androidx.lifecycle.J j, Object obj, C0371o c0371o, int i) {
        InterfaceC0660x interfaceC0660x = (InterfaceC0660x) c0371o.k(N1.a.f4029a);
        Object objH = c0371o.H();
        P.S s6 = C0363k.f5418a;
        if (objH == s6) {
            if (j.f9489e != androidx.lifecycle.G.f9484k) {
                obj = j.d();
            }
            objH = C0345b.q(obj);
            c0371o.d0(objH);
        }
        P.W w3 = (P.W) objH;
        boolean zI = c0371o.i(j) | c0371o.i(interfaceC0660x);
        Object objH2 = c0371o.H();
        if (zI || objH2 == s6) {
            objH2 = new A.J(j, interfaceC0660x, w3, 3);
            c0371o.d0(objH2);
        }
        C0345b.d(j, interfaceC0660x, (B5.c) objH2, c0371o);
        return w3;
    }

    public abstract void A(int i);

    public abstract void B(Typeface typeface, boolean z5);

    public abstract void E(int i);

    public abstract void F(View view, int i, int i7);

    public abstract void G(View view, float f, float f7);

    public abstract boolean N(View view, int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC1697b g(Context context, Looper looper, p3.z0 z0Var, Object obj, u3.e eVar, u3.f fVar) {
        return h(context, looper, z0Var, obj, (v3.o) eVar, (v3.o) fVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC1697b h(Context context, Looper looper, p3.z0 z0Var, Object obj, v3.o oVar, v3.o oVar2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract int k(View view, int i);

    public abstract int l(View view, int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int s(View view) {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int t() {
        return 0;
    }

    public void D(View view, int i) {
    }
}
