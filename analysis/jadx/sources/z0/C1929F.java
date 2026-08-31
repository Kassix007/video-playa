package z0;

import r.V;

/* JADX INFO: renamed from: z0.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1929F implements U, InterfaceC1950j {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C1929F f18659r = new C1929F(0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f18660q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [z0.F.<clinit>():void] */
    public /* synthetic */ C1929F(int i) {
        this.f18660q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1950j
    public long a(long j, long j7) {
        switch (this.f18660q) {
            case 1:
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                int i = AbstractC1937N.f18675a;
                return jFloatToRawIntBits;
            case 2:
                float fC = AbstractC1938O.c(j, j7);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fC)) << 32) | (((long) Float.floatToRawIntBits(fC)) & 4294967295L);
                int i7 = AbstractC1937N.f18675a;
                return jFloatToRawIntBits2;
            default:
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j7 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j7 & 4294967295L))) {
                    long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                    int i8 = AbstractC1937N.f18675a;
                    return jFloatToRawIntBits3;
                }
                float fC2 = AbstractC1938O.c(j, j7);
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fC2)) << 32) | (((long) Float.floatToRawIntBits(fC2)) & 4294967295L);
                int i9 = AbstractC1937N.f18675a;
                return jFloatToRawIntBits4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.U
    public void b(V v6) {
        v6.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.U
    public boolean f(Object obj, Object obj2) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f18660q) {
            case 4:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
