package C0;

import android.view.ViewConfiguration;

/* JADX INFO: renamed from: C0.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0084j0 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f1050a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0084j0(ViewConfiguration viewConfiguration) {
        this.f1050a = viewConfiguration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.b1
    public final float a() {
        return this.f1050a.getScaledMaximumFlingVelocity();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.b1
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.b1
    public final float c() {
        return this.f1050a.getScaledTouchSlop();
    }
}
