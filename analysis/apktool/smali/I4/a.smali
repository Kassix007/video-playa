.class public final LI4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public r:Ljava/lang/Object;

.field public final s:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LI4/a;->q:I

    iput-object p2, p0, LI4/a;->r:Ljava/lang/Object;

    iput-object p3, p0, LI4/a;->s:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 2
    iput p1, p0, LI4/a;->q:I

    iput-object p3, p0, LI4/a;->r:Ljava/lang/Object;

    iput-object p2, p0, LI4/a;->s:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LO3/b1;Lcom/google/android/gms/internal/measurement/L;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, LI4/a;->q:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LI4/a;->r:Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LI4/a;->s:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LO3/i0;Lcom/google/android/gms/internal/measurement/B;LO3/i0;)V
    .locals 0

    const/4 p3, 0x4

    iput p3, p0, LI4/a;->q:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LI4/a;->r:Ljava/lang/Object;

    iput-object p1, p0, LI4/a;->s:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LO3/w1;LO3/j1;)V
    .locals 1

    const/16 v0, 0xd

    iput v0, p0, LI4/a;->q:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LI4/a;->r:Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LI4/a;->s:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/behavior/SwipeDismissBehavior;Landroid/view/View;Z)V
    .locals 0

    const/16 p3, 0x17

    iput p3, p0, LI4/a;->q:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI4/a;->s:Ljava/lang/Object;

    .line 8
    iput-object p2, p0, LI4/a;->r:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p4, p0, LI4/a;->q:I

    iput-object p2, p0, LI4/a;->r:Ljava/lang/Object;

    iput-object p3, p0, LI4/a;->s:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :cond_0
    :try_start_0
    iget-object v1, p0, LI4/a;->r:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v1, Ljava/lang/Runnable;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception v1

    .line 11
    :try_start_1
    sget-object v2, Lq5/i;->q:Lq5/i;

    .line 12
    .line 13
    invoke-static {v1, v2}, LM5/y;->p(Ljava/lang/Throwable;Lq5/h;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    iget-object v1, p0, LI4/a;->s:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, LR5/h;

    .line 19
    .line 20
    invoke-virtual {v1}, LR5/h;->a0()Ljava/lang/Runnable;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    iput-object v1, p0, LI4/a;->r:Ljava/lang/Object;

    .line 28
    .line 29
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    const/16 v1, 0x10

    .line 32
    .line 33
    if-lt v0, v1, :cond_0

    .line 34
    .line 35
    iget-object v1, p0, LI4/a;->s:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, LR5/h;

    .line 38
    .line 39
    iget-object v2, v1, LR5/h;->r:LM5/s;

    .line 40
    .line 41
    invoke-static {v2, v1}, LR5/b;->j(LM5/s;Lq5/h;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    iget-object v0, p0, LI4/a;->s:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, LR5/h;

    .line 50
    .line 51
    iget-object v1, v0, LR5/h;->r:LM5/s;

    .line 52
    .line 53
    invoke-static {v1, v0, p0}, LR5/b;->i(LM5/s;Lq5/h;Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 54
    .line 55
    .line 56
    :goto_1
    return-void

    .line 57
    :catchall_1
    move-exception v0

    .line 58
    iget-object v1, p0, LI4/a;->s:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, LR5/h;

    .line 61
    .line 62
    iget-object v2, v1, LR5/h;->v:Ljava/lang/Object;

    .line 63
    .line 64
    monitor-enter v2

    .line 65
    :try_start_2
    sget-object v3, LR5/h;->w:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 66
    .line 67
    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 68
    .line 69
    .line 70
    monitor-exit v2

    .line 71
    throw v0

    .line 72
    :catchall_2
    move-exception v0

    .line 73
    monitor-exit v2

    .line 74
    throw v0
.end method

.method private final b()V
    .locals 3

    .line 1
    iget-object v0, p0, LI4/a;->s:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LS3/h;

    .line 4
    .line 5
    iget-object v0, v0, LS3/h;->c:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, LI4/a;->s:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, LS3/h;

    .line 11
    .line 12
    iget-object v1, v1, LS3/h;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, LS3/b;

    .line 15
    .line 16
    iget-object v2, p0, LI4/a;->r:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, LS3/d;

    .line 19
    .line 20
    invoke-virtual {v2}, LS3/d;->b()Ljava/lang/Exception;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v2}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v1, v2}, LS3/b;->q(Ljava/lang/Exception;)V

    .line 28
    .line 29
    .line 30
    monitor-exit v0

    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception v1

    .line 33
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    throw v1
.end method

.method private final c()V
    .locals 3

    .line 1
    iget-object v0, p0, LI4/a;->s:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LS3/h;

    .line 4
    .line 5
    iget-object v0, v0, LS3/h;->c:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, LI4/a;->s:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, LS3/h;

    .line 11
    .line 12
    iget-object v1, v1, LS3/h;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, LS3/c;

    .line 15
    .line 16
    iget-object v2, p0, LI4/a;->r:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, LS3/d;

    .line 19
    .line 20
    invoke-virtual {v2}, LS3/d;->c()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-interface {v1, v2}, LS3/c;->g(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    monitor-exit v0

    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception v1

    .line 30
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    throw v1
.end method

.method private final d()V
    .locals 3

    .line 1
    iget-object v0, p0, LI4/a;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LS3/k;

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, LI4/a;->s:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/concurrent/Callable;

    .line 8
    .line 9
    invoke-interface {v1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, LS3/k;->g(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    goto :goto_0

    .line 19
    :catch_0
    move-exception v1

    .line 20
    goto :goto_1

    .line 21
    :goto_0
    new-instance v2, Ljava/lang/RuntimeException;

    .line 22
    .line 23
    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, LS3/k;->f(Ljava/lang/Exception;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :goto_1
    invoke-virtual {v0, v1}, LS3/k;->f(Ljava/lang/Exception;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method private final e()V
    .locals 2

    .line 1
    iget-object v0, p0, LI4/a;->s:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->a:LD1/d;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, LD1/d;->f()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LI4/a;->r:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Landroid/view/View;

    .line 18
    .line 19
    sget-object v1, Lw1/K;->a:Ljava/util/WeakHashMap;

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method private final f()V
    .locals 3

    .line 1
    iget-object v0, p0, LI4/a;->s:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LM5/h;

    .line 4
    .line 5
    iget-object v1, p0, LI4/a;->r:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LI4/b;

    .line 8
    .line 9
    invoke-interface {v1}, Ljava/util/concurrent/Future;->isCancelled()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, v1}, LM5/h;->g(Ljava/lang/Throwable;)Z

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    :try_start_0
    invoke-static {v1}, Landroidx/concurrent/futures/j;->getUninterruptibly(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, LM5/h;->resumeWith(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catch_0
    move-exception v1

    .line 29
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-static {v1}, Lm5/a;->b(Ljava/lang/Throwable;)Lm5/l;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, LM5/h;->resumeWith(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    new-instance v0, Lm5/f;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    .line 46
    .line 47
    .line 48
    const-class v1, Lkotlin/jvm/internal/m;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->i(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v0
.end method

.method private final g()V
    .locals 2

    .line 1
    iget-object v0, p0, LI4/a;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lk1/a;

    .line 4
    .line 5
    iget-object v1, p0, LI4/a;->s:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object v1, v0, Lk1/a;->q:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method

.method private final h()V
    .locals 2

    .line 1
    iget-object v0, p0, LI4/a;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/app/Application;

    .line 4
    .line 5
    iget-object v1, p0, LI4/a;->s:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lk1/a;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private final i()V
    .locals 5

    .line 1
    iget-object v0, p0, LI4/a;->r:Ljava/lang/Object;

    .line 2
    .line 3
    :try_start_0
    sget-object v1, Lk1/b;->d:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    iget-object v2, p0, LI4/a;->s:Ljava/lang/Object;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    :try_start_1
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 10
    .line 11
    const-string v4, "AppCompat recreation"

    .line 12
    .line 13
    filled-new-array {v2, v3, v4}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception v0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    sget-object v1, Lk1/b;->e:Ljava/lang/reflect/Method;

    .line 26
    .line 27
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 28
    .line 29
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :goto_0
    const-string v1, "ActivityRecreator"

    .line 38
    .line 39
    const-string v2, "Exception while invoking performStopActivity"

    .line 40
    .line 41
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-class v2, Ljava/lang/RuntimeException;

    .line 50
    .line 51
    if-ne v1, v2, :cond_2

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const-string v2, "Unable to stop"

    .line 64
    .line 65
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-nez v1, :cond_1

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_1
    throw v0

    .line 73
    :cond_2
    :goto_2
    return-void
.end method

.method private final j()V
    .locals 2

    .line 1
    iget-object v0, p0, LI4/a;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li3/a;

    .line 4
    .line 5
    iget-object v1, p0, LI4/a;->s:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/graphics/Typeface;

    .line 8
    .line 9
    iget-object v0, v0, Li3/a;->r:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lm1/b;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lm1/b;->i(Landroid/graphics/Typeface;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 36

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, LI4/a;->q:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, LI4/a;->r:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ls1/e;

    .line 11
    .line 12
    iget-object v2, v1, LI4/a;->s:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Ls1/e;->accept(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    invoke-direct {v1}, LI4/a;->j()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    invoke-direct {v1}, LI4/a;->i()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_2
    invoke-direct {v1}, LI4/a;->h()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_3
    invoke-direct {v1}, LI4/a;->g()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_4
    invoke-direct {v1}, LI4/a;->f()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_5
    invoke-direct {v1}, LI4/a;->e()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_6
    invoke-direct {v1}, LI4/a;->d()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_7
    invoke-direct {v1}, LI4/a;->c()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_8
    invoke-direct {v1}, LI4/a;->b()V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_9
    iget-object v0, v1, LI4/a;->s:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, LS3/h;

    .line 57
    .line 58
    iget-object v2, v0, LS3/h;->c:Ljava/lang/Object;

    .line 59
    .line 60
    monitor-enter v2

    .line 61
    :try_start_0
    iget-object v0, v1, LI4/a;->s:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, LS3/h;

    .line 64
    .line 65
    iget-object v0, v0, LS3/h;->d:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, LS3/a;

    .line 68
    .line 69
    iget-object v3, v1, LI4/a;->r:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v3, LS3/d;

    .line 72
    .line 73
    invoke-interface {v0, v3}, LS3/a;->onComplete(LS3/d;)V

    .line 74
    .line 75
    .line 76
    monitor-exit v2

    .line 77
    return-void

    .line 78
    :catchall_0
    move-exception v0

    .line 79
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    throw v0

    .line 81
    :pswitch_a
    invoke-direct {v1}, LI4/a;->a()V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :pswitch_b
    iget-object v0, v1, LI4/a;->r:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v0, Lk3/d;

    .line 88
    .line 89
    iget-object v2, v1, LI4/a;->s:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v2, Landroid/app/job/JobParameters;

    .line 92
    .line 93
    const-string v3, "FA"

    .line 94
    .line 95
    const-string v4, "[sgtm] AppMeasurementJobService processed last Scion upload request."

    .line 96
    .line 97
    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    iget-object v0, v0, Lk3/d;->r:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, Landroid/app/Service;

    .line 103
    .line 104
    check-cast v0, LO3/z1;

    .line 105
    .line 106
    invoke-interface {v0, v2}, LO3/z1;->c(Landroid/app/job/JobParameters;)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :pswitch_c
    iget-object v0, v1, LI4/a;->r:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, LO3/T1;

    .line 113
    .line 114
    invoke-virtual {v0}, LO3/T1;->A()V

    .line 115
    .line 116
    .line 117
    iget-object v2, v1, LI4/a;->s:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v2, Ljava/lang/Runnable;

    .line 120
    .line 121
    invoke-virtual {v0}, LO3/T1;->c()LO3/p0;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-virtual {v3}, LO3/p0;->o()V

    .line 126
    .line 127
    .line 128
    iget-object v3, v0, LO3/T1;->F:Ljava/util/ArrayList;

    .line 129
    .line 130
    if-nez v3, :cond_0

    .line 131
    .line 132
    new-instance v3, Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 135
    .line 136
    .line 137
    iput-object v3, v0, LO3/T1;->F:Ljava/util/ArrayList;

    .line 138
    .line 139
    :cond_0
    iget-object v3, v0, LO3/T1;->F:Ljava/util/ArrayList;

    .line 140
    .line 141
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0}, LO3/T1;->q()V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :pswitch_d
    iget-object v0, v1, LI4/a;->s:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v0, LO3/v1;

    .line 151
    .line 152
    iget-object v0, v0, LO3/v1;->s:LO3/w1;

    .line 153
    .line 154
    const/4 v2, 0x0

    .line 155
    iput-object v2, v0, LO3/w1;->u:LO3/I;

    .line 156
    .line 157
    iget-object v3, v1, LI4/a;->r:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v3, Lcom/google/android/gms/common/b;

    .line 160
    .line 161
    iget v3, v3, Lcom/google/android/gms/common/b;->r:I

    .line 162
    .line 163
    const/16 v4, 0x1e61

    .line 164
    .line 165
    if-ne v3, v4, :cond_2

    .line 166
    .line 167
    iget-object v3, v0, LO3/w1;->x:Ljava/util/concurrent/ScheduledExecutorService;

    .line 168
    .line 169
    if-nez v3, :cond_1

    .line 170
    .line 171
    const/4 v3, 0x1

    .line 172
    invoke-static {v3}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    iput-object v3, v0, LO3/w1;->x:Ljava/util/concurrent/ScheduledExecutorService;

    .line 177
    .line 178
    :cond_1
    iget-object v0, v0, LO3/w1;->x:Ljava/util/concurrent/ScheduledExecutorService;

    .line 179
    .line 180
    new-instance v3, LA1/b;

    .line 181
    .line 182
    const/16 v4, 0x8

    .line 183
    .line 184
    invoke-direct {v3, v4, v1}, LA1/b;-><init>(ILjava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    sget-object v4, LO3/F;->Z:LO3/E;

    .line 188
    .line 189
    invoke-virtual {v4, v2}, LO3/E;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    check-cast v2, Ljava/lang/Long;

    .line 194
    .line 195
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 196
    .line 197
    .line 198
    move-result-wide v4

    .line 199
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 200
    .line 201
    invoke-interface {v0, v3, v4, v5, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 202
    .line 203
    .line 204
    goto :goto_0

    .line 205
    :cond_2
    invoke-virtual {v0}, LO3/w1;->D()V

    .line 206
    .line 207
    .line 208
    :goto_0
    return-void

    .line 209
    :pswitch_e
    iget-object v0, v1, LI4/a;->s:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v0, LO3/v1;

    .line 212
    .line 213
    iget-object v0, v0, LO3/v1;->s:LO3/w1;

    .line 214
    .line 215
    iget-object v2, v1, LI4/a;->r:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v2, Landroid/content/ComponentName;

    .line 218
    .line 219
    invoke-virtual {v0, v2}, LO3/w1;->z(Landroid/content/ComponentName;)V

    .line 220
    .line 221
    .line 222
    return-void

    .line 223
    :pswitch_f
    iget-object v0, v1, LI4/a;->s:Ljava/lang/Object;

    .line 224
    .line 225
    move-object v2, v0

    .line 226
    check-cast v2, LO3/w1;

    .line 227
    .line 228
    iget-object v3, v2, LO3/w1;->u:LO3/I;

    .line 229
    .line 230
    iget-object v0, v2, LO3/D0;->r:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v0, LO3/t0;

    .line 233
    .line 234
    if-nez v3, :cond_3

    .line 235
    .line 236
    iget-object v0, v0, LO3/t0;->v:LO3/X;

    .line 237
    .line 238
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 239
    .line 240
    .line 241
    iget-object v0, v0, LO3/X;->w:LO3/V;

    .line 242
    .line 243
    const-string v2, "Failed to send current screen to service"

    .line 244
    .line 245
    invoke-virtual {v0, v2}, LO3/V;->b(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    goto :goto_3

    .line 249
    :cond_3
    :try_start_1
    iget-object v4, v1, LI4/a;->r:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v4, LO3/j1;

    .line 252
    .line 253
    if-nez v4, :cond_4

    .line 254
    .line 255
    iget-object v0, v0, LO3/t0;->q:Landroid/content/Context;

    .line 256
    .line 257
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v8

    .line 261
    const-wide/16 v4, 0x0

    .line 262
    .line 263
    const/4 v6, 0x0

    .line 264
    const/4 v7, 0x0

    .line 265
    invoke-interface/range {v3 .. v8}, LO3/I;->r(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    goto :goto_1

    .line 269
    :catch_0
    move-exception v0

    .line 270
    goto :goto_2

    .line 271
    :cond_4
    iget-wide v5, v4, LO3/j1;->c:J

    .line 272
    .line 273
    move-wide v7, v5

    .line 274
    iget-object v6, v4, LO3/j1;->a:Ljava/lang/String;

    .line 275
    .line 276
    iget-object v4, v4, LO3/j1;->b:Ljava/lang/String;

    .line 277
    .line 278
    iget-object v0, v0, LO3/t0;->q:Landroid/content/Context;

    .line 279
    .line 280
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    move-wide/from16 v34, v7

    .line 285
    .line 286
    move-object v7, v4

    .line 287
    move-wide/from16 v4, v34

    .line 288
    .line 289
    move-object v8, v0

    .line 290
    invoke-interface/range {v3 .. v8}, LO3/I;->r(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    :goto_1
    invoke-virtual {v2}, LO3/w1;->B()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 294
    .line 295
    .line 296
    goto :goto_3

    .line 297
    :goto_2
    iget-object v2, v2, LO3/D0;->r:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v2, LO3/t0;

    .line 300
    .line 301
    iget-object v2, v2, LO3/t0;->v:LO3/X;

    .line 302
    .line 303
    invoke-static {v2}, LO3/t0;->l(LO3/E0;)V

    .line 304
    .line 305
    .line 306
    iget-object v2, v2, LO3/X;->w:LO3/V;

    .line 307
    .line 308
    const-string v3, "Failed to send current screen to the service"

    .line 309
    .line 310
    invoke-virtual {v2, v0, v3}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    :goto_3
    return-void

    .line 314
    :pswitch_10
    iget-object v0, v1, LI4/a;->r:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast v0, LO3/b1;

    .line 317
    .line 318
    iget-object v0, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v0, LO3/t0;

    .line 321
    .line 322
    invoke-virtual {v0}, LO3/t0;->q()LO3/N;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    iget-object v3, v1, LI4/a;->s:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v3, Ljava/lang/String;

    .line 329
    .line 330
    iget-object v4, v2, LO3/N;->H:Ljava/lang/String;

    .line 331
    .line 332
    const/4 v5, 0x0

    .line 333
    if-eqz v4, :cond_5

    .line 334
    .line 335
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result v4

    .line 339
    if-nez v4, :cond_5

    .line 340
    .line 341
    const/4 v5, 0x1

    .line 342
    :cond_5
    iput-object v3, v2, LO3/N;->H:Ljava/lang/String;

    .line 343
    .line 344
    if-eqz v5, :cond_6

    .line 345
    .line 346
    invoke-virtual {v0}, LO3/t0;->q()LO3/N;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-virtual {v0}, LO3/N;->t()V

    .line 351
    .line 352
    .line 353
    :cond_6
    return-void

    .line 354
    :pswitch_11
    iget-object v0, v1, LI4/a;->r:Ljava/lang/Object;

    .line 355
    .line 356
    check-cast v0, LO3/b1;

    .line 357
    .line 358
    invoke-virtual {v0}, LO3/C;->o()V

    .line 359
    .line 360
    .line 361
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 362
    .line 363
    const/16 v3, 0x1e

    .line 364
    .line 365
    if-ge v2, v3, :cond_7

    .line 366
    .line 367
    goto :goto_5

    .line 368
    :cond_7
    iget-object v2, v1, LI4/a;->s:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v2, Ljava/util/List;

    .line 371
    .line 372
    iget-object v3, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast v3, LO3/t0;

    .line 375
    .line 376
    iget-object v3, v3, LO3/t0;->u:LO3/h0;

    .line 377
    .line 378
    invoke-static {v3}, LO3/t0;->j(LO3/D0;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v3}, LO3/h0;->u()Landroid/util/SparseArray;

    .line 382
    .line 383
    .line 384
    move-result-object v3

    .line 385
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    :cond_8
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 390
    .line 391
    .line 392
    move-result v4

    .line 393
    if-eqz v4, :cond_a

    .line 394
    .line 395
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v4

    .line 399
    check-cast v4, LO3/I1;

    .line 400
    .line 401
    iget v5, v4, LO3/I1;->s:I

    .line 402
    .line 403
    invoke-static {v3, v5}, LC0/D0;->x(Landroid/util/SparseArray;I)Z

    .line 404
    .line 405
    .line 406
    move-result v6

    .line 407
    if-eqz v6, :cond_9

    .line 408
    .line 409
    invoke-virtual {v3, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v5

    .line 413
    check-cast v5, Ljava/lang/Long;

    .line 414
    .line 415
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 416
    .line 417
    .line 418
    move-result-wide v5

    .line 419
    iget-wide v7, v4, LO3/I1;->r:J

    .line 420
    .line 421
    cmp-long v5, v5, v7

    .line 422
    .line 423
    if-gez v5, :cond_8

    .line 424
    .line 425
    :cond_9
    invoke-virtual {v0}, LO3/b1;->L()Ljava/util/PriorityQueue;

    .line 426
    .line 427
    .line 428
    move-result-object v5

    .line 429
    invoke-virtual {v5, v4}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    goto :goto_4

    .line 433
    :cond_a
    invoke-virtual {v0}, LO3/b1;->M()V

    .line 434
    .line 435
    .line 436
    :goto_5
    return-void

    .line 437
    :pswitch_12
    iget-object v0, v1, LI4/a;->s:Ljava/lang/Object;

    .line 438
    .line 439
    check-cast v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 440
    .line 441
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c:LO3/t0;

    .line 442
    .line 443
    iget-object v0, v0, LO3/t0;->C:LO3/b1;

    .line 444
    .line 445
    invoke-static {v0}, LO3/t0;->k(LO3/H;)V

    .line 446
    .line 447
    .line 448
    iget-object v2, v1, LI4/a;->r:Ljava/lang/Object;

    .line 449
    .line 450
    check-cast v2, LB0/o;

    .line 451
    .line 452
    invoke-virtual {v0}, LO3/C;->o()V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v0}, LO3/H;->p()V

    .line 456
    .line 457
    .line 458
    iget-object v3, v0, LO3/b1;->u:LO3/L0;

    .line 459
    .line 460
    if-eq v2, v3, :cond_c

    .line 461
    .line 462
    if-nez v3, :cond_b

    .line 463
    .line 464
    const/4 v3, 0x1

    .line 465
    goto :goto_6

    .line 466
    :cond_b
    const/4 v3, 0x0

    .line 467
    :goto_6
    const-string v4, "EventInterceptor already set."

    .line 468
    .line 469
    invoke-static {v3, v4}, Lx3/A;->i(ZLjava/lang/String;)V

    .line 470
    .line 471
    .line 472
    :cond_c
    iput-object v2, v0, LO3/b1;->u:LO3/L0;

    .line 473
    .line 474
    return-void

    .line 475
    :pswitch_13
    iget-object v0, v1, LI4/a;->s:Ljava/lang/Object;

    .line 476
    .line 477
    check-cast v0, LO3/b1;

    .line 478
    .line 479
    iget-object v2, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 480
    .line 481
    check-cast v2, LO3/t0;

    .line 482
    .line 483
    iget-object v3, v2, LO3/t0;->u:LO3/h0;

    .line 484
    .line 485
    iget-object v2, v2, LO3/t0;->v:LO3/X;

    .line 486
    .line 487
    invoke-static {v3}, LO3/t0;->j(LO3/D0;)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v3}, LO3/D0;->o()V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v3}, LO3/D0;->o()V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v3}, LO3/h0;->s()Landroid/content/SharedPreferences;

    .line 497
    .line 498
    .line 499
    move-result-object v4

    .line 500
    const-string v5, "dma_consent_settings"

    .line 501
    .line 502
    const/4 v6, 0x0

    .line 503
    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v4

    .line 507
    invoke-static {v4}, LO3/p;->b(Ljava/lang/String;)LO3/p;

    .line 508
    .line 509
    .line 510
    move-result-object v4

    .line 511
    iget-object v6, v1, LI4/a;->r:Ljava/lang/Object;

    .line 512
    .line 513
    check-cast v6, LO3/p;

    .line 514
    .line 515
    iget v7, v6, LO3/p;->a:I

    .line 516
    .line 517
    iget v4, v4, LO3/p;->a:I

    .line 518
    .line 519
    invoke-static {v7, v4}, LO3/J0;->l(II)Z

    .line 520
    .line 521
    .line 522
    move-result v4

    .line 523
    if-eqz v4, :cond_e

    .line 524
    .line 525
    invoke-virtual {v3}, LO3/h0;->s()Landroid/content/SharedPreferences;

    .line 526
    .line 527
    .line 528
    move-result-object v3

    .line 529
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 530
    .line 531
    .line 532
    move-result-object v3

    .line 533
    iget-object v4, v6, LO3/p;->b:Ljava/lang/String;

    .line 534
    .line 535
    invoke-interface {v3, v5, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 536
    .line 537
    .line 538
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 539
    .line 540
    .line 541
    invoke-static {v2}, LO3/t0;->l(LO3/E0;)V

    .line 542
    .line 543
    .line 544
    iget-object v2, v2, LO3/X;->E:LO3/V;

    .line 545
    .line 546
    const-string v3, "Setting DMA consent(FE)"

    .line 547
    .line 548
    invoke-virtual {v2, v6, v3}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 549
    .line 550
    .line 551
    iget-object v0, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 552
    .line 553
    check-cast v0, LO3/t0;

    .line 554
    .line 555
    invoke-virtual {v0}, LO3/t0;->o()LO3/w1;

    .line 556
    .line 557
    .line 558
    move-result-object v2

    .line 559
    invoke-virtual {v2}, LO3/w1;->y()Z

    .line 560
    .line 561
    .line 562
    move-result v2

    .line 563
    if-eqz v2, :cond_d

    .line 564
    .line 565
    invoke-virtual {v0}, LO3/t0;->o()LO3/w1;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    invoke-virtual {v0}, LO3/C;->o()V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v0}, LO3/H;->p()V

    .line 573
    .line 574
    .line 575
    new-instance v2, LO3/u1;

    .line 576
    .line 577
    const/4 v3, 0x1

    .line 578
    invoke-direct {v2, v0, v3}, LO3/u1;-><init>(LO3/w1;I)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v0, v2}, LO3/w1;->C(Ljava/lang/Runnable;)V

    .line 582
    .line 583
    .line 584
    goto :goto_7

    .line 585
    :cond_d
    invoke-virtual {v0}, LO3/t0;->o()LO3/w1;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    invoke-virtual {v0}, LO3/C;->o()V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v0}, LO3/H;->p()V

    .line 593
    .line 594
    .line 595
    invoke-virtual {v0}, LO3/w1;->x()Z

    .line 596
    .line 597
    .line 598
    move-result v2

    .line 599
    if-eqz v2, :cond_f

    .line 600
    .line 601
    const/4 v2, 0x0

    .line 602
    invoke-virtual {v0, v2}, LO3/w1;->E(Z)LO3/a2;

    .line 603
    .line 604
    .line 605
    move-result-object v2

    .line 606
    new-instance v3, LO3/r1;

    .line 607
    .line 608
    invoke-direct {v3, v0, v2}, LO3/r1;-><init>(LO3/w1;LO3/a2;)V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v0, v3}, LO3/w1;->C(Ljava/lang/Runnable;)V

    .line 612
    .line 613
    .line 614
    goto :goto_7

    .line 615
    :cond_e
    invoke-static {v2}, LO3/t0;->l(LO3/E0;)V

    .line 616
    .line 617
    .line 618
    iget-object v0, v2, LO3/X;->C:LO3/V;

    .line 619
    .line 620
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 621
    .line 622
    .line 623
    move-result-object v2

    .line 624
    const-string v3, "Lower precedence consent source ignored, proposed source"

    .line 625
    .line 626
    invoke-virtual {v0, v2, v3}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 627
    .line 628
    .line 629
    :cond_f
    :goto_7
    return-void

    .line 630
    :pswitch_14
    iget-object v0, v1, LI4/a;->s:Ljava/lang/Object;

    .line 631
    .line 632
    check-cast v0, LO3/b1;

    .line 633
    .line 634
    iget-object v2, v1, LI4/a;->r:Ljava/lang/Object;

    .line 635
    .line 636
    check-cast v2, Ljava/lang/Boolean;

    .line 637
    .line 638
    const/4 v3, 0x1

    .line 639
    invoke-virtual {v0, v2, v3}, LO3/b1;->E(Ljava/lang/Boolean;Z)V

    .line 640
    .line 641
    .line 642
    return-void

    .line 643
    :pswitch_15
    iget-object v0, v1, LI4/a;->r:Ljava/lang/Object;

    .line 644
    .line 645
    check-cast v0, Lcom/google/android/gms/internal/measurement/L;

    .line 646
    .line 647
    iget-object v2, v1, LI4/a;->s:Ljava/lang/Object;

    .line 648
    .line 649
    check-cast v2, LO3/b1;

    .line 650
    .line 651
    iget-object v3, v2, LO3/D0;->r:Ljava/lang/Object;

    .line 652
    .line 653
    check-cast v3, LO3/t0;

    .line 654
    .line 655
    iget-object v2, v2, LO3/D0;->r:Ljava/lang/Object;

    .line 656
    .line 657
    check-cast v2, LO3/t0;

    .line 658
    .line 659
    iget-object v3, v3, LO3/t0;->x:LO3/E1;

    .line 660
    .line 661
    invoke-static {v3}, LO3/t0;->k(LO3/H;)V

    .line 662
    .line 663
    .line 664
    iget-object v3, v3, LO3/D0;->r:Ljava/lang/Object;

    .line 665
    .line 666
    check-cast v3, LO3/t0;

    .line 667
    .line 668
    iget-object v4, v3, LO3/t0;->u:LO3/h0;

    .line 669
    .line 670
    invoke-static {v4}, LO3/t0;->j(LO3/D0;)V

    .line 671
    .line 672
    .line 673
    invoke-virtual {v4}, LO3/h0;->v()LO3/J0;

    .line 674
    .line 675
    .line 676
    move-result-object v5

    .line 677
    sget-object v6, LO3/I0;->s:LO3/I0;

    .line 678
    .line 679
    invoke-virtual {v5, v6}, LO3/J0;->i(LO3/I0;)Z

    .line 680
    .line 681
    .line 682
    move-result v5

    .line 683
    const/4 v6, 0x0

    .line 684
    if-nez v5, :cond_11

    .line 685
    .line 686
    iget-object v3, v3, LO3/t0;->v:LO3/X;

    .line 687
    .line 688
    invoke-static {v3}, LO3/t0;->l(LO3/E0;)V

    .line 689
    .line 690
    .line 691
    iget-object v3, v3, LO3/X;->B:LO3/V;

    .line 692
    .line 693
    const-string v4, "Analytics storage consent denied; will not get session id"

    .line 694
    .line 695
    invoke-virtual {v3, v4}, LO3/V;->b(Ljava/lang/String;)V

    .line 696
    .line 697
    .line 698
    :cond_10
    :goto_8
    move-object v3, v6

    .line 699
    goto :goto_9

    .line 700
    :cond_11
    invoke-static {v4}, LO3/t0;->j(LO3/D0;)V

    .line 701
    .line 702
    .line 703
    iget-object v5, v4, LO3/h0;->H:LO3/f0;

    .line 704
    .line 705
    iget-object v3, v3, LO3/t0;->A:LB3/a;

    .line 706
    .line 707
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 708
    .line 709
    .line 710
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 711
    .line 712
    .line 713
    move-result-wide v7

    .line 714
    invoke-virtual {v4, v7, v8}, LO3/h0;->y(J)Z

    .line 715
    .line 716
    .line 717
    move-result v3

    .line 718
    if-nez v3, :cond_10

    .line 719
    .line 720
    invoke-virtual {v5}, LO3/f0;->a()J

    .line 721
    .line 722
    .line 723
    move-result-wide v3

    .line 724
    const-wide/16 v7, 0x0

    .line 725
    .line 726
    cmp-long v3, v3, v7

    .line 727
    .line 728
    if-nez v3, :cond_12

    .line 729
    .line 730
    goto :goto_8

    .line 731
    :cond_12
    invoke-virtual {v5}, LO3/f0;->a()J

    .line 732
    .line 733
    .line 734
    move-result-wide v3

    .line 735
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 736
    .line 737
    .line 738
    move-result-object v3

    .line 739
    :goto_9
    if-eqz v3, :cond_13

    .line 740
    .line 741
    iget-object v2, v2, LO3/t0;->y:LO3/Y1;

    .line 742
    .line 743
    invoke-static {v2}, LO3/t0;->j(LO3/D0;)V

    .line 744
    .line 745
    .line 746
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 747
    .line 748
    .line 749
    move-result-wide v3

    .line 750
    invoke-virtual {v2, v0, v3, v4}, LO3/Y1;->X(Lcom/google/android/gms/internal/measurement/L;J)V

    .line 751
    .line 752
    .line 753
    goto :goto_a

    .line 754
    :cond_13
    :try_start_2
    invoke-interface {v0, v6}, Lcom/google/android/gms/internal/measurement/L;->a(Landroid/os/Bundle;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1

    .line 755
    .line 756
    .line 757
    goto :goto_a

    .line 758
    :catch_1
    move-exception v0

    .line 759
    iget-object v2, v2, LO3/t0;->v:LO3/X;

    .line 760
    .line 761
    invoke-static {v2}, LO3/t0;->l(LO3/E0;)V

    .line 762
    .line 763
    .line 764
    iget-object v2, v2, LO3/X;->w:LO3/V;

    .line 765
    .line 766
    const-string v3, "getSessionId failed with exception"

    .line 767
    .line 768
    invoke-virtual {v2, v0, v3}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 769
    .line 770
    .line 771
    :goto_a
    return-void

    .line 772
    :pswitch_16
    iget-object v0, v1, LI4/a;->s:Ljava/lang/Object;

    .line 773
    .line 774
    check-cast v0, LO3/C0;

    .line 775
    .line 776
    iget-object v0, v0, LO3/C0;->c:LO3/T1;

    .line 777
    .line 778
    invoke-virtual {v0}, LO3/T1;->A()V

    .line 779
    .line 780
    .line 781
    iget-object v2, v1, LI4/a;->r:Ljava/lang/Object;

    .line 782
    .line 783
    check-cast v2, LO3/e;

    .line 784
    .line 785
    iget-object v3, v2, LO3/e;->s:LO3/V1;

    .line 786
    .line 787
    invoke-virtual {v3}, LO3/V1;->W()Ljava/lang/Object;

    .line 788
    .line 789
    .line 790
    move-result-object v3

    .line 791
    if-nez v3, :cond_14

    .line 792
    .line 793
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 794
    .line 795
    .line 796
    iget-object v3, v2, LO3/e;->q:Ljava/lang/String;

    .line 797
    .line 798
    invoke-static {v3}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 799
    .line 800
    .line 801
    invoke-virtual {v0, v3}, LO3/T1;->O(Ljava/lang/String;)LO3/a2;

    .line 802
    .line 803
    .line 804
    move-result-object v3

    .line 805
    if-eqz v3, :cond_15

    .line 806
    .line 807
    invoke-virtual {v0, v2, v3}, LO3/T1;->Y(LO3/e;LO3/a2;)V

    .line 808
    .line 809
    .line 810
    goto :goto_b

    .line 811
    :cond_14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 812
    .line 813
    .line 814
    iget-object v3, v2, LO3/e;->q:Ljava/lang/String;

    .line 815
    .line 816
    invoke-static {v3}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 817
    .line 818
    .line 819
    invoke-virtual {v0, v3}, LO3/T1;->O(Ljava/lang/String;)LO3/a2;

    .line 820
    .line 821
    .line 822
    move-result-object v3

    .line 823
    if-eqz v3, :cond_15

    .line 824
    .line 825
    invoke-virtual {v0, v2, v3}, LO3/T1;->X(LO3/e;LO3/a2;)V

    .line 826
    .line 827
    .line 828
    :cond_15
    :goto_b
    return-void

    .line 829
    :pswitch_17
    const-string v2, "measurement_enabled"

    .line 830
    .line 831
    sget-object v3, LO3/G0;->r:LO3/G0;

    .line 832
    .line 833
    const-string v4, "Can\'t initialize twice"

    .line 834
    .line 835
    iget-object v0, v1, LI4/a;->s:Ljava/lang/Object;

    .line 836
    .line 837
    move-object v6, v0

    .line 838
    check-cast v6, LO3/t0;

    .line 839
    .line 840
    iget-object v0, v1, LI4/a;->r:Ljava/lang/Object;

    .line 841
    .line 842
    move-object v11, v0

    .line 843
    check-cast v11, LO3/N0;

    .line 844
    .line 845
    iget-object v0, v6, LO3/t0;->w:LO3/p0;

    .line 846
    .line 847
    iget-object v12, v6, LO3/t0;->v:LO3/X;

    .line 848
    .line 849
    iget-object v13, v6, LO3/t0;->u:LO3/h0;

    .line 850
    .line 851
    iget-object v14, v6, LO3/t0;->y:LO3/Y1;

    .line 852
    .line 853
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 854
    .line 855
    .line 856
    invoke-virtual {v0}, LO3/p0;->o()V

    .line 857
    .line 858
    .line 859
    iget-object v15, v6, LO3/t0;->t:LO3/g;

    .line 860
    .line 861
    iget-object v0, v15, LO3/D0;->r:Ljava/lang/Object;

    .line 862
    .line 863
    check-cast v0, LO3/t0;

    .line 864
    .line 865
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 866
    .line 867
    .line 868
    new-instance v0, LO3/q;

    .line 869
    .line 870
    invoke-direct {v0, v6}, LO3/E0;-><init>(LO3/t0;)V

    .line 871
    .line 872
    .line 873
    invoke-virtual {v0}, LO3/E0;->r()V

    .line 874
    .line 875
    .line 876
    iput-object v0, v6, LO3/t0;->I:LO3/q;

    .line 877
    .line 878
    iget-object v0, v11, LO3/N0;->d:Lcom/google/android/gms/internal/measurement/V;

    .line 879
    .line 880
    const-wide/16 v16, 0x0

    .line 881
    .line 882
    if-nez v0, :cond_16

    .line 883
    .line 884
    move-wide/from16 v9, v16

    .line 885
    .line 886
    goto :goto_c

    .line 887
    :cond_16
    iget-wide v7, v0, Lcom/google/android/gms/internal/measurement/V;->q:J

    .line 888
    .line 889
    move-wide v9, v7

    .line 890
    :goto_c
    new-instance v5, LO3/N;

    .line 891
    .line 892
    iget-wide v7, v11, LO3/N0;->c:J

    .line 893
    .line 894
    invoke-direct/range {v5 .. v10}, LO3/N;-><init>(LO3/t0;JJ)V

    .line 895
    .line 896
    .line 897
    invoke-virtual {v5}, LO3/H;->q()V

    .line 898
    .line 899
    .line 900
    iput-object v5, v6, LO3/t0;->J:LO3/N;

    .line 901
    .line 902
    new-instance v0, LO3/P;

    .line 903
    .line 904
    invoke-direct {v0, v6}, LO3/P;-><init>(LO3/t0;)V

    .line 905
    .line 906
    .line 907
    invoke-virtual {v0}, LO3/H;->q()V

    .line 908
    .line 909
    .line 910
    iput-object v0, v6, LO3/t0;->G:LO3/P;

    .line 911
    .line 912
    new-instance v0, LO3/w1;

    .line 913
    .line 914
    invoke-direct {v0, v6}, LO3/w1;-><init>(LO3/t0;)V

    .line 915
    .line 916
    .line 917
    invoke-virtual {v0}, LO3/H;->q()V

    .line 918
    .line 919
    .line 920
    iput-object v0, v6, LO3/t0;->H:LO3/w1;

    .line 921
    .line 922
    iget-boolean v0, v14, LO3/E0;->s:Z

    .line 923
    .line 924
    iget-object v7, v14, LO3/D0;->r:Ljava/lang/Object;

    .line 925
    .line 926
    check-cast v7, LO3/t0;

    .line 927
    .line 928
    if-nez v0, :cond_61

    .line 929
    .line 930
    invoke-virtual {v14}, LO3/D0;->o()V

    .line 931
    .line 932
    .line 933
    new-instance v0, Ljava/security/SecureRandom;

    .line 934
    .line 935
    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    .line 936
    .line 937
    .line 938
    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    .line 939
    .line 940
    .line 941
    move-result-wide v8

    .line 942
    const-wide/16 v18, 0x0

    .line 943
    .line 944
    cmp-long v10, v8, v18

    .line 945
    .line 946
    if-nez v10, :cond_17

    .line 947
    .line 948
    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    .line 949
    .line 950
    .line 951
    move-result-wide v8

    .line 952
    cmp-long v0, v8, v18

    .line 953
    .line 954
    if-nez v0, :cond_17

    .line 955
    .line 956
    iget-object v0, v14, LO3/D0;->r:Ljava/lang/Object;

    .line 957
    .line 958
    check-cast v0, LO3/t0;

    .line 959
    .line 960
    iget-object v0, v0, LO3/t0;->v:LO3/X;

    .line 961
    .line 962
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 963
    .line 964
    .line 965
    iget-object v0, v0, LO3/X;->z:LO3/V;

    .line 966
    .line 967
    const-string v10, "Utils falling back to Random for random id"

    .line 968
    .line 969
    invoke-virtual {v0, v10}, LO3/V;->b(Ljava/lang/String;)V

    .line 970
    .line 971
    .line 972
    :cond_17
    iget-object v0, v14, LO3/Y1;->u:Ljava/util/concurrent/atomic/AtomicLong;

    .line 973
    .line 974
    invoke-virtual {v0, v8, v9}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 975
    .line 976
    .line 977
    iget-object v0, v7, LO3/t0;->S:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 978
    .line 979
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 980
    .line 981
    .line 982
    const/4 v8, 0x1

    .line 983
    iput-boolean v8, v14, LO3/E0;->s:Z

    .line 984
    .line 985
    iget-boolean v0, v13, LO3/E0;->s:Z

    .line 986
    .line 987
    if-nez v0, :cond_60

    .line 988
    .line 989
    iget-object v0, v13, LO3/D0;->r:Ljava/lang/Object;

    .line 990
    .line 991
    check-cast v0, LO3/t0;

    .line 992
    .line 993
    iget-object v0, v0, LO3/t0;->q:Landroid/content/Context;

    .line 994
    .line 995
    const-string v9, "com.google.android.gms.measurement.prefs"

    .line 996
    .line 997
    const/4 v10, 0x0

    .line 998
    invoke-virtual {v0, v9, v10}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 999
    .line 1000
    .line 1001
    move-result-object v0

    .line 1002
    iput-object v0, v13, LO3/h0;->t:Landroid/content/SharedPreferences;

    .line 1003
    .line 1004
    const-string v9, "has_been_opened"

    .line 1005
    .line 1006
    invoke-interface {v0, v9, v10}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1007
    .line 1008
    .line 1009
    move-result v0

    .line 1010
    iput-boolean v0, v13, LO3/h0;->I:Z

    .line 1011
    .line 1012
    if-nez v0, :cond_18

    .line 1013
    .line 1014
    iget-object v0, v13, LO3/h0;->t:Landroid/content/SharedPreferences;

    .line 1015
    .line 1016
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v0

    .line 1020
    const/4 v10, 0x1

    .line 1021
    invoke-interface {v0, v9, v10}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 1022
    .line 1023
    .line 1024
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1025
    .line 1026
    .line 1027
    :cond_18
    new-instance v0, LO3/g0;

    .line 1028
    .line 1029
    sget-object v9, LO3/F;->d:LO3/E;

    .line 1030
    .line 1031
    const/4 v10, 0x0

    .line 1032
    invoke-virtual {v9, v10}, LO3/E;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v9

    .line 1036
    check-cast v9, Ljava/lang/Long;

    .line 1037
    .line 1038
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 1039
    .line 1040
    .line 1041
    move-result-wide v9

    .line 1042
    move-object/from16 v18, v4

    .line 1043
    .line 1044
    move-object/from16 v19, v5

    .line 1045
    .line 1046
    const-wide/16 v4, 0x0

    .line 1047
    .line 1048
    invoke-static {v4, v5, v9, v10}, Ljava/lang/Math;->max(JJ)J

    .line 1049
    .line 1050
    .line 1051
    move-result-wide v4

    .line 1052
    invoke-direct {v0, v13, v4, v5}, LO3/g0;-><init>(LO3/h0;J)V

    .line 1053
    .line 1054
    .line 1055
    iput-object v0, v13, LO3/h0;->v:LO3/g0;

    .line 1056
    .line 1057
    iget-object v0, v13, LO3/D0;->r:Ljava/lang/Object;

    .line 1058
    .line 1059
    check-cast v0, LO3/t0;

    .line 1060
    .line 1061
    iget-object v0, v0, LO3/t0;->S:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1062
    .line 1063
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 1064
    .line 1065
    .line 1066
    iput-boolean v8, v13, LO3/E0;->s:Z

    .line 1067
    .line 1068
    iget-object v4, v6, LO3/t0;->J:LO3/N;

    .line 1069
    .line 1070
    iget-boolean v0, v4, LO3/H;->s:Z

    .line 1071
    .line 1072
    if-nez v0, :cond_5f

    .line 1073
    .line 1074
    const-string v0, ""

    .line 1075
    .line 1076
    iget-object v5, v4, LO3/D0;->r:Ljava/lang/Object;

    .line 1077
    .line 1078
    check-cast v5, LO3/t0;

    .line 1079
    .line 1080
    iget-object v9, v5, LO3/t0;->v:LO3/X;

    .line 1081
    .line 1082
    iget-object v10, v5, LO3/t0;->v:LO3/X;

    .line 1083
    .line 1084
    invoke-static {v9}, LO3/t0;->l(LO3/E0;)V

    .line 1085
    .line 1086
    .line 1087
    iget-object v9, v9, LO3/X;->E:LO3/V;

    .line 1088
    .line 1089
    move-object/from16 v20, v9

    .line 1090
    .line 1091
    iget-wide v8, v4, LO3/N;->A:J

    .line 1092
    .line 1093
    move-wide/from16 v21, v8

    .line 1094
    .line 1095
    const-string v8, "sdkVersion bundled with app, dynamiteVersion"

    .line 1096
    .line 1097
    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v9

    .line 1101
    move-object/from16 v21, v2

    .line 1102
    .line 1103
    iget-wide v1, v4, LO3/N;->z:J

    .line 1104
    .line 1105
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v1

    .line 1109
    move-object/from16 v2, v20

    .line 1110
    .line 1111
    invoke-virtual {v2, v9, v1, v8}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1112
    .line 1113
    .line 1114
    iget-object v1, v5, LO3/t0;->q:Landroid/content/Context;

    .line 1115
    .line 1116
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v2

    .line 1120
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v8

    .line 1124
    const-string v9, "Unknown"

    .line 1125
    .line 1126
    const-string v20, "unknown"

    .line 1127
    .line 1128
    move-object/from16 v22, v9

    .line 1129
    .line 1130
    const/high16 v23, -0x80000000

    .line 1131
    .line 1132
    if-nez v8, :cond_1a

    .line 1133
    .line 1134
    invoke-static {v10}, LO3/t0;->l(LO3/E0;)V

    .line 1135
    .line 1136
    .line 1137
    iget-object v9, v10, LO3/X;->w:LO3/V;

    .line 1138
    .line 1139
    move-object/from16 v25, v3

    .line 1140
    .line 1141
    invoke-static {v2}, LO3/X;->w(Ljava/lang/String;)LO3/W;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v3

    .line 1145
    move-object/from16 v26, v13

    .line 1146
    .line 1147
    const-string v13, "PackageManager is null, app identity information might be inaccurate. appId"

    .line 1148
    .line 1149
    invoke-virtual {v9, v3, v13}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1150
    .line 1151
    .line 1152
    :cond_19
    move-object/from16 v27, v8

    .line 1153
    .line 1154
    move-object/from16 v8, v20

    .line 1155
    .line 1156
    move-object/from16 v3, v22

    .line 1157
    .line 1158
    move-object v9, v3

    .line 1159
    :goto_d
    move/from16 v13, v23

    .line 1160
    .line 1161
    goto/16 :goto_13

    .line 1162
    .line 1163
    :cond_1a
    move-object/from16 v25, v3

    .line 1164
    .line 1165
    move-object/from16 v26, v13

    .line 1166
    .line 1167
    :try_start_3
    invoke-virtual {v8, v2}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v20
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_2

    .line 1171
    :goto_e
    move-object/from16 v3, v20

    .line 1172
    .line 1173
    goto :goto_f

    .line 1174
    :catch_2
    invoke-static {v10}, LO3/t0;->l(LO3/E0;)V

    .line 1175
    .line 1176
    .line 1177
    iget-object v3, v10, LO3/X;->w:LO3/V;

    .line 1178
    .line 1179
    invoke-static {v2}, LO3/X;->w(Ljava/lang/String;)LO3/W;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v9

    .line 1183
    const-string v13, "Error retrieving app installer package name. appId"

    .line 1184
    .line 1185
    invoke-virtual {v3, v9, v13}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1186
    .line 1187
    .line 1188
    goto :goto_e

    .line 1189
    :goto_f
    if-nez v3, :cond_1c

    .line 1190
    .line 1191
    const-string v3, "manual_install"

    .line 1192
    .line 1193
    :cond_1b
    move-object/from16 v20, v3

    .line 1194
    .line 1195
    goto :goto_10

    .line 1196
    :cond_1c
    const-string v9, "com.android.vending"

    .line 1197
    .line 1198
    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1199
    .line 1200
    .line 1201
    move-result v9

    .line 1202
    if-eqz v9, :cond_1b

    .line 1203
    .line 1204
    move-object/from16 v20, v0

    .line 1205
    .line 1206
    :goto_10
    :try_start_4
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v3

    .line 1210
    const/4 v9, 0x0

    .line 1211
    invoke-virtual {v8, v3, v9}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v3

    .line 1215
    if-eqz v3, :cond_19

    .line 1216
    .line 1217
    iget-object v9, v3, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 1218
    .line 1219
    invoke-virtual {v8, v9}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v9

    .line 1223
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1224
    .line 1225
    .line 1226
    move-result v13

    .line 1227
    if-nez v13, :cond_1d

    .line 1228
    .line 1229
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v9
    :try_end_4
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_4 .. :try_end_4} :catch_4

    .line 1233
    goto :goto_11

    .line 1234
    :cond_1d
    move-object/from16 v9, v22

    .line 1235
    .line 1236
    :goto_11
    :try_start_5
    iget-object v13, v3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_5
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_5 .. :try_end_5} :catch_5

    .line 1237
    .line 1238
    :try_start_6
    iget v3, v3, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_6
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_6 .. :try_end_6} :catch_3

    .line 1239
    .line 1240
    move-object/from16 v27, v13

    .line 1241
    .line 1242
    move v13, v3

    .line 1243
    move-object v3, v9

    .line 1244
    move-object/from16 v9, v27

    .line 1245
    .line 1246
    move-object/from16 v27, v8

    .line 1247
    .line 1248
    move-object/from16 v8, v20

    .line 1249
    .line 1250
    goto :goto_13

    .line 1251
    :catch_3
    move-object/from16 v22, v13

    .line 1252
    .line 1253
    goto :goto_12

    .line 1254
    :catch_4
    move-object/from16 v9, v22

    .line 1255
    .line 1256
    :catch_5
    :goto_12
    invoke-static {v10}, LO3/t0;->l(LO3/E0;)V

    .line 1257
    .line 1258
    .line 1259
    iget-object v3, v10, LO3/X;->w:LO3/V;

    .line 1260
    .line 1261
    invoke-static {v2}, LO3/X;->w(Ljava/lang/String;)LO3/W;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v13

    .line 1265
    move-object/from16 v27, v8

    .line 1266
    .line 1267
    const-string v8, "Error retrieving package info. appId, appName"

    .line 1268
    .line 1269
    invoke-virtual {v3, v13, v9, v8}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1270
    .line 1271
    .line 1272
    move-object v3, v9

    .line 1273
    move-object/from16 v8, v20

    .line 1274
    .line 1275
    move-object/from16 v9, v22

    .line 1276
    .line 1277
    goto :goto_d

    .line 1278
    :goto_13
    iput-object v2, v4, LO3/N;->t:Ljava/lang/String;

    .line 1279
    .line 1280
    iput-object v8, v4, LO3/N;->w:Ljava/lang/String;

    .line 1281
    .line 1282
    iput-object v9, v4, LO3/N;->u:Ljava/lang/String;

    .line 1283
    .line 1284
    iput v13, v4, LO3/N;->v:I

    .line 1285
    .line 1286
    iput-object v3, v4, LO3/N;->x:Ljava/lang/String;

    .line 1287
    .line 1288
    const-wide/16 v8, 0x0

    .line 1289
    .line 1290
    iput-wide v8, v4, LO3/N;->y:J

    .line 1291
    .line 1292
    invoke-virtual {v5}, LO3/t0;->f()I

    .line 1293
    .line 1294
    .line 1295
    move-result v3

    .line 1296
    if-eqz v3, :cond_24

    .line 1297
    .line 1298
    const/4 v8, 0x1

    .line 1299
    if-eq v3, v8, :cond_23

    .line 1300
    .line 1301
    const/4 v8, 0x3

    .line 1302
    if-eq v3, v8, :cond_22

    .line 1303
    .line 1304
    const/4 v8, 0x4

    .line 1305
    if-eq v3, v8, :cond_21

    .line 1306
    .line 1307
    const/4 v8, 0x6

    .line 1308
    if-eq v3, v8, :cond_20

    .line 1309
    .line 1310
    const/4 v8, 0x7

    .line 1311
    if-eq v3, v8, :cond_1f

    .line 1312
    .line 1313
    const/16 v8, 0x8

    .line 1314
    .line 1315
    if-eq v3, v8, :cond_1e

    .line 1316
    .line 1317
    invoke-static {v10}, LO3/t0;->l(LO3/E0;)V

    .line 1318
    .line 1319
    .line 1320
    iget-object v8, v10, LO3/X;->C:LO3/V;

    .line 1321
    .line 1322
    const-string v9, "App measurement disabled"

    .line 1323
    .line 1324
    invoke-virtual {v8, v9}, LO3/V;->b(Ljava/lang/String;)V

    .line 1325
    .line 1326
    .line 1327
    invoke-static {v10}, LO3/t0;->l(LO3/E0;)V

    .line 1328
    .line 1329
    .line 1330
    iget-object v8, v10, LO3/X;->x:LO3/V;

    .line 1331
    .line 1332
    const-string v9, "Invalid scion state in identity"

    .line 1333
    .line 1334
    invoke-virtual {v8, v9}, LO3/V;->b(Ljava/lang/String;)V

    .line 1335
    .line 1336
    .line 1337
    goto :goto_14

    .line 1338
    :cond_1e
    invoke-static {v10}, LO3/t0;->l(LO3/E0;)V

    .line 1339
    .line 1340
    .line 1341
    iget-object v8, v10, LO3/X;->C:LO3/V;

    .line 1342
    .line 1343
    const-string v9, "App measurement disabled due to denied storage consent"

    .line 1344
    .line 1345
    invoke-virtual {v8, v9}, LO3/V;->b(Ljava/lang/String;)V

    .line 1346
    .line 1347
    .line 1348
    goto :goto_14

    .line 1349
    :cond_1f
    invoke-static {v10}, LO3/t0;->l(LO3/E0;)V

    .line 1350
    .line 1351
    .line 1352
    iget-object v8, v10, LO3/X;->C:LO3/V;

    .line 1353
    .line 1354
    const-string v9, "App measurement disabled via the global data collection setting"

    .line 1355
    .line 1356
    invoke-virtual {v8, v9}, LO3/V;->b(Ljava/lang/String;)V

    .line 1357
    .line 1358
    .line 1359
    goto :goto_14

    .line 1360
    :cond_20
    invoke-static {v10}, LO3/t0;->l(LO3/E0;)V

    .line 1361
    .line 1362
    .line 1363
    iget-object v8, v10, LO3/X;->B:LO3/V;

    .line 1364
    .line 1365
    const-string v9, "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"

    .line 1366
    .line 1367
    invoke-virtual {v8, v9}, LO3/V;->b(Ljava/lang/String;)V

    .line 1368
    .line 1369
    .line 1370
    goto :goto_14

    .line 1371
    :cond_21
    invoke-static {v10}, LO3/t0;->l(LO3/E0;)V

    .line 1372
    .line 1373
    .line 1374
    iget-object v8, v10, LO3/X;->C:LO3/V;

    .line 1375
    .line 1376
    const-string v9, "App measurement disabled via the manifest"

    .line 1377
    .line 1378
    invoke-virtual {v8, v9}, LO3/V;->b(Ljava/lang/String;)V

    .line 1379
    .line 1380
    .line 1381
    goto :goto_14

    .line 1382
    :cond_22
    invoke-static {v10}, LO3/t0;->l(LO3/E0;)V

    .line 1383
    .line 1384
    .line 1385
    iget-object v8, v10, LO3/X;->C:LO3/V;

    .line 1386
    .line 1387
    const-string v9, "App measurement disabled by setAnalyticsCollectionEnabled(false)"

    .line 1388
    .line 1389
    invoke-virtual {v8, v9}, LO3/V;->b(Ljava/lang/String;)V

    .line 1390
    .line 1391
    .line 1392
    goto :goto_14

    .line 1393
    :cond_23
    invoke-static {v10}, LO3/t0;->l(LO3/E0;)V

    .line 1394
    .line 1395
    .line 1396
    iget-object v8, v10, LO3/X;->C:LO3/V;

    .line 1397
    .line 1398
    const-string v9, "App measurement deactivated via the manifest"

    .line 1399
    .line 1400
    invoke-virtual {v8, v9}, LO3/V;->b(Ljava/lang/String;)V

    .line 1401
    .line 1402
    .line 1403
    goto :goto_14

    .line 1404
    :cond_24
    invoke-static {v10}, LO3/t0;->l(LO3/E0;)V

    .line 1405
    .line 1406
    .line 1407
    iget-object v8, v10, LO3/X;->E:LO3/V;

    .line 1408
    .line 1409
    const-string v9, "App measurement collection enabled"

    .line 1410
    .line 1411
    invoke-virtual {v8, v9}, LO3/V;->b(Ljava/lang/String;)V

    .line 1412
    .line 1413
    .line 1414
    :goto_14
    iput-object v0, v4, LO3/N;->E:Ljava/lang/String;

    .line 1415
    .line 1416
    :try_start_7
    iget-object v8, v5, LO3/t0;->F:Ljava/lang/String;

    .line 1417
    .line 1418
    invoke-static {v1, v8}, LO3/K0;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v8

    .line 1422
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1423
    .line 1424
    .line 1425
    move-result v9

    .line 1426
    if-eqz v9, :cond_25

    .line 1427
    .line 1428
    goto :goto_15

    .line 1429
    :cond_25
    move-object v0, v8

    .line 1430
    :goto_15
    iput-object v0, v4, LO3/N;->E:Ljava/lang/String;

    .line 1431
    .line 1432
    if-nez v3, :cond_26

    .line 1433
    .line 1434
    invoke-static {v10}, LO3/t0;->l(LO3/E0;)V

    .line 1435
    .line 1436
    .line 1437
    iget-object v0, v10, LO3/X;->E:LO3/V;

    .line 1438
    .line 1439
    const-string v3, "App measurement enabled for app package, google app id"

    .line 1440
    .line 1441
    iget-object v8, v4, LO3/N;->t:Ljava/lang/String;

    .line 1442
    .line 1443
    iget-object v9, v4, LO3/N;->E:Ljava/lang/String;

    .line 1444
    .line 1445
    invoke-virtual {v0, v8, v9, v3}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_6

    .line 1446
    .line 1447
    .line 1448
    goto :goto_16

    .line 1449
    :catch_6
    move-exception v0

    .line 1450
    invoke-static {v10}, LO3/t0;->l(LO3/E0;)V

    .line 1451
    .line 1452
    .line 1453
    iget-object v3, v10, LO3/X;->w:LO3/V;

    .line 1454
    .line 1455
    invoke-static {v2}, LO3/X;->w(Ljava/lang/String;)LO3/W;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v2

    .line 1459
    const-string v8, "Fetching Google App Id failed with exception. appId"

    .line 1460
    .line 1461
    invoke-virtual {v3, v2, v0, v8}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1462
    .line 1463
    .line 1464
    :cond_26
    :goto_16
    const/4 v2, 0x0

    .line 1465
    iput-object v2, v4, LO3/N;->B:Ljava/util/List;

    .line 1466
    .line 1467
    iget-object v0, v5, LO3/t0;->t:LO3/g;

    .line 1468
    .line 1469
    iget-object v3, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 1470
    .line 1471
    check-cast v3, LO3/t0;

    .line 1472
    .line 1473
    const-string v8, "analytics.safelisted_events"

    .line 1474
    .line 1475
    invoke-static {v8}, Lx3/A;->d(Ljava/lang/String;)V

    .line 1476
    .line 1477
    .line 1478
    invoke-virtual {v0}, LO3/g;->z()Landroid/os/Bundle;

    .line 1479
    .line 1480
    .line 1481
    move-result-object v0

    .line 1482
    if-nez v0, :cond_27

    .line 1483
    .line 1484
    iget-object v0, v3, LO3/t0;->v:LO3/X;

    .line 1485
    .line 1486
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 1487
    .line 1488
    .line 1489
    iget-object v0, v0, LO3/X;->w:LO3/V;

    .line 1490
    .line 1491
    const-string v8, "Failed to load metadata: Metadata bundle is null"

    .line 1492
    .line 1493
    invoke-virtual {v0, v8}, LO3/V;->b(Ljava/lang/String;)V

    .line 1494
    .line 1495
    .line 1496
    :goto_17
    move-object v0, v2

    .line 1497
    goto :goto_18

    .line 1498
    :cond_27
    invoke-virtual {v0, v8}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1499
    .line 1500
    .line 1501
    move-result v9

    .line 1502
    if-nez v9, :cond_28

    .line 1503
    .line 1504
    goto :goto_17

    .line 1505
    :cond_28
    invoke-virtual {v0, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 1506
    .line 1507
    .line 1508
    move-result v0

    .line 1509
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1510
    .line 1511
    .line 1512
    move-result-object v0

    .line 1513
    :goto_18
    if-eqz v0, :cond_2a

    .line 1514
    .line 1515
    :try_start_8
    iget-object v8, v3, LO3/t0;->q:Landroid/content/Context;

    .line 1516
    .line 1517
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v8

    .line 1521
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1522
    .line 1523
    .line 1524
    move-result v0

    .line 1525
    invoke-virtual {v8, v0}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v0

    .line 1529
    if-nez v0, :cond_29

    .line 1530
    .line 1531
    goto :goto_19

    .line 1532
    :cond_29
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v2
    :try_end_8
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_8 .. :try_end_8} :catch_7

    .line 1536
    goto :goto_19

    .line 1537
    :catch_7
    move-exception v0

    .line 1538
    iget-object v3, v3, LO3/t0;->v:LO3/X;

    .line 1539
    .line 1540
    invoke-static {v3}, LO3/t0;->l(LO3/E0;)V

    .line 1541
    .line 1542
    .line 1543
    iget-object v3, v3, LO3/X;->w:LO3/V;

    .line 1544
    .line 1545
    const-string v8, "Failed to load string array from metadata: resource not found"

    .line 1546
    .line 1547
    invoke-virtual {v3, v0, v8}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1548
    .line 1549
    .line 1550
    :cond_2a
    :goto_19
    if-nez v2, :cond_2b

    .line 1551
    .line 1552
    goto :goto_1a

    .line 1553
    :cond_2b
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 1554
    .line 1555
    .line 1556
    move-result v0

    .line 1557
    if-eqz v0, :cond_2c

    .line 1558
    .line 1559
    invoke-static {v10}, LO3/t0;->l(LO3/E0;)V

    .line 1560
    .line 1561
    .line 1562
    iget-object v0, v10, LO3/X;->B:LO3/V;

    .line 1563
    .line 1564
    const-string v2, "Safelisted event list is empty. Ignoring"

    .line 1565
    .line 1566
    invoke-virtual {v0, v2}, LO3/V;->b(Ljava/lang/String;)V

    .line 1567
    .line 1568
    .line 1569
    goto :goto_1b

    .line 1570
    :cond_2c
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1571
    .line 1572
    .line 1573
    move-result-object v0

    .line 1574
    :cond_2d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1575
    .line 1576
    .line 1577
    move-result v3

    .line 1578
    if-eqz v3, :cond_2e

    .line 1579
    .line 1580
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1581
    .line 1582
    .line 1583
    move-result-object v3

    .line 1584
    check-cast v3, Ljava/lang/String;

    .line 1585
    .line 1586
    iget-object v8, v5, LO3/t0;->y:LO3/Y1;

    .line 1587
    .line 1588
    invoke-static {v8}, LO3/t0;->j(LO3/D0;)V

    .line 1589
    .line 1590
    .line 1591
    const-string v9, "safelisted event"

    .line 1592
    .line 1593
    invoke-virtual {v8, v9, v3}, LO3/Y1;->p0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 1594
    .line 1595
    .line 1596
    move-result v3

    .line 1597
    if-nez v3, :cond_2d

    .line 1598
    .line 1599
    goto :goto_1b

    .line 1600
    :cond_2e
    :goto_1a
    iput-object v2, v4, LO3/N;->B:Ljava/util/List;

    .line 1601
    .line 1602
    :goto_1b
    if-eqz v27, :cond_2f

    .line 1603
    .line 1604
    invoke-static {v1}, LC3/a;->F(Landroid/content/Context;)Z

    .line 1605
    .line 1606
    .line 1607
    move-result v0

    .line 1608
    iput v0, v4, LO3/N;->D:I

    .line 1609
    .line 1610
    goto :goto_1c

    .line 1611
    :cond_2f
    const/4 v9, 0x0

    .line 1612
    iput v9, v4, LO3/N;->D:I

    .line 1613
    .line 1614
    :goto_1c
    iget-object v0, v4, LO3/D0;->r:Ljava/lang/Object;

    .line 1615
    .line 1616
    check-cast v0, LO3/t0;

    .line 1617
    .line 1618
    iget-object v0, v0, LO3/t0;->S:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1619
    .line 1620
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 1621
    .line 1622
    .line 1623
    const/4 v1, 0x1

    .line 1624
    iput-boolean v1, v4, LO3/H;->s:Z

    .line 1625
    .line 1626
    new-instance v0, LO3/g1;

    .line 1627
    .line 1628
    invoke-direct {v0, v6}, LO3/H;-><init>(LO3/t0;)V

    .line 1629
    .line 1630
    .line 1631
    invoke-virtual {v0}, LO3/H;->q()V

    .line 1632
    .line 1633
    .line 1634
    iput-object v0, v6, LO3/t0;->K:LO3/g1;

    .line 1635
    .line 1636
    iget-boolean v1, v0, LO3/H;->s:Z

    .line 1637
    .line 1638
    if-nez v1, :cond_5e

    .line 1639
    .line 1640
    iget-object v1, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 1641
    .line 1642
    check-cast v1, LO3/t0;

    .line 1643
    .line 1644
    iget-object v1, v1, LO3/t0;->q:Landroid/content/Context;

    .line 1645
    .line 1646
    const-string v2, "jobscheduler"

    .line 1647
    .line 1648
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1649
    .line 1650
    .line 1651
    move-result-object v1

    .line 1652
    check-cast v1, Landroid/app/job/JobScheduler;

    .line 1653
    .line 1654
    iput-object v1, v0, LO3/g1;->t:Landroid/app/job/JobScheduler;

    .line 1655
    .line 1656
    iget-object v1, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 1657
    .line 1658
    check-cast v1, LO3/t0;

    .line 1659
    .line 1660
    iget-object v1, v1, LO3/t0;->S:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1661
    .line 1662
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 1663
    .line 1664
    .line 1665
    const/4 v1, 0x1

    .line 1666
    iput-boolean v1, v0, LO3/H;->s:Z

    .line 1667
    .line 1668
    invoke-static {v12}, LO3/t0;->l(LO3/E0;)V

    .line 1669
    .line 1670
    .line 1671
    iget-object v0, v12, LO3/X;->D:LO3/V;

    .line 1672
    .line 1673
    iget-object v1, v12, LO3/X;->C:LO3/V;

    .line 1674
    .line 1675
    iget-object v2, v12, LO3/X;->E:LO3/V;

    .line 1676
    .line 1677
    iget-object v3, v12, LO3/X;->w:LO3/V;

    .line 1678
    .line 1679
    invoke-virtual {v15}, LO3/g;->t()V

    .line 1680
    .line 1681
    .line 1682
    const-string v4, "App measurement initialized, version"

    .line 1683
    .line 1684
    const-wide/32 v8, 0x1fbd0

    .line 1685
    .line 1686
    .line 1687
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1688
    .line 1689
    .line 1690
    move-result-object v5

    .line 1691
    invoke-virtual {v1, v5, v4}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1692
    .line 1693
    .line 1694
    invoke-static {v12}, LO3/t0;->l(LO3/E0;)V

    .line 1695
    .line 1696
    .line 1697
    const-string v4, "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE"

    .line 1698
    .line 1699
    invoke-virtual {v1, v4}, LO3/V;->b(Ljava/lang/String;)V

    .line 1700
    .line 1701
    .line 1702
    invoke-virtual/range {v19 .. v19}, LO3/N;->u()Ljava/lang/String;

    .line 1703
    .line 1704
    .line 1705
    move-result-object v4

    .line 1706
    iget-object v5, v15, LO3/g;->t:Ljava/lang/String;

    .line 1707
    .line 1708
    invoke-virtual {v14, v4, v5}, LO3/Y1;->O(Ljava/lang/String;Ljava/lang/String;)Z

    .line 1709
    .line 1710
    .line 1711
    move-result v5

    .line 1712
    if-eqz v5, :cond_30

    .line 1713
    .line 1714
    invoke-static {v12}, LO3/t0;->l(LO3/E0;)V

    .line 1715
    .line 1716
    .line 1717
    const-string v4, "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none."

    .line 1718
    .line 1719
    invoke-virtual {v1, v4}, LO3/V;->b(Ljava/lang/String;)V

    .line 1720
    .line 1721
    .line 1722
    goto :goto_1d

    .line 1723
    :cond_30
    invoke-static {v12}, LO3/t0;->l(LO3/E0;)V

    .line 1724
    .line 1725
    .line 1726
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1727
    .line 1728
    .line 1729
    move-result-object v4

    .line 1730
    const-string v5, "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "

    .line 1731
    .line 1732
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1733
    .line 1734
    .line 1735
    move-result-object v4

    .line 1736
    invoke-virtual {v1, v4}, LO3/V;->b(Ljava/lang/String;)V

    .line 1737
    .line 1738
    .line 1739
    :goto_1d
    invoke-static {v12}, LO3/t0;->l(LO3/E0;)V

    .line 1740
    .line 1741
    .line 1742
    const-string v4, "Debug-level message logging enabled"

    .line 1743
    .line 1744
    invoke-virtual {v0, v4}, LO3/V;->b(Ljava/lang/String;)V

    .line 1745
    .line 1746
    .line 1747
    iget v4, v6, LO3/t0;->Q:I

    .line 1748
    .line 1749
    iget-object v5, v6, LO3/t0;->S:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1750
    .line 1751
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 1752
    .line 1753
    .line 1754
    move-result v8

    .line 1755
    if-eq v4, v8, :cond_31

    .line 1756
    .line 1757
    invoke-static {v12}, LO3/t0;->l(LO3/E0;)V

    .line 1758
    .line 1759
    .line 1760
    iget v4, v6, LO3/t0;->Q:I

    .line 1761
    .line 1762
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1763
    .line 1764
    .line 1765
    move-result-object v4

    .line 1766
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 1767
    .line 1768
    .line 1769
    move-result v5

    .line 1770
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1771
    .line 1772
    .line 1773
    move-result-object v5

    .line 1774
    const-string v8, "Not all components initialized"

    .line 1775
    .line 1776
    invoke-virtual {v3, v4, v5, v8}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1777
    .line 1778
    .line 1779
    :cond_31
    const/4 v4, 0x1

    .line 1780
    iput-boolean v4, v6, LO3/t0;->L:Z

    .line 1781
    .line 1782
    iget-object v4, v11, LO3/N0;->d:Lcom/google/android/gms/internal/measurement/V;

    .line 1783
    .line 1784
    const-string v5, "gmp_app_id"

    .line 1785
    .line 1786
    iget-wide v8, v6, LO3/t0;->T:J

    .line 1787
    .line 1788
    sget-object v10, LO3/I0;->s:LO3/I0;

    .line 1789
    .line 1790
    const-class v11, LO3/I0;

    .line 1791
    .line 1792
    iget-object v13, v6, LO3/t0;->C:LO3/b1;

    .line 1793
    .line 1794
    move-object/from16 v19, v12

    .line 1795
    .line 1796
    iget-object v12, v6, LO3/t0;->w:LO3/p0;

    .line 1797
    .line 1798
    invoke-static {v12}, LO3/t0;->l(LO3/E0;)V

    .line 1799
    .line 1800
    .line 1801
    invoke-virtual {v12}, LO3/p0;->o()V

    .line 1802
    .line 1803
    .line 1804
    iget-object v12, v6, LO3/t0;->K:LO3/g1;

    .line 1805
    .line 1806
    invoke-static {v12}, LO3/t0;->i(LO3/C;)V

    .line 1807
    .line 1808
    .line 1809
    iget-object v12, v6, LO3/t0;->K:LO3/g1;

    .line 1810
    .line 1811
    invoke-virtual {v12}, LO3/g1;->t()I

    .line 1812
    .line 1813
    .line 1814
    move-result v12

    .line 1815
    invoke-static {}, Lcom/google/android/gms/internal/measurement/Y3;->a()V

    .line 1816
    .line 1817
    .line 1818
    move-object/from16 v18, v1

    .line 1819
    .line 1820
    sget-object v1, LO3/F;->Q0:LO3/E;

    .line 1821
    .line 1822
    move-object/from16 v20, v5

    .line 1823
    .line 1824
    const/4 v5, 0x0

    .line 1825
    invoke-virtual {v15, v5, v1}, LO3/g;->y(Ljava/lang/String;LO3/E;)Z

    .line 1826
    .line 1827
    .line 1828
    move-result v1

    .line 1829
    const/4 v5, 0x2

    .line 1830
    if-ne v12, v5, :cond_32

    .line 1831
    .line 1832
    const/4 v5, 0x1

    .line 1833
    goto :goto_1e

    .line 1834
    :cond_32
    const/4 v5, 0x0

    .line 1835
    :goto_1e
    const-wide/16 v27, 0x1

    .line 1836
    .line 1837
    if-eqz v1, :cond_33

    .line 1838
    .line 1839
    invoke-virtual {v14}, LO3/D0;->o()V

    .line 1840
    .line 1841
    .line 1842
    invoke-virtual {v14}, LO3/Y1;->J()J

    .line 1843
    .line 1844
    .line 1845
    move-result-wide v29

    .line 1846
    cmp-long v1, v29, v27

    .line 1847
    .line 1848
    if-nez v1, :cond_33

    .line 1849
    .line 1850
    goto :goto_1f

    .line 1851
    :cond_33
    if-eqz v5, :cond_37

    .line 1852
    .line 1853
    const/4 v5, 0x1

    .line 1854
    :goto_1f
    invoke-virtual {v14}, LO3/D0;->o()V

    .line 1855
    .line 1856
    .line 1857
    new-instance v1, Landroid/content/IntentFilter;

    .line 1858
    .line 1859
    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    .line 1860
    .line 1861
    .line 1862
    const-string v12, "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"

    .line 1863
    .line 1864
    invoke-virtual {v1, v12}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1865
    .line 1866
    .line 1867
    const-string v12, "com.google.android.gms.measurement.BATCHES_AVAILABLE"

    .line 1868
    .line 1869
    invoke-virtual {v1, v12}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1870
    .line 1871
    .line 1872
    new-instance v12, LO3/b2;

    .line 1873
    .line 1874
    invoke-direct {v12, v7}, LO3/b2;-><init>(LO3/t0;)V

    .line 1875
    .line 1876
    .line 1877
    move/from16 v24, v5

    .line 1878
    .line 1879
    iget-object v5, v7, LO3/t0;->q:Landroid/content/Context;

    .line 1880
    .line 1881
    move-object/from16 v29, v3

    .line 1882
    .line 1883
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1884
    .line 1885
    move-object/from16 v30, v14

    .line 1886
    .line 1887
    const/16 v14, 0x21

    .line 1888
    .line 1889
    if-lt v3, v14, :cond_34

    .line 1890
    .line 1891
    invoke-static {v5, v12, v1}, LE0/d;->f(Landroid/content/Context;LO3/b2;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 1892
    .line 1893
    .line 1894
    goto :goto_20

    .line 1895
    :cond_34
    const/16 v14, 0x1a

    .line 1896
    .line 1897
    if-lt v3, v14, :cond_35

    .line 1898
    .line 1899
    invoke-static {v5, v12, v1}, LE0/d;->e(Landroid/content/Context;LO3/b2;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 1900
    .line 1901
    .line 1902
    goto :goto_20

    .line 1903
    :cond_35
    const/4 v3, 0x0

    .line 1904
    invoke-virtual {v5, v12, v1, v3, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 1905
    .line 1906
    .line 1907
    :goto_20
    iget-object v1, v7, LO3/t0;->v:LO3/X;

    .line 1908
    .line 1909
    invoke-static {v1}, LO3/t0;->l(LO3/E0;)V

    .line 1910
    .line 1911
    .line 1912
    iget-object v1, v1, LO3/X;->D:LO3/V;

    .line 1913
    .line 1914
    const-string v3, "Registered app receiver"

    .line 1915
    .line 1916
    invoke-virtual {v1, v3}, LO3/V;->b(Ljava/lang/String;)V

    .line 1917
    .line 1918
    .line 1919
    if-eqz v24, :cond_36

    .line 1920
    .line 1921
    iget-object v1, v6, LO3/t0;->K:LO3/g1;

    .line 1922
    .line 1923
    invoke-static {v1}, LO3/t0;->i(LO3/C;)V

    .line 1924
    .line 1925
    .line 1926
    iget-object v1, v6, LO3/t0;->K:LO3/g1;

    .line 1927
    .line 1928
    sget-object v3, LO3/F;->C:LO3/E;

    .line 1929
    .line 1930
    const/4 v5, 0x0

    .line 1931
    invoke-virtual {v3, v5}, LO3/E;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1932
    .line 1933
    .line 1934
    move-result-object v3

    .line 1935
    check-cast v3, Ljava/lang/Long;

    .line 1936
    .line 1937
    move-object v12, v6

    .line 1938
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 1939
    .line 1940
    .line 1941
    move-result-wide v5

    .line 1942
    invoke-virtual {v1, v5, v6}, LO3/g1;->s(J)V

    .line 1943
    .line 1944
    .line 1945
    :goto_21
    move-object/from16 v1, v26

    .line 1946
    .line 1947
    goto :goto_22

    .line 1948
    :cond_36
    move-object v12, v6

    .line 1949
    goto :goto_21

    .line 1950
    :cond_37
    move-object/from16 v29, v3

    .line 1951
    .line 1952
    move-object v12, v6

    .line 1953
    move-object/from16 v30, v14

    .line 1954
    .line 1955
    goto :goto_21

    .line 1956
    :goto_22
    iget-object v3, v1, LO3/h0;->x:LK2/a;

    .line 1957
    .line 1958
    invoke-virtual {v1}, LO3/h0;->v()LO3/J0;

    .line 1959
    .line 1960
    .line 1961
    move-result-object v5

    .line 1962
    iget v6, v5, LO3/J0;->b:I

    .line 1963
    .line 1964
    const-string v14, "google_analytics_default_allow_ad_storage"

    .line 1965
    .line 1966
    move-object/from16 v24, v5

    .line 1967
    .line 1968
    const/4 v5, 0x0

    .line 1969
    invoke-virtual {v15, v14, v5}, LO3/g;->D(Ljava/lang/String;Z)LO3/G0;

    .line 1970
    .line 1971
    .line 1972
    move-result-object v14

    .line 1973
    move-object/from16 v26, v12

    .line 1974
    .line 1975
    const-string v12, "google_analytics_default_allow_analytics_storage"

    .line 1976
    .line 1977
    invoke-virtual {v15, v12, v5}, LO3/g;->D(Ljava/lang/String;Z)LO3/G0;

    .line 1978
    .line 1979
    .line 1980
    move-result-object v12

    .line 1981
    move-object/from16 v5, v25

    .line 1982
    .line 1983
    if-ne v14, v5, :cond_38

    .line 1984
    .line 1985
    if-eq v12, v5, :cond_39

    .line 1986
    .line 1987
    :cond_38
    move-object/from16 v25, v7

    .line 1988
    .line 1989
    goto :goto_23

    .line 1990
    :cond_39
    move-object/from16 v31, v3

    .line 1991
    .line 1992
    move-object/from16 v25, v7

    .line 1993
    .line 1994
    move-wide/from16 v32, v8

    .line 1995
    .line 1996
    goto :goto_25

    .line 1997
    :goto_23
    invoke-virtual {v1}, LO3/h0;->s()Landroid/content/SharedPreferences;

    .line 1998
    .line 1999
    .line 2000
    move-result-object v7

    .line 2001
    move-object/from16 v31, v3

    .line 2002
    .line 2003
    const-string v3, "consent_source"

    .line 2004
    .line 2005
    move-wide/from16 v32, v8

    .line 2006
    .line 2007
    const/16 v8, 0x64

    .line 2008
    .line 2009
    invoke-interface {v7, v3, v8}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 2010
    .line 2011
    .line 2012
    move-result v3

    .line 2013
    const/16 v7, -0xa

    .line 2014
    .line 2015
    invoke-static {v7, v3}, LO3/J0;->l(II)Z

    .line 2016
    .line 2017
    .line 2018
    move-result v3

    .line 2019
    if-eqz v3, :cond_3a

    .line 2020
    .line 2021
    new-instance v3, Ljava/util/EnumMap;

    .line 2022
    .line 2023
    invoke-direct {v3, v11}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 2024
    .line 2025
    .line 2026
    sget-object v6, LO3/I0;->r:LO3/I0;

    .line 2027
    .line 2028
    invoke-virtual {v3, v6, v14}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2029
    .line 2030
    .line 2031
    invoke-virtual {v3, v10, v12}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2032
    .line 2033
    .line 2034
    new-instance v6, LO3/J0;

    .line 2035
    .line 2036
    invoke-direct {v6, v3, v7}, LO3/J0;-><init>(Ljava/util/EnumMap;I)V

    .line 2037
    .line 2038
    .line 2039
    move-object v3, v6

    .line 2040
    :goto_24
    const/4 v6, 0x0

    .line 2041
    goto :goto_28

    .line 2042
    :cond_3a
    :goto_25
    invoke-virtual/range {v26 .. v26}, LO3/t0;->q()LO3/N;

    .line 2043
    .line 2044
    .line 2045
    move-result-object v3

    .line 2046
    invoke-virtual {v3}, LO3/N;->v()Ljava/lang/String;

    .line 2047
    .line 2048
    .line 2049
    move-result-object v3

    .line 2050
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2051
    .line 2052
    .line 2053
    move-result v3

    .line 2054
    if-nez v3, :cond_3d

    .line 2055
    .line 2056
    if-eqz v6, :cond_3c

    .line 2057
    .line 2058
    const/16 v3, 0x1e

    .line 2059
    .line 2060
    if-eq v6, v3, :cond_3c

    .line 2061
    .line 2062
    const/16 v3, 0xa

    .line 2063
    .line 2064
    if-eq v6, v3, :cond_3c

    .line 2065
    .line 2066
    const/16 v3, 0x28

    .line 2067
    .line 2068
    if-ne v6, v3, :cond_3b

    .line 2069
    .line 2070
    goto :goto_26

    .line 2071
    :cond_3b
    const/4 v3, 0x0

    .line 2072
    goto :goto_24

    .line 2073
    :cond_3c
    :goto_26
    invoke-static {v13}, LO3/t0;->k(LO3/H;)V

    .line 2074
    .line 2075
    .line 2076
    new-instance v3, LO3/J0;

    .line 2077
    .line 2078
    const/16 v7, -0xa

    .line 2079
    .line 2080
    invoke-direct {v3, v7}, LO3/J0;-><init>(I)V

    .line 2081
    .line 2082
    .line 2083
    const/4 v6, 0x0

    .line 2084
    invoke-virtual {v13, v3, v6}, LO3/b1;->J(LO3/J0;Z)V

    .line 2085
    .line 2086
    .line 2087
    :goto_27
    const/4 v3, 0x0

    .line 2088
    goto :goto_28

    .line 2089
    :cond_3d
    const/4 v6, 0x0

    .line 2090
    goto :goto_27

    .line 2091
    :goto_28
    if-eqz v3, :cond_3e

    .line 2092
    .line 2093
    invoke-static {v13}, LO3/t0;->k(LO3/H;)V

    .line 2094
    .line 2095
    .line 2096
    const/4 v7, 0x1

    .line 2097
    invoke-virtual {v13, v3, v7}, LO3/b1;->J(LO3/J0;Z)V

    .line 2098
    .line 2099
    .line 2100
    goto :goto_29

    .line 2101
    :cond_3e
    move-object/from16 v3, v24

    .line 2102
    .line 2103
    :goto_29
    invoke-static {v13}, LO3/t0;->k(LO3/H;)V

    .line 2104
    .line 2105
    .line 2106
    iget-object v7, v13, LO3/D0;->r:Ljava/lang/Object;

    .line 2107
    .line 2108
    check-cast v7, LO3/t0;

    .line 2109
    .line 2110
    invoke-virtual {v13, v3}, LO3/b1;->s(LO3/J0;)V

    .line 2111
    .line 2112
    .line 2113
    invoke-virtual {v1}, LO3/D0;->o()V

    .line 2114
    .line 2115
    .line 2116
    invoke-virtual {v1}, LO3/h0;->s()Landroid/content/SharedPreferences;

    .line 2117
    .line 2118
    .line 2119
    move-result-object v3

    .line 2120
    const-string v8, "dma_consent_settings"

    .line 2121
    .line 2122
    const/4 v9, 0x0

    .line 2123
    invoke-interface {v3, v8, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2124
    .line 2125
    .line 2126
    move-result-object v3

    .line 2127
    invoke-static {v3}, LO3/p;->b(Ljava/lang/String;)LO3/p;

    .line 2128
    .line 2129
    .line 2130
    move-result-object v3

    .line 2131
    iget v3, v3, LO3/p;->a:I

    .line 2132
    .line 2133
    const-string v8, "google_analytics_default_allow_ad_personalization_signals"

    .line 2134
    .line 2135
    const/4 v9, 0x1

    .line 2136
    invoke-virtual {v15, v8, v9}, LO3/g;->D(Ljava/lang/String;Z)LO3/G0;

    .line 2137
    .line 2138
    .line 2139
    move-result-object v8

    .line 2140
    if-eq v8, v5, :cond_3f

    .line 2141
    .line 2142
    invoke-static/range {v19 .. v19}, LO3/t0;->l(LO3/E0;)V

    .line 2143
    .line 2144
    .line 2145
    const-string v12, "Default ad personalization consent from Manifest"

    .line 2146
    .line 2147
    invoke-virtual {v2, v8, v12}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2148
    .line 2149
    .line 2150
    :cond_3f
    const-string v8, "google_analytics_default_allow_ad_user_data"

    .line 2151
    .line 2152
    invoke-virtual {v15, v8, v9}, LO3/g;->D(Ljava/lang/String;Z)LO3/G0;

    .line 2153
    .line 2154
    .line 2155
    move-result-object v8

    .line 2156
    if-eq v8, v5, :cond_40

    .line 2157
    .line 2158
    const/16 v12, -0xa

    .line 2159
    .line 2160
    invoke-static {v12, v3}, LO3/J0;->l(II)Z

    .line 2161
    .line 2162
    .line 2163
    move-result v14

    .line 2164
    if-eqz v14, :cond_40

    .line 2165
    .line 2166
    invoke-static {v13}, LO3/t0;->k(LO3/H;)V

    .line 2167
    .line 2168
    .line 2169
    new-instance v3, Ljava/util/EnumMap;

    .line 2170
    .line 2171
    invoke-direct {v3, v11}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 2172
    .line 2173
    .line 2174
    sget-object v4, LO3/I0;->t:LO3/I0;

    .line 2175
    .line 2176
    invoke-virtual {v3, v4, v8}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2177
    .line 2178
    .line 2179
    new-instance v4, LO3/p;

    .line 2180
    .line 2181
    const/4 v5, 0x0

    .line 2182
    invoke-direct {v4, v3, v12, v5, v5}, LO3/p;-><init>(Ljava/util/EnumMap;ILjava/lang/Boolean;Ljava/lang/String;)V

    .line 2183
    .line 2184
    .line 2185
    invoke-virtual {v13, v4, v9}, LO3/b1;->I(LO3/p;Z)V

    .line 2186
    .line 2187
    .line 2188
    goto :goto_2a

    .line 2189
    :cond_40
    invoke-virtual/range {v26 .. v26}, LO3/t0;->q()LO3/N;

    .line 2190
    .line 2191
    .line 2192
    move-result-object v8

    .line 2193
    invoke-virtual {v8}, LO3/N;->v()Ljava/lang/String;

    .line 2194
    .line 2195
    .line 2196
    move-result-object v8

    .line 2197
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2198
    .line 2199
    .line 2200
    move-result v8

    .line 2201
    if-nez v8, :cond_42

    .line 2202
    .line 2203
    if-eqz v3, :cond_41

    .line 2204
    .line 2205
    const/16 v8, 0x1e

    .line 2206
    .line 2207
    if-ne v3, v8, :cond_42

    .line 2208
    .line 2209
    :cond_41
    invoke-static {v13}, LO3/t0;->k(LO3/H;)V

    .line 2210
    .line 2211
    .line 2212
    new-instance v3, LO3/p;

    .line 2213
    .line 2214
    const/4 v5, 0x0

    .line 2215
    const/16 v12, -0xa

    .line 2216
    .line 2217
    invoke-direct {v3, v5, v12, v5, v5}, LO3/p;-><init>(Ljava/lang/Boolean;ILjava/lang/Boolean;Ljava/lang/String;)V

    .line 2218
    .line 2219
    .line 2220
    const/4 v4, 0x1

    .line 2221
    invoke-virtual {v13, v3, v4}, LO3/b1;->I(LO3/p;Z)V

    .line 2222
    .line 2223
    .line 2224
    goto :goto_2a

    .line 2225
    :cond_42
    invoke-virtual/range {v26 .. v26}, LO3/t0;->q()LO3/N;

    .line 2226
    .line 2227
    .line 2228
    move-result-object v8

    .line 2229
    invoke-virtual {v8}, LO3/N;->v()Ljava/lang/String;

    .line 2230
    .line 2231
    .line 2232
    move-result-object v8

    .line 2233
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2234
    .line 2235
    .line 2236
    move-result v8

    .line 2237
    if-eqz v8, :cond_44

    .line 2238
    .line 2239
    if-eqz v4, :cond_44

    .line 2240
    .line 2241
    iget-object v4, v4, Lcom/google/android/gms/internal/measurement/V;->t:Landroid/os/Bundle;

    .line 2242
    .line 2243
    if-eqz v4, :cond_44

    .line 2244
    .line 2245
    const/16 v8, 0x1e

    .line 2246
    .line 2247
    invoke-static {v8, v3}, LO3/J0;->l(II)Z

    .line 2248
    .line 2249
    .line 2250
    move-result v3

    .line 2251
    if-eqz v3, :cond_44

    .line 2252
    .line 2253
    invoke-static {v8, v4}, LO3/p;->c(ILandroid/os/Bundle;)LO3/p;

    .line 2254
    .line 2255
    .line 2256
    move-result-object v3

    .line 2257
    iget-object v4, v3, LO3/p;->e:Ljava/util/EnumMap;

    .line 2258
    .line 2259
    invoke-virtual {v4}, Ljava/util/EnumMap;->values()Ljava/util/Collection;

    .line 2260
    .line 2261
    .line 2262
    move-result-object v4

    .line 2263
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2264
    .line 2265
    .line 2266
    move-result-object v4

    .line 2267
    :cond_43
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2268
    .line 2269
    .line 2270
    move-result v8

    .line 2271
    if-eqz v8, :cond_44

    .line 2272
    .line 2273
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2274
    .line 2275
    .line 2276
    move-result-object v8

    .line 2277
    check-cast v8, LO3/G0;

    .line 2278
    .line 2279
    if-eq v8, v5, :cond_43

    .line 2280
    .line 2281
    invoke-static {v13}, LO3/t0;->k(LO3/H;)V

    .line 2282
    .line 2283
    .line 2284
    const/4 v4, 0x1

    .line 2285
    invoke-virtual {v13, v3, v4}, LO3/b1;->I(LO3/p;Z)V

    .line 2286
    .line 2287
    .line 2288
    :cond_44
    :goto_2a
    const-string v3, "google_analytics_tcf_data_enabled"

    .line 2289
    .line 2290
    invoke-virtual {v15, v3}, LO3/g;->A(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 2291
    .line 2292
    .line 2293
    move-result-object v3

    .line 2294
    if-eqz v3, :cond_45

    .line 2295
    .line 2296
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2297
    .line 2298
    .line 2299
    move-result v3

    .line 2300
    if-eqz v3, :cond_47

    .line 2301
    .line 2302
    :cond_45
    invoke-static/range {v19 .. v19}, LO3/t0;->l(LO3/E0;)V

    .line 2303
    .line 2304
    .line 2305
    const-string v3, "TCF client enabled."

    .line 2306
    .line 2307
    invoke-virtual {v0, v3}, LO3/V;->b(Ljava/lang/String;)V

    .line 2308
    .line 2309
    .line 2310
    invoke-static {v13}, LO3/t0;->k(LO3/H;)V

    .line 2311
    .line 2312
    .line 2313
    invoke-virtual {v13}, LO3/C;->o()V

    .line 2314
    .line 2315
    .line 2316
    iget-object v0, v7, LO3/t0;->v:LO3/X;

    .line 2317
    .line 2318
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 2319
    .line 2320
    .line 2321
    iget-object v0, v0, LO3/X;->D:LO3/V;

    .line 2322
    .line 2323
    const-string v3, "Register tcfPrefChangeListener."

    .line 2324
    .line 2325
    invoke-virtual {v0, v3}, LO3/V;->b(Ljava/lang/String;)V

    .line 2326
    .line 2327
    .line 2328
    iget-object v0, v13, LO3/b1;->L:LO3/a1;

    .line 2329
    .line 2330
    if-nez v0, :cond_46

    .line 2331
    .line 2332
    new-instance v0, LO3/P0;

    .line 2333
    .line 2334
    const/4 v3, 0x2

    .line 2335
    invoke-direct {v0, v13, v7, v3}, LO3/P0;-><init>(LO3/b1;LO3/F0;I)V

    .line 2336
    .line 2337
    .line 2338
    iput-object v0, v13, LO3/b1;->M:LO3/P0;

    .line 2339
    .line 2340
    new-instance v0, LO3/a1;

    .line 2341
    .line 2342
    invoke-direct {v0, v13}, LO3/a1;-><init>(LO3/b1;)V

    .line 2343
    .line 2344
    .line 2345
    iput-object v0, v13, LO3/b1;->L:LO3/a1;

    .line 2346
    .line 2347
    :cond_46
    iget-object v0, v7, LO3/t0;->u:LO3/h0;

    .line 2348
    .line 2349
    invoke-static {v0}, LO3/t0;->j(LO3/D0;)V

    .line 2350
    .line 2351
    .line 2352
    invoke-virtual {v0}, LO3/h0;->t()Landroid/content/SharedPreferences;

    .line 2353
    .line 2354
    .line 2355
    move-result-object v0

    .line 2356
    iget-object v3, v13, LO3/b1;->L:LO3/a1;

    .line 2357
    .line 2358
    invoke-interface {v0, v3}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 2359
    .line 2360
    .line 2361
    invoke-static {v13}, LO3/t0;->k(LO3/H;)V

    .line 2362
    .line 2363
    .line 2364
    invoke-virtual {v13}, LO3/b1;->u()V

    .line 2365
    .line 2366
    .line 2367
    :cond_47
    iget-object v0, v1, LO3/h0;->w:LO3/f0;

    .line 2368
    .line 2369
    invoke-virtual {v0}, LO3/f0;->a()J

    .line 2370
    .line 2371
    .line 2372
    move-result-wide v3

    .line 2373
    cmp-long v3, v3, v16

    .line 2374
    .line 2375
    if-nez v3, :cond_48

    .line 2376
    .line 2377
    invoke-static/range {v19 .. v19}, LO3/t0;->l(LO3/E0;)V

    .line 2378
    .line 2379
    .line 2380
    const-string v3, "Persisting first open"

    .line 2381
    .line 2382
    invoke-static/range {v32 .. v33}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2383
    .line 2384
    .line 2385
    move-result-object v4

    .line 2386
    invoke-virtual {v2, v4, v3}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2387
    .line 2388
    .line 2389
    move-wide/from16 v3, v32

    .line 2390
    .line 2391
    invoke-virtual {v0, v3, v4}, LO3/f0;->b(J)V

    .line 2392
    .line 2393
    .line 2394
    goto :goto_2b

    .line 2395
    :cond_48
    move-wide/from16 v3, v32

    .line 2396
    .line 2397
    :goto_2b
    invoke-static {v13}, LO3/t0;->k(LO3/H;)V

    .line 2398
    .line 2399
    .line 2400
    iget-object v5, v13, LO3/b1;->I:LO3/r0;

    .line 2401
    .line 2402
    invoke-virtual {v5}, LO3/r0;->d()Z

    .line 2403
    .line 2404
    .line 2405
    move-result v8

    .line 2406
    if-eqz v8, :cond_49

    .line 2407
    .line 2408
    invoke-virtual {v5}, LO3/r0;->c()Z

    .line 2409
    .line 2410
    .line 2411
    move-result v8

    .line 2412
    if-eqz v8, :cond_49

    .line 2413
    .line 2414
    iget-object v5, v5, LO3/r0;->q:LO3/t0;

    .line 2415
    .line 2416
    iget-object v5, v5, LO3/t0;->u:LO3/h0;

    .line 2417
    .line 2418
    invoke-static {v5}, LO3/t0;->j(LO3/D0;)V

    .line 2419
    .line 2420
    .line 2421
    iget-object v5, v5, LO3/h0;->N:LK2/a;

    .line 2422
    .line 2423
    const/4 v9, 0x0

    .line 2424
    invoke-virtual {v5, v9}, LK2/a;->f(Ljava/lang/String;)V

    .line 2425
    .line 2426
    .line 2427
    :cond_49
    invoke-virtual/range {v26 .. v26}, LO3/t0;->h()Z

    .line 2428
    .line 2429
    .line 2430
    move-result v5

    .line 2431
    if-nez v5, :cond_4f

    .line 2432
    .line 2433
    invoke-virtual/range {v26 .. v26}, LO3/t0;->a()Z

    .line 2434
    .line 2435
    .line 2436
    move-result v0

    .line 2437
    if-eqz v0, :cond_4e

    .line 2438
    .line 2439
    const-string v0, "android.permission.INTERNET"

    .line 2440
    .line 2441
    move-object/from16 v5, v30

    .line 2442
    .line 2443
    invoke-virtual {v5, v0}, LO3/Y1;->L(Ljava/lang/String;)Z

    .line 2444
    .line 2445
    .line 2446
    move-result v0

    .line 2447
    if-nez v0, :cond_4a

    .line 2448
    .line 2449
    invoke-static/range {v19 .. v19}, LO3/t0;->l(LO3/E0;)V

    .line 2450
    .line 2451
    .line 2452
    const-string v0, "App is missing INTERNET permission"

    .line 2453
    .line 2454
    move-object/from16 v3, v29

    .line 2455
    .line 2456
    invoke-virtual {v3, v0}, LO3/V;->b(Ljava/lang/String;)V

    .line 2457
    .line 2458
    .line 2459
    goto :goto_2c

    .line 2460
    :cond_4a
    move-object/from16 v3, v29

    .line 2461
    .line 2462
    :goto_2c
    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    .line 2463
    .line 2464
    invoke-virtual {v5, v0}, LO3/Y1;->L(Ljava/lang/String;)Z

    .line 2465
    .line 2466
    .line 2467
    move-result v0

    .line 2468
    if-nez v0, :cond_4b

    .line 2469
    .line 2470
    invoke-static/range {v19 .. v19}, LO3/t0;->l(LO3/E0;)V

    .line 2471
    .line 2472
    .line 2473
    const-string v0, "App is missing ACCESS_NETWORK_STATE permission"

    .line 2474
    .line 2475
    invoke-virtual {v3, v0}, LO3/V;->b(Ljava/lang/String;)V

    .line 2476
    .line 2477
    .line 2478
    :cond_4b
    move-object/from16 v12, v26

    .line 2479
    .line 2480
    iget-object v0, v12, LO3/t0;->q:Landroid/content/Context;

    .line 2481
    .line 2482
    invoke-static {v0}, LC3/c;->a(Landroid/content/Context;)LC3/b;

    .line 2483
    .line 2484
    .line 2485
    move-result-object v4

    .line 2486
    invoke-virtual {v4}, LC3/b;->b()Z

    .line 2487
    .line 2488
    .line 2489
    move-result v4

    .line 2490
    if-nez v4, :cond_4d

    .line 2491
    .line 2492
    invoke-virtual {v15}, LO3/g;->r()Z

    .line 2493
    .line 2494
    .line 2495
    move-result v4

    .line 2496
    if-nez v4, :cond_4d

    .line 2497
    .line 2498
    invoke-static {v0}, LO3/Y1;->e0(Landroid/content/Context;)Z

    .line 2499
    .line 2500
    .line 2501
    move-result v4

    .line 2502
    if-nez v4, :cond_4c

    .line 2503
    .line 2504
    invoke-static/range {v19 .. v19}, LO3/t0;->l(LO3/E0;)V

    .line 2505
    .line 2506
    .line 2507
    const-string v4, "AppMeasurementReceiver not registered/enabled"

    .line 2508
    .line 2509
    invoke-virtual {v3, v4}, LO3/V;->b(Ljava/lang/String;)V

    .line 2510
    .line 2511
    .line 2512
    :cond_4c
    invoke-static {v0}, LO3/Y1;->H(Landroid/content/Context;)Z

    .line 2513
    .line 2514
    .line 2515
    move-result v0

    .line 2516
    if-nez v0, :cond_4d

    .line 2517
    .line 2518
    invoke-static/range {v19 .. v19}, LO3/t0;->l(LO3/E0;)V

    .line 2519
    .line 2520
    .line 2521
    const-string v0, "AppMeasurementService not registered/enabled"

    .line 2522
    .line 2523
    invoke-virtual {v3, v0}, LO3/V;->b(Ljava/lang/String;)V

    .line 2524
    .line 2525
    .line 2526
    :cond_4d
    invoke-static/range {v19 .. v19}, LO3/t0;->l(LO3/E0;)V

    .line 2527
    .line 2528
    .line 2529
    const-string v0, "Uploading is not possible. App measurement disabled"

    .line 2530
    .line 2531
    invoke-virtual {v3, v0}, LO3/V;->b(Ljava/lang/String;)V

    .line 2532
    .line 2533
    .line 2534
    :goto_2d
    move-object/from16 v3, v19

    .line 2535
    .line 2536
    goto/16 :goto_33

    .line 2537
    .line 2538
    :cond_4e
    move-object/from16 v12, v26

    .line 2539
    .line 2540
    move-object/from16 v5, v30

    .line 2541
    .line 2542
    goto :goto_2d

    .line 2543
    :cond_4f
    move-object/from16 v12, v26

    .line 2544
    .line 2545
    move-object/from16 v5, v30

    .line 2546
    .line 2547
    invoke-virtual {v12}, LO3/t0;->q()LO3/N;

    .line 2548
    .line 2549
    .line 2550
    move-result-object v8

    .line 2551
    invoke-virtual {v8}, LO3/N;->v()Ljava/lang/String;

    .line 2552
    .line 2553
    .line 2554
    move-result-object v8

    .line 2555
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2556
    .line 2557
    .line 2558
    move-result v8

    .line 2559
    if-nez v8, :cond_53

    .line 2560
    .line 2561
    invoke-virtual {v12}, LO3/t0;->q()LO3/N;

    .line 2562
    .line 2563
    .line 2564
    move-result-object v8

    .line 2565
    invoke-virtual {v8}, LO3/N;->v()Ljava/lang/String;

    .line 2566
    .line 2567
    .line 2568
    move-result-object v8

    .line 2569
    invoke-virtual {v1}, LO3/D0;->o()V

    .line 2570
    .line 2571
    .line 2572
    invoke-virtual {v1}, LO3/h0;->s()Landroid/content/SharedPreferences;

    .line 2573
    .line 2574
    .line 2575
    move-result-object v9

    .line 2576
    move-object/from16 v11, v20

    .line 2577
    .line 2578
    const/4 v14, 0x0

    .line 2579
    invoke-interface {v9, v11, v14}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2580
    .line 2581
    .line 2582
    move-result-object v9

    .line 2583
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2584
    .line 2585
    .line 2586
    move-result v14

    .line 2587
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2588
    .line 2589
    .line 2590
    move-result v16

    .line 2591
    if-nez v14, :cond_52

    .line 2592
    .line 2593
    if-nez v16, :cond_52

    .line 2594
    .line 2595
    invoke-static {v8}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 2596
    .line 2597
    .line 2598
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2599
    .line 2600
    .line 2601
    move-result v8

    .line 2602
    if-nez v8, :cond_52

    .line 2603
    .line 2604
    invoke-static/range {v19 .. v19}, LO3/t0;->l(LO3/E0;)V

    .line 2605
    .line 2606
    .line 2607
    const-string v8, "Rechecking which service to use due to a GMP App Id change"

    .line 2608
    .line 2609
    move-object/from16 v9, v18

    .line 2610
    .line 2611
    invoke-virtual {v9, v8}, LO3/V;->b(Ljava/lang/String;)V

    .line 2612
    .line 2613
    .line 2614
    invoke-virtual {v1}, LO3/D0;->o()V

    .line 2615
    .line 2616
    .line 2617
    invoke-virtual {v1}, LO3/D0;->o()V

    .line 2618
    .line 2619
    .line 2620
    invoke-virtual {v1}, LO3/h0;->s()Landroid/content/SharedPreferences;

    .line 2621
    .line 2622
    .line 2623
    move-result-object v8

    .line 2624
    move-object/from16 v9, v21

    .line 2625
    .line 2626
    invoke-interface {v8, v9}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 2627
    .line 2628
    .line 2629
    move-result v8

    .line 2630
    if-eqz v8, :cond_50

    .line 2631
    .line 2632
    invoke-virtual {v1}, LO3/h0;->s()Landroid/content/SharedPreferences;

    .line 2633
    .line 2634
    .line 2635
    move-result-object v8

    .line 2636
    const/4 v14, 0x1

    .line 2637
    invoke-interface {v8, v9, v14}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 2638
    .line 2639
    .line 2640
    move-result v8

    .line 2641
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2642
    .line 2643
    .line 2644
    move-result-object v8

    .line 2645
    goto :goto_2e

    .line 2646
    :cond_50
    const/4 v8, 0x0

    .line 2647
    :goto_2e
    invoke-virtual {v1}, LO3/h0;->s()Landroid/content/SharedPreferences;

    .line 2648
    .line 2649
    .line 2650
    move-result-object v14

    .line 2651
    invoke-interface {v14}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 2652
    .line 2653
    .line 2654
    move-result-object v14

    .line 2655
    invoke-interface {v14}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 2656
    .line 2657
    .line 2658
    invoke-interface {v14}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2659
    .line 2660
    .line 2661
    if-eqz v8, :cond_51

    .line 2662
    .line 2663
    invoke-virtual {v1}, LO3/D0;->o()V

    .line 2664
    .line 2665
    .line 2666
    invoke-virtual {v1}, LO3/h0;->s()Landroid/content/SharedPreferences;

    .line 2667
    .line 2668
    .line 2669
    move-result-object v14

    .line 2670
    invoke-interface {v14}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 2671
    .line 2672
    .line 2673
    move-result-object v14

    .line 2674
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2675
    .line 2676
    .line 2677
    move-result v8

    .line 2678
    invoke-interface {v14, v9, v8}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 2679
    .line 2680
    .line 2681
    invoke-interface {v14}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2682
    .line 2683
    .line 2684
    :cond_51
    invoke-virtual {v12}, LO3/t0;->n()LO3/P;

    .line 2685
    .line 2686
    .line 2687
    move-result-object v8

    .line 2688
    invoke-virtual {v8}, LO3/P;->s()V

    .line 2689
    .line 2690
    .line 2691
    iget-object v8, v12, LO3/t0;->H:LO3/w1;

    .line 2692
    .line 2693
    invoke-virtual {v8}, LO3/w1;->w()V

    .line 2694
    .line 2695
    .line 2696
    iget-object v8, v12, LO3/t0;->H:LO3/w1;

    .line 2697
    .line 2698
    invoke-virtual {v8}, LO3/w1;->u()V

    .line 2699
    .line 2700
    .line 2701
    invoke-virtual {v0, v3, v4}, LO3/f0;->b(J)V

    .line 2702
    .line 2703
    .line 2704
    move-object/from16 v0, v31

    .line 2705
    .line 2706
    const/4 v9, 0x0

    .line 2707
    invoke-virtual {v0, v9}, LK2/a;->f(Ljava/lang/String;)V

    .line 2708
    .line 2709
    .line 2710
    goto :goto_2f

    .line 2711
    :cond_52
    move-object/from16 v0, v31

    .line 2712
    .line 2713
    :goto_2f
    invoke-virtual {v12}, LO3/t0;->q()LO3/N;

    .line 2714
    .line 2715
    .line 2716
    move-result-object v3

    .line 2717
    invoke-virtual {v3}, LO3/N;->v()Ljava/lang/String;

    .line 2718
    .line 2719
    .line 2720
    move-result-object v3

    .line 2721
    invoke-virtual {v1}, LO3/D0;->o()V

    .line 2722
    .line 2723
    .line 2724
    invoke-virtual {v1}, LO3/h0;->s()Landroid/content/SharedPreferences;

    .line 2725
    .line 2726
    .line 2727
    move-result-object v4

    .line 2728
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 2729
    .line 2730
    .line 2731
    move-result-object v4

    .line 2732
    invoke-interface {v4, v11, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 2733
    .line 2734
    .line 2735
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2736
    .line 2737
    .line 2738
    goto :goto_30

    .line 2739
    :cond_53
    move-object/from16 v0, v31

    .line 2740
    .line 2741
    :goto_30
    invoke-virtual {v1}, LO3/h0;->v()LO3/J0;

    .line 2742
    .line 2743
    .line 2744
    move-result-object v3

    .line 2745
    invoke-virtual {v3, v10}, LO3/J0;->i(LO3/I0;)Z

    .line 2746
    .line 2747
    .line 2748
    move-result v3

    .line 2749
    if-nez v3, :cond_54

    .line 2750
    .line 2751
    const/4 v9, 0x0

    .line 2752
    invoke-virtual {v0, v9}, LK2/a;->f(Ljava/lang/String;)V

    .line 2753
    .line 2754
    .line 2755
    :cond_54
    invoke-static {v13}, LO3/t0;->k(LO3/H;)V

    .line 2756
    .line 2757
    .line 2758
    invoke-virtual {v0}, LK2/a;->e()Ljava/lang/String;

    .line 2759
    .line 2760
    .line 2761
    move-result-object v0

    .line 2762
    iget-object v3, v13, LO3/b1;->x:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2763
    .line 2764
    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 2765
    .line 2766
    .line 2767
    move-object/from16 v3, v25

    .line 2768
    .line 2769
    :try_start_9
    iget-object v0, v3, LO3/t0;->q:Landroid/content/Context;

    .line 2770
    .line 2771
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 2772
    .line 2773
    .line 2774
    move-result-object v0

    .line 2775
    const-string v3, "com.google.firebase.remoteconfig.FirebaseRemoteConfig"

    .line 2776
    .line 2777
    invoke-virtual {v0, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_9
    .catch Ljava/lang/ClassNotFoundException; {:try_start_9 .. :try_end_9} :catch_8

    .line 2778
    .line 2779
    .line 2780
    :cond_55
    move-object/from16 v3, v19

    .line 2781
    .line 2782
    goto :goto_31

    .line 2783
    :catch_8
    iget-object v0, v1, LO3/h0;->M:LK2/a;

    .line 2784
    .line 2785
    invoke-virtual {v0}, LK2/a;->e()Ljava/lang/String;

    .line 2786
    .line 2787
    .line 2788
    move-result-object v3

    .line 2789
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2790
    .line 2791
    .line 2792
    move-result v3

    .line 2793
    if-nez v3, :cond_55

    .line 2794
    .line 2795
    invoke-static/range {v19 .. v19}, LO3/t0;->l(LO3/E0;)V

    .line 2796
    .line 2797
    .line 2798
    move-object/from16 v3, v19

    .line 2799
    .line 2800
    iget-object v4, v3, LO3/X;->z:LO3/V;

    .line 2801
    .line 2802
    const-string v8, "Remote config removed with active feature rollouts"

    .line 2803
    .line 2804
    invoke-virtual {v4, v8}, LO3/V;->b(Ljava/lang/String;)V

    .line 2805
    .line 2806
    .line 2807
    const/4 v9, 0x0

    .line 2808
    invoke-virtual {v0, v9}, LK2/a;->f(Ljava/lang/String;)V

    .line 2809
    .line 2810
    .line 2811
    :goto_31
    invoke-virtual {v12}, LO3/t0;->q()LO3/N;

    .line 2812
    .line 2813
    .line 2814
    move-result-object v0

    .line 2815
    invoke-virtual {v0}, LO3/N;->v()Ljava/lang/String;

    .line 2816
    .line 2817
    .line 2818
    move-result-object v0

    .line 2819
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2820
    .line 2821
    .line 2822
    move-result v0

    .line 2823
    if-nez v0, :cond_59

    .line 2824
    .line 2825
    invoke-virtual {v12}, LO3/t0;->a()Z

    .line 2826
    .line 2827
    .line 2828
    move-result v0

    .line 2829
    iget-object v4, v1, LO3/h0;->t:Landroid/content/SharedPreferences;

    .line 2830
    .line 2831
    if-nez v4, :cond_56

    .line 2832
    .line 2833
    move v4, v6

    .line 2834
    goto :goto_32

    .line 2835
    :cond_56
    const-string v8, "deferred_analytics_collection"

    .line 2836
    .line 2837
    invoke-interface {v4, v8}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 2838
    .line 2839
    .line 2840
    move-result v4

    .line 2841
    :goto_32
    if-nez v4, :cond_57

    .line 2842
    .line 2843
    invoke-virtual {v15}, LO3/g;->B()Z

    .line 2844
    .line 2845
    .line 2846
    move-result v4

    .line 2847
    if-nez v4, :cond_57

    .line 2848
    .line 2849
    xor-int/lit8 v4, v0, 0x1

    .line 2850
    .line 2851
    invoke-virtual {v1, v4}, LO3/h0;->x(Z)V

    .line 2852
    .line 2853
    .line 2854
    :cond_57
    if-eqz v0, :cond_58

    .line 2855
    .line 2856
    invoke-static {v13}, LO3/t0;->k(LO3/H;)V

    .line 2857
    .line 2858
    .line 2859
    invoke-virtual {v13}, LO3/b1;->A()V

    .line 2860
    .line 2861
    .line 2862
    :cond_58
    iget-object v0, v12, LO3/t0;->x:LO3/E1;

    .line 2863
    .line 2864
    invoke-static {v0}, LO3/t0;->k(LO3/H;)V

    .line 2865
    .line 2866
    .line 2867
    iget-object v0, v0, LO3/E1;->v:Lk3/c;

    .line 2868
    .line 2869
    invoke-virtual {v0}, Lk3/c;->t()V

    .line 2870
    .line 2871
    .line 2872
    invoke-virtual {v12}, LO3/t0;->o()LO3/w1;

    .line 2873
    .line 2874
    .line 2875
    move-result-object v0

    .line 2876
    new-instance v4, Ljava/util/concurrent/atomic/AtomicReference;

    .line 2877
    .line 2878
    invoke-direct {v4}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 2879
    .line 2880
    .line 2881
    invoke-virtual {v0, v4}, LO3/w1;->s(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 2882
    .line 2883
    .line 2884
    invoke-virtual {v12}, LO3/t0;->o()LO3/w1;

    .line 2885
    .line 2886
    .line 2887
    move-result-object v0

    .line 2888
    iget-object v4, v1, LO3/h0;->P:LE/c0;

    .line 2889
    .line 2890
    invoke-virtual {v4}, LE/c0;->B()Landroid/os/Bundle;

    .line 2891
    .line 2892
    .line 2893
    move-result-object v4

    .line 2894
    invoke-virtual {v0, v4}, LO3/w1;->t(Landroid/os/Bundle;)V

    .line 2895
    .line 2896
    .line 2897
    :cond_59
    :goto_33
    invoke-static {}, Lcom/google/android/gms/internal/measurement/Y3;->a()V

    .line 2898
    .line 2899
    .line 2900
    sget-object v0, LO3/F;->Q0:LO3/E;

    .line 2901
    .line 2902
    const/4 v9, 0x0

    .line 2903
    invoke-virtual {v15, v9, v0}, LO3/g;->y(Ljava/lang/String;LO3/E;)Z

    .line 2904
    .line 2905
    .line 2906
    move-result v0

    .line 2907
    if-eqz v0, :cond_5d

    .line 2908
    .line 2909
    invoke-virtual {v5}, LO3/D0;->o()V

    .line 2910
    .line 2911
    .line 2912
    invoke-virtual {v5}, LO3/Y1;->J()J

    .line 2913
    .line 2914
    .line 2915
    move-result-wide v4

    .line 2916
    cmp-long v0, v4, v27

    .line 2917
    .line 2918
    if-nez v0, :cond_5a

    .line 2919
    .line 2920
    const/4 v6, 0x1

    .line 2921
    :cond_5a
    if-eqz v6, :cond_5d

    .line 2922
    .line 2923
    sget-object v0, LO3/F;->x0:LO3/E;

    .line 2924
    .line 2925
    invoke-virtual {v0, v9}, LO3/E;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2926
    .line 2927
    .line 2928
    move-result-object v0

    .line 2929
    check-cast v0, Ljava/lang/Integer;

    .line 2930
    .line 2931
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 2932
    .line 2933
    .line 2934
    move-result v0

    .line 2935
    int-to-long v4, v0

    .line 2936
    new-instance v0, Ljava/util/Random;

    .line 2937
    .line 2938
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 2939
    .line 2940
    .line 2941
    const/16 v6, 0x1388

    .line 2942
    .line 2943
    invoke-virtual {v0, v6}, Ljava/util/Random;->nextInt(I)I

    .line 2944
    .line 2945
    .line 2946
    move-result v0

    .line 2947
    const-wide/16 v8, 0x3e8

    .line 2948
    .line 2949
    mul-long/2addr v4, v8

    .line 2950
    int-to-long v8, v0

    .line 2951
    iget-object v0, v12, LO3/t0;->A:LB3/a;

    .line 2952
    .line 2953
    add-long/2addr v4, v8

    .line 2954
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2955
    .line 2956
    .line 2957
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2958
    .line 2959
    .line 2960
    move-result-wide v8

    .line 2961
    sub-long/2addr v4, v8

    .line 2962
    const-wide/16 v8, 0x1f4

    .line 2963
    .line 2964
    invoke-static {v8, v9, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 2965
    .line 2966
    .line 2967
    move-result-wide v4

    .line 2968
    cmp-long v0, v4, v8

    .line 2969
    .line 2970
    if-lez v0, :cond_5b

    .line 2971
    .line 2972
    invoke-static {v3}, LO3/t0;->l(LO3/E0;)V

    .line 2973
    .line 2974
    .line 2975
    const-string v0, "Waiting to fetch trigger URIs until some time after boot. Delay in millis"

    .line 2976
    .line 2977
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2978
    .line 2979
    .line 2980
    move-result-object v3

    .line 2981
    invoke-virtual {v2, v3, v0}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2982
    .line 2983
    .line 2984
    :cond_5b
    invoke-static {v13}, LO3/t0;->k(LO3/H;)V

    .line 2985
    .line 2986
    .line 2987
    invoke-virtual {v13}, LO3/C;->o()V

    .line 2988
    .line 2989
    .line 2990
    iget-object v0, v13, LO3/b1;->C:LO3/P0;

    .line 2991
    .line 2992
    if-nez v0, :cond_5c

    .line 2993
    .line 2994
    new-instance v0, LO3/P0;

    .line 2995
    .line 2996
    const/4 v2, 0x0

    .line 2997
    invoke-direct {v0, v13, v7, v2}, LO3/P0;-><init>(LO3/b1;LO3/F0;I)V

    .line 2998
    .line 2999
    .line 3000
    iput-object v0, v13, LO3/b1;->C:LO3/P0;

    .line 3001
    .line 3002
    :cond_5c
    iget-object v0, v13, LO3/b1;->C:LO3/P0;

    .line 3003
    .line 3004
    invoke-virtual {v0, v4, v5}, LO3/o;->b(J)V

    .line 3005
    .line 3006
    .line 3007
    :cond_5d
    iget-object v0, v1, LO3/h0;->F:LO3/e0;

    .line 3008
    .line 3009
    const/4 v4, 0x1

    .line 3010
    invoke-virtual {v0, v4}, LO3/e0;->e(Z)V

    .line 3011
    .line 3012
    .line 3013
    return-void

    .line 3014
    :cond_5e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 3015
    .line 3016
    move-object/from16 v1, v18

    .line 3017
    .line 3018
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 3019
    .line 3020
    .line 3021
    throw v0

    .line 3022
    :cond_5f
    move-object/from16 v1, v18

    .line 3023
    .line 3024
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 3025
    .line 3026
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 3027
    .line 3028
    .line 3029
    throw v0

    .line 3030
    :cond_60
    move-object v1, v4

    .line 3031
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 3032
    .line 3033
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 3034
    .line 3035
    .line 3036
    throw v0

    .line 3037
    :cond_61
    move-object v1, v4

    .line 3038
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 3039
    .line 3040
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 3041
    .line 3042
    .line 3043
    throw v0

    .line 3044
    :pswitch_18
    iget-object v0, v1, LI4/a;->s:Ljava/lang/Object;

    .line 3045
    .line 3046
    check-cast v0, LO3/i0;

    .line 3047
    .line 3048
    iget-object v2, v0, LO3/i0;->r:LO3/j0;

    .line 3049
    .line 3050
    iget-object v2, v2, LO3/j0;->b:LO3/t0;

    .line 3051
    .line 3052
    iget-object v3, v2, LO3/t0;->w:LO3/p0;

    .line 3053
    .line 3054
    invoke-static {v3}, LO3/t0;->l(LO3/E0;)V

    .line 3055
    .line 3056
    .line 3057
    invoke-virtual {v3}, LO3/p0;->o()V

    .line 3058
    .line 3059
    .line 3060
    new-instance v3, Landroid/os/Bundle;

    .line 3061
    .line 3062
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 3063
    .line 3064
    .line 3065
    const-string v4, "package_name"

    .line 3066
    .line 3067
    iget-object v0, v0, LO3/i0;->q:Ljava/lang/String;

    .line 3068
    .line 3069
    invoke-virtual {v3, v4, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 3070
    .line 3071
    .line 3072
    iget-object v0, v1, LI4/a;->r:Ljava/lang/Object;

    .line 3073
    .line 3074
    check-cast v0, Lcom/google/android/gms/internal/measurement/B;

    .line 3075
    .line 3076
    :try_start_a
    check-cast v0, Lcom/google/android/gms/internal/measurement/z;

    .line 3077
    .line 3078
    invoke-virtual {v0}, LI3/a;->K()Landroid/os/Parcel;

    .line 3079
    .line 3080
    .line 3081
    move-result-object v4

    .line 3082
    invoke-static {v4, v3}, Lcom/google/android/gms/internal/measurement/y;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 3083
    .line 3084
    .line 3085
    const/4 v3, 0x1

    .line 3086
    invoke-virtual {v0, v4, v3}, LI3/a;->J(Landroid/os/Parcel;I)Landroid/os/Parcel;

    .line 3087
    .line 3088
    .line 3089
    move-result-object v0

    .line 3090
    sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 3091
    .line 3092
    invoke-static {v0, v3}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 3093
    .line 3094
    .line 3095
    move-result-object v3

    .line 3096
    check-cast v3, Landroid/os/Bundle;

    .line 3097
    .line 3098
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 3099
    .line 3100
    .line 3101
    if-nez v3, :cond_62

    .line 3102
    .line 3103
    iget-object v0, v2, LO3/t0;->v:LO3/X;

    .line 3104
    .line 3105
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 3106
    .line 3107
    .line 3108
    iget-object v0, v0, LO3/X;->w:LO3/V;

    .line 3109
    .line 3110
    const-string v3, "Install Referrer Service returned a null response"

    .line 3111
    .line 3112
    invoke-virtual {v0, v3}, LO3/V;->b(Ljava/lang/String;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_9

    .line 3113
    .line 3114
    .line 3115
    goto :goto_34

    .line 3116
    :catch_9
    move-exception v0

    .line 3117
    iget-object v3, v2, LO3/t0;->v:LO3/X;

    .line 3118
    .line 3119
    invoke-static {v3}, LO3/t0;->l(LO3/E0;)V

    .line 3120
    .line 3121
    .line 3122
    iget-object v3, v3, LO3/X;->w:LO3/V;

    .line 3123
    .line 3124
    const-string v4, "Exception occurred while retrieving the Install Referrer"

    .line 3125
    .line 3126
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 3127
    .line 3128
    .line 3129
    move-result-object v0

    .line 3130
    invoke-virtual {v3, v0, v4}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3131
    .line 3132
    .line 3133
    :cond_62
    :goto_34
    iget-object v0, v2, LO3/t0;->w:LO3/p0;

    .line 3134
    .line 3135
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 3136
    .line 3137
    .line 3138
    invoke-virtual {v0}, LO3/p0;->o()V

    .line 3139
    .line 3140
    .line 3141
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 3142
    .line 3143
    const-string v2, "Unexpected call on client side"

    .line 3144
    .line 3145
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 3146
    .line 3147
    .line 3148
    throw v0

    .line 3149
    :pswitch_19
    iget-object v0, v1, LI4/a;->r:Ljava/lang/Object;

    .line 3150
    .line 3151
    check-cast v0, LO3/F0;

    .line 3152
    .line 3153
    invoke-interface {v0}, LO3/F0;->g()Ls4/e;

    .line 3154
    .line 3155
    .line 3156
    invoke-static {}, Ls4/e;->i()Z

    .line 3157
    .line 3158
    .line 3159
    move-result v2

    .line 3160
    if-eqz v2, :cond_63

    .line 3161
    .line 3162
    invoke-interface {v0}, LO3/F0;->c()LO3/p0;

    .line 3163
    .line 3164
    .line 3165
    move-result-object v0

    .line 3166
    invoke-virtual {v0, v1}, LO3/p0;->x(Ljava/lang/Runnable;)V

    .line 3167
    .line 3168
    .line 3169
    goto :goto_36

    .line 3170
    :cond_63
    iget-object v0, v1, LI4/a;->s:Ljava/lang/Object;

    .line 3171
    .line 3172
    check-cast v0, LO3/o;

    .line 3173
    .line 3174
    iget-wide v2, v0, LO3/o;->c:J

    .line 3175
    .line 3176
    const-wide/16 v4, 0x0

    .line 3177
    .line 3178
    cmp-long v2, v2, v4

    .line 3179
    .line 3180
    if-eqz v2, :cond_64

    .line 3181
    .line 3182
    const/4 v2, 0x1

    .line 3183
    goto :goto_35

    .line 3184
    :cond_64
    const/4 v2, 0x0

    .line 3185
    :goto_35
    iput-wide v4, v0, LO3/o;->c:J

    .line 3186
    .line 3187
    if-eqz v2, :cond_65

    .line 3188
    .line 3189
    invoke-virtual {v0}, LO3/o;->a()V

    .line 3190
    .line 3191
    .line 3192
    :cond_65
    :goto_36
    return-void

    .line 3193
    :pswitch_1a
    iget-object v0, v1, LI4/a;->s:Ljava/lang/Object;

    .line 3194
    .line 3195
    check-cast v0, LM5/h;

    .line 3196
    .line 3197
    iget-object v2, v1, LI4/a;->r:Ljava/lang/Object;

    .line 3198
    .line 3199
    check-cast v2, LM5/U;

    .line 3200
    .line 3201
    invoke-virtual {v0, v2}, LM5/h;->C(LM5/s;)V

    .line 3202
    .line 3203
    .line 3204
    return-void

    .line 3205
    :pswitch_1b
    iget-object v0, v1, LI4/a;->r:Ljava/lang/Object;

    .line 3206
    .line 3207
    check-cast v0, Ljava/util/ArrayList;

    .line 3208
    .line 3209
    iget-object v2, v1, LI4/a;->s:Ljava/lang/Object;

    .line 3210
    .line 3211
    check-cast v2, LJ1/T;

    .line 3212
    .line 3213
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 3214
    .line 3215
    .line 3216
    move-result v3

    .line 3217
    if-eqz v3, :cond_66

    .line 3218
    .line 3219
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 3220
    .line 3221
    .line 3222
    iget-object v0, v2, LJ1/T;->c:LJ1/q;

    .line 3223
    .line 3224
    iget-object v0, v0, LJ1/q;->U:Landroid/view/View;

    .line 3225
    .line 3226
    iget v2, v2, LJ1/T;->a:I

    .line 3227
    .line 3228
    invoke-static {v0, v2}, LC0/S;->a(Landroid/view/View;I)V

    .line 3229
    .line 3230
    .line 3231
    :cond_66
    return-void

    .line 3232
    :pswitch_1c
    iget-object v0, v1, LI4/a;->s:Ljava/lang/Object;

    .line 3233
    .line 3234
    move-object v2, v0

    .line 3235
    check-cast v2, LB0/o;

    .line 3236
    .line 3237
    iget-object v0, v1, LI4/a;->r:Ljava/lang/Object;

    .line 3238
    .line 3239
    check-cast v0, LI4/b;

    .line 3240
    .line 3241
    :try_start_b
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/I1;->a0(LI4/b;)V
    :try_end_b
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_b .. :try_end_b} :catch_a
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 3242
    .line 3243
    .line 3244
    iget-object v0, v2, LB0/o;->r:Ljava/lang/Object;

    .line 3245
    .line 3246
    check-cast v0, LO3/b1;

    .line 3247
    .line 3248
    invoke-virtual {v0}, LO3/C;->o()V

    .line 3249
    .line 3250
    .line 3251
    invoke-virtual {v2}, LB0/o;->J()V

    .line 3252
    .line 3253
    .line 3254
    const/4 v3, 0x0

    .line 3255
    iput-boolean v3, v0, LO3/b1;->z:Z

    .line 3256
    .line 3257
    const/4 v3, 0x1

    .line 3258
    iput v3, v0, LO3/b1;->A:I

    .line 3259
    .line 3260
    iget-object v3, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 3261
    .line 3262
    check-cast v3, LO3/t0;

    .line 3263
    .line 3264
    iget-object v3, v3, LO3/t0;->v:LO3/X;

    .line 3265
    .line 3266
    invoke-static {v3}, LO3/t0;->l(LO3/E0;)V

    .line 3267
    .line 3268
    .line 3269
    iget-object v3, v3, LO3/X;->D:LO3/V;

    .line 3270
    .line 3271
    iget-object v2, v2, LB0/o;->q:Ljava/lang/Object;

    .line 3272
    .line 3273
    check-cast v2, LO3/I1;

    .line 3274
    .line 3275
    const-string v4, "Successfully registered trigger URI"

    .line 3276
    .line 3277
    iget-object v2, v2, LO3/I1;->q:Ljava/lang/String;

    .line 3278
    .line 3279
    invoke-virtual {v3, v2, v4}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3280
    .line 3281
    .line 3282
    invoke-virtual {v0}, LO3/b1;->M()V

    .line 3283
    .line 3284
    .line 3285
    goto :goto_37

    .line 3286
    :catchall_1
    move-exception v0

    .line 3287
    invoke-virtual {v2, v0}, LB0/o;->F(Ljava/lang/Throwable;)V

    .line 3288
    .line 3289
    .line 3290
    goto :goto_37

    .line 3291
    :catch_a
    move-exception v0

    .line 3292
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 3293
    .line 3294
    .line 3295
    move-result-object v0

    .line 3296
    invoke-virtual {v2, v0}, LB0/o;->F(Ljava/lang/Throwable;)V

    .line 3297
    .line 3298
    .line 3299
    :goto_37
    return-void

    .line 3300
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, LI4/a;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, LB0/G0;

    .line 12
    .line 13
    const-class v1, LI4/a;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {v0, v1}, LB0/G0;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, LI4/a;->s:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, LB0/o;

    .line 25
    .line 26
    new-instance v2, LB0/o;

    .line 27
    .line 28
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iget-object v3, v0, LB0/G0;->t:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, LB0/o;

    .line 34
    .line 35
    iput-object v2, v3, LB0/o;->r:Ljava/lang/Object;

    .line 36
    .line 37
    iput-object v2, v0, LB0/G0;->t:Ljava/lang/Object;

    .line 38
    .line 39
    iput-object v1, v2, LB0/o;->q:Ljava/lang/Object;

    .line 40
    .line 41
    invoke-virtual {v0}, LB0/G0;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
