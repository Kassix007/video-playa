package C0;

import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class J implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f876b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ J(int i, Object obj) {
        this.f875a = i;
        this.f876b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f875a) {
            case 0:
                return ((Number) ((B5.e) this.f876b).invoke(obj, obj2)).intValue();
            default:
                for (B5.c cVar : (B5.c[]) this.f876b) {
                    int iH = AbstractC0836n2.h((Comparable) cVar.invoke(obj), (Comparable) cVar.invoke(obj2));
                    if (iH != 0) {
                        return iH;
                    }
                }
                return 0;
        }
    }
}
