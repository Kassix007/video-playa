package B0;

import E1.C0146d;
import O3.C0323t0;
import O3.InterfaceC0277d1;
import O3.T1;
import O3.U1;
import P.InterfaceC0347c;
import P.S0;
import R4.l3;
import a.AbstractC0597a;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkDatabaseVersions;
import com.google.android.gms.internal.measurement.C0773b;
import com.web2native.MainActivity;
import d1.C0953d;
import d2.AbstractC0974V;
import d2.C0999y;
import e1.C1022b;
import g1.C1076f;
import i0.C1129a;
import i1.C1134a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import k1.AbstractC1175c;
import l0.C1219b;
import m.C1275Q;
import m.C1328r;
import r.C1548G;
import w1.AbstractC1835K;
import x3.C1898j;
import x3.C1899k;
import x3.C1901m;
import z3.C1966b;

/* JADX INFO: loaded from: classes.dex */
public final class G0 implements InterfaceC0347c, C2.f, InterfaceC0277d1, O3.Z, Z.h {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static G0 f231u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static G0 f232v;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f233q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f234r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f235s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f236t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [b1.c.<init>():void, p3.J0.E():void] */
    public /* synthetic */ G0(int i, boolean z5) {
        this.f233q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: p3.W */
    /* JADX WARN: Multi-variable type inference failed */
    public static p3.Y A(p3.W w3, String str) {
        p3.Y yA;
        p3.Y y6 = (p3.Y) w3;
        if (str.equals(y6.f15742c)) {
            return y6;
        }
        for (Object obj : w3.f()) {
            if (obj instanceof p3.Y) {
                p3.Y y7 = (p3.Y) obj;
                if (str.equals(y7.f15742c)) {
                    return y7;
                }
                if ((obj instanceof p3.W) && (yA = A((p3.W) obj, str)) != null) {
                    return yA;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean J(D2.j jVar, Bitmap.Config config) {
        if (!AbstractC0597a.H(config)) {
            return true;
        }
        if (!jVar.f1404l) {
            return false;
        }
        F2.b bVar = jVar.f1398c;
        if (!(bVar instanceof F2.a)) {
            return true;
        }
        ImageView imageView = ((F2.a) bVar).f1946r;
        return !imageView.isAttachedToWindow() || imageView.isHardwareAccelerated();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static G0 N(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new G0(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void g(G0 g02, Network network, boolean z5) {
        boolean z6;
        Network[] allNetworks = ((ConnectivityManager) g02.f234r).getAllNetworks();
        int length = allNetworks.length;
        boolean z7 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Network network2 = allNetworks[i];
            if (kotlin.jvm.internal.m.a(network2, network)) {
                z6 = z5;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) g02.f234r).getNetworkCapabilities(network2);
                z6 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z6) {
                z7 = true;
                break;
            }
            i++;
        }
        H2.m mVar = (H2.m) g02.f235s;
        synchronized (mVar) {
            try {
                if (((t2.l) mVar.f2157q.get()) != null) {
                    mVar.f2161u = z7;
                } else {
                    mVar.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean p(Editable editable, KeyEvent keyEvent, boolean z5) {
        E1.B[] bArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (bArr = (E1.B[]) editable.getSpans(selectionStart, selectionEnd, E1.B.class)) != null && bArr.length > 0) {
                for (E1.B b7 : bArr) {
                    int spanStart = editable.getSpanStart(b7);
                    int spanEnd = editable.getSpanEnd(b7);
                    if ((z5 && spanStart == selectionStart) || ((!z5 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static D2.e r(D2.j jVar, Throwable th) {
        if (th instanceof D2.m) {
            jVar.getClass();
            D2.c cVar = jVar.f1395A;
            cVar.getClass();
            D2.c cVar2 = H2.d.f2135a;
            cVar.getClass();
        } else {
            jVar.f1395A.getClass();
            D2.c cVar3 = H2.d.f2135a;
        }
        return new D2.e(null, jVar, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Typeface B(int i, int i7, C1275Q c1275q) {
        int resourceId = ((TypedArray) this.f235s).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f236t) == null) {
            this.f236t = new TypedValue();
        }
        Context context = (Context) this.f234r;
        TypedValue typedValue = (TypedValue) this.f236t;
        ThreadLocal threadLocal = m1.l.f15039a;
        if (context.isRestricted()) {
            return null;
        }
        return m1.l.a(context, resourceId, typedValue, i7, c1275q, true, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int C(int i) {
        O3.T t6 = (O3.T) this.f235s;
        if (i < 0) {
            return -1;
        }
        int childCount = ((C0999y) this.f234r).f12221a.getChildCount();
        int i7 = i;
        while (i7 < childCount) {
            int iC = i - (i7 - t6.c(i7));
            if (iC == 0) {
                while (t6.e(i7)) {
                    i7++;
                }
                return i7;
            }
            i7 += iC;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public G5.d D() {
        Matcher matcher = (Matcher) this.f234r;
        return D5.a.O(matcher.start(), matcher.end());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long E() {
        return ((C1219b) this.f236t).f14424q.f14423d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public View F(int i) {
        return ((C0999y) this.f234r).f12221a.getChildAt(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int G() {
        return ((C0999y) this.f234r).f12221a.getChildCount();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean H(CharSequence charSequence, int i, int i7, E1.A a7) {
        if ((a7.f1617c & 3) == 0) {
            E1.h hVar = (E1.h) this.f236t;
            F1.a aVarB = a7.b();
            int iA = aVarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) aVarB.f1944t).getShort(iA + aVarB.f1941q);
            }
            C0146d c0146d = (C0146d) hVar;
            c0146d.getClass();
            ThreadLocal threadLocal = C0146d.f1626b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i7) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = c0146d.f1627a;
            String string = sb.toString();
            int i8 = n1.c.f15129a;
            boolean zHasGlyph = textPaint.hasGlyph(string);
            int i9 = a7.f1617c & 4;
            a7.f1617c = zHasGlyph ? i9 | 2 : i9 | 1;
        }
        return (a7.f1617c & 3) == 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void I(View view) {
        ((ArrayList) this.f236t).add(view);
        C0999y c0999y = (C0999y) this.f234r;
        AbstractC0974V abstractC0974VI = RecyclerView.I(view);
        if (abstractC0974VI != null) {
            View view2 = abstractC0974VI.f12032a;
            RecyclerView recyclerView = c0999y.f12221a;
            int i = abstractC0974VI.f12045q;
            if (i != -1) {
                abstractC0974VI.f12044p = i;
            } else {
                WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                abstractC0974VI.f12044p = view2.getImportantForAccessibility();
            }
            if (recyclerView.L()) {
                abstractC0974VI.f12045q = 4;
                recyclerView.f9612F0.add(abstractC0974VI);
            } else {
                WeakHashMap weakHashMap2 = AbstractC1835K.f18149a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean K() {
        if (((S0) this.f235s).getValue() != this.f234r) {
            return true;
        }
        G0 g02 = (G0) this.f236t;
        return g02 != null && g02.K();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean L(int i, C0953d c0953d, C1076f c1076f) {
        C1022b c1022b = (C1022b) this.f234r;
        int[] iArr = c0953d.f11878p0;
        int[] iArr2 = c0953d.f11882t;
        c1022b.f12502a = iArr[0];
        c1022b.f12503b = iArr[1];
        c1022b.f12504c = c0953d.q();
        c1022b.f12505d = c0953d.k();
        c1022b.i = false;
        c1022b.j = i;
        boolean z5 = c1022b.f12502a == 3;
        boolean z6 = c1022b.f12503b == 3;
        boolean z7 = z5 && c0953d.f11846W > 0.0f;
        boolean z8 = z6 && c0953d.f11846W > 0.0f;
        if (z7 && iArr2[0] == 4) {
            c1022b.f12502a = 1;
        }
        if (z8 && iArr2[1] == 4) {
            c1022b.f12503b = 1;
        }
        c1076f.b(c0953d, c1022b);
        c0953d.O(c1022b.f12506e);
        c0953d.L(c1022b.f);
        c0953d.f11828E = c1022b.f12508h;
        c0953d.I(c1022b.f12507g);
        c1022b.j = 0;
        return c1022b.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public G0 M() {
        CharSequence charSequence = (CharSequence) this.f235s;
        Matcher matcher = (Matcher) this.f234r;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        kotlin.jvm.internal.m.d(matcher2, "matcher(...)");
        if (matcher2.find(iEnd)) {
            return new G0(matcher2, charSequence);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void O() {
        t0 t0Var = ((L) this.f234r).f251D;
        if (t0Var != null) {
            ((C0.A) t0Var).C();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public D2.n P(D2.j r17, E2.h r18) {
        /*
            r16 = this;
            r0 = r17
            r4 = r18
            java.util.List r1 = r0.f1401g
            android.graphics.Bitmap$Config r2 = r0.f1400e
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L1a
            android.graphics.Bitmap$Config[] r1 = H2.f.f2137a
            boolean r1 = n5.k.z0(r1, r2)
            if (r1 == 0) goto L17
            goto L1a
        L17:
            r1 = r16
            goto L36
        L1a:
            boolean r1 = a.AbstractC0597a.H(r2)
            if (r1 != 0) goto L23
            r1 = r16
            goto L38
        L23:
            boolean r1 = J(r0, r2)
            if (r1 == 0) goto L17
            r1 = r16
            java.lang.Object r3 = r1.f236t
            H2.i r3 = (H2.i) r3
            boolean r3 = r3.c(r4)
            if (r3 == 0) goto L36
            goto L38
        L36:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L38:
            C3.a r3 = r4.f1688a
            E2.b r5 = E2.b.f1677t
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L4f
            C3.a r3 = r4.f1689b
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L4b
            goto L4f
        L4b:
            E2.g r3 = r0.f1416x
        L4d:
            r5 = r3
            goto L52
        L4f:
            E2.g r3 = E2.g.f1685r
            goto L4d
        L52:
            boolean r3 = r0.f1405m
            if (r3 == 0) goto L65
            java.util.List r3 = r0.f1401g
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L65
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ALPHA_8
            if (r2 == r3) goto L65
            r3 = 1
        L63:
            r7 = r3
            goto L67
        L65:
            r3 = 0
            goto L63
        L67:
            D2.n r3 = new D2.n
            android.content.Context r1 = r0.f1396a
            boolean r6 = H2.d.a(r0)
            boolean r8 = r0.f1406n
            d6.l r10 = r0.i
            D2.s r11 = r0.j
            D2.p r12 = r0.f1417y
            D2.b r13 = r0.f1407o
            D2.b r14 = r0.f1408p
            D2.b r15 = r0.f1409q
            r0 = r3
            r3 = 0
            r9 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.G0.P(D2.j, E2.h):D2.n");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object Q(CharSequence charSequence, int i, int i7, int i8, boolean z5, E1.s sVar) {
        int i9;
        char c7;
        E1.u uVar = new E1.u((E1.x) ((E.c0) this.f235s).f1554s);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i10 = 0;
        boolean zD = true;
        int iCharCount = i;
        loop0: while (true) {
            i9 = iCharCount;
            while (iCharCount < i7 && i10 < i8 && zD) {
                SparseArray sparseArray = ((E1.x) uVar.f1661e).f1670a;
                E1.x xVar = sparseArray == null ? null : (E1.x) sparseArray.get(iCodePointAt);
                if (uVar.f1657a == 2) {
                    if (xVar != null) {
                        uVar.f1661e = xVar;
                        uVar.f1659c++;
                    } else {
                        if (iCodePointAt == 65038) {
                            uVar.b();
                        } else if (iCodePointAt != 65039) {
                            E1.x xVar2 = (E1.x) uVar.f1661e;
                            if (xVar2.f1671b != null) {
                                if (uVar.f1659c != 1) {
                                    uVar.f = xVar2;
                                    uVar.b();
                                } else if (uVar.c()) {
                                    uVar.f = (E1.x) uVar.f1661e;
                                    uVar.b();
                                } else {
                                    uVar.b();
                                }
                                c7 = 3;
                            } else {
                                uVar.b();
                            }
                        }
                        c7 = 1;
                    }
                    c7 = 2;
                } else if (xVar == null) {
                    uVar.b();
                    c7 = 1;
                } else {
                    uVar.f1657a = 2;
                    uVar.f1661e = xVar;
                    uVar.f1659c = 1;
                    c7 = 2;
                }
                uVar.f1658b = iCodePointAt;
                if (c7 == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i9)) + i9;
                    if (iCharCount < i7) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c7 == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i7) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c7 == 3) {
                    if (z5 || !H(charSequence, i9, iCharCount, ((E1.x) uVar.f).f1671b)) {
                        zD = sVar.d(charSequence, i9, iCharCount, ((E1.x) uVar.f).f1671b);
                        i10++;
                    }
                }
            }
            break loop0;
        }
        if (uVar.f1657a == 2 && ((E1.x) uVar.f1661e).f1671b != null && ((uVar.f1659c > 1 || uVar.c()) && i10 < i8 && zD && (z5 || !H(charSequence, i9, iCharCount, ((E1.x) uVar.f1661e).f1671b)))) {
            sVar.d(charSequence, i9, iCharCount, ((E1.x) uVar.f1661e).f1671b);
        }
        return sVar.getResult();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void R() {
        ((TypedArray) this.f235s).recycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p3.Y S(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        String strReplace = str.replace("\\\n", "").replace("\\A", "\n");
        if (strReplace.length() <= 1 || !strReplace.startsWith("#")) {
            return null;
        }
        String strSubstring = strReplace.substring(1);
        HashMap map = (HashMap) this.f236t;
        if (strSubstring == null || strSubstring.length() == 0) {
            return null;
        }
        if (strSubstring.equals(((p3.T) this.f234r).f15742c)) {
            return (p3.T) this.f234r;
        }
        if (map.containsKey(strSubstring)) {
            return (p3.Y) map.get(strSubstring);
        }
        p3.Y yA = A((p3.T) this.f234r, strSubstring);
        map.put(strSubstring, yA);
        return yA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void T(Object obj) {
        long jB = X.k.b();
        if (jB == X.m.f8160a) {
            this.f235s = obj;
            return;
        }
        synchronized (this.f234r) {
            X.l lVar = (X.l) ((AtomicReference) this.f236t).get();
            int iA = lVar.a(jB);
            if (iA < 0) {
                ((AtomicReference) this.f236t).set(lVar.b(jB, obj));
            } else {
                lVar.f8159c[iA] = obj;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void U(j0.m mVar) {
        ((C1219b) this.f236t).f14424q.f14422c = mVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void V(W0.c cVar) {
        ((C1219b) this.f236t).f14424q.f14420a = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void W(W0.l lVar) {
        ((C1219b) this.f236t).f14424q.f14421b = lVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void X(long j) {
        ((C1219b) this.f236t).f14424q.f14423d = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void Y(d1.e eVar, int i, int i7, int i8) {
        eVar.getClass();
        int i9 = eVar.f11853b0;
        int i10 = eVar.f11855c0;
        eVar.f11853b0 = 0;
        eVar.f11855c0 = 0;
        eVar.O(i7);
        eVar.L(i8);
        if (i9 < 0) {
            eVar.f11853b0 = 0;
        } else {
            eVar.f11853b0 = i9;
        }
        if (i10 < 0) {
            eVar.f11855c0 = 0;
        } else {
            eVar.f11855c0 = i10;
        }
        d1.e eVar2 = (d1.e) this.f235s;
        eVar2.f11903t0 = i;
        eVar2.U();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void Z(View view) {
        if (((ArrayList) this.f236t).remove(view)) {
            C0999y c0999y = (C0999y) this.f234r;
            AbstractC0974V abstractC0974VI = RecyclerView.I(view);
            if (abstractC0974VI != null) {
                RecyclerView recyclerView = c0999y.f12221a;
                int i = abstractC0974VI.f12044p;
                if (recyclerView.L()) {
                    abstractC0974VI.f12045q = i;
                    recyclerView.f9612F0.add(abstractC0974VI);
                } else {
                    View view2 = abstractC0974VI.f12032a;
                    WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                    view2.setImportantForAccessibility(i);
                }
                abstractC0974VI.f12044p = 0;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C2.f
    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f234r;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a0() {
        C1548G c1548g = (C1548G) this.f234r;
        String str = (String) this.f235s;
        List list = (List) c1548g.j(str);
        if (list != null) {
            list.remove((kotlin.jvm.internal.n) this.f236t);
        }
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        c1548g.l(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    @Override // O3.InterfaceC0277d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(int r9, java.lang.Throwable r10, byte[] r11) {
        /*
            r8 = this;
            java.lang.Object r11 = r8.f234r
            O3.b1 r11 = (O3.C0271b1) r11
            r11.o()
            java.lang.Object r0 = r8.f236t
            O3.L1 r0 = (O3.L1) r0
            r1 = 200(0xc8, float:2.8E-43)
            if (r9 == r1) goto L18
            r1 = 204(0xcc, float:2.86E-43)
            if (r9 == r1) goto L18
            r1 = 304(0x130, float:4.26E-43)
            if (r9 != r1) goto L33
            r9 = r1
        L18:
            if (r10 != 0) goto L33
            java.lang.Object r9 = r11.f4346r
            O3.t0 r9 = (O3.C0323t0) r9
            O3.X r9 = r9.f5077v
            O3.C0323t0.l(r9)
            O3.V r9 = r9.f4666E
            long r1 = r0.f4511q
            java.lang.Long r10 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "[sgtm] Upload succeeded for row_id"
            r9.c(r10, r1)
            O3.h1 r9 = O3.EnumC0289h1.SUCCESS
            goto L6f
        L33:
            java.lang.Object r1 = r11.f4346r
            O3.t0 r1 = (O3.C0323t0) r1
            O3.X r1 = r1.f5077v
            O3.C0323t0.l(r1)
            O3.V r1 = r1.f4673z
            long r2 = r0.f4511q
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            java.lang.String r4 = "[sgtm] Upload failed for row_id. response, exception"
            r1.e(r4, r2, r3, r10)
            O3.E r10 = O3.F.f4459u
            r1 = 0
            java.lang.Object r10 = r10.a(r1)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r1 = ","
            java.lang.String[] r10 = r10.split(r1)
            java.util.List r10 = java.util.Arrays.asList(r10)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            boolean r9 = r10.contains(r9)
            if (r9 == 0) goto L6d
            O3.h1 r9 = O3.EnumC0289h1.BACKOFF
            goto L6f
        L6d:
            O3.h1 r9 = O3.EnumC0289h1.FAILURE
        L6f:
            java.lang.Object r10 = r8.f235s
            java.util.concurrent.atomic.AtomicReference r10 = (java.util.concurrent.atomic.AtomicReference) r10
            java.lang.Object r1 = r11.f4346r
            O3.t0 r1 = (O3.C0323t0) r1
            O3.w1 r1 = r1.o()
            O3.d r2 = new O3.d
            long r4 = r0.f4511q
            int r3 = r9.f4905q
            long r6 = r0.f4516v
            r2.<init>(r3, r4, r6)
            r1.o()
            r1.p()
            r0 = 1
            O3.a2 r0 = r1.E(r0)
            O3.x0 r3 = new O3.x0
            r6 = 7
            r3.<init>(r1, r0, r2, r6)
            r1.C(r3)
            java.lang.Object r11 = r11.f4346r
            O3.t0 r11 = (O3.C0323t0) r11
            O3.X r11 = r11.f5077v
            O3.C0323t0.l(r11)
            O3.V r11 = r11.f4666E
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            java.lang.String r1 = "[sgtm] Updated status for row_id"
            r11.d(r0, r9, r1)
            monitor-enter(r10)
            r10.set(r9)     // Catch: java.lang.Throwable -> Lb7
            r10.notifyAll()     // Catch: java.lang.Throwable -> Lb7
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb7
            return
        Lb7:
            r0 = move-exception
            r9 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb7
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.G0.b(int, java.lang.Throwable, byte[]):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b0(d1.e eVar) {
        ArrayList arrayList = (ArrayList) this.f236t;
        arrayList.clear();
        int size = eVar.f11900q0.size();
        for (int i = 0; i < size; i++) {
            C0953d c0953d = (C0953d) eVar.f11900q0.get(i);
            int[] iArr = c0953d.f11878p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c0953d);
            }
        }
        eVar.f11902s0.f12512b = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.InterfaceC0347c
    public void c(int i, Object obj) {
        ((L) this.f235s).z(i, (L) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public D2.n c0(D2.n r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            android.graphics.Bitmap$Config r2 = r0.f1422b
            D2.b r3 = r0.f1432o
            boolean r4 = a.AbstractC0597a.H(r2)
            r5 = 1
            if (r4 == 0) goto L1f
            java.lang.Object r4 = r1.f236t
            H2.i r4 = (H2.i) r4
            boolean r4 = r4.a()
            if (r4 == 0) goto L1a
            goto L1f
        L1a:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            r4 = r5
        L1d:
            r8 = r2
            goto L21
        L1f:
            r4 = 0
            goto L1d
        L21:
            D2.b r2 = r0.f1432o
            boolean r2 = r2.f1363q
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r1.f235s
            H2.m r2 = (H2.m) r2
            monitor-enter(r2)
            r2.a()     // Catch: java.lang.Throwable -> L39
            boolean r6 = r2.f2161u     // Catch: java.lang.Throwable -> L39
            monitor-exit(r2)
            if (r6 != 0) goto L3c
            D2.b r3 = D2.b.DISABLED
        L36:
            r21 = r3
            goto L3e
        L39:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L39
            throw r0
        L3c:
            r5 = r4
            goto L36
        L3e:
            if (r5 == 0) goto L6a
            android.content.Context r7 = r0.f1421a
            android.graphics.ColorSpace r9 = r0.f1423c
            E2.h r10 = r0.f1424d
            E2.g r11 = r0.f1425e
            boolean r12 = r0.f
            boolean r13 = r0.f1426g
            boolean r14 = r0.f1427h
            java.lang.String r15 = r0.i
            d6.l r2 = r0.j
            D2.s r3 = r0.f1428k
            D2.p r4 = r0.f1429l
            D2.b r5 = r0.f1430m
            D2.b r0 = r0.f1431n
            D2.n r6 = new D2.n
            r20 = r0
            r16 = r2
            r17 = r3
            r18 = r4
            r19 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r6
        L6a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.G0.c0(D2.n):D2.n");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.f233q) {
            case 20:
                G0 g02 = new G0(((C0773b) this.f234r).clone());
                ArrayList arrayList = (ArrayList) this.f236t;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((ArrayList) g02.f236t).add(((C0773b) obj).clone());
                }
                return g02;
            default:
                return super.clone();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.InterfaceC0347c
    public void d(Object obj) {
        ((ArrayList) this.f236t).add(this.f235s);
        this.f235s = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized void d0(int i, int i7, long j, long j7) {
        ((C0323t0) this.f234r).f5052A.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.f236t;
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        S3.k kVarB = ((C1966b) this.f235s).b(new C1901m(0, Arrays.asList(new C1898j(36301, i, 0, j, j7, null, null, 0, i7))));
        O3.T t6 = new O3.T(0, jElapsedRealtime, this);
        kVarB.getClass();
        kVarB.f7317b.e(new S3.h(S3.f.f7307a, t6));
        kVarB.i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:31:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:31:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
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
    @Override // O3.Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(java.lang.String r8, int r9, java.lang.Throwable r10, byte[] r11, java.util.Map r12) {
        /*
            r7 = this;
            int r8 = r7.f233q
            switch(r8) {
                case 10: goto Lad;
                default: goto L5;
            }
        L5:
            java.lang.Object r8 = r7.f235s
            O3.U1 r8 = (O3.U1) r8
            long r0 = r8.f4632a
            java.lang.Object r8 = r7.f236t
            O3.T1 r8 = (O3.T1) r8
            java.lang.Object r12 = r7.f234r
            java.lang.String r12 = (java.lang.String) r12
            O3.p0 r2 = r8.c()
            r2.o()
            r8.k0()
            r2 = 0
            if (r11 != 0) goto L27
            byte[] r11 = new byte[r2]     // Catch: java.lang.Throwable -> L23
            goto L27
        L23:
            r0 = move-exception
            r9 = r0
            goto La7
        L27:
            r3 = 200(0xc8, float:2.8E-43)
            if (r9 == r3) goto L30
            r3 = 204(0xcc, float:2.86E-43)
            if (r9 != r3) goto L6b
            r9 = r3
        L30:
            if (r10 != 0) goto L6b
            O3.n r10 = r8.f4609s     // Catch: java.lang.Throwable -> L23
            O3.T1.S(r10)     // Catch: java.lang.Throwable -> L23
            java.lang.Long r11 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L23
            r10.v(r11)     // Catch: java.lang.Throwable -> L23
            O3.X r10 = r8.b()     // Catch: java.lang.Throwable -> L23
            O3.V r10 = r10.f4666E     // Catch: java.lang.Throwable -> L23
            java.lang.String r11 = "Successfully uploaded batch from upload queue. appId, status"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L23
            r10.d(r12, r9, r11)     // Catch: java.lang.Throwable -> L23
            O3.b0 r9 = r8.f4608r     // Catch: java.lang.Throwable -> L23
            O3.T1.S(r9)     // Catch: java.lang.Throwable -> L23
            boolean r9 = r9.I()     // Catch: java.lang.Throwable -> L23
            if (r9 == 0) goto L67
            O3.n r9 = r8.f4609s     // Catch: java.lang.Throwable -> L23
            O3.T1.S(r9)     // Catch: java.lang.Throwable -> L23
            boolean r9 = r9.u(r12)     // Catch: java.lang.Throwable -> L23
            if (r9 == 0) goto L67
            r8.t(r12)     // Catch: java.lang.Throwable -> L23
            goto La1
        L67:
            r8.L()     // Catch: java.lang.Throwable -> L23
            goto La1
        L6b:
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L23
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L23
            r3.<init>(r11, r4)     // Catch: java.lang.Throwable -> L23
            int r11 = r3.length()     // Catch: java.lang.Throwable -> L23
            r4 = 32
            int r11 = java.lang.Math.min(r4, r11)     // Catch: java.lang.Throwable -> L23
            java.lang.String r11 = r3.substring(r2, r11)     // Catch: java.lang.Throwable -> L23
            O3.X r3 = r8.b()     // Catch: java.lang.Throwable -> L23
            O3.V r3 = r3.f4663B     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = "Network upload failed. Will retry later. appId, status, error"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L23
            if (r10 != 0) goto L8f
            r10 = r11
        L8f:
            r3.e(r4, r12, r9, r10)     // Catch: java.lang.Throwable -> L23
            O3.n r9 = r8.f4609s     // Catch: java.lang.Throwable -> L23
            O3.T1.S(r9)     // Catch: java.lang.Throwable -> L23
            java.lang.Long r10 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L23
            r9.A(r10)     // Catch: java.lang.Throwable -> L23
            r8.L()     // Catch: java.lang.Throwable -> L23
        La1:
            r8.f4591K = r2
            r8.M()
            return
        La7:
            r8.f4591K = r2
            r8.M()
            throw r9
        Lad:
            java.lang.Object r8 = r7.f235s
            r0 = r8
            O3.T1 r0 = (O3.T1) r0
            java.lang.Object r8 = r7.f234r
            r5 = r8
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r8 = r7.f236t
            r6 = r8
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r1 = 1
            r2 = r9
            r3 = r10
            r4 = r11
            r0.x(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.G0.e(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.InterfaceC0347c
    public void f() {
        ((L) this.f235s).e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.InterfaceC0347c
    public /* bridge */ /* synthetic */ void h(int i, Object obj) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.InterfaceC0347c
    public void i(int i, int i7, int i8) {
        ((L) this.f235s).J(i, i7, i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.InterfaceC0347c
    public Object j() {
        return this.f235s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.InterfaceC0347c
    public void k(int i, int i7) {
        ((L) this.f235s).N(i, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void l(View view, int i, boolean z5) {
        RecyclerView recyclerView = ((C0999y) this.f234r).f12221a;
        int childCount = i < 0 ? recyclerView.getChildCount() : C(i);
        ((O3.T) this.f235s).f(childCount, z5);
        if (z5) {
            I(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.I(view);
    }

    /* JADX DEBUG: Class process forced to load method for inline: androidx.recyclerview.widget.RecyclerView.b(androidx.recyclerview.widget.RecyclerView, android.view.View, int, android.view.ViewGroup$LayoutParams):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void m(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z5) {
        RecyclerView recyclerView = ((C0999y) this.f234r).f12221a;
        int childCount = i < 0 ? recyclerView.getChildCount() : C(i);
        ((O3.T) this.f235s).f(childCount, z5);
        if (z5) {
            I(view);
        }
        AbstractC0974V abstractC0974VI = RecyclerView.I(view);
        if (abstractC0974VI != null) {
            if (!abstractC0974VI.j() && !abstractC0974VI.o()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + abstractC0974VI + recyclerView.y());
            }
            abstractC0974VI.j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void n() {
        ((ArrayList) this.f236t).clear();
        this.f235s = this.f234r;
        ((L) this.f234r).M();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.InterfaceC0347c
    public void o() {
        this.f235s = ((ArrayList) this.f236t).remove(r0.size() - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void q(int i) {
        AbstractC0974V abstractC0974VI;
        int iC = C(i);
        ((O3.T) this.f235s).i(iC);
        RecyclerView recyclerView = ((C0999y) this.f234r).f12221a;
        View childAt = recyclerView.getChildAt(iC);
        if (childAt != null && (abstractC0974VI = RecyclerView.I(childAt)) != null) {
            if (abstractC0974VI.j() && !abstractC0974VI.o()) {
                throw new IllegalArgumentException("called detach on an already detached child " + abstractC0974VI + recyclerView.y());
            }
            abstractC0974VI.a(256);
        }
        recyclerView.detachViewFromParent(iC);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object s() {
        long jB = X.k.b();
        if (jB == X.m.f8160a) {
            return this.f235s;
        }
        X.l lVar = (X.l) ((AtomicReference) this.f236t).get();
        int iA = lVar.a(jB);
        if (iA >= 0) {
            return lVar.f8159c[iA];
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C2.f
    public void shutdown() {
        ((ConnectivityManager) this.f234r).unregisterNetworkCallback((C2.g) this.f236t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j0.m t() {
        return ((C1219b) this.f236t).f14424q.f14422c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f233q) {
            case 5:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f234r);
                sb.append('{');
                C0050o c0050o = (C0050o) ((C0050o) this.f235s).f500r;
                String str = "";
                while (c0050o != null) {
                    Object obj = c0050o.f499q;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    c0050o = (C0050o) c0050o.f500r;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case WorkDatabaseVersions.VERSION_16 /* 16 */:
                String str2 = (String) this.f236t;
                String str3 = (String) this.f235s;
                StringBuilder sb2 = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f234r;
                if (uri != null) {
                    sb2.append(" uri=");
                    sb2.append(String.valueOf(uri));
                }
                if (str3 != null) {
                    sb2.append(" action=");
                    sb2.append(str3);
                }
                if (str2 != null) {
                    sb2.append(" mimetype=");
                    sb2.append(str2);
                }
                sb2.append(" }");
                String string = sb2.toString();
                kotlin.jvm.internal.m.d(string, "toString(...)");
                return string;
            case WorkDatabaseVersions.VERSION_21 /* 21 */:
                return ((O3.T) this.f235s).toString() + ", hidden list:" + ((ArrayList) this.f236t).size();
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public View u(int i) {
        return ((C0999y) this.f234r).f12221a.getChildAt(C(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int v() {
        return ((C0999y) this.f234r).f12221a.getChildCount() - ((ArrayList) this.f236t).size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList w(int i) {
        int resourceId;
        ColorStateList colorStateListB;
        TypedArray typedArray = (TypedArray) this.f235s;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListB = AbstractC1175c.b((Context) this.f234r, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1129a x() {
        int i;
        float fC;
        int i7;
        p3.T t6 = (p3.T) this.f234r;
        p3.C c7 = t6.f15736r;
        p3.C c8 = t6.f15737s;
        if (c7 == null || c7.g() || (i = c7.f15633r) == 9 || i == 2 || i == 3) {
            return new C1129a(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fC2 = c7.c();
        if (c8 == null) {
            C1129a c1129a = ((p3.T) this.f234r).f15764o;
            fC = c1129a != null ? (c1129a.f13519e * fC2) / c1129a.f13518d : fC2;
        } else {
            if (c8.g() || (i7 = c8.f15633r) == 9 || i7 == 2 || i7 == 3) {
                return new C1129a(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fC = c8.c();
        }
        return new C1129a(0.0f, 0.0f, fC2, fC);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Drawable y(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f235s;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : AbstractC0597a.C((Context) this.f234r, resourceId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Drawable z(int i) {
        int resourceId;
        Drawable drawableD;
        if (!((TypedArray) this.f235s).hasValue(i) || (resourceId = ((TypedArray) this.f235s).getResourceId(i, 0)) == 0) {
            return null;
        }
        C1328r c1328rA = C1328r.a();
        Context context = (Context) this.f234r;
        synchronized (c1328rA) {
            drawableD = c1328rA.f14863a.d(context, resourceId, true);
        }
        return drawableD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ G0(Object obj, Object obj2, Object obj3, int i) {
        this.f233q = i;
        this.f234r = obj;
        this.f235s = obj2;
        this.f236t = obj3;
    }

    public G0(T1 t12, String str, U1 u12) {
        this.f233q = 11;
        this.f234r = str;
        this.f235s = u12;
        this.f236t = t12;
    }

    public G0(T1 t12, String str, ArrayList arrayList) {
        this.f233q = 10;
        this.f234r = str;
        this.f236t = arrayList;
        this.f235s = t12;
    }

    public G0(Context context, C0323t0 c0323t0) {
        this.f233q = 8;
        this.f236t = new AtomicLong(-1L);
        this.f235s = new C1966b(context, C1966b.f18743k, new x3.n("measurement:api"), u3.c.f17193c);
        this.f234r = c0323t0;
    }

    public G0(C0773b c0773b) {
        this.f233q = 20;
        this.f234r = c0773b;
        this.f235s = c0773b.clone();
        this.f236t = new ArrayList();
    }

    public G0(Context context, l3 webToNativeInterface) {
        this.f233q = 13;
        kotlin.jvm.internal.m.e(webToNativeInterface, "webToNativeInterface");
        this.f234r = context;
        this.f235s = webToNativeInterface;
        Object systemService = context.getSystemService("clipboard");
        kotlin.jvm.internal.m.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f236t = (ClipboardManager) systemService;
    }

    public G0(List list) {
        this.f233q = 22;
        this.f235s = list;
        this.f236t = new ArrayList(list.size());
        this.f234r = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ((ArrayList) this.f236t).add(new d3.n((List) ((i3.g) list.get(i)).f13588b.f4346r));
            ((ArrayList) this.f234r).add(((i3.g) list.get(i)).f13589c.f());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public G0(t2.l lVar, H2.m mVar) {
        Object kVar;
        this.f233q = 2;
        this.f234r = lVar;
        this.f235s = mVar;
        int i = Build.VERSION.SDK_INT;
        int i7 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i < 26) {
            boolean z5 = H2.a.f2128a;
        } else {
            if (!H2.a.f2128a) {
                if (i != 26 && i != 27) {
                    kVar = new H2.k(i7, true);
                } else {
                    kVar = new H2.l();
                }
            }
            this.f236t = kVar;
        }
        kVar = new H2.k(objArr2 == true ? 1 : 0, objArr == true ? 1 : 0);
        this.f236t = kVar;
    }

    public G0(MainActivity mainActivity, MainActivity mainActivity2, String str, SharedPreferences sharedPreferences) {
        this.f233q = 27;
        this.f234r = mainActivity;
        this.f235s = mainActivity2;
        this.f236t = sharedPreferences;
    }

    public G0(int i) {
        this.f233q = i;
        switch (i) {
            case 15:
                this.f234r = new WeakHashMap();
                this.f235s = new WeakHashMap();
                this.f236t = new WeakHashMap();
                break;
            case WorkDatabaseVersions.VERSION_17 /* 17 */:
                this.f236t = new AtomicReference(X.k.f8156a);
                this.f234r = new Object();
                break;
            case 20:
                this.f234r = new C0773b("", 0L, null);
                this.f235s = new C0773b("", 0L, null);
                this.f236t = new ArrayList();
                break;
            default:
                this.f236t = new O3.D(10);
                break;
        }
    }

    public G0(C0999y c0999y) {
        this.f233q = 21;
        this.f234r = c0999y;
        this.f235s = new O3.T();
        this.f236t = new ArrayList();
    }

    public G0(C1219b c1219b) {
        this.f233q = 26;
        this.f236t = c1219b;
        this.f234r = new C1134a(2, this);
    }

    public G0(Context context, TypedArray typedArray) {
        this.f233q = 28;
        this.f234r = context;
        this.f235s = typedArray;
    }

    public G0(Context context, LocationManager locationManager) {
        this.f233q = 24;
        this.f236t = new h.F();
        this.f234r = context;
        this.f235s = locationManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public G0(k1.h r29) {
        /*
            r28 = this;
            r1 = r28
            r2 = r29
            r0 = 25
            r1.f233q = r0
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.f236t = r0
            r1.f235s = r2
            android.content.Context r0 = r2.f14069a
            java.util.ArrayList r3 = r2.f14081p
            java.util.ArrayList r4 = r2.f14071c
            java.util.ArrayList r5 = r2.f14072d
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            if (r6 < r7) goto L30
            java.lang.String r6 = r2.f14078m
            android.app.Notification$Builder r0 = k1.j.a(r0, r6)
            r1.f234r = r0
            goto L39
        L30:
            android.app.Notification$Builder r0 = new android.app.Notification$Builder
            android.content.Context r6 = r2.f14069a
            r0.<init>(r6)
            r1.f234r = r0
        L39:
            android.app.Notification r6 = r2.f14080o
            java.lang.Object r0 = r1.f234r
            android.app.Notification$Builder r0 = (android.app.Notification.Builder) r0
            long r8 = r6.when
            android.app.Notification$Builder r0 = r0.setWhen(r8)
            int r8 = r6.icon
            int r9 = r6.iconLevel
            android.app.Notification$Builder r0 = r0.setSmallIcon(r8, r9)
            android.widget.RemoteViews r8 = r6.contentView
            android.app.Notification$Builder r0 = r0.setContent(r8)
            java.lang.CharSequence r8 = r6.tickerText
            r9 = 0
            android.app.Notification$Builder r0 = r0.setTicker(r8, r9)
            long[] r8 = r6.vibrate
            android.app.Notification$Builder r0 = r0.setVibrate(r8)
            int r8 = r6.ledARGB
            int r10 = r6.ledOnMS
            int r11 = r6.ledOffMS
            android.app.Notification$Builder r0 = r0.setLights(r8, r10, r11)
            int r8 = r6.flags
            r10 = 2
            r8 = r8 & r10
            r11 = 1
            r12 = 0
            if (r8 == 0) goto L74
            r8 = r11
            goto L75
        L74:
            r8 = r12
        L75:
            android.app.Notification$Builder r0 = r0.setOngoing(r8)
            int r8 = r6.flags
            r8 = r8 & 8
            if (r8 == 0) goto L81
            r8 = r11
            goto L82
        L81:
            r8 = r12
        L82:
            android.app.Notification$Builder r0 = r0.setOnlyAlertOnce(r8)
            int r8 = r6.flags
            r8 = r8 & 16
            if (r8 == 0) goto L8e
            r8 = r11
            goto L8f
        L8e:
            r8 = r12
        L8f:
            android.app.Notification$Builder r0 = r0.setAutoCancel(r8)
            int r8 = r6.defaults
            android.app.Notification$Builder r0 = r0.setDefaults(r8)
            java.lang.CharSequence r8 = r2.f14073e
            android.app.Notification$Builder r0 = r0.setContentTitle(r8)
            java.lang.CharSequence r8 = r2.f
            android.app.Notification$Builder r0 = r0.setContentText(r8)
            android.app.Notification$Builder r0 = r0.setContentInfo(r9)
            android.app.PendingIntent r8 = r2.f14074g
            android.app.Notification$Builder r0 = r0.setContentIntent(r8)
            android.app.PendingIntent r8 = r6.deleteIntent
            android.app.Notification$Builder r0 = r0.setDeleteIntent(r8)
            int r8 = r6.flags
            r8 = r8 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto Lbc
            goto Lbd
        Lbc:
            r11 = r12
        Lbd:
            android.app.Notification$Builder r0 = r0.setFullScreenIntent(r9, r11)
            android.app.Notification$Builder r0 = r0.setNumber(r12)
            r0.setProgress(r12, r12, r12)
            java.lang.Object r0 = r1.f234r
            android.app.Notification$Builder r0 = (android.app.Notification.Builder) r0
            r0.setLargeIcon(r9)
            java.lang.Object r0 = r1.f234r
            android.app.Notification$Builder r0 = (android.app.Notification.Builder) r0
            android.app.Notification$Builder r0 = r0.setSubText(r9)
            android.app.Notification$Builder r0 = r0.setUsesChronometer(r12)
            int r8 = r2.f14075h
            r0.setPriority(r8)
            java.util.ArrayList r8 = r2.f14070b
            int r11 = r8.size()
            r0 = r12
        Le7:
            java.lang.String r14 = "android.support.allowGeneratedReplies"
            if (r0 >= r11) goto L330
            java.lang.Object r16 = r8.get(r0)
            int r17 = r0 + 1
            r13 = r16
            k1.g r13 = (k1.g) r13
            r16 = r12
            int r12 = android.os.Build.VERSION.SDK_INT
            androidx.core.graphics.drawable.IconCompat r0 = r13.f14064b
            if (r0 != 0) goto L107
            int r0 = r13.f14067e
            if (r0 == 0) goto L107
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.a(r0)
            r13.f14064b = r0
        L107:
            androidx.core.graphics.drawable.IconCompat r10 = r13.f14064b
            boolean r9 = r13.f14065c
            android.os.Bundle r15 = r13.f14063a
            if (r10 == 0) goto L2c0
            java.lang.String r7 = "IconCompat"
            int r0 = r10.f9433a
            switch(r0) {
                case -1: goto L2ae;
                case 0: goto L116;
                case 1: goto L288;
                case 2: goto L20e;
                case 3: goto L1f4;
                case 4: goto L1de;
                case 5: goto L151;
                case 6: goto L11e;
                default: goto L116;
            }
        L116:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Unknown type"
            r0.<init>(r2)
            throw r0
        L11e:
            r0 = 30
            if (r12 < r0) goto L139
            android.net.Uri r0 = r10.c()
            android.graphics.drawable.Icon r0 = E0.e.a(r0)
        L12a:
            r24 = r3
            r18 = r4
            r22 = r5
            r27 = r6
            r19 = r8
            r21 = r11
        L136:
            r4 = 2
            goto L29d
        L139:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Context is required to resolve the file uri of the icon: "
            r2.<init>(r3)
            android.net.Uri r3 = r10.c()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L151:
            r7 = 26
            if (r12 < r7) goto L15e
            java.lang.Object r0 = r10.f9434b
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            android.graphics.drawable.Icon r0 = E0.d.a(r0)
            goto L12a
        L15e:
            java.lang.Object r0 = r10.f9434b
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            int r7 = r0.getWidth()
            r18 = r4
            int r4 = r0.getHeight()
            int r4 = java.lang.Math.min(r7, r4)
            float r4 = (float) r4
            r7 = 1059760811(0x3f2aaaab, float:0.6666667)
            float r4 = r4 * r7
            int r4 = (int) r4
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r4, r4, r7)
            r19 = r8
            android.graphics.Canvas r8 = new android.graphics.Canvas
            r8.<init>(r7)
            r20 = r7
            android.graphics.Paint r7 = new android.graphics.Paint
            r21 = r11
            r11 = 3
            r7.<init>(r11)
            float r11 = (float) r4
            r22 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 * r22
            r22 = 1063955115(0x3f6aaaab, float:0.9166667)
            r23 = r4
            float r4 = r11 * r22
            r22 = r5
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r7.setColor(r5)
            android.graphics.BitmapShader r5 = new android.graphics.BitmapShader
            r24 = r3
            android.graphics.Shader$TileMode r3 = android.graphics.Shader.TileMode.CLAMP
            r5.<init>(r0, r3, r3)
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            int r25 = r0.getWidth()
            r26 = r0
            int r0 = r25 - r23
            int r0 = -r0
            float r0 = (float) r0
            r25 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r25
            int r26 = r26.getHeight()
            r27 = r6
            int r6 = r26 - r23
            int r6 = -r6
            float r6 = (float) r6
            float r6 = r6 / r25
            r3.setTranslate(r0, r6)
            r5.setLocalMatrix(r3)
            r7.setShader(r5)
            r8.drawCircle(r11, r11, r4, r7)
            r0 = 0
            r8.setBitmap(r0)
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithBitmap(r20)
            goto L136
        L1de:
            r24 = r3
            r18 = r4
            r22 = r5
            r27 = r6
            r19 = r8
            r21 = r11
            java.lang.Object r0 = r10.f9434b
            java.lang.String r0 = (java.lang.String) r0
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithContentUri(r0)
            goto L136
        L1f4:
            r24 = r3
            r18 = r4
            r22 = r5
            r27 = r6
            r19 = r8
            r21 = r11
            java.lang.Object r0 = r10.f9434b
            byte[] r0 = (byte[]) r0
            int r3 = r10.f9437e
            int r4 = r10.f
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithData(r0, r3, r4)
            goto L136
        L20e:
            r24 = r3
            r18 = r4
            r22 = r5
            r27 = r6
            r19 = r8
            r21 = r11
            r3 = -1
            if (r0 != r3) goto L250
            java.lang.Object r0 = r10.f9434b
            java.lang.String r3 = "Unable to get icon package"
            r4 = 28
            if (r12 < r4) goto L22b
            java.lang.String r0 = A1.k.e(r0)
        L229:
            r4 = 2
            goto L26d
        L22b:
            java.lang.Class r4 = r0.getClass()     // Catch: java.lang.NoSuchMethodException -> L23d java.lang.reflect.InvocationTargetException -> L23f java.lang.IllegalAccessException -> L241
            java.lang.String r5 = "getResPackage"
            r6 = 0
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchMethodException -> L23d java.lang.reflect.InvocationTargetException -> L23f java.lang.IllegalAccessException -> L241
            java.lang.Object r0 = r4.invoke(r0, r6)     // Catch: java.lang.NoSuchMethodException -> L23d java.lang.reflect.InvocationTargetException -> L23f java.lang.IllegalAccessException -> L241
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NoSuchMethodException -> L23d java.lang.reflect.InvocationTargetException -> L23f java.lang.IllegalAccessException -> L241
            goto L229
        L23d:
            r0 = move-exception
            goto L243
        L23f:
            r0 = move-exception
            goto L247
        L241:
            r0 = move-exception
            goto L24b
        L243:
            android.util.Log.e(r7, r3, r0)
            goto L24e
        L247:
            android.util.Log.e(r7, r3, r0)
            goto L24e
        L24b:
            android.util.Log.e(r7, r3, r0)
        L24e:
            r0 = 0
            goto L229
        L250:
            r4 = 2
            if (r0 != r4) goto L274
            java.lang.String r0 = r10.j
            if (r0 == 0) goto L261
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L25e
            goto L261
        L25e:
            java.lang.String r0 = r10.j
            goto L26d
        L261:
            java.lang.Object r0 = r10.f9434b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r5 = ":"
            java.lang.String[] r0 = r0.split(r5, r3)
            r0 = r0[r16]
        L26d:
            int r3 = r10.f9437e
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithResource(r0, r3)
            goto L29d
        L274:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "called getResPackage() on "
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L288:
            r24 = r3
            r18 = r4
            r22 = r5
            r27 = r6
            r19 = r8
            r21 = r11
            r4 = 2
            java.lang.Object r0 = r10.f9434b
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithBitmap(r0)
        L29d:
            android.content.res.ColorStateList r3 = r10.f9438g
            if (r3 == 0) goto L2a4
            r0.setTintList(r3)
        L2a4:
            android.graphics.PorterDuff$Mode r3 = r10.f9439h
            android.graphics.PorterDuff$Mode r5 = androidx.core.graphics.drawable.IconCompat.f9432k
            if (r3 == r5) goto L2ce
            r0.setTintMode(r3)
            goto L2ce
        L2ae:
            r24 = r3
            r18 = r4
            r22 = r5
            r27 = r6
            r19 = r8
            r21 = r11
            r4 = 2
            java.lang.Object r0 = r10.f9434b
            android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
            goto L2ce
        L2c0:
            r24 = r3
            r18 = r4
            r22 = r5
            r27 = r6
            r19 = r8
            r21 = r11
            r4 = 2
            r0 = 0
        L2ce:
            java.lang.CharSequence r3 = r13.f
            android.app.PendingIntent r5 = r13.f14068g
            android.app.Notification$Action$Builder r6 = new android.app.Notification$Action$Builder
            r6.<init>(r0, r3, r5)
            if (r15 == 0) goto L2df
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>(r15)
            goto L2e4
        L2df:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L2e4:
            r0.putBoolean(r14, r9)
            r6.setAllowGeneratedReplies(r9)
            java.lang.String r3 = "android.support.action.semanticAction"
            r5 = r16
            r0.putInt(r3, r5)
            r3 = 28
            if (r12 < r3) goto L2f8
            k1.k.a(r6)
        L2f8:
            r3 = 29
            if (r12 < r3) goto L2ff
            k1.AbstractC1176d.d(r6)
        L2ff:
            r3 = 31
            if (r12 < r3) goto L306
            k1.l.a(r6)
        L306:
            java.lang.String r3 = "android.support.action.showsUserInterface"
            boolean r5 = r13.f14066d
            r0.putBoolean(r3, r5)
            r6.addExtras(r0)
            java.lang.Object r0 = r1.f234r
            android.app.Notification$Builder r0 = (android.app.Notification.Builder) r0
            android.app.Notification$Action r3 = r6.build()
            r0.addAction(r3)
            r10 = r4
            r0 = r17
            r4 = r18
            r8 = r19
            r11 = r21
            r5 = r22
            r3 = r24
            r6 = r27
            r7 = 26
            r9 = 0
            r12 = 0
            goto Le7
        L330:
            r24 = r3
            r18 = r4
            r22 = r5
            r27 = r6
            android.os.Bundle r0 = r2.f14077l
            if (r0 == 0) goto L343
            java.lang.Object r3 = r1.f236t
            android.os.Bundle r3 = (android.os.Bundle) r3
            r3.putAll(r0)
        L343:
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Object r3 = r1.f234r
            android.app.Notification$Builder r3 = (android.app.Notification.Builder) r3
            boolean r4 = r2.i
            r3.setShowWhen(r4)
            java.lang.Object r3 = r1.f234r
            android.app.Notification$Builder r3 = (android.app.Notification.Builder) r3
            boolean r4 = r2.f14076k
            r3.setLocalOnly(r4)
            java.lang.Object r3 = r1.f234r
            android.app.Notification$Builder r3 = (android.app.Notification.Builder) r3
            r6 = 0
            r3.setGroup(r6)
            java.lang.Object r3 = r1.f234r
            android.app.Notification$Builder r3 = (android.app.Notification.Builder) r3
            r3.setSortKey(r6)
            java.lang.Object r3 = r1.f234r
            android.app.Notification$Builder r3 = (android.app.Notification.Builder) r3
            r5 = 0
            r3.setGroupSummary(r5)
            java.lang.Object r3 = r1.f234r
            android.app.Notification$Builder r3 = (android.app.Notification.Builder) r3
            r3.setCategory(r6)
            java.lang.Object r3 = r1.f234r
            android.app.Notification$Builder r3 = (android.app.Notification.Builder) r3
            r3.setColor(r5)
            java.lang.Object r3 = r1.f234r
            android.app.Notification$Builder r3 = (android.app.Notification.Builder) r3
            r3.setVisibility(r5)
            java.lang.Object r3 = r1.f234r
            android.app.Notification$Builder r3 = (android.app.Notification.Builder) r3
            r3.setPublicVersion(r6)
            java.lang.Object r3 = r1.f234r
            android.app.Notification$Builder r3 = (android.app.Notification.Builder) r3
            r4 = r27
            android.net.Uri r5 = r4.sound
            android.media.AudioAttributes r4 = r4.audioAttributes
            r3.setSound(r5, r4)
            r3 = 28
            if (r0 >= r3) goto L3dc
            if (r18 != 0) goto L39f
            r0 = 0
            goto L3b2
        L39f:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r18.size()
            r0.<init>(r3)
            java.util.Iterator r3 = r18.iterator()
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L3d7
        L3b2:
            if (r0 != 0) goto L3b7
            r3 = r24
            goto L3df
        L3b7:
            if (r24 != 0) goto L3bb
        L3b9:
            r3 = r0
            goto L3df
        L3bb:
            r.f r3 = new r.f
            int r4 = r0.size()
            int r5 = r24.size()
            int r5 = r5 + r4
            r3.<init>(r5)
            r3.addAll(r0)
            r4 = r24
            r3.addAll(r4)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            goto L3b9
        L3d7:
            java.lang.ClassCastException r0 = k1.i.h(r3)
            throw r0
        L3dc:
            r4 = r24
            r3 = r4
        L3df:
            if (r3 == 0) goto L3fe
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L3fe
            int r0 = r3.size()
            r4 = 0
        L3ec:
            if (r4 >= r0) goto L3fe
            java.lang.Object r5 = r3.get(r4)
            int r4 = r4 + 1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r1.f234r
            android.app.Notification$Builder r6 = (android.app.Notification.Builder) r6
            r6.addPerson(r5)
            goto L3ec
        L3fe:
            int r0 = r22.size()
            if (r0 <= 0) goto L4be
            android.os.Bundle r0 = r2.f14077l
            if (r0 != 0) goto L40f
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r2.f14077l = r0
        L40f:
            android.os.Bundle r0 = r2.f14077l
            java.lang.String r3 = "android.car.EXTENSIONS"
            android.os.Bundle r0 = r0.getBundle(r3)
            if (r0 != 0) goto L41e
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L41e:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r0)
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            r6 = 0
        L429:
            int r7 = r22.size()
            if (r6 >= r7) goto L49f
            java.lang.String r7 = java.lang.Integer.toString(r6)
            r8 = r22
            java.lang.Object r9 = r8.get(r6)
            k1.g r9 = (k1.g) r9
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            androidx.core.graphics.drawable.IconCompat r11 = r9.f14064b
            if (r11 != 0) goto L44e
            int r11 = r9.f14067e
            if (r11 == 0) goto L44e
            androidx.core.graphics.drawable.IconCompat r11 = androidx.core.graphics.drawable.IconCompat.a(r11)
            r9.f14064b = r11
        L44e:
            androidx.core.graphics.drawable.IconCompat r11 = r9.f14064b
            android.os.Bundle r12 = r9.f14063a
            if (r11 == 0) goto L459
            int r11 = r11.b()
            goto L45a
        L459:
            r11 = 0
        L45a:
            java.lang.String r13 = "icon"
            r10.putInt(r13, r11)
            java.lang.String r11 = "title"
            java.lang.CharSequence r13 = r9.f
            r10.putCharSequence(r11, r13)
            java.lang.String r11 = "actionIntent"
            android.app.PendingIntent r13 = r9.f14068g
            r10.putParcelable(r11, r13)
            if (r12 == 0) goto L475
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>(r12)
            goto L47a
        L475:
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
        L47a:
            boolean r12 = r9.f14065c
            r11.putBoolean(r14, r12)
            java.lang.String r12 = "extras"
            r10.putBundle(r12, r11)
            java.lang.String r11 = "remoteInputs"
            r12 = 0
            r10.putParcelableArray(r11, r12)
            java.lang.String r11 = "showsUserInterface"
            boolean r9 = r9.f14066d
            r10.putBoolean(r11, r9)
            java.lang.String r9 = "semanticAction"
            r11 = 0
            r10.putInt(r9, r11)
            r5.putBundle(r7, r10)
            int r6 = r6 + 1
            r22 = r8
            goto L429
        L49f:
            java.lang.String r6 = "invisible_actions"
            r0.putBundle(r6, r5)
            r4.putBundle(r6, r5)
            android.os.Bundle r5 = r2.f14077l
            if (r5 != 0) goto L4b2
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            r2.f14077l = r5
        L4b2:
            android.os.Bundle r5 = r2.f14077l
            r5.putBundle(r3, r0)
            java.lang.Object r0 = r1.f236t
            android.os.Bundle r0 = (android.os.Bundle) r0
            r0.putBundle(r3, r4)
        L4be:
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Object r3 = r1.f234r
            android.app.Notification$Builder r3 = (android.app.Notification.Builder) r3
            android.os.Bundle r4 = r2.f14077l
            r3.setExtras(r4)
            java.lang.Object r3 = r1.f234r
            android.app.Notification$Builder r3 = (android.app.Notification.Builder) r3
            r6 = 0
            r3.setRemoteInputHistory(r6)
            r7 = 26
            if (r0 < r7) goto L515
            java.lang.Object r3 = r1.f234r
            android.app.Notification$Builder r3 = (android.app.Notification.Builder) r3
            k1.j.b(r3)
            java.lang.Object r3 = r1.f234r
            android.app.Notification$Builder r3 = (android.app.Notification.Builder) r3
            k1.j.d(r3)
            java.lang.Object r3 = r1.f234r
            android.app.Notification$Builder r3 = (android.app.Notification.Builder) r3
            k1.j.e(r3)
            java.lang.Object r3 = r1.f234r
            android.app.Notification$Builder r3 = (android.app.Notification.Builder) r3
            k1.j.f(r3)
            java.lang.Object r3 = r1.f234r
            android.app.Notification$Builder r3 = (android.app.Notification.Builder) r3
            k1.j.c(r3)
            java.lang.String r3 = r2.f14078m
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L515
            java.lang.Object r3 = r1.f234r
            android.app.Notification$Builder r3 = (android.app.Notification.Builder) r3
            r6 = 0
            android.app.Notification$Builder r3 = r3.setSound(r6)
            r5 = 0
            android.app.Notification$Builder r3 = r3.setDefaults(r5)
            android.app.Notification$Builder r3 = r3.setLights(r5, r5, r5)
            r3.setVibrate(r6)
        L515:
            r3 = 28
            if (r0 < r3) goto L523
            java.util.Iterator r3 = r18.iterator()
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L526
        L523:
            r3 = 29
            goto L52b
        L526:
            java.lang.ClassCastException r0 = k1.i.h(r3)
            throw r0
        L52b:
            if (r0 < r3) goto L53d
            java.lang.Object r0 = r1.f234r
            android.app.Notification$Builder r0 = (android.app.Notification.Builder) r0
            boolean r2 = r2.f14079n
            k1.AbstractC1176d.b(r0, r2)
            java.lang.Object r0 = r1.f234r
            android.app.Notification$Builder r0 = (android.app.Notification.Builder) r0
            k1.AbstractC1176d.c(r0)
        L53d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.G0.<init>(k1.h):void");
    }

    public G0(ConnectivityManager connectivityManager, H2.m mVar) {
        this.f233q = 1;
        this.f234r = connectivityManager;
        this.f235s = mVar;
        C2.g gVar = new C2.g(this);
        this.f236t = gVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), gVar);
    }

    public G0(d1.e eVar) {
        this.f233q = 23;
        this.f236t = new ArrayList();
        this.f234r = new C1022b();
        this.f235s = eVar;
    }

    public G0(E.c0 c0Var, C1899k c1899k, C0146d c0146d, Set set) {
        this.f233q = 4;
        this.f234r = c1899k;
        this.f235s = c0Var;
        this.f236t = c0146d;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            Q(str, 0, str.length(), 1, true, new E1.t(str, false));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: B5.a */
    /* JADX WARN: Multi-variable type inference failed */
    public G0(C1548G c1548g, String str, B5.a aVar) {
        this.f233q = 18;
        this.f234r = c1548g;
        this.f235s = str;
        this.f236t = (kotlin.jvm.internal.n) aVar;
    }

    public G0(String str) {
        this.f233q = 5;
        C0050o c0050o = new C0050o();
        this.f235s = c0050o;
        this.f236t = c0050o;
        this.f234r = str;
    }

    public G0(O0.r rVar, G0 g02) {
        this.f233q = 14;
        this.f235s = rVar;
        this.f236t = g02;
        this.f234r = rVar.f4294q;
    }

    public G0(L l7) {
        this.f233q = 0;
        this.f234r = l7;
        this.f236t = new ArrayList();
        this.f235s = l7;
    }

    public G0(Matcher matcher, CharSequence input) {
        this.f233q = 6;
        kotlin.jvm.internal.m.e(input, "input");
        this.f234r = matcher;
        this.f235s = input;
        this.f236t = new J5.j(0, this);
    }
}
