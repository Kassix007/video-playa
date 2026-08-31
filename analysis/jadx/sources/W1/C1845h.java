package w1;

import android.view.DisplayCutout;
import java.util.Objects;

/* JADX INFO: renamed from: w1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1845h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f18215a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1845h(DisplayCutout displayCutout) {
        this.f18215a = displayCutout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1845h.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f18215a, ((C1845h) obj).f18215a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f18215a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DisplayCutoutCompat{" + this.f18215a + "}";
    }
}
