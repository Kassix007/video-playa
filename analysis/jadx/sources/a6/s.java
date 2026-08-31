package a6;

import Z5.U;
import Z5.V;
import o5.C1421c;

/* JADX INFO: loaded from: classes.dex */
public abstract class s implements V5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U f9045a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        X5.d dVar = X5.d.f8183k;
        if (J5.m.U0("kotlinx.serialization.json.JsonLiteral")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Object it = ((U.i) V.f8568a.values()).iterator();
        while (((F1.c) it).hasNext()) {
            V5.a aVar = (V5.a) ((C1421c) it).next();
            if ("kotlinx.serialization.json.JsonLiteral".equals(aVar.b().b())) {
                throw new IllegalArgumentException(J5.n.x0("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + kotlin.jvm.internal.z.a(aVar.getClass()).c() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
        f9045a = new U("kotlinx.serialization.json.JsonLiteral", dVar);
    }
}
