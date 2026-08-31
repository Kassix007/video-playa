package c4;

import C0.RunnableC0089m;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import w1.AbstractC1835K;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f10251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i1.b f10252e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f(SideSheetBehavior sideSheetBehavior) {
        this.f10248a = 1;
        this.f10252e = sideSheetBehavior;
        this.f10251d = new RunnableC0089m(21, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i) {
        int i7 = this.f10248a;
        Runnable runnable = this.f10251d;
        i1.b bVar = this.f10252e;
        switch (i7) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) bVar;
                WeakReference weakReference = bottomSheetBehavior.f11382U;
                if (weakReference != null && weakReference.get() != null) {
                    this.f10249b = i;
                    if (!this.f10250c) {
                        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                        ((View) bottomSheetBehavior.f11382U.get()).postOnAnimation((A1.b) runnable);
                        this.f10250c = true;
                    }
                    break;
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) bVar;
                WeakReference weakReference2 = sideSheetBehavior.f11587p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f10249b = i;
                    if (!this.f10250c) {
                        WeakHashMap weakHashMap2 = AbstractC1835K.f18149a;
                        ((View) sideSheetBehavior.f11587p.get()).postOnAnimation((RunnableC0089m) runnable);
                        this.f10250c = true;
                    }
                    break;
                }
                break;
        }
    }

    public f(BottomSheetBehavior bottomSheetBehavior) {
        this.f10248a = 0;
        this.f10252e = bottomSheetBehavior;
        this.f10251d = new A1.b(14, this);
    }
}
