package r6;

import java.util.ArrayList;
import kotlin.jvm.internal.m;
import q6.x;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f16383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f16386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f16387e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f16388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f16389h;
    public final int i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Long f16390k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Long f16391l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Long f16392m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f16393n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Integer f16394o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f16395p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f16396q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(x canonicalPath, boolean z5, String comment, long j, long j7, long j8, int i, long j9, int i7, int i8, Long l7, Long l8, Long l9, Integer num, Integer num2, Integer num3) {
        m.e(canonicalPath, "canonicalPath");
        m.e(comment, "comment");
        this.f16383a = canonicalPath;
        this.f16384b = z5;
        this.f16385c = comment;
        this.f16386d = j;
        this.f16387e = j7;
        this.f = j8;
        this.f16388g = i;
        this.f16389h = j9;
        this.i = i7;
        this.j = i8;
        this.f16390k = l7;
        this.f16391l = l8;
        this.f16392m = l9;
        this.f16393n = num;
        this.f16394o = num2;
        this.f16395p = num3;
        this.f16396q = new ArrayList();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0070: CONSTRUCTOR 
  (r24v0 q6.x)
  (r25v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r41v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000c: ARITH (r41v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r27v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0016: ARITH (r41v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r29v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x001e: ARITH (r41v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r31v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0026: ARITH (r41v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r33v0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x002f: ARITH (r41v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r34v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0037: ARITH (r41v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r36v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003f: ARITH (r41v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r37v0 int))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0048: ARITH (r41v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r38v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0052: ARITH (r41v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r39v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x005b: ARITH (r41v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r40v0 java.lang.Long))
  (null java.lang.Integer)
  (null java.lang.Integer)
  (null java.lang.Integer)
 A[MD:(q6.x, boolean, java.lang.String, long, long, long, int, long, int, int, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.Integer):void (m)] (LINE:20) call: r6.h.<init>(q6.x, boolean, java.lang.String, long, long, long, int, long, int, int, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.Integer):void type: THIS */
    public /* synthetic */ h(x xVar, boolean z5, String str, long j, long j7, long j8, int i, long j9, int i7, int i8, Long l7, Long l8, Long l9, int i9) {
        this(xVar, z5, (i9 & 4) != 0 ? "" : str, (i9 & 8) != 0 ? -1L : j, (i9 & 16) != 0 ? -1L : j7, (i9 & 32) != 0 ? -1L : j8, (i9 & 64) != 0 ? -1 : i, (i9 & 128) != 0 ? -1L : j9, (i9 & 256) != 0 ? -1 : i7, (i9 & 512) != 0 ? -1 : i8, (i9 & 1024) != 0 ? null : l7, (i9 & 2048) != 0 ? null : l8, (i9 & 4096) != 0 ? null : l9, null, null, null);
    }
}
