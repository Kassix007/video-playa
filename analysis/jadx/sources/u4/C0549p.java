package U4;

import M5.InterfaceC0261w;
import R4.C0458i;
import R4.C0468k1;
import R4.J0;
import android.os.Build;
import com.google.android.gms.internal.measurement.P1;
import com.web2native.MainActivity;
import j5.C1166c;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: renamed from: U4.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0549p extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f7849q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0549p(C0468k1 c0468k1, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f7849q = c0468k1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C0549p(this.f7849q, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        C0549p c0549p = (C0549p) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        c0549p.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.J j;
        AbstractC1362a.e(obj);
        C0468k1 c0468k1 = this.f7849q;
        C0458i c0458i = c0468k1.f7073d;
        MainActivity mainActivity = c0468k1.f7069b;
        if ((c0458i != null ? kotlin.jvm.internal.m.a(c0458i.f6980E, Boolean.TRUE) : false) || Build.VERSION.SDK_INT < 30) {
            P1.Z(c0468k1.f7067a, "#ffffff", "#000000", true);
        } else {
            P1.Y("#000000", "#ffffff", mainActivity, 8);
        }
        C1166c c1166c = c0468k1.f7097s;
        if (c1166c != null && (j = c1166c.f13864g) != null) {
            j.e(mainActivity, new J0(new C0548o(c0468k1, 0), 2));
        }
        return C1386y.f15098a;
    }
}
