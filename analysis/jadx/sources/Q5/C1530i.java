package q5;

import java.io.Serializable;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: q5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1530i implements InterfaceC1529h, Serializable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C1530i f16022q = new C1530i();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1529h
    public final InterfaceC1527f get(InterfaceC1528g key) {
        m.e(key, "key");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1529h
    public final InterfaceC1529h minusKey(InterfaceC1528g key) {
        m.e(key, "key");
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1529h
    public final InterfaceC1529h plus(InterfaceC1529h context) {
        m.e(context, "context");
        return context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // q5.InterfaceC1529h
    public final Object fold(Object obj, B5.e eVar) {
        return obj;
    }
}
