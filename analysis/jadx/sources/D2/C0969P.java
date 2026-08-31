package d2;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: d2.P, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0969P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Interpolator f12011e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12012g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(RecyclerView recyclerView) {
        int i = this.f12010d;
        if (i >= 0) {
            this.f12010d = -1;
            recyclerView.M(i);
            this.f = false;
            return;
        }
        if (!this.f) {
            this.f12012g = 0;
            return;
        }
        Interpolator interpolator = this.f12011e;
        if (interpolator != null && this.f12009c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i7 = this.f12009c;
        if (i7 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f9647p0.b(this.f12007a, this.f12008b, i7, interpolator);
        int i8 = this.f12012g + 1;
        this.f12012g = i8;
        if (i8 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f = false;
    }
}
