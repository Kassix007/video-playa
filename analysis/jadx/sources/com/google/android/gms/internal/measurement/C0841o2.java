package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0841o2 implements J2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0841o2 f11003r = new C0841o2(0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f11004q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.google.android.gms.internal.measurement.F2.<clinit>():void, com.google.android.gms.internal.measurement.o2.<clinit>():void] */
    public /* synthetic */ C0841o2(int i) {
        this.f11004q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final H2 c(Object obj, Object obj2) {
        H2 h2A = (H2) obj;
        H2 h22 = (H2) obj2;
        if (!h22.isEmpty()) {
            if (!h2A.f10644q) {
                h2A = h2A.a();
            }
            h2A.c();
            if (!h22.isEmpty()) {
                h2A.putAll(h22);
            }
        }
        return h2A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J2
    public boolean a(Class cls) {
        switch (this.f11004q) {
            case 0:
                return AbstractC0851q2.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.J2
    public R2 b(Class cls) {
        switch (this.f11004q) {
            case 0:
                if (!AbstractC0851q2.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (R2) AbstractC0851q2.l(cls.asSubclass(AbstractC0851q2.class)).o(3);
                } catch (Exception e7) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
