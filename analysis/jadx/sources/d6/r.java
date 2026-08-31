package d6;

/* JADX INFO: loaded from: classes.dex */
public enum r {
    HTTP_1_0(0),
    HTTP_1_1(1),
    SPDY_3(2),
    HTTP_2(3),
    H2_PRIOR_KNOWLEDGE(4),
    QUIC(5);


    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f12412q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    r(int i) {
        this.f12412q = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Enum
    public final String toString() {
        return this.f12412q;
    }
}
