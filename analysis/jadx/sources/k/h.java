package k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import g.AbstractC1066a;
import java.io.IOException;
import k1.AbstractC1175c;
import l.ActionProviderVisibilityListenerC1212o;
import l.MenuC1209l;
import m.AbstractC1313j0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class h extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f13958e;
    public static final Class[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f13959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f13960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f13961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f13962d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Class[] clsArr = {Context.class};
        f13958e = clsArr;
        f = clsArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(Context context) {
        super(context);
        this.f13961c = context;
        Object[] objArr = {context};
        this.f13959a = objArr;
        this.f13960b = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:103:0x0267 */
    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        g gVar = new g(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z5 = false;
        boolean z6 = false;
        String str = null;
        while (!z5) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType != 3) {
                    xmlPullParser2 = xmlPullParser;
                    z5 = z5;
                } else {
                    String name2 = xmlPullParser.getName();
                    if (z6 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z6 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            gVar.f13936b = 0;
                            gVar.f13937c = 0;
                            gVar.f13938d = 0;
                            gVar.f13939e = 0;
                            gVar.f = true;
                            gVar.f13940g = true;
                        } else if (name2.equals("item")) {
                            if (!gVar.f13941h) {
                                ActionProviderVisibilityListenerC1212o actionProviderVisibilityListenerC1212o = gVar.f13957z;
                                if (actionProviderVisibilityListenerC1212o == null || !actionProviderVisibilityListenerC1212o.f14402b.hasSubMenu()) {
                                    gVar.f13941h = true;
                                    gVar.b(gVar.f13935a.add(gVar.f13936b, gVar.i, gVar.j, gVar.f13942k));
                                } else {
                                    gVar.f13941h = true;
                                    gVar.b(gVar.f13935a.addSubMenu(gVar.f13936b, gVar.i, gVar.j, gVar.f13942k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z5 = true;
                        }
                        xmlPullParser2 = xmlPullParser;
                        z5 = z5;
                    }
                }
                eventType = xmlPullParser2.next();
                i = 2;
                z5 = z5;
                z6 = z6;
            } else {
                if (!z6) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        TypedArray typedArrayObtainStyledAttributes = this.f13961c.obtainStyledAttributes(attributeSet, AbstractC1066a.f12798p);
                        gVar.f13936b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        gVar.f13937c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        gVar.f13938d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        gVar.f13939e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        gVar.f = typedArrayObtainStyledAttributes.getBoolean(i, true);
                        gVar.f13940g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            int[] iArr = AbstractC1066a.f12799q;
                            Context context = this.f13961c;
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr);
                            gVar.i = typedArrayObtainStyledAttributes2.getResourceId(i, 0);
                            gVar.j = (typedArrayObtainStyledAttributes2.getInt(6, gVar.f13938d) & 65535) | (typedArrayObtainStyledAttributes2.getInt(5, gVar.f13937c) & (-65536));
                            gVar.f13942k = typedArrayObtainStyledAttributes2.getText(7);
                            gVar.f13943l = typedArrayObtainStyledAttributes2.getText(8);
                            gVar.f13944m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            gVar.f13945n = string == null ? (char) 0 : string.charAt(0);
                            gVar.f13946o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            gVar.f13947p = string2 == null ? (char) 0 : string2.charAt(0);
                            gVar.f13948q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                gVar.f13949r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                gVar.f13949r = gVar.f13939e;
                            }
                            gVar.f13950s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            gVar.f13951t = typedArrayObtainStyledAttributes2.getBoolean(4, gVar.f);
                            gVar.f13952u = typedArrayObtainStyledAttributes2.getBoolean(1, gVar.f13940g);
                            gVar.f13953v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            gVar.f13956y = typedArrayObtainStyledAttributes2.getString(12);
                            gVar.f13954w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            gVar.f13955x = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            boolean z7 = string3 != null;
                            if (z7 && gVar.f13954w == 0 && gVar.f13955x == null) {
                                gVar.f13957z = (ActionProviderVisibilityListenerC1212o) gVar.a(string3, f, this.f13960b);
                            } else {
                                if (z7) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                gVar.f13957z = null;
                            }
                            gVar.f13930A = typedArrayObtainStyledAttributes2.getText(17);
                            gVar.f13931B = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                gVar.f13933D = AbstractC1313j0.b(typedArrayObtainStyledAttributes2.getInt(19, -1), gVar.f13933D);
                            } else {
                                gVar.f13933D = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC1175c.b(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                gVar.f13932C = colorStateList;
                            } else {
                                gVar.f13932C = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            gVar.f13941h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            gVar.f13941h = true;
                            SubMenu subMenuAddSubMenu = gVar.f13935a.addSubMenu(gVar.f13936b, gVar.i, gVar.j, gVar.f13942k);
                            gVar.b(subMenuAddSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, subMenuAddSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z6 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z5 = z5;
                        z6 = z6;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z5 = z5;
            }
            eventType = xmlPullParser2.next();
            i = 2;
            z5 = z5;
            z6 = z6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof MenuC1209l)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z5 = false;
        try {
            try {
                layout = this.f13961c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof MenuC1209l) {
                    MenuC1209l menuC1209l = (MenuC1209l) menu;
                    if (!menuC1209l.f14363p) {
                        menuC1209l.w();
                        z5 = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z5) {
                    ((MenuC1209l) menu).v();
                }
                layout.close();
            } catch (IOException e7) {
                throw new InflateException("Error inflating menu XML", e7);
            } catch (XmlPullParserException e8) {
                throw new InflateException("Error inflating menu XML", e8);
            }
        } catch (Throwable th) {
            if (z5) {
                ((MenuC1209l) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
