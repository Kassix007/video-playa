package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0826l2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC0826l2 f10893r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC0826l2 f10894s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC0826l2[] f10895t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ EnumC0826l2[] f10896u;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f10897q;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0826l2 EF0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        A2 a22 = A2.f10588u;
        EnumC0826l2 enumC0826l2 = new EnumC0826l2("DOUBLE", 0, 0, 1, a22);
        A2 a23 = A2.f10587t;
        EnumC0826l2 enumC0826l22 = new EnumC0826l2("FLOAT", 1, 1, 1, a23);
        A2 a24 = A2.f10586s;
        EnumC0826l2 enumC0826l23 = new EnumC0826l2("INT64", 2, 2, 1, a24);
        EnumC0826l2 enumC0826l24 = new EnumC0826l2("UINT64", 3, 3, 1, a24);
        A2 a25 = A2.f10585r;
        EnumC0826l2 enumC0826l25 = new EnumC0826l2("INT32", 4, 4, 1, a25);
        EnumC0826l2 enumC0826l26 = new EnumC0826l2("FIXED64", 5, 5, 1, a24);
        EnumC0826l2 enumC0826l27 = new EnumC0826l2("FIXED32", 6, 6, 1, a25);
        A2 a26 = A2.f10589v;
        EnumC0826l2 enumC0826l28 = new EnumC0826l2("BOOL", 7, 7, 1, a26);
        A2 a27 = A2.f10590w;
        EnumC0826l2 enumC0826l29 = new EnumC0826l2("STRING", 8, 8, 1, a27);
        A2 a28 = A2.f10593z;
        EnumC0826l2 enumC0826l210 = new EnumC0826l2("MESSAGE", 9, 9, 1, a28);
        A2 a29 = A2.f10591x;
        EnumC0826l2 enumC0826l211 = new EnumC0826l2("BYTES", 10, 10, 1, a29);
        EnumC0826l2 enumC0826l212 = new EnumC0826l2("UINT32", 11, 11, 1, a25);
        A2 a210 = A2.f10592y;
        EnumC0826l2 enumC0826l213 = new EnumC0826l2("ENUM", 12, 12, 1, a210);
        EnumC0826l2 enumC0826l214 = new EnumC0826l2("SFIXED32", 13, 13, 1, a25);
        EnumC0826l2 enumC0826l215 = new EnumC0826l2("SFIXED64", 14, 14, 1, a24);
        EnumC0826l2 enumC0826l216 = new EnumC0826l2("SINT32", 15, 15, 1, a25);
        EnumC0826l2 enumC0826l217 = new EnumC0826l2("SINT64", 16, 16, 1, a24);
        EnumC0826l2 enumC0826l218 = new EnumC0826l2("GROUP", 17, 17, 1, a28);
        EnumC0826l2 enumC0826l219 = new EnumC0826l2("DOUBLE_LIST", 18, 18, 2, a22);
        EnumC0826l2 enumC0826l220 = new EnumC0826l2("FLOAT_LIST", 19, 19, 2, a23);
        EnumC0826l2 enumC0826l221 = new EnumC0826l2("INT64_LIST", 20, 20, 2, a24);
        EnumC0826l2 enumC0826l222 = new EnumC0826l2("UINT64_LIST", 21, 21, 2, a24);
        EnumC0826l2 enumC0826l223 = new EnumC0826l2("INT32_LIST", 22, 22, 2, a25);
        EnumC0826l2 enumC0826l224 = new EnumC0826l2("FIXED64_LIST", 23, 23, 2, a24);
        EnumC0826l2 enumC0826l225 = new EnumC0826l2("FIXED32_LIST", 24, 24, 2, a25);
        EnumC0826l2 enumC0826l226 = new EnumC0826l2("BOOL_LIST", 25, 25, 2, a26);
        EnumC0826l2 enumC0826l227 = new EnumC0826l2("STRING_LIST", 26, 26, 2, a27);
        EnumC0826l2 enumC0826l228 = new EnumC0826l2("MESSAGE_LIST", 27, 27, 2, a28);
        EnumC0826l2 enumC0826l229 = new EnumC0826l2("BYTES_LIST", 28, 28, 2, a29);
        EnumC0826l2 enumC0826l230 = new EnumC0826l2("UINT32_LIST", 29, 29, 2, a25);
        EnumC0826l2 enumC0826l231 = new EnumC0826l2("ENUM_LIST", 30, 30, 2, a210);
        EnumC0826l2 enumC0826l232 = new EnumC0826l2("SFIXED32_LIST", 31, 31, 2, a25);
        EnumC0826l2 enumC0826l233 = new EnumC0826l2("SFIXED64_LIST", 32, 32, 2, a24);
        EnumC0826l2 enumC0826l234 = new EnumC0826l2("SINT32_LIST", 33, 33, 2, a25);
        EnumC0826l2 enumC0826l235 = new EnumC0826l2("SINT64_LIST", 34, 34, 2, a24);
        EnumC0826l2 enumC0826l236 = new EnumC0826l2("DOUBLE_LIST_PACKED", 35, 35, 3, a22);
        f10893r = enumC0826l236;
        EnumC0826l2 enumC0826l237 = new EnumC0826l2("FLOAT_LIST_PACKED", 36, 36, 3, a23);
        EnumC0826l2 enumC0826l238 = new EnumC0826l2("INT64_LIST_PACKED", 37, 37, 3, a24);
        EnumC0826l2 enumC0826l239 = new EnumC0826l2("UINT64_LIST_PACKED", 38, 38, 3, a24);
        EnumC0826l2 enumC0826l240 = new EnumC0826l2("INT32_LIST_PACKED", 39, 39, 3, a25);
        EnumC0826l2 enumC0826l241 = new EnumC0826l2("FIXED64_LIST_PACKED", 40, 40, 3, a24);
        EnumC0826l2 enumC0826l242 = new EnumC0826l2("FIXED32_LIST_PACKED", 41, 41, 3, a25);
        EnumC0826l2 enumC0826l243 = new EnumC0826l2("BOOL_LIST_PACKED", 42, 42, 3, a26);
        EnumC0826l2 enumC0826l244 = new EnumC0826l2("UINT32_LIST_PACKED", 43, 43, 3, a25);
        EnumC0826l2 enumC0826l245 = new EnumC0826l2("ENUM_LIST_PACKED", 44, 44, 3, a210);
        EnumC0826l2 enumC0826l246 = new EnumC0826l2("SFIXED32_LIST_PACKED", 45, 45, 3, a25);
        EnumC0826l2 enumC0826l247 = new EnumC0826l2("SFIXED64_LIST_PACKED", 46, 46, 3, a24);
        EnumC0826l2 enumC0826l248 = new EnumC0826l2("SINT32_LIST_PACKED", 47, 47, 3, a25);
        EnumC0826l2 enumC0826l249 = new EnumC0826l2("SINT64_LIST_PACKED", 48, 48, 3, a24);
        f10894s = enumC0826l249;
        f10896u = new EnumC0826l2[]{enumC0826l2, enumC0826l22, enumC0826l23, enumC0826l24, enumC0826l25, enumC0826l26, enumC0826l27, enumC0826l28, enumC0826l29, enumC0826l210, enumC0826l211, enumC0826l212, enumC0826l213, enumC0826l214, enumC0826l215, enumC0826l216, enumC0826l217, enumC0826l218, enumC0826l219, enumC0826l220, enumC0826l221, enumC0826l222, enumC0826l223, enumC0826l224, enumC0826l225, enumC0826l226, enumC0826l227, enumC0826l228, enumC0826l229, enumC0826l230, enumC0826l231, enumC0826l232, enumC0826l233, enumC0826l234, enumC0826l235, enumC0826l236, enumC0826l237, enumC0826l238, enumC0826l239, enumC0826l240, enumC0826l241, enumC0826l242, enumC0826l243, enumC0826l244, enumC0826l245, enumC0826l246, enumC0826l247, enumC0826l248, enumC0826l249, new EnumC0826l2("GROUP_LIST", 49, 49, 2, a28), new EnumC0826l2("MAP", 50, 50, 4, A2.f10584q)};
        EnumC0826l2[] enumC0826l2ArrValues = values();
        f10895t = new EnumC0826l2[enumC0826l2ArrValues.length];
        for (EnumC0826l2 enumC0826l250 : enumC0826l2ArrValues) {
            f10895t[enumC0826l250.f10897q] = enumC0826l250;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EnumC0826l2(String str, int i, int i7, int i8, A2 a22) {
        this.f10897q = i7;
        int i9 = i8 - 1;
        if (i9 == 1 || i9 == 3) {
            a22.getClass();
        }
        if (i8 == 1) {
            A2 a23 = A2.f10584q;
            a22.ordinal();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0826l2[] values() {
        return (EnumC0826l2[]) f10896u.clone();
    }
}
