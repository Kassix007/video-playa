package R4;

import M5.InterfaceC0261w;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: renamed from: R4.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0491q0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ URL f7158q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f7159r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f7160s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0491q0(URL url, String str, String str2, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f7158q = url;
        this.f7159r = str;
        this.f7160s = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C0491q0(this.f7158q, this.f7159r, this.f7160s, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0491q0) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) throws IOException {
        AbstractC1362a.e(obj);
        URLConnection uRLConnectionOpenConnection = this.f7158q.openConnection();
        String str = this.f7159r;
        if (str != null && !J5.m.U0(str)) {
            uRLConnectionOpenConnection.setRequestProperty("cookie", str);
        }
        String str2 = this.f7160s;
        if (str2 != null && !J5.m.U0(str2)) {
            uRLConnectionOpenConnection.setRequestProperty("userAgent", str2);
        }
        return uRLConnectionOpenConnection.getInputStream();
    }
}
