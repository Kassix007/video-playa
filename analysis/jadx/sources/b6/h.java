package b6;

import java.util.LinkedHashMap;
import m5.C1363b;

/* JADX INFO: loaded from: classes.dex */
public final class h extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1363b f10029q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public U.l f10030r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LinkedHashMap f10031s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f10032t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10033u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f10034v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ U.l f10035w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10036x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(U.l lVar, s5.a aVar) {
        super(aVar);
        this.f10035w = lVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f10034v = obj;
        this.f10036x |= Integer.MIN_VALUE;
        return U.l.b(this.f10035w, null, this);
    }
}
