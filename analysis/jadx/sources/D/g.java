package D;

import com.google.android.gms.internal.measurement.AbstractC0836n2;

/* JADX INFO: loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final g f1210r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final g f1211s;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1212q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 2;
        f1210r = new g(i, 0);
        f1211s = new g(i, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i, int i7) {
        super(i);
        this.f1212q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1212q) {
            case 0:
                ((Number) obj2).intValue();
                return new C0117b(1);
            default:
                y yVar = (y) obj2;
                return AbstractC0836n2.A(Integer.valueOf(yVar.f1308d.f685b.e()), Integer.valueOf(yVar.f1308d.f686c.e()));
        }
    }
}
