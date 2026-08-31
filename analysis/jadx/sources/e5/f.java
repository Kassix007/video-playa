package e5;

import M5.InterfaceC0261w;
import P.W;
import R4.C0458i;
import R4.C0468k1;
import R4.J0;
import U4.C0539f;
import android.os.Build;
import androidx.lifecycle.J;
import com.google.android.gms.internal.measurement.P1;
import j5.C1166c;
import kotlin.jvm.internal.m;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class f extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f12659q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ W f12660r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C0468k1 c0468k1, W w3, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f12659q = c0468k1;
        this.f12660r = w3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new f(this.f12659q, this.f12660r, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        f fVar = (f) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        fVar.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        C1166c c1166c;
        J j;
        C0468k1 c0468k1 = this.f12659q;
        W w3 = this.f12660r;
        AbstractC1362a.e(obj);
        try {
            if (((String) w3.getValue()) != null && !m.a((String) w3.getValue(), "")) {
                C0458i c0458i = c0468k1.f7073d;
                if ((c0458i != null ? m.a(c0458i.f6980E, Boolean.TRUE) : false) || Build.VERSION.SDK_INT < 30) {
                    P1.Z(c0468k1.f7067a, String.valueOf((String) w3.getValue()), null, false);
                } else {
                    P1.Y(null, String.valueOf((String) w3.getValue()), c0468k1.f7069b, 9);
                }
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        String str = (String) w3.getValue();
        if (!(str == null || str.length() == 0) && (c1166c = c0468k1.f7097s) != null && (j = c1166c.f13864g) != null) {
            j.e(c0468k1.f7069b, new J0(new C0539f(c0468k1, w3, 2), 6));
        }
        return C1386y.f15098a;
    }
}
