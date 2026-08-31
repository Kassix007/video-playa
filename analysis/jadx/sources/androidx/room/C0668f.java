package androidx.room;

import M5.AbstractC0263y;
import P5.InterfaceC0398i;
import java.util.concurrent.Callable;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: renamed from: androidx.room.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0668f extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9728q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f9729r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f9730s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w f9731t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String[] f9732u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Callable f9733v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0668f(boolean z5, w wVar, String[] strArr, Callable callable, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f9730s = z5;
        this.f9731t = wVar;
        this.f9732u = strArr;
        this.f9733v = callable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        C0668f c0668f = new C0668f(this.f9730s, this.f9731t, this.f9732u, this.f9733v, interfaceC1524c);
        c0668f.f9729r = obj;
        return c0668f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0668f) create((InterfaceC0398i) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f9728q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            C0667e c0667e = new C0667e(this.f9730s, this.f9731t, (InterfaceC0398i) this.f9729r, this.f9732u, this.f9733v, null);
            this.f9728q = 1;
            Object objG = AbstractC0263y.g(c0667e, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objG == enumC1580a) {
                return enumC1580a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
        }
        return C1386y.f15098a;
    }
}
