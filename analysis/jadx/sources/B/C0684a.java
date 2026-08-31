package b;

import C0.S;
import android.window.BackEvent;

/* JADX INFO: renamed from: b.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0684a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9857d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0684a(BackEvent backEvent) {
        float fK = A1.l.k(backEvent);
        float fL = A1.l.l(backEvent);
        float fH = A1.l.h(backEvent);
        int iJ = A1.l.j(backEvent);
        this.f9854a = fK;
        this.f9855b = fL;
        this.f9856c = fH;
        this.f9857d = iJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.f9854a);
        sb.append(", touchY=");
        sb.append(this.f9855b);
        sb.append(", progress=");
        sb.append(this.f9856c);
        sb.append(", swipeEdge=");
        return S.o(sb, this.f9857d, '}');
    }
}
