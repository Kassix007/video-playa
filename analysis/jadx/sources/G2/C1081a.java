package g2;

import Z.m;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.P1;
import com.web2native.MainActivity;
import java.util.Arrays;
import java.util.LinkedHashSet;
import m5.C1371j;
import n5.l;

/* JADX INFO: renamed from: g2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1081a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13035b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1081a(m mVar) {
        this.f13034a = 0;
        this.f13035b = new LinkedHashSet();
        mVar.C("androidx.savedstate.Restarter", this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g2.d
    public final Bundle a() {
        switch (this.f13034a) {
            case 0:
                Bundle bundleG = P1.g((C1371j[]) Arrays.copyOf(new C1371j[0], 0));
                P1.J(bundleG, "classes_to_restore", l.B0((LinkedHashSet) this.f13035b));
                return bundleG;
            default:
                Bundle bundle = new Bundle();
                ((MainActivity) this.f13035b).l().getClass();
                return bundle;
        }
    }

    public C1081a(MainActivity mainActivity) {
        this.f13034a = 1;
        this.f13035b = mainActivity;
    }
}
