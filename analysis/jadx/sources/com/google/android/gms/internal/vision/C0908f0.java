package com.google.android.gms.internal.vision;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0908f0 implements B0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0908f0 f11267b = new C0908f0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11268a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.google.android.gms.internal.vision.f0.<clinit>():void] */
    public /* synthetic */ C0908f0(int i) {
        this.f11268a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.B0
    public final J0 a(Class cls) {
        switch (this.f11268a) {
            case 0:
                if (!AbstractC0906e0.class.isAssignableFrom(cls)) {
                    String name = cls.getName();
                    throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
                }
                try {
                    return (J0) AbstractC0906e0.d(cls.asSubclass(AbstractC0906e0.class)).e(3);
                } catch (Exception e7) {
                    String name2 = cls.getName();
                    throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e7);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.B0
    public final boolean b(Class cls) {
        switch (this.f11268a) {
            case 0:
                return AbstractC0906e0.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
