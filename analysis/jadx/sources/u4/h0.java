package U4;

import M5.AbstractC0263y;
import M5.InterfaceC0261w;
import R4.C0468k1;
import androidx.lifecycle.EnumC0653p;
import com.web2native.MainActivity;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7827q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f7828r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MainActivity f7829s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f7830t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(long j, MainActivity mainActivity, C0468k1 c0468k1, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f7828r = j;
        this.f7829s = mainActivity;
        this.f7830t = c0468k1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new h0(this.f7828r, this.f7829s, this.f7830t, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h0) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f7827q;
        boolean z5 = true;
        if (i == 0) {
            AbstractC1362a.e(obj);
            long j = ((long) 1000) * this.f7828r;
            this.f7827q = 1;
            Object objH = AbstractC0263y.h(j, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objH == enumC1580a) {
                return enumC1580a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
        }
        try {
            if (this.f7829s.getLifecycle().b().compareTo(EnumC0653p.f9559t) < 0) {
                z5 = false;
            }
            if (z5) {
                AbstractC0534a.x(this.f7830t);
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        return C1386y.f15098a;
    }
}
