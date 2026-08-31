package I5;

import java.util.Iterator;
import m5.InterfaceC1366e;

/* JADX INFO: loaded from: classes.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1366e f2433c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ g(Object obj, B5.c cVar, int i) {
        this.f2431a = i;
        this.f2432b = obj;
        this.f2433c = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // I5.i
    public final Iterator iterator() {
        switch (this.f2431a) {
            case 0:
                return new f(this);
            case 1:
                return new h(this);
            default:
                return new J5.b(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public g(CharSequence input, B5.e eVar) {
        this.f2431a = 2;
        kotlin.jvm.internal.m.e(input, "input");
        this.f2432b = input;
        this.f2433c = eVar;
    }
}
