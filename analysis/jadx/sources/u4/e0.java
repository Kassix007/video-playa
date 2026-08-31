package U4;

import M5.InterfaceC0261w;
import R4.C0458i;
import R4.C0468k1;
import android.os.Build;
import com.google.android.gms.internal.measurement.P1;
import com.web2native.MainActivity;
import com.wnapp.smspariaz.R;
import j5.C1166c;
import java.util.Arrays;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f7815q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(C0468k1 c0468k1, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f7815q = c0468k1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new e0(this.f7815q, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        e0 e0Var = (e0) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        e0Var.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.J j;
        androidx.lifecycle.J j7;
        AbstractC1362a.e(obj);
        C0468k1 c0468k1 = this.f7815q;
        MainActivity mainActivity = c0468k1.f7067a;
        MainActivity mainActivity2 = c0468k1.f7067a;
        MainActivity mainActivity3 = c0468k1.f7069b;
        String str = String.format("#%06X", Arrays.copyOf(new Object[]{new Integer(mainActivity.getColor(R.color.splash_bg_color) & 16777215)}, 1));
        if (c0468k1.f7053M.b()) {
            mainActivity2.runOnUiThread(new G(c0468k1, 2));
        }
        C0458i c0458i = c0468k1.f7073d;
        if ((c0458i != null ? kotlin.jvm.internal.m.a(c0458i.f6980E, Boolean.TRUE) : false) || Build.VERSION.SDK_INT < 30) {
            P1.Z(mainActivity2, str, str, true);
            C1166c c1166c = c0468k1.f7097s;
            if (c1166c != null && (j = c1166c.f13864g) != null) {
                j.e(mainActivity3, new R4.N(new d0(c0468k1, str, 1), 5));
            }
        } else {
            P1.X(str, str, mainActivity3, true);
            C1166c c1166c2 = c0468k1.f7097s;
            if (c1166c2 != null && (j7 = c1166c2.f13864g) != null) {
                j7.e(mainActivity3, new R4.N(new d0(c0468k1, str, 0), 5));
            }
        }
        return C1386y.f15098a;
    }
}
