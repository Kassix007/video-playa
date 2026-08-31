.class public final LP/v0;
.super LP/r;
.source "SourceFile"


# static fields
.field public static final x:LP5/S;

.field public static final y:Ljava/util/concurrent/atomic/AtomicReference;


# instance fields
.field public final a:LP/e;

.field public final b:Ljava/lang/Object;

.field public c:LM5/b0;

.field public d:Ljava/lang/Throwable;

.field public final e:Ljava/util/ArrayList;

.field public f:Ljava/lang/Object;

.field public g:Lr/H;

.field public final h:LR/e;

.field public final i:Ljava/util/ArrayList;

.field public final j:Ljava/util/ArrayList;

.field public final k:Lr/G;

.field public final l:LB0/o;

.field public final m:Lr/G;

.field public final n:Lr/G;

.field public o:Ljava/util/ArrayList;

.field public p:Ljava/util/LinkedHashSet;

.field public q:LM5/h;

.field public r:Lk3/d;

.field public s:Z

.field public final t:LP5/S;

.field public final u:LM5/d0;

.field public final v:Lq5/h;

.field public final w:LP/S;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, LV/b;->t:LV/b;

    .line 2
    .line 3
    invoke-static {v0}, LP5/H;->b(Ljava/lang/Object;)LP5/S;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LP/v0;->x:LP5/S;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sput-object v0, LP/v0;->y:Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Lq5/h;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LP/e;

    .line 5
    .line 6
    new-instance v1, LA0/d;

    .line 7
    .line 8
    const/16 v2, 0xb

    .line 9
    .line 10
    invoke-direct {v1, v2, p0}, LA0/d;-><init>(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1}, LP/e;-><init>(LA0/d;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LP/v0;->a:LP/e;

    .line 17
    .line 18
    new-instance v1, Ljava/lang/Object;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, LP/v0;->b:Ljava/lang/Object;

    .line 24
    .line 25
    new-instance v1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, LP/v0;->e:Ljava/util/ArrayList;

    .line 31
    .line 32
    new-instance v1, Lr/H;

    .line 33
    .line 34
    invoke-direct {v1}, Lr/H;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, LP/v0;->g:Lr/H;

    .line 38
    .line 39
    new-instance v1, LR/e;

    .line 40
    .line 41
    const/16 v2, 0x10

    .line 42
    .line 43
    new-array v2, v2, [LP/u;

    .line 44
    .line 45
    invoke-direct {v1, v2}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iput-object v1, p0, LP/v0;->h:LR/e;

    .line 49
    .line 50
    new-instance v1, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v1, p0, LP/v0;->i:Ljava/util/ArrayList;

    .line 56
    .line 57
    new-instance v1, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object v1, p0, LP/v0;->j:Ljava/util/ArrayList;

    .line 63
    .line 64
    new-instance v1, Lr/G;

    .line 65
    .line 66
    invoke-direct {v1}, Lr/G;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-object v1, p0, LP/v0;->k:Lr/G;

    .line 70
    .line 71
    new-instance v1, LB0/o;

    .line 72
    .line 73
    const/16 v2, 0x15

    .line 74
    .line 75
    invoke-direct {v1, v2}, LB0/o;-><init>(I)V

    .line 76
    .line 77
    .line 78
    iput-object v1, p0, LP/v0;->l:LB0/o;

    .line 79
    .line 80
    new-instance v1, Lr/G;

    .line 81
    .line 82
    invoke-direct {v1}, Lr/G;-><init>()V

    .line 83
    .line 84
    .line 85
    iput-object v1, p0, LP/v0;->m:Lr/G;

    .line 86
    .line 87
    new-instance v1, Lr/G;

    .line 88
    .line 89
    invoke-direct {v1}, Lr/G;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object v1, p0, LP/v0;->n:Lr/G;

    .line 93
    .line 94
    sget-object v1, LP/p0;->s:LP/p0;

    .line 95
    .line 96
    invoke-static {v1}, LP5/H;->b(Ljava/lang/Object;)LP5/S;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    iput-object v1, p0, LP/v0;->t:LP5/S;

    .line 101
    .line 102
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 103
    .line 104
    sget-object v2, LX/k;->a:LX/l;

    .line 105
    .line 106
    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    sget-object v1, LM5/t;->r:LM5/t;

    .line 110
    .line 111
    invoke-interface {p1, v1}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    check-cast v1, LM5/b0;

    .line 116
    .line 117
    new-instance v2, LM5/d0;

    .line 118
    .line 119
    invoke-direct {v2, v1}, LM5/d0;-><init>(LM5/b0;)V

    .line 120
    .line 121
    .line 122
    new-instance v1, LB0/a;

    .line 123
    .line 124
    const/16 v3, 0x14

    .line 125
    .line 126
    invoke-direct {v1, v3, p0}, LB0/a;-><init>(ILjava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2, v1}, LM5/i0;->G(LB5/c;)LM5/J;

    .line 130
    .line 131
    .line 132
    iput-object v2, p0, LP/v0;->u:LM5/d0;

    .line 133
    .line 134
    invoke-interface {p1, v0}, Lq5/h;->plus(Lq5/h;)Lq5/h;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-interface {p1, v2}, Lq5/h;->plus(Lq5/h;)Lq5/h;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    iput-object p1, p0, LP/v0;->v:Lq5/h;

    .line 143
    .line 144
    new-instance p1, LP/S;

    .line 145
    .line 146
    const/16 v0, 0x9

    .line 147
    .line 148
    invoke-direct {p1, v0}, LP/S;-><init>(I)V

    .line 149
    .line 150
    .line 151
    iput-object p1, p0, LP/v0;->w:LP/S;

    .line 152
    .line 153
    return-void
.end method

.method public static final q(LP/v0;LP/u;Lr/H;)LP/u;
    .locals 5

    .line 1
    iget-object v0, p1, LP/u;->I:LP/o;

    .line 2
    .line 3
    iget-boolean v0, v0, LP/o;->E:Z

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_5

    .line 7
    .line 8
    iget-boolean v0, p1, LP/u;->J:Z

    .line 9
    .line 10
    if-nez v0, :cond_5

    .line 11
    .line 12
    iget-object p0, p0, LP/v0;->p:Ljava/util/LinkedHashSet;

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-ne p0, v0, :cond_0

    .line 22
    .line 23
    goto/16 :goto_4

    .line 24
    .line 25
    :cond_0
    new-instance p0, LB0/a;

    .line 26
    .line 27
    const/16 v2, 0x15

    .line 28
    .line 29
    invoke-direct {p0, v2, p1}, LB0/a;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    new-instance v2, LA/Y;

    .line 33
    .line 34
    const/16 v3, 0x13

    .line 35
    .line 36
    invoke-direct {v2, v3, p1, p2}, LA/Y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-static {}, La0/n;->k()La0/h;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    instance-of v4, v3, La0/d;

    .line 44
    .line 45
    if-eqz v4, :cond_1

    .line 46
    .line 47
    check-cast v3, La0/d;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move-object v3, v1

    .line 51
    :goto_0
    if-eqz v3, :cond_4

    .line 52
    .line 53
    invoke-virtual {v3, p0, v2}, La0/d;->C(LB5/c;LB5/c;)La0/d;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    if-eqz p0, :cond_4

    .line 58
    .line 59
    :try_start_0
    invoke-virtual {p0}, La0/h;->j()La0/h;

    .line 60
    .line 61
    .line 62
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 63
    if-eqz p2, :cond_3

    .line 64
    .line 65
    :try_start_1
    invoke-virtual {p2}, Lr/H;->h()Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-ne v3, v0, :cond_3

    .line 70
    .line 71
    new-instance v3, LB0/K;

    .line 72
    .line 73
    const/16 v4, 0xd

    .line 74
    .line 75
    invoke-direct {v3, v4, p2, p1}, LB0/K;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object p2, p1, LP/u;->I:LP/o;

    .line 79
    .line 80
    iget-boolean v4, p2, LP/o;->E:Z

    .line 81
    .line 82
    if-eqz v4, :cond_2

    .line 83
    .line 84
    const-string v4, "Preparing a composition while composing is not supported"

    .line 85
    .line 86
    invoke-static {v4}, LP/p;->c(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :cond_2
    iput-boolean v0, p2, LP/o;->E:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 90
    .line 91
    const/4 v0, 0x0

    .line 92
    :try_start_2
    invoke-virtual {v3}, LB0/K;->invoke()Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 93
    .line 94
    .line 95
    :try_start_3
    iput-boolean v0, p2, LP/o;->E:Z

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :catchall_0
    move-exception p1

    .line 99
    iput-boolean v0, p2, LP/o;->E:Z

    .line 100
    .line 101
    throw p1

    .line 102
    :catchall_1
    move-exception p1

    .line 103
    goto :goto_2

    .line 104
    :cond_3
    :goto_1
    invoke-virtual {p1}, LP/u;->v()Z

    .line 105
    .line 106
    .line 107
    move-result p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 108
    :try_start_4
    invoke-static {v2}, La0/h;->q(La0/h;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 109
    .line 110
    .line 111
    invoke-static {p0}, LP/v0;->s(La0/d;)V

    .line 112
    .line 113
    .line 114
    if-eqz p2, :cond_5

    .line 115
    .line 116
    return-object p1

    .line 117
    :catchall_2
    move-exception p1

    .line 118
    goto :goto_3

    .line 119
    :goto_2
    :try_start_5
    invoke-static {v2}, La0/h;->q(La0/h;)V

    .line 120
    .line 121
    .line 122
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 123
    :goto_3
    invoke-static {p0}, LP/v0;->s(La0/d;)V

    .line 124
    .line 125
    .line 126
    throw p1

    .line 127
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 128
    .line 129
    const-string p1, "Cannot create a mutable snapshot of an read-only snapshot"

    .line 130
    .line 131
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    throw p0

    .line 135
    :cond_5
    :goto_4
    return-object v1
.end method

.method public static final r(LP/v0;)Z
    .locals 8

    .line 1
    iget-object v0, p0, LP/v0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LP/v0;->g:Lr/H;

    .line 5
    .line 6
    invoke-virtual {v1}, Lr/H;->g()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    iget-object v1, p0, LP/v0;->h:LR/e;

    .line 15
    .line 16
    iget v1, v1, LR/e;->s:I

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p0}, LP/v0;->v()Z

    .line 22
    .line 23
    .line 24
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move v2, v3

    .line 29
    :goto_0
    monitor-exit v0

    .line 30
    return v2

    .line 31
    :cond_2
    :try_start_1
    iget-object v1, p0, LP/v0;->g:Lr/H;

    .line 32
    .line 33
    new-instance v4, LR/h;

    .line 34
    .line 35
    invoke-direct {v4, v1}, LR/h;-><init>(Lr/H;)V

    .line 36
    .line 37
    .line 38
    new-instance v1, Lr/H;

    .line 39
    .line 40
    invoke-direct {v1}, Lr/H;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v1, p0, LP/v0;->g:Lr/H;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 44
    .line 45
    monitor-exit v0

    .line 46
    iget-object v0, p0, LP/v0;->b:Ljava/lang/Object;

    .line 47
    .line 48
    monitor-enter v0

    .line 49
    :try_start_2
    invoke-virtual {p0}, LP/v0;->x()Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 53
    monitor-exit v0

    .line 54
    :try_start_3
    move-object v0, v1

    .line 55
    check-cast v0, Ljava/util/Collection;

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    move v5, v3

    .line 62
    :goto_1
    if-ge v5, v0, :cond_3

    .line 63
    .line 64
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    check-cast v6, LP/u;

    .line 69
    .line 70
    invoke-virtual {v6, v4}, LP/u;->w(LR/h;)V

    .line 71
    .line 72
    .line 73
    iget-object v6, p0, LP/v0;->t:LP5/S;

    .line 74
    .line 75
    invoke-virtual {v6}, LP5/S;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    check-cast v6, LP/p0;

    .line 80
    .line 81
    sget-object v7, LP/p0;->r:LP/p0;

    .line 82
    .line 83
    invoke-virtual {v6, v7}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-lez v6, :cond_3

    .line 88
    .line 89
    add-int/lit8 v5, v5, 0x1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :catchall_0
    move-exception v0

    .line 93
    goto :goto_3

    .line 94
    :cond_3
    iget-object v0, p0, LP/v0;->b:Ljava/lang/Object;

    .line 95
    .line 96
    monitor-enter v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 97
    :try_start_4
    new-instance v1, Lr/H;

    .line 98
    .line 99
    invoke-direct {v1}, Lr/H;-><init>()V

    .line 100
    .line 101
    .line 102
    iput-object v1, p0, LP/v0;->g:Lr/H;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 103
    .line 104
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 105
    iget-object v0, p0, LP/v0;->b:Ljava/lang/Object;

    .line 106
    .line 107
    monitor-enter v0

    .line 108
    :try_start_6
    invoke-virtual {p0}, LP/v0;->u()LM5/f;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    if-nez v1, :cond_6

    .line 113
    .line 114
    iget-object v1, p0, LP/v0;->h:LR/e;

    .line 115
    .line 116
    iget v1, v1, LR/e;->s:I

    .line 117
    .line 118
    if-eqz v1, :cond_4

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_4
    invoke-virtual {p0}, LP/v0;->v()Z

    .line 122
    .line 123
    .line 124
    move-result p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 125
    if-eqz p0, :cond_5

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_5
    move v2, v3

    .line 129
    :goto_2
    monitor-exit v0

    .line 130
    return v2

    .line 131
    :cond_6
    :try_start_7
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 132
    .line 133
    const-string v1, "called outside of runRecomposeAndApplyChanges"

    .line 134
    .line 135
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 139
    :catchall_1
    move-exception p0

    .line 140
    monitor-exit v0

    .line 141
    throw p0

    .line 142
    :catchall_2
    move-exception v1

    .line 143
    :try_start_8
    monitor-exit v0

    .line 144
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 145
    :goto_3
    iget-object v1, p0, LP/v0;->b:Ljava/lang/Object;

    .line 146
    .line 147
    monitor-enter v1

    .line 148
    :try_start_9
    iget-object p0, p0, LP/v0;->g:Lr/H;

    .line 149
    .line 150
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    if-eqz v3, :cond_7

    .line 162
    .line 163
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-virtual {p0, v3}, Lr/H;->j(Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 168
    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_7
    monitor-exit v1

    .line 172
    throw v0

    .line 173
    :catchall_3
    move-exception p0

    .line 174
    monitor-exit v1

    .line 175
    throw p0

    .line 176
    :catchall_4
    move-exception p0

    .line 177
    monitor-exit v0

    .line 178
    throw p0

    .line 179
    :catchall_5
    move-exception p0

    .line 180
    monitor-exit v0

    .line 181
    throw p0
.end method

.method public static s(La0/d;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, La0/d;->w()La0/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, La0/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, La0/d;->c()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string v1, "Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition."

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-virtual {p0}, La0/d;->c()V

    .line 23
    .line 24
    .line 25
    throw v0
.end method

.method public static final y(Ljava/util/ArrayList;LP/v0;LP/u;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p1, LP/v0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    iget-object p1, p1, LP/v0;->j:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    monitor-exit p0

    .line 20
    return-void

    .line 21
    :cond_0
    :try_start_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, LP/V;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    monitor-exit p0

    .line 34
    throw p1
.end method


# virtual methods
.method public final A(Ljava/lang/Throwable;LP/u;)V
    .locals 3

    .line 1
    sget-object v0, LP/v0;->y:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    instance-of v0, p1, LP/j;

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, LP/v0;->b:Ljava/lang/Object;

    .line 20
    .line 21
    monitor-enter v0

    .line 22
    :try_start_0
    const-string v1, "Error was captured in composition while live edit was enabled."

    .line 23
    .line 24
    const-string v2, "ComposeInternal"

    .line 25
    .line 26
    invoke-static {v2, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, LP/v0;->i:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, LP/v0;->h:LR/e;

    .line 35
    .line 36
    invoke-virtual {v1}, LR/e;->i()V

    .line 37
    .line 38
    .line 39
    new-instance v1, Lr/H;

    .line 40
    .line 41
    invoke-direct {v1}, Lr/H;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, LP/v0;->g:Lr/H;

    .line 45
    .line 46
    iget-object v1, p0, LP/v0;->j:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, LP/v0;->k:Lr/G;

    .line 52
    .line 53
    invoke-virtual {v1}, Lr/G;->a()V

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, LP/v0;->m:Lr/G;

    .line 57
    .line 58
    invoke-virtual {v1}, Lr/G;->a()V

    .line 59
    .line 60
    .line 61
    new-instance v1, Lk3/d;

    .line 62
    .line 63
    const/16 v2, 0xe

    .line 64
    .line 65
    invoke-direct {v1, v2, p1}, Lk3/d;-><init>(ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iput-object v1, p0, LP/v0;->r:Lk3/d;

    .line 69
    .line 70
    if-eqz p2, :cond_0

    .line 71
    .line 72
    invoke-virtual {p0, p2}, LP/v0;->B(LP/u;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :catchall_0
    move-exception p1

    .line 77
    goto :goto_1

    .line 78
    :cond_0
    :goto_0
    invoke-virtual {p0}, LP/v0;->u()LM5/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .line 80
    .line 81
    monitor-exit v0

    .line 82
    return-void

    .line 83
    :goto_1
    monitor-exit v0

    .line 84
    throw p1

    .line 85
    :cond_1
    iget-object p2, p0, LP/v0;->b:Ljava/lang/Object;

    .line 86
    .line 87
    monitor-enter p2

    .line 88
    :try_start_1
    iget-object v0, p0, LP/v0;->r:Lk3/d;

    .line 89
    .line 90
    if-nez v0, :cond_2

    .line 91
    .line 92
    new-instance v0, Lk3/d;

    .line 93
    .line 94
    const/16 v1, 0xe

    .line 95
    .line 96
    invoke-direct {v0, v1, p1}, Lk3/d;-><init>(ILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    iput-object v0, p0, LP/v0;->r:Lk3/d;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 100
    .line 101
    monitor-exit p2

    .line 102
    throw p1

    .line 103
    :catchall_1
    move-exception p1

    .line 104
    goto :goto_2

    .line 105
    :cond_2
    :try_start_2
    iget-object p1, v0, Lk3/d;->r:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p1, Ljava/lang/Throwable;

    .line 108
    .line 109
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 110
    :goto_2
    monitor-exit p2

    .line 111
    throw p1
.end method

.method public final B(LP/u;)V
    .locals 2

    .line 1
    iget-object v0, p0, LP/v0;->o:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LP/v0;->o:Ljava/util/ArrayList;

    .line 11
    .line 12
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, LP/v0;->e:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    iput-object p1, p0, LP/v0;->f:Ljava/lang/Object;

    .line 31
    .line 32
    :cond_2
    return-void
.end method

.method public final a(LP/u;LX/e;)V
    .locals 6

    .line 1
    iget-object v0, p1, LP/u;->I:LP/o;

    .line 2
    .line 3
    iget-boolean v0, v0, LP/o;->E:Z

    .line 4
    .line 5
    :try_start_0
    new-instance v1, LB0/a;

    .line 6
    .line 7
    const/16 v2, 0x15

    .line 8
    .line 9
    invoke-direct {v1, v2, p1}, LB0/a;-><init>(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    new-instance v2, LA/Y;

    .line 13
    .line 14
    const/16 v3, 0x13

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    invoke-direct {v2, v3, p1, v4}, LA/Y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-static {}, La0/n;->k()La0/h;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    instance-of v5, v3, La0/d;

    .line 25
    .line 26
    if-eqz v5, :cond_0

    .line 27
    .line 28
    check-cast v3, La0/d;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v3, v4

    .line 32
    :goto_0
    if-eqz v3, :cond_5

    .line 33
    .line 34
    invoke-virtual {v3, v1, v2}, La0/d;->C(LB5/c;LB5/c;)La0/d;

    .line 35
    .line 36
    .line 37
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 38
    if-eqz v1, :cond_5

    .line 39
    .line 40
    :try_start_1
    invoke-virtual {v1}, La0/h;->j()La0/h;

    .line 41
    .line 42
    .line 43
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 44
    :try_start_2
    invoke-virtual {p1, p2}, LP/u;->i(LX/e;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    .line 45
    .line 46
    .line 47
    :try_start_3
    invoke-static {v2}, La0/h;->q(La0/h;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    .line 48
    .line 49
    .line 50
    :try_start_4
    invoke-static {v1}, LP/v0;->s(La0/d;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 51
    .line 52
    .line 53
    if-nez v0, :cond_1

    .line 54
    .line 55
    invoke-static {}, La0/n;->k()La0/h;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-virtual {p2}, La0/h;->m()V

    .line 60
    .line 61
    .line 62
    :cond_1
    iget-object p2, p0, LP/v0;->b:Ljava/lang/Object;

    .line 63
    .line 64
    monitor-enter p2

    .line 65
    :try_start_5
    iget-object v1, p0, LP/v0;->t:LP5/S;

    .line 66
    .line 67
    invoke-virtual {v1}, LP5/S;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, LP/p0;

    .line 72
    .line 73
    sget-object v2, LP/p0;->r:LP/p0;

    .line 74
    .line 75
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-lez v1, :cond_2

    .line 80
    .line 81
    invoke-virtual {p0}, LP/v0;->x()Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-nez v1, :cond_2

    .line 90
    .line 91
    iget-object v1, p0, LP/v0;->e:Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    iput-object v4, p0, LP/v0;->f:Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :catchall_0
    move-exception p1

    .line 100
    goto :goto_2

    .line 101
    :cond_2
    :goto_1
    monitor-exit p2

    .line 102
    :try_start_6
    iget-object p2, p0, LP/v0;->b:Ljava/lang/Object;

    .line 103
    .line 104
    monitor-enter p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 105
    :try_start_7
    iget-object v1, p0, LP/v0;->j:Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 108
    .line 109
    .line 110
    move-result v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 111
    if-gtz v2, :cond_4

    .line 112
    .line 113
    :try_start_8
    monitor-exit p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 114
    :try_start_9
    invoke-virtual {p1}, LP/u;->d()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, LP/u;->f()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 118
    .line 119
    .line 120
    if-nez v0, :cond_3

    .line 121
    .line 122
    invoke-static {}, La0/n;->k()La0/h;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {p1}, La0/h;->m()V

    .line 127
    .line 128
    .line 129
    :cond_3
    return-void

    .line 130
    :catchall_1
    move-exception p1

    .line 131
    invoke-virtual {p0, p1, v4}, LP/v0;->A(Ljava/lang/Throwable;LP/u;)V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_4
    const/4 v0, 0x0

    .line 136
    :try_start_a
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    check-cast v0, LP/V;

    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    const/4 v0, 0x0

    .line 146
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 147
    :catchall_2
    move-exception v0

    .line 148
    :try_start_b
    monitor-exit p2

    .line 149
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 150
    :catchall_3
    move-exception p2

    .line 151
    invoke-virtual {p0, p2, p1}, LP/v0;->A(Ljava/lang/Throwable;LP/u;)V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :goto_2
    monitor-exit p2

    .line 156
    throw p1

    .line 157
    :catchall_4
    move-exception p2

    .line 158
    goto :goto_4

    .line 159
    :catchall_5
    move-exception p2

    .line 160
    goto :goto_3

    .line 161
    :catchall_6
    move-exception p2

    .line 162
    :try_start_c
    invoke-static {v2}, La0/h;->q(La0/h;)V

    .line 163
    .line 164
    .line 165
    throw p2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 166
    :goto_3
    :try_start_d
    invoke-static {v1}, LP/v0;->s(La0/d;)V

    .line 167
    .line 168
    .line 169
    throw p2

    .line 170
    :cond_5
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 171
    .line 172
    const-string v0, "Cannot create a mutable snapshot of an read-only snapshot"

    .line 173
    .line 174
    invoke-direct {p2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw p2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 178
    :goto_4
    invoke-virtual {p0, p2, p1}, LP/v0;->A(Ljava/lang/Throwable;LP/u;)V

    .line 179
    .line 180
    .line 181
    return-void
.end method

.method public final c()Z
    .locals 1

    .line 1
    sget-object v0, LP/v0;->y:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final d()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final e()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final g()I
    .locals 1

    .line 1
    const/16 v0, 0x3e8

    .line 2
    .line 3
    return v0
.end method

.method public final h()Lq5/h;
    .locals 1

    .line 1
    iget-object v0, p0, LP/v0;->v:Lq5/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i(LP/u;)V
    .locals 2

    .line 1
    iget-object v0, p0, LP/v0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LP/v0;->h:LR/e;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, LR/e;->j(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, LP/v0;->h:LR/e;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, LR/e;->c(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, LP/v0;->u()LM5/f;

    .line 18
    .line 19
    .line 20
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    :goto_0
    monitor-exit v0

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 29
    .line 30
    check-cast p1, LM5/h;

    .line 31
    .line 32
    invoke-virtual {p1, v0}, LM5/h;->resumeWith(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void

    .line 36
    :goto_1
    monitor-exit v0

    .line 37
    throw p1
.end method

.method public final j(LP/V;)LP/U;
    .locals 2

    .line 1
    iget-object v0, p0, LP/v0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LP/v0;->m:Lr/G;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Lr/G;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, LP/U;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-object p1

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit v0

    .line 16
    throw p1
.end method

.method public final k(Ljava/util/Set;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final m(LP/u;)V
    .locals 2

    .line 1
    iget-object v0, p0, LP/v0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LP/v0;->p:Ljava/util/LinkedHashSet;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v1, p0, LP/v0;->p:Ljava/util/LinkedHashSet;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    monitor-exit v0

    .line 22
    return-void

    .line 23
    :goto_1
    monitor-exit v0

    .line 24
    throw p1
.end method

.method public final p(LP/u;)V
    .locals 2

    .line 1
    iget-object v0, p0, LP/v0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LP/v0;->e:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput-object v1, p0, LP/v0;->f:Ljava/lang/Object;

    .line 14
    .line 15
    :cond_0
    iget-object v1, p0, LP/v0;->h:LR/e;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, LR/e;->l(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, LP/v0;->i:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    monitor-exit v0

    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    monitor-exit v0

    .line 29
    throw p1
.end method

.method public final t()V
    .locals 4

    .line 1
    iget-object v0, p0, LP/v0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LP/v0;->t:LP5/S;

    .line 5
    .line 6
    invoke-virtual {v1}, LP5/S;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, LP/p0;

    .line 11
    .line 12
    sget-object v2, LP/p0;->u:LP/p0;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    if-ltz v1, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, LP/v0;->t:LP5/S;

    .line 22
    .line 23
    sget-object v3, LP/p0;->r:LP/p0;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2, v3}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v1

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    monitor-exit v0

    .line 35
    iget-object v0, p0, LP/v0;->u:LM5/d0;

    .line 36
    .line 37
    invoke-virtual {v0, v2}, LM5/i0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :goto_1
    monitor-exit v0

    .line 42
    throw v1
.end method

.method public final u()LM5/f;
    .locals 8

    .line 1
    iget-object v0, p0, LP/v0;->t:LP5/S;

    .line 2
    .line 3
    invoke-virtual {v0}, LP5/S;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, LP/p0;

    .line 8
    .line 9
    sget-object v2, LP/p0;->r:LP/p0;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget-object v2, p0, LP/v0;->j:Ljava/util/ArrayList;

    .line 16
    .line 17
    iget-object v3, p0, LP/v0;->i:Ljava/util/ArrayList;

    .line 18
    .line 19
    iget-object v4, p0, LP/v0;->h:LR/e;

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    if-gtz v1, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, LP/v0;->e:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 27
    .line 28
    .line 29
    sget-object v0, Ln5/s;->q:Ln5/s;

    .line 30
    .line 31
    iput-object v0, p0, LP/v0;->f:Ljava/lang/Object;

    .line 32
    .line 33
    new-instance v0, Lr/H;

    .line 34
    .line 35
    invoke-direct {v0}, Lr/H;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, LP/v0;->g:Lr/H;

    .line 39
    .line 40
    invoke-virtual {v4}, LR/e;->i()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 47
    .line 48
    .line 49
    iput-object v5, p0, LP/v0;->o:Ljava/util/ArrayList;

    .line 50
    .line 51
    iget-object v0, p0, LP/v0;->q:LM5/h;

    .line 52
    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    invoke-virtual {v0, v5}, LM5/h;->g(Ljava/lang/Throwable;)Z

    .line 56
    .line 57
    .line 58
    :cond_0
    iput-object v5, p0, LP/v0;->q:LM5/h;

    .line 59
    .line 60
    iput-object v5, p0, LP/v0;->r:Lk3/d;

    .line 61
    .line 62
    return-object v5

    .line 63
    :cond_1
    iget-object v1, p0, LP/v0;->r:Lk3/d;

    .line 64
    .line 65
    sget-object v6, LP/p0;->v:LP/p0;

    .line 66
    .line 67
    sget-object v7, LP/p0;->s:LP/p0;

    .line 68
    .line 69
    if-eqz v1, :cond_2

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    iget-object v1, p0, LP/v0;->c:LM5/b0;

    .line 73
    .line 74
    if-nez v1, :cond_3

    .line 75
    .line 76
    new-instance v1, Lr/H;

    .line 77
    .line 78
    invoke-direct {v1}, Lr/H;-><init>()V

    .line 79
    .line 80
    .line 81
    iput-object v1, p0, LP/v0;->g:Lr/H;

    .line 82
    .line 83
    invoke-virtual {v4}, LR/e;->i()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, LP/v0;->v()Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_7

    .line 91
    .line 92
    sget-object v7, LP/p0;->t:LP/p0;

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    iget v1, v4, LR/e;->s:I

    .line 96
    .line 97
    if-eqz v1, :cond_4

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_4
    iget-object v1, p0, LP/v0;->g:Lr/H;

    .line 101
    .line 102
    invoke-virtual {v1}, Lr/H;->h()Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-nez v1, :cond_6

    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-eqz v1, :cond_6

    .line 113
    .line 114
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-eqz v1, :cond_6

    .line 119
    .line 120
    invoke-virtual {p0}, LP/v0;->v()Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_5

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_5
    sget-object v7, LP/p0;->u:LP/p0;

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_6
    :goto_0
    move-object v7, v6

    .line 131
    :cond_7
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v5, v7}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    if-ne v7, v6, :cond_8

    .line 138
    .line 139
    iget-object v0, p0, LP/v0;->q:LM5/h;

    .line 140
    .line 141
    iput-object v5, p0, LP/v0;->q:LM5/h;

    .line 142
    .line 143
    return-object v0

    .line 144
    :cond_8
    return-object v5
.end method

.method public final v()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LP/v0;->s:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LP/v0;->a:LP/e;

    .line 6
    .line 7
    iget-object v0, v0, LP/e;->v:LX/a;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public final w()Z
    .locals 2

    .line 1
    iget-object v0, p0, LP/v0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LP/v0;->g:Lr/H;

    .line 5
    .line 6
    invoke-virtual {v1}, Lr/H;->h()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    iget-object v1, p0, LP/v0;->h:LR/e;

    .line 13
    .line 14
    iget v1, v1, LR/e;->s:I

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, LP/v0;->v()Z

    .line 20
    .line 21
    .line 22
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 v1, 0x0

    .line 27
    goto :goto_1

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    goto :goto_2

    .line 30
    :cond_2
    :goto_0
    const/4 v1, 0x1

    .line 31
    :goto_1
    monitor-exit v0

    .line 32
    return v1

    .line 33
    :goto_2
    monitor-exit v0

    .line 34
    throw v1
.end method

.method public final x()Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, LP/v0;->f:Ljava/lang/Object;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, LP/v0;->e:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    sget-object v0, Ln5/s;->q:Ln5/s;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 19
    .line 20
    .line 21
    move-object v0, v1

    .line 22
    :goto_0
    iput-object v0, p0, LP/v0;->f:Ljava/lang/Object;

    .line 23
    .line 24
    :cond_1
    return-object v0
.end method

.method public final z(Ljava/util/List;Lr/H;)Ljava/util/List;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    new-instance v2, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(I)V

    .line 12
    .line 13
    .line 14
    move-object v3, v0

    .line 15
    check-cast v3, Ljava/util/Collection;

    .line 16
    .line 17
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/4 v5, 0x0

    .line 22
    :goto_0
    if-ge v5, v3, :cond_1

    .line 23
    .line 24
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    move-object v7, v6

    .line 29
    check-cast v7, LP/V;

    .line 30
    .line 31
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const/4 v7, 0x0

    .line 35
    invoke-virtual {v2, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    if-nez v8, :cond_0

    .line 40
    .line 41
    new-instance v8, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    :cond_0
    check-cast v8, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    add-int/lit8 v5, v5, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_11

    .line 70
    .line 71
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    check-cast v3, Ljava/util/Map$Entry;

    .line 76
    .line 77
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    check-cast v5, LP/u;

    .line 82
    .line 83
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    check-cast v3, Ljava/util/List;

    .line 88
    .line 89
    iget-object v6, v5, LP/u;->I:LP/o;

    .line 90
    .line 91
    iget-boolean v6, v6, LP/o;->E:Z

    .line 92
    .line 93
    if-eqz v6, :cond_2

    .line 94
    .line 95
    const-string v6, "Check failed"

    .line 96
    .line 97
    invoke-static {v6}, LP/p;->c(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    :cond_2
    new-instance v6, LB0/a;

    .line 101
    .line 102
    const/16 v7, 0x15

    .line 103
    .line 104
    invoke-direct {v6, v7, v5}, LB0/a;-><init>(ILjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    new-instance v7, LA/Y;

    .line 108
    .line 109
    const/16 v8, 0x13

    .line 110
    .line 111
    move-object/from16 v9, p2

    .line 112
    .line 113
    invoke-direct {v7, v8, v5, v9}, LA/Y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    invoke-static {}, La0/n;->k()La0/h;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    instance-of v10, v8, La0/d;

    .line 121
    .line 122
    const/4 v11, 0x0

    .line 123
    if-eqz v10, :cond_3

    .line 124
    .line 125
    check-cast v8, La0/d;

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_3
    move-object v8, v11

    .line 129
    :goto_2
    if-eqz v8, :cond_10

    .line 130
    .line 131
    invoke-virtual {v8, v6, v7}, La0/d;->C(LB5/c;LB5/c;)La0/d;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    if-eqz v6, :cond_10

    .line 136
    .line 137
    :try_start_0
    invoke-virtual {v6}, La0/h;->j()La0/h;

    .line 138
    .line 139
    .line 140
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 141
    :try_start_1
    iget-object v8, v1, LP/v0;->b:Ljava/lang/Object;

    .line 142
    .line 143
    monitor-enter v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 144
    :try_start_2
    new-instance v10, Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 147
    .line 148
    .line 149
    move-result v12

    .line 150
    invoke-direct {v10, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 151
    .line 152
    .line 153
    move-object v12, v3

    .line 154
    check-cast v12, Ljava/util/Collection;

    .line 155
    .line 156
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 157
    .line 158
    .line 159
    move-result v12

    .line 160
    const/4 v13, 0x0

    .line 161
    :goto_3
    if-ge v13, v12, :cond_4

    .line 162
    .line 163
    invoke-interface {v3, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v14

    .line 167
    check-cast v14, LP/V;

    .line 168
    .line 169
    iget-object v15, v1, LP/v0;->k:Lr/G;

    .line 170
    .line 171
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-static {v15}, LR/a;->a(Lr/G;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v15

    .line 178
    move-object/from16 v16, v15

    .line 179
    .line 180
    check-cast v16, LP/V;

    .line 181
    .line 182
    new-instance v4, Lm5/j;

    .line 183
    .line 184
    invoke-direct {v4, v14, v15}, Lm5/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    add-int/lit8 v13, v13, 0x1

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :catchall_0
    move-exception v0

    .line 194
    goto/16 :goto_d

    .line 195
    .line 196
    :cond_4
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    const/4 v4, 0x0

    .line 201
    :goto_4
    if-ge v4, v3, :cond_8

    .line 202
    .line 203
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v12

    .line 207
    check-cast v12, Lm5/j;

    .line 208
    .line 209
    iget-object v13, v12, Lm5/j;->r:Ljava/lang/Object;

    .line 210
    .line 211
    if-nez v13, :cond_7

    .line 212
    .line 213
    iget-object v13, v1, LP/v0;->l:LB0/o;

    .line 214
    .line 215
    iget-object v12, v12, Lm5/j;->q:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v12, LP/V;

    .line 218
    .line 219
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    iget-object v12, v13, LB0/o;->q:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v12, Lr/G;

    .line 225
    .line 226
    invoke-virtual {v12, v11}, Lr/G;->b(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v12

    .line 230
    if-eqz v12, :cond_7

    .line 231
    .line 232
    new-instance v3, Ljava/util/ArrayList;

    .line 233
    .line 234
    const/16 v4, 0xa

    .line 235
    .line 236
    invoke-static {v10, v4}, Ln5/m;->c0(Ljava/lang/Iterable;I)I

    .line 237
    .line 238
    .line 239
    move-result v4

    .line 240
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 244
    .line 245
    .line 246
    move-result v4

    .line 247
    const/4 v11, 0x0

    .line 248
    :goto_5
    if-ge v11, v4, :cond_6

    .line 249
    .line 250
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v12

    .line 254
    add-int/lit8 v11, v11, 0x1

    .line 255
    .line 256
    check-cast v12, Lm5/j;

    .line 257
    .line 258
    iget-object v13, v12, Lm5/j;->r:Ljava/lang/Object;

    .line 259
    .line 260
    if-nez v13, :cond_5

    .line 261
    .line 262
    iget-object v13, v1, LP/v0;->l:LB0/o;

    .line 263
    .line 264
    iget-object v14, v12, Lm5/j;->q:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast v14, LP/V;

    .line 267
    .line 268
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    iget-object v14, v13, LB0/o;->q:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v14, Lr/G;

    .line 274
    .line 275
    invoke-static {v14}, LR/a;->a(Lr/G;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v15

    .line 279
    check-cast v15, LP/X;

    .line 280
    .line 281
    invoke-virtual {v14}, Lr/G;->i()Z

    .line 282
    .line 283
    .line 284
    move-result v14

    .line 285
    if-eqz v14, :cond_5

    .line 286
    .line 287
    iget-object v13, v13, LB0/o;->r:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v13, Lr/G;

    .line 290
    .line 291
    invoke-virtual {v13}, Lr/G;->a()V

    .line 292
    .line 293
    .line 294
    :cond_5
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 295
    .line 296
    .line 297
    goto :goto_5

    .line 298
    :cond_6
    move-object v10, v3

    .line 299
    goto :goto_6

    .line 300
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 301
    .line 302
    goto :goto_4

    .line 303
    :cond_8
    :goto_6
    :try_start_3
    monitor-exit v8

    .line 304
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 305
    .line 306
    .line 307
    move-result v3

    .line 308
    const/4 v4, 0x0

    .line 309
    :goto_7
    if-ge v4, v3, :cond_f

    .line 310
    .line 311
    invoke-interface {v10, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v8

    .line 315
    check-cast v8, Lm5/j;

    .line 316
    .line 317
    iget-object v8, v8, Lm5/j;->r:Ljava/lang/Object;

    .line 318
    .line 319
    if-nez v8, :cond_9

    .line 320
    .line 321
    add-int/lit8 v4, v4, 0x1

    .line 322
    .line 323
    goto :goto_7

    .line 324
    :cond_9
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    const/4 v4, 0x0

    .line 329
    :goto_8
    if-ge v4, v3, :cond_f

    .line 330
    .line 331
    invoke-interface {v10, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v8

    .line 335
    check-cast v8, Lm5/j;

    .line 336
    .line 337
    iget-object v8, v8, Lm5/j;->r:Ljava/lang/Object;

    .line 338
    .line 339
    if-eqz v8, :cond_a

    .line 340
    .line 341
    add-int/lit8 v4, v4, 0x1

    .line 342
    .line 343
    goto :goto_8

    .line 344
    :cond_a
    new-instance v3, Ljava/util/ArrayList;

    .line 345
    .line 346
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 347
    .line 348
    .line 349
    move-result v4

    .line 350
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 351
    .line 352
    .line 353
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 354
    .line 355
    .line 356
    move-result v4

    .line 357
    const/4 v8, 0x0

    .line 358
    :goto_9
    if-ge v8, v4, :cond_c

    .line 359
    .line 360
    invoke-interface {v10, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v11

    .line 364
    check-cast v11, Lm5/j;

    .line 365
    .line 366
    iget-object v12, v11, Lm5/j;->r:Ljava/lang/Object;

    .line 367
    .line 368
    if-nez v12, :cond_b

    .line 369
    .line 370
    iget-object v11, v11, Lm5/j;->q:Ljava/lang/Object;

    .line 371
    .line 372
    check-cast v11, LP/V;

    .line 373
    .line 374
    goto :goto_a

    .line 375
    :catchall_1
    move-exception v0

    .line 376
    goto :goto_e

    .line 377
    :cond_b
    :goto_a
    add-int/lit8 v8, v8, 0x1

    .line 378
    .line 379
    goto :goto_9

    .line 380
    :cond_c
    iget-object v4, v1, LP/v0;->b:Ljava/lang/Object;

    .line 381
    .line 382
    monitor-enter v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 383
    :try_start_4
    iget-object v8, v1, LP/v0;->j:Ljava/util/ArrayList;

    .line 384
    .line 385
    invoke-static {v8, v3}, Ln5/q;->e0(Ljava/util/Collection;Ljava/lang/Iterable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 386
    .line 387
    .line 388
    :try_start_5
    monitor-exit v4

    .line 389
    new-instance v3, Ljava/util/ArrayList;

    .line 390
    .line 391
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 392
    .line 393
    .line 394
    move-result v4

    .line 395
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 396
    .line 397
    .line 398
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 399
    .line 400
    .line 401
    move-result v4

    .line 402
    const/4 v8, 0x0

    .line 403
    :goto_b
    if-ge v8, v4, :cond_e

    .line 404
    .line 405
    invoke-interface {v10, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v11

    .line 409
    move-object v12, v11

    .line 410
    check-cast v12, Lm5/j;

    .line 411
    .line 412
    iget-object v12, v12, Lm5/j;->r:Ljava/lang/Object;

    .line 413
    .line 414
    if-eqz v12, :cond_d

    .line 415
    .line 416
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    :cond_d
    add-int/lit8 v8, v8, 0x1

    .line 420
    .line 421
    goto :goto_b

    .line 422
    :cond_e
    move-object v10, v3

    .line 423
    goto :goto_c

    .line 424
    :catchall_2
    move-exception v0

    .line 425
    monitor-exit v4

    .line 426
    throw v0

    .line 427
    :cond_f
    :goto_c
    invoke-virtual {v5, v10}, LP/u;->p(Ljava/util/ArrayList;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 428
    .line 429
    .line 430
    :try_start_6
    invoke-static {v7}, La0/h;->q(La0/h;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 431
    .line 432
    .line 433
    invoke-static {v6}, LP/v0;->s(La0/d;)V

    .line 434
    .line 435
    .line 436
    goto/16 :goto_1

    .line 437
    .line 438
    :catchall_3
    move-exception v0

    .line 439
    goto :goto_f

    .line 440
    :goto_d
    :try_start_7
    monitor-exit v8

    .line 441
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 442
    :goto_e
    :try_start_8
    invoke-static {v7}, La0/h;->q(La0/h;)V

    .line 443
    .line 444
    .line 445
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 446
    :goto_f
    invoke-static {v6}, LP/v0;->s(La0/d;)V

    .line 447
    .line 448
    .line 449
    throw v0

    .line 450
    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 451
    .line 452
    const-string v2, "Cannot create a mutable snapshot of an read-only snapshot"

    .line 453
    .line 454
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    throw v0

    .line 458
    :cond_11
    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    check-cast v0, Ljava/lang/Iterable;

    .line 463
    .line 464
    invoke-static {v0}, Ln5/l;->B0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    return-object v0
.end method
