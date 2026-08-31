.class public abstract Lx3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final N:[Lcom/google/android/gms/common/d;


# instance fields
.field public A:Landroid/os/IInterface;

.field public final B:Ljava/util/ArrayList;

.field public C:Lx3/E;

.field public D:I

.field public final E:Lx3/b;

.field public final F:Lx3/c;

.field public final G:I

.field public final H:Ljava/lang/String;

.field public volatile I:Ljava/lang/String;

.field public J:Lcom/google/android/gms/common/b;

.field public K:Z

.field public volatile L:Lx3/H;

.field public final M:Ljava/util/concurrent/atomic/AtomicInteger;

.field public volatile q:Ljava/lang/String;

.field public r:Lc4/c;

.field public final s:Landroid/content/Context;

.field public final t:Lx3/K;

.field public final u:Lcom/google/android/gms/common/f;

.field public final v:Lx3/C;

.field public final w:Ljava/lang/Object;

.field public final x:Ljava/lang/Object;

.field public y:Lx3/w;

.field public z:Lx3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Lcom/google/android/gms/common/d;

    .line 3
    .line 4
    sput-object v0, Lx3/e;->N:[Lcom/google/android/gms/common/d;

    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lx3/K;Lcom/google/android/gms/common/f;ILx3/b;Lx3/c;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lx3/e;->q:Ljava/lang/String;

    .line 6
    .line 7
    new-instance v1, Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Lx3/e;->w:Ljava/lang/Object;

    .line 13
    .line 14
    new-instance v1, Ljava/lang/Object;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lx3/e;->x:Ljava/lang/Object;

    .line 20
    .line 21
    new-instance v1, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lx3/e;->B:Ljava/util/ArrayList;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    iput v1, p0, Lx3/e;->D:I

    .line 30
    .line 31
    iput-object v0, p0, Lx3/e;->J:Lcom/google/android/gms/common/b;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    iput-boolean v1, p0, Lx3/e;->K:Z

    .line 35
    .line 36
    iput-object v0, p0, Lx3/e;->L:Lx3/H;

    .line 37
    .line 38
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 39
    .line 40
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lx3/e;->M:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 44
    .line 45
    const-string v0, "Context must not be null"

    .line 46
    .line 47
    invoke-static {p1, v0}, Lx3/A;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Lx3/e;->s:Landroid/content/Context;

    .line 51
    .line 52
    const-string p1, "Looper must not be null"

    .line 53
    .line 54
    invoke-static {p2, p1}, Lx3/A;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string p1, "Supervisor must not be null"

    .line 58
    .line 59
    invoke-static {p3, p1}, Lx3/A;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    iput-object p3, p0, Lx3/e;->t:Lx3/K;

    .line 63
    .line 64
    const-string p1, "API availability must not be null"

    .line 65
    .line 66
    invoke-static {p4, p1}, Lx3/A;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iput-object p4, p0, Lx3/e;->u:Lcom/google/android/gms/common/f;

    .line 70
    .line 71
    new-instance p1, Lx3/C;

    .line 72
    .line 73
    invoke-direct {p1, p0, p2}, Lx3/C;-><init>(Lx3/e;Landroid/os/Looper;)V

    .line 74
    .line 75
    .line 76
    iput-object p1, p0, Lx3/e;->v:Lx3/C;

    .line 77
    .line 78
    iput p5, p0, Lx3/e;->G:I

    .line 79
    .line 80
    iput-object p6, p0, Lx3/e;->E:Lx3/b;

    .line 81
    .line 82
    iput-object p7, p0, Lx3/e;->F:Lx3/c;

    .line 83
    .line 84
    iput-object p8, p0, Lx3/e;->H:Ljava/lang/String;

    .line 85
    .line 86
    return-void
.end method

.method public static bridge synthetic x(Lx3/e;IILandroid/os/IInterface;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lx3/e;->w:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lx3/e;->D:I

    .line 5
    .line 6
    if-eq v1, p1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p0, p2, p3}, Lx3/e;->y(ILandroid/os/IInterface;)V

    .line 14
    .line 15
    .line 16
    monitor-exit v0

    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    throw p0
.end method


# virtual methods
.method public final a()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lx3/e;->w:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lx3/e;->D:I

    .line 5
    .line 6
    const/4 v2, 0x4

    .line 7
    if-ne v1, v2, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :goto_0
    monitor-exit v0

    .line 13
    return v1

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw v1
.end method

.method public final c(Lx3/d;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lx3/e;->z:Lx3/d;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, p1, v0}, Lx3/e;->y(ILandroid/os/IInterface;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx3/e;->q:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Lx3/e;->j()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public abstract e()I
.end method

.method public final f()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lx3/e;->w:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lx3/e;->D:I

    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    const/4 v3, 0x1

    .line 8
    if-eq v1, v2, :cond_1

    .line 9
    .line 10
    const/4 v2, 0x3

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v3, 0x0

    .line 15
    :cond_1
    :goto_0
    monitor-exit v0

    .line 16
    return v3

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw v1
.end method

.method public final g()[Lcom/google/android/gms/common/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lx3/e;->L:Lx3/H;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    iget-object v0, v0, Lx3/H;->r:[Lcom/google/android/gms/common/d;

    .line 8
    .line 9
    return-object v0
.end method

.method public final h()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lx3/e;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lx3/e;->r:Lc4/c;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 13
    .line 14
    const-string v1, "Failed to connect when checking package"

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lx3/e;->q:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()V
    .locals 5

    .line 1
    iget-object v0, p0, Lx3/e;->M:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lx3/e;->B:Ljava/util/ArrayList;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, Lx3/e;->B:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    const/4 v3, 0x0

    .line 17
    if-ge v2, v1, :cond_0

    .line 18
    .line 19
    iget-object v4, p0, Lx3/e;->B:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, Lx3/u;

    .line 26
    .line 27
    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 28
    :try_start_1
    iput-object v3, v4, Lx3/u;->a:Ljava/lang/Boolean;

    .line 29
    .line 30
    monitor-exit v4

    .line 31
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception v1

    .line 35
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    :try_start_2
    throw v1

    .line 37
    :catchall_1
    move-exception v1

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    iget-object v1, p0, Lx3/e;->B:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 42
    .line 43
    .line 44
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 45
    iget-object v1, p0, Lx3/e;->x:Ljava/lang/Object;

    .line 46
    .line 47
    monitor-enter v1

    .line 48
    :try_start_3
    iput-object v3, p0, Lx3/e;->y:Lx3/w;

    .line 49
    .line 50
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 51
    const/4 v0, 0x1

    .line 52
    invoke-virtual {p0, v0, v3}, Lx3/e;->y(ILandroid/os/IInterface;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :catchall_2
    move-exception v0

    .line 57
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 58
    throw v0

    .line 59
    :goto_1
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 60
    throw v1
.end method

.method public k()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final l(Li3/a;)V
    .locals 3

    .line 1
    iget-object v0, p1, Li3/a;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lv3/o;

    .line 4
    .line 5
    iget-object v0, v0, Lv3/o;->n:Lv3/e;

    .line 6
    .line 7
    iget-object v0, v0, Lv3/e;->m:LI3/e;

    .line 8
    .line 9
    new-instance v1, LA1/b;

    .line 10
    .line 11
    const/16 v2, 0x17

    .line 12
    .line 13
    invoke-direct {v1, v2, p1}, LA1/b;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final m(Lx3/i;Ljava/util/Set;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    invoke-virtual {v1}, Lx3/e;->r()Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    new-instance v3, Lx3/g;

    .line 10
    .line 11
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 12
    .line 13
    const/16 v5, 0x1f

    .line 14
    .line 15
    if-ge v4, v5, :cond_0

    .line 16
    .line 17
    iget-object v4, v1, Lx3/e;->I:Ljava/lang/String;

    .line 18
    .line 19
    :goto_0
    move-object/from16 v17, v4

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    iget-object v4, v1, Lx3/e;->I:Ljava/lang/String;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :goto_1
    iget v5, v1, Lx3/e;->G:I

    .line 26
    .line 27
    sget v6, Lcom/google/android/gms/common/f;->a:I

    .line 28
    .line 29
    sget-object v9, Lx3/g;->E:[Lcom/google/android/gms/common/api/Scope;

    .line 30
    .line 31
    new-instance v10, Landroid/os/Bundle;

    .line 32
    .line 33
    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 34
    .line 35
    .line 36
    sget-object v12, Lx3/g;->F:[Lcom/google/android/gms/common/d;

    .line 37
    .line 38
    const/4 v15, 0x0

    .line 39
    const/16 v16, 0x0

    .line 40
    .line 41
    const/4 v4, 0x6

    .line 42
    const/4 v7, 0x0

    .line 43
    const/4 v8, 0x0

    .line 44
    const/4 v11, 0x0

    .line 45
    const/4 v14, 0x1

    .line 46
    move-object v13, v12

    .line 47
    invoke-direct/range {v3 .. v17}, Lx3/g;-><init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Lcom/google/android/gms/common/d;[Lcom/google/android/gms/common/d;ZIZLjava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iget-object v4, v1, Lx3/e;->s:Landroid/content/Context;

    .line 51
    .line 52
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    iput-object v4, v3, Lx3/g;->t:Ljava/lang/String;

    .line 57
    .line 58
    iput-object v2, v3, Lx3/g;->w:Landroid/os/Bundle;

    .line 59
    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    const/4 v2, 0x0

    .line 63
    new-array v2, v2, [Lcom/google/android/gms/common/api/Scope;

    .line 64
    .line 65
    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, [Lcom/google/android/gms/common/api/Scope;

    .line 70
    .line 71
    iput-object v0, v3, Lx3/g;->v:[Lcom/google/android/gms/common/api/Scope;

    .line 72
    .line 73
    :cond_1
    invoke-virtual {v1}, Lx3/e;->k()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_3

    .line 78
    .line 79
    invoke-virtual {v1}, Lx3/e;->p()Landroid/accounts/Account;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-nez v0, :cond_2

    .line 84
    .line 85
    new-instance v0, Landroid/accounts/Account;

    .line 86
    .line 87
    const-string v2, "<<default account>>"

    .line 88
    .line 89
    const-string v4, "com.google"

    .line 90
    .line 91
    invoke-direct {v0, v2, v4}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :cond_2
    iput-object v0, v3, Lx3/g;->x:Landroid/accounts/Account;

    .line 95
    .line 96
    if-eqz p1, :cond_3

    .line 97
    .line 98
    invoke-interface/range {p1 .. p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    iput-object v0, v3, Lx3/g;->u:Landroid/os/IBinder;

    .line 103
    .line 104
    :cond_3
    sget-object v0, Lx3/e;->N:[Lcom/google/android/gms/common/d;

    .line 105
    .line 106
    iput-object v0, v3, Lx3/g;->y:[Lcom/google/android/gms/common/d;

    .line 107
    .line 108
    invoke-virtual {v1}, Lx3/e;->q()[Lcom/google/android/gms/common/d;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    iput-object v0, v3, Lx3/g;->z:[Lcom/google/android/gms/common/d;

    .line 113
    .line 114
    :try_start_0
    iget-object v2, v1, Lx3/e;->x:Ljava/lang/Object;

    .line 115
    .line 116
    monitor-enter v2
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    :try_start_1
    iget-object v0, v1, Lx3/e;->y:Lx3/w;

    .line 118
    .line 119
    if-eqz v0, :cond_4

    .line 120
    .line 121
    new-instance v4, Lx3/D;

    .line 122
    .line 123
    iget-object v5, v1, Lx3/e;->M:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 124
    .line 125
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    invoke-direct {v4, v1, v5}, Lx3/D;-><init>(Lx3/e;I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v4, v3}, Lx3/w;->I(Lx3/D;Lx3/g;)V

    .line 133
    .line 134
    .line 135
    goto :goto_2

    .line 136
    :catchall_0
    move-exception v0

    .line 137
    goto :goto_3

    .line 138
    :cond_4
    const-string v0, "GmsClient"

    .line 139
    .line 140
    const-string v3, "mServiceBroker is null, client disconnected"

    .line 141
    .line 142
    invoke-static {v0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 143
    .line 144
    .line 145
    :goto_2
    monitor-exit v2

    .line 146
    return-void

    .line 147
    :goto_3
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 148
    :try_start_2
    throw v0
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    .line 149
    :catch_0
    move-exception v0

    .line 150
    goto :goto_4

    .line 151
    :catch_1
    move-exception v0

    .line 152
    goto :goto_4

    .line 153
    :catch_2
    move-exception v0

    .line 154
    goto :goto_5

    .line 155
    :catch_3
    move-exception v0

    .line 156
    goto :goto_6

    .line 157
    :goto_4
    const-string v2, "GmsClient"

    .line 158
    .line 159
    const-string v3, "IGmsServiceBroker.getService failed"

    .line 160
    .line 161
    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 162
    .line 163
    .line 164
    iget-object v0, v1, Lx3/e;->M:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    new-instance v2, Lx3/F;

    .line 171
    .line 172
    const/16 v3, 0x8

    .line 173
    .line 174
    const/4 v4, 0x0

    .line 175
    invoke-direct {v2, v1, v3, v4, v4}, Lx3/F;-><init>(Lx3/e;ILandroid/os/IBinder;Landroid/os/Bundle;)V

    .line 176
    .line 177
    .line 178
    iget-object v3, v1, Lx3/e;->v:Lx3/C;

    .line 179
    .line 180
    const/4 v4, 0x1

    .line 181
    const/4 v5, -0x1

    .line 182
    invoke-virtual {v3, v4, v0, v5, v2}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {v3, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 187
    .line 188
    .line 189
    return-void

    .line 190
    :goto_5
    throw v0

    .line 191
    :goto_6
    const-string v2, "GmsClient"

    .line 192
    .line 193
    const-string v3, "IGmsServiceBroker.getService failed"

    .line 194
    .line 195
    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 196
    .line 197
    .line 198
    iget-object v0, v1, Lx3/e;->M:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 199
    .line 200
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    iget-object v2, v1, Lx3/e;->v:Lx3/C;

    .line 205
    .line 206
    const/4 v3, 0x6

    .line 207
    const/4 v4, 0x3

    .line 208
    invoke-virtual {v2, v3, v0, v4}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 213
    .line 214
    .line 215
    return-void
.end method

.method public final n()V
    .locals 5

    .line 1
    iget-object v0, p0, Lx3/e;->s:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p0}, Lx3/e;->e()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object v2, p0, Lx3/e;->u:Lcom/google/android/gms/common/f;

    .line 8
    .line 9
    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/common/f;->c(Landroid/content/Context;I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {p0, v1, v2}, Lx3/e;->y(ILandroid/os/IInterface;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Li3/a;

    .line 21
    .line 22
    const/16 v3, 0x12

    .line 23
    .line 24
    invoke-direct {v1, v3, p0}, Li3/a;-><init>(ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Lx3/e;->z:Lx3/d;

    .line 28
    .line 29
    iget-object v1, p0, Lx3/e;->M:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    const/4 v3, 0x3

    .line 36
    iget-object v4, p0, Lx3/e;->v:Lx3/C;

    .line 37
    .line 38
    invoke-virtual {v4, v3, v1, v0, v2}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v4, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    new-instance v0, Li3/a;

    .line 47
    .line 48
    const/16 v1, 0x12

    .line 49
    .line 50
    invoke-direct {v0, v1, p0}, Li3/a;-><init>(ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v0}, Lx3/e;->c(Lx3/d;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public abstract o(Landroid/os/IBinder;)Landroid/os/IInterface;
.end method

.method public p()Landroid/accounts/Account;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public q()[Lcom/google/android/gms/common/d;
    .locals 1

    .line 1
    sget-object v0, Lx3/e;->N:[Lcom/google/android/gms/common/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public r()Landroid/os/Bundle;
    .locals 1

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public s()Ljava/util/Set;
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()Landroid/os/IInterface;
    .locals 3

    .line 1
    iget-object v0, p0, Lx3/e;->w:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lx3/e;->D:I

    .line 5
    .line 6
    const/4 v2, 0x5

    .line 7
    if-eq v1, v2, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Lx3/e;->a()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lx3/e;->A:Landroid/os/IInterface;

    .line 16
    .line 17
    const-string v2, "Client is connected but service is null"

    .line 18
    .line 19
    invoke-static {v1, v2}, Lx3/A;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    check-cast v1, Landroid/os/IInterface;

    .line 23
    .line 24
    monitor-exit v0

    .line 25
    return-object v1

    .line 26
    :catchall_0
    move-exception v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v2, "Not connected. Call connect() and wait for onConnected() to be called."

    .line 31
    .line 32
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v1

    .line 36
    :cond_1
    new-instance v1, Landroid/os/DeadObjectException;

    .line 37
    .line 38
    invoke-direct {v1}, Landroid/os/DeadObjectException;-><init>()V

    .line 39
    .line 40
    .line 41
    throw v1

    .line 42
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    throw v1
.end method

.method public abstract u()Ljava/lang/String;
.end method

.method public abstract v()Ljava/lang/String;
.end method

.method public w()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lx3/e;->e()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0xc9e4920

    .line 6
    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    return v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0
.end method

.method public final y(ILandroid/os/IInterface;)V
    .locals 10

    .line 1
    const-string v0, " on com.google.android.gms"

    .line 2
    .line 3
    const-string v1, " on com.google.android.gms"

    .line 4
    .line 5
    const-string v2, "unable to connect to service: "

    .line 6
    .line 7
    const-string v3, "Calling connect() while still connected, missing disconnect() for "

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x4

    .line 12
    if-eq p1, v6, :cond_0

    .line 13
    .line 14
    move v7, v4

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v7, v5

    .line 17
    :goto_0
    if-nez p2, :cond_1

    .line 18
    .line 19
    move v8, v4

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move v8, v5

    .line 22
    :goto_1
    if-ne v7, v8, :cond_2

    .line 23
    .line 24
    move v7, v5

    .line 25
    goto :goto_2

    .line 26
    :cond_2
    move v7, v4

    .line 27
    :goto_2
    invoke-static {v7}, Lx3/A;->a(Z)V

    .line 28
    .line 29
    .line 30
    iget-object v7, p0, Lx3/e;->w:Ljava/lang/Object;

    .line 31
    .line 32
    monitor-enter v7

    .line 33
    :try_start_0
    iput p1, p0, Lx3/e;->D:I

    .line 34
    .line 35
    iput-object p2, p0, Lx3/e;->A:Landroid/os/IInterface;

    .line 36
    .line 37
    const/4 v8, 0x0

    .line 38
    if-eq p1, v5, :cond_d

    .line 39
    .line 40
    const/4 v9, 0x2

    .line 41
    if-eq p1, v9, :cond_4

    .line 42
    .line 43
    const/4 v9, 0x3

    .line 44
    if-eq p1, v9, :cond_4

    .line 45
    .line 46
    if-eq p1, v6, :cond_3

    .line 47
    .line 48
    goto/16 :goto_4

    .line 49
    .line 50
    :cond_3
    invoke-static {p2}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    check-cast p2, Landroid/os/IInterface;

    .line 54
    .line 55
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 56
    .line 57
    .line 58
    goto/16 :goto_4

    .line 59
    .line 60
    :catchall_0
    move-exception p1

    .line 61
    goto/16 :goto_5

    .line 62
    .line 63
    :cond_4
    iget-object p1, p0, Lx3/e;->C:Lx3/E;

    .line 64
    .line 65
    if-eqz p1, :cond_6

    .line 66
    .line 67
    iget-object p2, p0, Lx3/e;->r:Lc4/c;

    .line 68
    .line 69
    if-eqz p2, :cond_6

    .line 70
    .line 71
    const-string v6, "GmsClient"

    .line 72
    .line 73
    iget-object p2, p2, Lc4/c;->r:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p2, Ljava/lang/String;

    .line 76
    .line 77
    new-instance v9, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v9, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v9, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-static {v6, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 93
    .line 94
    .line 95
    iget-object p2, p0, Lx3/e;->t:Lx3/K;

    .line 96
    .line 97
    iget-object v1, p0, Lx3/e;->r:Lc4/c;

    .line 98
    .line 99
    iget-object v1, v1, Lc4/c;->r:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v1, Ljava/lang/String;

    .line 102
    .line 103
    invoke-static {v1}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    iget-object v3, p0, Lx3/e;->r:Lc4/c;

    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-object v3, p0, Lx3/e;->H:Ljava/lang/String;

    .line 112
    .line 113
    if-nez v3, :cond_5

    .line 114
    .line 115
    iget-object v3, p0, Lx3/e;->s:Landroid/content/Context;

    .line 116
    .line 117
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    :cond_5
    iget-object v3, p0, Lx3/e;->r:Lc4/c;

    .line 121
    .line 122
    iget-boolean v3, v3, Lc4/c;->q:Z

    .line 123
    .line 124
    invoke-virtual {p2, v1, p1, v3}, Lx3/K;->c(Ljava/lang/String;Landroid/content/ServiceConnection;Z)V

    .line 125
    .line 126
    .line 127
    iget-object p1, p0, Lx3/e;->M:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 130
    .line 131
    .line 132
    :cond_6
    new-instance p1, Lx3/E;

    .line 133
    .line 134
    iget-object p2, p0, Lx3/e;->M:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 135
    .line 136
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 137
    .line 138
    .line 139
    move-result p2

    .line 140
    invoke-direct {p1, p0, p2}, Lx3/E;-><init>(Lx3/e;I)V

    .line 141
    .line 142
    .line 143
    iput-object p1, p0, Lx3/e;->C:Lx3/E;

    .line 144
    .line 145
    new-instance p2, Lc4/c;

    .line 146
    .line 147
    invoke-virtual {p0}, Lx3/e;->v()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-virtual {p0}, Lx3/e;->w()Z

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    invoke-direct {p2, v1, v3}, Lc4/c;-><init>(Ljava/lang/Object;Z)V

    .line 156
    .line 157
    .line 158
    iput-object p2, p0, Lx3/e;->r:Lc4/c;

    .line 159
    .line 160
    if-eqz v3, :cond_8

    .line 161
    .line 162
    invoke-virtual {p0}, Lx3/e;->e()I

    .line 163
    .line 164
    .line 165
    move-result p2

    .line 166
    const v1, 0x1110e58

    .line 167
    .line 168
    .line 169
    if-lt p2, v1, :cond_7

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 173
    .line 174
    iget-object p2, p0, Lx3/e;->r:Lc4/c;

    .line 175
    .line 176
    iget-object p2, p2, Lc4/c;->r:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast p2, Ljava/lang/String;

    .line 179
    .line 180
    const-string v0, "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "

    .line 181
    .line 182
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p2

    .line 190
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    throw p1

    .line 194
    :cond_8
    :goto_3
    iget-object p2, p0, Lx3/e;->t:Lx3/K;

    .line 195
    .line 196
    iget-object v1, p0, Lx3/e;->r:Lc4/c;

    .line 197
    .line 198
    iget-object v1, v1, Lc4/c;->r:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v1, Ljava/lang/String;

    .line 201
    .line 202
    invoke-static {v1}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    iget-object v3, p0, Lx3/e;->r:Lc4/c;

    .line 206
    .line 207
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    iget-object v3, p0, Lx3/e;->H:Ljava/lang/String;

    .line 211
    .line 212
    if-nez v3, :cond_9

    .line 213
    .line 214
    iget-object v3, p0, Lx3/e;->s:Landroid/content/Context;

    .line 215
    .line 216
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    :cond_9
    iget-object v6, p0, Lx3/e;->r:Lc4/c;

    .line 225
    .line 226
    iget-boolean v6, v6, Lc4/c;->q:Z

    .line 227
    .line 228
    new-instance v9, Lx3/I;

    .line 229
    .line 230
    invoke-direct {v9, v1, v6}, Lx3/I;-><init>(Ljava/lang/String;Z)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p2, v9, p1, v3, v8}, Lx3/K;->b(Lx3/I;Lx3/E;Ljava/lang/String;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/common/b;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    iget p2, p1, Lcom/google/android/gms/common/b;->r:I

    .line 238
    .line 239
    if-nez p2, :cond_a

    .line 240
    .line 241
    move v4, v5

    .line 242
    :cond_a
    if-nez v4, :cond_f

    .line 243
    .line 244
    const-string p2, "GmsClient"

    .line 245
    .line 246
    iget-object v1, p0, Lx3/e;->r:Lc4/c;

    .line 247
    .line 248
    iget-object v1, v1, Lc4/c;->r:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v1, Ljava/lang/String;

    .line 251
    .line 252
    new-instance v3, Ljava/lang/StringBuilder;

    .line 253
    .line 254
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-static {p2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 268
    .line 269
    .line 270
    iget p2, p1, Lcom/google/android/gms/common/b;->r:I

    .line 271
    .line 272
    const/4 v0, -0x1

    .line 273
    if-ne p2, v0, :cond_b

    .line 274
    .line 275
    const/16 p2, 0x10

    .line 276
    .line 277
    :cond_b
    iget-object v1, p1, Lcom/google/android/gms/common/b;->s:Landroid/app/PendingIntent;

    .line 278
    .line 279
    if-eqz v1, :cond_c

    .line 280
    .line 281
    new-instance v8, Landroid/os/Bundle;

    .line 282
    .line 283
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 284
    .line 285
    .line 286
    const-string v1, "pendingIntent"

    .line 287
    .line 288
    iget-object p1, p1, Lcom/google/android/gms/common/b;->s:Landroid/app/PendingIntent;

    .line 289
    .line 290
    invoke-virtual {v8, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 291
    .line 292
    .line 293
    :cond_c
    iget-object p1, p0, Lx3/e;->M:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 294
    .line 295
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 296
    .line 297
    .line 298
    move-result p1

    .line 299
    new-instance v1, Lx3/G;

    .line 300
    .line 301
    invoke-direct {v1, p0, p2, v8}, Lx3/G;-><init>(Lx3/e;ILandroid/os/Bundle;)V

    .line 302
    .line 303
    .line 304
    iget-object p2, p0, Lx3/e;->v:Lx3/C;

    .line 305
    .line 306
    const/4 v2, 0x7

    .line 307
    invoke-virtual {p2, v2, p1, v0, v1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 312
    .line 313
    .line 314
    goto :goto_4

    .line 315
    :cond_d
    iget-object p1, p0, Lx3/e;->C:Lx3/E;

    .line 316
    .line 317
    if-eqz p1, :cond_f

    .line 318
    .line 319
    iget-object p2, p0, Lx3/e;->t:Lx3/K;

    .line 320
    .line 321
    iget-object v0, p0, Lx3/e;->r:Lc4/c;

    .line 322
    .line 323
    iget-object v0, v0, Lc4/c;->r:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast v0, Ljava/lang/String;

    .line 326
    .line 327
    invoke-static {v0}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    iget-object v1, p0, Lx3/e;->r:Lc4/c;

    .line 331
    .line 332
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    iget-object v1, p0, Lx3/e;->H:Ljava/lang/String;

    .line 336
    .line 337
    if-nez v1, :cond_e

    .line 338
    .line 339
    iget-object v1, p0, Lx3/e;->s:Landroid/content/Context;

    .line 340
    .line 341
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    :cond_e
    iget-object v1, p0, Lx3/e;->r:Lc4/c;

    .line 345
    .line 346
    iget-boolean v1, v1, Lc4/c;->q:Z

    .line 347
    .line 348
    invoke-virtual {p2, v0, p1, v1}, Lx3/K;->c(Ljava/lang/String;Landroid/content/ServiceConnection;Z)V

    .line 349
    .line 350
    .line 351
    iput-object v8, p0, Lx3/e;->C:Lx3/E;

    .line 352
    .line 353
    :cond_f
    :goto_4
    monitor-exit v7

    .line 354
    return-void

    .line 355
    :goto_5
    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 356
    throw p1
.end method
