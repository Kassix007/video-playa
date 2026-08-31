package P5;

import M5.InterfaceC0241b0;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public S f6370q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InterfaceC0398i f6371r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public T f6372s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public InterfaceC0241b0 f6373t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f6374u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f6375v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ S f6376w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6377x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(S s6, InterfaceC1524c interfaceC1524c) {
        super(interfaceC1524c);
        this.f6376w = s6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f6375v = obj;
        this.f6377x |= Integer.MIN_VALUE;
        this.f6376w.collect(null, this);
        return EnumC1580a.f16356q;
    }
}
