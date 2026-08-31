package n3;

import C0.C0072d0;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Matrix f15199a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0072d0 f15200b = new C0072d0(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0072d0 f15201c = new C0072d0(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0072d0 f15202d = new C0072d0(6);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0072d0 f15203e = new C0072d0(7);
    public static final float f = (float) (Math.sqrt(2.0d) / 2.0d);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(Path path, float f7, float f8, float f9) {
        PathMeasure pathMeasure = (PathMeasure) f15200b.get();
        Path path2 = (Path) f15201c.get();
        Path path3 = (Path) f15202d.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (!(f7 == 1.0f && f8 == 0.0f) && length >= 1.0f && Math.abs((f8 - f7) - 1.0f) >= 0.01d) {
            float f10 = f7 * length;
            float f11 = f8 * length;
            float f12 = f9 * length;
            float fMin = Math.min(f10, f11) + f12;
            float fMax = Math.max(f10, f11) + f12;
            if (fMin >= length && fMax >= length) {
                fMin = g.d(fMin, length);
                fMax = g.d(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = g.d(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = g.d(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                return;
            }
            if (fMin >= fMax) {
                fMin -= length;
            }
            path2.reset();
            pathMeasure.getSegment(fMin, fMax, path2, true);
            if (fMax > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, fMax % length, path3, true);
                path2.addPath(path3);
            } else if (fMin < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(fMin + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e7) {
            throw e7;
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Bitmap d(Bitmap bitmap, int i, int i7) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i7) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i7, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }
}
