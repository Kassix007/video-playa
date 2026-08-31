package androidx.room;

import android.os.Looper;
import java.util.Set;
import m5.C1386y;
import n.C1388a;

/* JADX INFO: renamed from: androidx.room.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0666d extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9720c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0666d(String[] strArr, Object obj, int i) {
        super(strArr);
        this.f9719b = i;
        this.f9720c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.room.n
    public final void a(Set tables) {
        switch (this.f9719b) {
            case 0:
                ((O5.e) this.f9720c).j(C1386y.f15098a);
                break;
            default:
                kotlin.jvm.internal.m.e(tables, "tables");
                C1388a c1388aQ = C1388a.Q();
                A a7 = ((B) this.f9720c).f9701u;
                c1388aQ.f15119d.getClass();
                if (!(Looper.getMainLooper().getThread() == Thread.currentThread())) {
                    c1388aQ.R(a7);
                } else {
                    a7.run();
                }
                break;
        }
    }
}
