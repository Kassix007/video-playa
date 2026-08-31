package T1;

import C0.S;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f7350b = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f7351a = new LinkedHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(z navigator) {
        kotlin.jvm.internal.m.e(navigator, "navigator");
        String strZ = C3.a.z(navigator.getClass());
        if (strZ.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.f7351a;
        z zVar = (z) linkedHashMap.get(strZ);
        if (kotlin.jvm.internal.m.a(zVar, navigator)) {
            return;
        }
        if (zVar != null && zVar.f7434b) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + zVar).toString());
        }
        if (!navigator.f7434b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final z b(String name) {
        kotlin.jvm.internal.m.e(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        z zVar = (z) this.f7351a.get(name);
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException(S.n("Could not find Navigator with name \"", name, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
