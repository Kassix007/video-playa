package g1;

import C0.S;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkDatabaseVersions;
import androidx.work.impl.WorkManagerImpl;
import c1.AbstractC0729a;
import d1.C0950a;
import f1.AbstractC1060a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f13019d = {0, 4, 8};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f13020e;
    public static final SparseIntArray f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f13021a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13022b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f13023c = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f13020e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int[] c(C1071a c1071a, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = c1071a.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i7 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = q.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && c1071a.isInEditMode() && (c1071a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c1071a.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.f9384C;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.f9384C.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i7] = iIntValue;
            i++;
            i7++;
        }
        return i7 != strArrSplit.length ? Arrays.copyOf(iArr, i7) : iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1079i d(Context context, AttributeSet attributeSet, boolean z5) {
        int i;
        int i7;
        C1079i c1079i = new C1079i();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5 ? r.f13027c : r.f13025a);
        l lVar = c1079i.f12928b;
        m mVar = c1079i.f12931e;
        k kVar = c1079i.f12929c;
        C1080j c1080j = c1079i.f12930d;
        int[] iArr = f13019d;
        String[] strArr = AbstractC0729a.f10112a;
        SparseIntArray sparseIntArray = f13020e;
        if (z5) {
            C1078h c1078h = new C1078h();
            c1078h.f12918a = new int[10];
            c1078h.f12919b = new int[10];
            c1078h.f12920c = 0;
            c1078h.f12921d = new int[10];
            c1078h.f12922e = new float[10];
            c1078h.f = 0;
            c1078h.f12923g = new int[5];
            c1078h.f12924h = new String[5];
            c1078h.i = 0;
            c1078h.j = new int[4];
            c1078h.f12925k = new boolean[4];
            c1078h.f12926l = 0;
            kVar.getClass();
            c1080j.getClass();
            mVar.getClass();
            int i8 = 0;
            for (int indexCount = typedArrayObtainStyledAttributes.getIndexCount(); i8 < indexCount; indexCount = i7) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                int i9 = i8;
                switch (f.get(index)) {
                    case 2:
                        i7 = indexCount;
                        c1078h.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1080j.f12941I));
                        continue;
                        i8 = i9 + 1;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i7 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i7 = indexCount;
                        c1078h.c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i8 = i9 + 1;
                        break;
                    case 6:
                        i7 = indexCount;
                        c1078h.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1080j.f12935C));
                        break;
                    case 7:
                        i7 = indexCount;
                        c1078h.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1080j.f12936D));
                        break;
                    case 8:
                        i7 = indexCount;
                        c1078h.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1080j.f12942J));
                        break;
                    case 11:
                        i7 = indexCount;
                        c1078h.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1080j.f12948P));
                        break;
                    case 12:
                        i7 = indexCount;
                        c1078h.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1080j.f12949Q));
                        break;
                    case 13:
                        i7 = indexCount;
                        c1078h.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1080j.f12945M));
                        break;
                    case 14:
                        i7 = indexCount;
                        c1078h.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1080j.f12947O));
                        break;
                    case 15:
                        i7 = indexCount;
                        c1078h.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1080j.f12950R));
                        break;
                    case WorkDatabaseVersions.VERSION_16 /* 16 */:
                        i7 = indexCount;
                        c1078h.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1080j.f12946N));
                        break;
                    case WorkDatabaseVersions.VERSION_17 /* 17 */:
                        i7 = indexCount;
                        c1078h.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1080j.f12965d));
                        break;
                    case WorkDatabaseVersions.VERSION_18 /* 18 */:
                        i7 = indexCount;
                        c1078h.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1080j.f12967e));
                        break;
                    case WorkDatabaseVersions.VERSION_19 /* 19 */:
                        i7 = indexCount;
                        c1078h.a(19, typedArrayObtainStyledAttributes.getFloat(index, c1080j.f));
                        break;
                    case 20:
                        i7 = indexCount;
                        c1078h.a(20, typedArrayObtainStyledAttributes.getFloat(index, c1080j.f12993w));
                        break;
                    case WorkDatabaseVersions.VERSION_21 /* 21 */:
                        i7 = indexCount;
                        c1078h.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, c1080j.f12963c));
                        break;
                    case 22:
                        i7 = indexCount;
                        c1078h.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, lVar.f13004a)]);
                        break;
                    case WorkManagerImpl.MIN_JOB_SCHEDULER_API_LEVEL /* 23 */:
                        i7 = indexCount;
                        c1078h.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, c1080j.f12961b));
                        break;
                    case WorkManagerImpl.CONTENT_URI_TRIGGER_API_LEVEL /* 24 */:
                        i7 = indexCount;
                        c1078h.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1080j.f12938F));
                        break;
                    case 27:
                        i7 = indexCount;
                        c1078h.b(27, typedArrayObtainStyledAttributes.getInt(index, c1080j.f12937E));
                        break;
                    case 28:
                        i7 = indexCount;
                        c1078h.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1080j.f12939G));
                        break;
                    case 31:
                        i7 = indexCount;
                        c1078h.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1080j.f12943K));
                        break;
                    case 34:
                        i7 = indexCount;
                        c1078h.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1080j.f12940H));
                        break;
                    case 37:
                        i7 = indexCount;
                        c1078h.a(37, typedArrayObtainStyledAttributes.getFloat(index, c1080j.f12994x));
                        break;
                    case 38:
                        i7 = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c1079i.f12927a);
                        c1079i.f12927a = resourceId;
                        c1078h.b(38, resourceId);
                        break;
                    case 39:
                        i7 = indexCount;
                        c1078h.a(39, typedArrayObtainStyledAttributes.getFloat(index, c1080j.f12953U));
                        break;
                    case 40:
                        i7 = indexCount;
                        c1078h.a(40, typedArrayObtainStyledAttributes.getFloat(index, c1080j.f12952T));
                        break;
                    case 41:
                        i7 = indexCount;
                        c1078h.b(41, typedArrayObtainStyledAttributes.getInt(index, c1080j.f12954V));
                        break;
                    case 42:
                        i7 = indexCount;
                        c1078h.b(42, typedArrayObtainStyledAttributes.getInt(index, c1080j.f12955W));
                        break;
                    case 43:
                        i7 = indexCount;
                        c1078h.a(43, typedArrayObtainStyledAttributes.getFloat(index, lVar.f13006c));
                        break;
                    case 44:
                        i7 = indexCount;
                        c1078h.d(44, true);
                        c1078h.a(44, typedArrayObtainStyledAttributes.getDimension(index, mVar.f13018m));
                        break;
                    case 45:
                        i7 = indexCount;
                        c1078h.a(45, typedArrayObtainStyledAttributes.getFloat(index, mVar.f13010b));
                        break;
                    case 46:
                        i7 = indexCount;
                        c1078h.a(46, typedArrayObtainStyledAttributes.getFloat(index, mVar.f13011c));
                        break;
                    case 47:
                        i7 = indexCount;
                        c1078h.a(47, typedArrayObtainStyledAttributes.getFloat(index, mVar.f13012d));
                        break;
                    case 48:
                        i7 = indexCount;
                        c1078h.a(48, typedArrayObtainStyledAttributes.getFloat(index, mVar.f13013e));
                        break;
                    case 49:
                        i7 = indexCount;
                        c1078h.a(49, typedArrayObtainStyledAttributes.getDimension(index, mVar.f));
                        break;
                    case Scheduler.MAX_SCHEDULER_LIMIT /* 50 */:
                        i7 = indexCount;
                        c1078h.a(50, typedArrayObtainStyledAttributes.getDimension(index, mVar.f13014g));
                        break;
                    case 51:
                        i7 = indexCount;
                        c1078h.a(51, typedArrayObtainStyledAttributes.getDimension(index, mVar.i));
                        break;
                    case 52:
                        i7 = indexCount;
                        c1078h.a(52, typedArrayObtainStyledAttributes.getDimension(index, mVar.j));
                        break;
                    case 53:
                        i7 = indexCount;
                        c1078h.a(53, typedArrayObtainStyledAttributes.getDimension(index, mVar.f13016k));
                        break;
                    case 54:
                        i7 = indexCount;
                        c1078h.b(54, typedArrayObtainStyledAttributes.getInt(index, c1080j.f12956X));
                        break;
                    case 55:
                        i7 = indexCount;
                        c1078h.b(55, typedArrayObtainStyledAttributes.getInt(index, c1080j.f12957Y));
                        break;
                    case 56:
                        i7 = indexCount;
                        c1078h.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1080j.f12958Z));
                        break;
                    case 57:
                        i7 = indexCount;
                        c1078h.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1080j.f12960a0));
                        break;
                    case 58:
                        i7 = indexCount;
                        c1078h.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1080j.f12962b0));
                        break;
                    case 59:
                        i7 = indexCount;
                        c1078h.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1080j.f12964c0));
                        break;
                    case 60:
                        i7 = indexCount;
                        c1078h.a(60, typedArrayObtainStyledAttributes.getFloat(index, mVar.f13009a));
                        break;
                    case 62:
                        i7 = indexCount;
                        c1078h.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1080j.f12933A));
                        break;
                    case 63:
                        i7 = indexCount;
                        c1078h.a(63, typedArrayObtainStyledAttributes.getFloat(index, c1080j.f12934B));
                        break;
                    case 64:
                        i7 = indexCount;
                        c1078h.b(64, f(typedArrayObtainStyledAttributes, index, kVar.f12997a));
                        break;
                    case 65:
                        i7 = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            c1078h.c(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            c1078h.c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        break;
                    case 66:
                        i7 = indexCount;
                        c1078h.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i7 = indexCount;
                        c1078h.a(67, typedArrayObtainStyledAttributes.getFloat(index, kVar.f13001e));
                        break;
                    case 68:
                        i7 = indexCount;
                        c1078h.a(68, typedArrayObtainStyledAttributes.getFloat(index, lVar.f13007d));
                        break;
                    case 69:
                        i7 = indexCount;
                        c1078h.a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i7 = indexCount;
                        c1078h.a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i7 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i7 = indexCount;
                        c1078h.b(72, typedArrayObtainStyledAttributes.getInt(index, c1080j.f12969f0));
                        break;
                    case 73:
                        i7 = indexCount;
                        c1078h.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1080j.f12971g0));
                        break;
                    case 74:
                        i7 = indexCount;
                        c1078h.c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i7 = indexCount;
                        c1078h.d(75, typedArrayObtainStyledAttributes.getBoolean(index, c1080j.f12983n0));
                        break;
                    case 76:
                        i7 = indexCount;
                        c1078h.b(76, typedArrayObtainStyledAttributes.getInt(index, kVar.f12999c));
                        break;
                    case 77:
                        i7 = indexCount;
                        c1078h.c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i7 = indexCount;
                        c1078h.b(78, typedArrayObtainStyledAttributes.getInt(index, lVar.f13005b));
                        break;
                    case 79:
                        i7 = indexCount;
                        c1078h.a(79, typedArrayObtainStyledAttributes.getFloat(index, kVar.f13000d));
                        break;
                    case 80:
                        i7 = indexCount;
                        c1078h.d(80, typedArrayObtainStyledAttributes.getBoolean(index, c1080j.f12979l0));
                        break;
                    case 81:
                        i7 = indexCount;
                        c1078h.d(81, typedArrayObtainStyledAttributes.getBoolean(index, c1080j.f12981m0));
                        break;
                    case 82:
                        i7 = indexCount;
                        c1078h.b(82, typedArrayObtainStyledAttributes.getInteger(index, kVar.f12998b));
                        break;
                    case 83:
                        i7 = indexCount;
                        c1078h.b(83, f(typedArrayObtainStyledAttributes, index, mVar.f13015h));
                        break;
                    case 84:
                        i7 = indexCount;
                        c1078h.b(84, typedArrayObtainStyledAttributes.getInteger(index, kVar.f13002g));
                        break;
                    case 85:
                        i7 = indexCount;
                        c1078h.a(85, typedArrayObtainStyledAttributes.getFloat(index, kVar.f));
                        break;
                    case 86:
                        i7 = indexCount;
                        int i10 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i10 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            kVar.i = resourceId2;
                            c1078h.b(89, resourceId2);
                            if (kVar.i != -1) {
                                c1078h.b(88, -2);
                            }
                        } else if (i10 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            kVar.f13003h = string;
                            c1078h.c(90, string);
                            if (kVar.f13003h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                kVar.i = resourceId3;
                                c1078h.b(89, resourceId3);
                                c1078h.b(88, -2);
                            } else {
                                c1078h.b(88, -1);
                            }
                        } else {
                            c1078h.b(88, typedArrayObtainStyledAttributes.getInteger(index, kVar.i));
                        }
                        break;
                    case 87:
                        i7 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i7 = indexCount;
                        c1078h.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1080j.f12944L));
                        break;
                    case 94:
                        i7 = indexCount;
                        c1078h.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1080j.f12951S));
                        break;
                    case 95:
                        i7 = indexCount;
                        g(c1078h, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i7 = indexCount;
                        g(c1078h, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i7 = indexCount;
                        c1078h.b(97, typedArrayObtainStyledAttributes.getInt(index, c1080j.f12985o0));
                        break;
                    case 98:
                        i7 = indexCount;
                        int i11 = AbstractC1060a.f12690G;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            c1079i.f12927a = typedArrayObtainStyledAttributes.getResourceId(index, c1079i.f12927a);
                        }
                        break;
                    case 99:
                        i7 = indexCount;
                        c1078h.d(99, typedArrayObtainStyledAttributes.getBoolean(index, c1080j.f12970g));
                        break;
                }
                i8 = i9 + 1;
            }
        } else {
            int i12 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i12 < indexCount2; indexCount2 = i) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        kVar.getClass();
                        c1080j.getClass();
                        mVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        c1080j.f12986p = f(typedArrayObtainStyledAttributes, index2, c1080j.f12986p);
                        continue;
                        i12++;
                        break;
                    case 2:
                        i = indexCount2;
                        c1080j.f12941I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1080j.f12941I);
                        continue;
                        i12++;
                        break;
                    case 3:
                        i = indexCount2;
                        c1080j.f12984o = f(typedArrayObtainStyledAttributes, index2, c1080j.f12984o);
                        continue;
                        i12++;
                        break;
                    case 4:
                        i = indexCount2;
                        c1080j.f12982n = f(typedArrayObtainStyledAttributes, index2, c1080j.f12982n);
                        continue;
                        i12++;
                        break;
                    case 5:
                        i = indexCount2;
                        c1080j.f12995y = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i12++;
                        break;
                    case 6:
                        i = indexCount2;
                        c1080j.f12935C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1080j.f12935C);
                        continue;
                        i12++;
                        break;
                    case 7:
                        i = indexCount2;
                        c1080j.f12936D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1080j.f12936D);
                        continue;
                        i12++;
                        break;
                    case 8:
                        i = indexCount2;
                        c1080j.f12942J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1080j.f12942J);
                        continue;
                        i12++;
                        break;
                    case 9:
                        i = indexCount2;
                        c1080j.f12992v = f(typedArrayObtainStyledAttributes, index2, c1080j.f12992v);
                        continue;
                        i12++;
                        break;
                    case 10:
                        i = indexCount2;
                        c1080j.f12991u = f(typedArrayObtainStyledAttributes, index2, c1080j.f12991u);
                        continue;
                        i12++;
                        break;
                    case 11:
                        i = indexCount2;
                        c1080j.f12948P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1080j.f12948P);
                        continue;
                        i12++;
                        break;
                    case 12:
                        i = indexCount2;
                        c1080j.f12949Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1080j.f12949Q);
                        continue;
                        i12++;
                        break;
                    case 13:
                        i = indexCount2;
                        c1080j.f12945M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1080j.f12945M);
                        continue;
                        i12++;
                        break;
                    case 14:
                        i = indexCount2;
                        c1080j.f12947O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1080j.f12947O);
                        continue;
                        i12++;
                        break;
                    case 15:
                        i = indexCount2;
                        c1080j.f12950R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1080j.f12950R);
                        continue;
                        i12++;
                        break;
                    case WorkDatabaseVersions.VERSION_16 /* 16 */:
                        i = indexCount2;
                        c1080j.f12946N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1080j.f12946N);
                        continue;
                        i12++;
                        break;
                    case WorkDatabaseVersions.VERSION_17 /* 17 */:
                        i = indexCount2;
                        c1080j.f12965d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1080j.f12965d);
                        continue;
                        i12++;
                        break;
                    case WorkDatabaseVersions.VERSION_18 /* 18 */:
                        i = indexCount2;
                        c1080j.f12967e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1080j.f12967e);
                        continue;
                        i12++;
                        break;
                    case WorkDatabaseVersions.VERSION_19 /* 19 */:
                        i = indexCount2;
                        c1080j.f = typedArrayObtainStyledAttributes.getFloat(index2, c1080j.f);
                        continue;
                        i12++;
                        break;
                    case 20:
                        i = indexCount2;
                        c1080j.f12993w = typedArrayObtainStyledAttributes.getFloat(index2, c1080j.f12993w);
                        continue;
                        i12++;
                        break;
                    case WorkDatabaseVersions.VERSION_21 /* 21 */:
                        i = indexCount2;
                        c1080j.f12963c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c1080j.f12963c);
                        continue;
                        i12++;
                        break;
                    case 22:
                        i = indexCount2;
                        int i13 = typedArrayObtainStyledAttributes.getInt(index2, lVar.f13004a);
                        lVar.f13004a = i13;
                        lVar.f13004a = iArr[i13];
                        continue;
                        i12++;
                        break;
                    case WorkManagerImpl.MIN_JOB_SCHEDULER_API_LEVEL /* 23 */:
                        i = indexCount2;
                        c1080j.f12961b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c1080j.f12961b);
                        continue;
                        i12++;
                        break;
                    case WorkManagerImpl.CONTENT_URI_TRIGGER_API_LEVEL /* 24 */:
                        i = indexCount2;
                        c1080j.f12938F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1080j.f12938F);
                        continue;
                        i12++;
                        break;
                    case 25:
                        i = indexCount2;
                        c1080j.f12972h = f(typedArrayObtainStyledAttributes, index2, c1080j.f12972h);
                        continue;
                        i12++;
                        break;
                    case 26:
                        i = indexCount2;
                        c1080j.i = f(typedArrayObtainStyledAttributes, index2, c1080j.i);
                        continue;
                        i12++;
                        break;
                    case 27:
                        i = indexCount2;
                        c1080j.f12937E = typedArrayObtainStyledAttributes.getInt(index2, c1080j.f12937E);
                        continue;
                        i12++;
                        break;
                    case 28:
                        i = indexCount2;
                        c1080j.f12939G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1080j.f12939G);
                        continue;
                        i12++;
                        break;
                    case 29:
                        i = indexCount2;
                        c1080j.j = f(typedArrayObtainStyledAttributes, index2, c1080j.j);
                        continue;
                        i12++;
                        break;
                    case 30:
                        i = indexCount2;
                        c1080j.f12976k = f(typedArrayObtainStyledAttributes, index2, c1080j.f12976k);
                        continue;
                        i12++;
                        break;
                    case 31:
                        i = indexCount2;
                        c1080j.f12943K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1080j.f12943K);
                        continue;
                        i12++;
                        break;
                    case 32:
                        i = indexCount2;
                        c1080j.f12989s = f(typedArrayObtainStyledAttributes, index2, c1080j.f12989s);
                        continue;
                        i12++;
                        break;
                    case 33:
                        i = indexCount2;
                        c1080j.f12990t = f(typedArrayObtainStyledAttributes, index2, c1080j.f12990t);
                        continue;
                        i12++;
                        break;
                    case 34:
                        i = indexCount2;
                        c1080j.f12940H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1080j.f12940H);
                        continue;
                        i12++;
                        break;
                    case 35:
                        i = indexCount2;
                        c1080j.f12980m = f(typedArrayObtainStyledAttributes, index2, c1080j.f12980m);
                        continue;
                        i12++;
                        break;
                    case 36:
                        i = indexCount2;
                        c1080j.f12978l = f(typedArrayObtainStyledAttributes, index2, c1080j.f12978l);
                        continue;
                        i12++;
                        break;
                    case 37:
                        i = indexCount2;
                        c1080j.f12994x = typedArrayObtainStyledAttributes.getFloat(index2, c1080j.f12994x);
                        continue;
                        i12++;
                        break;
                    case 38:
                        i = indexCount2;
                        c1079i.f12927a = typedArrayObtainStyledAttributes.getResourceId(index2, c1079i.f12927a);
                        continue;
                        i12++;
                        break;
                    case 39:
                        i = indexCount2;
                        c1080j.f12953U = typedArrayObtainStyledAttributes.getFloat(index2, c1080j.f12953U);
                        continue;
                        i12++;
                        break;
                    case 40:
                        i = indexCount2;
                        c1080j.f12952T = typedArrayObtainStyledAttributes.getFloat(index2, c1080j.f12952T);
                        continue;
                        i12++;
                        break;
                    case 41:
                        i = indexCount2;
                        c1080j.f12954V = typedArrayObtainStyledAttributes.getInt(index2, c1080j.f12954V);
                        continue;
                        i12++;
                        break;
                    case 42:
                        i = indexCount2;
                        c1080j.f12955W = typedArrayObtainStyledAttributes.getInt(index2, c1080j.f12955W);
                        continue;
                        i12++;
                        break;
                    case 43:
                        i = indexCount2;
                        lVar.f13006c = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f13006c);
                        continue;
                        i12++;
                        break;
                    case 44:
                        i = indexCount2;
                        mVar.f13017l = true;
                        mVar.f13018m = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f13018m);
                        continue;
                        i12++;
                        break;
                    case 45:
                        i = indexCount2;
                        mVar.f13010b = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f13010b);
                        continue;
                        i12++;
                        break;
                    case 46:
                        i = indexCount2;
                        mVar.f13011c = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f13011c);
                        continue;
                        i12++;
                        break;
                    case 47:
                        i = indexCount2;
                        mVar.f13012d = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f13012d);
                        continue;
                        i12++;
                        break;
                    case 48:
                        i = indexCount2;
                        mVar.f13013e = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f13013e);
                        continue;
                        i12++;
                        break;
                    case 49:
                        i = indexCount2;
                        mVar.f = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f);
                        continue;
                        i12++;
                        break;
                    case Scheduler.MAX_SCHEDULER_LIMIT /* 50 */:
                        i = indexCount2;
                        mVar.f13014g = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f13014g);
                        continue;
                        i12++;
                        break;
                    case 51:
                        i = indexCount2;
                        mVar.i = typedArrayObtainStyledAttributes.getDimension(index2, mVar.i);
                        continue;
                        i12++;
                        break;
                    case 52:
                        i = indexCount2;
                        mVar.j = typedArrayObtainStyledAttributes.getDimension(index2, mVar.j);
                        continue;
                        i12++;
                        break;
                    case 53:
                        i = indexCount2;
                        mVar.f13016k = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f13016k);
                        continue;
                        i12++;
                        break;
                    case 54:
                        i = indexCount2;
                        c1080j.f12956X = typedArrayObtainStyledAttributes.getInt(index2, c1080j.f12956X);
                        continue;
                        i12++;
                        break;
                    case 55:
                        i = indexCount2;
                        c1080j.f12957Y = typedArrayObtainStyledAttributes.getInt(index2, c1080j.f12957Y);
                        continue;
                        i12++;
                        break;
                    case 56:
                        i = indexCount2;
                        c1080j.f12958Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1080j.f12958Z);
                        continue;
                        i12++;
                        break;
                    case 57:
                        i = indexCount2;
                        c1080j.f12960a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1080j.f12960a0);
                        continue;
                        i12++;
                        break;
                    case 58:
                        i = indexCount2;
                        c1080j.f12962b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1080j.f12962b0);
                        continue;
                        i12++;
                        break;
                    case 59:
                        i = indexCount2;
                        c1080j.f12964c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1080j.f12964c0);
                        continue;
                        i12++;
                        break;
                    case 60:
                        i = indexCount2;
                        mVar.f13009a = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f13009a);
                        continue;
                        i12++;
                        break;
                    case 61:
                        i = indexCount2;
                        c1080j.f12996z = f(typedArrayObtainStyledAttributes, index2, c1080j.f12996z);
                        continue;
                        i12++;
                        break;
                    case 62:
                        i = indexCount2;
                        c1080j.f12933A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1080j.f12933A);
                        continue;
                        i12++;
                        break;
                    case 63:
                        i = indexCount2;
                        c1080j.f12934B = typedArrayObtainStyledAttributes.getFloat(index2, c1080j.f12934B);
                        continue;
                        i12++;
                        break;
                    case 64:
                        i = indexCount2;
                        kVar.f12997a = f(typedArrayObtainStyledAttributes, index2, kVar.f12997a);
                        continue;
                        i12++;
                        break;
                    case 65:
                        i = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            kVar.getClass();
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            kVar.getClass();
                            i12++;
                        }
                        break;
                    case 66:
                        i = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        kVar.getClass();
                        continue;
                        i12++;
                        break;
                    case 67:
                        i = indexCount2;
                        kVar.f13001e = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f13001e);
                        break;
                    case 68:
                        i = indexCount2;
                        lVar.f13007d = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f13007d);
                        break;
                    case 69:
                        i = indexCount2;
                        c1080j.f12966d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        c1080j.f12968e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        c1080j.f12969f0 = typedArrayObtainStyledAttributes.getInt(index2, c1080j.f12969f0);
                        break;
                    case 73:
                        i = indexCount2;
                        c1080j.f12971g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1080j.f12971g0);
                        break;
                    case 74:
                        i = indexCount2;
                        c1080j.f12975j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        c1080j.f12983n0 = typedArrayObtainStyledAttributes.getBoolean(index2, c1080j.f12983n0);
                        break;
                    case 76:
                        i = indexCount2;
                        kVar.f12999c = typedArrayObtainStyledAttributes.getInt(index2, kVar.f12999c);
                        break;
                    case 77:
                        i = indexCount2;
                        c1080j.f12977k0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        lVar.f13005b = typedArrayObtainStyledAttributes.getInt(index2, lVar.f13005b);
                        break;
                    case 79:
                        i = indexCount2;
                        kVar.f13000d = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f13000d);
                        break;
                    case 80:
                        i = indexCount2;
                        c1080j.f12979l0 = typedArrayObtainStyledAttributes.getBoolean(index2, c1080j.f12979l0);
                        break;
                    case 81:
                        i = indexCount2;
                        c1080j.f12981m0 = typedArrayObtainStyledAttributes.getBoolean(index2, c1080j.f12981m0);
                        break;
                    case 82:
                        i = indexCount2;
                        kVar.f12998b = typedArrayObtainStyledAttributes.getInteger(index2, kVar.f12998b);
                        break;
                    case 83:
                        i = indexCount2;
                        mVar.f13015h = f(typedArrayObtainStyledAttributes, index2, mVar.f13015h);
                        break;
                    case 84:
                        i = indexCount2;
                        kVar.f13002g = typedArrayObtainStyledAttributes.getInteger(index2, kVar.f13002g);
                        break;
                    case 85:
                        i = indexCount2;
                        kVar.f = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f);
                        break;
                    case 86:
                        i = indexCount2;
                        int i14 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i14 == 1) {
                            kVar.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i14 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            kVar.f13003h = string2;
                            if (string2.indexOf("/") > 0) {
                                kVar.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, kVar.i);
                        }
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 91:
                        i = indexCount2;
                        c1080j.f12987q = f(typedArrayObtainStyledAttributes, index2, c1080j.f12987q);
                        break;
                    case 92:
                        i = indexCount2;
                        c1080j.f12988r = f(typedArrayObtainStyledAttributes, index2, c1080j.f12988r);
                        break;
                    case 93:
                        i = indexCount2;
                        c1080j.f12944L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1080j.f12944L);
                        break;
                    case 94:
                        i = indexCount2;
                        c1080j.f12951S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1080j.f12951S);
                        break;
                    case 95:
                        i = indexCount2;
                        g(c1080j, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i12++;
                        break;
                    case 96:
                        i = indexCount2;
                        g(c1080j, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        c1080j.f12985o0 = typedArrayObtainStyledAttributes.getInt(index2, c1080j.f12985o0);
                        break;
                }
                i12++;
            }
            if (c1080j.f12975j0 != null) {
                c1080j.f12974i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c1079i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int f(TypedArray typedArray, int i, int i7) {
        int resourceId = typedArray.getResourceId(i, i7);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            if (r7 != 0) goto L4
            goto L171
        L4:
            android.util.TypedValue r0 = r8.peekValue(r9)
            int r0 = r0.type
            r1 = 3
            r2 = 1
            r3 = 23
            r4 = 21
            r5 = 5
            r6 = 0
            if (r0 == r1) goto L70
            if (r0 == r5) goto L2d
            int r8 = r8.getInt(r9, r6)
            r9 = -4
            r0 = -2
            if (r8 == r9) goto L2b
            r9 = -3
            if (r8 == r9) goto L26
            if (r8 == r0) goto L28
            r9 = -1
            if (r8 == r9) goto L28
        L26:
            r2 = r6
            goto L32
        L28:
            r2 = r6
            r6 = r8
            goto L32
        L2b:
            r6 = r0
            goto L32
        L2d:
            int r8 = r8.getDimensionPixelSize(r9, r6)
            goto L28
        L32:
            boolean r8 = r7 instanceof g1.C1075e
            if (r8 == 0) goto L44
            g1.e r7 = (g1.C1075e) r7
            if (r10 != 0) goto L3f
            r7.width = r6
            r7.f12863W = r2
            return
        L3f:
            r7.height = r6
            r7.f12864X = r2
            return
        L44:
            boolean r8 = r7 instanceof g1.C1080j
            if (r8 == 0) goto L56
            g1.j r7 = (g1.C1080j) r7
            if (r10 != 0) goto L51
            r7.f12961b = r6
            r7.f12979l0 = r2
            return
        L51:
            r7.f12963c = r6
            r7.f12981m0 = r2
            return
        L56:
            boolean r8 = r7 instanceof g1.C1078h
            if (r8 == 0) goto L171
            g1.h r7 = (g1.C1078h) r7
            if (r10 != 0) goto L67
            r7.b(r3, r6)
            r8 = 80
            r7.d(r8, r2)
            return
        L67:
            r7.b(r4, r6)
            r8 = 81
            r7.d(r8, r2)
            return
        L70:
            java.lang.String r8 = r8.getString(r9)
            if (r8 != 0) goto L78
            goto L171
        L78:
            r9 = 61
            int r9 = r8.indexOf(r9)
            int r0 = r8.length()
            if (r9 <= 0) goto L171
            int r0 = r0 - r2
            if (r9 >= r0) goto L171
            java.lang.String r0 = r8.substring(r6, r9)
            int r9 = r9 + r2
            java.lang.String r8 = r8.substring(r9)
            int r9 = r8.length()
            if (r9 <= 0) goto L171
            java.lang.String r9 = r0.trim()
            java.lang.String r8 = r8.trim()
            java.lang.String r0 = "ratio"
            boolean r0 = r0.equalsIgnoreCase(r9)
            if (r0 == 0) goto Lca
            boolean r9 = r7 instanceof g1.C1075e
            if (r9 == 0) goto Lb7
            g1.e r7 = (g1.C1075e) r7
            if (r10 != 0) goto Lb1
            r7.width = r6
            goto Lb3
        Lb1:
            r7.height = r6
        Lb3:
            h(r7, r8)
            return
        Lb7:
            boolean r9 = r7 instanceof g1.C1080j
            if (r9 == 0) goto Lc0
            g1.j r7 = (g1.C1080j) r7
            r7.f12995y = r8
            return
        Lc0:
            boolean r9 = r7 instanceof g1.C1078h
            if (r9 == 0) goto L171
            g1.h r7 = (g1.C1078h) r7
            r7.c(r5, r8)
            return
        Lca:
            java.lang.String r0 = "weight"
            boolean r0 = r0.equalsIgnoreCase(r9)
            if (r0 == 0) goto L114
            float r8 = java.lang.Float.parseFloat(r8)     // Catch: java.lang.NumberFormatException -> L171
            boolean r9 = r7 instanceof g1.C1075e     // Catch: java.lang.NumberFormatException -> L171
            if (r9 == 0) goto Le8
            g1.e r7 = (g1.C1075e) r7     // Catch: java.lang.NumberFormatException -> L171
            if (r10 != 0) goto Le3
            r7.width = r6     // Catch: java.lang.NumberFormatException -> L171
            r7.f12848H = r8     // Catch: java.lang.NumberFormatException -> L171
            return
        Le3:
            r7.height = r6     // Catch: java.lang.NumberFormatException -> L171
            r7.f12849I = r8     // Catch: java.lang.NumberFormatException -> L171
            return
        Le8:
            boolean r9 = r7 instanceof g1.C1080j     // Catch: java.lang.NumberFormatException -> L171
            if (r9 == 0) goto Lfa
            g1.j r7 = (g1.C1080j) r7     // Catch: java.lang.NumberFormatException -> L171
            if (r10 != 0) goto Lf5
            r7.f12961b = r6     // Catch: java.lang.NumberFormatException -> L171
            r7.f12953U = r8     // Catch: java.lang.NumberFormatException -> L171
            return
        Lf5:
            r7.f12963c = r6     // Catch: java.lang.NumberFormatException -> L171
            r7.f12952T = r8     // Catch: java.lang.NumberFormatException -> L171
            return
        Lfa:
            boolean r9 = r7 instanceof g1.C1078h     // Catch: java.lang.NumberFormatException -> L171
            if (r9 == 0) goto L171
            g1.h r7 = (g1.C1078h) r7     // Catch: java.lang.NumberFormatException -> L171
            if (r10 != 0) goto L10b
            r7.b(r3, r6)     // Catch: java.lang.NumberFormatException -> L171
            r9 = 39
            r7.a(r9, r8)     // Catch: java.lang.NumberFormatException -> L171
            return
        L10b:
            r7.b(r4, r6)     // Catch: java.lang.NumberFormatException -> L171
            r9 = 40
            r7.a(r9, r8)     // Catch: java.lang.NumberFormatException -> L171
            return
        L114:
            java.lang.String r0 = "parent"
            boolean r9 = r0.equalsIgnoreCase(r9)
            if (r9 == 0) goto L171
            float r8 = java.lang.Float.parseFloat(r8)     // Catch: java.lang.NumberFormatException -> L171
            r9 = 1065353216(0x3f800000, float:1.0)
            float r8 = java.lang.Math.min(r9, r8)     // Catch: java.lang.NumberFormatException -> L171
            r9 = 0
            float r8 = java.lang.Math.max(r9, r8)     // Catch: java.lang.NumberFormatException -> L171
            boolean r9 = r7 instanceof g1.C1075e     // Catch: java.lang.NumberFormatException -> L171
            r0 = 2
            if (r9 == 0) goto L142
            g1.e r7 = (g1.C1075e) r7     // Catch: java.lang.NumberFormatException -> L171
            if (r10 != 0) goto L13b
            r7.width = r6     // Catch: java.lang.NumberFormatException -> L171
            r7.f12858R = r8     // Catch: java.lang.NumberFormatException -> L171
            r7.f12852L = r0     // Catch: java.lang.NumberFormatException -> L171
            return
        L13b:
            r7.height = r6     // Catch: java.lang.NumberFormatException -> L171
            r7.f12859S = r8     // Catch: java.lang.NumberFormatException -> L171
            r7.f12853M = r0     // Catch: java.lang.NumberFormatException -> L171
            return
        L142:
            boolean r9 = r7 instanceof g1.C1080j     // Catch: java.lang.NumberFormatException -> L171
            if (r9 == 0) goto L158
            g1.j r7 = (g1.C1080j) r7     // Catch: java.lang.NumberFormatException -> L171
            if (r10 != 0) goto L151
            r7.f12961b = r6     // Catch: java.lang.NumberFormatException -> L171
            r7.f12966d0 = r8     // Catch: java.lang.NumberFormatException -> L171
            r7.f12956X = r0     // Catch: java.lang.NumberFormatException -> L171
            return
        L151:
            r7.f12963c = r6     // Catch: java.lang.NumberFormatException -> L171
            r7.f12968e0 = r8     // Catch: java.lang.NumberFormatException -> L171
            r7.f12957Y = r0     // Catch: java.lang.NumberFormatException -> L171
            return
        L158:
            boolean r8 = r7 instanceof g1.C1078h     // Catch: java.lang.NumberFormatException -> L171
            if (r8 == 0) goto L171
            g1.h r7 = (g1.C1078h) r7     // Catch: java.lang.NumberFormatException -> L171
            if (r10 != 0) goto L169
            r7.b(r3, r6)     // Catch: java.lang.NumberFormatException -> L171
            r8 = 54
            r7.b(r8, r0)     // Catch: java.lang.NumberFormatException -> L171
            return
        L169:
            r7.b(r4, r6)     // Catch: java.lang.NumberFormatException -> L171
            r8 = 55
            r7.b(r8, r0)     // Catch: java.lang.NumberFormatException -> L171
        L171:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.n.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void h(C1075e c1075e, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                i = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f7 = Float.parseFloat(strSubstring3);
                        float f8 = Float.parseFloat(strSubstring4);
                        if (f7 > 0.0f && f8 > 0.0f) {
                            if (i == 1) {
                                Math.abs(f8 / f7);
                            } else {
                                Math.abs(f7 / f8);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        c1075e.f12847G = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        HashMap map;
        String resourceEntryName;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = nVar.f13023c;
        HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = constraintLayout.getChildAt(i7);
            int id = childAt.getId();
            if (!map2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (nVar.f13022b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map2.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        C1079i c1079i = (C1079i) map2.get(Integer.valueOf(id));
                        if (c1079i != null) {
                            l lVar = c1079i.f12928b;
                            C1080j c1080j = c1079i.f12930d;
                            m mVar = c1079i.f12931e;
                            if (childAt instanceof C1071a) {
                                c1080j.f12973h0 = 1;
                                C1071a c1071a = (C1071a) childAt;
                                c1071a.setId(id);
                                c1071a.setType(c1080j.f12969f0);
                                c1071a.setMargin(c1080j.f12971g0);
                                c1071a.setAllowsGoneWidget(c1080j.f12983n0);
                                int[] iArr = c1080j.f12974i0;
                                if (iArr != null) {
                                    c1071a.setReferencedIds(iArr);
                                } else {
                                    String str = c1080j.f12975j0;
                                    if (str != null) {
                                        int[] iArrC = c(c1071a, str);
                                        c1080j.f12974i0 = iArrC;
                                        c1071a.setReferencedIds(iArrC);
                                    }
                                }
                            }
                            C1075e c1075e = (C1075e) childAt.getLayoutParams();
                            c1075e.a();
                            c1079i.a(c1075e);
                            HashMap map3 = c1079i.f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map3.keySet()) {
                                C1072b c1072b = (C1072b) map3.get(str2);
                                HashSet hashSet3 = hashSet2;
                                String strW = !c1072b.f12827a ? S.w("set", str2) : str2;
                                int i8 = i7;
                                try {
                                    int iA = O.c.a(c1072b.f12828b);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (iA) {
                                        case 0:
                                            map = map3;
                                            cls.getMethod(strW, cls3).invoke(childAt, Integer.valueOf(c1072b.f12829c));
                                            break;
                                        case 1:
                                            map = map3;
                                            cls.getMethod(strW, cls2).invoke(childAt, Float.valueOf(c1072b.f12830d));
                                            break;
                                        case 2:
                                            map = map3;
                                            cls.getMethod(strW, cls3).invoke(childAt, Integer.valueOf(c1072b.f12832g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(strW, Drawable.class);
                                            map = map3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(c1072b.f12832g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e7) {
                                                e = e7;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e);
                                            } catch (NoSuchMethodException e8) {
                                                e = e8;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strW, e);
                                            } catch (InvocationTargetException e9) {
                                                e = e9;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e);
                                            }
                                            break;
                                        case 4:
                                            cls.getMethod(strW, CharSequence.class).invoke(childAt, c1072b.f12831e);
                                            map = map3;
                                            break;
                                        case 5:
                                            cls.getMethod(strW, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c1072b.f));
                                            map = map3;
                                            break;
                                        case 6:
                                            cls.getMethod(strW, cls2).invoke(childAt, Float.valueOf(c1072b.f12830d));
                                            map = map3;
                                            break;
                                        case 7:
                                            cls.getMethod(strW, cls3).invoke(childAt, Integer.valueOf(c1072b.f12829c));
                                            map = map3;
                                            break;
                                        default:
                                            map = map3;
                                            break;
                                    }
                                } catch (IllegalAccessException e10) {
                                    e = e10;
                                    map = map3;
                                } catch (NoSuchMethodException e11) {
                                    e = e11;
                                    map = map3;
                                } catch (InvocationTargetException e12) {
                                    e = e12;
                                    map = map3;
                                }
                                hashSet2 = hashSet3;
                                i7 = i8;
                                map3 = map;
                            }
                            hashSet = hashSet2;
                            i = i7;
                            childAt.setLayoutParams(c1075e);
                            if (lVar.f13005b == 0) {
                                childAt.setVisibility(lVar.f13004a);
                            }
                            childAt.setAlpha(lVar.f13006c);
                            childAt.setRotation(mVar.f13009a);
                            childAt.setRotationX(mVar.f13010b);
                            childAt.setRotationY(mVar.f13011c);
                            childAt.setScaleX(mVar.f13012d);
                            childAt.setScaleY(mVar.f13013e);
                            if (mVar.f13015h != -1) {
                                if (((View) childAt.getParent()).findViewById(mVar.f13015h) != null) {
                                    float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                    float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(mVar.f)) {
                                    childAt.setPivotX(mVar.f);
                                }
                                if (!Float.isNaN(mVar.f13014g)) {
                                    childAt.setPivotY(mVar.f13014g);
                                }
                            }
                            childAt.setTranslationX(mVar.i);
                            childAt.setTranslationY(mVar.j);
                            childAt.setTranslationZ(mVar.f13016k);
                            if (mVar.f13017l) {
                                childAt.setElevation(mVar.f13018m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i7;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i7 = i + 1;
                nVar = this;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            i = i7;
            i7 = i + 1;
            nVar = this;
            hashSet2 = hashSet;
        }
        for (Integer num : hashSet2) {
            C1079i c1079i2 = (C1079i) map2.get(num);
            if (c1079i2 != null) {
                C1080j c1080j2 = c1079i2.f12930d;
                if (c1080j2.f12973h0 == 1) {
                    Context context = constraintLayout.getContext();
                    C1071a c1071a2 = new C1071a(context);
                    c1071a2.f12833q = new int[32];
                    c1071a2.f12839w = new HashMap();
                    c1071a2.f12835s = context;
                    C0950a c0950a = new C0950a();
                    c0950a.f11799s0 = 0;
                    c0950a.f11800t0 = true;
                    c0950a.f11801u0 = 0;
                    c0950a.f11802v0 = false;
                    c1071a2.f12826z = c0950a;
                    c1071a2.f12836t = c0950a;
                    c1071a2.i();
                    c1071a2.setVisibility(8);
                    c1071a2.setId(num.intValue());
                    int[] iArr2 = c1080j2.f12974i0;
                    if (iArr2 != null) {
                        c1071a2.setReferencedIds(iArr2);
                    } else {
                        String str3 = c1080j2.f12975j0;
                        if (str3 != null) {
                            int[] iArrC2 = c(c1071a2, str3);
                            c1080j2.f12974i0 = iArrC2;
                            c1071a2.setReferencedIds(iArrC2);
                        }
                    }
                    c1071a2.setType(c1080j2.f12969f0);
                    c1071a2.setMargin(c1080j2.f12971g0);
                    s sVar = ConstraintLayout.f9381F;
                    C1075e c1075e2 = new C1075e();
                    c1071a2.i();
                    c1079i2.a(c1075e2);
                    constraintLayout.addView(c1071a2, c1075e2);
                }
                if (c1080j2.f12959a) {
                    View pVar = new p(constraintLayout.getContext());
                    pVar.setId(num.intValue());
                    s sVar2 = ConstraintLayout.f9381F;
                    C1075e c1075e3 = new C1075e();
                    c1079i2.a(c1075e3);
                    constraintLayout.addView(pVar, c1075e3);
                }
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = constraintLayout.getChildAt(i9);
            if (childAt2 instanceof AbstractC1073c) {
                ((AbstractC1073c) childAt2).e(constraintLayout);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(ConstraintLayout constraintLayout) {
        int i;
        HashMap map;
        int i7;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = nVar.f13023c;
        map2.clear();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = constraintLayout.getChildAt(i8);
            C1075e c1075e = (C1075e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (nVar.f13022b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map2.containsKey(Integer.valueOf(id))) {
                map2.put(Integer.valueOf(id), new C1079i());
            }
            C1079i c1079i = (C1079i) map2.get(Integer.valueOf(id));
            if (c1079i == null) {
                i = childCount;
                map = map2;
                i7 = i8;
            } else {
                l lVar = c1079i.f12928b;
                C1080j c1080j = c1079i.f12930d;
                m mVar = c1079i.f12931e;
                i = childCount;
                HashMap map3 = new HashMap();
                map = map2;
                Class<?> cls = childAt.getClass();
                i7 = i8;
                HashMap map4 = nVar.f13021a;
                for (String str : map4.keySet()) {
                    C1072b c1072b = (C1072b) map4.get(str);
                    HashMap map5 = map4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new C1072b(c1072b, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            map3.put(str, new C1072b(c1072b, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e7) {
                        Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e7);
                    } catch (NoSuchMethodException e8) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e8);
                    } catch (InvocationTargetException e9) {
                        Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e9);
                    }
                    map4 = map5;
                }
                c1079i.f = map3;
                c1079i.f12927a = id;
                c1080j.f12972h = c1075e.f12875e;
                c1080j.i = c1075e.f;
                c1080j.j = c1075e.f12878g;
                c1080j.f12976k = c1075e.f12880h;
                c1080j.f12978l = c1075e.i;
                c1080j.f12980m = c1075e.j;
                c1080j.f12982n = c1075e.f12884k;
                c1080j.f12984o = c1075e.f12886l;
                c1080j.f12986p = c1075e.f12888m;
                c1080j.f12987q = c1075e.f12890n;
                c1080j.f12988r = c1075e.f12892o;
                c1080j.f12989s = c1075e.f12898s;
                c1080j.f12990t = c1075e.f12899t;
                c1080j.f12991u = c1075e.f12900u;
                c1080j.f12992v = c1075e.f12901v;
                c1080j.f12993w = c1075e.f12845E;
                c1080j.f12994x = c1075e.f12846F;
                c1080j.f12995y = c1075e.f12847G;
                c1080j.f12996z = c1075e.f12894p;
                c1080j.f12933A = c1075e.f12896q;
                c1080j.f12934B = c1075e.f12897r;
                c1080j.f12935C = c1075e.f12860T;
                c1080j.f12936D = c1075e.f12861U;
                c1080j.f12937E = c1075e.f12862V;
                c1080j.f = c1075e.f12871c;
                c1080j.f12965d = c1075e.f12867a;
                c1080j.f12967e = c1075e.f12869b;
                c1080j.f12961b = ((ViewGroup.MarginLayoutParams) c1075e).width;
                c1080j.f12963c = ((ViewGroup.MarginLayoutParams) c1075e).height;
                c1080j.f12938F = ((ViewGroup.MarginLayoutParams) c1075e).leftMargin;
                c1080j.f12939G = ((ViewGroup.MarginLayoutParams) c1075e).rightMargin;
                c1080j.f12940H = ((ViewGroup.MarginLayoutParams) c1075e).topMargin;
                c1080j.f12941I = ((ViewGroup.MarginLayoutParams) c1075e).bottomMargin;
                c1080j.f12944L = c1075e.f12844D;
                c1080j.f12952T = c1075e.f12849I;
                c1080j.f12953U = c1075e.f12848H;
                c1080j.f12955W = c1075e.f12851K;
                c1080j.f12954V = c1075e.f12850J;
                c1080j.f12979l0 = c1075e.f12863W;
                c1080j.f12981m0 = c1075e.f12864X;
                c1080j.f12956X = c1075e.f12852L;
                c1080j.f12957Y = c1075e.f12853M;
                c1080j.f12958Z = c1075e.f12856P;
                c1080j.f12960a0 = c1075e.f12857Q;
                c1080j.f12962b0 = c1075e.f12854N;
                c1080j.f12964c0 = c1075e.f12855O;
                c1080j.f12966d0 = c1075e.f12858R;
                c1080j.f12968e0 = c1075e.f12859S;
                c1080j.f12977k0 = c1075e.f12865Y;
                c1080j.f12946N = c1075e.f12903x;
                c1080j.f12948P = c1075e.f12905z;
                c1080j.f12945M = c1075e.f12902w;
                c1080j.f12947O = c1075e.f12904y;
                c1080j.f12950R = c1075e.f12841A;
                c1080j.f12949Q = c1075e.f12842B;
                c1080j.f12951S = c1075e.f12843C;
                c1080j.f12985o0 = c1075e.f12866Z;
                c1080j.f12942J = c1075e.getMarginEnd();
                c1080j.f12943K = c1075e.getMarginStart();
                lVar.f13004a = childAt.getVisibility();
                lVar.f13006c = childAt.getAlpha();
                mVar.f13009a = childAt.getRotation();
                mVar.f13010b = childAt.getRotationX();
                mVar.f13011c = childAt.getRotationY();
                mVar.f13012d = childAt.getScaleX();
                mVar.f13013e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    mVar.f = pivotX;
                    mVar.f13014g = pivotY;
                }
                mVar.i = childAt.getTranslationX();
                mVar.j = childAt.getTranslationY();
                mVar.f13016k = childAt.getTranslationZ();
                if (mVar.f13017l) {
                    mVar.f13018m = childAt.getElevation();
                }
                if (childAt instanceof C1071a) {
                    C1071a c1071a = (C1071a) childAt;
                    c1080j.f12983n0 = c1071a.getAllowsGoneWidget();
                    c1080j.f12974i0 = c1071a.getReferencedIds();
                    c1080j.f12969f0 = c1071a.getType();
                    c1080j.f12971g0 = c1071a.getMargin();
                }
            }
            i8 = i7 + 1;
            nVar = this;
            childCount = i;
            map2 = map;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    C1079i c1079iD = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        c1079iD.f12930d.f12959a = true;
                    }
                    this.f13023c.put(Integer.valueOf(c1079iD.f12927a), c1079iD);
                }
            }
        } catch (IOException e7) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e7);
        } catch (XmlPullParserException e8) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e8);
        }
    }
}
