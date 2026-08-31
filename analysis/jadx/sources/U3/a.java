package U3;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.internal.vision.E;
import com.google.android.gms.vision.clearcut.DynamiteClearcutLogger;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7699q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f7700r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f7701s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f7702t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(DynamiteClearcutLogger dynamiteClearcutLogger, int i, E e7) {
        this.f7702t = dynamiteClearcutLogger;
        this.f7700r = i;
        this.f7701s = e7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7699q) {
            case 0:
                ((DynamiteClearcutLogger) this.f7702t).zzc.zza(this.f7700r, (E) this.f7701s);
                break;
            case 1:
                ((BottomSheetBehavior) this.f7702t).E((View) this.f7701s, this.f7700r, false);
                break;
            default:
                ((TextView) this.f7701s).setTypeface((Typeface) this.f7702t, this.f7700r);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public a(TextView textView, Typeface typeface, int i) {
        this.f7701s = textView;
        this.f7702t = typeface;
        this.f7700r = i;
    }

    public a(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f7702t = bottomSheetBehavior;
        this.f7701s = view;
        this.f7700r = i;
    }
}
