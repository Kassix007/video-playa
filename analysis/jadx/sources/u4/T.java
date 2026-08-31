package U4;

import M5.InterfaceC0261w;
import R4.C0458i;
import R4.C0468k1;
import R4.F1;
import android.os.Build;
import com.google.android.gms.internal.measurement.P1;
import com.web2native.MainActivity;
import j5.C1166c;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class T extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f7770q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ F1 f7771r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(C0468k1 c0468k1, F1 f12, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f7770q = c0468k1;
        this.f7771r = f12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new T(this.f7770q, this.f7771r, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        T t6 = (T) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        t6.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.J j;
        androidx.lifecycle.J j7;
        F1 f12 = this.f7771r;
        String str = f12.f6755a;
        AbstractC1362a.e(obj);
        C0468k1 c0468k1 = this.f7770q;
        C0458i c0458i = c0468k1.f7073d;
        MainActivity mainActivity = c0468k1.f7069b;
        if ((c0458i != null ? kotlin.jvm.internal.m.a(c0458i.f6980E, Boolean.TRUE) : false) || Build.VERSION.SDK_INT < 30) {
            MainActivity mainActivity2 = c0468k1.f7067a;
            kotlin.jvm.internal.m.b(str);
            kotlin.jvm.internal.m.b(str);
            P1.Z(mainActivity2, str, str, true);
            C1166c c1166c = c0468k1.f7097s;
            if (c1166c != null && (j = c1166c.f13864g) != null) {
                j.e(mainActivity, new R4.N(new S(c0468k1, f12), 4));
            }
        } else {
            kotlin.jvm.internal.m.b(str);
            P1.Y(str, str, mainActivity, 8);
            C1166c c1166c2 = c0468k1.f7097s;
            if (c1166c2 != null && (j7 = c1166c2.f13864g) != null) {
                j7.e(mainActivity, new R4.N(new S(f12, c0468k1), 4));
            }
        }
        return C1386y.f15098a;
    }
}
