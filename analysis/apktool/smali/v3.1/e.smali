.class public final Lv3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# static fields
.field public static final o:Lcom/google/android/gms/common/api/Status;

.field public static final p:Lcom/google/android/gms/common/api/Status;

.field public static final q:Ljava/lang/Object;

.field public static r:Lv3/e;


# instance fields
.field public a:J

.field public b:Z

.field public c:Lx3/m;

.field public d:Lz3/b;

.field public final e:Landroid/content/Context;

.field public final f:Lcom/google/android/gms/common/e;

.field public final g:Lv3/l;

.field public final h:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final i:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final j:Ljava/util/concurrent/ConcurrentHashMap;

.field public final k:Lr/f;

.field public final l:Lr/f;

.field public final m:LI3/e;

.field public volatile n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const-string v2, "Sign-out occurred while this API call was in progress."

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-direct {v0, v1, v2, v3, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/b;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lv3/e;->o:Lcom/google/android/gms/common/api/Status;

    .line 11
    .line 12
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 13
    .line 14
    const-string v2, "The user must be signed in to make this API call."

    .line 15
    .line 16
    invoke-direct {v0, v1, v2, v3, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/b;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lv3/e;->p:Lcom/google/android/gms/common/api/Status;

    .line 20
    .line 21
    new-instance v0, Ljava/lang/Object;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lv3/e;->q:Ljava/lang/Object;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;)V
    .locals 6

    .line 1
    sget-object v0, Lcom/google/android/gms/common/e;->d:Lcom/google/android/gms/common/e;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v1, 0x2710

    .line 7
    .line 8
    iput-wide v1, p0, Lv3/e;->a:J

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-boolean v1, p0, Lv3/e;->b:Z

    .line 12
    .line 13
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v2, p0, Lv3/e;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 20
    .line 21
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 22
    .line 23
    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object v2, p0, Lv3/e;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 27
    .line 28
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    const/4 v4, 0x5

    .line 31
    const/high16 v5, 0x3f400000    # 0.75f

    .line 32
    .line 33
    invoke-direct {v2, v4, v5, v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    .line 34
    .line 35
    .line 36
    iput-object v2, p0, Lv3/e;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 37
    .line 38
    new-instance v2, Lr/f;

    .line 39
    .line 40
    invoke-direct {v2, v1}, Lr/f;-><init>(I)V

    .line 41
    .line 42
    .line 43
    iput-object v2, p0, Lv3/e;->k:Lr/f;

    .line 44
    .line 45
    new-instance v2, Lr/f;

    .line 46
    .line 47
    invoke-direct {v2, v1}, Lr/f;-><init>(I)V

    .line 48
    .line 49
    .line 50
    iput-object v2, p0, Lv3/e;->l:Lr/f;

    .line 51
    .line 52
    iput-boolean v3, p0, Lv3/e;->n:Z

    .line 53
    .line 54
    iput-object p1, p0, Lv3/e;->e:Landroid/content/Context;

    .line 55
    .line 56
    new-instance v2, LI3/e;

    .line 57
    .line 58
    invoke-direct {v2, p2, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 59
    .line 60
    .line 61
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 62
    .line 63
    .line 64
    iput-object v2, p0, Lv3/e;->m:LI3/e;

    .line 65
    .line 66
    iput-object v0, p0, Lv3/e;->f:Lcom/google/android/gms/common/e;

    .line 67
    .line 68
    new-instance p2, Lv3/l;

    .line 69
    .line 70
    const/4 v0, 0x6

    .line 71
    invoke-direct {p2, v0}, Lv3/l;-><init>(I)V

    .line 72
    .line 73
    .line 74
    iput-object p2, p0, Lv3/e;->g:Lv3/l;

    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    sget-object p2, LB3/b;->f:Ljava/lang/Boolean;

    .line 81
    .line 82
    if-nez p2, :cond_1

    .line 83
    .line 84
    invoke-static {}, LB3/b;->b()Z

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    if-eqz p2, :cond_0

    .line 89
    .line 90
    const-string p2, "android.hardware.type.automotive"

    .line 91
    .line 92
    invoke-virtual {p1, p2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-eqz p1, :cond_0

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_0
    move v3, v1

    .line 100
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    sput-object p1, LB3/b;->f:Ljava/lang/Boolean;

    .line 105
    .line 106
    :cond_1
    sget-object p1, LB3/b;->f:Ljava/lang/Boolean;

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-eqz p1, :cond_2

    .line 113
    .line 114
    iput-boolean v1, p0, Lv3/e;->n:Z

    .line 115
    .line 116
    :cond_2
    const/4 p1, 0x6

    .line 117
    invoke-virtual {v2, p1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {v2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 122
    .line 123
    .line 124
    return-void
.end method

.method public static c(Lv3/a;Lcom/google/android/gms/common/b;)Lcom/google/android/gms/common/api/Status;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    iget-object p0, p0, Lv3/a;->b:LZ/m;

    .line 4
    .line 5
    iget-object p0, p0, LZ/m;->s:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v3, "API: "

    .line 16
    .line 17
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p0, " is not available on this device. Connection failed with: "

    .line 24
    .line 25
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const/16 v1, 0x11

    .line 36
    .line 37
    iget-object v2, p1, Lcom/google/android/gms/common/b;->s:Landroid/app/PendingIntent;

    .line 38
    .line 39
    invoke-direct {v0, v1, p0, v2, p1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/b;)V

    .line 40
    .line 41
    .line 42
    return-object v0
.end method

.method public static e(Landroid/content/Context;)Lv3/e;
    .locals 5

    .line 1
    sget-object v0, Lv3/e;->q:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lv3/e;->r:Lv3/e;

    .line 5
    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    sget-object v1, Lx3/K;->g:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    :try_start_1
    sget-object v2, Lx3/K;->i:Landroid/os/HandlerThread;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    monitor-exit v1

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    new-instance v2, Landroid/os/HandlerThread;

    .line 20
    .line 21
    const-string v3, "GoogleApiHandler"

    .line 22
    .line 23
    const/16 v4, 0x9

    .line 24
    .line 25
    invoke-direct {v2, v3, v4}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    sput-object v2, Lx3/K;->i:Landroid/os/HandlerThread;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 31
    .line 32
    .line 33
    sget-object v2, Lx3/K;->i:Landroid/os/HandlerThread;

    .line 34
    .line 35
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    :goto_0
    :try_start_2
    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    new-instance v2, Lv3/e;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    sget-object v3, Lcom/google/android/gms/common/e;->c:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-direct {v2, p0, v1}, Lv3/e;-><init>(Landroid/content/Context;Landroid/os/Looper;)V

    .line 49
    .line 50
    .line 51
    sput-object v2, Lv3/e;->r:Lv3/e;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :catchall_1
    move-exception p0

    .line 55
    goto :goto_3

    .line 56
    :goto_1
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 57
    :try_start_4
    throw p0

    .line 58
    :cond_1
    :goto_2
    sget-object p0, Lv3/e;->r:Lv3/e;

    .line 59
    .line 60
    monitor-exit v0

    .line 61
    return-object p0

    .line 62
    :goto_3
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 63
    throw p0
.end method


# virtual methods
.method public final a()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lv3/e;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Lx3/k;->f()Lx3/k;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lv3/e;->g:Lv3/l;

    .line 14
    .line 15
    iget-object v0, v0, Lv3/l;->r:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Landroid/util/SparseIntArray;

    .line 18
    .line 19
    const v1, 0xc1fa340

    .line 20
    .line 21
    .line 22
    const/4 v2, -0x1

    .line 23
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->get(II)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eq v0, v2, :cond_2

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 33
    return v0

    .line 34
    :cond_2
    :goto_1
    const/4 v0, 0x1

    .line 35
    return v0
.end method

.method public final b(Lcom/google/android/gms/common/b;I)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lv3/e;->f:Lcom/google/android/gms/common/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lv3/e;->e:Landroid/content/Context;

    .line 7
    .line 8
    invoke-static {v1}, LC3/a;->F(Landroid/content/Context;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    iget v2, p1, Lcom/google/android/gms/common/b;->r:I

    .line 17
    .line 18
    iget-object p1, p1, Lcom/google/android/gms/common/b;->s:Landroid/app/PendingIntent;

    .line 19
    .line 20
    const/4 v4, 0x1

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    move v5, v4

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move v5, v3

    .line 28
    :goto_0
    if-eqz v5, :cond_2

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    const/4 p1, 0x0

    .line 32
    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/google/android/gms/common/f;->b(Landroid/content/Context;IILjava/lang/String;)Landroid/app/PendingIntent;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    :goto_1
    if-eqz p1, :cond_3

    .line 37
    .line 38
    sget v5, Lcom/google/android/gms/common/api/GoogleApiActivity;->r:I

    .line 39
    .line 40
    new-instance v5, Landroid/content/Intent;

    .line 41
    .line 42
    const-class v6, Lcom/google/android/gms/common/api/GoogleApiActivity;

    .line 43
    .line 44
    invoke-direct {v5, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 45
    .line 46
    .line 47
    const-string v6, "pending_intent"

    .line 48
    .line 49
    invoke-virtual {v5, v6, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 50
    .line 51
    .line 52
    const-string p1, "failing_client_id"

    .line 53
    .line 54
    invoke-virtual {v5, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 55
    .line 56
    .line 57
    const-string p1, "notify_manager"

    .line 58
    .line 59
    invoke-virtual {v5, p1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 60
    .line 61
    .line 62
    sget p1, LI3/d;->a:I

    .line 63
    .line 64
    const/high16 p2, 0x8000000

    .line 65
    .line 66
    or-int/2addr p1, p2

    .line 67
    invoke-static {v1, v3, v5, p1}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {v0, v1, v2, p1}, Lcom/google/android/gms/common/e;->g(Landroid/content/Context;ILandroid/app/PendingIntent;)V

    .line 72
    .line 73
    .line 74
    return v4

    .line 75
    :cond_3
    :goto_2
    return v3
.end method

.method public final d(Lu3/d;)Lv3/o;
    .locals 3

    .line 1
    iget-object v0, p1, Lu3/d;->e:Lv3/a;

    .line 2
    .line 3
    iget-object v1, p0, Lv3/e;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, Lv3/o;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    new-instance v2, Lv3/o;

    .line 14
    .line 15
    invoke-direct {v2, p0, p1}, Lv3/o;-><init>(Lv3/e;Lu3/d;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object p1, v2, Lv3/o;->d:Lu3/b;

    .line 22
    .line 23
    invoke-interface {p1}, Lu3/b;->k()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object p1, p0, Lv3/e;->l:Lr/f;

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lr/f;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {v2}, Lv3/o;->j()V

    .line 35
    .line 36
    .line 37
    return-object v2
.end method

.method public final f(Lcom/google/android/gms/common/b;I)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lv3/e;->b(Lcom/google/android/gms/common/b;I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x5

    .line 8
    const/4 v1, 0x0

    .line 9
    iget-object v2, p0, Lv3/e;->m:LI3/e;

    .line 10
    .line 11
    invoke-virtual {v2, v0, p2, v1, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 12

    .line 1
    iget-object v0, p0, Lv3/e;->e:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, Lv3/e;->l:Lr/f;

    .line 4
    .line 5
    const-string v2, "GoogleApiManager"

    .line 6
    .line 7
    iget-object v3, p0, Lv3/e;->m:LI3/e;

    .line 8
    .line 9
    iget-object v4, p0, Lv3/e;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    iget v5, p1, Landroid/os/Message;->what:I

    .line 12
    .line 13
    const-wide/32 v6, 0x493e0

    .line 14
    .line 15
    .line 16
    const/16 v8, 0x11

    .line 17
    .line 18
    const/4 v9, 0x0

    .line 19
    const/4 v10, 0x0

    .line 20
    const/4 v11, 0x1

    .line 21
    packed-switch v5, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    new-instance p1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v0, "Unknown message id: "

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    return v9

    .line 42
    :pswitch_0
    iput-boolean v9, p0, Lv3/e;->b:Z

    .line 43
    .line 44
    return v11

    .line 45
    :pswitch_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Lv3/v;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    const-wide/16 v0, 0x0

    .line 53
    .line 54
    cmp-long p1, v0, v0

    .line 55
    .line 56
    if-nez p1, :cond_1

    .line 57
    .line 58
    new-instance p1, Lx3/m;

    .line 59
    .line 60
    filled-new-array {v10}, [Lx3/j;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-direct {p1, v9, v0}, Lx3/m;-><init>(ILjava/util/List;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lv3/e;->d:Lz3/b;

    .line 72
    .line 73
    if-nez v0, :cond_0

    .line 74
    .line 75
    iget-object v0, p0, Lv3/e;->e:Landroid/content/Context;

    .line 76
    .line 77
    sget-object v1, Lx3/n;->b:Lx3/n;

    .line 78
    .line 79
    new-instance v2, Lz3/b;

    .line 80
    .line 81
    sget-object v3, Lz3/b;->k:LZ/m;

    .line 82
    .line 83
    sget-object v4, Lu3/c;->c:Lu3/c;

    .line 84
    .line 85
    invoke-direct {v2, v0, v3, v1, v4}, Lu3/d;-><init>(Landroid/content/Context;LZ/m;Lx3/n;Lu3/c;)V

    .line 86
    .line 87
    .line 88
    iput-object v2, p0, Lv3/e;->d:Lz3/b;

    .line 89
    .line 90
    :cond_0
    iget-object v0, p0, Lv3/e;->d:Lz3/b;

    .line 91
    .line 92
    invoke-virtual {v0, p1}, Lz3/b;->b(Lx3/m;)LS3/k;

    .line 93
    .line 94
    .line 95
    return v11

    .line 96
    :cond_1
    iget-object p1, p0, Lv3/e;->c:Lx3/m;

    .line 97
    .line 98
    if-eqz p1, :cond_8

    .line 99
    .line 100
    iget-object v2, p1, Lx3/m;->r:Ljava/util/List;

    .line 101
    .line 102
    iget p1, p1, Lx3/m;->q:I

    .line 103
    .line 104
    if-nez p1, :cond_4

    .line 105
    .line 106
    if-eqz v2, :cond_2

    .line 107
    .line 108
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-ltz p1, :cond_2

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_2
    iget-object p1, p0, Lv3/e;->c:Lx3/m;

    .line 116
    .line 117
    iget-object v2, p1, Lx3/m;->r:Ljava/util/List;

    .line 118
    .line 119
    if-nez v2, :cond_3

    .line 120
    .line 121
    new-instance v2, Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 124
    .line 125
    .line 126
    iput-object v2, p1, Lx3/m;->r:Ljava/util/List;

    .line 127
    .line 128
    :cond_3
    iget-object p1, p1, Lx3/m;->r:Ljava/util/List;

    .line 129
    .line 130
    invoke-interface {p1, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_4
    :goto_0
    invoke-virtual {v3, v8}, Landroid/os/Handler;->removeMessages(I)V

    .line 135
    .line 136
    .line 137
    iget-object p1, p0, Lv3/e;->c:Lx3/m;

    .line 138
    .line 139
    if-eqz p1, :cond_8

    .line 140
    .line 141
    iget v2, p1, Lx3/m;->q:I

    .line 142
    .line 143
    if-gtz v2, :cond_5

    .line 144
    .line 145
    invoke-virtual {p0}, Lv3/e;->a()Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    if-eqz v2, :cond_7

    .line 150
    .line 151
    :cond_5
    iget-object v2, p0, Lv3/e;->d:Lz3/b;

    .line 152
    .line 153
    if-nez v2, :cond_6

    .line 154
    .line 155
    iget-object v2, p0, Lv3/e;->e:Landroid/content/Context;

    .line 156
    .line 157
    sget-object v4, Lx3/n;->b:Lx3/n;

    .line 158
    .line 159
    new-instance v5, Lz3/b;

    .line 160
    .line 161
    sget-object v6, Lz3/b;->k:LZ/m;

    .line 162
    .line 163
    sget-object v7, Lu3/c;->c:Lu3/c;

    .line 164
    .line 165
    invoke-direct {v5, v2, v6, v4, v7}, Lu3/d;-><init>(Landroid/content/Context;LZ/m;Lx3/n;Lu3/c;)V

    .line 166
    .line 167
    .line 168
    iput-object v5, p0, Lv3/e;->d:Lz3/b;

    .line 169
    .line 170
    :cond_6
    iget-object v2, p0, Lv3/e;->d:Lz3/b;

    .line 171
    .line 172
    invoke-virtual {v2, p1}, Lz3/b;->b(Lx3/m;)LS3/k;

    .line 173
    .line 174
    .line 175
    :cond_7
    iput-object v10, p0, Lv3/e;->c:Lx3/m;

    .line 176
    .line 177
    :cond_8
    :goto_1
    iget-object p1, p0, Lv3/e;->c:Lx3/m;

    .line 178
    .line 179
    if-nez p1, :cond_24

    .line 180
    .line 181
    new-instance p1, Ljava/util/ArrayList;

    .line 182
    .line 183
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    new-instance v2, Lx3/m;

    .line 190
    .line 191
    invoke-direct {v2, v9, p1}, Lx3/m;-><init>(ILjava/util/List;)V

    .line 192
    .line 193
    .line 194
    iput-object v2, p0, Lv3/e;->c:Lx3/m;

    .line 195
    .line 196
    invoke-virtual {v3, v8}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-virtual {v3, p1, v0, v1}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 201
    .line 202
    .line 203
    return v11

    .line 204
    :pswitch_2
    iget-object p1, p0, Lv3/e;->c:Lx3/m;

    .line 205
    .line 206
    if-eqz p1, :cond_24

    .line 207
    .line 208
    iget v0, p1, Lx3/m;->q:I

    .line 209
    .line 210
    if-gtz v0, :cond_9

    .line 211
    .line 212
    invoke-virtual {p0}, Lv3/e;->a()Z

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-eqz v0, :cond_b

    .line 217
    .line 218
    :cond_9
    iget-object v0, p0, Lv3/e;->d:Lz3/b;

    .line 219
    .line 220
    if-nez v0, :cond_a

    .line 221
    .line 222
    iget-object v0, p0, Lv3/e;->e:Landroid/content/Context;

    .line 223
    .line 224
    sget-object v1, Lx3/n;->b:Lx3/n;

    .line 225
    .line 226
    new-instance v2, Lz3/b;

    .line 227
    .line 228
    sget-object v3, Lz3/b;->k:LZ/m;

    .line 229
    .line 230
    sget-object v4, Lu3/c;->c:Lu3/c;

    .line 231
    .line 232
    invoke-direct {v2, v0, v3, v1, v4}, Lu3/d;-><init>(Landroid/content/Context;LZ/m;Lx3/n;Lu3/c;)V

    .line 233
    .line 234
    .line 235
    iput-object v2, p0, Lv3/e;->d:Lz3/b;

    .line 236
    .line 237
    :cond_a
    iget-object v0, p0, Lv3/e;->d:Lz3/b;

    .line 238
    .line 239
    invoke-virtual {v0, p1}, Lz3/b;->b(Lx3/m;)LS3/k;

    .line 240
    .line 241
    .line 242
    :cond_b
    iput-object v10, p0, Lv3/e;->c:Lx3/m;

    .line 243
    .line 244
    return v11

    .line 245
    :pswitch_3
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast p1, Lv3/p;

    .line 248
    .line 249
    iget-object v0, p1, Lv3/p;->a:Lv3/a;

    .line 250
    .line 251
    invoke-virtual {v4, v0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    if-eqz v0, :cond_24

    .line 256
    .line 257
    iget-object v0, p1, Lv3/p;->a:Lv3/a;

    .line 258
    .line 259
    invoke-virtual {v4, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    check-cast v0, Lv3/o;

    .line 264
    .line 265
    iget-object v1, v0, Lv3/o;->l:Ljava/util/ArrayList;

    .line 266
    .line 267
    iget-object v2, v0, Lv3/o;->n:Lv3/e;

    .line 268
    .line 269
    iget-object v3, v0, Lv3/o;->c:Ljava/util/LinkedList;

    .line 270
    .line 271
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v1

    .line 275
    if-eqz v1, :cond_24

    .line 276
    .line 277
    iget-object v1, v2, Lv3/e;->m:LI3/e;

    .line 278
    .line 279
    const/16 v4, 0xf

    .line 280
    .line 281
    invoke-virtual {v1, v4, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    iget-object v1, v2, Lv3/e;->m:LI3/e;

    .line 285
    .line 286
    const/16 v2, 0x10

    .line 287
    .line 288
    invoke-virtual {v1, v2, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    iget-object p1, p1, Lv3/p;->b:Lcom/google/android/gms/common/d;

    .line 292
    .line 293
    new-instance v1, Ljava/util/ArrayList;

    .line 294
    .line 295
    invoke-virtual {v3}, Ljava/util/LinkedList;->size()I

    .line 296
    .line 297
    .line 298
    move-result v2

    .line 299
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 300
    .line 301
    .line 302
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    :cond_c
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 307
    .line 308
    .line 309
    move-result v4

    .line 310
    if-eqz v4, :cond_e

    .line 311
    .line 312
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v4

    .line 316
    check-cast v4, Lv3/B;

    .line 317
    .line 318
    instance-of v5, v4, Lv3/u;

    .line 319
    .line 320
    if-eqz v5, :cond_c

    .line 321
    .line 322
    move-object v5, v4

    .line 323
    check-cast v5, Lv3/u;

    .line 324
    .line 325
    invoke-virtual {v5, v0}, Lv3/u;->g(Lv3/o;)[Lcom/google/android/gms/common/d;

    .line 326
    .line 327
    .line 328
    move-result-object v5

    .line 329
    if-eqz v5, :cond_c

    .line 330
    .line 331
    array-length v6, v5

    .line 332
    move v7, v9

    .line 333
    :goto_3
    if-ge v7, v6, :cond_c

    .line 334
    .line 335
    aget-object v8, v5, v7

    .line 336
    .line 337
    invoke-static {v8, p1}, Lx3/A;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v8

    .line 341
    if-eqz v8, :cond_d

    .line 342
    .line 343
    if-ltz v7, :cond_c

    .line 344
    .line 345
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    goto :goto_2

    .line 349
    :cond_d
    add-int/lit8 v7, v7, 0x1

    .line 350
    .line 351
    goto :goto_3

    .line 352
    :cond_e
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    :goto_4
    if-ge v9, v0, :cond_24

    .line 357
    .line 358
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    check-cast v2, Lv3/B;

    .line 363
    .line 364
    invoke-virtual {v3, v2}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    new-instance v4, Lu3/i;

    .line 368
    .line 369
    invoke-direct {v4, p1}, Lu3/i;-><init>(Lcom/google/android/gms/common/d;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v2, v4}, Lv3/B;->b(Ljava/lang/Exception;)V

    .line 373
    .line 374
    .line 375
    add-int/lit8 v9, v9, 0x1

    .line 376
    .line 377
    goto :goto_4

    .line 378
    :pswitch_4
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast p1, Lv3/p;

    .line 381
    .line 382
    iget-object v0, p1, Lv3/p;->a:Lv3/a;

    .line 383
    .line 384
    invoke-virtual {v4, v0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    if-eqz v0, :cond_24

    .line 389
    .line 390
    iget-object v0, p1, Lv3/p;->a:Lv3/a;

    .line 391
    .line 392
    invoke-virtual {v4, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    check-cast v0, Lv3/o;

    .line 397
    .line 398
    iget-object v1, v0, Lv3/o;->l:Ljava/util/ArrayList;

    .line 399
    .line 400
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result p1

    .line 404
    if-nez p1, :cond_f

    .line 405
    .line 406
    goto/16 :goto_f

    .line 407
    .line 408
    :cond_f
    iget-boolean p1, v0, Lv3/o;->k:Z

    .line 409
    .line 410
    if-nez p1, :cond_24

    .line 411
    .line 412
    iget-object p1, v0, Lv3/o;->d:Lu3/b;

    .line 413
    .line 414
    invoke-interface {p1}, Lu3/b;->a()Z

    .line 415
    .line 416
    .line 417
    move-result p1

    .line 418
    if-nez p1, :cond_10

    .line 419
    .line 420
    invoke-virtual {v0}, Lv3/o;->j()V

    .line 421
    .line 422
    .line 423
    return v11

    .line 424
    :cond_10
    invoke-virtual {v0}, Lv3/o;->d()V

    .line 425
    .line 426
    .line 427
    return v11

    .line 428
    :pswitch_5
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 429
    .line 430
    invoke-static {p1}, Lk1/i;->g(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 431
    .line 432
    .line 433
    move-result-object p1

    .line 434
    throw p1

    .line 435
    :pswitch_6
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 436
    .line 437
    invoke-virtual {v4, v0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    move-result v0

    .line 441
    if-eqz v0, :cond_24

    .line 442
    .line 443
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 444
    .line 445
    invoke-virtual {v4, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object p1

    .line 449
    check-cast p1, Lv3/o;

    .line 450
    .line 451
    iget-object v0, p1, Lv3/o;->n:Lv3/e;

    .line 452
    .line 453
    iget-object v0, v0, Lv3/e;->m:LI3/e;

    .line 454
    .line 455
    invoke-static {v0}, Lx3/A;->c(Landroid/os/Handler;)V

    .line 456
    .line 457
    .line 458
    iget-object v0, p1, Lv3/o;->d:Lu3/b;

    .line 459
    .line 460
    invoke-interface {v0}, Lu3/b;->a()Z

    .line 461
    .line 462
    .line 463
    move-result v1

    .line 464
    if-eqz v1, :cond_13

    .line 465
    .line 466
    iget-object v1, p1, Lv3/o;->h:Ljava/util/HashMap;

    .line 467
    .line 468
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 469
    .line 470
    .line 471
    move-result v1

    .line 472
    if-eqz v1, :cond_13

    .line 473
    .line 474
    iget-object v1, p1, Lv3/o;->f:Lv3/l;

    .line 475
    .line 476
    iget-object v2, v1, Lv3/l;->r:Ljava/lang/Object;

    .line 477
    .line 478
    check-cast v2, Ljava/util/Map;

    .line 479
    .line 480
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 481
    .line 482
    .line 483
    move-result v2

    .line 484
    if-eqz v2, :cond_12

    .line 485
    .line 486
    iget-object v1, v1, Lv3/l;->s:Ljava/lang/Object;

    .line 487
    .line 488
    check-cast v1, Ljava/util/Map;

    .line 489
    .line 490
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 491
    .line 492
    .line 493
    move-result v1

    .line 494
    if-nez v1, :cond_11

    .line 495
    .line 496
    goto :goto_5

    .line 497
    :cond_11
    const-string p1, "Timing out service connection."

    .line 498
    .line 499
    invoke-interface {v0, p1}, Lu3/b;->d(Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    return v11

    .line 503
    :cond_12
    :goto_5
    invoke-virtual {p1}, Lv3/o;->g()V

    .line 504
    .line 505
    .line 506
    :cond_13
    return v11

    .line 507
    :pswitch_7
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 508
    .line 509
    invoke-virtual {v4, v0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 510
    .line 511
    .line 512
    move-result v0

    .line 513
    if-eqz v0, :cond_24

    .line 514
    .line 515
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 516
    .line 517
    invoke-virtual {v4, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object p1

    .line 521
    check-cast p1, Lv3/o;

    .line 522
    .line 523
    iget-object v0, p1, Lv3/o;->n:Lv3/e;

    .line 524
    .line 525
    iget-object v1, v0, Lv3/e;->m:LI3/e;

    .line 526
    .line 527
    invoke-static {v1}, Lx3/A;->c(Landroid/os/Handler;)V

    .line 528
    .line 529
    .line 530
    iget-boolean v1, p1, Lv3/o;->k:Z

    .line 531
    .line 532
    if-eqz v1, :cond_24

    .line 533
    .line 534
    iget-object v2, p1, Lv3/o;->e:Lv3/a;

    .line 535
    .line 536
    iget-object v3, p1, Lv3/o;->n:Lv3/e;

    .line 537
    .line 538
    iget-object v3, v3, Lv3/e;->m:LI3/e;

    .line 539
    .line 540
    if-eqz v1, :cond_14

    .line 541
    .line 542
    const/16 v1, 0xb

    .line 543
    .line 544
    invoke-virtual {v3, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 545
    .line 546
    .line 547
    const/16 v1, 0x9

    .line 548
    .line 549
    invoke-virtual {v3, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 550
    .line 551
    .line 552
    iput-boolean v9, p1, Lv3/o;->k:Z

    .line 553
    .line 554
    :cond_14
    iget-object v1, v0, Lv3/e;->f:Lcom/google/android/gms/common/e;

    .line 555
    .line 556
    iget-object v0, v0, Lv3/e;->e:Landroid/content/Context;

    .line 557
    .line 558
    sget v2, Lcom/google/android/gms/common/f;->a:I

    .line 559
    .line 560
    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/common/f;->c(Landroid/content/Context;I)I

    .line 561
    .line 562
    .line 563
    move-result v0

    .line 564
    const/16 v1, 0x12

    .line 565
    .line 566
    if-ne v0, v1, :cond_15

    .line 567
    .line 568
    const-string v0, "Connection timed out waiting for Google Play services update to complete."

    .line 569
    .line 570
    new-instance v1, Lcom/google/android/gms/common/api/Status;

    .line 571
    .line 572
    const/16 v2, 0x15

    .line 573
    .line 574
    invoke-direct {v1, v2, v0, v10, v10}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/b;)V

    .line 575
    .line 576
    .line 577
    goto :goto_6

    .line 578
    :cond_15
    const-string v0, "API failed to connect while resuming due to an unknown error."

    .line 579
    .line 580
    new-instance v1, Lcom/google/android/gms/common/api/Status;

    .line 581
    .line 582
    const/16 v2, 0x16

    .line 583
    .line 584
    invoke-direct {v1, v2, v0, v10, v10}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/b;)V

    .line 585
    .line 586
    .line 587
    :goto_6
    invoke-virtual {p1, v1}, Lv3/o;->b(Lcom/google/android/gms/common/api/Status;)V

    .line 588
    .line 589
    .line 590
    iget-object p1, p1, Lv3/o;->d:Lu3/b;

    .line 591
    .line 592
    const-string v0, "Timing out connection while resuming."

    .line 593
    .line 594
    invoke-interface {p1, v0}, Lu3/b;->d(Ljava/lang/String;)V

    .line 595
    .line 596
    .line 597
    return v11

    .line 598
    :pswitch_8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 599
    .line 600
    .line 601
    new-instance p1, Lr/a;

    .line 602
    .line 603
    invoke-direct {p1, v1}, Lr/a;-><init>(Lr/f;)V

    .line 604
    .line 605
    .line 606
    :cond_16
    :goto_7
    invoke-virtual {p1}, Lr/a;->hasNext()Z

    .line 607
    .line 608
    .line 609
    move-result v0

    .line 610
    if-eqz v0, :cond_17

    .line 611
    .line 612
    invoke-virtual {p1}, Lr/a;->next()Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    check-cast v0, Lv3/a;

    .line 617
    .line 618
    invoke-virtual {v4, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    check-cast v0, Lv3/o;

    .line 623
    .line 624
    if-eqz v0, :cond_16

    .line 625
    .line 626
    invoke-virtual {v0}, Lv3/o;->n()V

    .line 627
    .line 628
    .line 629
    goto :goto_7

    .line 630
    :cond_17
    invoke-virtual {v1}, Lr/f;->clear()V

    .line 631
    .line 632
    .line 633
    return v11

    .line 634
    :pswitch_9
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 635
    .line 636
    invoke-virtual {v4, v0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 637
    .line 638
    .line 639
    move-result v0

    .line 640
    if-eqz v0, :cond_24

    .line 641
    .line 642
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 643
    .line 644
    invoke-virtual {v4, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object p1

    .line 648
    check-cast p1, Lv3/o;

    .line 649
    .line 650
    iget-object v0, p1, Lv3/o;->n:Lv3/e;

    .line 651
    .line 652
    iget-object v0, v0, Lv3/e;->m:LI3/e;

    .line 653
    .line 654
    invoke-static {v0}, Lx3/A;->c(Landroid/os/Handler;)V

    .line 655
    .line 656
    .line 657
    iget-boolean v0, p1, Lv3/o;->k:Z

    .line 658
    .line 659
    if-eqz v0, :cond_24

    .line 660
    .line 661
    invoke-virtual {p1}, Lv3/o;->j()V

    .line 662
    .line 663
    .line 664
    return v11

    .line 665
    :pswitch_a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 666
    .line 667
    check-cast p1, Lu3/d;

    .line 668
    .line 669
    invoke-virtual {p0, p1}, Lv3/e;->d(Lu3/d;)Lv3/o;

    .line 670
    .line 671
    .line 672
    return v11

    .line 673
    :pswitch_b
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 674
    .line 675
    .line 676
    move-result-object p1

    .line 677
    instance-of p1, p1, Landroid/app/Application;

    .line 678
    .line 679
    if-eqz p1, :cond_24

    .line 680
    .line 681
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 682
    .line 683
    .line 684
    move-result-object p1

    .line 685
    check-cast p1, Landroid/app/Application;

    .line 686
    .line 687
    invoke-static {p1}, Lv3/c;->a(Landroid/app/Application;)V

    .line 688
    .line 689
    .line 690
    sget-object p1, Lv3/c;->u:Lv3/c;

    .line 691
    .line 692
    new-instance v0, Lv3/n;

    .line 693
    .line 694
    invoke-direct {v0, p0}, Lv3/n;-><init>(Lv3/e;)V

    .line 695
    .line 696
    .line 697
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 698
    .line 699
    .line 700
    monitor-enter p1

    .line 701
    :try_start_0
    iget-object v1, p1, Lv3/c;->s:Ljava/util/ArrayList;

    .line 702
    .line 703
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 704
    .line 705
    .line 706
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 707
    iget-object v0, p1, Lv3/c;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 708
    .line 709
    iget-object p1, p1, Lv3/c;->r:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 710
    .line 711
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 712
    .line 713
    .line 714
    move-result v1

    .line 715
    if-nez v1, :cond_1c

    .line 716
    .line 717
    sget-object v1, LB3/b;->i:Ljava/lang/Boolean;

    .line 718
    .line 719
    if-nez v1, :cond_1a

    .line 720
    .line 721
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 722
    .line 723
    const/16 v2, 0x1c

    .line 724
    .line 725
    if-lt v1, v2, :cond_18

    .line 726
    .line 727
    invoke-static {}, LB3/c;->w()Z

    .line 728
    .line 729
    .line 730
    move-result v1

    .line 731
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 732
    .line 733
    .line 734
    move-result-object v1

    .line 735
    goto :goto_8

    .line 736
    :cond_18
    :try_start_1
    const-class v1, Landroid/os/Process;

    .line 737
    .line 738
    const-string v2, "isIsolated"

    .line 739
    .line 740
    invoke-virtual {v1, v2, v10}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 741
    .line 742
    .line 743
    move-result-object v1

    .line 744
    invoke-virtual {v1, v10, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    move-result-object v1

    .line 748
    new-array v2, v9, [Ljava/lang/Object;

    .line 749
    .line 750
    if-eqz v1, :cond_19

    .line 751
    .line 752
    check-cast v1, Ljava/lang/Boolean;

    .line 753
    .line 754
    goto :goto_8

    .line 755
    :cond_19
    new-instance v1, LC2/e;

    .line 756
    .line 757
    invoke-static {v2}, La/a;->Y([Ljava/lang/Object;)Ljava/lang/String;

    .line 758
    .line 759
    .line 760
    move-result-object v2

    .line 761
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 762
    .line 763
    .line 764
    throw v1
    :try_end_1
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 765
    :catch_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 766
    .line 767
    :goto_8
    sput-object v1, LB3/b;->i:Ljava/lang/Boolean;

    .line 768
    .line 769
    :cond_1a
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 770
    .line 771
    .line 772
    move-result v1

    .line 773
    if-nez v1, :cond_1b

    .line 774
    .line 775
    new-instance v1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 776
    .line 777
    invoke-direct {v1}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    .line 778
    .line 779
    .line 780
    invoke-static {v1}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    .line 781
    .line 782
    .line 783
    invoke-virtual {p1, v11}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 784
    .line 785
    .line 786
    move-result p1

    .line 787
    if-nez p1, :cond_1c

    .line 788
    .line 789
    iget p1, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 790
    .line 791
    const/16 v1, 0x64

    .line 792
    .line 793
    if-le p1, v1, :cond_1c

    .line 794
    .line 795
    invoke-virtual {v0, v11}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 796
    .line 797
    .line 798
    goto :goto_9

    .line 799
    :cond_1b
    move p1, v11

    .line 800
    goto :goto_a

    .line 801
    :cond_1c
    :goto_9
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 802
    .line 803
    .line 804
    move-result p1

    .line 805
    :goto_a
    if-nez p1, :cond_24

    .line 806
    .line 807
    iput-wide v6, p0, Lv3/e;->a:J

    .line 808
    .line 809
    goto/16 :goto_f

    .line 810
    .line 811
    :catchall_0
    move-exception v0

    .line 812
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 813
    throw v0

    .line 814
    :pswitch_c
    iget v0, p1, Landroid/os/Message;->arg1:I

    .line 815
    .line 816
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 817
    .line 818
    check-cast p1, Lcom/google/android/gms/common/b;

    .line 819
    .line 820
    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 821
    .line 822
    .line 823
    move-result-object v1

    .line 824
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 825
    .line 826
    .line 827
    move-result-object v1

    .line 828
    :cond_1d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 829
    .line 830
    .line 831
    move-result v3

    .line 832
    if-eqz v3, :cond_1e

    .line 833
    .line 834
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 835
    .line 836
    .line 837
    move-result-object v3

    .line 838
    check-cast v3, Lv3/o;

    .line 839
    .line 840
    iget v4, v3, Lv3/o;->i:I

    .line 841
    .line 842
    if-ne v4, v0, :cond_1d

    .line 843
    .line 844
    goto :goto_b

    .line 845
    :cond_1e
    move-object v3, v10

    .line 846
    :goto_b
    if-eqz v3, :cond_20

    .line 847
    .line 848
    iget v0, p1, Lcom/google/android/gms/common/b;->r:I

    .line 849
    .line 850
    const/16 v1, 0xd

    .line 851
    .line 852
    if-ne v0, v1, :cond_1f

    .line 853
    .line 854
    iget-object v1, p0, Lv3/e;->f:Lcom/google/android/gms/common/e;

    .line 855
    .line 856
    new-instance v2, Lcom/google/android/gms/common/api/Status;

    .line 857
    .line 858
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 859
    .line 860
    .line 861
    sget v1, Lcom/google/android/gms/common/h;->GOOGLE_PLAY_SERVICES_VERSION_CODE:I

    .line 862
    .line 863
    invoke-static {v0}, Lcom/google/android/gms/common/b;->W(I)Ljava/lang/String;

    .line 864
    .line 865
    .line 866
    move-result-object v0

    .line 867
    iget-object p1, p1, Lcom/google/android/gms/common/b;->t:Ljava/lang/String;

    .line 868
    .line 869
    new-instance v1, Ljava/lang/StringBuilder;

    .line 870
    .line 871
    const-string v4, "Error resolution was canceled by the user, original error message: "

    .line 872
    .line 873
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 874
    .line 875
    .line 876
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 877
    .line 878
    .line 879
    const-string v0, ": "

    .line 880
    .line 881
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 882
    .line 883
    .line 884
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 885
    .line 886
    .line 887
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 888
    .line 889
    .line 890
    move-result-object p1

    .line 891
    invoke-direct {v2, v8, p1, v10, v10}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/b;)V

    .line 892
    .line 893
    .line 894
    invoke-virtual {v3, v2}, Lv3/o;->b(Lcom/google/android/gms/common/api/Status;)V

    .line 895
    .line 896
    .line 897
    return v11

    .line 898
    :cond_1f
    iget-object v0, v3, Lv3/o;->e:Lv3/a;

    .line 899
    .line 900
    invoke-static {v0, p1}, Lv3/e;->c(Lv3/a;Lcom/google/android/gms/common/b;)Lcom/google/android/gms/common/api/Status;

    .line 901
    .line 902
    .line 903
    move-result-object p1

    .line 904
    invoke-virtual {v3, p1}, Lv3/o;->b(Lcom/google/android/gms/common/api/Status;)V

    .line 905
    .line 906
    .line 907
    return v11

    .line 908
    :cond_20
    const-string p1, "Could not find API instance "

    .line 909
    .line 910
    const-string v1, " while trying to fail enqueued calls."

    .line 911
    .line 912
    invoke-static {p1, v1, v0}, LC0/S;->m(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 913
    .line 914
    .line 915
    move-result-object p1

    .line 916
    new-instance v0, Ljava/lang/Exception;

    .line 917
    .line 918
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 919
    .line 920
    .line 921
    invoke-static {v2, p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 922
    .line 923
    .line 924
    return v11

    .line 925
    :pswitch_d
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 926
    .line 927
    check-cast p1, Lv3/w;

    .line 928
    .line 929
    iget-object v0, p1, Lv3/w;->c:Lu3/d;

    .line 930
    .line 931
    iget-object v1, p1, Lv3/w;->a:Lv3/B;

    .line 932
    .line 933
    iget-object v0, v0, Lu3/d;->e:Lv3/a;

    .line 934
    .line 935
    invoke-virtual {v4, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 936
    .line 937
    .line 938
    move-result-object v0

    .line 939
    check-cast v0, Lv3/o;

    .line 940
    .line 941
    if-nez v0, :cond_21

    .line 942
    .line 943
    iget-object v0, p1, Lv3/w;->c:Lu3/d;

    .line 944
    .line 945
    invoke-virtual {p0, v0}, Lv3/e;->d(Lu3/d;)Lv3/o;

    .line 946
    .line 947
    .line 948
    move-result-object v0

    .line 949
    :cond_21
    iget-object v2, v0, Lv3/o;->d:Lu3/b;

    .line 950
    .line 951
    invoke-interface {v2}, Lu3/b;->k()Z

    .line 952
    .line 953
    .line 954
    move-result v2

    .line 955
    if-eqz v2, :cond_22

    .line 956
    .line 957
    iget-object v2, p0, Lv3/e;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 958
    .line 959
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 960
    .line 961
    .line 962
    move-result v2

    .line 963
    iget p1, p1, Lv3/w;->b:I

    .line 964
    .line 965
    if-eq v2, p1, :cond_22

    .line 966
    .line 967
    sget-object p1, Lv3/e;->o:Lcom/google/android/gms/common/api/Status;

    .line 968
    .line 969
    invoke-virtual {v1, p1}, Lv3/B;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 970
    .line 971
    .line 972
    invoke-virtual {v0}, Lv3/o;->n()V

    .line 973
    .line 974
    .line 975
    return v11

    .line 976
    :cond_22
    invoke-virtual {v0, v1}, Lv3/o;->k(Lv3/B;)V

    .line 977
    .line 978
    .line 979
    return v11

    .line 980
    :pswitch_e
    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 981
    .line 982
    .line 983
    move-result-object p1

    .line 984
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 985
    .line 986
    .line 987
    move-result-object p1

    .line 988
    :goto_c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 989
    .line 990
    .line 991
    move-result v0

    .line 992
    if-eqz v0, :cond_24

    .line 993
    .line 994
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 995
    .line 996
    .line 997
    move-result-object v0

    .line 998
    check-cast v0, Lv3/o;

    .line 999
    .line 1000
    iget-object v1, v0, Lv3/o;->n:Lv3/e;

    .line 1001
    .line 1002
    iget-object v1, v1, Lv3/e;->m:LI3/e;

    .line 1003
    .line 1004
    invoke-static {v1}, Lx3/A;->c(Landroid/os/Handler;)V

    .line 1005
    .line 1006
    .line 1007
    iput-object v10, v0, Lv3/o;->m:Lcom/google/android/gms/common/b;

    .line 1008
    .line 1009
    invoke-virtual {v0}, Lv3/o;->j()V

    .line 1010
    .line 1011
    .line 1012
    goto :goto_c

    .line 1013
    :pswitch_f
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1014
    .line 1015
    invoke-static {p1}, Lk1/i;->g(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 1016
    .line 1017
    .line 1018
    move-result-object p1

    .line 1019
    throw p1

    .line 1020
    :pswitch_10
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1021
    .line 1022
    check-cast p1, Ljava/lang/Boolean;

    .line 1023
    .line 1024
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1025
    .line 1026
    .line 1027
    move-result p1

    .line 1028
    if-eq v11, p1, :cond_23

    .line 1029
    .line 1030
    goto :goto_d

    .line 1031
    :cond_23
    const-wide/16 v6, 0x2710

    .line 1032
    .line 1033
    :goto_d
    iput-wide v6, p0, Lv3/e;->a:J

    .line 1034
    .line 1035
    const/16 p1, 0xc

    .line 1036
    .line 1037
    invoke-virtual {v3, p1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1038
    .line 1039
    .line 1040
    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v0

    .line 1044
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v0

    .line 1048
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1049
    .line 1050
    .line 1051
    move-result v1

    .line 1052
    if-eqz v1, :cond_24

    .line 1053
    .line 1054
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v1

    .line 1058
    check-cast v1, Lv3/a;

    .line 1059
    .line 1060
    invoke-virtual {v3, p1, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v1

    .line 1064
    iget-wide v4, p0, Lv3/e;->a:J

    .line 1065
    .line 1066
    invoke-virtual {v3, v1, v4, v5}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 1067
    .line 1068
    .line 1069
    goto :goto_e

    .line 1070
    :cond_24
    :goto_f
    return v11

    .line 1071
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_d
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_d
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
