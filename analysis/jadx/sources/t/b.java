package T;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class b extends n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7323q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Collection f7324r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, Collection collection) {
        super(1);
        this.f7323q = i;
        this.f7324r = collection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f7323q) {
            case 0:
                return Boolean.valueOf(this.f7324r.contains(obj));
            case 1:
                return Boolean.valueOf(this.f7324r.contains(obj));
            default:
                return Boolean.valueOf(((List) obj).retainAll(this.f7324r));
        }
    }
}
