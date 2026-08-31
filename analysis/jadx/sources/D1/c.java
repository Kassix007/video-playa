package D1;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1338a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.f1338a) {
        }
        float f7 = f - 1.0f;
        return (f7 * f7 * f7 * f7 * f7) + 1.0f;
    }
}
