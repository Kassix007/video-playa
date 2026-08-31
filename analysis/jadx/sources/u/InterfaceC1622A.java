package u;

/* JADX INFO: renamed from: u.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1622A extends InterfaceC1657k {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.InterfaceC1657k
    default B0 a(Z.m mVar) {
        return new E.c0(this);
    }

    float b(long j, float f, float f7, float f8);

    float c(long j, float f, float f7, float f8);

    long d(float f, float f7, float f8);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default float e(float f, float f7, float f8) {
        return c(d(f, f7, f8), f, f7, f8);
    }
}
