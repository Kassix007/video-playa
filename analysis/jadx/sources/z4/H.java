package Z4;

import M5.InterfaceC0261w;
import P.C0348c0;
import P.W;
import a.AbstractC0597a;
import android.graphics.Color;
import com.web2native.MainActivity;
import j0.AbstractC1145B;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class H extends s5.i implements B5.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ W f8454A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C0348c0 f8455B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ W f8456C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ W f8457D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ W f8458E;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ W f8459q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MainActivity f8460r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ M f8461s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ W f8462t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ W f8463u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ W f8464v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ W f8465w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f8466x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ W f8467y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ W f8468z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(W w3, MainActivity mainActivity, M m4, W w6, W w7, W w8, W w9, int i, W w10, W w11, W w12, C0348c0 c0348c0, W w13, W w14, W w15, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f8459q = w3;
        this.f8460r = mainActivity;
        this.f8461s = m4;
        this.f8462t = w6;
        this.f8463u = w7;
        this.f8464v = w8;
        this.f8465w = w9;
        this.f8466x = i;
        this.f8467y = w10;
        this.f8468z = w11;
        this.f8454A = w12;
        this.f8455B = c0348c0;
        this.f8456C = w13;
        this.f8457D = w14;
        this.f8458E = w15;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new H(this.f8459q, this.f8460r, this.f8461s, this.f8462t, this.f8463u, this.f8464v, this.f8465w, this.f8466x, this.f8467y, this.f8468z, this.f8454A, this.f8455B, this.f8456C, this.f8457D, this.f8458E, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        H h4 = (H) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        h4.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        C0564f c0564f;
        boolean z5;
        String str;
        C0564f c0564f2;
        C0570l c0570l;
        AbstractC1362a.e(obj);
        float f = L.f8475a;
        W w3 = this.f8459q;
        if (((String) w3.getValue()) != null) {
            M m4 = this.f8461s;
            W w6 = this.f8463u;
            W w7 = this.f8464v;
            W w8 = this.f8465w;
            int i = this.f8466x;
            W w9 = this.f8467y;
            W w10 = this.f8468z;
            W w11 = this.f8454A;
            C0348c0 c0348c0 = this.f8455B;
            W w12 = this.f8456C;
            W w13 = this.f8457D;
            W w14 = this.f8458E;
            MainActivity mainActivity = this.f8460r;
            this.f8462t.setValue(new Integer(mainActivity.getRequestedOrientation()));
            try {
                a6.q qVarD = E3.h.d(new G(0));
                String str2 = (String) w3.getValue();
                kotlin.jvm.internal.m.b(str2);
                w6.setValue((r) qVarD.a(C3.a.A(r.Companion.serializer()), str2));
                r rVar = (r) w6.getValue();
                String str3 = null;
                w7.setValue(rVar != null ? rVar.f8503a : null);
                o oVar = (o) w7.getValue();
                if ((oVar != null ? oVar.f8500c : null) == null) {
                    L.e(w8, false);
                }
                o oVar2 = (o) w7.getValue();
                if (oVar2 != null && (c0564f = oVar2.f8500c) != null) {
                    if (m4 != null) {
                        m4.c(false);
                    }
                    o oVar3 = (o) w7.getValue();
                    if (oVar3 != null && (c0564f2 = oVar3.f8500c) != null && (c0570l = c0564f2.f8489d) != null) {
                        str3 = c0570l.f8496b;
                    }
                    w9.setValue(str3);
                    if (l6.d.k((o) w7.getValue(), mainActivity)) {
                        z5 = true;
                    } else {
                        if (m4 != null) {
                            m4.d("");
                        }
                        z5 = false;
                    }
                    L.e(w8, z5);
                    if (((Boolean) w8.getValue()).booleanValue()) {
                        String str4 = c0564f.f8486a;
                        kotlin.jvm.internal.m.b(str4);
                        w10.setValue(str4);
                        String str5 = c0564f.f8487b;
                        if (str5 == null) {
                            str5 = "RIGHT";
                        }
                        w11.setValue(str5);
                        c0348c0.f(kotlin.jvm.internal.m.a((String) w10.getValue(), "FULL_SCREEN") ? 0 : 10);
                        C0570l c0570l2 = c0564f.f8489d;
                        if (c0570l2 == null || (str = c0570l2.f8495a) == null) {
                            str = "IMAGE";
                        }
                        w12.setValue(str);
                        o oVar4 = (o) w7.getValue();
                        kotlin.jvm.internal.m.b(oVar4);
                        C0564f c0564f3 = oVar4.f8500c;
                        kotlin.jvm.internal.m.b(c0564f3);
                        w13.setValue(new j0.o(AbstractC1145B.b(Color.parseColor(c0564f3.f8488c))));
                        String str6 = (String) w10.getValue();
                        boolean zA = kotlin.jvm.internal.m.a(str6, "FULL_SCREEN");
                        O3.D d5 = AbstractC1145B.f13658a;
                        w14.setValue(zA ? androidx.compose.foundation.a.a(Q2.g.k(androidx.compose.foundation.layout.c.f9279c), ((j0.o) w13.getValue()).f13724a, d5) : kotlin.jvm.internal.m.a(str6, "FULL_WIDTH") ? androidx.compose.foundation.a.a(AbstractC0597a.n(Q2.g.k(androidx.compose.foundation.layout.c.b(androidx.compose.foundation.layout.c.f9277a, Float.NaN, i / 2)), H.e.a(7)), ((j0.o) w13.getValue()).f13724a, d5) : androidx.compose.foundation.a.a(AbstractC0597a.n(Q2.g.k(androidx.compose.foundation.layout.c.h()), H.e.a(10)), ((j0.o) w13.getValue()).f13724a, d5));
                    }
                }
            } catch (Exception e7) {
                e7.printStackTrace();
                if (m4 != null) {
                    m4.c(false);
                }
                L.e(w8, false);
            }
        }
        return C1386y.f15098a;
    }
}
