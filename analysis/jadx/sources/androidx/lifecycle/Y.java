package androidx.lifecycle;

import C0.C0111x0;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.P1;
import java.util.Arrays;
import java.util.Map;
import m5.AbstractC1362a;
import m5.C1371j;
import m5.C1376o;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements g2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z.m f9515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f9517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1376o f9518d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Y(Z.m savedStateRegistry, l0 l0Var) {
        kotlin.jvm.internal.m.e(savedStateRegistry, "savedStateRegistry");
        this.f9515a = savedStateRegistry;
        this.f9518d = AbstractC1362a.d(new I2.d(11, l0Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g2.d
    public final Bundle a() {
        Bundle bundleG = P1.g((C1371j[]) Arrays.copyOf(new C1371j[0], 0));
        Bundle bundle = this.f9517c;
        if (bundle != null) {
            bundleG.putAll(bundle);
        }
        for (Map.Entry entry : ((Z) this.f9518d.getValue()).f9519b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((C0111x0) ((U) entry.getValue()).f9508b.f3124a).a();
            if (!bundleA.isEmpty()) {
                P1.H(bundleG, str, bundleA);
            }
        }
        this.f9516b = false;
        return bundleG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        if (this.f9516b) {
            return;
        }
        Bundle bundleH = this.f9515a.h("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleG = P1.g((C1371j[]) Arrays.copyOf(new C1371j[0], 0));
        Bundle bundle = this.f9517c;
        if (bundle != null) {
            bundleG.putAll(bundle);
        }
        if (bundleH != null) {
            bundleG.putAll(bundleH);
        }
        this.f9517c = bundleG;
        this.f9516b = true;
    }
}
