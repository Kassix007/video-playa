package L2;

import I2.B;
import I2.q;
import I2.y;
import U2.n;
import Y2.j;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.m;
import n5.l;

/* JADX INFO: loaded from: classes.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3248a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [I2.y.<init>(I2.t):void] */
    public /* synthetic */ a(int i) {
        this.f3248a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // L2.f
    public final g a(Object obj, n nVar, y yVar) {
        int i = 0;
        int i7 = 1;
        int i8 = 2;
        int i9 = 3;
        switch (this.f3248a) {
            case 0:
                B b7 = (B) obj;
                Bitmap.Config[] configArr = j.f8215a;
                if (m.a(b7.f2336c, "file") && m.a(l.m0(q.g(b7)), "android_asset")) {
                    return new b(b7, nVar, i);
                }
                return null;
            case 1:
                return new c((Bitmap) obj, nVar, i);
            case 2:
                return new c((byte[]) obj, nVar, i7);
            case 3:
                return new c((ByteBuffer) obj, nVar, i8);
            case 4:
                B b8 = (B) obj;
                if (m.a(b8.f2336c, FirebaseAnalytics.Param.CONTENT)) {
                    return new b(b8, nVar, i7);
                }
                return null;
            case 5:
                B b9 = (B) obj;
                if (m.a(b9.f2336c, "data")) {
                    return new b(b9, nVar, i8);
                }
                return null;
            case 6:
                return new c((Drawable) obj, nVar, i9);
            case 7:
                B b10 = (B) obj;
                String str = b10.f2336c;
                if ((str != null && !str.equals("file")) || b10.f2338e == null) {
                    return null;
                }
                Bitmap.Config[] configArr2 = j.f8215a;
                if (m.a(b10.f2336c, "file") && m.a(l.m0(q.g(b10)), "android_asset")) {
                    return null;
                }
                return new b(b10, nVar, i9);
            case 8:
                B b11 = (B) obj;
                if (m.a(b11.f2336c, "jar:file")) {
                    return new b(b11, nVar, 4);
                }
                return null;
            default:
                B b12 = (B) obj;
                if (m.a(b12.f2336c, "android.resource")) {
                    return new b(b12, nVar, 5);
                }
                return null;
        }
    }
}
