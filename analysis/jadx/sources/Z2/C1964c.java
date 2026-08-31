package z2;

import D2.n;
import H2.f;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: z2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1964c implements InterfaceC1963b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z2.InterfaceC1963b
    public final String a(Object obj, n nVar) {
        Uri uri = (Uri) obj;
        if (!m.a(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri);
        sb.append('-');
        Configuration configuration = nVar.f1421a.getResources().getConfiguration();
        Bitmap.Config[] configArr = f.f2137a;
        sb.append(configuration.uiMode & 48);
        return sb.toString();
    }
}
