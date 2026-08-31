package z2;

import D2.n;
import java.io.File;

/* JADX INFO: renamed from: z2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1962a implements InterfaceC1963b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18742a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1962a(boolean z5) {
        this.f18742a = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z2.InterfaceC1963b
    public final String a(Object obj, n nVar) {
        File file = (File) obj;
        if (!this.f18742a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
