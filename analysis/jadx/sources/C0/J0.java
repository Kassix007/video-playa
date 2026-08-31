package C0;

import i0.C1131c;
import java.util.Comparator;
import m5.C1371j;

/* JADX INFO: loaded from: classes.dex */
public final class J0 implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final J0 f877b = new J0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final J0 f878c = new J0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final J0 f879d = new J0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f880a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [C0.J0.<clinit>():void] */
    public /* synthetic */ J0(int i) {
        this.f880a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f880a) {
            case 0:
                C1131c c1131cF = ((I0.m) obj).f();
                C1131c c1131cF2 = ((I0.m) obj2).f();
                int iCompare = Float.compare(c1131cF.f13522a, c1131cF2.f13522a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(c1131cF.f13523b, c1131cF2.f13523b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(c1131cF.f13525d, c1131cF2.f13525d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(c1131cF.f13524c, c1131cF2.f13524c);
            case 1:
                C1131c c1131cF3 = ((I0.m) obj).f();
                C1131c c1131cF4 = ((I0.m) obj2).f();
                int iCompare4 = Float.compare(c1131cF4.f13524c, c1131cF3.f13524c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(c1131cF3.f13523b, c1131cF4.f13523b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(c1131cF3.f13525d, c1131cF4.f13525d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(c1131cF4.f13522a, c1131cF3.f13522a);
            default:
                C1371j c1371j = (C1371j) obj;
                C1371j c1371j2 = (C1371j) obj2;
                int iCompare7 = Float.compare(((C1131c) c1371j.f15080q).f13523b, ((C1131c) c1371j2.f15080q).f13523b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((C1131c) c1371j.f15080q).f13525d, ((C1131c) c1371j2.f15080q).f13525d);
        }
    }
}
