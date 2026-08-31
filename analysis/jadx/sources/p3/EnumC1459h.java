package p3;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: p3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1459h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC1459h f15771q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC1459h f15772r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC1459h f15773s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC1459h f15774t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final HashMap f15775u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ EnumC1459h[] f15776v;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1459h EF1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1459h enumC1459h = new EnumC1459h("target", 0);
        EnumC1459h enumC1459h2 = new EnumC1459h("root", 1);
        EnumC1459h enumC1459h3 = new EnumC1459h("nth_child", 2);
        f15771q = enumC1459h3;
        EnumC1459h enumC1459h4 = new EnumC1459h("nth_last_child", 3);
        EnumC1459h enumC1459h5 = new EnumC1459h("nth_of_type", 4);
        f15772r = enumC1459h5;
        EnumC1459h enumC1459h6 = new EnumC1459h("nth_last_of_type", 5);
        f15773s = enumC1459h6;
        EnumC1459h enumC1459h7 = new EnumC1459h("first_child", 6);
        EnumC1459h enumC1459h8 = new EnumC1459h("last_child", 7);
        EnumC1459h enumC1459h9 = new EnumC1459h("first_of_type", 8);
        EnumC1459h enumC1459h10 = new EnumC1459h("last_of_type", 9);
        EnumC1459h enumC1459h11 = new EnumC1459h("only_child", 10);
        EnumC1459h enumC1459h12 = new EnumC1459h("only_of_type", 11);
        EnumC1459h enumC1459h13 = new EnumC1459h("empty", 12);
        EnumC1459h enumC1459h14 = new EnumC1459h("not", 13);
        EnumC1459h enumC1459h15 = new EnumC1459h("lang", 14);
        EnumC1459h enumC1459h16 = new EnumC1459h("link", 15);
        EnumC1459h enumC1459h17 = new EnumC1459h("visited", 16);
        EnumC1459h enumC1459h18 = new EnumC1459h("hover", 17);
        EnumC1459h enumC1459h19 = new EnumC1459h("active", 18);
        EnumC1459h enumC1459h20 = new EnumC1459h("focus", 19);
        EnumC1459h enumC1459h21 = new EnumC1459h("enabled", 20);
        EnumC1459h enumC1459h22 = new EnumC1459h("disabled", 21);
        EnumC1459h enumC1459h23 = new EnumC1459h("checked", 22);
        EnumC1459h enumC1459h24 = new EnumC1459h("indeterminate", 23);
        EnumC1459h enumC1459h25 = new EnumC1459h("UNSUPPORTED", 24);
        f15774t = enumC1459h25;
        f15776v = new EnumC1459h[]{enumC1459h, enumC1459h2, enumC1459h3, enumC1459h4, enumC1459h5, enumC1459h6, enumC1459h7, enumC1459h8, enumC1459h9, enumC1459h10, enumC1459h11, enumC1459h12, enumC1459h13, enumC1459h14, enumC1459h15, enumC1459h16, enumC1459h17, enumC1459h18, enumC1459h19, enumC1459h20, enumC1459h21, enumC1459h22, enumC1459h23, enumC1459h24, enumC1459h25};
        f15775u = new HashMap();
        for (EnumC1459h enumC1459h26 : values()) {
            if (enumC1459h26 != f15774t) {
                f15775u.put(enumC1459h26.name().replace('_', '-'), enumC1459h26);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1459h valueOf(String str) {
        return (EnumC1459h) Enum.valueOf(EnumC1459h.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1459h[] values() {
        return (EnumC1459h[]) f15776v.clone();
    }
}
