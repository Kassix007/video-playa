package j0;

import android.graphics.Bitmap;
import android.os.Build;

/* JADX INFO: renamed from: j0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1150e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f13704a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1150e(Bitmap bitmap) {
        this.f13704a = bitmap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a() {
        Bitmap.Config config = this.f13704a.getConfig();
        kotlin.jvm.internal.m.b(config);
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || config != Bitmap.Config.RGBA_F16) {
            return (i < 26 || config != Bitmap.Config.HARDWARE) ? 0 : 4;
        }
        return 3;
    }
}
