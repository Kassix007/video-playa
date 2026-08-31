package B0;

/* JADX INFO: renamed from: B0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0037e implements A0.g {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f408q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int a(int i, long j) {
        int i7 = C0.f219b;
        return ((int) (j >> (i * 15))) & 32767;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int b() {
        switch (this.f408q) {
            case 1:
                return 16;
            default:
                return 8;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v1, types: [B5.a, kotlin.jvm.internal.n] */
    @Override // A0.g
    public Object e(A0.h hVar) {
        return hVar.f170a.invoke();
    }
}
