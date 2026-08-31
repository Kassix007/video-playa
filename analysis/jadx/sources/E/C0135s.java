package E;

import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.Comparator;

/* JADX INFO: renamed from: E.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0135s implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y f1583b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0135s(Y y6, int i) {
        this.f1582a = i;
        this.f1583b = y6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1582a) {
            case 0:
                Object key = ((B) obj).getKey();
                Y y6 = this.f1583b;
                return AbstractC0836n2.h(Integer.valueOf(y6.g(key)), Integer.valueOf(y6.g(((B) obj2).getKey())));
            case 1:
                Object key2 = ((B) obj).getKey();
                Y y7 = this.f1583b;
                return AbstractC0836n2.h(Integer.valueOf(y7.g(key2)), Integer.valueOf(y7.g(((B) obj2).getKey())));
            case 2:
                Object key3 = ((B) obj2).getKey();
                Y y8 = this.f1583b;
                return AbstractC0836n2.h(Integer.valueOf(y8.g(key3)), Integer.valueOf(y8.g(((B) obj).getKey())));
            default:
                Object key4 = ((B) obj2).getKey();
                Y y9 = this.f1583b;
                return AbstractC0836n2.h(Integer.valueOf(y9.g(key4)), Integer.valueOf(y9.g(((B) obj).getKey())));
        }
    }
}
