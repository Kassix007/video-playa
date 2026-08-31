package D;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f1287b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t(int i, List list) {
        this.f1286a = i;
        this.f1287b = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public t() {
        this.f1286a = 1;
        this.f1287b = Collections.singletonList(null);
    }

    public t(ArrayList arrayList) {
        this.f1286a = 0;
        this.f1287b = arrayList;
    }
}
