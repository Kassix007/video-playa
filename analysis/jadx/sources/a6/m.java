package a6;

import Z5.N;
import Z5.a0;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        N.a(a0.f8577a, "kotlinx.serialization.json.JsonUnquotedLiteral");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final B a(l lVar) {
        B b7 = lVar instanceof B ? (B) lVar : null;
        if (b7 != null) {
            return b7;
        }
        throw new IllegalArgumentException("Element " + kotlin.jvm.internal.z.a(lVar.getClass()) + " is not a JsonPrimitive");
    }
}
