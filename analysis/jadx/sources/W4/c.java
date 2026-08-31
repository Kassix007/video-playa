package W4;

import B5.e;
import M5.InterfaceC0261w;
import P.C0348c0;
import P.W;
import R4.C0458i;
import R4.C0468k1;
import R4.J2;
import R4.N;
import androidx.lifecycle.J;
import k5.C1190b;
import kotlin.jvm.internal.m;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import s5.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f8126q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0348c0 f8127r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ W f8128s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ W f8129t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C0468k1 c0468k1, C0348c0 c0348c0, W w3, W w6, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f8126q = c0468k1;
        this.f8127r = c0348c0;
        this.f8128s = w3;
        this.f8129t = w6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new c(this.f8126q, this.f8127r, this.f8128s, this.f8129t, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        c cVar = (c) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        cVar.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        C1190b c1190b;
        J j;
        J2 j22;
        AbstractC1362a.e(obj);
        C0468k1 c0468k1 = this.f8126q;
        C0458i c0458i = c0468k1.f7073d;
        if ((c0458i != null ? c0458i.f7002e : null) != null) {
            if (((c0458i == null || (j22 = c0458i.f7002e) == null) ? false : m.a(j22.f6781a, Boolean.TRUE)) && (c1190b = c0468k1.f7086l) != null && (j = c1190b.f14129c) != null) {
                j.e(c0468k1.f7069b, new N(new W1.e(c0468k1, this.f8127r, this.f8128s, this.f8129t, 1), 6));
            }
        }
        return C1386y.f15098a;
    }
}
