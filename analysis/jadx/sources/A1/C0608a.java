package a1;

import C0.Y;
import kotlin.jvm.internal.n;
import m5.C1386y;

/* JADX INFO: renamed from: a1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0608a extends n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8723q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ DialogC0617j f8724r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0608a(DialogC0617j dialogC0617j, int i) {
        super(1);
        this.f8723q = i;
        this.f8724r = dialogC0617j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f8723q) {
            case 0:
                DialogC0617j dialogC0617j = this.f8724r;
                dialogC0617j.show();
                return new Y(5, dialogC0617j);
            default:
                DialogC0617j dialogC0617j2 = this.f8724r;
                if (dialogC0617j2.f8745u.f8739a) {
                    dialogC0617j2.f8744t.invoke();
                }
                return C1386y.f15098a;
        }
    }
}
