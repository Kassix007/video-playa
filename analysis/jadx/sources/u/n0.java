package u;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements InterfaceC1652h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B0 f16997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z.m f16998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f16999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f17000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AbstractC1663q f17001e;
    public AbstractC1663q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AbstractC1663q f17002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f17003h;
    public AbstractC1663q i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n0(InterfaceC1657k interfaceC1657k, Z.m mVar, Object obj, Object obj2, AbstractC1663q abstractC1663q) {
        this.f16997a = interfaceC1657k.a(mVar);
        this.f16998b = mVar;
        this.f16999c = obj2;
        this.f17000d = obj;
        this.f17001e = (AbstractC1663q) ((B5.c) mVar.f8313s).invoke(obj);
        B5.c cVar = (B5.c) mVar.f8313s;
        this.f = (AbstractC1663q) cVar.invoke(obj2);
        this.f17002g = abstractC1663q != null ? AbstractC1644d.j(abstractC1663q) : ((AbstractC1663q) cVar.invoke(obj)).c();
        this.f17003h = -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.InterfaceC1652h
    public final boolean a() {
        return this.f16997a.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.InterfaceC1652h
    public final Object b(long j) {
        if (g(j)) {
            return this.f16999c;
        }
        AbstractC1663q abstractC1663qG = this.f16997a.g(j, this.f17001e, this.f, this.f17002g);
        int iB = abstractC1663qG.b();
        for (int i = 0; i < iB; i++) {
            if (Float.isNaN(abstractC1663qG.a(i))) {
                AbstractC1637P.b("AnimationVector cannot contain a NaN. " + abstractC1663qG + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return ((B5.c) this.f16998b.f8312r).invoke(abstractC1663qG);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.InterfaceC1652h
    public final long c() {
        if (this.f17003h < 0) {
            this.f17003h = this.f16997a.b(this.f17001e, this.f, this.f17002g);
        }
        return this.f17003h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.InterfaceC1652h
    public final Z.m d() {
        return this.f16998b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.InterfaceC1652h
    public final Object e() {
        return this.f16999c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.InterfaceC1652h
    public final AbstractC1663q f(long j) {
        if (!g(j)) {
            return this.f16997a.n(j, this.f17001e, this.f, this.f17002g);
        }
        AbstractC1663q abstractC1663q = this.i;
        if (abstractC1663q != null) {
            return abstractC1663q;
        }
        AbstractC1663q abstractC1663qP = this.f16997a.p(this.f17001e, this.f, this.f17002g);
        this.i = abstractC1663qP;
        return abstractC1663qP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(Object obj) {
        if (kotlin.jvm.internal.m.a(obj, this.f17000d)) {
            return;
        }
        this.f17000d = obj;
        this.f17001e = (AbstractC1663q) ((B5.c) this.f16998b.f8313s).invoke(obj);
        this.i = null;
        this.f17003h = -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(Object obj) {
        if (kotlin.jvm.internal.m.a(this.f16999c, obj)) {
            return;
        }
        this.f16999c = obj;
        this.f = (AbstractC1663q) ((B5.c) this.f16998b.f8313s).invoke(obj);
        this.i = null;
        this.f17003h = -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TargetBasedAnimation: " + this.f17000d + " -> " + this.f16999c + ",initial velocity: " + this.f17002g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.f16997a;
    }
}
