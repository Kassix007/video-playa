package F;

import java.util.List;

/* JADX INFO: renamed from: F.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0149c extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1854q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ List f1855r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0149c(int i, List list) {
        super(0);
        this.f1854q = i;
        this.f1855r = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        switch (this.f1854q) {
            case 0:
                Object obj = this.f1855r.get(2);
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj;
            default:
                return this.f1855r;
        }
    }
}
