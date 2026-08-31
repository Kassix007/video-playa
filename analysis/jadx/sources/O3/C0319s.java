package O3;

import x3.AbstractC1887A;

/* JADX INFO: renamed from: O3.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0319s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5044e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f5045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f5046h;
    public final Long i;
    public final Long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f5047k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0319s(String str, String str2, long j, long j7, long j8, long j9, long j10, Long l7, Long l8, Long l9, Boolean bool) {
        AbstractC1887A.d(str);
        AbstractC1887A.d(str2);
        AbstractC1887A.a(j >= 0);
        AbstractC1887A.a(j7 >= 0);
        AbstractC1887A.a(j8 >= 0);
        AbstractC1887A.a(j10 >= 0);
        this.f5040a = str;
        this.f5041b = str2;
        this.f5042c = j;
        this.f5043d = j7;
        this.f5044e = j8;
        this.f = j9;
        this.f5045g = j10;
        this.f5046h = l7;
        this.i = l8;
        this.j = l9;
        this.f5047k = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0319s a(long j) {
        return new C0319s(this.f5040a, this.f5041b, this.f5042c, this.f5043d, this.f5044e, j, this.f5045g, this.f5046h, this.i, this.j, this.f5047k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0319s b(Long l7, Long l8, Boolean bool) {
        return new C0319s(this.f5040a, this.f5041b, this.f5042c, this.f5043d, this.f5044e, this.f, this.f5045g, this.f5046h, l7, l8, bool);
    }
}
