package H2;

import D2.v;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import com.wnapp.smspariaz.R;
import java.io.Closeable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Bitmap.Config[] f2137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Bitmap.Config f2138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d6.l f2139c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = Build.VERSION.SDK_INT;
        f2137a = i >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        f2138b = i >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
        f2139c = new d6.l((String[]) new ArrayList(20).toArray(new String[0]));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e7) {
            throw e7;
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || J5.m.U0(str)) {
            return null;
        }
        String strL1 = J5.m.l1(J5.m.l1(str, '#'), '?');
        return mimeTypeMap.getMimeTypeFromExtension(J5.m.i1('.', J5.m.i1('/', strL1, strL1), ""));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final v c(ImageView imageView) {
        v vVar;
        Object tag = imageView.getTag(R.id.coil_request_manager);
        v vVar2 = tag instanceof v ? (v) tag : null;
        if (vVar2 != null) {
            return vVar2;
        }
        synchronized (imageView) {
            try {
                Object tag2 = imageView.getTag(R.id.coil_request_manager);
                vVar = tag2 instanceof v ? (v) tag2 : null;
                if (vVar == null) {
                    vVar = new v();
                    imageView.addOnAttachStateChangeListener(vVar);
                    imageView.setTag(R.id.coil_request_manager, vVar);
                }
            } finally {
            }
        }
        return vVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean d(Uri uri) {
        return kotlin.jvm.internal.m.a(uri.getScheme(), "file") && kotlin.jvm.internal.m.a((String) n5.l.m0(uri.getPathSegments()), "android_asset");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int e(C3.a aVar, E2.g gVar) {
        if (aVar instanceof E2.a) {
            return ((E2.a) aVar).f1676t;
        }
        int iOrdinal = gVar.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        throw new C2.e();
    }
}
