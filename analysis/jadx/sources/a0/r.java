package a0;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f8690a = new Object();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(int i, int i7) {
        if (i < 0 || i >= i7) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i7 + ')');
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int b(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i7 = (i + length) >>> 1;
            long j7 = jArr[i7];
            if (j > j7) {
                i = i7 + 1;
            } else {
                if (j >= j7) {
                    return i7;
                }
                length = i7 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static AbstractC0606h c() {
        return (AbstractC0606h) n.f8679a.s();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static AbstractC0606h d(AbstractC0606h abstractC0606h) {
        if (abstractC0606h instanceof z) {
            z zVar = (z) abstractC0606h;
            if (zVar.f8722t == X.k.b()) {
                zVar.f8720r = null;
                return abstractC0606h;
            }
        }
        if (abstractC0606h instanceof C0598A) {
            C0598A c0598a = (C0598A) abstractC0606h;
            if (c0598a.f8643h == X.k.b()) {
                c0598a.f8642g = null;
                return abstractC0606h;
            }
        }
        AbstractC0606h abstractC0606hH = n.h(abstractC0606h, null, false);
        abstractC0606hH.j();
        return abstractC0606hH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object e(B5.c cVar, B5.a aVar) {
        AbstractC0606h zVar;
        if (cVar == null) {
            return aVar.invoke();
        }
        AbstractC0606h abstractC0606h = (AbstractC0606h) n.f8679a.s();
        if (abstractC0606h instanceof z) {
            z zVar2 = (z) abstractC0606h;
            if (zVar2.f8722t == X.k.b()) {
                B5.c cVar2 = zVar2.f8720r;
                B5.c cVar3 = zVar2.f8721s;
                try {
                    ((z) abstractC0606h).f8720r = n.l(cVar, cVar2, true);
                    ((z) abstractC0606h).f8721s = cVar3;
                    return aVar.invoke();
                } finally {
                    zVar2.f8720r = cVar2;
                    zVar2.f8721s = cVar3;
                }
            }
        }
        if (abstractC0606h == null || (abstractC0606h instanceof C0602d)) {
            zVar = new z(abstractC0606h instanceof C0602d ? (C0602d) abstractC0606h : null, cVar, null, true, false);
        } else {
            if (cVar == null) {
                return aVar.invoke();
            }
            zVar = abstractC0606h.u(cVar);
        }
        try {
            AbstractC0606h abstractC0606hJ = zVar.j();
            try {
                Object objInvoke = aVar.invoke();
                AbstractC0606h.q(abstractC0606hJ);
                zVar.c();
                return objInvoke;
            } catch (Throwable th) {
                AbstractC0606h.q(abstractC0606hJ);
                throw th;
            }
        } catch (Throwable th2) {
            zVar.c();
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void f(AbstractC0606h abstractC0606h, AbstractC0606h abstractC0606h2, B5.c cVar) {
        if (abstractC0606h != abstractC0606h2) {
            abstractC0606h2.getClass();
            AbstractC0606h.q(abstractC0606h);
            abstractC0606h2.c();
        } else if (abstractC0606h instanceof z) {
            ((z) abstractC0606h).f8720r = cVar;
        } else if (abstractC0606h instanceof C0598A) {
            ((C0598A) abstractC0606h).f8642g = cVar;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + abstractC0606h).toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void g() {
        throw new UnsupportedOperationException();
    }
}
