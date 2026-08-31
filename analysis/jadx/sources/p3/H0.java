package p3;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class H0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final H0 f15660q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final H0 f15661r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final H0 f15662s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final H0 f15663t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final HashMap f15664u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ H0[] f15665v;

    /* JADX INFO: Fake field, exist only in values array */
    H0 EF1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        H0 h02 = new H0("svg", 0);
        H0 h03 = new H0("a", 1);
        H0 h04 = new H0("circle", 2);
        H0 h05 = new H0("clipPath", 3);
        H0 h06 = new H0("defs", 4);
        H0 h07 = new H0("desc", 5);
        f15660q = h07;
        H0 h08 = new H0("ellipse", 6);
        H0 h09 = new H0("g", 7);
        H0 h010 = new H0("image", 8);
        H0 h011 = new H0("line", 9);
        H0 h012 = new H0("linearGradient", 10);
        H0 h013 = new H0("marker", 11);
        H0 h014 = new H0("mask", 12);
        H0 h015 = new H0("path", 13);
        H0 h016 = new H0("pattern", 14);
        H0 h017 = new H0("polygon", 15);
        H0 h018 = new H0("polyline", 16);
        H0 h019 = new H0("radialGradient", 17);
        H0 h020 = new H0("rect", 18);
        H0 h021 = new H0("solidColor", 19);
        H0 h022 = new H0("stop", 20);
        H0 h023 = new H0("style", 21);
        H0 h024 = new H0("SWITCH", 22);
        f15661r = h024;
        H0 h025 = new H0("symbol", 23);
        H0 h026 = new H0("text", 24);
        H0 h027 = new H0("textPath", 25);
        H0 h028 = new H0("title", 26);
        f15662s = h028;
        H0 h029 = new H0("tref", 27);
        H0 h030 = new H0("tspan", 28);
        H0 h031 = new H0("use", 29);
        H0 h032 = new H0("view", 30);
        H0 h033 = new H0("UNSUPPORTED", 31);
        f15663t = h033;
        f15665v = new H0[]{h02, h03, h04, h05, h06, h07, h08, h09, h010, h011, h012, h013, h014, h015, h016, h017, h018, h019, h020, h021, h022, h023, h024, h025, h026, h027, h028, h029, h030, h031, h032, h033};
        f15664u = new HashMap();
        for (H0 h034 : values()) {
            if (h034 == f15661r) {
                f15664u.put("switch", h034);
            } else if (h034 != f15663t) {
                f15664u.put(h034.name(), h034);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static H0 valueOf(String str) {
        return (H0) Enum.valueOf(H0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static H0[] values() {
        return (H0[]) f15665v.clone();
    }
}
