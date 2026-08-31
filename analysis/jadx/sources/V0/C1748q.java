package v0;

import android.view.MotionEvent;
import m5.C1386y;

/* JADX INFO: renamed from: v0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1748q extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f17487q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1749r f17488r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1748q(C1749r c1749r, int i) {
        super(1);
        this.f17487q = i;
        this.f17488r = c1749r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f17487q) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                Z0.d dVar = this.f17488r.f17489q;
                if (dVar != null) {
                    dVar.invoke(motionEvent);
                    return C1386y.f15098a;
                }
                kotlin.jvm.internal.m.k("onTouchEvent");
                throw null;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                Z0.d dVar2 = this.f17488r.f17489q;
                if (dVar2 != null) {
                    dVar2.invoke(motionEvent2);
                    return C1386y.f15098a;
                }
                kotlin.jvm.internal.m.k("onTouchEvent");
                throw null;
        }
    }
}
