package c;

import M5.InterfaceC0261w;
import com.google.android.gms.internal.measurement.O1;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: renamed from: c.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0711i extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0710h f10066q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f10067r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0711i(C0710h c0710h, boolean z5, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f10066q = c0710h;
        this.f10067r = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C0711i(this.f10066q, this.f10067r, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        C0711i c0711i = (C0711i) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        c0711i.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [B5.a, kotlin.jvm.internal.k] */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        O1 o12;
        AbstractC1362a.e(obj);
        C0710h c0710h = this.f10066q;
        boolean z5 = this.f10067r;
        if (!z5 && !c0710h.f10065g && c0710h.f9909a && (o12 = c0710h.f) != null) {
            o12.b();
        }
        c0710h.f9909a = z5;
        ?? r3 = c0710h.f9911c;
        if (r3 != 0) {
            r3.invoke();
        }
        return C1386y.f15098a;
    }
}
