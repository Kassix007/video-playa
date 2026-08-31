package b5;

import B5.e;
import M5.InterfaceC0261w;
import R4.C0458i;
import R4.C0468k1;
import R4.J0;
import U4.C0548o;
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

/* JADX INFO: renamed from: b5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0701b extends i implements e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f10013q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0701b(C0468k1 c0468k1, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f10013q = c0468k1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C0701b(this.f10013q, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        C0701b c0701b = (C0701b) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        c0701b.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        J j;
        AbstractC1362a.e(obj);
        C0468k1 c0468k1 = this.f10013q;
        C0458i c0458i = c0468k1.f7073d;
        MainActivity mainActivity = c0468k1.f7069b;
        if ((c0458i != null ? m.a(c0458i.f6980E, Boolean.TRUE) : false) || Build.VERSION.SDK_INT < 30) {
            P1.Z(c0468k1.f7067a, "#ffffff", "#000000", true);
        } else {
            P1.Y("#000000", "#ffffff", mainActivity, 8);
        }
        C1166c c1166c = c0468k1.f7097s;
        if (c1166c != null && (j = c1166c.f13864g) != null) {
            j.e(mainActivity, new J0(new C0548o(c0468k1, 6), 4));
        }
        return C1386y.f15098a;
    }
}
