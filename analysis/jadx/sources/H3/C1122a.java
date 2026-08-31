package h3;

import O3.D0;
import d3.f;
import d3.j;
import d3.n;
import java.util.List;

/* JADX INFO: renamed from: h3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1122a extends D0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13443s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1122a(int i, List list) {
        super(list);
        this.f13443s = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h3.e
    public final d3.e f() {
        switch (this.f13443s) {
            case 0:
                return new f(0, (List) this.f4346r);
            case 1:
                return new j(0, (List) this.f4346r);
            case 2:
                return new f(1, (List) this.f4346r);
            case 3:
                return new j(1, (List) this.f4346r);
            case 4:
                return new j(2, (List) this.f4346r);
            case 5:
                return new n((List) this.f4346r);
            default:
                return new f(2, (List) this.f4346r);
        }
    }
}
