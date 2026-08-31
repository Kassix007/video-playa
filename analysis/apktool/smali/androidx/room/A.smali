.class public final synthetic Landroidx/room/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Landroidx/room/B;


# direct methods
.method public synthetic constructor <init>(Landroidx/room/B;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/room/A;->q:I

    iput-object p1, p0, Landroidx/room/A;->r:Landroidx/room/B;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Landroidx/room/A;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/room/A;->r:Landroidx/room/B;

    .line 7
    .line 8
    iget v1, v0, Landroidx/lifecycle/G;->c:I

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x1

    .line 12
    if-lez v1, :cond_0

    .line 13
    .line 14
    move v1, v3

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v1, v2

    .line 17
    :goto_0
    iget-object v4, v0, Landroidx/room/B;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    invoke-virtual {v4, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    iget-object v1, v0, Landroidx/room/B;->l:Landroidx/work/impl/WorkDatabase_Impl;

    .line 28
    .line 29
    iget-boolean v2, v0, Landroidx/room/B;->n:Z

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-virtual {v1}, Landroidx/room/w;->getTransactionExecutor()Ljava/util/concurrent/Executor;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {v1}, Landroidx/room/w;->getQueryExecutor()Ljava/util/concurrent/Executor;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    :goto_1
    iget-object v0, v0, Landroidx/room/B;->t:Landroidx/room/A;

    .line 43
    .line 44
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    return-void

    .line 48
    :pswitch_0
    iget-object v0, p0, Landroidx/room/A;->r:Landroidx/room/B;

    .line 49
    .line 50
    iget-object v1, v0, Landroidx/room/B;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 51
    .line 52
    iget-object v2, v0, Landroidx/room/B;->r:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 53
    .line 54
    iget-object v3, v0, Landroidx/room/B;->s:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 55
    .line 56
    const/4 v4, 0x0

    .line 57
    const/4 v5, 0x1

    .line 58
    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_3

    .line 63
    .line 64
    iget-object v3, v0, Landroidx/room/B;->l:Landroidx/work/impl/WorkDatabase_Impl;

    .line 65
    .line 66
    invoke-virtual {v3}, Landroidx/room/w;->getInvalidationTracker()Landroidx/room/q;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    iget-object v6, v0, Landroidx/room/B;->p:Landroidx/room/d;

    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    const-string v7, "observer"

    .line 76
    .line 77
    invoke-static {v6, v7}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    new-instance v7, Landroidx/room/p;

    .line 81
    .line 82
    invoke-direct {v7, v3, v6}, Landroidx/room/p;-><init>(Landroidx/room/q;Landroidx/room/d;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3, v7}, Landroidx/room/q;->a(Landroidx/room/n;)V

    .line 86
    .line 87
    .line 88
    :cond_3
    invoke-virtual {v2, v4, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-eqz v3, :cond_6

    .line 93
    .line 94
    const/4 v3, 0x0

    .line 95
    move v6, v4

    .line 96
    :goto_2
    :try_start_0
    invoke-virtual {v1, v5, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 97
    .line 98
    .line 99
    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    if-eqz v7, :cond_4

    .line 101
    .line 102
    :try_start_1
    iget-object v3, v0, Landroidx/room/B;->o:Ljava/util/concurrent/Callable;

    .line 103
    .line 104
    invoke-interface {v3}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    move v6, v5

    .line 109
    goto :goto_2

    .line 110
    :catchall_0
    move-exception v0

    .line 111
    goto :goto_3

    .line 112
    :catch_0
    move-exception v0

    .line 113
    :try_start_2
    new-instance v1, Ljava/lang/RuntimeException;

    .line 114
    .line 115
    const-string v3, "Exception while computing database live data."

    .line 116
    .line 117
    invoke-direct {v1, v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 118
    .line 119
    .line 120
    throw v1

    .line 121
    :cond_4
    if-eqz v6, :cond_5

    .line 122
    .line 123
    invoke-virtual {v0, v3}, Landroidx/lifecycle/G;->i(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 124
    .line 125
    .line 126
    :cond_5
    invoke-virtual {v2, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 127
    .line 128
    .line 129
    goto :goto_4

    .line 130
    :goto_3
    invoke-virtual {v2, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 131
    .line 132
    .line 133
    throw v0

    .line 134
    :cond_6
    move v6, v4

    .line 135
    :goto_4
    if-eqz v6, :cond_7

    .line 136
    .line 137
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-nez v3, :cond_3

    .line 142
    .line 143
    :cond_7
    return-void

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
