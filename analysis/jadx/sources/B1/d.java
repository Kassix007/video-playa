package b1;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f9954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9955b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f9954a = new Object[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object a() {
        int i = this.f9955b;
        if (i <= 0) {
            return null;
        }
        int i7 = i - 1;
        Object[] objArr = this.f9954a;
        Object obj = objArr[i7];
        m.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i7] = null;
        this.f9955b--;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(b bVar) {
        int i = this.f9955b;
        Object[] objArr = this.f9954a;
        if (i < objArr.length) {
            objArr[i] = bVar;
            this.f9955b = i + 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean c(Object instance) {
        Object[] objArr;
        boolean z5;
        m.e(instance, "instance");
        int i = this.f9955b;
        int i7 = 0;
        while (true) {
            objArr = this.f9954a;
            if (i7 >= i) {
                z5 = false;
                break;
            }
            if (objArr[i7] == instance) {
                z5 = true;
                break;
            }
            i7++;
        }
        if (z5) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i8 = this.f9955b;
        if (i8 >= objArr.length) {
            return false;
        }
        objArr[i8] = instance;
        this.f9955b = i8 + 1;
        return true;
    }

    public d() {
        this.f9954a = new Object[256];
    }
}
