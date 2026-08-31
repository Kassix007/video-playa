package P5;

import q5.InterfaceC1524c;
import u2.C1692m;

/* JADX INFO: renamed from: P5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0390a extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Q5.y f6382q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6383r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1692m f6384s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6385t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0390a(C1692m c1692m, InterfaceC1524c interfaceC1524c) {
        super(interfaceC1524c);
        this.f6384s = c1692m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f6383r = obj;
        this.f6385t |= Integer.MIN_VALUE;
        return this.f6384s.collect(null, this);
    }
}
