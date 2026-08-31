.class public final LS3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS3/i;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;LS3/a;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LS3/h;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LS3/h;->c:Ljava/lang/Object;

    iput-object p1, p0, LS3/h;->b:Ljava/util/concurrent/Executor;

    iput-object p2, p0, LS3/h;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;LS3/b;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LS3/h;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LS3/h;->c:Ljava/lang/Object;

    iput-object p1, p0, LS3/h;->b:Ljava/util/concurrent/Executor;

    iput-object p2, p0, LS3/h;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;LS3/c;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LS3/h;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LS3/h;->c:Ljava/lang/Object;

    iput-object p1, p0, LS3/h;->b:Ljava/util/concurrent/Executor;

    iput-object p2, p0, LS3/h;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(LS3/d;)V
    .locals 4

    .line 1
    iget v0, p0, LS3/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, LS3/d;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, LS3/h;->c:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v0

    .line 15
    :try_start_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    iget-object v0, p0, LS3/h;->b:Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    new-instance v1, LI4/a;

    .line 19
    .line 20
    const/16 v2, 0x15

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-direct {v1, v2, p0, p1, v3}, LI4/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw p1

    .line 33
    :cond_0
    :goto_0
    return-void

    .line 34
    :pswitch_0
    invoke-virtual {p1}, LS3/d;->d()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    iget-object v0, p0, LS3/h;->c:Ljava/lang/Object;

    .line 41
    .line 42
    monitor-enter v0

    .line 43
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 44
    iget-object v0, p0, LS3/h;->b:Ljava/util/concurrent/Executor;

    .line 45
    .line 46
    new-instance v1, LI4/a;

    .line 47
    .line 48
    const/16 v2, 0x14

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    invoke-direct {v1, v2, p0, p1, v3}, LI4/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :catchall_1
    move-exception p1

    .line 59
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 60
    throw p1

    .line 61
    :cond_1
    :goto_1
    return-void

    .line 62
    :pswitch_1
    iget-object v0, p0, LS3/h;->c:Ljava/lang/Object;

    .line 63
    .line 64
    monitor-enter v0

    .line 65
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 66
    iget-object v0, p0, LS3/h;->b:Ljava/util/concurrent/Executor;

    .line 67
    .line 68
    new-instance v1, LI4/a;

    .line 69
    .line 70
    const/16 v2, 0x13

    .line 71
    .line 72
    const/4 v3, 0x0

    .line 73
    invoke-direct {v1, v2, p0, p1, v3}, LI4/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :catchall_2
    move-exception p1

    .line 81
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 82
    throw p1

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
