package k6;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l extends g6.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14168e = 1;
    public final /* synthetic */ n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14169g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, n nVar, int i, List list) {
        super(str, true);
        this.f = nVar;
        this.f14169g = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g6.a
    public final long a() {
        switch (this.f14168e) {
            case 0:
                this.f.f14173A.getClass();
                try {
                    this.f.f14185M.v(this.f14169g, 9);
                    synchronized (this.f) {
                        this.f.f14187O.remove(Integer.valueOf(this.f14169g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f.f14173A.getClass();
                try {
                    this.f.f14185M.v(this.f14169g, 9);
                    synchronized (this.f) {
                        this.f.f14187O.remove(Integer.valueOf(this.f14169g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, n nVar, int i, List list, boolean z5) {
        super(str, true);
        this.f = nVar;
        this.f14169g = i;
    }
}
