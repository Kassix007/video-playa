package x2;

import D2.n;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: x2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1886a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18349a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [t2.l.<init>(android.content.Context, D2.c, m5.o, m5.o, m5.o, t2.b, H2.j):void] */
    public /* synthetic */ C1886a(int i) {
        this.f18349a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x2.f
    public final g a(Object obj, n nVar) {
        switch (this.f18349a) {
            case 0:
                Uri uri = (Uri) obj;
                if (H2.f.d(uri)) {
                    return new b(uri, nVar, 0);
                }
                return null;
            case 1:
                return new c((Bitmap) obj, nVar, 0);
            case 2:
                return new c((ByteBuffer) obj, nVar, 1);
            case 3:
                Uri uri2 = (Uri) obj;
                if (kotlin.jvm.internal.m.a(uri2.getScheme(), FirebaseAnalytics.Param.CONTENT)) {
                    return new b(uri2, nVar, 1);
                }
                return null;
            case 4:
                return new c((Drawable) obj, nVar, 2);
            case 5:
                return new h((File) obj);
            default:
                Uri uri3 = (Uri) obj;
                if (kotlin.jvm.internal.m.a(uri3.getScheme(), "android.resource")) {
                    return new b(uri3, nVar, 2);
                }
                return null;
        }
    }
}
