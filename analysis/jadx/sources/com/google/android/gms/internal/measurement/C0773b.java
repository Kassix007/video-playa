package com.google.android.gms.internal.measurement;

import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0773b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final H4.f f10798d = H4.f.l(3, "_syn", "_err", "_el");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f10801c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0773b(String str, long j, HashMap map) {
        this.f10799a = str;
        this.f10800b = j;
        HashMap map2 = new HashMap();
        this.f10801c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object b(Object obj, Object obj2, String str) {
        if (f10798d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0773b clone() {
        return new C0773b(this.f10799a, this.f10800b, new HashMap(this.f10801c));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0773b)) {
            return false;
        }
        C0773b c0773b = (C0773b) obj;
        if (this.f10800b == c0773b.f10800b && this.f10799a.equals(c0773b.f10799a)) {
            return this.f10801c.equals(c0773b.f10801c);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f10799a.hashCode() * 31;
        long j = this.f10800b;
        return this.f10801c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = this.f10799a;
        String string = this.f10801c.toString();
        int length = String.valueOf(str).length();
        long j = this.f10800b;
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(j).length() + 9 + string.length() + 1);
        sb.append("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        sb.append(j);
        sb.append(", params=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
