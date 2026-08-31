package w1;

import android.view.ContentInfo;
import android.view.View;
import i3.C1136a;
import java.util.Objects;

/* JADX INFO: renamed from: w1.I, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1833I {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1843f b(View view, C1843f c1843f) {
        ContentInfo contentInfoJ = c1843f.f18198a.j();
        Objects.requireNonNull(contentInfoJ);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoJ);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoJ ? c1843f : new C1843f(new C1136a(contentInfoPerformReceiveContent));
    }
}
