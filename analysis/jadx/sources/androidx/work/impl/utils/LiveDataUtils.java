package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import androidx.lifecycle.G;
import androidx.lifecycle.I;
import androidx.lifecycle.K;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import p.InterfaceC1426a;

/* JADX INFO: loaded from: classes.dex */
public class LiveDataUtils {

    /* JADX INFO: renamed from: androidx.work.impl.utils.LiveDataUtils$1, reason: invalid class name */
    public class AnonymousClass1 implements K {
        Out mCurrentOutput = null;
        final /* synthetic */ Object val$lock;
        final /* synthetic */ InterfaceC1426a val$mappingMethod;
        final /* synthetic */ I val$outputLiveData;
        final /* synthetic */ TaskExecutor val$workTaskExecutor;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public AnonymousClass1(TaskExecutor taskExecutor, Object obj, InterfaceC1426a interfaceC1426a, I i) {
            this.val$workTaskExecutor = taskExecutor;
            this.val$lock = obj;
            this.val$mappingMethod = interfaceC1426a;
            this.val$outputLiveData = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // androidx.lifecycle.K
        public void onChanged(final In in) {
            this.val$workTaskExecutor.executeOnTaskThread(new Runnable() { // from class: androidx.work.impl.utils.LiveDataUtils.1.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: androidx.lifecycle.I */
                /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: androidx.lifecycle.I */
                /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Out */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v3, types: [Out, java.lang.Object] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (AnonymousClass1.this.val$lock) {
                        try {
                            ?? Apply = AnonymousClass1.this.val$mappingMethod.apply(in);
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            Out out = anonymousClass1.mCurrentOutput;
                            if (out == 0 && Apply != 0) {
                                anonymousClass1.mCurrentOutput = Apply;
                                anonymousClass1.val$outputLiveData.i(Apply);
                            } else if (out != 0 && !out.equals(Apply)) {
                                AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                                anonymousClass12.mCurrentOutput = Apply;
                                anonymousClass12.val$outputLiveData.i(Apply);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private LiveDataUtils() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @SuppressLint({"LambdaLast"})
    public static <In, Out> G dedupedMappedLiveDataFor(G g7, InterfaceC1426a interfaceC1426a, TaskExecutor taskExecutor) {
        Object obj = new Object();
        I i = new I();
        i.l(g7, new AnonymousClass1(taskExecutor, obj, interfaceC1426a, i));
        return i;
    }
}
