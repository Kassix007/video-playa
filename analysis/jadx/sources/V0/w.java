package v0;

import M5.B;

/* JADX INFO: loaded from: classes.dex */
public final class w extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public B f17497q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f17498r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y f17499s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f17500t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, s5.c cVar) {
        super(cVar);
        this.f17499s = yVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f17498r = obj;
        this.f17500t |= Integer.MIN_VALUE;
        return this.f17499s.h(0L, null, this);
    }
}
