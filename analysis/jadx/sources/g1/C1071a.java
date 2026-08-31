package g1;

import d1.C0950a;
import d1.C0953d;

/* JADX INFO: renamed from: g1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1071a extends AbstractC1073c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12824x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12825y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0950a f12826z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean getAllowsGoneWidget() {
        return this.f12826z.f11800t0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getMargin() {
        return this.f12826z.f11801u0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getType() {
        return this.f12824x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g1.AbstractC1073c
    public final void h(C0953d c0953d, boolean z5) {
        int i = this.f12824x;
        this.f12825y = i;
        if (z5) {
            if (i == 5) {
                this.f12825y = 1;
            } else if (i == 6) {
                this.f12825y = 0;
            }
        } else if (i == 5) {
            this.f12825y = 0;
        } else if (i == 6) {
            this.f12825y = 1;
        }
        if (c0953d instanceof C0950a) {
            ((C0950a) c0953d).f11799s0 = this.f12825y;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setAllowsGoneWidget(boolean z5) {
        this.f12826z.f11800t0 = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setDpMargin(int i) {
        this.f12826z.f11801u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMargin(int i) {
        this.f12826z.f11801u0 = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setType(int i) {
        this.f12824x = i;
    }
}
