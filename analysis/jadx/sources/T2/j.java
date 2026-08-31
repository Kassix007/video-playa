package t2;

import D2.q;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class j extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public l f16700q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public q f16701r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public D2.j f16702s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C1618c f16703t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Bitmap f16704u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f16705v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f16706w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f16707x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, s5.c cVar) {
        super(cVar);
        this.f16706w = lVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f16705v = obj;
        this.f16707x |= Integer.MIN_VALUE;
        return l.a(this.f16706w, null, 0, this);
    }
}
