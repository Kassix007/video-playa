package U4;

import R4.C0468k1;
import com.google.android.gms.internal.measurement.P1;
import com.web2native.MainActivity;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7809q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f7810r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f7811s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ d0(C0468k1 c0468k1, String str, int i) {
        this.f7809q = i;
        this.f7810r = c0468k1;
        this.f7811s = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f7809q) {
            case 0:
                MainActivity mainActivity = this.f7810r.f7069b;
                String str = this.f7811s;
                P1.X(str, str, mainActivity, true);
                break;
            case 1:
                MainActivity mainActivity2 = this.f7810r.f7067a;
                String str2 = this.f7811s;
                P1.Z(mainActivity2, str2, str2, true);
                break;
            default:
                MainActivity mainActivity3 = this.f7810r.f7069b;
                String str3 = this.f7811s;
                P1.Y(str3, str3, mainActivity3, 8);
                break;
        }
        return C1386y.f15098a;
    }
}
