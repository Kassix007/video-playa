package I2;

import L0.C0191c;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import d2.C0986l;
import java.util.Comparator;
import java.util.WeakHashMap;
import w1.AbstractC1826B;
import w1.AbstractC1835K;

/* JADX INFO: loaded from: classes.dex */
public final class A implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ A f2332b = new A(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2333a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [I2.A.<clinit>():void, I2.p.invoke():java.lang.Object, L0.d.<init>(java.util.List, java.lang.String):void, androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void, b1.e.j(b1.f):void, d2.m.<clinit>():void, l4.m.<clinit>():void, r6.b.b(java.util.ArrayList):java.util.LinkedHashMap] */
    public /* synthetic */ A(int i) {
        this.f2333a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2333a) {
            case 0:
                ((T2.c) obj2).getClass();
                ((T2.c) obj).getClass();
                return AbstractC0836n2.h(2, 2);
            case 1:
                ((X2.a) obj2).getClass();
                ((X2.a) obj).getClass();
                return AbstractC0836n2.h(0, 0);
            case 2:
                return AbstractC0836n2.h(Integer.valueOf(((C0191c) obj).f3102b), Integer.valueOf(((C0191c) obj2).f3102b));
            case 3:
                return AbstractC0836n2.h(Integer.valueOf(((C0191c) obj).f3102b), Integer.valueOf(((C0191c) obj2).f3102b));
            case 4:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
            case 5:
                return ((b1.f) obj).f9961r - ((b1.f) obj2).f9961r;
            case 6:
                C0986l c0986l = (C0986l) obj;
                C0986l c0986l2 = (C0986l) obj2;
                RecyclerView recyclerView = c0986l.f12164d;
                if ((recyclerView == null) == (c0986l2.f12164d == null)) {
                    boolean z5 = c0986l.f12161a;
                    if (z5 == c0986l2.f12161a) {
                        int i = c0986l2.f12162b - c0986l.f12162b;
                        if (i != 0) {
                            return i;
                        }
                        int i7 = c0986l.f12163c - c0986l2.f12163c;
                        if (i7 != 0) {
                            return i7;
                        }
                        return 0;
                    }
                    if (!z5) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            case 7:
                WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                float fG = AbstractC1826B.g((View) obj);
                float fG2 = AbstractC1826B.g((View) obj2);
                if (fG > fG2) {
                    return -1;
                }
                return fG < fG2 ? 1 : 0;
            case 8:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            default:
                return AbstractC0836n2.h(((r6.h) obj).f16383a, ((r6.h) obj2).f16383a);
        }
    }
}
