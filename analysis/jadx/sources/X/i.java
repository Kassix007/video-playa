package X;

import P.AbstractC0366l0;
import P.InterfaceC0360i0;
import P.V0;

/* JADX INFO: loaded from: classes.dex */
public final class i extends U.c implements InterfaceC0360i0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final i f8148t = new i(U.m.f7512e, 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // U.c, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC0366l0) {
            return super.containsKey((AbstractC0366l0) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1402e, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof V0) {
            return super.containsValue((V0) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // U.c, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC0366l0) {
            return (V0) super.get((AbstractC0366l0) obj);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC0366l0) ? obj2 : (V0) super.getOrDefault((AbstractC0366l0) obj, (V0) obj2);
    }
}
