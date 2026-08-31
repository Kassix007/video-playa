package a0;

/* JADX INFO: loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8677q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.n f8678r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: B5.c */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(B5.c cVar, int i) {
        super(1);
        this.f8677q = i;
        switch (i) {
            case 1:
                this.f8678r = (kotlin.jvm.internal.n) cVar;
                super(1);
                break;
            default:
                this.f8678r = (kotlin.jvm.internal.n) cVar;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v1, types: [B5.c, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r5v6, types: [B5.c, kotlin.jvm.internal.n] */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f8677q) {
            case 0:
                AbstractC0606h abstractC0606h = (AbstractC0606h) this.f8678r.invoke((l) obj);
                synchronized (n.f8680b) {
                    n.f8681c = n.f8681c.j(abstractC0606h.g());
                }
                return abstractC0606h;
            default:
                return this.f8678r.invoke(Long.valueOf(((Number) obj).longValue()));
        }
    }
}
