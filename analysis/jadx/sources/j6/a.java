package j6;

import java.io.IOException;
import kotlin.jvm.internal.m;
import q6.C1538g;
import q6.G;
import q6.I;
import q6.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements G {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p f13893q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f13894r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f13895s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(f fVar) {
        this.f13895s = fVar;
        this.f13893q = new p(fVar.f13908c.d());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.G
    public long F(long j, C1538g sink) throws IOException {
        f fVar = this.f13895s;
        m.e(sink, "sink");
        try {
            return fVar.f13908c.F(j, sink);
        } catch (IOException e7) {
            fVar.f13907b.k();
            a();
            throw e7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        f fVar = this.f13895s;
        int i = fVar.f13910e;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + fVar.f13910e);
        }
        p pVar = this.f13893q;
        I i7 = pVar.f16076e;
        pVar.f16076e = I.f16040d;
        i7.a();
        i7.b();
        fVar.f13910e = 6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.G
    public final I d() {
        return this.f13893q;
    }
}
