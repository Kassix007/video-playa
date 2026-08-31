package f5;

import M5.InterfaceC0261w;
import R4.C0458i;
import R4.C0468k1;
import R4.N;
import R4.O1;
import android.os.Build;
import androidx.lifecycle.J;
import com.google.android.gms.internal.measurement.P1;
import com.web2native.MainActivity;
import j5.C1166c;
import kotlin.jvm.internal.m;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class i extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f12778q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ O1 f12779r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MainActivity f12780s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(C0468k1 c0468k1, O1 o12, MainActivity mainActivity, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f12778q = c0468k1;
        this.f12779r = o12;
        this.f12780s = mainActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new i(this.f12778q, this.f12779r, this.f12780s, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        i iVar = (i) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        iVar.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        J j;
        J j7;
        O1 o12 = this.f12779r;
        String str = o12.f6820b;
        AbstractC1362a.e(obj);
        C0468k1 c0468k1 = this.f12778q;
        C0458i c0458i = c0468k1.f7073d;
        MainActivity mainActivity = c0468k1.f7069b;
        if ((c0458i != null ? m.a(c0458i.f6980E, Boolean.TRUE) : false) || Build.VERSION.SDK_INT < 30) {
            m.b(str);
            MainActivity mainActivity2 = this.f12780s;
            P1.Z(mainActivity2, str, str, true);
            C1166c c1166c = c0468k1.f7097s;
            if (c1166c != null && (j = c1166c.f13864g) != null) {
                j.e(mainActivity, new N(new N5.d(13, mainActivity2, o12), 9));
            }
        } else {
            m.b(str);
            P1.Y(str, str, mainActivity, 8);
            C1166c c1166c2 = c0468k1.f7097s;
            if (c1166c2 != null && (j7 = c1166c2.f13864g) != null) {
                j7.e(mainActivity, new N(new N5.d(12, o12, c0468k1), 9));
            }
        }
        return C1386y.f15098a;
    }
}
