package Z5;

/* JADX INFO: loaded from: classes.dex */
public final class o0 implements V5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f8620a = new o0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U f8621b = new U("kotlin.uuid.Uuid", X5.d.f8183k);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // V5.a
    public final X5.f b() {
        return f8621b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // V5.a
    public final Object c(Y5.b bVar) {
        String strConcat;
        String uuidString = bVar.w();
        kotlin.jvm.internal.m.e(uuidString, "uuidString");
        int length = uuidString.length();
        if (length == 32) {
            long jB = J5.c.b(uuidString, 0, 16);
            long jB2 = J5.c.b(uuidString, 16, 32);
            if (jB != 0 || jB2 != 0) {
                return new L5.a(jB, jB2);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                if (uuidString.length() <= 64) {
                    strConcat = uuidString;
                } else {
                    String strSubstring = uuidString.substring(0, 64);
                    kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                    strConcat = strSubstring.concat("...");
                }
                sb.append(strConcat);
                sb.append("\" of length ");
                sb.append(uuidString.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long jB3 = J5.c.b(uuidString, 0, 8);
            Q2.g.n(8, uuidString);
            long jB4 = J5.c.b(uuidString, 9, 13);
            Q2.g.n(13, uuidString);
            long jB5 = J5.c.b(uuidString, 14, 18);
            Q2.g.n(18, uuidString);
            long jB6 = J5.c.b(uuidString, 19, 23);
            Q2.g.n(23, uuidString);
            long j = (jB4 << 16) | (jB3 << 32) | jB5;
            long jB7 = J5.c.b(uuidString, 24, 36) | (jB6 << 48);
            if (j != 0 || jB7 != 0) {
                return new L5.a(j, jB7);
            }
        }
        return L5.a.f3273s;
    }
}
