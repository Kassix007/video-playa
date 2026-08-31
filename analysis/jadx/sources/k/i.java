package k;

import m.C1291Y0;
import w1.P;

/* JADX INFO: loaded from: classes.dex */
public final class i extends l6.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13966d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i(j jVar) {
        this.f13963a = 0;
        this.f13966d = jVar;
        this.f13964b = false;
        this.f13965c = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.P
    public final void a() {
        switch (this.f13963a) {
            case 0:
                int i = this.f13965c + 1;
                this.f13965c = i;
                j jVar = (j) this.f13966d;
                if (i == jVar.f13967a.size()) {
                    P p7 = jVar.f13970d;
                    if (p7 != null) {
                        p7.a();
                    }
                    this.f13965c = 0;
                    this.f13964b = false;
                    jVar.f13971e = false;
                }
                break;
            default:
                if (!this.f13964b) {
                    ((C1291Y0) this.f13966d).f14730a.setVisibility(this.f13965c);
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l6.d, w1.P
    public void b() {
        switch (this.f13963a) {
            case 1:
                this.f13964b = true;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l6.d, w1.P
    public final void c() {
        switch (this.f13963a) {
            case 0:
                if (!this.f13964b) {
                    this.f13964b = true;
                    P p7 = ((j) this.f13966d).f13970d;
                    if (p7 != null) {
                        p7.c();
                    }
                    break;
                }
                break;
            default:
                ((C1291Y0) this.f13966d).f14730a.setVisibility(0);
                break;
        }
    }

    public i(C1291Y0 c1291y0, int i) {
        this.f13963a = 1;
        this.f13966d = c1291y0;
        this.f13965c = i;
        this.f13964b = false;
    }
}
