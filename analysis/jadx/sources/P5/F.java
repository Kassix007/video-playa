package P5;

import M5.InterfaceC0241b0;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class F extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public G f6339q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InterfaceC0398i f6340r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public I f6341s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public InterfaceC0241b0 f6342t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f6343u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ G f6344v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f6345w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(G g7, InterfaceC1524c interfaceC1524c) {
        super(interfaceC1524c);
        this.f6344v = g7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f6343u = obj;
        this.f6345w |= Integer.MIN_VALUE;
        G.h(this.f6344v, null, this);
        return EnumC1580a.f16356q;
    }
}
