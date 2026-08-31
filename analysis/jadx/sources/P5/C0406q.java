package P5;

import q5.InterfaceC1524c;

/* JADX INFO: renamed from: P5.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0406q extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f6427q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6428r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f6429s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public r f6430t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InterfaceC0398i f6431u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Throwable f6432v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f6433w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0406q(r rVar, InterfaceC1524c interfaceC1524c) {
        super(interfaceC1524c);
        this.f6429s = rVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f6427q = obj;
        this.f6428r |= Integer.MIN_VALUE;
        return this.f6429s.collect(null, this);
    }
}
