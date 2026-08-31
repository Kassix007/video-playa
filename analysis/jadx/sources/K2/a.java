package K2;

import L.s;
import O3.C0288h0;
import P5.S;
import R4.C0468k1;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import com.web2native.MainActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.m;
import q6.x;
import w2.C1863a;
import w2.C1865c;
import w2.C1867e;
import x3.AbstractC1887A;
import y4.AbstractC1918b;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Serializable f2861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2862e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(C0288h0 c0288h0, String str) {
        this.f2858a = 1;
        this.f2862e = c0288h0;
        AbstractC1887A.d(str);
        this.f2860c = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(boolean z5) {
        switch (this.f2858a) {
            case 0:
                f fVar = (f) this.f2862e;
                synchronized (fVar.f2889x) {
                    try {
                        if (this.f2859b) {
                            throw new IllegalStateException("editor is closed");
                        }
                        if (m.a(((b) this.f2860c).f2868g, this)) {
                            f.a(fVar, this, z5);
                        }
                        this.f2859b = true;
                    } finally {
                    }
                }
                return;
            default:
                C1867e c1867e = (C1867e) this.f2862e;
                synchronized (c1867e) {
                    try {
                        if (this.f2859b) {
                            throw new IllegalStateException("editor is closed");
                        }
                        if (m.a(((C1863a) this.f2860c).f18255g, this)) {
                            C1867e.a(c1867e, this, z5);
                        }
                        this.f2859b = true;
                    } finally {
                    }
                }
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x b(int i) {
        x xVar;
        x xVar2;
        switch (this.f2858a) {
            case 0:
                f fVar = (f) this.f2862e;
                synchronized (fVar.f2889x) {
                    if (this.f2859b) {
                        throw new IllegalStateException("editor is closed");
                    }
                    ((boolean[]) this.f2861d)[i] = true;
                    Object obj = ((b) this.f2860c).f2866d.get(i);
                    C3.a.s(fVar.f2881G, (x) obj);
                    xVar = (x) obj;
                }
                return xVar;
            default:
                C1867e c1867e = (C1867e) this.f2862e;
                synchronized (c1867e) {
                    if (this.f2859b) {
                        throw new IllegalStateException("editor is closed");
                    }
                    ((boolean[]) this.f2861d)[i] = true;
                    Object obj2 = ((C1863a) this.f2860c).f18253d.get(i);
                    C1865c c1865c = c1867e.f18267F;
                    x xVar3 = (x) obj2;
                    if (!c1865c.v(xVar3)) {
                        H2.f.a(c1865c.W(xVar3, false));
                    }
                    xVar2 = (x) obj2;
                }
                return xVar2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int[] c() {
        synchronized (this) {
            try {
                if (!this.f2859b) {
                    return null;
                }
                long[] jArr = (long[]) this.f2860c;
                int length = jArr.length;
                int i = 0;
                int i7 = 0;
                while (i < length) {
                    int i8 = i7 + 1;
                    int i9 = 1;
                    boolean z5 = jArr[i] > 0;
                    boolean[] zArr = (boolean[]) this.f2861d;
                    if (z5 != zArr[i7]) {
                        int[] iArr = (int[]) this.f2862e;
                        if (!z5) {
                            i9 = 2;
                        }
                        iArr[i7] = i9;
                    } else {
                        ((int[]) this.f2862e)[i7] = 0;
                    }
                    zArr[i7] = z5;
                    i++;
                    i7 = i8;
                }
                this.f2859b = false;
                return (int[]) ((int[]) this.f2862e).clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean d(WebView view, String str) {
        m.e(view, "view");
        List list = (List) this.f2862e;
        if (list == null) {
            m.k("allRegexHandling");
            throw null;
        }
        Boolean boolK = AbstractC1918b.k(str, list);
        Boolean bool = Boolean.FALSE;
        if (!m.a(boolK, bool)) {
            C0468k1 dataObject = (C0468k1) this.f2860c;
            boolean z5 = this.f2859b;
            HashMap customHeaders = (HashMap) this.f2861d;
            List list2 = (List) this.f2862e;
            if (list2 == null) {
                m.k("allRegexHandling");
                throw null;
            }
            m.e(dataObject, "dataObject");
            m.e(customHeaders, "customHeaders");
            Boolean boolK2 = AbstractC1918b.k(str, list2);
            if (!z5) {
                AbstractC1918b.w(str, view, customHeaders, dataObject);
                return false;
            }
            Boolean bool2 = Boolean.TRUE;
            if (m.a(boolK2, bool2)) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                S s6 = dataObject.f7098t.f;
                s6.getClass();
                s6.h(null, bool2);
                dataObject.f7071c.startActivity(intent);
                return true;
            }
            if (m.a(boolK2, bool) || str.equals("https://www.smspariaz.com") || str.equals("https://www.smspariaz.com")) {
                AbstractC1918b.w(str, view, customHeaders, dataObject);
                return false;
            }
            if (boolK2 == null) {
                s sVar = new s();
                MainActivity mainActivity = dataObject.f7067a;
                Z.m mVarB = sVar.b();
                Uri uri = Uri.parse(str);
                Intent intent2 = (Intent) mVarB.f8312r;
                try {
                    intent2.setPackage("com.android.chrome");
                    m.b(uri);
                    intent2.setData(uri);
                    mainActivity.startActivity(intent2, (Bundle) mVarB.f8313s);
                    return true;
                } catch (Exception unused) {
                    mainActivity.startActivity(new Intent("android.intent.action.VIEW", uri));
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String e() {
        if (!this.f2859b) {
            this.f2859b = true;
            C0288h0 c0288h0 = (C0288h0) this.f2862e;
            this.f2861d = c0288h0.s().getString((String) this.f2860c, null);
        }
        return (String) this.f2861d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void f(String str) {
        SharedPreferences.Editor editorEdit = ((C0288h0) this.f2862e).s().edit();
        editorEdit.putString((String) this.f2860c, str);
        editorEdit.apply();
        this.f2861d = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(R4.C0468k1 r9) throws org.json.JSONException {
        /*
            r8 = this;
            r0 = 4
            r8.f2858a = r0
            java.lang.String r0 = "dataObject"
            kotlin.jvm.internal.m.e(r9, r0)
            r8.<init>()
            r8.f2860c = r9
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            R4.i r9 = r9.f7073d
            r1 = 0
            if (r9 == 0) goto L1e
            R4.a2 r9 = r9.f7001d
            if (r9 == 0) goto L1e
            java.util.List r9 = r9.f6913a
            goto L1f
        L1e:
            r9 = r1
        L1f:
            kotlin.jvm.internal.m.b(r9)
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Exception -> L4f
        L26:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Exception -> L4f
            if (r2 == 0) goto L51
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Exception -> L4f
            R4.t2 r2 = (R4.C0504t2) r2     // Catch: java.lang.Exception -> L4f
            if (r2 == 0) goto L26
            java.lang.String r3 = r2.f7189a     // Catch: java.lang.Exception -> L4f
            java.lang.String r4 = r2.f7190b     // Catch: java.lang.Exception -> L4f
            i5.a r5 = new i5.a     // Catch: java.lang.Exception -> L4f
            java.lang.String r2 = r2.f7192d     // Catch: java.lang.Exception -> L4f
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> L4f
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> L4f
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> L4f
            r5.<init>(r2, r4, r3)     // Catch: java.lang.Exception -> L4f
            r0.add(r5)     // Catch: java.lang.Exception -> L4f
            goto L26
        L4f:
            r9 = move-exception
            goto L53
        L51:
            r9 = 1
            goto L57
        L53:
            r9.printStackTrace()
            r9 = 0
        L57:
            java.util.List r0 = n5.l.B0(r0)
            java.util.List r0 = (java.util.List) r0
            r8.f2859b = r9
            r8.f2862e = r0
            java.lang.Object r9 = r8.f2860c
            R4.k1 r9 = (R4.C0468k1) r9
            com.web2native.MainActivity r9 = r9.f7071c
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r2 = y4.AbstractC1918b.v(r9)
            if (r2 == 0) goto Le4
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>(r2)
            java.lang.String r2 = "customHeaders"
            boolean r4 = r3.has(r2)
            if (r4 == 0) goto Le4
            org.json.JSONObject r2 = r3.getJSONObject(r2)
            java.util.Iterator r3 = r2.keys()
            kotlin.jvm.internal.m.b(r3)
        L8a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Le4
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = r2.getString(r4)
            if (r5 == 0) goto Lda
            int r6 = r5.hashCode()
            r7 = -1483131996(0xffffffffa79933a4, float:-4.252202E-15)
            if (r6 == r7) goto Lc7
            r7 = -435108683(0xffffffffe610c4b5, float:-1.7091234E23)
            if (r6 == r7) goto Lbb
            r7 = 914581305(0x36836739, float:3.916121E-6)
            if (r6 == r7) goto Lb0
            goto Lda
        Lb0:
            java.lang.String r6 = "PLAYER_ID"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto Lb9
            goto Lda
        Lb9:
            r5 = r1
            goto Lde
        Lbb:
            java.lang.String r6 = "OS_TYPE"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto Lc4
            goto Lda
        Lc4:
            java.lang.String r5 = "Android"
            goto Lde
        Lc7:
            java.lang.String r6 = "DEVICE_ID"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto Lda
            android.content.ContentResolver r5 = r9.getContentResolver()
            java.lang.String r6 = "android_id"
            java.lang.String r5 = android.provider.Settings.Secure.getString(r5, r6)
            goto Lde
        Lda:
            java.lang.String r5 = r2.getString(r4)
        Lde:
            if (r5 == 0) goto L8a
            r0.put(r4, r5)
            goto L8a
        Le4:
            r8.f2861d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.a.<init>(R4.k1):void");
    }

    public a() {
        this.f2858a = 2;
        this.f2860c = new Object();
        this.f2861d = new ArrayList();
        this.f2862e = new ArrayList();
        this.f2859b = true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [boolean[], java.io.Serializable] */
    public a(int i) {
        this.f2858a = 3;
        this.f2860c = new long[i];
        this.f2861d = new boolean[i];
        this.f2862e = new int[i];
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [boolean[], java.io.Serializable] */
    public a(f fVar, b bVar) {
        this.f2858a = 0;
        this.f2862e = fVar;
        this.f2860c = bVar;
        this.f2861d = new boolean[2];
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [boolean[], java.io.Serializable] */
    public a(C1867e c1867e, C1863a c1863a) {
        this.f2858a = 5;
        this.f2862e = c1867e;
        this.f2860c = c1863a;
        this.f2861d = new boolean[2];
    }
}
