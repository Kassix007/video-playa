package J5;

import C0.S;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f2821d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f2823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f2824c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        d dVar = d.f2818a;
        e eVar = e.f2819b;
        f2821d = new f(false, dVar, eVar);
        new f(true, dVar, eVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f(boolean z5, d bytes, e number) {
        kotlin.jvm.internal.m.e(bytes, "bytes");
        kotlin.jvm.internal.m.e(number, "number");
        this.f2822a = z5;
        this.f2823b = bytes;
        this.f2824c = number;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbQ = S.q("HexFormat(\n    upperCase = ");
        sbQ.append(this.f2822a);
        sbQ.append(",\n    bytes = BytesHexFormat(\n");
        this.f2823b.a(sbQ, "        ");
        sbQ.append('\n');
        sbQ.append("    ),");
        sbQ.append('\n');
        sbQ.append("    number = NumberHexFormat(");
        sbQ.append('\n');
        this.f2824c.a(sbQ, "        ");
        sbQ.append('\n');
        sbQ.append("    )");
        sbQ.append('\n');
        sbQ.append(")");
        return sbQ.toString();
    }
}
