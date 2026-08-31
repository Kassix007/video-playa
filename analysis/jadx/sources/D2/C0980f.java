package d2;

/* JADX INFO: renamed from: d2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0980f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC0974V f12106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC0974V f12107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12110e;
    public int f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
        sb.append(this.f12106a);
        sb.append(", newHolder=");
        sb.append(this.f12107b);
        sb.append(", fromX=");
        sb.append(this.f12108c);
        sb.append(", fromY=");
        sb.append(this.f12109d);
        sb.append(", toX=");
        sb.append(this.f12110e);
        sb.append(", toY=");
        return C0.S.o(sb, this.f, '}');
    }
}
