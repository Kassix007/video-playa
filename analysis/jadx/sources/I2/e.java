package I2;

import P.W;
import R4.C0468k1;
import R4.C0517x;
import a6.AbstractC0637c;
import android.webkit.WebView;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import m5.C1371j;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2346q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f2347r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f2348s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.f2346q = i;
        this.f2347r = obj;
        this.f2348s = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        WebView webView;
        String[] strArrNames;
        switch (this.f2346q) {
            case 0:
                return AbstractC0836n2.z(new C1371j((L2.f) this.f2347r, (kotlin.jvm.internal.f) this.f2348s));
            case 1:
                R4.A a7 = (R4.A) this.f2347r;
                C0468k1 c0468k1 = (C0468k1) this.f2348s;
                String str = a7.f6721e;
                if (str != null && C3.a.C(c0468k1, str) && (webView = c0468k1.f7084k) != null) {
                    webView.loadUrl(str);
                }
                return C1386y.f15098a;
            case 2:
                ((U1.r) this.f2347r).e((T1.d) this.f2348s, false);
                return C1386y.f15098a;
            case 3:
                B5.a aVar = (B5.a) this.f2347r;
                W w3 = (W) this.f2348s;
                aVar.invoke();
                w3.setValue(Boolean.FALSE);
                return C1386y.f15098a;
            case 4:
                X5.f fVar = (X5.f) this.f2347r;
                AbstractC0637c abstractC0637c = (AbstractC0637c) this.f2348s;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                a6.j jVar = abstractC0637c.f9019a;
                b6.e.h(fVar, abstractC0637c);
                int iD = fVar.d();
                for (int i = 0; i < iD; i++) {
                    List listH = fVar.h(i);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listH) {
                        if (obj instanceof a6.t) {
                            arrayList.add(obj);
                        }
                    }
                    a6.t tVar = (a6.t) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (tVar != null && (strArrNames = tVar.names()) != null) {
                        for (String str2 : strArrNames) {
                            String str3 = kotlin.jvm.internal.m.a(fVar.c(), X5.h.f8193d) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str2)) {
                                String message = "The suggested name '" + str2 + "' for " + str3 + ' ' + fVar.e(i) + " is already one of the names for " + str3 + ' ' + fVar.e(((Number) n5.x.J(str2, linkedHashMap)).intValue()) + " in " + fVar;
                                kotlin.jvm.internal.m.e(message, "message");
                                throw new V5.e(message);
                            }
                            linkedHashMap.put(str2, Integer.valueOf(i));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? n5.t.f15300q : linkedHashMap;
            case 5:
                ((B5.c) this.f2347r).invoke(((C0517x) this.f2348s).f7209g);
                return C1386y.f15098a;
            default:
                ((g5.h) this.f2347r).c((String) this.f2348s);
                return C1386y.f15098a;
        }
    }
}
