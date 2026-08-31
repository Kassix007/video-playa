package p4;

import android.graphics.Typeface;
import com.google.android.gms.internal.measurement.K1;

/* JADX INFO: renamed from: p4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1481b extends m1.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ K1 f15883h;
    public final /* synthetic */ C1483d i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1481b(C1483d c1483d, K1 k12) {
        this.i = c1483d;
        this.f15883h = k12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m1.b
    public final void h(int i) {
        this.i.f15896m = true;
        this.f15883h.A(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m1.b
    public final void i(Typeface typeface) {
        C1483d c1483d = this.i;
        c1483d.f15897n = Typeface.create(typeface, c1483d.f15889c);
        c1483d.f15896m = true;
        this.f15883h.B(c1483d.f15897n, false);
    }
}
