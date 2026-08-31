package z4;

/* JADX INFO: renamed from: z4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1968b implements InterfaceC1969c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Object f18746s = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile InterfaceC1969c f18747q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile Object f18748r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static InterfaceC1969c a(InterfaceC1969c interfaceC1969c) {
        if (interfaceC1969c instanceof C1968b) {
            return interfaceC1969c;
        }
        C1968b c1968b = new C1968b();
        c1968b.f18748r = f18746s;
        c1968b.f18747q = interfaceC1969c;
        return c1968b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z4.InterfaceC1969c
    public final Object zza() {
        Object objZza;
        Object obj = this.f18748r;
        Object obj2 = f18746s;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objZza = this.f18748r;
                if (objZza == obj2) {
                    objZza = this.f18747q.zza();
                    Object obj3 = this.f18748r;
                    if (obj3 != obj2 && obj3 != objZza) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZza + ". This is likely due to a circular dependency.");
                    }
                    this.f18748r = objZza;
                    this.f18747q = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objZza;
    }
}
