package E1;

import E.c0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f1614d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f1616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f1617c = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public A(c0 c0Var, int i) {
        this.f1616b = c0Var;
        this.f1615a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a(int i) {
        F1.a aVarB = b();
        int iA = aVarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) aVarB.f1944t;
        int i7 = iA + aVarB.f1941q;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i7) + i7 + 4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final F1.a b() {
        ThreadLocal threadLocal = f1614d;
        F1.a aVar = (F1.a) threadLocal.get();
        if (aVar == null) {
            aVar = new F1.a();
            threadLocal.set(aVar);
        }
        F1.b bVar = (F1.b) this.f1616b.f1552q;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i = iA + bVar.f1941q;
            int i7 = (this.f1615a * 4) + ((ByteBuffer) bVar.f1944t).getInt(i) + i + 4;
            int i8 = ((ByteBuffer) bVar.f1944t).getInt(i7) + i7;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f1944t;
            aVar.f1944t = byteBuffer;
            if (byteBuffer != null) {
                aVar.f1941q = i8;
                int i9 = i8 - byteBuffer.getInt(i8);
                aVar.f1942r = i9;
                aVar.f1943s = ((ByteBuffer) aVar.f1944t).getShort(i9);
                return aVar;
            }
            aVar.f1941q = 0;
            aVar.f1942r = 0;
            aVar.f1943s = 0;
        }
        return aVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        F1.a aVarB = b();
        int iA = aVarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) aVarB.f1944t).getInt(iA + aVarB.f1941q) : 0));
        sb.append(", codepoints:");
        F1.a aVarB2 = b();
        int iA2 = aVarB2.a(16);
        if (iA2 != 0) {
            int i7 = iA2 + aVarB2.f1941q;
            i = ((ByteBuffer) aVarB2.f1944t).getInt(((ByteBuffer) aVarB2.f1944t).getInt(i7) + i7);
        } else {
            i = 0;
        }
        for (int i8 = 0; i8 < i; i8++) {
            sb.append(Integer.toHexString(a(i8)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
