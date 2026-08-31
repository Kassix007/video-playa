package k;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import w1.O;
import w1.P;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f13969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public P f13970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13971e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f13968b = -1;
    public final i f = new i(this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f13967a = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        if (this.f13971e) {
            ArrayList arrayList = this.f13967a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((O) obj).b();
            }
            this.f13971e = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        View view;
        if (this.f13971e) {
            return;
        }
        ArrayList arrayList = this.f13967a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            O o6 = (O) obj;
            long j = this.f13968b;
            if (j >= 0) {
                o6.c(j);
            }
            Interpolator interpolator = this.f13969c;
            if (interpolator != null && (view = (View) o6.f18157a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f13970d != null) {
                o6.d(this.f);
            }
            View view2 = (View) o6.f18157a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f13971e = true;
    }
}
