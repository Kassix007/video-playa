package O2;

import I2.B;
import I2.q;
import U2.n;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import java.io.File;
import q6.x;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4297a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [I2.y.<init>(I2.t):void] */
    public /* synthetic */ a(int i) {
        this.f4297a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final B a(Object obj, n nVar) {
        switch (this.f4297a) {
            case 0:
                return q.i(((Uri) obj).toString());
            case 1:
                return q.a(((File) obj).getPath());
            case 2:
                return q.a(((x) obj).f16094q.p());
            case 3:
                int iIntValue = ((Number) obj).intValue();
                Context context = nVar.f7686a;
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) != null) {
                        return q.i("android.resource://" + context.getPackageName() + '/' + iIntValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            default:
                return q.i((String) obj);
        }
    }
}
