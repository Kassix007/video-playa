package N5;

import M5.C0247h;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.LongSparseArray;
import androidx.room.F;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.background.greedy.TimeLimiter;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import b.C0683A;
import b.l;
import com.web2native.MainActivity;
import e0.ViewOnAttachStateChangeListenerC1018c;
import h.AbstractActivityC1106h;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f4033q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f4034r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f4035s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f4033q = i;
        this.f4034r = obj;
        this.f4035s = obj2;
    }

    /* JADX DEBUG: Class process forced to load method for inline: androidx.work.impl.constraints.trackers.ConstraintTracker.a(java.util.List, androidx.work.impl.constraints.trackers.ConstraintTracker):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        F this$0;
        int i = this.f4033q;
        Object obj = this.f4035s;
        Object obj2 = this.f4034r;
        switch (i) {
            case 0:
                ((C0247h) obj2).C((f) obj);
                return;
            case 1:
                try {
                    ((MainActivity) obj2).getWindow().setNavigationBarColor(Color.parseColor((String) obj));
                    return;
                } catch (Exception e7) {
                    e7.printStackTrace();
                    return;
                }
            case 2:
                Runnable command = (Runnable) obj2;
                this$0 = (F) obj;
                m.e(command, "$command");
                m.e(this$0, "this$0");
                try {
                    command.run();
                    return;
                } finally {
                }
            case 3:
                TimeLimiter.track$lambda$0((TimeLimiter) obj2, (StartStopToken) obj);
                return;
            case 4:
                ConstraintTracker._set_state_$lambda$4$lambda$3((List) obj2, (ConstraintTracker) obj);
                return;
            case 5:
                AbstractActivityC1106h abstractActivityC1106h = (AbstractActivityC1106h) obj2;
                int i7 = l.f9882J;
                abstractActivityC1106h.f14061q.a(new b.e((C0683A) obj, abstractActivityC1106h));
                return;
            case 6:
                C3.a.v((ViewOnAttachStateChangeListenerC1018c) obj2, (LongSparseArray) obj);
                return;
            case 7:
                this$0 = (F) obj2;
                Runnable runnable = (Runnable) obj;
                this$0.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                }
            default:
                ((m1.b) obj2).i((Typeface) obj);
                return;
        }
    }
}
