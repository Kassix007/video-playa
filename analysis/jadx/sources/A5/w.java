package a5;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8999q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ List f9000r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i, List list) {
        super(1);
        this.f8999q = i;
        this.f9000r = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f8999q) {
            case 0:
                this.f9000r.get(((Number) obj).intValue());
                break;
            default:
                this.f9000r.get(((Number) obj).intValue());
                break;
        }
        return null;
    }
}
