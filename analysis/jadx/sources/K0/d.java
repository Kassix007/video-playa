package k0;

import C0.Z0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f13982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f13983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f13984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f13985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f13986e;
    public static final q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q f13987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q f13988h;
    public static final q i;
    public static final q j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final q f13989k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final q f13990l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final q f13991m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final q f13992n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final q f13993o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final q f13994p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final q f13995q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final q f13996r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final k f13997s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final k f13998t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final q f13999u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final q f14000v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final q f14001w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final l f14002x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c[] f14003y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f13982a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f13983b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        r rVar = new r(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        r rVar2 = new r(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        r rVar3 = new r(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f13984c = rVar3;
        r rVar4 = new r(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f13985d = rVar4;
        s sVar = j.f14014d;
        q qVar = new q("sRGB IEC61966-2.1", fArr, sVar, rVar, 0);
        f13986e = qVar;
        q qVar2 = new q("sRGB IEC61966-2.1 (Linear)", fArr, sVar, 1.0d, 0.0f, 1.0f, 1);
        f = qVar2;
        q qVar3 = new q("scRGB-nl IEC 61966-2-2:2003", fArr, sVar, null, new Z0(9), new Z0(10), -0.799f, 2.399f, rVar, 2);
        f13987g = qVar3;
        q qVar4 = new q("scRGB IEC 61966-2-2:2003", fArr, sVar, 1.0d, -0.5f, 7.499f, 3);
        f13988h = qVar4;
        q qVar5 = new q("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, sVar, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = qVar5;
        q qVar6 = new q("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, sVar, new r(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = qVar6;
        q qVar7 = new q("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new s(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f13989k = qVar7;
        q qVar8 = new q("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, sVar, rVar, 7);
        f13990l = qVar8;
        q qVar9 = new q("NTSC (1953)", fArr2, j.f14011a, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f13991m = qVar9;
        q qVar10 = new q("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, sVar, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f13992n = qVar10;
        q qVar11 = new q("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, sVar, 2.2d, 0.0f, 1.0f, 10);
        f13993o = qVar11;
        q qVar12 = new q("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, j.f14012b, new r(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f13994p = qVar12;
        s sVar2 = j.f14013c;
        q qVar13 = new q("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, sVar2, 1.0d, -65504.0f, 65504.0f, 12);
        f13995q = qVar13;
        q qVar14 = new q("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, sVar2, 1.0d, -65504.0f, 65504.0f, 13);
        f13996r = qVar14;
        k kVar = new k(14, 1, b.f13975b, "Generic XYZ");
        f13997s = kVar;
        long j7 = b.f13976c;
        k kVar2 = new k(15, 0, j7, "Generic L*a*b*");
        f13998t = kVar2;
        q qVar15 = new q("None", fArr, sVar, rVar2, 16);
        f13999u = qVar15;
        q qVar16 = new q("Hybrid Log Gamma encoding", fArr3, sVar, null, new Z0(11), new Z0(12), 0.0f, 1.0f, rVar3, 17);
        f14000v = qVar16;
        q qVar17 = new q("Perceptual Quantizer encoding", fArr3, sVar, null, new Z0(13), new Z0(14), 0.0f, 1.0f, rVar4, 18);
        f14001w = qVar17;
        l lVar = new l("Oklab", j7, 19);
        f14002x = lVar;
        f14003y = new c[]{qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9, qVar10, qVar11, qVar12, qVar13, qVar14, kVar, kVar2, qVar15, qVar16, qVar17, lVar};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static double a(r rVar, double d5) {
        double d7 = d5 < 0.0d ? -1.0d : 1.0d;
        double d8 = d5 * d7;
        double d9 = rVar.f14041b;
        double d10 = rVar.f14042c;
        double d11 = rVar.f14043d;
        double d12 = rVar.f14044e;
        double d13 = rVar.f;
        double d14 = d9 * d8;
        return (rVar.f14045g + 1.0d) * d7 * (d14 <= 1.0d ? Math.pow(d14, d10) : Math.exp((d8 - d13) * d11) + d12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static double b(r rVar, double d5) {
        double d7 = d5 < 0.0d ? -1.0d : 1.0d;
        double d8 = 1.0d / rVar.f14041b;
        double d9 = 1.0d / rVar.f14042c;
        double d10 = 1.0d / rVar.f14043d;
        double d11 = rVar.f14044e;
        double d12 = rVar.f;
        double d13 = (d5 * d7) / (rVar.f14045g + 1.0d);
        return d7 * (d13 <= 1.0d ? Math.pow(d13, d9) * d8 : (Math.log(d13 - d11) * d10) + d12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static double c(r rVar, double d5) {
        double d7 = d5 < 0.0d ? -1.0d : 1.0d;
        double d8 = d5 * d7;
        double d9 = rVar.f14041b;
        double d10 = rVar.f14043d;
        double dPow = (Math.pow(d8, d10) * rVar.f14042c) + d9;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d8, d10) * rVar.f) + rVar.f14044e), rVar.f14045g) * d7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static double d(r rVar, double d5) {
        double d7 = d5 < 0.0d ? -1.0d : 1.0d;
        double d8 = d5 * d7;
        double d9 = -rVar.f14041b;
        double d10 = rVar.f14044e;
        double d11 = 1.0d / rVar.f14045g;
        return Math.pow(Math.max((Math.pow(d8, d11) * d10) + d9, 0.0d) / ((Math.pow(d8, d11) * (-rVar.f)) + rVar.f14042c), 1.0d / rVar.f14043d) * d7;
    }
}
