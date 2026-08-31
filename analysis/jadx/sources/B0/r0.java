package B0;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class r0 implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r0 f508b = new r0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f509a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [B0.g.<clinit>():void, B0.r0.<clinit>():void] */
    public /* synthetic */ r0(int i) {
        this.f509a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f509a) {
            case 0:
                L l7 = (L) obj;
                L l8 = (L) obj2;
                int iF = kotlin.jvm.internal.m.f(l8.f253F, l7.f253F);
                return iF != 0 ? iF : kotlin.jvm.internal.m.f(l7.hashCode(), l8.hashCode());
            default:
                L l9 = (L) obj;
                L l10 = (L) obj2;
                int iF2 = kotlin.jvm.internal.m.f(l9.f253F, l10.f253F);
                return iF2 != 0 ? iF2 : kotlin.jvm.internal.m.f(l9.hashCode(), l10.hashCode());
        }
    }
}
