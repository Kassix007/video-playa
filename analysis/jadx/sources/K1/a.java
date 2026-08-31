package K1;

import J1.AbstractComponentCallbacksC0185q;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class a extends RuntimeException {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AbstractComponentCallbacksC0185q f2851q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AbstractComponentCallbacksC0185q fragment, String str) {
        super(str);
        m.e(fragment, "fragment");
        this.f2851q = fragment;
    }
}
