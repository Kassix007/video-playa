package c5;

import B5.e;
import M5.InterfaceC0261w;
import N5.d;
import R4.C0458i;
import R4.C0468k1;
import R4.N;
import U4.d0;
import android.os.Build;
import androidx.lifecycle.J;
import com.google.android.gms.internal.measurement.P1;
import com.web2native.MainActivity;
import j5.C1166c;
import kotlin.jvm.internal.m;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import s5.i;

/* JADX INFO: renamed from: c5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0735b extends i implements e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f10262q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f10263r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MainActivity f10264s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0735b(C0468k1 c0468k1, String str, MainActivity mainActivity, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f10262q = c0468k1;
        this.f10263r = str;
        this.f10264s = mainActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C0735b(this.f10262q, this.f10263r, this.f10264s, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        C0735b c0735b = (C0735b) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        c0735b.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        J j;
        J j7;
        AbstractC1362a.e(obj);
        C0468k1 c0468k1 = this.f10262q;
        C0458i c0458i = c0468k1.f7073d;
        MainActivity mainActivity = c0468k1.f7069b;
        boolean zA = c0458i != null ? m.a(c0458i.f6980E, Boolean.TRUE) : false;
        String str = this.f10263r;
        if (zA || Build.VERSION.SDK_INT < 30) {
            MainActivity mainActivity2 = this.f10264s;
            P1.Z(mainActivity2, str, str, true);
            C1166c c1166c = c0468k1.f7097s;
            if (c1166c != null && (j = c1166c.f13864g) != null) {
                j.e(mainActivity, new N(new d(10, mainActivity2, str), 8));
            }
        } else {
            P1.Y(str, str, mainActivity, 8);
            C1166c c1166c2 = c0468k1.f7097s;
            if (c1166c2 != null && (j7 = c1166c2.f13864g) != null) {
                j7.e(mainActivity, new N(new d0(c0468k1, str, 2), 8));
            }
        }
        return C1386y.f15098a;
    }
}
