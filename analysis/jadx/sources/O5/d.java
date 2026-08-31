package O5;

import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class d extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f5216q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f5217r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f5218s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, s5.c cVar) {
        super(cVar);
        this.f5217r = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f5216q = obj;
        this.f5218s |= Integer.MIN_VALUE;
        Object objD = this.f5217r.D(null, 0, 0L, this);
        return objD == EnumC1580a.f16356q ? objD : new l(objD);
    }
}
