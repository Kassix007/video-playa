package q6;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f16028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16032e;
    public B f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public B f16033g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public B() {
        this.f16028a = new byte[8192];
        this.f16032e = true;
        this.f16031d = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final B a() {
        B b7 = this.f;
        if (b7 == this) {
            b7 = null;
        }
        B b8 = this.f16033g;
        kotlin.jvm.internal.m.b(b8);
        b8.f = this.f;
        B b9 = this.f;
        kotlin.jvm.internal.m.b(b9);
        b9.f16033g = this.f16033g;
        this.f = null;
        this.f16033g = null;
        return b7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(B segment) {
        kotlin.jvm.internal.m.e(segment, "segment");
        segment.f16033g = this;
        segment.f = this.f;
        B b7 = this.f;
        kotlin.jvm.internal.m.b(b7);
        b7.f16033g = segment;
        this.f = segment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final B c() {
        this.f16031d = true;
        return new B(this.f16028a, this.f16029b, this.f16030c, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(B sink, int i) {
        kotlin.jvm.internal.m.e(sink, "sink");
        byte[] bArr = sink.f16028a;
        if (!sink.f16032e) {
            throw new IllegalStateException("only owner can write");
        }
        int i7 = sink.f16030c;
        int i8 = i7 + i;
        if (i8 > 8192) {
            if (sink.f16031d) {
                throw new IllegalArgumentException();
            }
            int i9 = sink.f16029b;
            if (i8 - i9 > 8192) {
                throw new IllegalArgumentException();
            }
            n5.k.B0(0, i9, i7, bArr, bArr);
            sink.f16030c -= sink.f16029b;
            sink.f16029b = 0;
        }
        int i10 = sink.f16030c;
        int i11 = this.f16029b;
        n5.k.B0(i10, i11, i11 + i, this.f16028a, bArr);
        sink.f16030c += i;
        this.f16029b += i;
    }

    public B(byte[] data, int i, int i7, boolean z5) {
        kotlin.jvm.internal.m.e(data, "data");
        this.f16028a = data;
        this.f16029b = i;
        this.f16030c = i7;
        this.f16031d = z5;
        this.f16032e = false;
    }
}
