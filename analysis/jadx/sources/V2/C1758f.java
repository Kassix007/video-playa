package v2;

import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: renamed from: v2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1758f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitmapDrawable f17529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17530b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1758f(BitmapDrawable bitmapDrawable, boolean z5) {
        this.f17529a = bitmapDrawable;
        this.f17530b = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1758f)) {
            return false;
        }
        C1758f c1758f = (C1758f) obj;
        return this.f17529a.equals(c1758f.f17529a) && this.f17530b == c1758f.f17530b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f17530b) + (this.f17529a.hashCode() * 31);
    }
}
