package e5;

import C0.S;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: e5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1057b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12647e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f12648g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1057b(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f12643a = str;
        this.f12644b = str2;
        this.f12645c = str3;
        this.f12646d = str4;
        this.f12647e = str5;
        this.f = str6;
        this.f12648g = str7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1057b)) {
            return false;
        }
        C1057b c1057b = (C1057b) obj;
        return m.a(this.f12643a, c1057b.f12643a) && m.a(this.f12644b, c1057b.f12644b) && m.a(this.f12645c, c1057b.f12645c) && m.a(this.f12646d, c1057b.f12646d) && m.a(this.f12647e, c1057b.f12647e) && m.a(this.f, c1057b.f) && m.a(this.f12648g, c1057b.f12648g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f12643a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f12644b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f12645c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f12646d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f12647e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f12648g;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbR = S.r("NotificationModel(id=", this.f12643a, ", imageUrl=", this.f12644b, ", title=");
        k1.i.s(sbR, this.f12645c, ", body=", this.f12646d, ", time=");
        k1.i.s(sbR, this.f12647e, ", deeplinkUrl=", this.f, ", read=");
        return k1.i.k(sbR, this.f12648g, ")");
    }
}
