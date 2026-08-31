package c0;

/* JADX INFO: renamed from: c0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0718f extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0718f f10090q = new C0718f(2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        InterfaceC0723k interfaceC0723k = (InterfaceC0723k) obj2;
        if (str.length() == 0) {
            return interfaceC0723k.toString();
        }
        return str + ", " + interfaceC0723k;
    }
}
