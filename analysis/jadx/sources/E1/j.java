package E1;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import d2.AbstractC0960G;
import i3.C1136a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1635q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f1636r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f1637s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ j(int i, int i7, Object obj) {
        this.f1635q = i7;
        this.f1637s = obj;
        this.f1636r = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1635q) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f1637s;
                int size = arrayList.size();
                int i = 0;
                if (this.f1636r == 1) {
                    while (i < size) {
                        ((i) arrayList.get(i)).b();
                        i++;
                    }
                } else {
                    while (i < size) {
                        ((i) arrayList.get(i)).a();
                        i++;
                    }
                }
                break;
            case 1:
                RecyclerView recyclerView = ((com.google.android.material.datepicker.l) this.f1637s).f11502r0;
                if (!recyclerView.f9619K) {
                    AbstractC0960G abstractC0960G = recyclerView.f9604B;
                    if (abstractC0960G != null) {
                        abstractC0960G.x0(recyclerView, this.f1636r);
                    } else {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    }
                    break;
                }
                break;
            case 2:
                ((n4.c) this.f1637s).j(this.f1636r);
                break;
            case 3:
                m1.b bVar = (m1.b) ((C1136a) this.f1637s).f13562r;
                if (bVar != null) {
                    bVar.h(this.f1636r);
                }
                break;
            default:
                ((v3.o) this.f1637s).f(this.f1636r);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public j(List list, int i, Throwable th) {
        this.f1635q = 0;
        E3.h.p(list, "initCallbacks cannot be null");
        this.f1637s = new ArrayList(list);
        this.f1636r = i;
    }
}
