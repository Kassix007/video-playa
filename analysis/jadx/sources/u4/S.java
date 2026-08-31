package U4;

import R4.C0468k1;
import R4.F1;
import com.google.android.gms.internal.measurement.P1;
import com.web2native.MainActivity;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class S implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7767q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f7768r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ F1 f7769s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ S(C0468k1 c0468k1, F1 f12) {
        this.f7768r = c0468k1;
        this.f7769s = f12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f7767q) {
            case 0:
                String str = this.f7769s.f6755a;
                kotlin.jvm.internal.m.b(str);
                kotlin.jvm.internal.m.b(str);
                P1.Y(str, str, this.f7768r.f7069b, 8);
                break;
            default:
                MainActivity mainActivity = this.f7768r.f7067a;
                String str2 = this.f7769s.f6755a;
                kotlin.jvm.internal.m.b(str2);
                kotlin.jvm.internal.m.b(str2);
                P1.Z(mainActivity, str2, str2, true);
                break;
        }
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ S(F1 f12, C0468k1 c0468k1) {
        this.f7769s = f12;
        this.f7768r = c0468k1;
    }
}
