package a6;

/* JADX INFO: renamed from: a6.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0637c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0636b f9018d = new C0636b(new j(false, true, "    ", "type", true, EnumC0635a.f9016q), c6.a.f10265a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f9019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O3.B f9020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k3.c f9021c = new k3.c(22);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0637c(j jVar, O3.B b7) {
        this.f9019a = jVar;
        this.f9020b = b7;
    }

    /* JADX DEBUG: Class process forced to load method for inline: D.u.m(D.u, java.lang.String, int, java.lang.String, int):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object a(V5.a deserializer, String string) {
        kotlin.jvm.internal.m.e(deserializer, "deserializer");
        kotlin.jvm.internal.m.e(string, "string");
        D.u uVar = new D.u(string);
        Object objP = new b6.i(this, b6.l.OBJ, uVar, deserializer.b()).p(deserializer);
        if (uVar.e() == 10) {
            return objP;
        }
        D.u.m(uVar, "Expected EOF after parsing, but had " + string.charAt(uVar.f1289b - 1) + " instead", 0, null, 6);
        throw null;
    }
}
