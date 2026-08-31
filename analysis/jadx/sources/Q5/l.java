package Q5;

import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class l extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public m f6624q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f6625r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f6626s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m f6627t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f6628u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, InterfaceC1524c interfaceC1524c) {
        super(interfaceC1524c);
        this.f6627t = mVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f6626s = obj;
        this.f6628u |= Integer.MIN_VALUE;
        return this.f6627t.emit(null, this);
    }
}
