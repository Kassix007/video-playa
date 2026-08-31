package w;

/* JADX INFO: renamed from: w.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1775c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1773b f17931a = C1773b.f17918a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default float a(float f, float f7, float f8) {
        f17931a.getClass();
        float f9 = f7 + f;
        if ((f >= 0.0f && f9 <= f8) || (f < 0.0f && f9 > f8)) {
            return 0.0f;
        }
        float f10 = f9 - f8;
        return Math.abs(f) < Math.abs(f10) ? f : f10;
    }
}
