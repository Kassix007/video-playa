package y1;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class e implements f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InputContentInfo f18539q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(Object obj) {
        this.f18539q = (InputContentInfo) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // y1.f
    public final ClipDescription a() {
        return this.f18539q.getDescription();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // y1.f
    public final Object b() {
        return this.f18539q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // y1.f
    public final Uri c() {
        return this.f18539q.getContentUri();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // y1.f
    public final void d() {
        this.f18539q.requestPermission();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // y1.f
    public final Uri e() {
        return this.f18539q.getLinkUri();
    }

    public e(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f18539q = new InputContentInfo(uri, clipDescription, uri2);
    }
}
