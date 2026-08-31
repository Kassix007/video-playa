package O5;

import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class c extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f5213q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f5214r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f5215s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, s5.c cVar) {
        super(cVar);
        this.f5214r = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f5213q = obj;
        this.f5215s |= Integer.MIN_VALUE;
        Object objC = e.C(this.f5214r, this);
        return objC == EnumC1580a.f16356q ? objC : new l(objC);
    }
}
