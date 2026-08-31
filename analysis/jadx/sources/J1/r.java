package J1;

import android.os.Bundle;
import androidx.lifecycle.EnumC0652o;
import h.AbstractActivityC1106h;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements g2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC1106h f2729b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ r(AbstractActivityC1106h abstractActivityC1106h, int i) {
        this.f2728a = i;
        this.f2729b = abstractActivityC1106h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g2.d
    public final Bundle a() {
        AbstractActivityC1106h abstractActivityC1106h;
        switch (this.f2728a) {
            case 0:
                break;
            default:
                Bundle bundle = new Bundle();
                b.j jVar = this.f2729b.f9899y;
                jVar.getClass();
                LinkedHashMap linkedHashMap = jVar.f9874b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(jVar.f9876d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(jVar.f9878g));
                return bundle;
        }
        do {
            abstractActivityC1106h = this.f2729b;
        } while (AbstractActivityC1106h.m(((C0188u) abstractActivityC1106h.f13295K.f14122r).f2737w));
        abstractActivityC1106h.f13296L.f(EnumC0652o.ON_STOP);
        return new Bundle();
    }
}
