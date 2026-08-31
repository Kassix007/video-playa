package E3;

import A.AbstractC0012i;
import A.AbstractC0017n;
import A.C0007d;
import A.C0009f;
import A.C0011h;
import A.C0022t;
import A.C0023u;
import A.L;
import A.O;
import A.Q;
import A.d0;
import B0.C0044i;
import B0.C0045j;
import B0.G0;
import B0.InterfaceC0046k;
import B0.n0;
import C0.AbstractC0103t0;
import C0.S;
import C0.W;
import E.Y;
import F.C;
import F.C0147a;
import F.C0151e;
import F.C0162p;
import J5.t;
import L0.s;
import L0.y;
import L0.z;
import M.N0;
import M5.C0256q;
import M5.InterfaceC0261w;
import O3.B;
import O3.D;
import P.C0345b;
import P.C0348c0;
import P.C0363k;
import P.C0371o;
import P.C0372o0;
import P.InterfaceC0360i0;
import R4.C0435c0;
import R4.C0468k1;
import R4.C0517x;
import R4.O1;
import R4.R1;
import R4.U1;
import R4.Z;
import U4.AbstractC0534a;
import U4.C0547n;
import U4.X;
import V0.n;
import V0.q;
import a.AbstractC0597a;
import a3.F;
import a3.o;
import a6.AbstractC0637c;
import a6.C0636b;
import a6.EnumC0635a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Trace;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.MimeTypeMap;
import androidx.compose.foundation.layout.FillElement;
import c0.AbstractC0727o;
import c0.C0714b;
import c0.C0716d;
import c0.C0717e;
import c0.C0722j;
import c0.InterfaceC0725m;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.gms.internal.measurement.P1;
import com.web2native.MainActivity;
import d2.AbstractC0960G;
import d2.C0971S;
import d6.r;
import e3.p;
import h5.AbstractC1127b;
import i0.C1131c;
import j0.AbstractC1145B;
import j0.C1152g;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.m;
import l0.AbstractC1220c;
import l0.C1223f;
import l0.InterfaceC1221d;
import m5.C1386y;
import n5.AbstractC1397A;
import n5.l;
import org.json.JSONException;
import org.json.JSONObject;
import p2.AbstractC1443a;
import q5.C1530i;
import q5.InterfaceC1527f;
import q5.InterfaceC1528g;
import q5.InterfaceC1529h;
import r.C1548G;
import t.K;
import u.AbstractC1644d;
import u.C1649f0;
import u.C1667v;
import u.I0;
import u0.InterfaceC1672a;
import u2.u;
import v.C1717l;
import w.EnumC1778d0;
import x.AbstractC1880l;
import x.C1876h;
import x.C1881m;
import z0.AbstractC1938O;
import z0.InterfaceC1926C;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ClassLoader f1712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Thread f1713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Field f1714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f1715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Class f1716e;
    public static boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Field f1717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f1718h;
    public static Field i;
    public static boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static long f1719k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Method f1720l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static Method f1721m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Method f1722n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static InterfaceC1527f A(InterfaceC1527f interfaceC1527f, InterfaceC1528g key) {
        kotlin.jvm.internal.m.e(key, "key");
        if (kotlin.jvm.internal.m.a(interfaceC1527f.getKey(), key)) {
            return interfaceC1527f;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String B(String str) {
        if (J5.m.U0(str)) {
            return null;
        }
        String strL1 = J5.m.l1(J5.m.l1(str, '#'), '?');
        String strI1 = J5.m.i1('.', J5.m.i1('/', strL1, strL1), "");
        if (J5.m.U0(strI1)) {
            return null;
        }
        String lowerCase = strI1.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        String str2 = (String) Y2.g.f8211a.get(lowerCase);
        return str2 == null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase) : str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int C(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void D(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean E() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC1443a.c();
        }
        try {
            if (f1720l == null) {
                f1719k = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f1720l = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f1720l.invoke(null, Long.valueOf(f1719k))).booleanValue();
        } catch (Exception e7) {
            D("isTagEnabled", e7);
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean F(C0151e c0151e, float f7) {
        c0151e.k().getClass();
        return !(((c0151e.p() ? -f7 : y(c0151e)) > 0.0f ? 1 : ((c0151e.p() ? -f7 : y(c0151e)) == 0.0f ? 0 : -1)) > 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Bundle G(String str) {
        JSONObject jSONObject;
        if (str != null && str.length() != 0) {
            if (str == null) {
                jSONObject = null;
            } else {
                try {
                    jSONObject = new JSONObject(str);
                } catch (JSONException unused) {
                }
            }
            if (jSONObject == null) {
                return null;
            }
            Bundle bundle = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.getString(next));
            }
            return bundle;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final F H(Context context, p pVar, String str) {
        if (!(pVar instanceof p)) {
            throw new C2.e();
        }
        if (!kotlin.jvm.internal.m.a(str, "__LottieInternalDefaultCacheKey__")) {
            return o.f(context, pVar.f12610a, str);
        }
        int i7 = pVar.f12610a;
        return o.f(context, i7, o.l(context, i7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static InterfaceC1529h I(InterfaceC1527f interfaceC1527f, InterfaceC1528g key) {
        kotlin.jvm.internal.m.e(key, "key");
        return kotlin.jvm.internal.m.a(interfaceC1527f.getKey(), key) ? C1530i.f16022q : interfaceC1527f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0725m J(InterfaceC0725m interfaceC0725m) {
        return AbstractC0727o.a(interfaceC0725m, new d0(3, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Y K(String statusLine) throws ProtocolException {
        int i7;
        String strSubstring;
        kotlin.jvm.internal.m.e(statusLine, "statusLine");
        boolean zG0 = t.G0(statusLine, "HTTP/1.", false);
        r rVar = r.HTTP_1_0;
        if (zG0) {
            i7 = 9;
            if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            int iCharAt = statusLine.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                rVar = r.HTTP_1_1;
            }
        } else {
            if (!t.G0(statusLine, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            i7 = 4;
        }
        int i8 = i7 + 3;
        if (statusLine.length() < i8) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
        try {
            String strSubstring2 = statusLine.substring(i7, i8);
            kotlin.jvm.internal.m.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            int i9 = Integer.parseInt(strSubstring2);
            if (statusLine.length() <= i8) {
                strSubstring = "";
            } else {
                if (statusLine.charAt(i8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                strSubstring = statusLine.substring(i7 + 4);
                kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String).substring(startIndex)");
            }
            return new Y(rVar, i9, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static InterfaceC1529h L(InterfaceC1527f interfaceC1527f, InterfaceC1529h context) {
        kotlin.jvm.internal.m.e(context, "context");
        return context == C1530i.f16022q ? interfaceC1527f : (InterfaceC1529h) context.fold(interfaceC1527f, new C0256q(14, (byte) 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String M(String str, String str2) {
        String strSubstring = str2.substring(str.length(), str2.length());
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final L0.F N(L0.F f7, W0.l lVar) {
        V0.p pVar;
        long j7;
        O0.j jVar;
        O0.h hVar;
        R0.b bVar;
        y yVar = f7.f3091a;
        V0.p pVar2 = z.f3242d;
        V0.p pVar3 = yVar.f3227a;
        if (pVar3.equals(n.f7941a)) {
            pVar3 = z.f3242d;
        }
        V0.p pVar4 = pVar3;
        long j8 = yVar.f3228b;
        W0.o[] oVarArr = W0.n.f8026b;
        if ((j8 & 1095216660480L) == 0) {
            j8 = z.f3239a;
        }
        long j9 = j8;
        O0.j jVar2 = yVar.f3229c;
        if (jVar2 == null) {
            jVar2 = O0.j.f4281s;
        }
        O0.j jVar3 = jVar2;
        O0.h hVar2 = yVar.f3230d;
        O0.h hVar3 = new O0.h(hVar2 != null ? hVar2.f4278a : 0);
        O0.i iVar = yVar.f3231e;
        O0.i iVar2 = new O0.i(iVar != null ? iVar.f4279a : 65535);
        O0.p pVar5 = yVar.f;
        if (pVar5 == null) {
            pVar5 = O0.p.f4287a;
        }
        O0.p pVar6 = pVar5;
        String str = yVar.f3232g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j10 = yVar.f3233h;
        if ((j10 & 1095216660480L) == 0) {
            j10 = z.f3240b;
        }
        V0.a aVar = yVar.i;
        V0.a aVar2 = new V0.a(aVar != null ? aVar.f7918a : 0.0f);
        q qVar = yVar.j;
        if (qVar == null) {
            qVar = q.f7944c;
        }
        q qVar2 = qVar;
        R0.b bVar2 = yVar.f3234k;
        if (bVar2 == null) {
            R0.b bVar3 = R0.b.f6691s;
            G0 g02 = R0.c.f6694a;
            g02.getClass();
            LocaleList localeList = LocaleList.getDefault();
            pVar = pVar4;
            synchronized (((D) g02.f236t)) {
                j7 = j9;
                try {
                    bVar = (R0.b) g02.f235s;
                    if (bVar == null || localeList != ((LocaleList) g02.f234r)) {
                        int size = localeList.size();
                        ArrayList arrayList = new ArrayList(size);
                        jVar = jVar3;
                        int i7 = 0;
                        while (i7 < size) {
                            arrayList.add(new R0.a(localeList.get(i7)));
                            i7++;
                            size = size;
                            hVar3 = hVar3;
                        }
                        hVar = hVar3;
                        bVar = new R0.b(arrayList);
                        g02.f234r = localeList;
                        g02.f235s = bVar;
                    } else {
                        jVar = jVar3;
                        hVar = hVar3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            bVar2 = bVar;
        } else {
            pVar = pVar4;
            j7 = j9;
            jVar = jVar3;
            hVar = hVar3;
        }
        R0.b bVar4 = bVar2;
        long j11 = yVar.f3235l;
        if (j11 == 16) {
            j11 = z.f3241c;
        }
        V0.l lVar2 = yVar.f3236m;
        if (lVar2 == null) {
            lVar2 = V0.l.f7937b;
        }
        j0.D d5 = yVar.f3237n;
        if (d5 == null) {
            d5 = j0.D.f13677d;
        }
        AbstractC1220c abstractC1220c = yVar.f3238o;
        if (abstractC1220c == null) {
            abstractC1220c = C1223f.f14430b;
        }
        y yVar2 = new y(pVar, j7, jVar, hVar, iVar2, pVar6, str2, j10, aVar2, qVar2, bVar4, j11, lVar2, d5, abstractC1220c);
        L0.q qVar3 = f7.f3092b;
        int i8 = L0.r.f3174b;
        int i9 = qVar3.f3166a;
        int i10 = 5;
        if (i9 == Integer.MIN_VALUE) {
            i9 = 5;
        }
        int i11 = qVar3.f3167b;
        if (i11 == 3) {
            int iOrdinal = lVar.ordinal();
            if (iOrdinal == 0) {
                i10 = 4;
            } else if (iOrdinal != 1) {
                throw new C2.e();
            }
        } else if (i11 == Integer.MIN_VALUE) {
            int iOrdinal2 = lVar.ordinal();
            if (iOrdinal2 == 0) {
                i10 = 1;
            } else {
                if (iOrdinal2 != 1) {
                    throw new C2.e();
                }
                i10 = 2;
            }
        } else {
            i10 = i11;
        }
        long j12 = qVar3.f3168c;
        if ((j12 & 1095216660480L) == 0) {
            j12 = L0.r.f3173a;
        }
        V0.r rVar = qVar3.f3169d;
        if (rVar == null) {
            rVar = V0.r.f7947c;
        }
        s sVar = qVar3.f3170e;
        V0.r rVar2 = rVar;
        V0.i iVar3 = qVar3.f;
        int i12 = qVar3.f3171g;
        if (i12 == 0) {
            i12 = V0.e.f7923b;
        }
        int i13 = qVar3.f3172h;
        if (i13 == Integer.MIN_VALUE) {
            i13 = 1;
        }
        V0.t tVar = qVar3.i;
        if (tVar == null) {
            tVar = V0.t.f7951c;
        }
        return new L0.F(yVar2, new L0.q(i9, i10, j12, rVar2, sVar, iVar3, i12, i13, tVar), f7.f3093c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String O(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void P(I0.m mVar, int i7, H0.k kVar) {
        I0.m mVar2;
        R.e eVar = new R.e(new I0.m[16]);
        List listG = mVar.g(false, false);
        while (true) {
            eVar.e(eVar.f6678s, listG);
            while (true) {
                int i8 = eVar.f6678s;
                if (i8 == 0) {
                    return;
                }
                mVar2 = (I0.m) eVar.m(i8 - 1);
                boolean zJ = W.j(mVar2);
                I0.i iVar = mVar2.f2268d;
                C1548G c1548g = iVar.f2257q;
                if (!zJ && !c1548g.c(I0.p.i)) {
                    n0 n0VarC = mVar2.c();
                    if (n0VarC == null) {
                        throw S.i("Expected semantics node to have a coordinator.");
                    }
                    C1131c c1131cE = AbstractC1938O.e(n0VarC);
                    int iRound = Math.round(c1131cE.f13522a);
                    int iRound2 = Math.round(c1131cE.f13523b);
                    int iRound3 = Math.round(c1131cE.f13524c);
                    int iRound4 = Math.round(c1131cE.f13525d);
                    W0.j jVar = new W0.j(iRound, iRound2, iRound3, iRound4);
                    if (iRound < iRound3 && iRound2 < iRound4) {
                        Object objG = iVar.f2257q.g(I0.h.f2238e);
                        if (objG == null) {
                            objG = null;
                        }
                        B5.e eVar2 = (B5.e) objG;
                        Object objG2 = c1548g.g(I0.p.f2318t);
                        I0.g gVar = (I0.g) (objG2 != null ? objG2 : null);
                        if (eVar2 == null || gVar == null || ((Number) gVar.f2232b.invoke()).floatValue() <= 0.0f) {
                            break;
                        }
                        int i9 = i7 + 1;
                        kVar.invoke(new H0.l(mVar2, i9, jVar, n0VarC));
                        P(mVar2, i9, kVar);
                    }
                }
            }
            listG = mVar2.g(false, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int Q(int i7) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i8 = 0; i8 < 6; i8++) {
            int i9 = iArr[i8];
            int i10 = i9 - 1;
            if (i9 == 0) {
                throw null;
            }
            if (i10 == i7) {
                return i9;
            }
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ab A[Catch: all -> 0x00a7, PHI: r1
  0x00ab: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v15 java.lang.Thread) binds: [B:7:0x000a, B:47:0x00a4] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:46:0x00a2, B:61:0x00d1, B:12:0x001f, B:52:0x00aa, B:53:0x00ab, B:64:0x00d5, B:65:0x00d6, B:54:0x00ac, B:60:0x00d0, B:59:0x00b6, B:13:0x0020, B:15:0x002d, B:25:0x0047, B:26:0x004e, B:28:0x0059, B:34:0x006e, B:35:0x0075, B:43:0x0086, B:44:0x00a0, B:18:0x003c), top: B:77:0x0003, inners: #2, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.ClassLoader R() {
        /*
            java.lang.Class<E3.h> r0 = E3.h.class
            monitor-enter(r0)
            java.lang.ClassLoader r1 = E3.h.f1712a     // Catch: java.lang.Throwable -> La7
            if (r1 != 0) goto Ld6
            java.lang.Thread r1 = E3.h.f1713b     // Catch: java.lang.Throwable -> La7
            r2 = 0
            if (r1 != 0) goto Lab
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> La7
            java.lang.Thread r1 = r1.getThread()     // Catch: java.lang.Throwable -> La7
            java.lang.ThreadGroup r1 = r1.getThreadGroup()     // Catch: java.lang.Throwable -> La7
            if (r1 != 0) goto L1d
            r1 = r2
            goto La2
        L1d:
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            monitor-enter(r3)     // Catch: java.lang.Throwable -> La7
            int r4 = r1.activeGroupCount()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L42
            java.lang.ThreadGroup[] r5 = new java.lang.ThreadGroup[r4]     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L42
            r1.enumerate(r5)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L42
            r6 = 0
            r7 = r6
        L2b:
            if (r7 >= r4) goto L44
            r8 = r5[r7]     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L42
            java.lang.String r9 = "dynamiteLoader"
            java.lang.String r10 = r8.getName()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L42
            boolean r9 = r9.equals(r10)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L42
            if (r9 == 0) goto L3c
            goto L45
        L3c:
            int r7 = r7 + 1
            goto L2b
        L3f:
            r1 = move-exception
            goto La9
        L42:
            r1 = move-exception
            goto L84
        L44:
            r8 = r2
        L45:
            if (r8 != 0) goto L4e
            java.lang.ThreadGroup r8 = new java.lang.ThreadGroup     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L42
            java.lang.String r4 = "dynamiteLoader"
            r8.<init>(r1, r4)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L42
        L4e:
            int r1 = r8.activeCount()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L42
            java.lang.Thread[] r4 = new java.lang.Thread[r1]     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L42
            r8.enumerate(r4)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L42
        L57:
            if (r6 >= r1) goto L6b
            r5 = r4[r6]     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L42
            java.lang.String r7 = "GmsDynamite"
            java.lang.String r9 = r5.getName()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L42
            boolean r7 = r7.equals(r9)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L42
            if (r7 == 0) goto L68
            goto L6c
        L68:
            int r6 = r6 + 1
            goto L57
        L6b:
            r5 = r2
        L6c:
            if (r5 != 0) goto La0
            E3.g r1 = new E3.g     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L82
            java.lang.String r4 = "GmsDynamite"
            r1.<init>(r8, r4)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L82
            r1.setContextClassLoader(r2)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L7d
            r1.start()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L7d
            r5 = r1
            goto La0
        L7d:
            r4 = move-exception
            r5 = r1
            goto L86
        L80:
            r4 = r1
            goto L86
        L82:
            r1 = move-exception
            goto L80
        L84:
            r4 = r1
            r5 = r2
        L86:
            java.lang.String r1 = "DynamiteLoaderV2CL"
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L3f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r6.<init>()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r7 = "Failed to enumerate thread/threadgroup "
            r6.append(r7)     // Catch: java.lang.Throwable -> L3f
            r6.append(r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L3f
            android.util.Log.w(r1, r4)     // Catch: java.lang.Throwable -> L3f
        La0:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3f
            r1 = r5
        La2:
            E3.h.f1713b = r1     // Catch: java.lang.Throwable -> La7
            if (r1 != 0) goto Lab
            goto Ld1
        La7:
            r1 = move-exception
            goto Lda
        La9:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3f
            throw r1     // Catch: java.lang.Throwable -> La7
        Lab:
            monitor-enter(r1)     // Catch: java.lang.Throwable -> La7
            java.lang.Thread r3 = E3.h.f1713b     // Catch: java.lang.Throwable -> Lb3 java.lang.SecurityException -> Lb5
            java.lang.ClassLoader r2 = r3.getContextClassLoader()     // Catch: java.lang.Throwable -> Lb3 java.lang.SecurityException -> Lb5
            goto Ld0
        Lb3:
            r2 = move-exception
            goto Ld4
        Lb5:
            r3 = move-exception
            java.lang.String r4 = "DynamiteLoaderV2CL"
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> Lb3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb3
            r5.<init>()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r6 = "Failed to get thread context classloader "
            r5.append(r6)     // Catch: java.lang.Throwable -> Lb3
            r5.append(r3)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> Lb3
            android.util.Log.w(r4, r3)     // Catch: java.lang.Throwable -> Lb3
        Ld0:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb3
        Ld1:
            E3.h.f1712a = r2     // Catch: java.lang.Throwable -> La7
            goto Ld6
        Ld4:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb3
            throw r2     // Catch: java.lang.Throwable -> La7
        Ld6:
            java.lang.ClassLoader r1 = E3.h.f1712a     // Catch: java.lang.Throwable -> La7
            monitor-exit(r0)
            return r1
        Lda:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La7
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.h.R():java.lang.ClassLoader");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(List list, B5.c onClick, C0371o c0371o, int i7) {
        boolean z5;
        kotlin.jvm.internal.m.e(onClick, "onClick");
        c0371o.U(-2108089152);
        int i8 = (c0371o.i(list) ? 4 : 2) | i7 | (c0371o.i(onClick) ? 32 : 16);
        if (c0371o.K(i8 & 1, (i8 & 19) != 18)) {
            FillElement fillElement = androidx.compose.foundation.layout.c.f9277a;
            InterfaceC1926C interfaceC1926CD = AbstractC0017n.d(C0714b.f10076q, false);
            int i9 = c0371o.f5454P;
            InterfaceC0360i0 interfaceC0360i0M = c0371o.m();
            InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o, fillElement);
            InterfaceC0046k.f452a.getClass();
            B0.D d5 = C0045j.f445b;
            c0371o.W();
            if (c0371o.f5453O) {
                c0371o.l(d5);
            } else {
                c0371o.g0();
            }
            C0044i c0044i = C0045j.f448e;
            C0345b.u(c0044i, c0371o, interfaceC1926CD);
            C0044i c0044i2 = C0045j.f447d;
            C0345b.u(c0044i2, c0371o, interfaceC0360i0M);
            C0044i c0044i3 = C0045j.f;
            if (c0371o.f5453O || !kotlin.jvm.internal.m.a(c0371o.H(), Integer.valueOf(i9))) {
                k1.i.o(i9, c0371o, i9, c0044i3);
            }
            C0044i c0044i4 = C0045j.f446c;
            C0345b.u(c0044i4, c0371o, interfaceC0725mC);
            InterfaceC0725m interfaceC0725mB = androidx.compose.foundation.layout.b.b(fillElement, 10, 7);
            C0716d c0716d = C0714b.f10072A;
            C0007d c0007d = AbstractC0012i.f106a;
            Q qA = O.a(new C0009f(5, true, C0011h.f105q), c0716d, c0371o, 54);
            int i10 = c0371o.f5454P;
            InterfaceC0360i0 interfaceC0360i0M2 = c0371o.m();
            InterfaceC0725m interfaceC0725mC2 = AbstractC0727o.c(c0371o, interfaceC0725mB);
            c0371o.W();
            if (c0371o.f5453O) {
                c0371o.l(d5);
            } else {
                c0371o.g0();
            }
            C0345b.u(c0044i, c0371o, qA);
            C0345b.u(c0044i2, c0371o, interfaceC0360i0M2);
            if (c0371o.f5453O || !kotlin.jvm.internal.m.a(c0371o.H(), Integer.valueOf(i10))) {
                k1.i.o(i10, c0371o, i10, c0044i3);
            }
            C0345b.u(c0044i4, c0371o, interfaceC0725mC2);
            if (list == null) {
                c0371o.S(-484525375);
            } else {
                c0371o.S(-484525374);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C0517x c0517x = (C0517x) it.next();
                    if (c0517x != null) {
                        c0371o.S(957679564);
                        b(A.S.a(), c0517x, 0.0f, onClick, c0371o, (i8 << 6) & 7168, 4);
                        z5 = false;
                    } else {
                        z5 = false;
                        c0371o.S(947387006);
                    }
                    c0371o.p(z5);
                }
            }
            c0371o.p(false);
            c0371o.p(true);
            c0371o.p(true);
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new Z(i7, 9, list, onClick);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(c0.InterfaceC0725m r30, final R4.C0517x r31, float r32, final B5.c r33, P.C0371o r34, final int r35, final int r36) {
        /*
            r2 = r31
            r4 = r33
            r10 = r34
            r0 = r35
            java.lang.String r1 = r2.f7206c
            java.lang.Integer r3 = r2.f7207d
            java.lang.Integer r5 = r2.f7205b
            java.lang.String r6 = "onClick"
            kotlin.jvm.internal.m.e(r4, r6)
            r6 = -1955854689(0xffffffff8b6c069f, float:-4.5456928E-32)
            r10.U(r6)
            r6 = r36 & 1
            if (r6 == 0) goto L23
            r7 = r0 | 6
            r8 = r7
            r7 = r30
            goto L37
        L23:
            r7 = r0 & 6
            if (r7 != 0) goto L34
            r7 = r30
            boolean r8 = r10.g(r7)
            if (r8 == 0) goto L31
            r8 = 4
            goto L32
        L31:
            r8 = 2
        L32:
            r8 = r8 | r0
            goto L37
        L34:
            r7 = r30
            r8 = r0
        L37:
            r9 = r0 & 48
            r11 = 16
            if (r9 != 0) goto L48
            boolean r9 = r10.g(r2)
            if (r9 == 0) goto L46
            r9 = 32
            goto L47
        L46:
            r9 = r11
        L47:
            r8 = r8 | r9
        L48:
            r9 = r36 & 4
            if (r9 == 0) goto L51
            r8 = r8 | 384(0x180, float:5.38E-43)
        L4e:
            r13 = r32
            goto L63
        L51:
            r13 = r0 & 384(0x180, float:5.38E-43)
            if (r13 != 0) goto L4e
            r13 = r32
            boolean r14 = r10.d(r13)
            if (r14 == 0) goto L60
            r14 = 256(0x100, float:3.59E-43)
            goto L62
        L60:
            r14 = 128(0x80, float:1.794E-43)
        L62:
            r8 = r8 | r14
        L63:
            r14 = r0 & 3072(0xc00, float:4.305E-42)
            if (r14 != 0) goto L73
            boolean r14 = r10.i(r4)
            if (r14 == 0) goto L70
            r14 = 2048(0x800, float:2.87E-42)
            goto L72
        L70:
            r14 = 1024(0x400, float:1.435E-42)
        L72:
            r8 = r8 | r14
        L73:
            r14 = r8 & 1171(0x493, float:1.641E-42)
            r12 = 1170(0x492, float:1.64E-42)
            r15 = 1
            if (r14 == r12) goto L7c
            r12 = r15
            goto L7d
        L7c:
            r12 = 0
        L7d:
            r14 = r8 & 1
            boolean r12 = r10.K(r14, r12)
            if (r12 == 0) goto L1df
            if (r6 == 0) goto L8b
            c0.j r6 = c0.C0722j.f10095q
            r14 = r6
            goto L8c
        L8b:
            r14 = r7
        L8c:
            if (r9 == 0) goto L90
            float r6 = (float) r11
            r13 = r6
        L90:
            if (r5 == 0) goto L9a
            int r6 = r5.intValue()
            float r6 = (float) r6
            r7 = r6
            r6 = 0
            goto L9c
        L9a:
            r6 = 0
            float r7 = (float) r6
        L9c:
            r9 = 1068708659(0x3fb33333, float:1.4)
            float r7 = r7 * r9
            androidx.compose.foundation.layout.FillElement r9 = androidx.compose.foundation.layout.c.f9277a
            c0.m r9 = r14.d(r9)
            if (r5 == 0) goto Lae
            int r5 = r5.intValue()
            float r5 = (float) r5
            goto Laf
        Lae:
            float r5 = (float) r6
        Laf:
            if (r3 == 0) goto Lb6
            int r11 = r3.intValue()
            goto Lb7
        Lb6:
            r11 = r6
        Lb7:
            H.d r11 = H.e.a(r11)
            java.lang.String r12 = r2.f7204a
            if (r12 != 0) goto Lc5
            if (r1 != 0) goto Lc4
            java.lang.String r12 = "#FFFFFFF"
            goto Lc5
        Lc4:
            r12 = r1
        Lc5:
            int r12 = android.graphics.Color.parseColor(r12)
            r30 = r7
            long r6 = j0.AbstractC1145B.b(r12)
            j0.G r12 = new j0.G
            r12.<init>(r6)
            androidx.compose.foundation.BorderModifierNodeElement r6 = new androidx.compose.foundation.BorderModifierNodeElement
            r6.<init>(r5, r12, r11)
            c0.m r5 = r9.d(r6)
            float r6 = (float) r15
            c0.m r5 = androidx.compose.foundation.layout.b.a(r5, r6)
            r6 = r8 & 7168(0x1c00, float:1.0045E-41)
            r7 = 2048(0x800, float:2.87E-42)
            if (r6 != r7) goto Lea
            r6 = r15
            goto Leb
        Lea:
            r6 = 0
        Leb:
            r7 = r8 & 112(0x70, float:1.57E-43)
            r8 = 32
            if (r7 != r8) goto Lf2
            goto Lf3
        Lf2:
            r15 = 0
        Lf3:
            r6 = r6 | r15
            java.lang.Object r7 = r10.H()
            if (r6 != 0) goto Lfe
            P.S r6 = P.C0363k.f5418a
            if (r7 != r6) goto L107
        Lfe:
            I2.e r7 = new I2.e
            r6 = 5
            r7.<init>(r6, r4, r2)
            r10.d0(r7)
        L107:
            B5.a r7 = (B5.a) r7
            c0.m r5 = androidx.compose.foundation.a.d(r5, r7)
            if (r1 != 0) goto L111
            java.lang.String r1 = "#FF2452"
        L111:
            int r1 = android.graphics.Color.parseColor(r1)
            long r6 = j0.AbstractC1145B.b(r1)
            java.lang.String r1 = r2.f
            if (r1 != 0) goto L11f
            java.lang.String r1 = "#FFFFFF"
        L11f:
            int r1 = android.graphics.Color.parseColor(r1)
            long r8 = j0.AbstractC1145B.b(r1)
            long r11 = j0.o.f13722g
            r1 = 1052938076(0x3ec28f5c, float:0.38)
            long r15 = j0.o.b(r8, r1)
            P.T0 r1 = M.AbstractC0217k.f3553a
            java.lang.Object r1 = r10.k(r1)
            M.i r1 = (M.C0213i) r1
            M.e r0 = r1.f3509K
            if (r0 != 0) goto L17f
            M.e r18 = new M.e
            float r0 = O.f.f4115a
            r0 = 39
            long r19 = M.AbstractC0217k.d(r1, r0)
            r17 = r3
            long r3 = M.AbstractC0217k.d(r1, r0)
            long r21 = M.AbstractC0217k.a(r1, r3)
            int r3 = O.f.f4116b
            long r3 = M.AbstractC0217k.d(r1, r3)
            r27 = r5
            float r5 = O.f.f4118d
            long r3 = j0.o.b(r3, r5)
            r28 = r6
            long r5 = M.AbstractC0217k.d(r1, r0)
            long r23 = j0.AbstractC1145B.i(r3, r5)
            long r3 = M.AbstractC0217k.d(r1, r0)
            long r3 = M.AbstractC0217k.a(r1, r3)
            r0 = 1052938076(0x3ec28f5c, float:0.38)
            long r25 = j0.o.b(r3, r0)
            r18.<init>(r19, r21, r23, r25)
            r0 = r18
            r1.f3509K = r0
            goto L185
        L17f:
            r17 = r3
            r27 = r5
            r28 = r6
        L185:
            r3 = 16
            int r1 = (r28 > r3 ? 1 : (r28 == r3 ? 0 : -1))
            if (r1 == 0) goto L18e
            r19 = r28
            goto L192
        L18e:
            long r6 = r0.f3464a
            r19 = r6
        L192:
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 == 0) goto L199
        L196:
            r21 = r8
            goto L19c
        L199:
            long r8 = r0.f3465b
            goto L196
        L19c:
            int r1 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r1 == 0) goto L1a3
        L1a0:
            r23 = r11
            goto L1a6
        L1a3:
            long r11 = r0.f3466c
            goto L1a0
        L1a6:
            int r1 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r1 == 0) goto L1ad
            r25 = r15
            goto L1b1
        L1ad:
            long r0 = r0.f3467d
            r25 = r0
        L1b1:
            M.e r18 = new M.e
            r18.<init>(r19, r21, r23, r25)
            if (r17 == 0) goto L1bd
            int r15 = r17.intValue()
            goto L1be
        L1bd:
            r15 = 0
        L1be:
            H.d r6 = H.e.a(r15)
            f5.c r0 = new f5.c
            r7 = r30
            r0.<init>()
            r1 = -1895877103(0xffffffff8eff3611, float:-6.2914417E-30)
            X.e r9 = X.k.d(r1, r0, r10)
            r11 = 196608(0x30000, float:2.75506E-40)
            r12 = 24
            r8 = 0
            r7 = r18
            r5 = r27
            M.s0.a(r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = r14
        L1dd:
            r3 = r13
            goto L1e4
        L1df:
            r34.N()
            r1 = r7
            goto L1dd
        L1e4:
            P.o0 r7 = r34.r()
            if (r7 == 0) goto L1f7
            f5.d r0 = new f5.d
            r4 = r33
            r5 = r35
            r6 = r36
            r0.<init>()
            r7.f5482d = r0
        L1f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.h.b(c0.m, R4.x, float, B5.c, P.o, int, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(C0151e c0151e, InterfaceC0725m interfaceC0725m, L l7, float f7, C0716d c0716d, C1876h c1876h, boolean z5, InterfaceC1672a interfaceC1672a, C1881m c1881m, C1717l c1717l, X.e eVar, C0371o c0371o, int i7) {
        L l8;
        float f8;
        C0716d c0716d2;
        C1876h c1876h2;
        boolean z6;
        InterfaceC1672a interfaceC1672a2;
        C1881m c1881m2;
        C1717l c1717l2;
        InterfaceC1672a interfaceC1672a3;
        int i8;
        C1876h c1876h3;
        C1717l c1717lA;
        L l9;
        C0716d c0716d3;
        float f9;
        boolean z7;
        c0371o.U(-1372972868);
        int i9 = i7 | (c0371o.g(c0151e) ? 4 : 2) | (c0371o.g(interfaceC0725m) ? 32 : 16) | 911958400;
        if (c0371o.K(i9 & 1, (306783379 & i9) != 306783378)) {
            c0371o.P();
            if ((i7 & 1) == 0 || c0371o.w()) {
                float f10 = 0;
                L l10 = new L(f10, f10, f10, f10);
                float f11 = 0;
                C0716d c0716d4 = C0714b.f10072A;
                int i10 = (i9 & 14) | 196608;
                F.F f12 = new F.F();
                C1667v c1667vA = K.a(c0371o);
                LinkedHashMap linkedHashMap = I0.f16803a;
                C1649f0 c1649f0O = AbstractC1644d.o(1, Float.valueOf(1));
                Object obj = (W0.c) c0371o.k(AbstractC0103t0.f1116h);
                Object obj2 = (W0.l) c0371o.k(AbstractC0103t0.f1120n);
                boolean zG = ((((i10 & 14) ^ 6) > 4 && c0371o.g(c0151e)) || (i10 & 6) == 4) | c0371o.g(c1667vA) | c0371o.g(c1649f0O) | c0371o.g(f12) | c0371o.g(obj) | c0371o.g(obj2);
                Object objH = c0371o.H();
                Object obj3 = C0363k.f5418a;
                if (zG || objH == obj3) {
                    v3.l lVar = new v3.l(c0151e, new C0162p(i, c0151e, obj2), f12);
                    float f13 = AbstractC1880l.f18324a;
                    objH = new C1876h(lVar, c1667vA, c1649f0O);
                    c0371o.d0(objH);
                }
                C1876h c1876h4 = (C1876h) objH;
                int i11 = i9 & (-29360129);
                int i12 = (i9 & 14) | 432;
                i = ((((i12 & 14) ^ 6) > 4 && c0371o.g(c0151e)) || (i12 & 6) == 4) ? 1 : 0;
                Object objH2 = c0371o.H();
                if (i != 0 || objH2 == obj3) {
                    objH2 = new C0147a(c0151e);
                    c0371o.d0(objH2);
                }
                interfaceC1672a3 = (C0147a) objH2;
                i8 = i11;
                c1876h3 = c1876h4;
                c1717lA = v.d0.a(c0371o);
                l9 = l10;
                c0716d3 = c0716d4;
                c1881m2 = C1881m.f18325a;
                f9 = f11;
                z7 = true;
            } else {
                c0371o.N();
                i8 = i9 & (-29360129);
                l9 = l7;
                f9 = f7;
                c0716d3 = c0716d;
                c1876h3 = c1876h;
                z7 = z5;
                interfaceC1672a3 = interfaceC1672a;
                c1881m2 = c1881m;
                c1717lA = c1717l;
            }
            c0371o.q();
            D5.a.g(interfaceC0725m, c0151e, l9, c1876h3, z7, c1717lA, f9, interfaceC1672a3, c0716d3, c1881m2, eVar, c0371o, ((i8 << 3) & 112) | ((i8 >> 3) & 14) | 24576 | 907545984, 1797510);
            c1717l2 = c1717lA;
            c0716d2 = c0716d3;
            interfaceC1672a2 = interfaceC1672a3;
            z6 = z7;
            f8 = f9;
            c1876h2 = c1876h3;
            l8 = l9;
        } else {
            c0371o.N();
            l8 = l7;
            f8 = f7;
            c0716d2 = c0716d;
            c1876h2 = c1876h;
            z6 = z5;
            interfaceC1672a2 = interfaceC1672a;
            c1881m2 = c1881m;
            c1717l2 = c1717l;
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new F.r(c0151e, interfaceC0725m, l8, f8, c0716d2, c1876h2, z6, interfaceC1672a2, c1881m2, c1717l2, eVar, i7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static a6.q d(B5.c cVar) {
        C0636b from = AbstractC0637c.f9018d;
        kotlin.jvm.internal.m.e(from, "from");
        a6.h hVar = new a6.h();
        a6.j jVar = from.f9019a;
        hVar.f9028a = jVar.f9036c;
        hVar.f9029b = jVar.f9035b;
        String str = (String) jVar.f9038e;
        hVar.f9030c = str;
        hVar.f9031d = (String) jVar.f;
        hVar.f9032e = (EnumC0635a) jVar.f9039g;
        hVar.f = jVar.f9037d;
        hVar.f9033g = from.f9020b;
        cVar.invoke(hVar);
        if (!kotlin.jvm.internal.m.a(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        a6.j jVar2 = new a6.j(hVar.f9029b, hVar.f9028a, hVar.f9030c, hVar.f9031d, hVar.f, hVar.f9032e);
        B module = hVar.f9033g;
        kotlin.jvm.internal.m.e(module, "module");
        return new a6.q(jVar2, module);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:177:0x026c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(c0.InterfaceC0725m r38, D.y r39, D.c r40, A.L r41, w.I r42, boolean r43, v.C1717l r44, A.InterfaceC0010g r45, A.InterfaceC0008e r46, B5.c r47, P.C0371o r48, int r49, int r50) {
        /*
            r1 = r38
            r3 = r39
            r6 = r40
            r4 = r41
            r0 = r43
            r7 = r45
            r8 = r46
            r12 = r48
            r13 = r49
            r2 = 708740370(0x2a3e8512, float:1.6921558E-13)
            r12.U(r2)
            r2 = r13 & 6
            if (r2 != 0) goto L27
            boolean r2 = r12.g(r1)
            if (r2 == 0) goto L24
            r2 = 4
            goto L25
        L24:
            r2 = 2
        L25:
            r2 = r2 | r13
            goto L28
        L27:
            r2 = r13
        L28:
            r9 = r13 & 48
            if (r9 != 0) goto L38
            boolean r9 = r12.g(r3)
            if (r9 == 0) goto L35
            r9 = 32
            goto L37
        L35:
            r9 = 16
        L37:
            r2 = r2 | r9
        L38:
            r9 = r13 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L51
            r9 = r13 & 512(0x200, float:7.175E-43)
            if (r9 != 0) goto L45
            boolean r9 = r12.g(r6)
            goto L49
        L45:
            boolean r9 = r12.i(r6)
        L49:
            if (r9 == 0) goto L4e
            r9 = 256(0x100, float:3.59E-43)
            goto L50
        L4e:
            r9 = 128(0x80, float:1.794E-43)
        L50:
            r2 = r2 | r9
        L51:
            r9 = r13 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L61
            boolean r9 = r12.g(r4)
            if (r9 == 0) goto L5e
            r9 = 2048(0x800, float:2.87E-42)
            goto L60
        L5e:
            r9 = 1024(0x400, float:1.435E-42)
        L60:
            r2 = r2 | r9
        L61:
            r9 = r13 & 24576(0x6000, float:3.4438E-41)
            r10 = 0
            if (r9 != 0) goto L72
            boolean r9 = r12.h(r10)
            if (r9 == 0) goto L6f
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L71
        L6f:
            r9 = 8192(0x2000, float:1.14794E-41)
        L71:
            r2 = r2 | r9
        L72:
            r9 = 196608(0x30000, float:2.75506E-40)
            r18 = r13 & r9
            r19 = r9
            r9 = 1
            if (r18 != 0) goto L88
            boolean r18 = r12.h(r9)
            if (r18 == 0) goto L84
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L86
        L84:
            r18 = 65536(0x10000, float:9.18355E-41)
        L86:
            r2 = r2 | r18
        L88:
            r18 = 1572864(0x180000, float:2.204052E-39)
            r20 = r13 & r18
            r9 = r42
            if (r20 != 0) goto L9d
            boolean r22 = r12.g(r9)
            if (r22 == 0) goto L99
            r22 = 1048576(0x100000, float:1.469368E-39)
            goto L9b
        L99:
            r22 = 524288(0x80000, float:7.34684E-40)
        L9b:
            r2 = r2 | r22
        L9d:
            r22 = 12582912(0xc00000, float:1.7632415E-38)
            r23 = r13 & r22
            if (r23 != 0) goto Lb0
            boolean r23 = r12.h(r0)
            if (r23 == 0) goto Lac
            r23 = 8388608(0x800000, float:1.17549435E-38)
            goto Lae
        Lac:
            r23 = 4194304(0x400000, float:5.877472E-39)
        Lae:
            r2 = r2 | r23
        Lb0:
            r23 = 100663296(0x6000000, float:2.4074124E-35)
            r23 = r13 & r23
            r5 = r44
            if (r23 != 0) goto Lc5
            boolean r24 = r12.g(r5)
            if (r24 == 0) goto Lc1
            r24 = 67108864(0x4000000, float:1.5046328E-36)
            goto Lc3
        Lc1:
            r24 = 33554432(0x2000000, float:9.403955E-38)
        Lc3:
            r2 = r2 | r24
        Lc5:
            r24 = 805306368(0x30000000, float:4.656613E-10)
            r24 = r13 & r24
            if (r24 != 0) goto Ld8
            boolean r24 = r12.g(r7)
            if (r24 == 0) goto Ld4
            r24 = 536870912(0x20000000, float:1.0842022E-19)
            goto Ld6
        Ld4:
            r24 = 268435456(0x10000000, float:2.5243549E-29)
        Ld6:
            r2 = r2 | r24
        Ld8:
            r24 = r50 & 6
            if (r24 != 0) goto Lea
            boolean r24 = r12.g(r8)
            if (r24 == 0) goto Le5
            r16 = 4
            goto Le7
        Le5:
            r16 = 2
        Le7:
            r16 = r50 | r16
            goto Lec
        Lea:
            r16 = r50
        Lec:
            r24 = r50 & 48
            r15 = r47
            if (r24 != 0) goto Lff
            boolean r25 = r12.i(r15)
            if (r25 == 0) goto Lfb
            r17 = 32
            goto Lfd
        Lfb:
            r17 = 16
        Lfd:
            r16 = r16 | r17
        Lff:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r10 = r2 & r17
            r11 = 306783378(0x12492492, float:6.3469493E-28)
            r14 = 18
            if (r10 != r11) goto L112
            r10 = r16 & 19
            if (r10 == r14) goto L110
            goto L112
        L110:
            r10 = 0
            goto L113
        L112:
            r10 = 1
        L113:
            r11 = r2 & 1
            boolean r10 = r12.K(r11, r10)
            if (r10 == 0) goto L360
            r12.P()
            r10 = r13 & 1
            if (r10 == 0) goto L12c
            boolean r10 = r12.w()
            if (r10 == 0) goto L129
            goto L12c
        L129:
            r12.N()
        L12c:
            r12.q()
            int r26 = r2 >> 3
            r27 = r26 & 14
            r10 = r16 & 112(0x70, float:1.57E-43)
            r10 = r27 | r10
            P.W r11 = P.C0345b.t(r47, r48)
            r28 = r10 & 14
            r29 = r14
            r14 = r28 ^ 6
            r28 = r2
            r2 = 4
            if (r14 <= r2) goto L14c
            boolean r14 = r12.g(r3)
            if (r14 != 0) goto L150
        L14c:
            r10 = r10 & 6
            if (r10 != r2) goto L152
        L150:
            r2 = 1
            goto L153
        L152:
            r2 = 0
        L153:
            java.lang.Object r10 = r12.H()
            P.S r14 = P.C0363k.f5418a
            if (r2 != 0) goto L15d
            if (r10 != r14) goto L187
        L15d:
            P.S r2 = P.S.f5375t
            C.j r10 = new C.j
            r5 = 1
            r10.<init>(r11, r5)
            P.C r5 = P.C0345b.n(r10, r2)
            B0.K r10 = new B0.K
            r11 = 7
            r10.<init>(r11, r5, r3)
            P.C r34 = P.C0345b.n(r10, r2)
            C.i r30 = new C.i
            r31 = 0
            r32 = 1
            java.lang.Class<P.S0> r33 = P.S0.class
            java.lang.String r35 = "value"
            java.lang.String r36 = "getValue()Ljava/lang/Object;"
            r30.<init>(r31, r32, r33, r34, r35, r36)
            r10 = r30
            r12.d0(r10)
        L187:
            r5 = r10
            H5.h r5 = (H5.h) r5
            int r2 = r28 >> 9
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r27 | r2
            r10 = r2 & 14
            r10 = r10 ^ 6
            r11 = 4
            if (r10 <= r11) goto L19d
            boolean r10 = r12.g(r3)
            if (r10 != 0) goto L1a1
        L19d:
            r10 = r2 & 6
            if (r10 != r11) goto L1a3
        L1a1:
            r10 = 1
            goto L1a4
        L1a3:
            r10 = 0
        L1a4:
            r11 = r2 & 112(0x70, float:1.57E-43)
            r11 = r11 ^ 48
            r30 = r2
            r2 = 32
            if (r11 <= r2) goto L1b5
            r11 = 0
            boolean r17 = r12.h(r11)
            if (r17 != 0) goto L1b9
        L1b5:
            r11 = r30 & 48
            if (r11 != r2) goto L1bb
        L1b9:
            r11 = 1
            goto L1bc
        L1bb:
            r11 = 0
        L1bc:
            r2 = r10 | r11
            java.lang.Object r10 = r12.H()
            if (r2 != 0) goto L1c6
            if (r10 != r14) goto L1ce
        L1c6:
            D.B r10 = new D.B
            r10.<init>(r3)
            r12.d0(r10)
        L1ce:
            D.B r10 = (D.B) r10
            java.lang.Object r2 = r12.H()
            if (r2 != r14) goto L1dd
            M5.w r2 = P.C0345b.k(r12)
            r12.d0(r2)
        L1dd:
            M5.w r2 = (M5.InterfaceC0261w) r2
            P.T0 r11 = C0.AbstractC0103t0.f1115g
            java.lang.Object r11 = r12.k(r11)
            j0.t r11 = (j0.t) r11
            r30 = r2
            P.z r2 = C0.AbstractC0103t0.f1128v
            java.lang.Object r2 = r12.k(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L1fa
            E.E r2 = E.f0.f1563a
            goto L1fb
        L1fa:
            r2 = 0
        L1fb:
            r31 = 524272(0x7fff0, float:7.34662E-40)
            r31 = r28 & r31
            int r16 = r16 << 18
            r29 = 3670016(0x380000, float:5.142788E-39)
            r16 = r16 & r29
            r16 = r31 | r16
            int r28 = r28 >> 6
            r31 = 29360128(0x1c00000, float:7.052966E-38)
            r28 = r28 & r31
            r32 = r2
            r2 = r16 | r28
            r16 = r2 & 112(0x70, float:1.57E-43)
            r28 = r5
            r5 = r16 ^ 48
            r9 = 32
            if (r5 <= r9) goto L222
            boolean r5 = r12.g(r3)
            if (r5 != 0) goto L226
        L222:
            r5 = r2 & 48
            if (r5 != r9) goto L228
        L226:
            r5 = 1
            goto L229
        L228:
            r5 = 0
        L229:
            r9 = r2 & 896(0x380, float:1.256E-42)
            r9 = r9 ^ 384(0x180, float:5.38E-43)
            r3 = 256(0x100, float:3.59E-43)
            if (r9 <= r3) goto L237
            boolean r9 = r12.g(r6)
            if (r9 != 0) goto L23b
        L237:
            r9 = r2 & 384(0x180, float:5.38E-43)
            if (r9 != r3) goto L23d
        L23b:
            r3 = 1
            goto L23e
        L23d:
            r3 = 0
        L23e:
            r3 = r3 | r5
            r5 = r2 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 ^ 3072(0xc00, float:4.305E-42)
            r9 = 2048(0x800, float:2.87E-42)
            if (r5 <= r9) goto L24d
            boolean r5 = r12.g(r4)
            if (r5 != 0) goto L251
        L24d:
            r5 = r2 & 3072(0xc00, float:4.305E-42)
            if (r5 != r9) goto L253
        L251:
            r5 = 1
            goto L254
        L253:
            r5 = 0
        L254:
            r3 = r3 | r5
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r2
            r5 = r5 ^ 24576(0x6000, float:3.4438E-41)
            r9 = 16384(0x4000, float:2.2959E-41)
            if (r5 <= r9) goto L267
            r5 = 0
            boolean r16 = r12.h(r5)
            if (r16 != 0) goto L26c
            goto L268
        L267:
            r5 = 0
        L268:
            r5 = r2 & 24576(0x6000, float:3.4438E-41)
            if (r5 != r9) goto L26e
        L26c:
            r5 = 1
            goto L26f
        L26e:
            r5 = 0
        L26f:
            r3 = r3 | r5
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r2
            r5 = r5 ^ r19
            r9 = 131072(0x20000, float:1.83671E-40)
            if (r5 <= r9) goto L280
            r5 = 1
            boolean r16 = r12.h(r5)
            if (r16 != 0) goto L284
        L280:
            r5 = r2 & r19
            if (r5 != r9) goto L286
        L284:
            r5 = 1
            goto L287
        L286:
            r5 = 0
        L287:
            r3 = r3 | r5
            r5 = r2 & r29
            r5 = r5 ^ r18
            r9 = 1048576(0x100000, float:1.469368E-39)
            if (r5 <= r9) goto L296
            boolean r5 = r12.g(r8)
            if (r5 != 0) goto L29a
        L296:
            r5 = r2 & r18
            if (r5 != r9) goto L29c
        L29a:
            r5 = 1
            goto L29d
        L29c:
            r5 = 0
        L29d:
            r3 = r3 | r5
            r5 = r2 & r31
            r5 = r5 ^ r22
            r9 = 8388608(0x800000, float:1.17549435E-38)
            if (r5 <= r9) goto L2ac
            boolean r5 = r12.g(r7)
            if (r5 != 0) goto L2b0
        L2ac:
            r2 = r2 & r22
            if (r2 != r9) goto L2b2
        L2b0:
            r2 = 1
            goto L2b3
        L2b2:
            r2 = 0
        L2b3:
            r2 = r2 | r3
            boolean r3 = r12.g(r11)
            r2 = r2 | r3
            java.lang.Object r3 = r12.H()
            if (r2 != 0) goto L2cd
            if (r3 != r14) goto L2c2
            goto L2cd
        L2c2:
            r2 = r3
            r37 = r10
            r10 = r28
            r13 = 0
            r21 = 1
            r3 = r39
            goto L2e4
        L2cd:
            C.o r2 = new C.o
            r3 = r39
            r37 = r10
            r10 = r11
            r5 = r28
            r9 = r30
            r11 = r32
            r13 = 0
            r21 = 1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r10 = r5
            r12.d0(r2)
        L2e4:
            r11 = r2
            B5.e r11 = (B5.e) r11
            w.d0 r4 = w.EnumC1778d0.f17945q
            if (r0 == 0) goto L31f
            r2 = -1614890700(0xffffffff9fbeb934, float:-8.077452E-20)
            r12.S(r2)
            r2 = r27 ^ 6
            r5 = 4
            if (r2 <= r5) goto L2fc
            boolean r2 = r12.g(r3)
            if (r2 != 0) goto L303
        L2fc:
            r2 = r26 & 6
            if (r2 != r5) goto L301
            goto L303
        L301:
            r21 = r13
        L303:
            java.lang.Object r2 = r12.H()
            if (r21 != 0) goto L30b
            if (r2 != r14) goto L313
        L30b:
            D.d r2 = new D.d
            r2.<init>(r3)
            r12.d0(r2)
        L313:
            D.d r2 = (D.d) r2
            E.k r5 = r3.f1315n
            c0.m r2 = androidx.compose.foundation.lazy.layout.a.a(r2, r5, r4)
            r12.p(r13)
            goto L32a
        L31f:
            r2 = -1614595456(0xffffffff9fc33a80, float:-8.268249E-20)
            r12.S(r2)
            r12.p(r13)
            c0.j r2 = c0.C0722j.f10095q
        L32a:
            C.x r5 = r3.f1312k
            c0.m r5 = r1.d(r5)
            E.e r6 = r3.f1313l
            c0.m r5 = r5.d(r6)
            r6 = r37
            c0.m r5 = androidx.compose.foundation.lazy.layout.a.b(r5, r10, r6, r4, r0)
            c0.m r2 = r5.d(r2)
            androidx.compose.foundation.lazy.layout.b r5 = r3.f1314m
            c0.m r5 = r5.i
            c0.m r2 = r2.d(r5)
            y.i r7 = r3.f
            r9 = 0
            r6 = r42
            r8 = r44
            r5 = r0
            c0.m r0 = androidx.compose.foundation.a.f(r2, r3, r4, r5, r6, r7, r8, r9)
            r8 = r3
            E.K r4 = r8.f1316o
            r7 = 0
            r3 = r0
            r2 = r10
            r5 = r11
            r6 = r12
            E.C.a(r2, r3, r4, r5, r6, r7)
            goto L364
        L360:
            r8 = r3
            r48.N()
        L364:
            P.o0 r13 = r48.r()
            if (r13 == 0) goto L385
            D.k r0 = new D.k
            r3 = r40
            r4 = r41
            r5 = r42
            r6 = r43
            r7 = r44
            r9 = r46
            r11 = r49
            r12 = r50
            r2 = r8
            r10 = r15
            r8 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.f5482d = r0
        L385:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.h.e(c0.m, D.y, D.c, A.L, w.I, boolean, v.l, A.g, A.e, B5.c, P.o, int, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void f(final C0468k1 dataObject, final O1 o12, MainActivity mainActivity, final B5.c onClick, C0371o c0371o, int i7) {
        kotlin.jvm.internal.m.e(dataObject, "dataObject");
        kotlin.jvm.internal.m.e(onClick, "onClick");
        c0371o.U(1266242375);
        int i8 = i7 | (c0371o.i(dataObject) ? 4 : 2) | (c0371o.i(o12) ? 32 : 16) | (c0371o.i(mainActivity) ? 256 : 128) | (c0371o.i(onClick) ? 2048 : 1024);
        int i9 = 0;
        if (c0371o.K(i8 & 1, (i8 & 1171) != 1170)) {
            Object objH = c0371o.H();
            P.S s6 = C0363k.f5418a;
            if (objH == s6) {
                objH = C0345b.q(Boolean.FALSE);
                c0371o.d0(objH);
            }
            final P.W w3 = (P.W) objH;
            Boolean bool = Boolean.TRUE;
            boolean zI = c0371o.i(dataObject) | c0371o.i(o12) | c0371o.i(mainActivity);
            Object objH2 = c0371o.H();
            if (zI || objH2 == s6) {
                objH2 = new f5.i(dataObject, o12, mainActivity, null);
                c0371o.d0(objH2);
            }
            C0345b.e((B5.e) objH2, c0371o, bool);
            Object objH3 = c0371o.H();
            if (objH3 == s6) {
                List list = o12.f6822d;
                C0348c0 c0348c0 = new C0348c0(list != null ? list.size() : 0);
                c0371o.d0(c0348c0);
                objH3 = c0348c0;
            }
            final C0348c0 c0348c02 = (C0348c0) objH3;
            Object objH4 = c0371o.H();
            if (objH4 == s6) {
                objH4 = new I2.d(15, c0348c02);
                c0371o.d0(objH4);
            }
            B5.a aVar = (B5.a) objH4;
            float f7 = F.S.f1843a;
            Object[] objArr = new Object[0];
            Z.m mVar = C0151e.f1859I;
            Object objH5 = c0371o.H();
            if (objH5 == s6) {
                objH5 = new F.Q(aVar, i9);
                c0371o.d0(objH5);
            }
            final C0151e c0151e = (C0151e) P1.P(objArr, mVar, (B5.a) objH5, c0371o, 0, 4);
            c0151e.f1860H.setValue(aVar);
            Object objH6 = c0371o.H();
            if (objH6 == s6) {
                objH6 = C0345b.q(o12);
                c0371o.d0(objH6);
            }
            final P.W w6 = (P.W) objH6;
            Object objH7 = c0371o.H();
            if (objH7 == s6) {
                objH7 = C0345b.k(c0371o);
                c0371o.d0(objH7);
            }
            final InterfaceC0261w interfaceC0261w = (InterfaceC0261w) objH7;
            AbstractC1127b.a(X.k.d(-1493073824, new B5.e() { // from class: f5.g
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // B5.e
                public final Object invoke(Object obj, Object obj2) {
                    String str;
                    String str2 = o12.f6820b;
                    C0371o c0371o2 = (C0371o) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (c0371o2.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                        FillElement fillElement = androidx.compose.foundation.layout.c.f9279c;
                        InterfaceC0725m interfaceC0725mA = AbstractC0534a.A(androidx.compose.foundation.a.a(fillElement, AbstractC1145B.b(Color.parseColor(str2 == null ? "#FFFFFF" : str2)), AbstractC1145B.f13658a), true);
                        C0022t c0022tA = A.r.a(AbstractC0012i.f110e, C0714b.f10074C, c0371o2, 54);
                        int i10 = c0371o2.f5454P;
                        InterfaceC0360i0 interfaceC0360i0M = c0371o2.m();
                        InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o2, interfaceC0725mA);
                        InterfaceC0046k.f452a.getClass();
                        B0.D d5 = C0045j.f445b;
                        c0371o2.W();
                        if (c0371o2.f5453O) {
                            c0371o2.l(d5);
                        } else {
                            c0371o2.g0();
                        }
                        C0345b.u(C0045j.f448e, c0371o2, c0022tA);
                        C0345b.u(C0045j.f447d, c0371o2, interfaceC0360i0M);
                        C0044i c0044i = C0045j.f;
                        if (c0371o2.f5453O || !m.a(c0371o2.H(), Integer.valueOf(i10))) {
                            k1.i.o(i10, c0371o2, i10, c0044i);
                        }
                        C0345b.u(C0045j.f446c, c0371o2, interfaceC0725mC);
                        m.b(str2);
                        AbstractC0534a.t(0, str2, false, c0371o2, 0, 5);
                        InterfaceC0725m interfaceC0725mA2 = C0023u.a(fillElement);
                        final C0468k1 c0468k1 = dataObject;
                        final B5.c cVar = onClick;
                        final P.W w7 = w6;
                        X.e eVarD = X.k.d(-1864537897, new B5.g() { // from class: f5.h
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // B5.g
                            public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                                R1 r12;
                                R1 r13;
                                R1 r14;
                                List list2;
                                C HorizontalPager = (C) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                C0371o c0371o3 = (C0371o) obj5;
                                ((Integer) obj6).getClass();
                                m.e(HorizontalPager, "$this$HorizontalPager");
                                P.W w8 = w7;
                                List list3 = ((O1) w8.getValue()).f6822d;
                                List listJ0 = (list3 == null || (r14 = (R1) list3.get(iIntValue2)) == null || (list2 = r14.f6841a) == null) ? n5.s.f15299q : l.j0(list2);
                                List list4 = ((O1) w8.getValue()).f6822d;
                                Boolean boolValueOf = Boolean.valueOf((list4 == null || (r13 = (R1) list4.get(iIntValue2)) == null) ? false : m.a(r13.f6842b, Boolean.TRUE));
                                C0517x c0517x = ((O1) w8.getValue()).f;
                                List list5 = ((O1) w8.getValue()).f6822d;
                                E3.h.h(c0468k1, listJ0, boolValueOf, c0517x, cVar, (list5 == null || (r12 = (R1) list5.get(iIntValue2)) == null) ? null : r12.f6843c, c0371o3, 0);
                                return C1386y.f15098a;
                            }
                        }, c0371o2);
                        C0151e c0151e2 = c0151e;
                        E3.h.c(c0151e2, interfaceC0725mA2, null, 0.0f, null, null, false, null, null, null, eVarD, c0371o2, 3072);
                        U1 u12 = ((O1) w7.getValue()).f6821c;
                        P.S s7 = C0363k.f5418a;
                        if (u12 != null) {
                            c0371o2.S(-1690561180);
                            int iE = c0348c02.e();
                            U1 u13 = ((O1) w7.getValue()).f6821c;
                            String str3 = u13 != null ? u13.f6863a : null;
                            U1 u14 = ((O1) w7.getValue()).f6821c;
                            String str4 = u14 != null ? u14.f6864b : null;
                            U1 u15 = ((O1) w7.getValue()).f6821c;
                            if (u15 == null || (str = u15.f6866d) == null) {
                                str = "circle";
                            }
                            InterfaceC0261w interfaceC0261w2 = interfaceC0261w;
                            boolean zI2 = c0371o2.i(interfaceC0261w2) | c0371o2.g(c0151e2);
                            Object objH8 = c0371o2.H();
                            if (zI2 || objH8 == s7) {
                                objH8 = new N5.d(11, interfaceC0261w2, c0151e2);
                                c0371o2.d0(objH8);
                            }
                            E3.h.g(iE, c0151e2, str3, str4, str, (B5.c) objH8, c0371o2, 0);
                        } else {
                            c0371o2.S(-1697457812);
                        }
                        c0371o2.p(false);
                        List list2 = ((O1) w7.getValue()).f6819a;
                        if (list2 == null) {
                            c0371o2.S(-1689937213);
                        } else {
                            c0371o2.S(-1689937212);
                            E3.h.a(list2, cVar, c0371o2, 0);
                        }
                        c0371o2.p(false);
                        c0371o2.p(true);
                        boolean zI3 = c0371o2.i(c0468k1);
                        Object objH9 = c0371o2.H();
                        if (zI3 || objH9 == s7) {
                            objH9 = new C0547n(c0468k1, w3, 5);
                            c0371o2.d0(objH9);
                        }
                        l6.d.d(false, (B5.a) objH9, c0371o2, 0);
                    } else {
                        c0371o2.N();
                    }
                    return C1386y.f15098a;
                }
            }, c0371o), c0371o, 390, 2);
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new U4.Q(dataObject, o12, mainActivity, onClick, i7, 4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void g(int i7, C0151e c0151e, String str, String str2, String str3, final B5.c onClick, C0371o c0371o, int i8) {
        long jB;
        boolean z5;
        int i9 = i7;
        kotlin.jvm.internal.m.e(onClick, "onClick");
        c0371o.U(-587191213);
        int i10 = i8 | (c0371o.e(i9) ? 4 : 2) | (c0371o.g(c0151e) ? 32 : 16) | (c0371o.g(str) ? 256 : 128) | (c0371o.g(str2) ? 2048 : 1024) | (c0371o.g(str3) ? 16384 : 8192) | (c0371o.i(onClick) ? 131072 : 65536);
        if (c0371o.K(i10 & 1, (74899 & i10) != 74898)) {
            C0722j c0722j = C0722j.f10095q;
            InterfaceC0725m interfaceC0725mD = androidx.compose.foundation.layout.c.a(c0722j, 50).d(androidx.compose.foundation.layout.c.f9277a);
            Q qA = O.a(AbstractC0012i.f109d, C0714b.f10085z, c0371o, 6);
            int i11 = c0371o.f5454P;
            InterfaceC0360i0 interfaceC0360i0M = c0371o.m();
            InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o, interfaceC0725mD);
            InterfaceC0046k.f452a.getClass();
            B0.D d5 = C0045j.f445b;
            c0371o.W();
            if (c0371o.f5453O) {
                c0371o.l(d5);
            } else {
                c0371o.g0();
            }
            C0345b.u(C0045j.f448e, c0371o, qA);
            C0345b.u(C0045j.f447d, c0371o, interfaceC0360i0M);
            C0044i c0044i = C0045j.f;
            if (c0371o.f5453O || !kotlin.jvm.internal.m.a(c0371o.H(), Integer.valueOf(i11))) {
                k1.i.o(i11, c0371o, i11, c0044i);
            }
            C0345b.u(C0045j.f446c, c0371o, interfaceC0725mC);
            c0371o.S(-466939761);
            final int i12 = 0;
            while (i12 < i9) {
                if (c0151e.j() == i12) {
                    jB = AbstractC1145B.b(Color.parseColor(str == null ? "#111111" : str));
                } else {
                    jB = AbstractC1145B.b(Color.parseColor(str2 == null ? "#FFFFFF" : str2));
                }
                int iHashCode = str3.hashCode();
                D d7 = AbstractC1145B.f13658a;
                P.S s6 = C0363k.f5418a;
                if (iHashCode != -1360216880) {
                    if (iHashCode != 3075986) {
                        if (iHashCode == 3540562 && str3.equals("star")) {
                            c0371o.S(-1929507635);
                            boolean zE = ((i10 & 458752) == 131072) | c0371o.e(i12);
                            Object objH = c0371o.H();
                            if (zE || objH == s6) {
                                final int i13 = 1;
                                objH = new B5.a() { // from class: f5.a
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // B5.a
                                    public final Object invoke() {
                                        switch (i13) {
                                            case 0:
                                                onClick.invoke(Integer.valueOf(i12));
                                                break;
                                            case 1:
                                                onClick.invoke(Integer.valueOf(i12));
                                                break;
                                            default:
                                                onClick.invoke(Integer.valueOf(i12));
                                                break;
                                        }
                                        return C1386y.f15098a;
                                    }
                                };
                                c0371o.d0(objH);
                            }
                            j(jB, (B5.a) objH, c0371o, 0);
                            c0371o.p(false);
                            i12++;
                            i9 = i7;
                        }
                    } else if (str3.equals("dash")) {
                        c0371o.S(-1928885403);
                        InterfaceC0725m interfaceC0725mA = androidx.compose.foundation.layout.c.a(androidx.compose.foundation.layout.c.e(androidx.compose.foundation.a.a(AbstractC0597a.n(androidx.compose.foundation.layout.b.a(c0722j, 4), H.e.b(2)), jB, d7), 17), 3);
                        boolean zE2 = ((i10 & 458752) == 131072) | c0371o.e(i12);
                        Object objH2 = c0371o.H();
                        if (zE2 || objH2 == s6) {
                            final int i14 = 0;
                            objH2 = new B5.a() { // from class: f5.a
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // B5.a
                                public final Object invoke() {
                                    switch (i14) {
                                        case 0:
                                            onClick.invoke(Integer.valueOf(i12));
                                            break;
                                        case 1:
                                            onClick.invoke(Integer.valueOf(i12));
                                            break;
                                        default:
                                            onClick.invoke(Integer.valueOf(i12));
                                            break;
                                    }
                                    return C1386y.f15098a;
                                }
                            };
                            c0371o.d0(objH2);
                        }
                        z5 = false;
                        AbstractC0017n.a(androidx.compose.foundation.a.d(interfaceC0725mA, (B5.a) objH2), c0371o, 0);
                        c0371o.p(z5);
                        i12++;
                        i9 = i7;
                    }
                    z5 = false;
                } else {
                    z5 = false;
                    if (str3.equals("circle")) {
                        c0371o.S(-1929268842);
                        InterfaceC0725m interfaceC0725mC2 = androidx.compose.foundation.layout.c.c(androidx.compose.foundation.a.a(AbstractC0597a.n(androidx.compose.foundation.layout.b.a(c0722j, 4), H.e.f2031a), jB, d7), 8);
                        boolean zE3 = ((i10 & 458752) == 131072) | c0371o.e(i12);
                        Object objH3 = c0371o.H();
                        if (zE3 || objH3 == s6) {
                            final int i15 = 2;
                            objH3 = new B5.a() { // from class: f5.a
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // B5.a
                                public final Object invoke() {
                                    switch (i15) {
                                        case 0:
                                            onClick.invoke(Integer.valueOf(i12));
                                            break;
                                        case 1:
                                            onClick.invoke(Integer.valueOf(i12));
                                            break;
                                        default:
                                            onClick.invoke(Integer.valueOf(i12));
                                            break;
                                    }
                                    return C1386y.f15098a;
                                }
                            };
                            c0371o.d0(objH3);
                        }
                        AbstractC0017n.a(androidx.compose.foundation.a.d(interfaceC0725mC2, (B5.a) objH3), c0371o, 0);
                        c0371o.p(false);
                        i12++;
                        i9 = i7;
                    }
                }
                c0371o.S(-1940722629);
                c0371o.p(z5);
                i12++;
                i9 = i7;
            }
            c0371o.p(false);
            c0371o.p(true);
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new f5.b(i7, c0151e, str, str2, str3, onClick, i8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void h(C0468k1 dataObject, List list, Boolean bool, C0517x c0517x, B5.c onClick, Integer num, C0371o c0371o, int i7) {
        C0371o c0371o2;
        C0371o c0371o3;
        C0717e c0717e;
        Iterator it;
        P.W w3;
        String str;
        C0722j c0722j;
        boolean z5;
        C0371o c0371o4 = c0371o;
        C0717e c0717e2 = C0714b.f10076q;
        kotlin.jvm.internal.m.e(dataObject, "dataObject");
        kotlin.jvm.internal.m.e(onClick, "onClick");
        c0371o4.U(-428192311);
        int i8 = i7 | (c0371o4.i(dataObject) ? 4 : 2) | (c0371o4.i(list) ? 32 : 16) | (c0371o4.g(bool) ? 256 : 128) | (c0371o4.g(c0517x) ? 2048 : 1024) | (c0371o4.i(onClick) ? 16384 : 8192) | (c0371o4.g(num) ? 131072 : 65536);
        if (c0371o4.K(i8 & 1, (i8 & 74899) != 74898)) {
            int iIntValue = num != null ? (num.intValue() * ((int) (Resources.getSystem().getDisplayMetrics().heightPixels / Resources.getSystem().getDisplayMetrics().density))) / 100 : 0;
            Object objH = c0371o4.H();
            P.S s6 = C0363k.f5418a;
            if (objH == s6) {
                objH = C0345b.q(Boolean.FALSE);
                c0371o4.d0(objH);
            }
            P.W w6 = (P.W) objH;
            Boolean bool2 = Boolean.TRUE;
            boolean zI = c0371o4.i(dataObject);
            Object objH2 = c0371o4.H();
            if (zI || objH2 == s6) {
                objH2 = new f5.k(dataObject, w6, null);
                c0371o4.d0(objH2);
            }
            C0345b.e((B5.e) objH2, c0371o4, bool2);
            FillElement fillElement = androidx.compose.foundation.layout.c.f9279c;
            InterfaceC1926C interfaceC1926CD = AbstractC0017n.d(c0717e2, false);
            int i9 = c0371o4.f5454P;
            InterfaceC0360i0 interfaceC0360i0M = c0371o4.m();
            InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o4, fillElement);
            InterfaceC0046k.f452a.getClass();
            B0.D d5 = C0045j.f445b;
            c0371o4.W();
            if (c0371o4.f5453O) {
                c0371o4.l(d5);
            } else {
                c0371o4.g0();
            }
            C0044i c0044i = C0045j.f448e;
            C0345b.u(c0044i, c0371o4, interfaceC1926CD);
            C0044i c0044i2 = C0045j.f447d;
            C0345b.u(c0044i2, c0371o4, interfaceC0360i0M);
            C0044i c0044i3 = C0045j.f;
            if (c0371o4.f5453O || !kotlin.jvm.internal.m.a(c0371o4.H(), Integer.valueOf(i9))) {
                k1.i.o(i9, c0371o4, i9, c0044i3);
            }
            C0044i c0044i4 = C0045j.f446c;
            C0345b.u(c0044i4, c0371o4, interfaceC0725mC);
            InterfaceC0725m interfaceC0725mD = androidx.compose.foundation.layout.b.d(fillElement, 0.0f, iIntValue, 0.0f, 0.0f, 13);
            C0022t c0022tA = A.r.a(AbstractC0012i.f108c, C0714b.f10074C, c0371o4, 54);
            int i10 = c0371o4.f5454P;
            InterfaceC0360i0 interfaceC0360i0M2 = c0371o4.m();
            InterfaceC0725m interfaceC0725mC2 = AbstractC0727o.c(c0371o4, interfaceC0725mD);
            c0371o4.W();
            if (c0371o4.f5453O) {
                c0371o4.l(d5);
            } else {
                c0371o4.g0();
            }
            C0345b.u(c0044i, c0371o4, c0022tA);
            C0345b.u(c0044i2, c0371o4, interfaceC0360i0M2);
            if (c0371o4.f5453O || !kotlin.jvm.internal.m.a(c0371o4.H(), Integer.valueOf(i10))) {
                k1.i.o(i10, c0371o4, i10, c0044i3);
            }
            C0345b.u(c0044i4, c0371o4, interfaceC0725mC2);
            c0371o4.S(-250432278);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C0435c0 c0435c0 = (C0435c0) it2.next();
                String str2 = c0435c0.f6925d;
                Integer num2 = c0435c0.f6922a;
                String str3 = c0435c0.f6926e;
                boolean zA = kotlin.jvm.internal.m.a(str2, "text");
                C0722j c0722j2 = C0722j.f10095q;
                if (zA) {
                    c0371o4.S(-138582716);
                    if (c0435c0.f != null) {
                        c0371o4.S(-138536185);
                        C0717e c0717e3 = c0717e2;
                        String str4 = c0435c0.f;
                        long jY = num2 != null ? AbstractC0836n2.y(num2.intValue()) : AbstractC0836n2.y(16);
                        Integer num3 = c0435c0.f6923b;
                        O0.j jVar = new O0.j(num3 != null ? num3.intValue() : 400);
                        long jY2 = AbstractC0836n2.y((num2 != null ? num2.intValue() : 16) + 2);
                        String str5 = c0435c0.f6924c;
                        if (str5 == null) {
                            str5 = "#111111";
                        }
                        z5 = false;
                        w3 = w6;
                        c0722j = c0722j2;
                        it = it2;
                        str = str3;
                        c0717e = c0717e3;
                        N0.b(str4, androidx.compose.foundation.layout.b.a(c0722j2, 10), AbstractC1145B.b(Color.parseColor(str5)), jY, jVar, 0L, new V0.k(3), jY2, 0, false, 0, 0, null, c0371o, 48, 0, 129488);
                        c0371o3 = c0371o;
                        c0371o3.p(false);
                    } else {
                        C0717e c0717e4 = c0717e2;
                        c0371o3 = c0371o4;
                        c0717e = c0717e4;
                        it = it2;
                        w3 = w6;
                        str = str3;
                        c0722j = c0722j2;
                        z5 = false;
                        c0371o3.S(-155446406);
                        c0371o3.p(false);
                    }
                } else {
                    C0717e c0717e5 = c0717e2;
                    c0371o3 = c0371o4;
                    c0717e = c0717e5;
                    it = it2;
                    w3 = w6;
                    str = str3;
                    c0722j = c0722j2;
                    z5 = false;
                    c0371o3.S(-155446406);
                }
                c0371o3.p(z5);
                if (kotlin.jvm.internal.m.a(c0435c0.f6925d, "image")) {
                    c0371o3.S(-137649151);
                    if (str == null || J5.m.U0(str) || str.equals("")) {
                        c0371o3.S(-155446406);
                    } else {
                        c0371o3.S(-137566102);
                        InterfaceC0725m interfaceC0725mA = ((Boolean) w3.getValue()).booleanValue() ? C0023u.a(c0722j) : androidx.compose.foundation.layout.c.h();
                        InterfaceC1926C interfaceC1926CD2 = AbstractC0017n.d(c0717e, z5);
                        int i11 = c0371o3.f5454P;
                        InterfaceC0360i0 interfaceC0360i0M3 = c0371o3.m();
                        InterfaceC0725m interfaceC0725mC3 = AbstractC0727o.c(c0371o3, interfaceC0725mA);
                        InterfaceC0046k.f452a.getClass();
                        B0.D d7 = C0045j.f445b;
                        c0371o3.W();
                        if (c0371o3.f5453O) {
                            c0371o3.l(d7);
                        } else {
                            c0371o3.g0();
                        }
                        C0345b.u(C0045j.f448e, c0371o3, interfaceC1926CD2);
                        C0345b.u(C0045j.f447d, c0371o3, interfaceC0360i0M3);
                        C0044i c0044i5 = C0045j.f;
                        if (c0371o3.f5453O || !kotlin.jvm.internal.m.a(c0371o3.H(), Integer.valueOf(i11))) {
                            k1.i.o(i11, c0371o3, i11, c0044i5);
                        }
                        C0345b.u(C0045j.f446c, c0371o3, interfaceC0725mC3);
                        u.b("file:///android_asset/onboarding_images/".concat(str), "", androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.c.f9277a, 0.0f, 0.0f, 0.0f, 10, 7), c0371o3);
                        c0371o3.p(true);
                    }
                    c0371o3.p(z5);
                } else {
                    c0371o3.S(-155446406);
                }
                c0371o3.p(z5);
                C0371o c0371o5 = c0371o3;
                c0717e2 = c0717e;
                c0371o4 = c0371o5;
                it2 = it;
                w6 = w3;
            }
            c0371o2 = c0371o4;
            c0371o2.p(false);
            c0371o2.p(true);
            float f7 = 10;
            InterfaceC0725m interfaceC0725mD2 = androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.c.f9277a.d(androidx.compose.foundation.layout.c.f9278b), 0.0f, f7, f7, 0.0f, 9);
            InterfaceC1926C interfaceC1926CD3 = AbstractC0017n.d(C0714b.f10078s, false);
            int i12 = c0371o2.f5454P;
            InterfaceC0360i0 interfaceC0360i0M4 = c0371o2.m();
            InterfaceC0725m interfaceC0725mC4 = AbstractC0727o.c(c0371o2, interfaceC0725mD2);
            InterfaceC0046k.f452a.getClass();
            B0.D d8 = C0045j.f445b;
            c0371o2.W();
            if (c0371o2.f5453O) {
                c0371o2.l(d8);
            } else {
                c0371o2.g0();
            }
            C0345b.u(C0045j.f448e, c0371o2, interfaceC1926CD3);
            C0345b.u(C0045j.f447d, c0371o2, interfaceC0360i0M4);
            C0044i c0044i6 = C0045j.f;
            if (c0371o2.f5453O || !kotlin.jvm.internal.m.a(c0371o2.H(), Integer.valueOf(i12))) {
                k1.i.o(i12, c0371o2, i12, c0044i6);
            }
            C0345b.u(C0045j.f446c, c0371o2, interfaceC0725mC4);
            if (c0517x == null || !bool.equals(Boolean.TRUE)) {
                c0371o2.S(75574597);
            } else {
                c0371o2.S(94552115);
                i(c0517x, onClick, c0371o2, (i8 >> 9) & 126);
            }
            c0371o2.p(false);
            c0371o2.p(true);
            c0371o2.p(true);
        } else {
            c0371o2 = c0371o4;
            c0371o2.N();
        }
        C0372o0 c0372o0R = c0371o2.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new a5.r(dataObject, list, bool, c0517x, onClick, num, i7, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void i(C0517x c0517x, B5.c onClick, C0371o c0371o, int i7) {
        int i8;
        C0517x c0517x2;
        B5.c cVar;
        C0371o c0371o2;
        kotlin.jvm.internal.m.e(onClick, "onClick");
        c0371o.U(-1827720558);
        if ((i7 & 6) == 0) {
            i8 = (c0371o.g(c0517x) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0371o.i(onClick) ? 32 : 16;
        }
        if (c0371o.K(i8 & 1, (i8 & 19) != 18)) {
            FillElement fillElement = androidx.compose.foundation.layout.c.f9277a;
            Q qA = O.a(AbstractC0012i.f107b, C0714b.f10072A, c0371o, 54);
            int i9 = c0371o.f5454P;
            InterfaceC0360i0 interfaceC0360i0M = c0371o.m();
            InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o, fillElement);
            InterfaceC0046k.f452a.getClass();
            B0.D d5 = C0045j.f445b;
            c0371o.W();
            if (c0371o.f5453O) {
                c0371o.l(d5);
            } else {
                c0371o.g0();
            }
            C0044i c0044i = C0045j.f448e;
            C0345b.u(c0044i, c0371o, qA);
            C0044i c0044i2 = C0045j.f447d;
            C0345b.u(c0044i2, c0371o, interfaceC0360i0M);
            C0044i c0044i3 = C0045j.f;
            if (c0371o.f5453O || !kotlin.jvm.internal.m.a(c0371o.H(), Integer.valueOf(i9))) {
                k1.i.o(i9, c0371o, i9, c0044i3);
            }
            C0044i c0044i4 = C0045j.f446c;
            C0345b.u(c0044i4, c0371o, interfaceC0725mC);
            InterfaceC0725m interfaceC0725mE = androidx.compose.foundation.layout.c.e(C0722j.f10095q, 100);
            Integer num = c0517x.f7207d;
            InterfaceC0725m interfaceC0725mN = AbstractC0597a.n(interfaceC0725mE, H.e.a(num != null ? num.intValue() : 0));
            InterfaceC1926C interfaceC1926CD = AbstractC0017n.d(C0714b.f10076q, false);
            int i10 = c0371o.f5454P;
            InterfaceC0360i0 interfaceC0360i0M2 = c0371o.m();
            InterfaceC0725m interfaceC0725mC2 = AbstractC0727o.c(c0371o, interfaceC0725mN);
            c0371o.W();
            if (c0371o.f5453O) {
                c0371o.l(d5);
            } else {
                c0371o.g0();
            }
            C0345b.u(c0044i, c0371o, interfaceC1926CD);
            C0345b.u(c0044i2, c0371o, interfaceC0360i0M2);
            if (c0371o.f5453O || !kotlin.jvm.internal.m.a(c0371o.H(), Integer.valueOf(i10))) {
                k1.i.o(i10, c0371o, i10, c0044i3);
            }
            C0345b.u(c0044i4, c0371o, interfaceC0725mC2);
            c0517x2 = c0517x;
            cVar = onClick;
            c0371o2 = c0371o;
            b(null, c0517x2, 10, cVar, c0371o2, ((i8 << 3) & 112) | 384 | ((i8 << 6) & 7168), 1);
            c0371o2.p(true);
            c0371o2.p(true);
        } else {
            c0517x2 = c0517x;
            cVar = onClick;
            c0371o2 = c0371o;
            c0371o2.N();
        }
        C0372o0 c0372o0R = c0371o2.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new X(i7, 2, c0517x2, cVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void j(final long j7, final B5.a onClick, C0371o c0371o, final int i7) {
        kotlin.jvm.internal.m.e(onClick, "onClick");
        c0371o.U(93073555);
        int i8 = (c0371o.f(j7) ? 4 : 2) | i7;
        C1223f c1223f = C1223f.f14430b;
        int i9 = i8 | (c0371o.i(c1223f) ? 32 : 16) | (c0371o.i(onClick) ? 256 : 128);
        if (c0371o.K(i9 & 1, (i9 & 147) != 146)) {
            c0371o.P();
            if ((i7 & 1) != 0 && !c0371o.w()) {
                c0371o.N();
            }
            c0371o.q();
            InterfaceC0725m interfaceC0725mC = androidx.compose.foundation.layout.c.c(C0722j.f10095q, 20);
            boolean z5 = (i9 & 896) == 256;
            Object objH = c0371o.H();
            P.S s6 = C0363k.f5418a;
            if (z5 || objH == s6) {
                objH = new e5.d(onClick, 2);
                c0371o.d0(objH);
            }
            InterfaceC0725m interfaceC0725mD = androidx.compose.foundation.a.d(interfaceC0725mC, (B5.a) objH);
            boolean zI = c0371o.i(c1223f) | ((i9 & 14) == 4);
            Object objH2 = c0371o.H();
            if (zI || objH2 == s6) {
                objH2 = new B5.c() { // from class: f5.e
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // B5.c
                    public final Object invoke(Object obj) {
                        InterfaceC1221d Canvas = (InterfaceC1221d) obj;
                        m.e(Canvas, "$this$Canvas");
                        C1152g c1152gA = j0.i.a();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.d() >> 32)) / 2.0f;
                        Path path = c1152gA.f13707a;
                        path.moveTo(fIntBitsToFloat, 0.0f);
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.d() >> 32)) / 4.0f;
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (Canvas.d() >> 32)) / 2.0f;
                        for (int i10 = 0; i10 < 12; i10++) {
                            double d5 = (((double) i10) * 3.141592653589793d) / ((double) 6);
                            double d7 = i10 % 2 == 0 ? fIntBitsToFloat3 : fIntBitsToFloat2;
                            float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (Canvas.d() >> 32)) / 2.0f) + ((float) (Math.cos(d5) * d7));
                            float fIntBitsToFloat5 = (Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)) / 2.0f) + ((float) (Math.sin(d5) * d7));
                            if (i10 == 0) {
                                path.moveTo(fIntBitsToFloat4, fIntBitsToFloat5);
                            } else {
                                path.lineTo(fIntBitsToFloat4, fIntBitsToFloat5);
                            }
                        }
                        path.close();
                        Canvas.w(c1152gA, j7, C1223f.f14430b);
                        return C1386y.f15098a;
                    }
                };
                c0371o.d0(objH2);
            }
            AbstractC1397A.b(interfaceC0725mD, (B5.c) objH2, c0371o, 0);
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new B5.e(j7, onClick, i7) { // from class: f5.f

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public final /* synthetic */ long f12765q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public final /* synthetic */ B5.a f12766r;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // B5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iW = C0345b.w(1);
                    E3.h.j(this.f12765q, this.f12766r, (C0371o) obj, iW);
                    return C1386y.f15098a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0108 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(android.content.Context r16, e3.p r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, s5.c r22) {
        /*
            r0 = r16
            r1 = r22
            boolean r2 = r1 instanceof e3.t
            if (r2 == 0) goto L17
            r2 = r1
            e3.t r2 = (e3.t) r2
            int r3 = r2.f12625v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f12625v = r3
            goto L1c
        L17:
            e3.t r2 = new e3.t
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f12624u
            int r3 = r2.f12625v
            m5.y r4 = m5.C1386y.f15098a
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            r5.a r9 = r5.EnumC1580a.f16356q
            if (r3 == 0) goto L64
            if (r3 == r7) goto L51
            if (r3 == r6) goto L40
            if (r3 != r5) goto L38
            java.lang.Object r0 = r2.f12620q
            a3.k r0 = (a3.C0632k) r0
            m5.AbstractC1362a.e(r1)
            return r0
        L38:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L40:
            java.lang.Object r0 = r2.f12623t
            a3.k r0 = (a3.C0632k) r0
            java.lang.String r3 = r2.f12622s
            java.lang.String r6 = r2.f12621r
            java.lang.Object r7 = r2.f12620q
            android.content.Context r7 = (android.content.Context) r7
            m5.AbstractC1362a.e(r1)
            goto Ld3
        L51:
            java.lang.Object r0 = r2.f12623t
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r3 = r2.f12622s
            java.lang.String r7 = r2.f12621r
            java.lang.Object r10 = r2.f12620q
            android.content.Context r10 = (android.content.Context) r10
            m5.AbstractC1362a.e(r1)
            r11 = r0
            r0 = r3
            r3 = r7
            goto La7
        L64:
            m5.AbstractC1362a.e(r1)
            r1 = r17
            r3 = r21
            a3.F r1 = H(r0, r1, r3)
            r2.f12620q = r0
            r3 = r18
            r2.f12621r = r3
            r10 = r19
            r2.f12622s = r10
            r11 = r20
            r2.f12623t = r11
            r2.f12625v = r7
            M5.h r12 = new M5.h
            q5.c r13 = n5.AbstractC1397A.v(r2)
            r12.<init>(r7, r13)
            r12.s()
            e3.q r13 = new e3.q
            r14 = 0
            r13.<init>(r12, r14)
            r1.b(r13)
            e3.q r13 = new e3.q
            r13.<init>(r12, r7)
            r1.a(r13)
            java.lang.Object r1 = r12.r()
            if (r1 != r9) goto La4
            goto L107
        La4:
            r15 = r10
            r10 = r0
            r0 = r15
        La7:
            a3.k r1 = (a3.C0632k) r1
            r2.f12620q = r10
            r2.f12621r = r0
            r2.f12622s = r11
            r2.f12623t = r1
            r2.f12625v = r6
            java.util.HashMap r6 = r1.f8836d
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto Lbd
        Lbb:
            r3 = r4
            goto Lcc
        Lbd:
            T5.e r6 = M5.H.f3811a
            T5.d r6 = T5.d.f7468q
            e3.s r7 = new e3.s
            r7.<init>(r1, r10, r3, r8)
            java.lang.Object r3 = M5.AbstractC0263y.B(r6, r7, r2)
            if (r3 != r9) goto Lbb
        Lcc:
            if (r3 != r9) goto Lcf
            goto L107
        Lcf:
            r6 = r0
            r0 = r1
            r7 = r10
            r3 = r11
        Ld3:
            r2.f12620q = r0
            r2.f12621r = r8
            r2.f12622s = r8
            r2.f12623t = r8
            r2.f12625v = r5
            java.util.HashMap r1 = r0.f
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Le6
            goto L105
        Le6:
            T5.e r1 = M5.H.f3811a
            T5.d r1 = T5.d.f7468q
            e3.r r5 = new e3.r
            r8 = 0
            r17 = r0
            r20 = r3
            r16 = r5
            r19 = r6
            r18 = r7
            r21 = r8
            r16.<init>(r17, r18, r19, r20, r21)
            r3 = r16
            java.lang.Object r1 = M5.AbstractC0263y.B(r1, r3, r2)
            if (r1 != r9) goto L105
            r4 = r1
        L105:
            if (r4 != r9) goto L108
        L107:
            return r9
        L108:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.h.k(android.content.Context, e3.p, java.lang.String, java.lang.String, java.lang.String, java.lang.String, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int l(float f7) {
        return Math.round((float) Math.ceil(f7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void m(boolean z5, String str) {
        if (!z5) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void n(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void o(int i7, int i8) {
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(S.j(i7, i8, "index: ", ", size: "));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void p(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void q(int i7, int i8) {
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(S.j(i7, i8, "index: ", ", size: "));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void r(int i7, int i8, int i9) {
        if (i7 >= 0 && i8 <= i9) {
            if (i7 > i8) {
                throw new IllegalArgumentException(S.j(i7, i8, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i7 + ", toIndex: " + i8 + ", size: " + i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int s(C0971S c0971s, E1.g gVar, View view, View view2, AbstractC0960G abstractC0960G, boolean z5) {
        if (abstractC0960G.v() == 0 || c0971s.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z5) {
            return Math.abs(AbstractC0960G.H(view) - AbstractC0960G.H(view2)) + 1;
        }
        return Math.min(gVar.l(), gVar.b(view2) - gVar.e(view));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int t(C0971S c0971s, E1.g gVar, View view, View view2, AbstractC0960G abstractC0960G, boolean z5, boolean z6) {
        if (abstractC0960G.v() == 0 || c0971s.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z6 ? Math.max(0, (c0971s.b() - Math.max(AbstractC0960G.H(view), AbstractC0960G.H(view2))) - 1) : Math.max(0, Math.min(AbstractC0960G.H(view), AbstractC0960G.H(view2)));
        if (z5) {
            return Math.round((iMax * (Math.abs(gVar.b(view2) - gVar.e(view)) / (Math.abs(AbstractC0960G.H(view) - AbstractC0960G.H(view2)) + 1))) + (gVar.k() - gVar.e(view)));
        }
        return iMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int u(C0971S c0971s, E1.g gVar, View view, View view2, AbstractC0960G abstractC0960G, boolean z5) {
        if (abstractC0960G.v() == 0 || c0971s.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z5) {
            return c0971s.b();
        }
        return (int) (((gVar.b(view2) - gVar.e(view)) / (Math.abs(AbstractC0960G.H(view) - AbstractC0960G.H(view2)) + 1)) * c0971s.b());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float[] v(float[] fArr, int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i7, length);
        float[] fArr2 = new float[i7];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static n1.d[] w(java.lang.String r17) {
        /*
            r0 = r17
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r5 = r2
            r4 = 1
        La:
            int r6 = r0.length()
            if (r4 >= r6) goto Lde
        L10:
            int r6 = r0.length()
            r7 = 69
            r8 = 101(0x65, float:1.42E-43)
            if (r4 >= r6) goto L34
            char r6 = r0.charAt(r4)
            int r9 = r6 + (-65)
            int r10 = r6 + (-90)
            int r10 = r10 * r9
            if (r10 <= 0) goto L2c
            int r9 = r6 + (-97)
            int r10 = r6 + (-122)
            int r10 = r10 * r9
            if (r10 > 0) goto L31
        L2c:
            if (r6 == r8) goto L31
            if (r6 == r7) goto L31
            goto L34
        L31:
            int r4 = r4 + 1
            goto L10
        L34:
            java.lang.String r5 = r0.substring(r5, r4)
            java.lang.String r5 = r5.trim()
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto Ld7
            char r6 = r5.charAt(r2)
            r9 = 122(0x7a, float:1.71E-43)
            if (r6 == r9) goto Lc9
            char r6 = r5.charAt(r2)
            r9 = 90
            if (r6 != r9) goto L54
            goto Lc9
        L54:
            int r6 = r5.length()     // Catch: java.lang.NumberFormatException -> Laa
            float[] r6 = new float[r6]     // Catch: java.lang.NumberFormatException -> Laa
            int r9 = r5.length()     // Catch: java.lang.NumberFormatException -> Laa
            r11 = r2
            r10 = 1
        L60:
            if (r10 >= r9) goto Lb4
            r13 = r2
            r14 = r13
            r15 = r14
            r16 = r15
            r12 = r10
        L68:
            int r3 = r5.length()     // Catch: java.lang.NumberFormatException -> Laa
            if (r12 >= r3) goto L9a
            char r3 = r5.charAt(r12)     // Catch: java.lang.NumberFormatException -> Laa
            r2 = 32
            if (r3 == r2) goto L91
            if (r3 == r7) goto L8f
            if (r3 == r8) goto L8f
            switch(r3) {
                case 44: goto L91;
                case 45: goto L88;
                case 46: goto L7e;
                default: goto L7d;
            }     // Catch: java.lang.NumberFormatException -> Laa
        L7d:
            goto L8d
        L7e:
            if (r14 != 0) goto L83
            r13 = 0
            r14 = 1
            goto L93
        L83:
            r13 = 0
            r15 = 1
            r16 = 1
            goto L93
        L88:
            if (r12 == r10) goto L8d
            if (r13 != 0) goto L8d
            goto L83
        L8d:
            r13 = 0
            goto L93
        L8f:
            r13 = 1
            goto L93
        L91:
            r13 = 0
            r15 = 1
        L93:
            if (r15 == 0) goto L96
            goto L9a
        L96:
            int r12 = r12 + 1
            r2 = 0
            goto L68
        L9a:
            if (r10 >= r12) goto Lac
            int r2 = r11 + 1
            java.lang.String r3 = r5.substring(r10, r12)     // Catch: java.lang.NumberFormatException -> Laa
            float r3 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.NumberFormatException -> Laa
            r6[r11] = r3     // Catch: java.lang.NumberFormatException -> Laa
            r11 = r2
            goto Lac
        Laa:
            r0 = move-exception
            goto Lbb
        Lac:
            if (r16 == 0) goto Lb1
            r10 = r12
        Laf:
            r2 = 0
            goto L60
        Lb1:
            int r10 = r12 + 1
            goto Laf
        Lb4:
            float[] r2 = v(r6, r11)     // Catch: java.lang.NumberFormatException -> Laa
            r3 = r2
            r2 = 0
            goto Lcb
        Lbb:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "error in parsing \""
            java.lang.String r3 = "\""
            java.lang.String r2 = C0.S.n(r2, r5, r3)
            r1.<init>(r2, r0)
            throw r1
        Lc9:
            float[] r3 = new float[r2]
        Lcb:
            char r5 = r5.charAt(r2)
            n1.d r2 = new n1.d
            r2.<init>(r5, r3)
            r1.add(r2)
        Ld7:
            int r2 = r4 + 1
            r5 = r4
            r4 = r2
            r2 = 0
            goto La
        Lde:
            int r4 = r4 - r5
            r2 = 1
            if (r4 != r2) goto Lf8
            int r2 = r0.length()
            if (r5 >= r2) goto Lf8
            char r0 = r0.charAt(r5)
            r2 = 0
            float[] r3 = new float[r2]
            n1.d r4 = new n1.d
            r4.<init>(r0, r3)
            r1.add(r4)
            goto Lf9
        Lf8:
            r2 = 0
        Lf9:
            n1.d[] r0 = new n1.d[r2]
            java.lang.Object[] r0 = r1.toArray(r0)
            n1.d[] r0 = (n1.d[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.h.w(java.lang.String):n1.d[]");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static n1.d[] x(n1.d[] dVarArr) {
        n1.d[] dVarArr2 = new n1.d[dVarArr.length];
        for (int i7 = 0; i7 < dVarArr.length; i7++) {
            dVarArr2[i7] = new n1.d(dVarArr[i7]);
        }
        return dVarArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float y(C0151e c0151e) {
        return c0151e.k().f1764e == EnumC1778d0.f17946r ? Float.intBitsToFloat((int) (c0151e.o() >> 32)) : Float.intBitsToFloat((int) (c0151e.o() & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void z(Exception exc, String str, Object... objArr) {
        if (Log.isLoggable("Vision", 6)) {
            if (Log.isLoggable("Vision", 3)) {
                Log.e("Vision", String.format(str, objArr), exc);
                return;
            }
            String str2 = String.format(str, objArr);
            String strValueOf = String.valueOf(exc);
            StringBuilder sb = new StringBuilder(strValueOf.length() + str2.length() + 2);
            sb.append(str2);
            sb.append(": ");
            sb.append(strValueOf);
            Log.e("Vision", sb.toString());
        }
    }
}
