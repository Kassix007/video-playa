package y4;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f18650b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final m a() {
        if (this.f18650b == 3) {
            return new m(this.f18649a);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f18650b & 1) == 0) {
            sb.append(" appUpdateType");
        }
        if ((this.f18650b & 2) == 0) {
            sb.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
