package e3;

import a3.C0632k;

/* JADX INFO: loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f12603q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f12604r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i) {
        super(0);
        this.f12603q = i;
        this.f12604r = oVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        switch (this.f12603q) {
            case 0:
                o oVar = this.f12604r;
                return Boolean.valueOf((((C0632k) oVar.f12606r.getValue()) == null && ((Throwable) oVar.f12607s.getValue()) == null) ? false : true);
            case 1:
                return Boolean.valueOf(((Throwable) this.f12604r.f12607s.getValue()) != null);
            case 2:
                o oVar2 = this.f12604r;
                return Boolean.valueOf(((C0632k) oVar2.f12606r.getValue()) == null && ((Throwable) oVar2.f12607s.getValue()) == null);
            default:
                return Boolean.valueOf(((C0632k) this.f12604r.f12606r.getValue()) != null);
        }
    }
}
