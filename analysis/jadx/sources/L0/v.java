package L0;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Z.l {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.n f3204q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.n f3205r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: B5.e */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: B5.c */
    /* JADX WARN: Multi-variable type inference failed */
    public v(B5.e eVar, B5.c cVar) {
        this.f3204q = (kotlin.jvm.internal.n) eVar;
        this.f3205r = (kotlin.jvm.internal.n) cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v0, types: [B5.e, kotlin.jvm.internal.n] */
    @Override // Z.l
    public final Object b(Z.b bVar, Object obj) {
        return this.f3204q.invoke(bVar, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v0, types: [B5.c, kotlin.jvm.internal.n] */
    @Override // Z.l
    public final Object d(Object obj) {
        return this.f3205r.invoke(obj);
    }
}
