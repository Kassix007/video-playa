package a1;

import java.util.UUID;
import kotlin.jvm.internal.n;

/* JADX INFO: renamed from: a1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0610c extends n implements B5.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0610c f8726r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0610c f8727s;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8728q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 0;
        f8726r = new C0610c(i, 0);
        f8727s = new C0610c(i, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0610c(int i, int i7) {
        super(i);
        this.f8728q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        switch (this.f8728q) {
            case 0:
                return UUID.randomUUID();
            default:
                return "DEFAULT_TEST_TAG";
        }
    }
}
