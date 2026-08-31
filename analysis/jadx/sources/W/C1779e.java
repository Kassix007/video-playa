package w;

/* JADX INFO: renamed from: w.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1779e implements InterfaceC1775c {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w.InterfaceC1775c
    public final float a(float f, float f7, float f8) {
        float fAbs = Math.abs((f7 + f) - f);
        float f9 = (0.3f * f8) - (0.0f * fAbs);
        float f10 = f8 - f9;
        if ((fAbs <= f8) && f10 < fAbs) {
            f9 = f8 - fAbs;
        }
        return f - f9;
    }
}
