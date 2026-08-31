package com.google.android.gms.internal.clearcut;

/* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0761u implements N {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0761u f10557b = new C0761u(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10558a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.google.android.gms.internal.clearcut.u.<clinit>():void] */
    public /* synthetic */ C0761u(int i) {
        this.f10558a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.N
    public final X a(Class cls) {
        switch (this.f10558a) {
            case 0:
                if (!AbstractC0764x.class.isAssignableFrom(cls)) {
                    String name = cls.getName();
                    throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
                }
                try {
                    return (X) AbstractC0764x.d(cls.asSubclass(AbstractC0764x.class)).a(3);
                } catch (Exception e7) {
                    String name2 = cls.getName();
                    throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e7);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.N
    public final boolean b(Class cls) {
        switch (this.f10558a) {
            case 0:
                return AbstractC0764x.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
