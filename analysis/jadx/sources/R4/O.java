package R4;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebChromeClient;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.web2native.MainActivity;
import j5.C1166c;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import k5.C1190b;
import org.json.JSONObject;
import y4.AbstractC1918b;

/* JADX INFO: loaded from: classes.dex */
public final class O extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0468k1 f6812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f6813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f6814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f6816e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f6817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V f6818h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public O(C0468k1 dataObject) {
        androidx.lifecycle.J j;
        androidx.lifecycle.J j7;
        kotlin.jvm.internal.m.e(dataObject, "dataObject");
        MainActivity mainActivity = dataObject.f7069b;
        this.f6812a = dataObject;
        this.f6813b = new JSONObject();
        new Handler(Looper.getMainLooper());
        this.f = new ArrayList();
        this.f6818h = new V();
        C1190b c1190b = dataObject.f7086l;
        if (c1190b != null && (j7 = c1190b.f14129c) != null) {
            final int i = 0;
            j7.e(mainActivity, new N(new B5.c(this) { // from class: R4.L

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public final /* synthetic */ O f6788r;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.f6788r = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
                @Override // B5.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r4) {
                    /*
                        r3 = this;
                        int r0 = r2
                        switch(r0) {
                            case 0: goto L1a;
                            default: goto L5;
                        }
                    L5:
                        android.content.res.Configuration r4 = (android.content.res.Configuration) r4
                        R4.O r4 = r3.f6788r
                        R4.k1 r0 = r4.f6812a
                        android.webkit.WebView r0 = r0.f7084k
                        kotlin.jvm.internal.m.b(r0)
                        java.lang.String r0 = r0.getUrl()
                        r4.a(r0)
                        m5.y r4 = m5.C1386y.f15098a
                        return r4
                    L1a:
                        java.lang.Integer r4 = (java.lang.Integer) r4
                        if (r4 != 0) goto L1f
                        goto L55
                    L1f:
                        int r4 = r4.intValue()
                        r0 = 100
                        if (r4 != r0) goto L55
                        R4.O r4 = r3.f6788r
                        java.lang.String r0 = r4.f6817g
                        R4.k1 r1 = r4.f6812a
                        if (r0 == 0) goto L3e
                        android.webkit.WebView r2 = r1.f7084k
                        kotlin.jvm.internal.m.b(r2)
                        java.lang.String r2 = r2.getUrl()
                        boolean r0 = kotlin.jvm.internal.m.a(r0, r2)
                        if (r0 != 0) goto L55
                    L3e:
                        android.webkit.WebView r0 = r1.f7084k
                        kotlin.jvm.internal.m.b(r0)
                        java.lang.String r0 = r0.getUrl()
                        r4.a(r0)
                        android.webkit.WebView r0 = r1.f7084k
                        kotlin.jvm.internal.m.b(r0)
                        java.lang.String r0 = r0.getUrl()
                        r4.f6817g = r0
                    L55:
                        m5.y r4 = m5.C1386y.f15098a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: R4.L.invoke(java.lang.Object):java.lang.Object");
                }
            }, 0));
        }
        C1166c c1166c = dataObject.f7097s;
        if (c1166c == null || (j = c1166c.f13864g) == null) {
            return;
        }
        final int i7 = 1;
        j.e(mainActivity, new N(new B5.c(this) { // from class: R4.L

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ O f6788r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f6788r = this;
            }

            @Override // B5.c
            public final Object invoke(Object v6) {
                /*
                    this = this;
                    int r0 = r2
                    switch(r0) {
                        case 0: goto L1a;
                        default: goto L5;
                    }
                L5:
                    android.content.res.Configuration r4 = (android.content.res.Configuration) r4
                    R4.O r4 = r3.f6788r
                    R4.k1 r0 = r4.f6812a
                    android.webkit.WebView r0 = r0.f7084k
                    kotlin.jvm.internal.m.b(r0)
                    java.lang.String r0 = r0.getUrl()
                    r4.a(r0)
                    m5.y r4 = m5.C1386y.f15098a
                    return r4
                L1a:
                    java.lang.Integer r4 = (java.lang.Integer) r4
                    if (r4 != 0) goto L1f
                    goto L55
                L1f:
                    int r4 = r4.intValue()
                    r0 = 100
                    if (r4 != r0) goto L55
                    R4.O r4 = r3.f6788r
                    java.lang.String r0 = r4.f6817g
                    R4.k1 r1 = r4.f6812a
                    if (r0 == 0) goto L3e
                    android.webkit.WebView r2 = r1.f7084k
                    kotlin.jvm.internal.m.b(r2)
                    java.lang.String r2 = r2.getUrl()
                    boolean r0 = kotlin.jvm.internal.m.a(r0, r2)
                    if (r0 != 0) goto L55
                L3e:
                    android.webkit.WebView r0 = r1.f7084k
                    kotlin.jvm.internal.m.b(r0)
                    java.lang.String r0 = r0.getUrl()
                    r4.a(r0)
                    android.webkit.WebView r0 = r1.f7084k
                    kotlin.jvm.internal.m.b(r0)
                    java.lang.String r0 = r0.getUrl()
                    r4.f6817g = r0
                L55:
                    m5.y r4 = m5.C1386y.f15098a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: R4.L.invoke(java.lang.Object):java.lang.Object");
            }
        }, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(String str) {
        C0446f c0446f;
        Integer num;
        List list = this.f6816e;
        ArrayList arrayList = this.f;
        if (list == null) {
            try {
                String strV = AbstractC1918b.v(this.f6812a.f7071c);
                if (strV != null) {
                    C0458i c0458i = (C0458i) E3.h.d(new I5.m(10)).a(C3.a.A(C0458i.Companion.serializer()), strV);
                    this.f6816e = (c0458i == null || (c0446f = c0458i.f7004h) == null) ? null : c0446f.f6945a;
                }
                List<C0434c> list2 = this.f6816e;
                if (list2 != null) {
                    for (C0434c c0434c : list2) {
                        arrayList.add(String.valueOf(c0434c != null ? c0434c.f6917a : null));
                    }
                }
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
        if (this.f6816e != null) {
            String strValueOf = String.valueOf(str);
            C0468k1 c0468k1 = this.f6812a;
            RelativeLayout relativeLayout = c0468k1.f7100v;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
            RelativeLayout relativeLayout2 = c0468k1.f7099u;
            if (relativeLayout2 != null) {
                relativeLayout2.removeAllViews();
            }
            int size = arrayList.size();
            int i = 0;
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                int i8 = i + 1;
                if (i < 0) {
                    AbstractC0836n2.N();
                    throw null;
                }
                String pattern = (String) obj;
                kotlin.jvm.internal.m.e(pattern, "pattern");
                Pattern patternCompile = Pattern.compile(pattern, 66);
                kotlin.jvm.internal.m.d(patternCompile, "compile(...)");
                if (patternCompile.matcher(strValueOf).matches()) {
                    List list3 = this.f6816e;
                    kotlin.jvm.internal.m.b(list3);
                    C0434c c0434c2 = (C0434c) list3.get(i);
                    final String string = this.f6813b.put("adId", String.valueOf(c0434c2 != null ? c0434c2.f6920d : null)).toString();
                    kotlin.jvm.internal.m.d(string, "toString(...)");
                    List list4 = this.f6816e;
                    kotlin.jvm.internal.m.b(list4);
                    C0434c c0434c3 = (C0434c) list4.get(i);
                    if (kotlin.jvm.internal.m.a(c0434c3 != null ? c0434c3.f6919c : null, "BANNER")) {
                        List list5 = this.f6816e;
                        kotlin.jvm.internal.m.b(list5);
                        C0434c c0434c4 = (C0434c) list5.get(i);
                        this.f6814c = c0434c4 != null ? c0434c4.f6921e : null;
                    }
                    List list6 = this.f6816e;
                    kotlin.jvm.internal.m.b(list6);
                    C0434c c0434c5 = (C0434c) list6.get(i);
                    this.f6815d = (c0434c5 == null || (num = c0434c5.f6918b) == null) ? 0 : num.intValue();
                    Handler handler = new Handler(Looper.getMainLooper());
                    List list7 = this.f6816e;
                    kotlin.jvm.internal.m.b(list7);
                    C0434c c0434c6 = (C0434c) list7.get(i);
                    String str2 = c0434c6 != null ? c0434c6.f6919c : null;
                    if (str2 != null) {
                        int iHashCode = str2.hashCode();
                        if (iHashCode != -1880997073) {
                            if (iHashCode != 595158971) {
                                if (iHashCode == 1951953708 && str2.equals("BANNER")) {
                                    this.f6818h.getClass();
                                }
                            } else if (str2.equals("FULLSCREEN")) {
                                if (this.f6814c == null) {
                                    this.f6814c = "BOTTOM";
                                }
                                final int i9 = 0;
                                handler.postDelayed(new Runnable(this, string, i9) { // from class: R4.M

                                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                                    public final /* synthetic */ int f6792q;

                                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                                    public final /* synthetic */ O f6793r;

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    {
                                        this.f6792q = i9;
                                        this.f6793r = this;
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (this.f6792q) {
                                            case 0:
                                                this.f6793r.f6818h.getClass();
                                                break;
                                            default:
                                                this.f6793r.f6818h.getClass();
                                                break;
                                        }
                                    }
                                }, this.f6815d * 1000);
                            }
                        } else if (str2.equals("REWARD")) {
                            if (this.f6814c == null) {
                                this.f6814c = "BOTTOM";
                            }
                            final int i10 = 1;
                            handler.postDelayed(new Runnable(this, string, i10) { // from class: R4.M

                                /* JADX INFO: renamed from: q, reason: collision with root package name */
                                public final /* synthetic */ int f6792q;

                                /* JADX INFO: renamed from: r, reason: collision with root package name */
                                public final /* synthetic */ O f6793r;

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                {
                                    this.f6792q = i10;
                                    this.f6793r = this;
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (this.f6792q) {
                                        case 0:
                                            this.f6793r.f6818h.getClass();
                                            break;
                                        default:
                                            this.f6793r.f6818h.getClass();
                                            break;
                                    }
                                }
                            }, this.f6815d * 1000);
                        }
                    }
                }
                i = i8;
            }
        }
    }
}
