package Q2;

import A.AbstractC0012i;
import A.AbstractC0017n;
import A.C0022t;
import A.O;
import A.Q;
import A.S;
import B0.C0044i;
import B0.C0045j;
import B0.D;
import B0.InterfaceC0046k;
import E.c0;
import F.B;
import M.AbstractC0235x;
import M.N0;
import M.s0;
import M5.C0256q;
import P.C0345b;
import P.C0348c0;
import P.C0363k;
import P.C0371o;
import P.C0372o0;
import P.InterfaceC0360i0;
import R4.C0464j1;
import R4.C0468k1;
import R4.H0;
import R4.K;
import R4.f3;
import Z5.W;
import a.AbstractC0597a;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import c0.AbstractC0727o;
import c0.C0714b;
import c0.C0716d;
import c0.C0722j;
import c0.InterfaceC0725m;
import com.google.android.gms.internal.measurement.AbstractC0803h;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.gms.internal.measurement.C0783d;
import com.google.android.gms.internal.measurement.C0793f;
import com.google.android.gms.internal.measurement.C0798g;
import com.google.android.gms.internal.measurement.C0828m;
import com.google.android.gms.internal.measurement.C0862t;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.gms.internal.measurement.InterfaceC0833n;
import com.google.android.gms.internal.measurement.K1;
import com.web2native.MainActivity;
import com.wnapp.smspariaz.R;
import e5.C1056a;
import e5.C1057b;
import j0.AbstractC1145B;
import j2.InterfaceC1159e;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import m5.C1386y;
import n1.AbstractC1393a;
import n5.AbstractC1397A;
import n5.x;
import o0.AbstractC1412b;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;
import p3.l0;
import q6.A;
import q6.z;
import w.EnumC1778d0;
import z0.C1949i;
import z0.InterfaceC1926C;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f6530a = 9;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f6531b = 6;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f6532c = 10;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f6533d = 5;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g() {
        new ConcurrentHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String A(MainActivity mainActivity) {
        ApplicationInfo applicationInfo;
        try {
            applicationInfo = mainActivity.getPackageManager().getApplicationInfo(mainActivity.getApplicationInfo().packageName, 0);
        } catch (Exception e7) {
            e7.printStackTrace();
            applicationInfo = null;
        }
        return applicationInfo != null ? mainActivity.getPackageManager().getApplicationLabel(applicationInfo).toString() : "Unknown";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final H5.c B(X5.f fVar) {
        kotlin.jvm.internal.m.e(fVar, "<this>");
        if (fVar instanceof X5.b) {
            ((X5.b) fVar).getClass();
            return null;
        }
        if (fVar instanceof W) {
            return B(((W) fVar).f8569a);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int C(Context context, int i, int i7) {
        Integer numValueOf;
        TypedValue typedValueM = AbstractC0597a.M(context, i);
        if (typedValueM != null) {
            int i8 = typedValueM.resourceId;
            numValueOf = Integer.valueOf(i8 != 0 ? context.getColor(i8) : typedValueM.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int D(View view, int i) {
        Context context = view.getContext();
        TypedValue typedValueO = AbstractC0597a.O(view.getContext(), i, view.getClass().getCanonicalName());
        int i7 = typedValueO.resourceId;
        return i7 != 0 ? context.getColor(i7) : typedValueO.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static androidx.concurrent.futures.n E(androidx.concurrent.futures.l lVar) {
        androidx.concurrent.futures.k kVar = new androidx.concurrent.futures.k();
        kVar.f9373c = new androidx.concurrent.futures.p();
        androidx.concurrent.futures.n nVar = new androidx.concurrent.futures.n(kVar);
        kVar.f9372b = nVar;
        kVar.f9371a = lVar.getClass();
        try {
            Object objB = lVar.b(kVar);
            if (objB == null) {
                return nVar;
            }
            kVar.f9371a = objB;
            return nVar;
        } catch (Exception e7) {
            nVar.f9377r.setException(e7);
            return nVar;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int F(B b7) {
        return (int) (b7.f1764e == EnumC1778d0.f17945q ? b7.g() & 4294967295L : b7.g() >> 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object G(I0.i iVar, I0.s sVar) {
        Object objG = iVar.f2257q.g(sVar);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean H(int i) {
        if (i == 0) {
            return false;
        }
        ThreadLocal threadLocal = AbstractC1393a.f15123a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d5 = ((double) iRed) / 255.0d;
        double dPow = d5 < 0.04045d ? d5 / 12.92d : Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
        double d7 = ((double) iGreen) / 255.0d;
        double dPow2 = d7 < 0.04045d ? d7 / 12.92d : Math.pow((d7 + 0.055d) / 1.055d, 2.4d);
        double d8 = ((double) iBlue) / 255.0d;
        double dPow3 = d8 < 0.04045d ? d8 / 12.92d : Math.pow((d8 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d9 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d9;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d9 / 100.0d > 0.5d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int I(float f, int i, int i7) {
        return AbstractC1393a.c(AbstractC1393a.e(i7, Math.round(Color.alpha(i7) * f)), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static d6.c J(d6.l r26) {
        /*
            r0 = r26
            java.lang.String r1 = "headers"
            kotlin.jvm.internal.m.e(r0, r1)
            int r1 = r0.size()
            r4 = 1
            r7 = r4
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
            r20 = 0
        L20:
            if (r6 >= r1) goto L1d7
            java.lang.String r2 = r0.g(r6)
            java.lang.String r5 = r0.i(r6)
            java.lang.String r3 = "Cache-Control"
            boolean r3 = J5.t.B0(r2, r3, r4)
            if (r3 == 0) goto L38
            if (r8 == 0) goto L36
        L34:
            r7 = 0
            goto L41
        L36:
            r8 = r5
            goto L41
        L38:
            java.lang.String r3 = "Pragma"
            boolean r2 = J5.t.B0(r2, r3, r4)
            if (r2 == 0) goto L1c8
            goto L34
        L41:
            r2 = 0
        L42:
            int r3 = r5.length()
            if (r2 >= r3) goto L1c8
            int r3 = r5.length()
            r22 = r4
            r4 = r2
        L4f:
            if (r4 >= r3) goto L67
            char r0 = r5.charAt(r4)
            r23 = r1
            java.lang.String r1 = "=,;"
            boolean r0 = J5.m.J0(r1, r0)
            if (r0 == 0) goto L60
            goto L6d
        L60:
            int r4 = r4 + 1
            r0 = r26
            r1 = r23
            goto L4f
        L67:
            r23 = r1
            int r4 = r5.length()
        L6d:
            java.lang.String r0 = r5.substring(r2, r4)
            java.lang.String r1 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.m.d(r0, r1)
            java.lang.CharSequence r0 = J5.m.n1(r0)
            java.lang.String r0 = r0.toString()
            int r2 = r5.length()
            if (r4 == r2) goto L10c
            char r2 = r5.charAt(r4)
            r3 = 44
            if (r2 == r3) goto L10c
            char r2 = r5.charAt(r4)
            r3 = 59
            if (r2 != r3) goto L96
            goto L10c
        L96:
            int r4 = r4 + 1
            byte[] r2 = e6.b.f12673a
            int r2 = r5.length()
        L9e:
            if (r4 >= r2) goto Lb4
            char r3 = r5.charAt(r4)
            r24 = r2
            r2 = 32
            if (r3 == r2) goto Laf
            r2 = 9
            if (r3 == r2) goto Laf
            goto Lb8
        Laf:
            int r4 = r4 + 1
            r2 = r24
            goto L9e
        Lb4:
            int r4 = r5.length()
        Lb8:
            int r2 = r5.length()
            if (r4 >= r2) goto Ld7
            char r2 = r5.charAt(r4)
            r3 = 34
            if (r2 != r3) goto Ld7
            int r4 = r4 + 1
            r2 = 4
            int r2 = J5.m.R0(r5, r3, r4, r2)
            java.lang.String r3 = r5.substring(r4, r2)
            kotlin.jvm.internal.m.d(r3, r1)
            int r2 = r2 + 1
            goto L110
        Ld7:
            int r2 = r5.length()
            r3 = r4
        Ldc:
            if (r3 >= r2) goto Lf6
            r24 = r2
            char r2 = r5.charAt(r3)
            r25 = r3
            java.lang.String r3 = ",;"
            boolean r2 = J5.m.J0(r3, r2)
            if (r2 == 0) goto Lf1
            r3 = r25
            goto Lfa
        Lf1:
            int r3 = r25 + 1
            r2 = r24
            goto Ldc
        Lf6:
            int r3 = r5.length()
        Lfa:
            java.lang.String r2 = r5.substring(r4, r3)
            kotlin.jvm.internal.m.d(r2, r1)
            java.lang.CharSequence r1 = J5.m.n1(r2)
            java.lang.String r1 = r1.toString()
            r2 = r3
            r3 = r1
            goto L110
        L10c:
            int r4 = r4 + 1
            r2 = r4
            r3 = 0
        L110:
            java.lang.String r1 = "no-cache"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L121
            r0 = r26
            r4 = r22
            r9 = r4
        L11d:
            r1 = r23
            goto L42
        L121:
            java.lang.String r1 = "no-store"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L12f
            r0 = r26
            r4 = r22
            r10 = r4
            goto L11d
        L12f:
            java.lang.String r1 = "max-age"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L141
            r1 = -1
            int r11 = e6.b.u(r1, r3)
        L13c:
            r0 = r26
            r4 = r22
            goto L11d
        L141:
            r1 = -1
            java.lang.String r4 = "s-maxage"
            boolean r4 = r4.equalsIgnoreCase(r0)
            if (r4 == 0) goto L14f
            int r12 = e6.b.u(r1, r3)
            goto L13c
        L14f:
            java.lang.String r1 = "private"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L15d
            r0 = r26
            r4 = r22
            r13 = r4
            goto L11d
        L15d:
            java.lang.String r1 = "public"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L16b
            r0 = r26
            r4 = r22
            r14 = r4
            goto L11d
        L16b:
            java.lang.String r1 = "must-revalidate"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L179
            r0 = r26
            r4 = r22
            r15 = r4
            goto L11d
        L179:
            java.lang.String r1 = "max-stale"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L189
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r16 = e6.b.u(r0, r3)
            goto L13c
        L189:
            java.lang.String r1 = "min-fresh"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L197
            r1 = -1
            int r17 = e6.b.u(r1, r3)
            goto L13c
        L197:
            r1 = -1
            java.lang.String r3 = "only-if-cached"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L1a8
            r0 = r26
            r4 = r22
            r18 = r4
            goto L11d
        L1a8:
            java.lang.String r3 = "no-transform"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L1b8
            r0 = r26
            r4 = r22
            r19 = r4
            goto L11d
        L1b8:
            java.lang.String r3 = "immutable"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L13c
            r0 = r26
            r4 = r22
            r20 = r4
            goto L11d
        L1c8:
            r23 = r1
            r22 = r4
            r1 = -1
            int r6 = r6 + 1
            r0 = r26
            r4 = r22
            r1 = r23
            goto L20
        L1d7:
            if (r7 != 0) goto L1dc
            r21 = 0
            goto L1de
        L1dc:
            r21 = r8
        L1de:
            d6.c r8 = new d6.c
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.g.J(d6.l):d6.c");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static u L(A a7) {
        int i = Integer.parseInt(a7.E(Long.MAX_VALUE));
        long j = Long.parseLong(a7.E(Long.MAX_VALUE));
        long j7 = Long.parseLong(a7.E(Long.MAX_VALUE));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i7 = Integer.parseInt(a7.E(Long.MAX_VALUE));
        for (int i8 = 0; i8 < i7; i8++) {
            String strE = a7.E(Long.MAX_VALUE);
            int iR0 = J5.m.R0(strE, ':', 0, 6);
            if (iR0 == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(strE).toString());
            }
            String strSubstring = strE.substring(0, iR0);
            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
            String string = J5.m.n1(strSubstring).toString();
            String strSubstring2 = strE.substring(iR0 + 1);
            kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
            String lowerCase = string.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(strSubstring2);
        }
        return new u(i, j, j7, new s(x.O(linkedHashMap)), null, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void M(MainActivity mainActivity, String str) {
        if (str == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        if (jSONObject.has("text")) {
            intent.putExtra("android.intent.extra.TEXT", jSONObject.getString("text"));
        }
        if (jSONObject.has("url")) {
            intent.putExtra("android.intent.extra.TEXT", jSONObject.getString("url"));
        }
        mainActivity.startActivity(Intent.createChooser(intent, jSONObject.has("title") ? jSONObject.getString("title") : "Share"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean N(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i = 0; i < bArr2.length; i++) {
                if (bArr[i] == bArr2[i]) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String O(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = r6.b.f16368a;
        int i7 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i7 < 8 && cArr2[i7] == '0') {
            i7++;
        }
        K1.i(i7, 8, 8);
        return new String(cArr2, i7, 8 - i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void P(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    public static final int Q(boolean z5, D.o oVar, int i) {
        return z5 ? ((D.p) oVar.f1255l.get(i)).f1274p : ((D.p) oVar.f1255l.get(i)).f1275q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void R(u uVar, z zVar) {
        zVar.b(uVar.f6581a);
        zVar.writeByte(10);
        zVar.b(uVar.f6582b);
        zVar.writeByte(10);
        zVar.b(uVar.f6583c);
        zVar.writeByte(10);
        Set<Map.Entry> setEntrySet = uVar.f6584d.f6576a.entrySet();
        Iterator it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        zVar.b(size);
        zVar.writeByte(10);
        for (Map.Entry entry : setEntrySet) {
            for (String str : (List) entry.getValue()) {
                zVar.R((String) entry.getKey());
                zVar.R(":");
                zVar.R(str);
                zVar.writeByte(10);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:27:0x0061) to fix multi-entry loop: BACK_EDGE: B:31:0x006b -> B:27:0x0061 */
    /* JADX DEBUG: Duplicate block (B:27:0x0061) to fix multi-entry loop: BACK_EDGE: B:33:0x0091 -> B:27:0x0061 */
    public static InterfaceC0833n S(C0783d c0783d, c0 c0Var, ArrayList arrayList, boolean z5) {
        InterfaceC0833n interfaceC0833nA;
        I1.J0(1, "reduce", arrayList);
        I1.K0("reduce", 2, arrayList);
        InterfaceC0833n interfaceC0833nC = ((C0862t) c0Var.f1553r).c(c0Var, (InterfaceC0833n) arrayList.get(0));
        if (!(interfaceC0833nC instanceof AbstractC0803h)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (arrayList.size() == 2) {
            interfaceC0833nA = ((C0862t) c0Var.f1553r).c(c0Var, (InterfaceC0833n) arrayList.get(1));
            if (interfaceC0833nA instanceof C0793f) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (c0783d.p() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            interfaceC0833nA = null;
        }
        AbstractC0803h abstractC0803h = (AbstractC0803h) interfaceC0833nC;
        int iP = c0783d.p();
        int i = z5 ? 0 : iP - 1;
        int i7 = z5 ? iP - 1 : 0;
        int i8 = true == z5 ? 1 : -1;
        if (interfaceC0833nA == null) {
            interfaceC0833nA = c0783d.q(i);
            i += i8;
        }
        while ((i7 - i) * i8 >= 0) {
            if (c0783d.s(i)) {
                interfaceC0833nA = abstractC0803h.a(c0Var, Arrays.asList(interfaceC0833nA, c0783d.q(i), new C0798g(Double.valueOf(i)), c0783d));
                if (interfaceC0833nA instanceof C0793f) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i += i8;
            } else {
                i += i8;
            }
        }
        return interfaceC0833nA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0783d T(C0783d c0783d, c0 c0Var, C0828m c0828m, Boolean bool, Boolean bool2) {
        C0783d c0783d2 = new C0783d();
        Iterator itO = c0783d.o();
        while (itO.hasNext()) {
            int iIntValue = ((Integer) itO.next()).intValue();
            if (c0783d.s(iIntValue)) {
                InterfaceC0833n interfaceC0833nA = c0828m.a(c0Var, Arrays.asList(c0783d.q(iIntValue), new C0798g(Double.valueOf(iIntValue)), c0783d));
                if (interfaceC0833nA.c().equals(bool)) {
                    break;
                }
                if (bool2 == null || interfaceC0833nA.c().equals(bool2)) {
                    c0783d2.r(iIntValue, interfaceC0833nA);
                }
            }
        }
        return c0783d2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final W0.e a(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f7 = context.getResources().getDisplayMetrics().density;
        X0.a aVarA = X0.b.a(f);
        if (aVarA == null) {
            aVarA = new W0.m(f);
        }
        return new W0.e(f7, f, aVarA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final U2.c b(U2.g gVar, Throwable th) {
        I2.n nVar;
        if (th instanceof U2.m) {
            B5.c cVar = gVar.f7667m;
            U2.e eVar = gVar.f7673s;
            nVar = (I2.n) cVar.invoke(gVar);
            if (nVar == null) {
                nVar = (I2.n) eVar.j.invoke(gVar);
            }
            if (nVar == null && (nVar = (I2.n) gVar.f7666l.invoke(gVar)) == null) {
                nVar = (I2.n) eVar.i.invoke(gVar);
            }
        } else {
            nVar = (I2.n) gVar.f7666l.invoke(gVar);
            if (nVar == null) {
                nVar = (I2.n) gVar.f7673s.i.invoke(gVar);
            }
        }
        return new U2.c(nVar, gVar, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static J2.p c(q6.x xVar, q6.l lVar, String str, K2.h hVar, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            hVar = null;
        }
        return new J2.p(xVar, lVar, str, hVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long d(int i) {
        long j = (((long) i) << 32) | (((long) 0) & 4294967295L);
        int i7 = t0.a.f16670n;
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void e(C0468k1 c0468k1, String str, String str2, String str3, C0371o c0371o, int i) {
        C0371o c0371o2 = c0371o;
        c0371o2.U(1839082967);
        int i7 = i | (c0371o2.i(c0468k1) ? 4 : 2) | (c0371o2.g(str) ? 32 : 16) | (c0371o2.g(str2) ? 256 : 128) | (c0371o2.g(str3) ? 2048 : 1024);
        if (c0371o2.K(i7 & 1, (i7 & 1171) != 1170)) {
            C0716d c0716d = C0714b.f10072A;
            float f = 20;
            float f7 = 50;
            InterfaceC0725m interfaceC0725mA = androidx.compose.foundation.layout.c.a(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.a.a(C0722j.f10095q, AbstractC1145B.b(Color.parseColor(str3)), AbstractC1145B.f13658a), f, 0.0f, f7, 0.0f, 10), f7);
            Q qA = O.a(AbstractC0012i.f106a, c0716d, c0371o2, 48);
            int i8 = c0371o2.f5454P;
            InterfaceC0360i0 interfaceC0360i0M = c0371o2.m();
            InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o2, interfaceC0725mA);
            InterfaceC0046k.f452a.getClass();
            D d5 = C0045j.f445b;
            c0371o2.W();
            if (c0371o2.f5453O) {
                c0371o2.l(d5);
            } else {
                c0371o2.g0();
            }
            C0345b.u(C0045j.f448e, c0371o2, qA);
            C0345b.u(C0045j.f447d, c0371o2, interfaceC0360i0M);
            C0044i c0044i = C0045j.f;
            if (c0371o2.f5453O || !kotlin.jvm.internal.m.a(c0371o2.H(), Integer.valueOf(i8))) {
                k1.i.o(i8, c0371o2, i8, c0044i);
            }
            C0345b.u(C0045j.f446c, c0371o2, interfaceC0725mC);
            boolean zI = c0371o2.i(c0468k1);
            Object objH = c0371o2.H();
            if (zI || objH == C0363k.f5418a) {
                objH = new C0464j1(c0468k1, 3);
                c0371o2.d0(objH);
            }
            s0.c((B5.a) objH, null, false, null, X.k.d(-977387466, new a5.n(str2, 1), c0371o2), c0371o2, 196608, 30);
            N0.b(str, androidx.compose.foundation.layout.b.d(S.a(), f, 0.0f, 0.0f, 0.0f, 14), AbstractC1145B.b(Color.parseColor(str2)), AbstractC0836n2.y(18), O0.j.f4283u, 0L, new V0.k(3), 0L, 0, false, 0, 0, null, c0371o, ((i7 >> 3) & 14) | 199680, 0, 130512);
            c0371o2 = c0371o;
            c0371o2.p(true);
        } else {
            c0371o2.N();
        }
        C0372o0 c0372o0R = c0371o2.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new U4.Q(c0468k1, str, str2, str3, i, 3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void f(C0468k1 c0468k1, C1057b c1057b, B5.a aVar, C0371o c0371o, int i) {
        InterfaceC0725m interfaceC0725mA;
        int i7;
        float f;
        C0044i c0044i;
        C0044i c0044i2;
        C0044i c0044i3;
        C0044i c0044i4;
        C0722j c0722j;
        String str;
        boolean z5;
        O3.D d5;
        D d7;
        String str2;
        O3.D d8;
        String str3;
        boolean z6;
        boolean z7;
        float f7;
        O3.D d9;
        boolean z8;
        int i8;
        C0371o c0371o2 = c0371o;
        c0371o2.U(109357238);
        int i9 = i | (c0371o2.i(c0468k1) ? 4 : 2) | (c0371o2.g(c1057b) ? 32 : 16);
        if (c0371o2.K(i9 & 1, (i9 & 147) != 146)) {
            String str4 = c1057b.f12648g;
            String str5 = c1057b.f12644b;
            O3.D d10 = AbstractC1145B.f13658a;
            P.S s6 = C0363k.f5418a;
            C1386y c1386y = C1386y.f15098a;
            if (str4 == null || !str4.equals("unread")) {
                c0371o2.S(2013128260);
                InterfaceC0725m interfaceC0725mA2 = androidx.compose.foundation.a.a(androidx.compose.foundation.layout.c.f9277a, AbstractC1145B.b(Color.parseColor("#FFFFFF")), d10);
                boolean zI = ((i9 & 112) == 32) | c0371o2.i(c0468k1);
                Object objH = c0371o2.H();
                if (zI || objH == s6) {
                    objH = new e5.e(c0468k1, c1057b, aVar, 1);
                    c0371o2.d0(objH);
                }
                interfaceC0725mA = v0.u.a(interfaceC0725mA2, c1386y, (PointerInputEventHandler) objH);
                i7 = 0;
                c0371o2.p(false);
            } else {
                c0371o2.S(2013102501);
                InterfaceC0725m interfaceC0725mA3 = androidx.compose.foundation.a.a(androidx.compose.foundation.layout.c.f9277a, AbstractC1145B.b(Color.parseColor("#FFF7F5")), d10);
                boolean zI2 = ((i9 & 112) == 32) | c0371o2.i(c0468k1);
                Object objH2 = c0371o2.H();
                if (zI2 || objH2 == s6) {
                    objH2 = new e5.e(c0468k1, c1057b, aVar, 0);
                    c0371o2.d0(objH2);
                }
                interfaceC0725mA = v0.u.a(interfaceC0725mA3, c1386y, (PointerInputEventHandler) objH2);
                i7 = 0;
                c0371o2.p(false);
            }
            C0022t c0022tA = A.r.a(AbstractC0012i.f108c, C0714b.f10073B, c0371o2, i7);
            int i10 = c0371o2.f5454P;
            InterfaceC0360i0 interfaceC0360i0M = c0371o2.m();
            InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o2, interfaceC0725mA);
            InterfaceC0046k.f452a.getClass();
            D d11 = C0045j.f445b;
            c0371o2.W();
            if (c0371o2.f5453O) {
                c0371o2.l(d11);
            } else {
                c0371o2.g0();
            }
            C0044i c0044i5 = C0045j.f448e;
            C0345b.u(c0044i5, c0371o2, c0022tA);
            C0044i c0044i6 = C0045j.f447d;
            C0345b.u(c0044i6, c0371o2, interfaceC0360i0M);
            C0044i c0044i7 = C0045j.f;
            if (c0371o2.f5453O || !kotlin.jvm.internal.m.a(c0371o2.H(), Integer.valueOf(i10))) {
                k1.i.o(i10, c0371o2, i10, c0044i7);
            }
            C0044i c0044i8 = C0045j.f446c;
            C0345b.u(c0044i8, c0371o2, interfaceC0725mC);
            C0716d c0716d = C0714b.f10072A;
            float f8 = 10;
            C0722j c0722j2 = C0722j.f10095q;
            InterfaceC0725m interfaceC0725mD = androidx.compose.foundation.layout.b.d(c0722j2, 20, 15, f8, 0.0f, 8);
            Q qA = O.a(AbstractC0012i.f106a, c0716d, c0371o2, 48);
            int i11 = c0371o2.f5454P;
            InterfaceC0360i0 interfaceC0360i0M2 = c0371o2.m();
            InterfaceC0725m interfaceC0725mC2 = AbstractC0727o.c(c0371o2, interfaceC0725mD);
            c0371o2.W();
            if (c0371o2.f5453O) {
                c0371o2.l(d11);
            } else {
                c0371o2.g0();
            }
            C0345b.u(c0044i5, c0371o2, qA);
            C0345b.u(c0044i6, c0371o2, interfaceC0360i0M2);
            if (c0371o2.f5453O || !kotlin.jvm.internal.m.a(c0371o2.H(), Integer.valueOf(i11))) {
                k1.i.o(i11, c0371o2, i11, c0044i7);
            }
            C0345b.u(c0044i8, c0371o2, interfaceC0725mC2);
            String str6 = c1057b.f12648g;
            AbstractC0017n.a((str6 == null || !str6.equals("unread")) ? androidx.compose.foundation.a.a(AbstractC0597a.n(androidx.compose.foundation.layout.c.c(c0722j2, f8), H.e.f2031a), AbstractC1145B.b(Color.parseColor("#D4D3D3")), d10) : androidx.compose.foundation.a.a(AbstractC0597a.n(androidx.compose.foundation.layout.c.c(c0722j2, f8), H.e.f2031a), AbstractC1145B.b(Color.parseColor("#FF5447")), d10), c0371o2, 0);
            String str7 = c1057b.f12645c;
            if (str7 == null) {
                c0371o2.S(-4899612);
                c0371o2.p(false);
                c0044i3 = c0044i8;
                c0044i2 = c0044i6;
                c0044i4 = c0044i7;
                d7 = d11;
                c0044i = c0044i5;
                f = f8;
                c0722j = c0722j2;
                str2 = str5;
                str = "#363942";
                z5 = false;
                d5 = d10;
            } else {
                c0371o2.S(-4899611);
                f = f8;
                c0044i = c0044i5;
                c0044i2 = c0044i6;
                c0044i3 = c0044i8;
                c0044i4 = c0044i7;
                c0722j = c0722j2;
                str = "#363942";
                z5 = false;
                d5 = d10;
                d7 = d11;
                str2 = str5;
                N0.b(str7, androidx.compose.foundation.layout.b.d(S.a(), f8, 0.0f, f8, 0.0f, 10), AbstractC1145B.b(Color.parseColor("#363942")), AbstractC0836n2.y(17), O0.j.f4283u, 0L, null, 0L, 0, false, 0, 0, null, c0371o, 199680, 0, 131024);
                c0371o2 = c0371o;
                c0371o2.p(false);
            }
            String str8 = c1057b.f12647e;
            if (str8 == null) {
                c0371o2.S(-4447012);
                c0371o2.p(z5);
                z7 = z5;
                d8 = d5;
                z6 = true;
            } else {
                c0371o2.S(-4447011);
                String[] strArr = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
                long j = Long.parseLong(str8);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date(j));
                int i12 = calendar.get(2);
                String strQ = q(String.valueOf(calendar.get(5)));
                int i13 = calendar.get(1);
                String strQ2 = q(String.valueOf(calendar.get(11)));
                String strQ3 = q(String.valueOf(calendar.get(12)));
                d8 = d5;
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i14 = calendar.get(1);
                String strQ4 = q(String.valueOf(calendar.get(5)));
                String strQ5 = q(String.valueOf(calendar.get(11)));
                String strQ6 = q(String.valueOf(calendar.get(12)));
                if (i14 != i13) {
                    str3 = strQ + " " + strArr[i12] + ", " + i13;
                } else if (!kotlin.jvm.internal.m.a(strQ, strQ4)) {
                    str3 = strQ + " " + strArr[i12];
                } else if (kotlin.jvm.internal.m.a(strQ2, strQ5) && kotlin.jvm.internal.m.a(strQ3, strQ6)) {
                    str3 = "now";
                } else {
                    str3 = strQ2 + ":" + strQ3;
                }
                String str9 = str3;
                z6 = true;
                N0.b(str9, null, AbstractC1145B.b(Color.parseColor("#88363942")), AbstractC0836n2.y(12), null, 0L, null, 0L, 0, false, 0, 0, null, c0371o, 3072, 0, 131058);
                c0371o2 = c0371o;
                z7 = false;
                c0371o2.p(false);
            }
            c0371o2.p(z6);
            String str10 = c1057b.f12646d;
            if (str10 == null) {
                c0371o2.S(2016039387);
                c0371o2.p(z7);
                f7 = f;
            } else {
                c0371o2.S(2016039388);
                float f9 = f;
                f7 = f9;
                N0.b(str10, androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.c.f9277a, 35, 3, f9, 0.0f, 8), AbstractC1145B.b(Color.parseColor(str)), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0371o, 48, 0, 131064);
                c0371o2 = c0371o;
                D5.a.h(c0371o2, androidx.compose.foundation.layout.c.a(c0722j, f7));
                c0371o2.p(false);
            }
            if (str2 == null || str2.length() == 0) {
                d9 = d8;
                z8 = false;
                i8 = 1;
                c0371o2.S(2000507830);
            } else {
                c0371o2.S(2016472985);
                float f10 = 150;
                float f11 = 8;
                d9 = d8;
                InterfaceC0725m interfaceC0725mA4 = androidx.compose.foundation.a.a(AbstractC0597a.n(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.c.g(androidx.compose.foundation.layout.c.f9277a), 35, 0.0f, f10, 0.0f, 10), H.e.b(f11)), j0.o.f, d9);
                InterfaceC1926C interfaceC1926CD = AbstractC0017n.d(C0714b.f10076q, false);
                int i15 = c0371o2.f5454P;
                InterfaceC0360i0 interfaceC0360i0M3 = c0371o2.m();
                InterfaceC0725m interfaceC0725mC3 = AbstractC0727o.c(c0371o2, interfaceC0725mA4);
                c0371o2.W();
                if (c0371o2.f5453O) {
                    c0371o2.l(d7);
                } else {
                    c0371o2.g0();
                }
                C0345b.u(c0044i, c0371o2, interfaceC1926CD);
                C0345b.u(c0044i2, c0371o2, interfaceC0360i0M3);
                if (c0371o2.f5453O || !kotlin.jvm.internal.m.a(c0371o2.H(), Integer.valueOf(i15))) {
                    k1.i.o(i15, c0371o2, i15, c0044i4);
                }
                C0345b.u(c0044i3, c0371o2, interfaceC0725mC3);
                D5.a.c(u2.u.e(str2, c0371o2), null, AbstractC0597a.n(androidx.compose.foundation.layout.c.a(androidx.compose.foundation.layout.c.e(c0722j, 250), f10), H.e.b(f11)), null, C1949i.f18697d, 0.0f, null, c0371o2, 24624, 104);
                i8 = 1;
                c0371o2.p(true);
                D5.a.h(c0371o2, androidx.compose.foundation.layout.c.a(c0722j, f7));
                z8 = false;
            }
            c0371o2.p(z8);
            AbstractC0017n.a(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.a.a(androidx.compose.foundation.layout.c.a(androidx.compose.foundation.layout.c.f9277a, i8), AbstractC1145B.b(Color.parseColor("#ECECEC")), d9), 0.0f, 150, 0.0f, 0.0f, 13), c0371o2, 0);
            c0371o2.p(true);
        } else {
            c0371o2.N();
        }
        C0372o0 c0372o0R = c0371o2.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new U1.s(c0468k1, c1057b, aVar, i, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(R4.C0468k1 r21, java.lang.String r22, P.C0371o r23, int r24) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = r21
            r6 = r22
            r4 = r23
            r13 = r24
            java.lang.String r1 = "dataObjects"
            kotlin.jvm.internal.m.e(r0, r1)
            com.web2native.MainActivity r14 = r0.f7067a
            r1 = -190825194(0xfffffffff4a03d16, float:-1.0156329E32)
            r4.U(r1)
            boolean r1 = r4.i(r0)
            if (r1 == 0) goto L1d
            r1 = 4
            goto L1e
        L1d:
            r1 = 2
        L1e:
            r1 = r1 | r13
            boolean r2 = r4.g(r6)
            if (r2 == 0) goto L28
            r2 = 32
            goto L2a
        L28:
            r2 = 16
        L2a:
            r1 = r1 | r2
            r2 = r1 & 19
            r3 = 18
            r5 = 0
            if (r2 == r3) goto L34
            r2 = 1
            goto L35
        L34:
            r2 = r5
        L35:
            r3 = r1 & 1
            boolean r2 = r4.K(r3, r2)
            if (r2 == 0) goto L2f7
            r2 = 0
            if (r6 == 0) goto L45
            android.net.Uri r3 = android.net.Uri.parse(r6)
            goto L46
        L45:
            r3 = r2
        L46:
            if (r3 != 0) goto L53
            r1 = 1663591684(0x63286504, float:3.106332E21)
            r4.S(r1)
            r4.p(r5)
            goto L2fa
        L53:
            r3 = 1663591685(0x63286505, float:3.1063322E21)
            r4.S(r3)
            P.T0 r3 = C0.AbstractC0103t0.f1116h
            java.lang.Object r3 = r4.k(r3)
            W0.c r3 = (W0.c) r3
            r3 = 1578842160(0x5e1b3830, float:2.79618561E18)
            r4.S(r3)
            r4.p(r5)
            P.T0 r3 = C0.AbstractC0103t0.f1120n
            java.lang.Object r3 = r4.k(r3)
            W0.l r3 = (W0.l) r3
            r3 = 1579046512(0x5e1e5670, float:2.85235746E18)
            r4.S(r3)
            r4.p(r5)
            r3 = 1579192336(0x5e209010, float:2.89244126E18)
            r4.S(r3)
            r4.p(r5)
            java.lang.Object r3 = r4.H()
            P.S r7 = P.C0363k.f5418a
            if (r3 != r7) goto La0
            int r3 = android.os.Build.VERSION.SDK_INT
            r8 = 35
            if (r3 < r8) goto L94
            r3 = 1
            goto L95
        L94:
            r3 = r5
        L95:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            P.f0 r3 = P.C0345b.q(r3)
            r4.d0(r3)
        La0:
            r16 = r3
            P.W r16 = (P.W) r16
            java.lang.Object r3 = r4.H()
            java.lang.String r8 = "title"
            java.lang.String r9 = "titleBarContentColor"
            java.lang.String r10 = "titleBarBgColor"
            if (r3 != r7) goto Le3
            java.lang.String r3 = "#"
            java.lang.String r11 = "%23"
            java.lang.String r3 = J5.t.E0(r6, r3, r11)
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            java.lang.String r12 = r3.getQueryParameter(r8)
            if (r12 == 0) goto Lca
            r11.put(r8, r12)
        Lca:
            java.lang.String r12 = r3.getQueryParameter(r9)
            if (r12 == 0) goto Ld3
            r11.put(r9, r12)
        Ld3:
            java.lang.String r3 = r3.getQueryParameter(r10)
            if (r3 == 0) goto Ldc
            r11.put(r10, r3)
        Ldc:
            P.f0 r3 = P.C0345b.q(r11)
            r4.d0(r3)
        Le3:
            P.W r3 = (P.W) r3
            java.lang.Object r11 = r4.H()
            java.lang.String r12 = ""
            if (r11 != r7) goto L11f
            java.lang.Object r11 = r3.getValue()
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r11 = r11.get(r10)
            if (r11 == 0) goto L116
            java.lang.Object r11 = r3.getValue()
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r11 = r11.get(r10)
            boolean r11 = kotlin.jvm.internal.m.a(r11, r12)
            if (r11 != 0) goto L116
            java.lang.Object r11 = r3.getValue()
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r10 = r11.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            goto L118
        L116:
            java.lang.String r10 = "#ffffff"
        L118:
            P.f0 r11 = P.C0345b.q(r10)
            r4.d0(r11)
        L11f:
            r10 = r11
            P.W r10 = (P.W) r10
            java.lang.Object r11 = r4.H()
            if (r11 != r7) goto L15a
            java.lang.Object r11 = r3.getValue()
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r11 = r11.get(r9)
            if (r11 == 0) goto L151
            java.lang.Object r11 = r3.getValue()
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r11 = r11.get(r9)
            boolean r11 = kotlin.jvm.internal.m.a(r11, r12)
            if (r11 != 0) goto L151
            java.lang.Object r11 = r3.getValue()
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r9 = r11.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            goto L153
        L151:
            java.lang.String r9 = "#222222"
        L153:
            P.f0 r11 = P.C0345b.q(r9)
            r4.d0(r11)
        L15a:
            r17 = r11
            P.W r17 = (P.W) r17
            java.lang.Object r9 = r4.H()
            if (r9 != r7) goto L196
            java.lang.Object r9 = r3.getValue()
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r9 = r9.get(r8)
            if (r9 == 0) goto L18d
            java.lang.Object r9 = r3.getValue()
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r9 = r9.get(r8)
            boolean r9 = kotlin.jvm.internal.m.a(r9, r12)
            if (r9 != 0) goto L18d
            java.lang.Object r3 = r3.getValue()
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r3 = r3.get(r8)
            java.lang.String r3 = (java.lang.String) r3
            goto L18f
        L18d:
            java.lang.String r3 = "Notification"
        L18f:
            P.f0 r9 = P.C0345b.q(r3)
            r4.d0(r9)
        L196:
            r3 = r9
            P.W r3 = (P.W) r3
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            boolean r9 = r4.i(r0)
            java.lang.Object r11 = r4.H()
            if (r9 != 0) goto L1a7
            if (r11 != r7) goto L1af
        L1a7:
            e5.f r11 = new e5.f
            r11.<init>(r0, r10, r2)
            r4.d0(r11)
        L1af:
            B5.e r11 = (B5.e) r11
            P.C0345b.e(r11, r4, r8)
            androidx.compose.foundation.layout.FillElement r2 = androidx.compose.foundation.layout.c.f9279c
            long r7 = j0.o.f13719c
            O3.D r9 = j0.AbstractC1145B.f13658a
            c0.m r2 = androidx.compose.foundation.a.a(r2, r7, r9)
            c0.e r11 = c0.C0714b.f10076q
            z0.C r11 = A.AbstractC0017n.d(r11, r5)
            int r12 = r4.f5454P
            P.i0 r15 = r4.m()
            c0.m r2 = c0.AbstractC0727o.c(r4, r2)
            B0.j r18 = B0.InterfaceC0046k.f452a
            r18.getClass()
            B0.D r5 = B0.C0045j.f445b
            r4.W()
            boolean r0 = r4.f5453O
            if (r0 == 0) goto L1e0
            r4.l(r5)
            goto L1e3
        L1e0:
            r4.g0()
        L1e3:
            B0.i r0 = B0.C0045j.f448e
            P.C0345b.u(r0, r4, r11)
            B0.i r11 = B0.C0045j.f447d
            P.C0345b.u(r11, r4, r15)
            B0.i r15 = B0.C0045j.f
            r19 = r1
            boolean r1 = r4.f5453O
            if (r1 != 0) goto L206
            java.lang.Object r1 = r4.H()
            r20 = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            boolean r1 = kotlin.jvm.internal.m.a(r1, r3)
            if (r1 != 0) goto L20b
            goto L208
        L206:
            r20 = r3
        L208:
            k1.i.o(r12, r4, r12, r15)
        L20b:
            B0.i r1 = B0.C0045j.f446c
            P.C0345b.u(r1, r4, r2)
            c0.j r2 = c0.C0722j.f10095q
            c0.m r2 = androidx.compose.foundation.a.a(r2, r7, r9)
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.m.e(r2, r3)
            A.b r3 = A.AbstractC0012i.f108c
            c0.c r7 = c0.C0714b.f10073B
            r8 = 0
            A.t r3 = A.r.a(r3, r7, r4, r8)
            int r7 = r4.f5454P
            P.i0 r9 = r4.m()
            c0.m r2 = c0.AbstractC0727o.c(r4, r2)
            r4.W()
            boolean r12 = r4.f5453O
            if (r12 == 0) goto L239
            r4.l(r5)
            goto L23c
        L239:
            r4.g0()
        L23c:
            P.C0345b.u(r0, r4, r3)
            P.C0345b.u(r11, r4, r9)
            boolean r0 = r4.f5453O
            if (r0 != 0) goto L254
            java.lang.Object r0 = r4.H()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            boolean r0 = kotlin.jvm.internal.m.a(r0, r3)
            if (r0 != 0) goto L257
        L254:
            k1.i.o(r7, r4, r7, r15)
        L257:
            P.C0345b.u(r1, r4, r2)
            java.lang.Object r0 = r10.getValue()
            java.lang.String r0 = (java.lang.String) r0
            kotlin.jvm.internal.m.b(r0)
            r11 = 0
            r12 = 5
            r7 = 0
            r9 = 0
            r18 = r8
            r8 = r0
            r0 = r10
            r10 = r4
            U4.AbstractC0534a.t(r7, r8, r9, r10, r11, r12)
            java.lang.Object r1 = r20.getValue()
            java.lang.String r1 = (java.lang.String) r1
            kotlin.jvm.internal.m.b(r1)
            java.lang.Object r2 = r17.getValue()
            java.lang.String r2 = (java.lang.String) r2
            kotlin.jvm.internal.m.b(r2)
            java.lang.Object r0 = r0.getValue()
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            kotlin.jvm.internal.m.b(r3)
            r5 = r19 & 14
            r0 = r21
            r4 = r23
            r8 = r18
            e(r0, r1, r2, r3, r4, r5)
            h(r0, r4, r5)
            r1 = 1
            r4.p(r1)
            java.lang.Object r1 = r16.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L2e9
            r1 = 188208031(0xb37d39f, float:3.5403724E-32)
            r4.S(r1)
            float r1 = (float) r8
            android.content.res.Resources r2 = r14.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r1 / r2
            java.lang.String r3 = "START"
            r5 = 3126(0xc36, float:4.38E-42)
            U4.AbstractC0534a.l(r8, r3, r2, r4, r5)
            android.content.res.Resources r2 = r14.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r1 / r2
            java.lang.String r3 = "END"
            U4.AbstractC0534a.l(r8, r3, r2, r4, r5)
            android.content.res.Resources r2 = r14.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 / r2
            java.lang.String r2 = "BOTTOM"
            U4.AbstractC0534a.l(r8, r2, r1, r4, r5)
        L2e4:
            r4.p(r8)
            r1 = 1
            goto L2f0
        L2e9:
            r1 = 181587609(0xad2ce99, float:2.0299978E-32)
            r4.S(r1)
            goto L2e4
        L2f0:
            r4.p(r1)
            r4.p(r8)
            goto L2fa
        L2f7:
            r4.N()
        L2fa:
            P.o0 r1 = r4.r()
            if (r1 == 0) goto L309
            R4.Z r2 = new R4.Z
            r3 = 8
            r2.<init>(r13, r3, r0, r6)
            r1.f5482d = r2
        L309:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.g.g(R4.k1, java.lang.String, P.o, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void h(C0468k1 c0468k1, C0371o c0371o, int i) throws XmlPullParserException, IOException {
        c0371o.U(1349967903);
        int i7 = (c0371o.i(c0468k1) ? 4 : 2) | i;
        if (c0371o.K(i7 & 1, (i7 & 3) != 2)) {
            Object objH = c0371o.H();
            P.S s6 = C0363k.f5418a;
            if (objH == s6) {
                objH = C0345b.q(new C1056a(c0468k1.f7071c));
                c0371o.d0(objH);
            }
            P.W w3 = (P.W) objH;
            Object objH2 = c0371o.H();
            if (objH2 == s6) {
                objH2 = C0345b.q(((C1056a) w3.getValue()).a());
                c0371o.d0(objH2);
            }
            P.W w6 = (P.W) objH2;
            Object objH3 = c0371o.H();
            if (objH3 == s6) {
                objH3 = new a0.q();
                c0371o.d0(objH3);
            }
            a0.q qVar = (a0.q) objH3;
            Object objH4 = c0371o.H();
            if (objH4 == s6) {
                C0348c0 c0348c0 = new C0348c0(((C1056a) w3.getValue()).a().getCount());
                c0371o.d0(c0348c0);
                objH4 = c0348c0;
            }
            C0348c0 c0348c02 = (C0348c0) objH4;
            Boolean bool = Boolean.TRUE;
            Object objH5 = c0371o.H();
            if (objH5 == s6) {
                objH5 = new e5.g(c0348c02, w3, w6, null);
                c0371o.d0(objH5);
            }
            C0345b.e((B5.e) objH5, c0371o, bool);
            Cursor cursor = (Cursor) w6.getValue();
            Object objH6 = c0371o.H();
            if (objH6 == s6) {
                objH6 = new e5.h(qVar, w6, null);
                c0371o.d0(objH6);
            }
            C0345b.e((B5.e) objH6, c0371o, cursor);
            if (qVar.size() > 0) {
                c0371o.S(239080468);
                FillElement fillElement = androidx.compose.foundation.layout.c.f9277a;
                boolean zI = c0371o.i(c0468k1);
                Object objH7 = c0371o.H();
                if (zI || objH7 == s6) {
                    W1.e eVar = new W1.e(qVar, c0468k1, w3, w6, 4);
                    c0371o.d0(eVar);
                    objH7 = eVar;
                }
                AbstractC1397A.d(fillElement, null, null, null, null, null, false, null, (B5.c) objH7, c0371o, 6);
                c0371o.p(false);
            } else {
                c0371o.S(-1178162136);
                D5.a.h(c0371o, androidx.compose.foundation.layout.c.a(C0722j.f10095q, 20));
                i(0, c0371o);
                c0371o.p(false);
            }
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new H0(i, 15, c0468k1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void i(int i, C0371o c0371o) throws XmlPullParserException, IOException {
        C0371o c0371o2 = c0371o;
        c0371o2.U(-1870923216);
        if (c0371o2.K(i & 1, i != 0)) {
            InterfaceC0725m interfaceC0725mD = androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.c.f9279c, 0.0f, 0.0f, 0.0f, 100, 7);
            InterfaceC1926C interfaceC1926CD = AbstractC0017n.d(C0714b.f10080u, false);
            int i7 = c0371o2.f5454P;
            InterfaceC0360i0 interfaceC0360i0M = c0371o2.m();
            InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o2, interfaceC0725mD);
            InterfaceC0046k.f452a.getClass();
            D d5 = C0045j.f445b;
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
            if (c0371o2.f5453O || !kotlin.jvm.internal.m.a(c0371o2.H(), Integer.valueOf(i7))) {
                k1.i.o(i7, c0371o2, i7, c0044i3);
            }
            C0044i c0044i4 = C0045j.f446c;
            C0345b.u(c0044i4, c0371o2, interfaceC0725mC);
            InterfaceC0725m interfaceC0725mC2 = androidx.compose.foundation.layout.b.c(androidx.compose.foundation.layout.c.f9277a, 50, 0.0f, 2);
            C0022t c0022tA = A.r.a(AbstractC0012i.f108c, C0714b.f10074C, c0371o2, 48);
            int i8 = c0371o2.f5454P;
            InterfaceC0360i0 interfaceC0360i0M2 = c0371o2.m();
            InterfaceC0725m interfaceC0725mC3 = AbstractC0727o.c(c0371o2, interfaceC0725mC2);
            c0371o2.W();
            if (c0371o2.f5453O) {
                c0371o2.l(d5);
            } else {
                c0371o2.g0();
            }
            C0345b.u(c0044i, c0371o2, c0022tA);
            C0345b.u(c0044i2, c0371o2, interfaceC0360i0M2);
            if (c0371o2.f5453O || !kotlin.jvm.internal.m.a(c0371o2.H(), Integer.valueOf(i8))) {
                k1.i.o(i8, c0371o2, i8, c0044i3);
            }
            C0345b.u(c0044i4, c0371o2, interfaceC0725mC3);
            AbstractC1412b abstractC1412bF = AbstractC0836n2.F(R.drawable.mail_image, c0371o2, 6);
            long jB = AbstractC1145B.b(1711276032);
            C0722j c0722j = C0722j.f10095q;
            AbstractC0235x.a(abstractC1412bF, androidx.compose.foundation.layout.c.c(c0722j, 51), jB, c0371o2, 3504);
            float f = 10;
            N0.b("No Notifications", androidx.compose.foundation.layout.b.d(c0722j, 0.0f, f, 0.0f, 0.0f, 13), j0.o.f13718b, AbstractC0836n2.y(16), O0.j.f4283u, 0L, null, 0L, 0, false, 0, 0, null, c0371o, 200118, 0, 131024);
            N0.b("We’ll let you know when there will be something to update you.", androidx.compose.foundation.layout.b.d(c0722j, 0.0f, f, 0.0f, 0.0f, 13), AbstractC1145B.c(4281743682L), AbstractC0836n2.y(16), null, 0L, new V0.k(3), 0L, 0, false, 0, 0, null, c0371o, 3510, 0, 130544);
            c0371o2 = c0371o;
            c0371o2.p(true);
            c0371o2.p(true);
        } else {
            c0371o2.N();
        }
        C0372o0 c0372o0R = c0371o2.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new C0256q(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void j(C0468k1 c0468k1, C1057b c1057b, B5.a aVar) {
        C1056a c1056a = new C1056a(c0468k1.f7071c);
        AlertDialog.Builder builder = new AlertDialog.Builder(c0468k1.f7071c);
        builder.setTitle("Delete");
        builder.setMessage("Are you sure you want to delete this notification?");
        builder.setPositiveButton("OK", new f3(c1056a, c1057b, aVar, 1));
        builder.setNegativeButton("Cancel", new K(1));
        builder.create().show();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0725m k(InterfaceC0725m interfaceC0725m) {
        return androidx.compose.ui.graphics.a.b(interfaceC0725m, 0.0f, null, true, 126971);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean l(int i, int i7, int i8, byte[] a7, byte[] b7) {
        kotlin.jvm.internal.m.e(a7, "a");
        kotlin.jvm.internal.m.e(b7, "b");
        for (int i9 = 0; i9 < i8; i9++) {
            if (a7[i9 + i] != b7[i9 + i7]) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void m(InterfaceC1159e interfaceC1159e, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            if (obj == null) {
                interfaceC1159e.s(i);
            } else if (obj instanceof byte[]) {
                interfaceC1159e.N(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                interfaceC1159e.p(((Number) obj).floatValue(), i);
            } else if (obj instanceof Double) {
                interfaceC1159e.p(((Number) obj).doubleValue(), i);
            } else if (obj instanceof Long) {
                interfaceC1159e.H(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                interfaceC1159e.H(i, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                interfaceC1159e.H(i, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                interfaceC1159e.H(i, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                interfaceC1159e.m(i, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                interfaceC1159e.H(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void n(int i, String str) {
        if (str.charAt(i) == '-') {
            return;
        }
        StringBuilder sbL = k1.i.l("Expected '-' (hyphen) at index ", ", but was '", i);
        sbL.append(str.charAt(i));
        sbL.append('\'');
        throw new IllegalArgumentException(sbL.toString().toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void o(long j, long j7, long j8) {
        if ((j7 | j8) < 0 || j7 > j || j - j7 < j8) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j7 + " byteCount=" + j8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final double p(int i, int i7, int i8, int i9, E2.g gVar) {
        double d5 = ((double) i8) / ((double) i);
        double d7 = ((double) i9) / ((double) i7);
        int iOrdinal = gVar.ordinal();
        if (iOrdinal == 0) {
            return Math.max(d5, d7);
        }
        if (iOrdinal == 1) {
            return Math.min(d5, d7);
        }
        throw new C2.e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String q(String str) {
        return str.length() == 1 ? "0".concat(str) : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.io.Serializable */
    /* JADX WARN: Multi-variable type inference failed */
    public static long[] r(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void z(long j, byte[] bArr, int i, int i7, int i8) {
        int i9 = 7 - i7;
        int i10 = 8 - i8;
        if (i10 > i9) {
            return;
        }
        while (true) {
            int i11 = J5.c.f2816a[(int) ((j >> (i9 << 3)) & 255)];
            int i12 = i + 1;
            bArr[i] = (byte) (i11 >> 8);
            i += 2;
            bArr[i12] = (byte) i11;
            if (i9 == i10) {
                return;
            } else {
                i9--;
            }
        }
    }

    public abstract void K(String str);

    public abstract Typeface s(Context context, m1.e eVar, Resources resources, int i);

    public abstract Typeface t(Context context, s1.h[] hVarArr, int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Typeface u(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Typeface v(Context context, InputStream inputStream) {
        File fileE = AbstractC0597a.E(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (AbstractC0597a.t(fileE, inputStream)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Typeface w(Context context, Resources resources, int i, String str, int i7) {
        File fileE = AbstractC0597a.E(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (AbstractC0597a.s(fileE, resources, i)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean x(l0 l0Var) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s1.h y(s1.h[] hVarArr, int i) {
        new O3.B(25);
        int i7 = (i & 1) == 0 ? 400 : 700;
        boolean z5 = (i & 2) != 0;
        s1.h hVar = null;
        int i8 = Integer.MAX_VALUE;
        for (s1.h hVar2 : hVarArr) {
            int iAbs = (Math.abs(hVar2.f16441c - i7) * 2) + (hVar2.f16442d == z5 ? 0 : 1);
            if (hVar == null || i8 > iAbs) {
                hVar = hVar2;
                i8 = iAbs;
            }
        }
        return hVar;
    }
}
