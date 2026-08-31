package w;

import b2.C0690a;

/* JADX INFO: loaded from: classes.dex */
public final class U extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C0690a f17856q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public H0 f17857r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public kotlin.jvm.internal.v f17858s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f17859t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f17860u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C0690a f17861v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f17862w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(C0690a c0690a, s5.c cVar) {
        super(cVar);
        this.f17861v = c0690a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f17860u = obj;
        this.f17862w |= Integer.MIN_VALUE;
        return C0690a.b(this.f17861v, null, null, 0.0f, 0.0f, this);
    }
}
