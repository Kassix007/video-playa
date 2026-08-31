package T1;

import android.content.Context;
import java.util.Iterator;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7362q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u f7363r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ f(u uVar, int i) {
        this.f7362q = i;
        this.f7363r = uVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [B5.a, kotlin.jvm.internal.k] */
    @Override // B5.a
    public final Object invoke() {
        int i;
        switch (this.f7362q) {
            case 0:
                u uVar = this.f7363r;
                J1.z zVar = uVar.f;
                boolean z5 = false;
                if (uVar.f7422g) {
                    n5.j jVar = uVar.f7418b.f;
                    if (jVar == null || !jVar.isEmpty()) {
                        Iterator it = jVar.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (!(((d) it.next()).f7354r instanceof r) && (i = i + 1) < 0) {
                                throw new ArithmeticException("Count overflow has happened.");
                            }
                        }
                    } else {
                        i = 0;
                    }
                    if (i > 1) {
                        z5 = true;
                    }
                }
                zVar.f9909a = z5;
                ?? r02 = zVar.f9911c;
                if (r02 != 0) {
                    r02.invoke();
                }
                return C1386y.f15098a;
            default:
                u uVar2 = this.f7363r;
                Context context = uVar2.f7417a;
                A navigatorProvider = uVar2.f7418b.f8081s;
                kotlin.jvm.internal.m.e(context, "context");
                kotlin.jvm.internal.m.e(navigatorProvider, "navigatorProvider");
                return new v();
        }
    }
}
