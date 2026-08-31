package s5;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.m;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements InterfaceC1524c, d, Serializable {
    private final InterfaceC1524c<Object> completion;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(InterfaceC1524c interfaceC1524c) {
        this.completion = interfaceC1524c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC1524c<C1386y> create(InterfaceC1524c<?> completion) {
        m.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d getCallerFrame() {
        InterfaceC1524c<Object> interfaceC1524c = this.completion;
        if (interfaceC1524c instanceof d) {
            return (d) interfaceC1524c;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC1524c<Object> getCompletion() {
        return this.completion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str = null;
        if (eVar == null) {
            return null;
        }
        int iV = eVar.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? eVar.l()[iIntValue] : -1;
        m6.i iVar = f.f16563b;
        m6.i iVar2 = f.f16562a;
        if (iVar == null) {
            try {
                m6.i iVar3 = new m6.i(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f.f16563b = iVar3;
                iVar = iVar3;
            } catch (Exception unused2) {
                f.f16563b = iVar2;
                iVar = iVar2;
            }
        }
        if (iVar != iVar2 && (method = iVar.f15112a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = iVar.f15113b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = iVar.f15114c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = eVar.c();
        } else {
            strC = str + '/' + eVar.c();
        }
        return new StackTraceElement(strC, eVar.m(), eVar.f(), i);
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1524c
    public final void resumeWith(Object obj) {
        InterfaceC1524c<Object> interfaceC1524c = this;
        while (true) {
            a aVar = (a) interfaceC1524c;
            InterfaceC1524c<Object> interfaceC1524c2 = aVar.completion;
            m.b(interfaceC1524c2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == EnumC1580a.f16356q) {
                    return;
                }
            } catch (Throwable th) {
                obj = AbstractC1362a.b(th);
            }
            aVar.releaseIntercepted();
            if (!(interfaceC1524c2 instanceof a)) {
                interfaceC1524c2.resumeWith(obj);
                return;
            }
            interfaceC1524c = interfaceC1524c2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public InterfaceC1524c<C1386y> create(Object obj, InterfaceC1524c<?> completion) {
        m.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
