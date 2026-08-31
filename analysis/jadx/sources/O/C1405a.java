package o;

import java.util.HashMap;

/* JADX INFO: renamed from: o.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1405a extends C1410f {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final HashMap f15306u = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // o.C1410f
    public final C1407c d(Object obj) {
        return (C1407c) this.f15306u.get(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // o.C1410f
    public final Object g(Object obj) {
        Object objG = super.g(obj);
        this.f15306u.remove(obj);
        return objG;
    }
}
