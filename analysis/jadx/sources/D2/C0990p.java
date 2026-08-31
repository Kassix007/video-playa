package d2;

import android.view.View;

/* JADX INFO: renamed from: d2.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0990p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public E1.g f12180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12184e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0990p() {
        d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        this.f12182c = this.f12183d ? this.f12180a.g() : this.f12180a.k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(View view, int i) {
        if (this.f12183d) {
            int iB = this.f12180a.b(view);
            E1.g gVar = this.f12180a;
            this.f12182c = (Integer.MIN_VALUE == gVar.f1632a ? 0 : gVar.l() - gVar.f1632a) + iB;
        } else {
            this.f12182c = this.f12180a.e(view);
        }
        this.f12181b = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(View view, int i) {
        E1.g gVar = this.f12180a;
        int iL = Integer.MIN_VALUE == gVar.f1632a ? 0 : gVar.l() - gVar.f1632a;
        if (iL >= 0) {
            b(view, i);
            return;
        }
        this.f12181b = i;
        if (!this.f12183d) {
            int iE = this.f12180a.e(view);
            int iK = iE - this.f12180a.k();
            this.f12182c = iE;
            if (iK > 0) {
                int iG = (this.f12180a.g() - Math.min(0, (this.f12180a.g() - iL) - this.f12180a.b(view))) - (this.f12180a.c(view) + iE);
                if (iG < 0) {
                    this.f12182c -= Math.min(iK, -iG);
                    return;
                }
                return;
            }
            return;
        }
        int iG2 = (this.f12180a.g() - iL) - this.f12180a.b(view);
        this.f12182c = this.f12180a.g() - iG2;
        if (iG2 > 0) {
            int iC = this.f12182c - this.f12180a.c(view);
            int iK2 = this.f12180a.k();
            int iMin = iC - (Math.min(this.f12180a.e(view) - iK2, 0) + iK2);
            if (iMin < 0) {
                this.f12182c = Math.min(iG2, -iMin) + this.f12182c;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        this.f12181b = -1;
        this.f12182c = Integer.MIN_VALUE;
        this.f12183d = false;
        this.f12184e = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f12181b + ", mCoordinate=" + this.f12182c + ", mLayoutFromEnd=" + this.f12183d + ", mValid=" + this.f12184e + '}';
    }
}
