package m1;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f15036q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15037r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f15038s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ j(int i, int i7, Object obj) {
        this.f15036q = i7;
        this.f15038s = obj;
        this.f15037r = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15036q) {
            case 0:
                ((b) this.f15038s).h(this.f15037r);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f15038s;
                View view = (View) sideSheetBehavior.f11587p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, this.f15037r, false);
                }
                break;
        }
    }
}
