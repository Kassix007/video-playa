package i2;

import I2.d;
import O3.B;
import W1.f;
import android.os.Bundle;
import androidx.lifecycle.EnumC0653p;
import g2.e;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: i2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1135a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f13554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f13555b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13558e;
    public Bundle f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13559g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f13556c = new B(22);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f13557d = new LinkedHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13560h = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1135a(e eVar, d dVar) {
        this.f13554a = eVar;
        this.f13555b = dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        e eVar = this.f13554a;
        if (eVar.getLifecycle().b() != EnumC0653p.f9557r) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f13558e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f13555b.invoke();
        eVar.getLifecycle().a(new f(2, this));
        this.f13558e = true;
    }
}
