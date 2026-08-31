package R4;

import M5.AbstractC0263y;
import M5.InterfaceC0261w;
import java.io.InputStream;
import java.net.URL;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: renamed from: R4.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0494r0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7170q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f7171r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f7172s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0498s0 f7173t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f7174u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f7175v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f7176w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0494r0(String str, String str2, C0498s0 c0498s0, String str3, String str4, String str5, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f7171r = str;
        this.f7172s = str2;
        this.f7173t = c0498s0;
        this.f7174u = str3;
        this.f7175v = str4;
        this.f7176w = str5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C0494r0(this.f7171r, this.f7172s, this.f7173t, this.f7174u, this.f7175v, this.f7176w, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0494r0) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        String str = this.f7172s;
        int i = this.f7170q;
        try {
            if (i == 0) {
                AbstractC1362a.e(obj);
                URL url = new URL(this.f7171r);
                T5.e eVar = M5.H.f3811a;
                T5.d dVar = T5.d.f7468q;
                C0491q0 c0491q0 = new C0491q0(url, this.f7175v, this.f7176w, null);
                this.f7170q = 1;
                obj = AbstractC0263y.B(dVar, c0491q0, this);
                EnumC1580a enumC1580a = EnumC1580a.f16356q;
                if (obj == enumC1580a) {
                    return enumC1580a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1362a.e(obj);
            }
            kotlin.jvm.internal.m.d(obj, "withContext(...)");
            InputStream inputStream = (InputStream) obj;
            if (J5.m.K0(str, ";")) {
                str = (String) J5.m.d1(str, new String[]{";"}).get(0);
            }
            C0498s0 c0498s0 = this.f7173t;
            C0498s0.e(c0498s0, c0498s0.f7180a, inputStream, null, str, this.f7174u, 4);
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        return C1386y.f15098a;
    }
}
