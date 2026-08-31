package v;

import android.content.Context;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
public final class K extends EdgeEffect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f17253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f17254b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public K(Context context) {
        super(context);
        this.f17253a = Q2.g.a(context).f8010q * 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.f17254b = 0.0f;
        super.onAbsorb(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f7) {
        this.f17254b = 0.0f;
        super.onPull(f, f7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f17254b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.f17254b = 0.0f;
        super.onPull(f);
    }
}
