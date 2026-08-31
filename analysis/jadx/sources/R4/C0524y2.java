package R4;

import B0.C0050o;
import P.C0348c0;
import android.webkit.WebView;
import c0.InterfaceC0725m;
import java.util.ArrayList;
import java.util.List;
import m5.C1386y;
import y4.AbstractC1918b;

/* JADX INFO: renamed from: R4.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0524y2 implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7218q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f7219r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f7220s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f7221t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0524y2(Object obj, Object obj2, Object obj3, int i) {
        this.f7218q = i;
        this.f7219r = obj;
        this.f7220s = obj2;
        this.f7221t = obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f7218q) {
            case 0:
                List<C0503t1> list = (List) this.f7219r;
                C0050o c0050o = (C0050o) this.f7220s;
                C0348c0 c0348c0 = (C0348c0) this.f7221t;
                Integer num = (Integer) obj;
                if (num != null && num.intValue() == 100) {
                    ArrayList arrayList = new ArrayList();
                    if (list != null) {
                        for (C0503t1 c0503t1 : list) {
                            arrayList.add(String.valueOf(c0503t1 != null ? c0503t1.f7185b : null));
                        }
                    }
                    C0468k1 c0468k1 = (C0468k1) c0050o.f499q;
                    a5.y yVar = (a5.y) c0050o.f500r;
                    WebView webView = c0468k1.f7084k;
                    c0348c0.f(AbstractC1918b.x(arrayList, webView != null ? webView.getUrl() : null));
                    if (arrayList.size() == 0 || c0348c0.e() == -1) {
                        if (yVar != null) {
                            P5.S s6 = yVar.f9013h;
                            Boolean bool = Boolean.FALSE;
                            s6.getClass();
                            s6.h(null, bool);
                        }
                    } else if (yVar != null) {
                        P5.S s7 = yVar.f9013h;
                        Boolean bool2 = Boolean.TRUE;
                        s7.getClass();
                        s7.h(null, bool2);
                    }
                }
                break;
            case 1:
                a0.q qVar = (a0.q) this.f7219r;
                T1.d dVar = (T1.d) this.f7220s;
                U1.r rVar = (U1.r) this.f7221t;
                qVar.add(dVar);
                break;
            case 2:
                Z4.M m4 = (Z4.M) this.f7219r;
                P.W w3 = (P.W) this.f7220s;
                P.W w6 = (P.W) this.f7221t;
                InterfaceC0725m im = (InterfaceC0725m) obj;
                kotlin.jvm.internal.m.e(im, "im");
                w3.setValue(im);
                w6.setValue(im);
                if (m4 != null) {
                    m4.c(true);
                }
                break;
            default:
                a5.c cVar = (a5.c) this.f7219r;
                B5.a aVar = (B5.a) this.f7220s;
                B5.c cVar2 = (B5.c) this.f7221t;
                String str = cVar.f8937c;
                if (str != null) {
                    cVar2.invoke(str);
                }
                aVar.invoke();
                break;
        }
        return C1386y.f15098a;
    }
}
