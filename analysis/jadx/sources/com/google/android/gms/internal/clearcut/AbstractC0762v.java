package com.google.android.gms.internal.clearcut;

/* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0762v implements Cloneable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AbstractC0764x f10560q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AbstractC0764x f10561r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f10562s = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0762v(AbstractC0764x abstractC0764x) {
        this.f10560q = abstractC0764x;
        this.f10561r = (AbstractC0764x) abstractC0764x.a(4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(AbstractC0764x abstractC0764x) {
        b();
        AbstractC0764x abstractC0764x2 = this.f10561r;
        V v6 = V.f10444c;
        v6.getClass();
        v6.a(abstractC0764x2.getClass()).c(abstractC0764x2, abstractC0764x);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        if (this.f10562s) {
            AbstractC0764x abstractC0764x = (AbstractC0764x) this.f10561r.a(4);
            AbstractC0764x abstractC0764x2 = this.f10561r;
            V v6 = V.f10444c;
            v6.getClass();
            v6.a(abstractC0764x.getClass()).c(abstractC0764x, abstractC0764x2);
            this.f10561r = abstractC0764x;
            this.f10562s = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractC0764x c() {
        if (this.f10562s) {
            return this.f10561r;
        }
        AbstractC0764x abstractC0764x = this.f10561r;
        V v6 = V.f10444c;
        v6.getClass();
        v6.a(abstractC0764x.getClass()).a(abstractC0764x);
        this.f10562s = true;
        return this.f10561r;
    }

    public final /* synthetic */ Object clone() {
        AbstractC0762v abstractC0762v = (AbstractC0762v) this.f10560q.a(5);
        abstractC0762v.a(c());
        return abstractC0762v;
    }
}
