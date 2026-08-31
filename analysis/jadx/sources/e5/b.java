package E5;

import C0.C0072d0;
import java.util.Random;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0072d0 f1750b = new C0072d0(2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E5.a
    public final Random b() {
        Object obj = this.f1750b.get();
        m.d(obj, "get(...)");
        return (Random) obj;
    }
}
