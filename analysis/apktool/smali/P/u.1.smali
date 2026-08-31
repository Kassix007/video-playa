.class public final LP/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP/q;


# instance fields
.field public final A:LQ/a;

.field public final B:LQ/a;

.field public final C:Lr/G;

.field public D:Lr/G;

.field public E:Z

.field public F:LP/u;

.field public G:I

.field public final H:LP/S;

.field public final I:LP/o;

.field public J:Z

.field public final q:LP/r;

.field public final r:LB0/G0;

.field public final s:Ljava/util/concurrent/atomic/AtomicReference;

.field public final t:Ljava/lang/Object;

.field public final u:Lr/J;

.field public final v:LP/A0;

.field public final w:Lr/G;

.field public final x:Lr/H;

.field public final y:Lr/H;

.field public final z:Lr/G;


# direct methods
.method public constructor <init>(LP/r;LB0/G0;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LP/u;->q:LP/r;

    .line 5
    .line 6
    iput-object p2, p0, LP/u;->r:LB0/G0;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, LP/u;->s:Ljava/util/concurrent/atomic/AtomicReference;

    .line 15
    .line 16
    new-instance v0, Ljava/lang/Object;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, LP/u;->t:Ljava/lang/Object;

    .line 22
    .line 23
    new-instance v0, Lr/H;

    .line 24
    .line 25
    invoke-direct {v0}, Lr/H;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance v5, Lr/J;

    .line 29
    .line 30
    invoke-direct {v5, v0}, Lr/J;-><init>(Lr/H;)V

    .line 31
    .line 32
    .line 33
    iput-object v5, p0, LP/u;->u:Lr/J;

    .line 34
    .line 35
    new-instance v4, LP/A0;

    .line 36
    .line 37
    invoke-direct {v4}, LP/A0;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, LP/r;->c()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    new-instance v0, Lr/v;

    .line 47
    .line 48
    invoke-direct {v0}, Lr/v;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v0, v4, LP/A0;->A:Lr/v;

    .line 52
    .line 53
    :cond_0
    invoke-virtual {p1}, LP/r;->e()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    invoke-virtual {v4}, LP/A0;->g()V

    .line 60
    .line 61
    .line 62
    :cond_1
    iput-object v4, p0, LP/u;->v:LP/A0;

    .line 63
    .line 64
    invoke-static {}, La/a;->q()Lr/G;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, LP/u;->w:Lr/G;

    .line 69
    .line 70
    new-instance v0, Lr/H;

    .line 71
    .line 72
    invoke-direct {v0}, Lr/H;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, LP/u;->x:Lr/H;

    .line 76
    .line 77
    new-instance v0, Lr/H;

    .line 78
    .line 79
    invoke-direct {v0}, Lr/H;-><init>()V

    .line 80
    .line 81
    .line 82
    iput-object v0, p0, LP/u;->y:Lr/H;

    .line 83
    .line 84
    invoke-static {}, La/a;->q()Lr/G;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iput-object v0, p0, LP/u;->z:Lr/G;

    .line 89
    .line 90
    new-instance v6, LQ/a;

    .line 91
    .line 92
    invoke-direct {v6}, LQ/a;-><init>()V

    .line 93
    .line 94
    .line 95
    iput-object v6, p0, LP/u;->A:LQ/a;

    .line 96
    .line 97
    new-instance v7, LQ/a;

    .line 98
    .line 99
    invoke-direct {v7}, LQ/a;-><init>()V

    .line 100
    .line 101
    .line 102
    iput-object v7, p0, LP/u;->B:LQ/a;

    .line 103
    .line 104
    invoke-static {}, La/a;->q()Lr/G;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iput-object v0, p0, LP/u;->C:Lr/G;

    .line 109
    .line 110
    invoke-static {}, La/a;->q()Lr/G;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    iput-object v0, p0, LP/u;->D:Lr/G;

    .line 115
    .line 116
    new-instance v0, LP/S;

    .line 117
    .line 118
    const/4 v1, 0x7

    .line 119
    invoke-direct {v0, v1}, LP/S;-><init>(I)V

    .line 120
    .line 121
    .line 122
    iput-object v0, p0, LP/u;->H:LP/S;

    .line 123
    .line 124
    new-instance v1, LP/o;

    .line 125
    .line 126
    move-object v8, p0

    .line 127
    move-object v3, p1

    .line 128
    move-object v2, p2

    .line 129
    invoke-direct/range {v1 .. v8}, LP/o;-><init>(LB0/G0;LP/r;LP/A0;Lr/J;LQ/a;LQ/a;LP/u;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v3, v1}, LP/r;->l(LP/o;)V

    .line 133
    .line 134
    .line 135
    iput-object v1, v8, LP/u;->I:LP/o;

    .line 136
    .line 137
    sget-object p1, LP/h;->a:LX/e;

    .line 138
    .line 139
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, LP/u;->s:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LP/u;->A:LQ/a;

    .line 8
    .line 9
    iget-object v0, v0, LQ/a;->o:LQ/K;

    .line 10
    .line 11
    invoke-virtual {v0}, LQ/K;->S()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, LP/u;->B:LQ/a;

    .line 15
    .line 16
    iget-object v0, v0, LQ/a;->o:LQ/K;

    .line 17
    .line 18
    invoke-virtual {v0}, LQ/K;->S()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, LP/u;->u:Lr/J;

    .line 22
    .line 23
    iget-object v1, v0, Lr/J;->q:Lr/H;

    .line 24
    .line 25
    invoke-virtual {v1}, Lr/H;->g()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    new-instance v1, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    iget-object v1, v0, Lr/J;->q:Lr/H;

    .line 37
    .line 38
    invoke-virtual {v1}, Lr/H;->g()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_1

    .line 43
    .line 44
    const-string v1, "Compose:abandons"

    .line 45
    .line 46
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :try_start_0
    new-instance v1, LI5/h;

    .line 50
    .line 51
    invoke-direct {v1, v0}, LI5/h;-><init>(Lr/J;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, v1, LI5/h;->r:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, LI5/j;

    .line 57
    .line 58
    :goto_0
    invoke-virtual {v0}, LI5/j;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_0

    .line 63
    .line 64
    invoke-virtual {v0}, LI5/j;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    check-cast v2, LP/w0;

    .line 69
    .line 70
    invoke-virtual {v1}, LI5/h;->remove()V

    .line 71
    .line 72
    .line 73
    invoke-interface {v2}, LP/w0;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :catchall_0
    move-exception v0

    .line 78
    goto :goto_1

    .line 79
    :cond_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 84
    .line 85
    .line 86
    throw v0

    .line 87
    :cond_1
    return-void
.end method

.method public final b(Ljava/lang/Object;Z)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, LP/u;->w:Lr/G;

    .line 6
    .line 7
    invoke-virtual {v2, v1}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_7

    .line 12
    .line 13
    instance-of v3, v2, Lr/H;

    .line 14
    .line 15
    sget-object v4, LP/M;->q:LP/M;

    .line 16
    .line 17
    iget-object v5, v0, LP/u;->x:Lr/H;

    .line 18
    .line 19
    iget-object v6, v0, LP/u;->y:Lr/H;

    .line 20
    .line 21
    iget-object v7, v0, LP/u;->C:Lr/G;

    .line 22
    .line 23
    if-eqz v3, :cond_5

    .line 24
    .line 25
    check-cast v2, Lr/H;

    .line 26
    .line 27
    iget-object v3, v2, Lr/H;->b:[Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v2, v2, Lr/H;->a:[J

    .line 30
    .line 31
    array-length v8, v2

    .line 32
    add-int/lit8 v8, v8, -0x2

    .line 33
    .line 34
    if-ltz v8, :cond_7

    .line 35
    .line 36
    const/4 v10, 0x0

    .line 37
    :goto_0
    aget-wide v11, v2, v10

    .line 38
    .line 39
    not-long v13, v11

    .line 40
    const/4 v15, 0x7

    .line 41
    shl-long/2addr v13, v15

    .line 42
    and-long/2addr v13, v11

    .line 43
    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    and-long/2addr v13, v15

    .line 49
    cmp-long v13, v13, v15

    .line 50
    .line 51
    if-eqz v13, :cond_4

    .line 52
    .line 53
    sub-int v13, v10, v8

    .line 54
    .line 55
    not-int v13, v13

    .line 56
    ushr-int/lit8 v13, v13, 0x1f

    .line 57
    .line 58
    const/16 v14, 0x8

    .line 59
    .line 60
    rsub-int/lit8 v13, v13, 0x8

    .line 61
    .line 62
    const/4 v15, 0x0

    .line 63
    :goto_1
    if-ge v15, v13, :cond_3

    .line 64
    .line 65
    const-wide/16 v16, 0xff

    .line 66
    .line 67
    and-long v16, v11, v16

    .line 68
    .line 69
    const-wide/16 v18, 0x80

    .line 70
    .line 71
    cmp-long v16, v16, v18

    .line 72
    .line 73
    if-gez v16, :cond_1

    .line 74
    .line 75
    shl-int/lit8 v16, v10, 0x3

    .line 76
    .line 77
    add-int v16, v16, v15

    .line 78
    .line 79
    aget-object v16, v3, v16

    .line 80
    .line 81
    move-object/from16 v9, v16

    .line 82
    .line 83
    check-cast v9, LP/o0;

    .line 84
    .line 85
    invoke-static {v7, v1, v9}, La/a;->K(Lr/G;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v16

    .line 89
    if-nez v16, :cond_1

    .line 90
    .line 91
    move/from16 v16, v14

    .line 92
    .line 93
    invoke-virtual {v9, v1}, LP/o0;->c(Ljava/lang/Object;)LP/M;

    .line 94
    .line 95
    .line 96
    move-result-object v14

    .line 97
    if-eq v14, v4, :cond_2

    .line 98
    .line 99
    iget-object v14, v9, LP/o0;->g:Lr/G;

    .line 100
    .line 101
    if-eqz v14, :cond_0

    .line 102
    .line 103
    if-nez p2, :cond_0

    .line 104
    .line 105
    invoke-virtual {v6, v9}, Lr/H;->a(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_0
    invoke-virtual {v5, v9}, Lr/H;->a(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_1
    move/from16 v16, v14

    .line 114
    .line 115
    :cond_2
    :goto_2
    shr-long v11, v11, v16

    .line 116
    .line 117
    add-int/lit8 v15, v15, 0x1

    .line 118
    .line 119
    move/from16 v14, v16

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_3
    move v9, v14

    .line 123
    if-ne v13, v9, :cond_7

    .line 124
    .line 125
    :cond_4
    if-eq v10, v8, :cond_7

    .line 126
    .line 127
    add-int/lit8 v10, v10, 0x1

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_5
    check-cast v2, LP/o0;

    .line 131
    .line 132
    invoke-static {v7, v1, v2}, La/a;->K(Lr/G;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-nez v3, :cond_7

    .line 137
    .line 138
    invoke-virtual {v2, v1}, LP/o0;->c(Ljava/lang/Object;)LP/M;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    if-eq v1, v4, :cond_7

    .line 143
    .line 144
    iget-object v1, v2, LP/o0;->g:Lr/G;

    .line 145
    .line 146
    if-eqz v1, :cond_6

    .line 147
    .line 148
    if-nez p2, :cond_6

    .line 149
    .line 150
    invoke-virtual {v6, v2}, Lr/H;->a(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_6
    invoke-virtual {v5, v2}, Lr/H;->a(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    :cond_7
    return-void
.end method

.method public final c(Ljava/util/Set;Z)V
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    instance-of v3, v1, LR/h;

    .line 8
    .line 9
    iget-object v4, v0, LP/u;->z:Lr/G;

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/16 v14, 0x8

    .line 13
    .line 14
    if-eqz v3, :cond_b

    .line 15
    .line 16
    check-cast v1, LR/h;

    .line 17
    .line 18
    iget-object v1, v1, LR/h;->q:Lr/H;

    .line 19
    .line 20
    iget-object v3, v1, Lr/H;->b:[Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v1, v1, Lr/H;->a:[J

    .line 23
    .line 24
    array-length v15, v1

    .line 25
    add-int/lit8 v15, v15, -0x2

    .line 26
    .line 27
    if-ltz v15, :cond_a

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    const-wide/16 v16, 0x80

    .line 31
    .line 32
    const-wide/16 v18, 0xff

    .line 33
    .line 34
    :goto_0
    aget-wide v8, v1, v6

    .line 35
    .line 36
    const/4 v7, 0x7

    .line 37
    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    not-long v10, v8

    .line 43
    shl-long/2addr v10, v7

    .line 44
    and-long/2addr v10, v8

    .line 45
    and-long v10, v10, v20

    .line 46
    .line 47
    cmp-long v10, v10, v20

    .line 48
    .line 49
    if-eqz v10, :cond_9

    .line 50
    .line 51
    sub-int v10, v6, v15

    .line 52
    .line 53
    not-int v10, v10

    .line 54
    ushr-int/lit8 v10, v10, 0x1f

    .line 55
    .line 56
    rsub-int/lit8 v10, v10, 0x8

    .line 57
    .line 58
    const/4 v11, 0x0

    .line 59
    :goto_1
    if-ge v11, v10, :cond_8

    .line 60
    .line 61
    and-long v22, v8, v18

    .line 62
    .line 63
    cmp-long v12, v22, v16

    .line 64
    .line 65
    if-gez v12, :cond_7

    .line 66
    .line 67
    shl-int/lit8 v12, v6, 0x3

    .line 68
    .line 69
    add-int/2addr v12, v11

    .line 70
    aget-object v12, v3, v12

    .line 71
    .line 72
    move/from16 v22, v7

    .line 73
    .line 74
    instance-of v7, v12, LP/o0;

    .line 75
    .line 76
    if-eqz v7, :cond_1

    .line 77
    .line 78
    check-cast v12, LP/o0;

    .line 79
    .line 80
    invoke-virtual {v12, v5}, LP/o0;->c(Ljava/lang/Object;)LP/M;

    .line 81
    .line 82
    .line 83
    :cond_0
    move-object/from16 v29, v1

    .line 84
    .line 85
    move-wide/from16 v26, v8

    .line 86
    .line 87
    move/from16 p1, v15

    .line 88
    .line 89
    goto/16 :goto_6

    .line 90
    .line 91
    :cond_1
    invoke-virtual {v0, v12, v2}, LP/u;->b(Ljava/lang/Object;Z)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, v12}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    if-eqz v7, :cond_0

    .line 99
    .line 100
    instance-of v12, v7, Lr/H;

    .line 101
    .line 102
    if-eqz v12, :cond_5

    .line 103
    .line 104
    check-cast v7, Lr/H;

    .line 105
    .line 106
    iget-object v12, v7, Lr/H;->b:[Ljava/lang/Object;

    .line 107
    .line 108
    iget-object v7, v7, Lr/H;->a:[J

    .line 109
    .line 110
    array-length v13, v7

    .line 111
    add-int/lit8 v13, v13, -0x2

    .line 112
    .line 113
    if-ltz v13, :cond_0

    .line 114
    .line 115
    move/from16 v25, v14

    .line 116
    .line 117
    move/from16 p1, v15

    .line 118
    .line 119
    const/4 v5, 0x0

    .line 120
    :goto_2
    aget-wide v14, v7, v5

    .line 121
    .line 122
    move-wide/from16 v26, v8

    .line 123
    .line 124
    move-object v9, v7

    .line 125
    not-long v7, v14

    .line 126
    shl-long v7, v7, v22

    .line 127
    .line 128
    and-long/2addr v7, v14

    .line 129
    and-long v7, v7, v20

    .line 130
    .line 131
    cmp-long v7, v7, v20

    .line 132
    .line 133
    if-eqz v7, :cond_4

    .line 134
    .line 135
    sub-int v7, v5, v13

    .line 136
    .line 137
    not-int v7, v7

    .line 138
    ushr-int/lit8 v7, v7, 0x1f

    .line 139
    .line 140
    rsub-int/lit8 v7, v7, 0x8

    .line 141
    .line 142
    const/4 v8, 0x0

    .line 143
    :goto_3
    if-ge v8, v7, :cond_3

    .line 144
    .line 145
    and-long v28, v14, v18

    .line 146
    .line 147
    cmp-long v28, v28, v16

    .line 148
    .line 149
    if-gez v28, :cond_2

    .line 150
    .line 151
    shl-int/lit8 v28, v5, 0x3

    .line 152
    .line 153
    add-int v28, v28, v8

    .line 154
    .line 155
    aget-object v28, v12, v28

    .line 156
    .line 157
    move-object/from16 v29, v1

    .line 158
    .line 159
    move-object/from16 v1, v28

    .line 160
    .line 161
    check-cast v1, LP/C;

    .line 162
    .line 163
    invoke-virtual {v0, v1, v2}, LP/u;->b(Ljava/lang/Object;Z)V

    .line 164
    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_2
    move-object/from16 v29, v1

    .line 168
    .line 169
    :goto_4
    shr-long v14, v14, v25

    .line 170
    .line 171
    add-int/lit8 v8, v8, 0x1

    .line 172
    .line 173
    move-object/from16 v1, v29

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_3
    move-object/from16 v29, v1

    .line 177
    .line 178
    move/from16 v1, v25

    .line 179
    .line 180
    if-ne v7, v1, :cond_6

    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_4
    move-object/from16 v29, v1

    .line 184
    .line 185
    :goto_5
    if-eq v5, v13, :cond_6

    .line 186
    .line 187
    add-int/lit8 v5, v5, 0x1

    .line 188
    .line 189
    move-object v7, v9

    .line 190
    move-wide/from16 v8, v26

    .line 191
    .line 192
    move-object/from16 v1, v29

    .line 193
    .line 194
    const/16 v25, 0x8

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_5
    move-object/from16 v29, v1

    .line 198
    .line 199
    move-wide/from16 v26, v8

    .line 200
    .line 201
    move/from16 p1, v15

    .line 202
    .line 203
    check-cast v7, LP/C;

    .line 204
    .line 205
    invoke-virtual {v0, v7, v2}, LP/u;->b(Ljava/lang/Object;Z)V

    .line 206
    .line 207
    .line 208
    :cond_6
    :goto_6
    const/16 v1, 0x8

    .line 209
    .line 210
    goto :goto_7

    .line 211
    :cond_7
    move-object/from16 v29, v1

    .line 212
    .line 213
    move/from16 v22, v7

    .line 214
    .line 215
    move-wide/from16 v26, v8

    .line 216
    .line 217
    move/from16 p1, v15

    .line 218
    .line 219
    move v1, v14

    .line 220
    :goto_7
    shr-long v8, v26, v1

    .line 221
    .line 222
    add-int/lit8 v11, v11, 0x1

    .line 223
    .line 224
    move/from16 v15, p1

    .line 225
    .line 226
    move v14, v1

    .line 227
    move/from16 v7, v22

    .line 228
    .line 229
    move-object/from16 v1, v29

    .line 230
    .line 231
    const/4 v5, 0x0

    .line 232
    goto/16 :goto_1

    .line 233
    .line 234
    :cond_8
    move-object/from16 v29, v1

    .line 235
    .line 236
    move/from16 v22, v7

    .line 237
    .line 238
    move v1, v14

    .line 239
    move/from16 p1, v15

    .line 240
    .line 241
    if-ne v10, v1, :cond_12

    .line 242
    .line 243
    move/from16 v15, p1

    .line 244
    .line 245
    goto :goto_8

    .line 246
    :cond_9
    move-object/from16 v29, v1

    .line 247
    .line 248
    move/from16 v22, v7

    .line 249
    .line 250
    :goto_8
    if-eq v6, v15, :cond_12

    .line 251
    .line 252
    add-int/lit8 v6, v6, 0x1

    .line 253
    .line 254
    move-object/from16 v1, v29

    .line 255
    .line 256
    const/4 v5, 0x0

    .line 257
    const/16 v14, 0x8

    .line 258
    .line 259
    goto/16 :goto_0

    .line 260
    .line 261
    :cond_a
    const-wide/16 v16, 0x80

    .line 262
    .line 263
    const-wide/16 v18, 0xff

    .line 264
    .line 265
    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    const/16 v22, 0x7

    .line 271
    .line 272
    goto/16 :goto_c

    .line 273
    .line 274
    :cond_b
    const-wide/16 v16, 0x80

    .line 275
    .line 276
    const-wide/16 v18, 0xff

    .line 277
    .line 278
    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    const/16 v22, 0x7

    .line 284
    .line 285
    check-cast v1, Ljava/lang/Iterable;

    .line 286
    .line 287
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    :cond_c
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 292
    .line 293
    .line 294
    move-result v3

    .line 295
    if-eqz v3, :cond_12

    .line 296
    .line 297
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    instance-of v5, v3, LP/o0;

    .line 302
    .line 303
    if-eqz v5, :cond_d

    .line 304
    .line 305
    check-cast v3, LP/o0;

    .line 306
    .line 307
    const/4 v5, 0x0

    .line 308
    invoke-virtual {v3, v5}, LP/o0;->c(Ljava/lang/Object;)LP/M;

    .line 309
    .line 310
    .line 311
    goto :goto_9

    .line 312
    :cond_d
    const/4 v5, 0x0

    .line 313
    invoke-virtual {v0, v3, v2}, LP/u;->b(Ljava/lang/Object;Z)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v4, v3}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    if-eqz v3, :cond_c

    .line 321
    .line 322
    instance-of v6, v3, Lr/H;

    .line 323
    .line 324
    if-eqz v6, :cond_11

    .line 325
    .line 326
    check-cast v3, Lr/H;

    .line 327
    .line 328
    iget-object v6, v3, Lr/H;->b:[Ljava/lang/Object;

    .line 329
    .line 330
    iget-object v3, v3, Lr/H;->a:[J

    .line 331
    .line 332
    array-length v7, v3

    .line 333
    add-int/lit8 v7, v7, -0x2

    .line 334
    .line 335
    if-ltz v7, :cond_c

    .line 336
    .line 337
    const/4 v8, 0x0

    .line 338
    :goto_a
    aget-wide v9, v3, v8

    .line 339
    .line 340
    not-long v11, v9

    .line 341
    shl-long v11, v11, v22

    .line 342
    .line 343
    and-long/2addr v11, v9

    .line 344
    and-long v11, v11, v20

    .line 345
    .line 346
    cmp-long v11, v11, v20

    .line 347
    .line 348
    if-eqz v11, :cond_10

    .line 349
    .line 350
    sub-int v11, v8, v7

    .line 351
    .line 352
    not-int v11, v11

    .line 353
    ushr-int/lit8 v11, v11, 0x1f

    .line 354
    .line 355
    const/16 v25, 0x8

    .line 356
    .line 357
    rsub-int/lit8 v14, v11, 0x8

    .line 358
    .line 359
    const/4 v11, 0x0

    .line 360
    :goto_b
    if-ge v11, v14, :cond_f

    .line 361
    .line 362
    and-long v12, v9, v18

    .line 363
    .line 364
    cmp-long v12, v12, v16

    .line 365
    .line 366
    if-gez v12, :cond_e

    .line 367
    .line 368
    shl-int/lit8 v12, v8, 0x3

    .line 369
    .line 370
    add-int/2addr v12, v11

    .line 371
    aget-object v12, v6, v12

    .line 372
    .line 373
    check-cast v12, LP/C;

    .line 374
    .line 375
    invoke-virtual {v0, v12, v2}, LP/u;->b(Ljava/lang/Object;Z)V

    .line 376
    .line 377
    .line 378
    :cond_e
    const/16 v12, 0x8

    .line 379
    .line 380
    shr-long/2addr v9, v12

    .line 381
    add-int/lit8 v11, v11, 0x1

    .line 382
    .line 383
    goto :goto_b

    .line 384
    :cond_f
    const/16 v12, 0x8

    .line 385
    .line 386
    if-ne v14, v12, :cond_c

    .line 387
    .line 388
    :cond_10
    if-eq v8, v7, :cond_c

    .line 389
    .line 390
    add-int/lit8 v8, v8, 0x1

    .line 391
    .line 392
    goto :goto_a

    .line 393
    :cond_11
    check-cast v3, LP/C;

    .line 394
    .line 395
    invoke-virtual {v0, v3, v2}, LP/u;->b(Ljava/lang/Object;Z)V

    .line 396
    .line 397
    .line 398
    goto :goto_9

    .line 399
    :cond_12
    :goto_c
    const-string v1, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap"

    .line 400
    .line 401
    const-string v3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>"

    .line 402
    .line 403
    iget-object v4, v0, LP/u;->w:Lr/G;

    .line 404
    .line 405
    iget-object v6, v0, LP/u;->x:Lr/H;

    .line 406
    .line 407
    if-eqz v2, :cond_22

    .line 408
    .line 409
    iget-object v2, v0, LP/u;->y:Lr/H;

    .line 410
    .line 411
    invoke-virtual {v2}, Lr/H;->h()Z

    .line 412
    .line 413
    .line 414
    move-result v7

    .line 415
    if-eqz v7, :cond_22

    .line 416
    .line 417
    iget-object v7, v4, Lr/G;->a:[J

    .line 418
    .line 419
    array-length v8, v7

    .line 420
    add-int/lit8 v8, v8, -0x2

    .line 421
    .line 422
    if-ltz v8, :cond_21

    .line 423
    .line 424
    const/4 v9, 0x0

    .line 425
    :goto_d
    aget-wide v10, v7, v9

    .line 426
    .line 427
    not-long v12, v10

    .line 428
    shl-long v12, v12, v22

    .line 429
    .line 430
    and-long/2addr v12, v10

    .line 431
    and-long v12, v12, v20

    .line 432
    .line 433
    cmp-long v12, v12, v20

    .line 434
    .line 435
    if-eqz v12, :cond_20

    .line 436
    .line 437
    sub-int v12, v9, v8

    .line 438
    .line 439
    not-int v12, v12

    .line 440
    ushr-int/lit8 v12, v12, 0x1f

    .line 441
    .line 442
    const/16 v25, 0x8

    .line 443
    .line 444
    rsub-int/lit8 v14, v12, 0x8

    .line 445
    .line 446
    const/4 v12, 0x0

    .line 447
    :goto_e
    if-ge v12, v14, :cond_1f

    .line 448
    .line 449
    and-long v26, v10, v18

    .line 450
    .line 451
    cmp-long v13, v26, v16

    .line 452
    .line 453
    if-gez v13, :cond_1e

    .line 454
    .line 455
    shl-int/lit8 v13, v9, 0x3

    .line 456
    .line 457
    add-int/2addr v13, v12

    .line 458
    iget-object v15, v4, Lr/G;->b:[Ljava/lang/Object;

    .line 459
    .line 460
    aget-object v15, v15, v13

    .line 461
    .line 462
    iget-object v15, v4, Lr/G;->c:[Ljava/lang/Object;

    .line 463
    .line 464
    aget-object v15, v15, v13

    .line 465
    .line 466
    instance-of v5, v15, Lr/H;

    .line 467
    .line 468
    if-eqz v5, :cond_1a

    .line 469
    .line 470
    invoke-static {v15, v3}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    check-cast v15, Lr/H;

    .line 474
    .line 475
    iget-object v5, v15, Lr/H;->b:[Ljava/lang/Object;

    .line 476
    .line 477
    iget-object v0, v15, Lr/H;->a:[J

    .line 478
    .line 479
    move-object/from16 v24, v5

    .line 480
    .line 481
    array-length v5, v0

    .line 482
    add-int/lit8 v5, v5, -0x2

    .line 483
    .line 484
    if-ltz v5, :cond_18

    .line 485
    .line 486
    move-object/from16 v26, v0

    .line 487
    .line 488
    move-wide/from16 v27, v10

    .line 489
    .line 490
    const/4 v0, 0x0

    .line 491
    :goto_f
    aget-wide v10, v26, v0

    .line 492
    .line 493
    move-object/from16 v29, v7

    .line 494
    .line 495
    move/from16 p2, v8

    .line 496
    .line 497
    not-long v7, v10

    .line 498
    shl-long v7, v7, v22

    .line 499
    .line 500
    and-long/2addr v7, v10

    .line 501
    and-long v7, v7, v20

    .line 502
    .line 503
    cmp-long v7, v7, v20

    .line 504
    .line 505
    if-eqz v7, :cond_17

    .line 506
    .line 507
    sub-int v7, v0, v5

    .line 508
    .line 509
    not-int v7, v7

    .line 510
    ushr-int/lit8 v7, v7, 0x1f

    .line 511
    .line 512
    const/16 v25, 0x8

    .line 513
    .line 514
    rsub-int/lit8 v7, v7, 0x8

    .line 515
    .line 516
    const/4 v8, 0x0

    .line 517
    :goto_10
    if-ge v8, v7, :cond_16

    .line 518
    .line 519
    and-long v30, v10, v18

    .line 520
    .line 521
    cmp-long v30, v30, v16

    .line 522
    .line 523
    if-gez v30, :cond_15

    .line 524
    .line 525
    shl-int/lit8 v30, v0, 0x3

    .line 526
    .line 527
    move/from16 v31, v8

    .line 528
    .line 529
    add-int v8, v30, v31

    .line 530
    .line 531
    aget-object v30, v24, v8

    .line 532
    .line 533
    move-wide/from16 v32, v10

    .line 534
    .line 535
    move-object/from16 v10, v30

    .line 536
    .line 537
    check-cast v10, LP/o0;

    .line 538
    .line 539
    invoke-virtual {v2, v10}, Lr/H;->c(Ljava/lang/Object;)Z

    .line 540
    .line 541
    .line 542
    move-result v11

    .line 543
    if-nez v11, :cond_13

    .line 544
    .line 545
    invoke-virtual {v6, v10}, Lr/H;->c(Ljava/lang/Object;)Z

    .line 546
    .line 547
    .line 548
    move-result v10

    .line 549
    if-eqz v10, :cond_14

    .line 550
    .line 551
    :cond_13
    invoke-virtual {v15, v8}, Lr/H;->m(I)V

    .line 552
    .line 553
    .line 554
    :cond_14
    :goto_11
    const/16 v8, 0x8

    .line 555
    .line 556
    goto :goto_12

    .line 557
    :cond_15
    move/from16 v31, v8

    .line 558
    .line 559
    move-wide/from16 v32, v10

    .line 560
    .line 561
    goto :goto_11

    .line 562
    :goto_12
    shr-long v10, v32, v8

    .line 563
    .line 564
    add-int/lit8 v25, v31, 0x1

    .line 565
    .line 566
    move/from16 v8, v25

    .line 567
    .line 568
    goto :goto_10

    .line 569
    :cond_16
    const/16 v8, 0x8

    .line 570
    .line 571
    if-ne v7, v8, :cond_19

    .line 572
    .line 573
    :cond_17
    if-eq v0, v5, :cond_19

    .line 574
    .line 575
    add-int/lit8 v0, v0, 0x1

    .line 576
    .line 577
    move/from16 v8, p2

    .line 578
    .line 579
    move-object/from16 v7, v29

    .line 580
    .line 581
    goto :goto_f

    .line 582
    :cond_18
    move-object/from16 v29, v7

    .line 583
    .line 584
    move/from16 p2, v8

    .line 585
    .line 586
    move-wide/from16 v27, v10

    .line 587
    .line 588
    :cond_19
    invoke-virtual {v15}, Lr/H;->g()Z

    .line 589
    .line 590
    .line 591
    move-result v0

    .line 592
    goto :goto_14

    .line 593
    :cond_1a
    move-object/from16 v29, v7

    .line 594
    .line 595
    move/from16 p2, v8

    .line 596
    .line 597
    move-wide/from16 v27, v10

    .line 598
    .line 599
    invoke-static {v15, v1}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 600
    .line 601
    .line 602
    check-cast v15, LP/o0;

    .line 603
    .line 604
    invoke-virtual {v2, v15}, Lr/H;->c(Ljava/lang/Object;)Z

    .line 605
    .line 606
    .line 607
    move-result v0

    .line 608
    if-nez v0, :cond_1c

    .line 609
    .line 610
    invoke-virtual {v6, v15}, Lr/H;->c(Ljava/lang/Object;)Z

    .line 611
    .line 612
    .line 613
    move-result v0

    .line 614
    if-eqz v0, :cond_1b

    .line 615
    .line 616
    goto :goto_13

    .line 617
    :cond_1b
    const/4 v0, 0x0

    .line 618
    goto :goto_14

    .line 619
    :cond_1c
    :goto_13
    const/4 v0, 0x1

    .line 620
    :goto_14
    if-eqz v0, :cond_1d

    .line 621
    .line 622
    invoke-virtual {v4, v13}, Lr/G;->k(I)Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    :cond_1d
    :goto_15
    const/16 v8, 0x8

    .line 626
    .line 627
    goto :goto_16

    .line 628
    :cond_1e
    move-object/from16 v29, v7

    .line 629
    .line 630
    move/from16 p2, v8

    .line 631
    .line 632
    move-wide/from16 v27, v10

    .line 633
    .line 634
    goto :goto_15

    .line 635
    :goto_16
    shr-long v10, v27, v8

    .line 636
    .line 637
    add-int/lit8 v12, v12, 0x1

    .line 638
    .line 639
    move-object/from16 v0, p0

    .line 640
    .line 641
    move/from16 v8, p2

    .line 642
    .line 643
    move-object/from16 v7, v29

    .line 644
    .line 645
    goto/16 :goto_e

    .line 646
    .line 647
    :cond_1f
    move-object/from16 v29, v7

    .line 648
    .line 649
    move/from16 p2, v8

    .line 650
    .line 651
    const/16 v8, 0x8

    .line 652
    .line 653
    if-ne v14, v8, :cond_21

    .line 654
    .line 655
    move/from16 v8, p2

    .line 656
    .line 657
    goto :goto_17

    .line 658
    :cond_20
    move-object/from16 v29, v7

    .line 659
    .line 660
    :goto_17
    if-eq v9, v8, :cond_21

    .line 661
    .line 662
    add-int/lit8 v9, v9, 0x1

    .line 663
    .line 664
    move-object/from16 v0, p0

    .line 665
    .line 666
    move-object/from16 v7, v29

    .line 667
    .line 668
    goto/16 :goto_d

    .line 669
    .line 670
    :cond_21
    invoke-virtual {v2}, Lr/H;->b()V

    .line 671
    .line 672
    .line 673
    invoke-virtual/range {p0 .. p0}, LP/u;->h()V

    .line 674
    .line 675
    .line 676
    return-void

    .line 677
    :cond_22
    invoke-virtual {v6}, Lr/H;->h()Z

    .line 678
    .line 679
    .line 680
    move-result v0

    .line 681
    if-eqz v0, :cond_31

    .line 682
    .line 683
    iget-object v0, v4, Lr/G;->a:[J

    .line 684
    .line 685
    array-length v2, v0

    .line 686
    add-int/lit8 v2, v2, -0x2

    .line 687
    .line 688
    if-ltz v2, :cond_30

    .line 689
    .line 690
    const/4 v5, 0x0

    .line 691
    :goto_18
    aget-wide v7, v0, v5

    .line 692
    .line 693
    not-long v9, v7

    .line 694
    shl-long v9, v9, v22

    .line 695
    .line 696
    and-long/2addr v9, v7

    .line 697
    and-long v9, v9, v20

    .line 698
    .line 699
    cmp-long v9, v9, v20

    .line 700
    .line 701
    if-eqz v9, :cond_2f

    .line 702
    .line 703
    sub-int v9, v5, v2

    .line 704
    .line 705
    not-int v9, v9

    .line 706
    ushr-int/lit8 v9, v9, 0x1f

    .line 707
    .line 708
    const/16 v25, 0x8

    .line 709
    .line 710
    rsub-int/lit8 v14, v9, 0x8

    .line 711
    .line 712
    const/4 v9, 0x0

    .line 713
    :goto_19
    if-ge v9, v14, :cond_2e

    .line 714
    .line 715
    and-long v10, v7, v18

    .line 716
    .line 717
    cmp-long v10, v10, v16

    .line 718
    .line 719
    if-gez v10, :cond_23

    .line 720
    .line 721
    const/4 v10, 0x1

    .line 722
    goto :goto_1a

    .line 723
    :cond_23
    const/4 v10, 0x0

    .line 724
    :goto_1a
    if-eqz v10, :cond_2d

    .line 725
    .line 726
    shl-int/lit8 v10, v5, 0x3

    .line 727
    .line 728
    add-int/2addr v10, v9

    .line 729
    iget-object v11, v4, Lr/G;->b:[Ljava/lang/Object;

    .line 730
    .line 731
    aget-object v11, v11, v10

    .line 732
    .line 733
    iget-object v11, v4, Lr/G;->c:[Ljava/lang/Object;

    .line 734
    .line 735
    aget-object v11, v11, v10

    .line 736
    .line 737
    instance-of v12, v11, Lr/H;

    .line 738
    .line 739
    if-eqz v12, :cond_2b

    .line 740
    .line 741
    invoke-static {v11, v3}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 742
    .line 743
    .line 744
    check-cast v11, Lr/H;

    .line 745
    .line 746
    iget-object v12, v11, Lr/H;->b:[Ljava/lang/Object;

    .line 747
    .line 748
    iget-object v13, v11, Lr/H;->a:[J

    .line 749
    .line 750
    array-length v15, v13

    .line 751
    add-int/lit8 v15, v15, -0x2

    .line 752
    .line 753
    move-object/from16 v24, v0

    .line 754
    .line 755
    if-ltz v15, :cond_29

    .line 756
    .line 757
    move-wide/from16 v26, v7

    .line 758
    .line 759
    const/4 v0, 0x0

    .line 760
    :goto_1b
    aget-wide v7, v13, v0

    .line 761
    .line 762
    move-object/from16 v28, v12

    .line 763
    .line 764
    move-object/from16 v29, v13

    .line 765
    .line 766
    not-long v12, v7

    .line 767
    shl-long v12, v12, v22

    .line 768
    .line 769
    and-long/2addr v12, v7

    .line 770
    and-long v12, v12, v20

    .line 771
    .line 772
    cmp-long v12, v12, v20

    .line 773
    .line 774
    if-eqz v12, :cond_28

    .line 775
    .line 776
    sub-int v12, v0, v15

    .line 777
    .line 778
    not-int v12, v12

    .line 779
    ushr-int/lit8 v12, v12, 0x1f

    .line 780
    .line 781
    const/16 v25, 0x8

    .line 782
    .line 783
    rsub-int/lit8 v12, v12, 0x8

    .line 784
    .line 785
    const/4 v13, 0x0

    .line 786
    :goto_1c
    if-ge v13, v12, :cond_27

    .line 787
    .line 788
    and-long v30, v7, v18

    .line 789
    .line 790
    cmp-long v30, v30, v16

    .line 791
    .line 792
    if-gez v30, :cond_24

    .line 793
    .line 794
    const/16 v30, 0x1

    .line 795
    .line 796
    goto :goto_1d

    .line 797
    :cond_24
    const/16 v30, 0x0

    .line 798
    .line 799
    :goto_1d
    if-eqz v30, :cond_26

    .line 800
    .line 801
    shl-int/lit8 v30, v0, 0x3

    .line 802
    .line 803
    move-object/from16 v31, v3

    .line 804
    .line 805
    add-int v3, v30, v13

    .line 806
    .line 807
    aget-object v30, v28, v3

    .line 808
    .line 809
    move-wide/from16 v32, v7

    .line 810
    .line 811
    move-object/from16 v7, v30

    .line 812
    .line 813
    check-cast v7, LP/o0;

    .line 814
    .line 815
    invoke-virtual {v6, v7}, Lr/H;->c(Ljava/lang/Object;)Z

    .line 816
    .line 817
    .line 818
    move-result v7

    .line 819
    if-eqz v7, :cond_25

    .line 820
    .line 821
    invoke-virtual {v11, v3}, Lr/H;->m(I)V

    .line 822
    .line 823
    .line 824
    :cond_25
    :goto_1e
    const/16 v8, 0x8

    .line 825
    .line 826
    goto :goto_1f

    .line 827
    :cond_26
    move-object/from16 v31, v3

    .line 828
    .line 829
    move-wide/from16 v32, v7

    .line 830
    .line 831
    goto :goto_1e

    .line 832
    :goto_1f
    shr-long v32, v32, v8

    .line 833
    .line 834
    add-int/lit8 v13, v13, 0x1

    .line 835
    .line 836
    move-object/from16 v3, v31

    .line 837
    .line 838
    move-wide/from16 v7, v32

    .line 839
    .line 840
    goto :goto_1c

    .line 841
    :cond_27
    move-object/from16 v31, v3

    .line 842
    .line 843
    const/16 v8, 0x8

    .line 844
    .line 845
    if-ne v12, v8, :cond_2a

    .line 846
    .line 847
    goto :goto_20

    .line 848
    :cond_28
    move-object/from16 v31, v3

    .line 849
    .line 850
    :goto_20
    if-eq v0, v15, :cond_2a

    .line 851
    .line 852
    add-int/lit8 v0, v0, 0x1

    .line 853
    .line 854
    move-object/from16 v12, v28

    .line 855
    .line 856
    move-object/from16 v13, v29

    .line 857
    .line 858
    move-object/from16 v3, v31

    .line 859
    .line 860
    goto :goto_1b

    .line 861
    :cond_29
    move-object/from16 v31, v3

    .line 862
    .line 863
    move-wide/from16 v26, v7

    .line 864
    .line 865
    :cond_2a
    invoke-virtual {v11}, Lr/H;->g()Z

    .line 866
    .line 867
    .line 868
    move-result v0

    .line 869
    goto :goto_21

    .line 870
    :cond_2b
    move-object/from16 v24, v0

    .line 871
    .line 872
    move-object/from16 v31, v3

    .line 873
    .line 874
    move-wide/from16 v26, v7

    .line 875
    .line 876
    invoke-static {v11, v1}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 877
    .line 878
    .line 879
    check-cast v11, LP/o0;

    .line 880
    .line 881
    invoke-virtual {v6, v11}, Lr/H;->c(Ljava/lang/Object;)Z

    .line 882
    .line 883
    .line 884
    move-result v0

    .line 885
    :goto_21
    if-eqz v0, :cond_2c

    .line 886
    .line 887
    invoke-virtual {v4, v10}, Lr/G;->k(I)Ljava/lang/Object;

    .line 888
    .line 889
    .line 890
    :cond_2c
    :goto_22
    const/16 v8, 0x8

    .line 891
    .line 892
    goto :goto_23

    .line 893
    :cond_2d
    move-object/from16 v24, v0

    .line 894
    .line 895
    move-object/from16 v31, v3

    .line 896
    .line 897
    move-wide/from16 v26, v7

    .line 898
    .line 899
    goto :goto_22

    .line 900
    :goto_23
    shr-long v10, v26, v8

    .line 901
    .line 902
    add-int/lit8 v9, v9, 0x1

    .line 903
    .line 904
    move-wide v7, v10

    .line 905
    move-object/from16 v0, v24

    .line 906
    .line 907
    move-object/from16 v3, v31

    .line 908
    .line 909
    goto/16 :goto_19

    .line 910
    .line 911
    :cond_2e
    move-object/from16 v24, v0

    .line 912
    .line 913
    move-object/from16 v31, v3

    .line 914
    .line 915
    const/16 v8, 0x8

    .line 916
    .line 917
    if-ne v14, v8, :cond_30

    .line 918
    .line 919
    goto :goto_24

    .line 920
    :cond_2f
    move-object/from16 v24, v0

    .line 921
    .line 922
    move-object/from16 v31, v3

    .line 923
    .line 924
    const/16 v8, 0x8

    .line 925
    .line 926
    :goto_24
    if-eq v5, v2, :cond_30

    .line 927
    .line 928
    add-int/lit8 v5, v5, 0x1

    .line 929
    .line 930
    move-object/from16 v0, v24

    .line 931
    .line 932
    move-object/from16 v3, v31

    .line 933
    .line 934
    goto/16 :goto_18

    .line 935
    .line 936
    :cond_30
    invoke-virtual/range {p0 .. p0}, LP/u;->h()V

    .line 937
    .line 938
    .line 939
    invoke-virtual {v6}, Lr/H;->b()V

    .line 940
    .line 941
    .line 942
    :cond_31
    return-void
.end method

.method public final d()V
    .locals 4

    .line 1
    iget-object v0, p0, LP/u;->t:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LP/u;->A:LQ/a;

    .line 5
    .line 6
    invoke-virtual {p0, v1}, LP/u;->e(LQ/a;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, LP/u;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    :try_start_1
    iget-object v2, p0, LP/u;->u:Lr/J;

    .line 16
    .line 17
    iget-object v2, v2, Lr/J;->q:Lr/H;

    .line 18
    .line 19
    invoke-virtual {v2}, Lr/H;->g()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    iget-object v2, p0, LP/u;->u:Lr/J;

    .line 26
    .line 27
    new-instance v3, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    iget-object v3, v2, Lr/J;->q:Lr/H;

    .line 33
    .line 34
    invoke-virtual {v3}, Lr/H;->g()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-nez v3, :cond_1

    .line 39
    .line 40
    const-string v3, "Compose:abandons"

    .line 41
    .line 42
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 43
    .line 44
    .line 45
    :try_start_2
    new-instance v3, LI5/h;

    .line 46
    .line 47
    invoke-direct {v3, v2}, LI5/h;-><init>(Lr/J;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    iget-object v2, v3, LI5/h;->r:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, LI5/j;

    .line 53
    .line 54
    invoke-virtual {v2}, LI5/j;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_0

    .line 59
    .line 60
    iget-object v2, v3, LI5/h;->r:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v2, LI5/j;

    .line 63
    .line 64
    invoke-virtual {v2}, LI5/j;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    check-cast v2, LP/w0;

    .line 69
    .line 70
    invoke-virtual {v3}, LI5/h;->remove()V

    .line 71
    .line 72
    .line 73
    invoke-interface {v2}, LP/w0;->c()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :catchall_1
    move-exception v1

    .line 78
    goto :goto_1

    .line 79
    :cond_0
    :try_start_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 84
    .line 85
    .line 86
    throw v1

    .line 87
    :catchall_2
    move-exception v1

    .line 88
    goto :goto_4

    .line 89
    :catch_0
    move-exception v1

    .line 90
    goto :goto_3

    .line 91
    :cond_1
    :goto_2
    throw v1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 92
    :goto_3
    :try_start_4
    invoke-virtual {p0}, LP/u;->a()V

    .line 93
    .line 94
    .line 95
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 96
    :goto_4
    monitor-exit v0

    .line 97
    throw v1
.end method

.method public final e(LQ/a;)V
    .locals 32

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, LP/u;->B:LQ/a;

    .line 6
    .line 7
    new-instance v3, LX/j;

    .line 8
    .line 9
    iget-object v4, v1, LP/u;->u:Lr/J;

    .line 10
    .line 11
    invoke-direct {v3, v4}, LX/j;-><init>(Ljava/util/Set;)V

    .line 12
    .line 13
    .line 14
    :try_start_0
    iget-object v4, v0, LQ/a;->o:LQ/K;

    .line 15
    .line 16
    invoke-virtual {v4}, LQ/K;->U()Z

    .line 17
    .line 18
    .line 19
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    iget-object v0, v2, LQ/a;->o:LQ/K;

    .line 23
    .line 24
    invoke-virtual {v0}, LQ/K;->U()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_10

    .line 29
    .line 30
    invoke-virtual {v3}, LX/j;->a()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    :try_start_1
    const-string v4, "Compose:applyChanges"

    .line 35
    .line 36
    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 37
    .line 38
    .line 39
    :try_start_2
    iget-object v4, v1, LP/u;->r:LB0/G0;

    .line 40
    .line 41
    iget-object v5, v1, LP/u;->v:LP/A0;

    .line 42
    .line 43
    invoke-virtual {v5}, LP/A0;->i()LP/D0;

    .line 44
    .line 45
    .line 46
    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 47
    const/4 v6, 0x0

    .line 48
    :try_start_3
    invoke-virtual {v0, v4, v5, v3}, LQ/a;->S(LP/c;LP/D0;LX/j;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 49
    .line 50
    .line 51
    const/4 v0, 0x1

    .line 52
    :try_start_4
    invoke-virtual {v5, v0}, LP/D0;->e(Z)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4}, LB0/G0;->O()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 56
    .line 57
    .line 58
    :try_start_5
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3}, LX/j;->b()V

    .line 62
    .line 63
    .line 64
    iget-object v4, v3, LX/j;->e:LR/e;

    .line 65
    .line 66
    iget v5, v4, LR/e;->s:I

    .line 67
    .line 68
    if-eqz v5, :cond_2

    .line 69
    .line 70
    const-string v5, "Compose:sideeffects"

    .line 71
    .line 72
    invoke-static {v5}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 73
    .line 74
    .line 75
    :try_start_6
    iget-object v5, v4, LR/e;->q:[Ljava/lang/Object;

    .line 76
    .line 77
    iget v7, v4, LR/e;->s:I

    .line 78
    .line 79
    move v8, v6

    .line 80
    :goto_0
    if-ge v8, v7, :cond_1

    .line 81
    .line 82
    aget-object v9, v5, v8

    .line 83
    .line 84
    check-cast v9, LB5/a;

    .line 85
    .line 86
    invoke-interface {v9}, LB5/a;->invoke()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    add-int/lit8 v8, v8, 0x1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :catchall_0
    move-exception v0

    .line 93
    goto :goto_1

    .line 94
    :cond_1
    invoke-virtual {v4}, LR/e;->i()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 95
    .line 96
    .line 97
    :try_start_7
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 102
    .line 103
    .line 104
    throw v0

    .line 105
    :cond_2
    :goto_2
    iget-boolean v4, v1, LP/u;->E:Z

    .line 106
    .line 107
    if-eqz v4, :cond_f

    .line 108
    .line 109
    const-string v4, "Compose:unobserve"

    .line 110
    .line 111
    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 112
    .line 113
    .line 114
    :try_start_8
    iput-boolean v6, v1, LP/u;->E:Z

    .line 115
    .line 116
    iget-object v4, v1, LP/u;->w:Lr/G;

    .line 117
    .line 118
    iget-object v5, v4, Lr/G;->a:[J

    .line 119
    .line 120
    array-length v7, v5

    .line 121
    add-int/lit8 v7, v7, -0x2

    .line 122
    .line 123
    if-ltz v7, :cond_e

    .line 124
    .line 125
    move v8, v6

    .line 126
    :goto_3
    aget-wide v9, v5, v8

    .line 127
    .line 128
    not-long v11, v9

    .line 129
    const/4 v13, 0x7

    .line 130
    shl-long/2addr v11, v13

    .line 131
    and-long/2addr v11, v9

    .line 132
    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    and-long/2addr v11, v14

    .line 138
    cmp-long v11, v11, v14

    .line 139
    .line 140
    if-eqz v11, :cond_d

    .line 141
    .line 142
    sub-int v11, v8, v7

    .line 143
    .line 144
    not-int v11, v11

    .line 145
    ushr-int/lit8 v11, v11, 0x1f

    .line 146
    .line 147
    const/16 v12, 0x8

    .line 148
    .line 149
    rsub-int/lit8 v11, v11, 0x8

    .line 150
    .line 151
    move v0, v6

    .line 152
    :goto_4
    if-ge v0, v11, :cond_c

    .line 153
    .line 154
    const-wide/16 v16, 0xff

    .line 155
    .line 156
    and-long v18, v9, v16

    .line 157
    .line 158
    const-wide/16 v20, 0x80

    .line 159
    .line 160
    cmp-long v18, v18, v20

    .line 161
    .line 162
    if-gez v18, :cond_b

    .line 163
    .line 164
    shl-int/lit8 v18, v8, 0x3

    .line 165
    .line 166
    move/from16 v19, v13

    .line 167
    .line 168
    add-int v13, v18, v0

    .line 169
    .line 170
    move-wide/from16 v22, v14

    .line 171
    .line 172
    iget-object v14, v4, Lr/G;->b:[Ljava/lang/Object;

    .line 173
    .line 174
    aget-object v14, v14, v13

    .line 175
    .line 176
    iget-object v14, v4, Lr/G;->c:[Ljava/lang/Object;

    .line 177
    .line 178
    aget-object v14, v14, v13

    .line 179
    .line 180
    instance-of v15, v14, Lr/H;

    .line 181
    .line 182
    if-eqz v15, :cond_8

    .line 183
    .line 184
    const-string v15, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>"

    .line 185
    .line 186
    invoke-static {v14, v15}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    check-cast v14, Lr/H;

    .line 190
    .line 191
    iget-object v15, v14, Lr/H;->b:[Ljava/lang/Object;

    .line 192
    .line 193
    iget-object v6, v14, Lr/H;->a:[J

    .line 194
    .line 195
    move/from16 v24, v12

    .line 196
    .line 197
    array-length v12, v6

    .line 198
    add-int/lit8 v12, v12, -0x2

    .line 199
    .line 200
    move/from16 v25, v0

    .line 201
    .line 202
    move-object/from16 v26, v5

    .line 203
    .line 204
    if-ltz v12, :cond_6

    .line 205
    .line 206
    move-object/from16 v27, v6

    .line 207
    .line 208
    const/4 v0, 0x0

    .line 209
    :goto_5
    aget-wide v5, v27, v0

    .line 210
    .line 211
    move-wide/from16 v28, v9

    .line 212
    .line 213
    not-long v9, v5

    .line 214
    shl-long v9, v9, v19

    .line 215
    .line 216
    and-long/2addr v9, v5

    .line 217
    and-long v9, v9, v22

    .line 218
    .line 219
    cmp-long v9, v9, v22

    .line 220
    .line 221
    if-eqz v9, :cond_5

    .line 222
    .line 223
    sub-int v9, v0, v12

    .line 224
    .line 225
    not-int v9, v9

    .line 226
    ushr-int/lit8 v9, v9, 0x1f

    .line 227
    .line 228
    rsub-int/lit8 v9, v9, 0x8

    .line 229
    .line 230
    const/4 v10, 0x0

    .line 231
    :goto_6
    if-ge v10, v9, :cond_4

    .line 232
    .line 233
    and-long v30, v5, v16

    .line 234
    .line 235
    cmp-long v30, v30, v20

    .line 236
    .line 237
    if-gez v30, :cond_3

    .line 238
    .line 239
    shl-int/lit8 v30, v0, 0x3

    .line 240
    .line 241
    add-int v1, v30, v10

    .line 242
    .line 243
    aget-object v30, v15, v1

    .line 244
    .line 245
    check-cast v30, LP/o0;

    .line 246
    .line 247
    invoke-virtual/range {v30 .. v30}, LP/o0;->b()Z

    .line 248
    .line 249
    .line 250
    move-result v30

    .line 251
    if-nez v30, :cond_3

    .line 252
    .line 253
    invoke-virtual {v14, v1}, Lr/H;->m(I)V

    .line 254
    .line 255
    .line 256
    goto :goto_7

    .line 257
    :catchall_1
    move-exception v0

    .line 258
    goto/16 :goto_b

    .line 259
    .line 260
    :cond_3
    :goto_7
    shr-long v5, v5, v24

    .line 261
    .line 262
    add-int/lit8 v10, v10, 0x1

    .line 263
    .line 264
    move-object/from16 v1, p0

    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_4
    move/from16 v1, v24

    .line 268
    .line 269
    if-ne v9, v1, :cond_7

    .line 270
    .line 271
    :cond_5
    if-eq v0, v12, :cond_7

    .line 272
    .line 273
    add-int/lit8 v0, v0, 0x1

    .line 274
    .line 275
    const/16 v24, 0x8

    .line 276
    .line 277
    move-object/from16 v1, p0

    .line 278
    .line 279
    move-wide/from16 v9, v28

    .line 280
    .line 281
    goto :goto_5

    .line 282
    :cond_6
    move-wide/from16 v28, v9

    .line 283
    .line 284
    :cond_7
    invoke-virtual {v14}, Lr/H;->g()Z

    .line 285
    .line 286
    .line 287
    move-result v0

    .line 288
    goto :goto_8

    .line 289
    :cond_8
    move/from16 v25, v0

    .line 290
    .line 291
    move-object/from16 v26, v5

    .line 292
    .line 293
    move-wide/from16 v28, v9

    .line 294
    .line 295
    const-string v0, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap"

    .line 296
    .line 297
    invoke-static {v14, v0}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    check-cast v14, LP/o0;

    .line 301
    .line 302
    invoke-virtual {v14}, LP/o0;->b()Z

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    if-nez v0, :cond_9

    .line 307
    .line 308
    const/4 v0, 0x1

    .line 309
    goto :goto_8

    .line 310
    :cond_9
    const/4 v0, 0x0

    .line 311
    :goto_8
    if-eqz v0, :cond_a

    .line 312
    .line 313
    invoke-virtual {v4, v13}, Lr/G;->k(I)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    :cond_a
    const/16 v1, 0x8

    .line 317
    .line 318
    goto :goto_9

    .line 319
    :cond_b
    move/from16 v25, v0

    .line 320
    .line 321
    move-object/from16 v26, v5

    .line 322
    .line 323
    move-wide/from16 v28, v9

    .line 324
    .line 325
    move/from16 v19, v13

    .line 326
    .line 327
    move-wide/from16 v22, v14

    .line 328
    .line 329
    move v1, v12

    .line 330
    :goto_9
    shr-long v9, v28, v1

    .line 331
    .line 332
    add-int/lit8 v0, v25, 0x1

    .line 333
    .line 334
    const/4 v6, 0x0

    .line 335
    move v12, v1

    .line 336
    move/from16 v13, v19

    .line 337
    .line 338
    move-wide/from16 v14, v22

    .line 339
    .line 340
    move-object/from16 v5, v26

    .line 341
    .line 342
    move-object/from16 v1, p0

    .line 343
    .line 344
    goto/16 :goto_4

    .line 345
    .line 346
    :cond_c
    move-object/from16 v26, v5

    .line 347
    .line 348
    move v1, v12

    .line 349
    if-ne v11, v1, :cond_e

    .line 350
    .line 351
    goto :goto_a

    .line 352
    :cond_d
    move-object/from16 v26, v5

    .line 353
    .line 354
    :goto_a
    if-eq v8, v7, :cond_e

    .line 355
    .line 356
    add-int/lit8 v8, v8, 0x1

    .line 357
    .line 358
    move-object/from16 v5, v26

    .line 359
    .line 360
    const/4 v0, 0x1

    .line 361
    const/4 v6, 0x0

    .line 362
    move-object/from16 v1, p0

    .line 363
    .line 364
    goto/16 :goto_3

    .line 365
    .line 366
    :cond_e
    invoke-virtual/range {p0 .. p0}, LP/u;->h()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 367
    .line 368
    .line 369
    :try_start_9
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 370
    .line 371
    .line 372
    goto :goto_c

    .line 373
    :catchall_2
    move-exception v0

    .line 374
    goto :goto_e

    .line 375
    :goto_b
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 376
    .line 377
    .line 378
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 379
    :cond_f
    :goto_c
    iget-object v0, v2, LQ/a;->o:LQ/K;

    .line 380
    .line 381
    invoke-virtual {v0}, LQ/K;->U()Z

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    if-eqz v0, :cond_10

    .line 386
    .line 387
    invoke-virtual {v3}, LX/j;->a()V

    .line 388
    .line 389
    .line 390
    :cond_10
    return-void

    .line 391
    :catchall_3
    move-exception v0

    .line 392
    goto :goto_d

    .line 393
    :catchall_4
    move-exception v0

    .line 394
    const/4 v1, 0x0

    .line 395
    :try_start_a
    invoke-virtual {v5, v1}, LP/D0;->e(Z)V

    .line 396
    .line 397
    .line 398
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 399
    :goto_d
    :try_start_b
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 400
    .line 401
    .line 402
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 403
    :goto_e
    iget-object v1, v2, LQ/a;->o:LQ/K;

    .line 404
    .line 405
    invoke-virtual {v1}, LQ/K;->U()Z

    .line 406
    .line 407
    .line 408
    move-result v1

    .line 409
    if-eqz v1, :cond_11

    .line 410
    .line 411
    invoke-virtual {v3}, LX/j;->a()V

    .line 412
    .line 413
    .line 414
    :cond_11
    throw v0
.end method

.method public final f()V
    .locals 4

    .line 1
    iget-object v0, p0, LP/u;->t:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LP/u;->B:LQ/a;

    .line 5
    .line 6
    iget-object v1, v1, LQ/a;->o:LQ/K;

    .line 7
    .line 8
    invoke-virtual {v1}, LQ/K;->V()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, LP/u;->B:LQ/a;

    .line 15
    .line 16
    invoke-virtual {p0, v1}, LP/u;->e(LQ/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    return-void

    .line 24
    :goto_1
    :try_start_1
    iget-object v2, p0, LP/u;->u:Lr/J;

    .line 25
    .line 26
    iget-object v2, v2, Lr/J;->q:Lr/H;

    .line 27
    .line 28
    invoke-virtual {v2}, Lr/H;->g()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_2

    .line 33
    .line 34
    iget-object v2, p0, LP/u;->u:Lr/J;

    .line 35
    .line 36
    new-instance v3, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    iget-object v3, v2, Lr/J;->q:Lr/H;

    .line 42
    .line 43
    invoke-virtual {v3}, Lr/H;->g()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    const-string v3, "Compose:abandons"

    .line 50
    .line 51
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 52
    .line 53
    .line 54
    :try_start_2
    new-instance v3, LI5/h;

    .line 55
    .line 56
    invoke-direct {v3, v2}, LI5/h;-><init>(Lr/J;)V

    .line 57
    .line 58
    .line 59
    :goto_2
    iget-object v2, v3, LI5/h;->r:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, LI5/j;

    .line 62
    .line 63
    invoke-virtual {v2}, LI5/j;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_1

    .line 68
    .line 69
    iget-object v2, v3, LI5/h;->r:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, LI5/j;

    .line 72
    .line 73
    invoke-virtual {v2}, LI5/j;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, LP/w0;

    .line 78
    .line 79
    invoke-virtual {v3}, LI5/h;->remove()V

    .line 80
    .line 81
    .line 82
    invoke-interface {v2}, LP/w0;->c()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :catchall_1
    move-exception v1

    .line 87
    goto :goto_3

    .line 88
    :cond_1
    :try_start_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 89
    .line 90
    .line 91
    goto :goto_4

    .line 92
    :goto_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 93
    .line 94
    .line 95
    throw v1

    .line 96
    :catchall_2
    move-exception v1

    .line 97
    goto :goto_6

    .line 98
    :catch_0
    move-exception v1

    .line 99
    goto :goto_5

    .line 100
    :cond_2
    :goto_4
    throw v1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 101
    :goto_5
    :try_start_4
    invoke-virtual {p0}, LP/u;->a()V

    .line 102
    .line 103
    .line 104
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 105
    :goto_6
    monitor-exit v0

    .line 106
    throw v1
.end method

.method public final g()V
    .locals 4

    .line 1
    iget-object v0, p0, LP/u;->t:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LP/u;->I:LP/o;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    iput-object v2, v1, LP/o;->u:Lr/v;

    .line 8
    .line 9
    iget-object v1, p0, LP/u;->u:Lr/J;

    .line 10
    .line 11
    iget-object v1, v1, Lr/J;->q:Lr/H;

    .line 12
    .line 13
    invoke-virtual {v1}, Lr/H;->g()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    iget-object v1, p0, LP/u;->u:Lr/J;

    .line 20
    .line 21
    new-instance v2, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v2, v1, Lr/J;->q:Lr/H;

    .line 27
    .line 28
    invoke-virtual {v2}, Lr/H;->g()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    const-string v2, "Compose:abandons"

    .line 35
    .line 36
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 37
    .line 38
    .line 39
    :try_start_1
    new-instance v2, LI5/h;

    .line 40
    .line 41
    invoke-direct {v2, v1}, LI5/h;-><init>(Lr/J;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    iget-object v1, v2, LI5/h;->r:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, LI5/j;

    .line 47
    .line 48
    invoke-virtual {v1}, LI5/j;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_0

    .line 53
    .line 54
    iget-object v1, v2, LI5/h;->r:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, LI5/j;

    .line 57
    .line 58
    invoke-virtual {v1}, LI5/j;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, LP/w0;

    .line 63
    .line 64
    invoke-virtual {v2}, LI5/h;->remove()V

    .line 65
    .line 66
    .line 67
    invoke-interface {v1}, LP/w0;->c()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :catchall_0
    move-exception v1

    .line 72
    goto :goto_1

    .line 73
    :cond_0
    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 74
    .line 75
    .line 76
    goto :goto_2

    .line 77
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 78
    .line 79
    .line 80
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 81
    :catchall_1
    move-exception v1

    .line 82
    goto :goto_3

    .line 83
    :cond_1
    :goto_2
    monitor-exit v0

    .line 84
    return-void

    .line 85
    :goto_3
    :try_start_3
    iget-object v2, p0, LP/u;->u:Lr/J;

    .line 86
    .line 87
    iget-object v2, v2, Lr/J;->q:Lr/H;

    .line 88
    .line 89
    invoke-virtual {v2}, Lr/H;->g()Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-nez v2, :cond_3

    .line 94
    .line 95
    iget-object v2, p0, LP/u;->u:Lr/J;

    .line 96
    .line 97
    new-instance v3, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 100
    .line 101
    .line 102
    iget-object v3, v2, Lr/J;->q:Lr/H;

    .line 103
    .line 104
    invoke-virtual {v3}, Lr/H;->g()Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-nez v3, :cond_3

    .line 109
    .line 110
    const-string v3, "Compose:abandons"

    .line 111
    .line 112
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 113
    .line 114
    .line 115
    :try_start_4
    new-instance v3, LI5/h;

    .line 116
    .line 117
    invoke-direct {v3, v2}, LI5/h;-><init>(Lr/J;)V

    .line 118
    .line 119
    .line 120
    :goto_4
    iget-object v2, v3, LI5/h;->r:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v2, LI5/j;

    .line 123
    .line 124
    invoke-virtual {v2}, LI5/j;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-eqz v2, :cond_2

    .line 129
    .line 130
    iget-object v2, v3, LI5/h;->r:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v2, LI5/j;

    .line 133
    .line 134
    invoke-virtual {v2}, LI5/j;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    check-cast v2, LP/w0;

    .line 139
    .line 140
    invoke-virtual {v3}, LI5/h;->remove()V

    .line 141
    .line 142
    .line 143
    invoke-interface {v2}, LP/w0;->c()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 144
    .line 145
    .line 146
    goto :goto_4

    .line 147
    :catchall_2
    move-exception v1

    .line 148
    goto :goto_5

    .line 149
    :cond_2
    :try_start_5
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 150
    .line 151
    .line 152
    goto :goto_6

    .line 153
    :goto_5
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 154
    .line 155
    .line 156
    throw v1

    .line 157
    :catchall_3
    move-exception v1

    .line 158
    goto :goto_8

    .line 159
    :catch_0
    move-exception v1

    .line 160
    goto :goto_7

    .line 161
    :cond_3
    :goto_6
    throw v1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 162
    :goto_7
    :try_start_6
    invoke-virtual {p0}, LP/u;->a()V

    .line 163
    .line 164
    .line 165
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 166
    :goto_8
    monitor-exit v0

    .line 167
    throw v1
.end method

.method public final h()V
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LP/u;->z:Lr/G;

    .line 4
    .line 5
    iget-object v2, v1, Lr/G;->a:[J

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    add-int/lit8 v3, v3, -0x2

    .line 9
    .line 10
    const/4 v8, 0x7

    .line 11
    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    const/16 v12, 0x8

    .line 17
    .line 18
    if-ltz v3, :cond_c

    .line 19
    .line 20
    const/4 v14, 0x0

    .line 21
    const-wide/16 v15, 0x80

    .line 22
    .line 23
    :goto_0
    aget-wide v4, v2, v14

    .line 24
    .line 25
    const-wide/16 v17, 0xff

    .line 26
    .line 27
    not-long v6, v4

    .line 28
    shl-long/2addr v6, v8

    .line 29
    and-long/2addr v6, v4

    .line 30
    and-long/2addr v6, v9

    .line 31
    cmp-long v6, v6, v9

    .line 32
    .line 33
    if-eqz v6, :cond_b

    .line 34
    .line 35
    sub-int v6, v14, v3

    .line 36
    .line 37
    not-int v6, v6

    .line 38
    ushr-int/lit8 v6, v6, 0x1f

    .line 39
    .line 40
    rsub-int/lit8 v6, v6, 0x8

    .line 41
    .line 42
    const/4 v7, 0x0

    .line 43
    :goto_1
    if-ge v7, v6, :cond_a

    .line 44
    .line 45
    and-long v19, v4, v17

    .line 46
    .line 47
    cmp-long v19, v19, v15

    .line 48
    .line 49
    if-gez v19, :cond_9

    .line 50
    .line 51
    shl-int/lit8 v19, v14, 0x3

    .line 52
    .line 53
    move/from16 v20, v8

    .line 54
    .line 55
    add-int v8, v19, v7

    .line 56
    .line 57
    move-wide/from16 v21, v9

    .line 58
    .line 59
    iget-object v9, v1, Lr/G;->b:[Ljava/lang/Object;

    .line 60
    .line 61
    aget-object v9, v9, v8

    .line 62
    .line 63
    iget-object v9, v1, Lr/G;->c:[Ljava/lang/Object;

    .line 64
    .line 65
    aget-object v9, v9, v8

    .line 66
    .line 67
    instance-of v10, v9, Lr/H;

    .line 68
    .line 69
    iget-object v11, v0, LP/u;->w:Lr/G;

    .line 70
    .line 71
    if-eqz v10, :cond_6

    .line 72
    .line 73
    const-string v10, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>"

    .line 74
    .line 75
    invoke-static {v9, v10}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    check-cast v9, Lr/H;

    .line 79
    .line 80
    iget-object v10, v9, Lr/H;->b:[Ljava/lang/Object;

    .line 81
    .line 82
    iget-object v13, v9, Lr/H;->a:[J

    .line 83
    .line 84
    move-wide/from16 v23, v15

    .line 85
    .line 86
    array-length v15, v13

    .line 87
    add-int/lit8 v15, v15, -0x2

    .line 88
    .line 89
    if-ltz v15, :cond_4

    .line 90
    .line 91
    move-wide/from16 v25, v4

    .line 92
    .line 93
    move/from16 v16, v12

    .line 94
    .line 95
    const/4 v12, 0x0

    .line 96
    :goto_2
    aget-wide v4, v13, v12

    .line 97
    .line 98
    move-object/from16 v27, v2

    .line 99
    .line 100
    move/from16 v28, v3

    .line 101
    .line 102
    not-long v2, v4

    .line 103
    shl-long v2, v2, v20

    .line 104
    .line 105
    and-long/2addr v2, v4

    .line 106
    and-long v2, v2, v21

    .line 107
    .line 108
    cmp-long v2, v2, v21

    .line 109
    .line 110
    if-eqz v2, :cond_3

    .line 111
    .line 112
    sub-int v2, v12, v15

    .line 113
    .line 114
    not-int v2, v2

    .line 115
    ushr-int/lit8 v2, v2, 0x1f

    .line 116
    .line 117
    rsub-int/lit8 v2, v2, 0x8

    .line 118
    .line 119
    const/4 v3, 0x0

    .line 120
    :goto_3
    if-ge v3, v2, :cond_2

    .line 121
    .line 122
    and-long v29, v4, v17

    .line 123
    .line 124
    cmp-long v29, v29, v23

    .line 125
    .line 126
    if-gez v29, :cond_0

    .line 127
    .line 128
    shl-int/lit8 v29, v12, 0x3

    .line 129
    .line 130
    move/from16 v30, v3

    .line 131
    .line 132
    add-int v3, v29, v30

    .line 133
    .line 134
    aget-object v29, v10, v3

    .line 135
    .line 136
    move-wide/from16 v31, v4

    .line 137
    .line 138
    move-object/from16 v4, v29

    .line 139
    .line 140
    check-cast v4, LP/C;

    .line 141
    .line 142
    invoke-virtual {v11, v4}, Lr/G;->c(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    if-nez v4, :cond_1

    .line 147
    .line 148
    invoke-virtual {v9, v3}, Lr/H;->m(I)V

    .line 149
    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_0
    move/from16 v30, v3

    .line 153
    .line 154
    move-wide/from16 v31, v4

    .line 155
    .line 156
    :cond_1
    :goto_4
    shr-long v4, v31, v16

    .line 157
    .line 158
    add-int/lit8 v3, v30, 0x1

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_2
    move/from16 v3, v16

    .line 162
    .line 163
    if-ne v2, v3, :cond_5

    .line 164
    .line 165
    :cond_3
    if-eq v12, v15, :cond_5

    .line 166
    .line 167
    add-int/lit8 v12, v12, 0x1

    .line 168
    .line 169
    move-object/from16 v2, v27

    .line 170
    .line 171
    move/from16 v3, v28

    .line 172
    .line 173
    const/16 v16, 0x8

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_4
    move-object/from16 v27, v2

    .line 177
    .line 178
    move/from16 v28, v3

    .line 179
    .line 180
    move-wide/from16 v25, v4

    .line 181
    .line 182
    :cond_5
    invoke-virtual {v9}, Lr/H;->g()Z

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    goto :goto_5

    .line 187
    :cond_6
    move-object/from16 v27, v2

    .line 188
    .line 189
    move/from16 v28, v3

    .line 190
    .line 191
    move-wide/from16 v25, v4

    .line 192
    .line 193
    move-wide/from16 v23, v15

    .line 194
    .line 195
    const-string v2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap"

    .line 196
    .line 197
    invoke-static {v9, v2}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    check-cast v9, LP/C;

    .line 201
    .line 202
    invoke-virtual {v11, v9}, Lr/G;->c(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    if-nez v2, :cond_7

    .line 207
    .line 208
    const/4 v2, 0x1

    .line 209
    goto :goto_5

    .line 210
    :cond_7
    const/4 v2, 0x0

    .line 211
    :goto_5
    if-eqz v2, :cond_8

    .line 212
    .line 213
    invoke-virtual {v1, v8}, Lr/G;->k(I)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    :cond_8
    const/16 v3, 0x8

    .line 217
    .line 218
    goto :goto_6

    .line 219
    :cond_9
    move-object/from16 v27, v2

    .line 220
    .line 221
    move/from16 v28, v3

    .line 222
    .line 223
    move-wide/from16 v25, v4

    .line 224
    .line 225
    move/from16 v20, v8

    .line 226
    .line 227
    move-wide/from16 v21, v9

    .line 228
    .line 229
    move-wide/from16 v23, v15

    .line 230
    .line 231
    move v3, v12

    .line 232
    :goto_6
    shr-long v4, v25, v3

    .line 233
    .line 234
    add-int/lit8 v7, v7, 0x1

    .line 235
    .line 236
    move v12, v3

    .line 237
    move/from16 v8, v20

    .line 238
    .line 239
    move-wide/from16 v9, v21

    .line 240
    .line 241
    move-wide/from16 v15, v23

    .line 242
    .line 243
    move-object/from16 v2, v27

    .line 244
    .line 245
    move/from16 v3, v28

    .line 246
    .line 247
    goto/16 :goto_1

    .line 248
    .line 249
    :cond_a
    move-object/from16 v27, v2

    .line 250
    .line 251
    move/from16 v28, v3

    .line 252
    .line 253
    move/from16 v20, v8

    .line 254
    .line 255
    move-wide/from16 v21, v9

    .line 256
    .line 257
    move v3, v12

    .line 258
    move-wide/from16 v23, v15

    .line 259
    .line 260
    if-ne v6, v3, :cond_d

    .line 261
    .line 262
    move/from16 v3, v28

    .line 263
    .line 264
    goto :goto_7

    .line 265
    :cond_b
    move-object/from16 v27, v2

    .line 266
    .line 267
    move/from16 v20, v8

    .line 268
    .line 269
    move-wide/from16 v21, v9

    .line 270
    .line 271
    move-wide/from16 v23, v15

    .line 272
    .line 273
    :goto_7
    if-eq v14, v3, :cond_d

    .line 274
    .line 275
    add-int/lit8 v14, v14, 0x1

    .line 276
    .line 277
    move/from16 v8, v20

    .line 278
    .line 279
    move-wide/from16 v9, v21

    .line 280
    .line 281
    move-wide/from16 v15, v23

    .line 282
    .line 283
    move-object/from16 v2, v27

    .line 284
    .line 285
    const/16 v12, 0x8

    .line 286
    .line 287
    goto/16 :goto_0

    .line 288
    .line 289
    :cond_c
    move/from16 v20, v8

    .line 290
    .line 291
    move-wide/from16 v21, v9

    .line 292
    .line 293
    const-wide/16 v17, 0xff

    .line 294
    .line 295
    const-wide/16 v23, 0x80

    .line 296
    .line 297
    :cond_d
    iget-object v1, v0, LP/u;->y:Lr/H;

    .line 298
    .line 299
    invoke-virtual {v1}, Lr/H;->h()Z

    .line 300
    .line 301
    .line 302
    move-result v2

    .line 303
    if-eqz v2, :cond_13

    .line 304
    .line 305
    iget-object v2, v1, Lr/H;->b:[Ljava/lang/Object;

    .line 306
    .line 307
    iget-object v3, v1, Lr/H;->a:[J

    .line 308
    .line 309
    array-length v4, v3

    .line 310
    add-int/lit8 v4, v4, -0x2

    .line 311
    .line 312
    if-ltz v4, :cond_13

    .line 313
    .line 314
    const/4 v5, 0x0

    .line 315
    :goto_8
    aget-wide v6, v3, v5

    .line 316
    .line 317
    not-long v8, v6

    .line 318
    shl-long v8, v8, v20

    .line 319
    .line 320
    and-long/2addr v8, v6

    .line 321
    and-long v8, v8, v21

    .line 322
    .line 323
    cmp-long v8, v8, v21

    .line 324
    .line 325
    if-eqz v8, :cond_12

    .line 326
    .line 327
    sub-int v8, v5, v4

    .line 328
    .line 329
    not-int v8, v8

    .line 330
    ushr-int/lit8 v8, v8, 0x1f

    .line 331
    .line 332
    const/16 v16, 0x8

    .line 333
    .line 334
    rsub-int/lit8 v12, v8, 0x8

    .line 335
    .line 336
    const/4 v8, 0x0

    .line 337
    :goto_9
    if-ge v8, v12, :cond_11

    .line 338
    .line 339
    and-long v9, v6, v17

    .line 340
    .line 341
    cmp-long v9, v9, v23

    .line 342
    .line 343
    if-gez v9, :cond_e

    .line 344
    .line 345
    const/4 v9, 0x1

    .line 346
    goto :goto_a

    .line 347
    :cond_e
    const/4 v9, 0x0

    .line 348
    :goto_a
    if-eqz v9, :cond_10

    .line 349
    .line 350
    shl-int/lit8 v9, v5, 0x3

    .line 351
    .line 352
    add-int/2addr v9, v8

    .line 353
    aget-object v10, v2, v9

    .line 354
    .line 355
    check-cast v10, LP/o0;

    .line 356
    .line 357
    iget-object v10, v10, LP/o0;->g:Lr/G;

    .line 358
    .line 359
    if-eqz v10, :cond_f

    .line 360
    .line 361
    const/4 v10, 0x1

    .line 362
    goto :goto_b

    .line 363
    :cond_f
    const/4 v10, 0x0

    .line 364
    :goto_b
    if-nez v10, :cond_10

    .line 365
    .line 366
    invoke-virtual {v1, v9}, Lr/H;->m(I)V

    .line 367
    .line 368
    .line 369
    :cond_10
    const/16 v9, 0x8

    .line 370
    .line 371
    shr-long/2addr v6, v9

    .line 372
    add-int/lit8 v8, v8, 0x1

    .line 373
    .line 374
    goto :goto_9

    .line 375
    :cond_11
    const/16 v9, 0x8

    .line 376
    .line 377
    if-ne v12, v9, :cond_13

    .line 378
    .line 379
    goto :goto_c

    .line 380
    :cond_12
    const/16 v9, 0x8

    .line 381
    .line 382
    :goto_c
    if-eq v5, v4, :cond_13

    .line 383
    .line 384
    add-int/lit8 v5, v5, 0x1

    .line 385
    .line 386
    goto :goto_8

    .line 387
    :cond_13
    return-void
.end method

.method public final i(LX/e;)V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, LP/u;->t:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    :try_start_1
    invoke-virtual {p0}, LP/u;->m()V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, LP/u;->D:Lr/G;

    .line 8
    .line 9
    invoke-static {}, La/a;->q()Lr/G;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iput-object v2, p0, LP/u;->D:Lr/G;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 14
    .line 15
    :try_start_2
    iget-object v2, p0, LP/u;->H:LP/S;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, LP/u;->q:LP/r;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, LP/u;->I:LP/o;

    .line 26
    .line 27
    iget-object v3, v2, LP/o;->e:LQ/a;

    .line 28
    .line 29
    iget-object v3, v3, LQ/a;->o:LQ/K;

    .line 30
    .line 31
    invoke-virtual {v3}, LQ/K;->U()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_0

    .line 36
    .line 37
    const-string v3, "Expected applyChanges() to have been called"

    .line 38
    .line 39
    invoke-static {v3}, LP/p;->c(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-virtual {v2, v1, p1}, LP/o;->n(Lr/G;LX/e;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 43
    .line 44
    .line 45
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_1

    .line 49
    :catchall_1
    move-exception p1

    .line 50
    goto :goto_0

    .line 51
    :catch_0
    move-exception p1

    .line 52
    :try_start_4
    iput-object v1, p0, LP/u;->D:Lr/G;

    .line 53
    .line 54
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 55
    :goto_0
    :try_start_5
    monitor-exit v0

    .line 56
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 57
    :goto_1
    :try_start_6
    iget-object v0, p0, LP/u;->u:Lr/J;

    .line 58
    .line 59
    iget-object v0, v0, Lr/J;->q:Lr/H;

    .line 60
    .line 61
    invoke-virtual {v0}, Lr/H;->g()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_2

    .line 66
    .line 67
    iget-object v0, p0, LP/u;->u:Lr/J;

    .line 68
    .line 69
    new-instance v1, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 72
    .line 73
    .line 74
    iget-object v1, v0, Lr/J;->q:Lr/H;

    .line 75
    .line 76
    invoke-virtual {v1}, Lr/H;->g()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-nez v1, :cond_2

    .line 81
    .line 82
    const-string v1, "Compose:abandons"

    .line 83
    .line 84
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    .line 85
    .line 86
    .line 87
    :try_start_7
    new-instance v1, LI5/h;

    .line 88
    .line 89
    invoke-direct {v1, v0}, LI5/h;-><init>(Lr/J;)V

    .line 90
    .line 91
    .line 92
    :goto_2
    iget-object v0, v1, LI5/h;->r:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v0, LI5/j;

    .line 95
    .line 96
    invoke-virtual {v0}, LI5/j;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_1

    .line 101
    .line 102
    iget-object v0, v1, LI5/h;->r:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, LI5/j;

    .line 105
    .line 106
    invoke-virtual {v0}, LI5/j;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, LP/w0;

    .line 111
    .line 112
    invoke-virtual {v1}, LI5/h;->remove()V

    .line 113
    .line 114
    .line 115
    invoke-interface {v0}, LP/w0;->c()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :catchall_2
    move-exception p1

    .line 120
    goto :goto_3

    .line 121
    :cond_1
    :try_start_8
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 122
    .line 123
    .line 124
    goto :goto_4

    .line 125
    :goto_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 126
    .line 127
    .line 128
    throw p1

    .line 129
    :catch_1
    move-exception p1

    .line 130
    goto :goto_5

    .line 131
    :cond_2
    :goto_4
    throw p1
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1

    .line 132
    :goto_5
    invoke-virtual {p0}, LP/u;->a()V

    .line 133
    .line 134
    .line 135
    throw p1
.end method

.method public final j(LX/e;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, LP/u;->J:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "The composition is disposed"

    .line 6
    .line 7
    invoke-static {v0}, LP/j0;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, LP/u;->q:LP/r;

    .line 11
    .line 12
    invoke-virtual {v0, p0, p1}, LP/r;->a(LP/u;LX/e;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final k()V
    .locals 6

    .line 1
    iget-object v0, p0, LP/u;->t:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LP/u;->v:LP/A0;

    .line 5
    .line 6
    iget v1, v1, LP/A0;->r:I

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x1

    .line 10
    if-lez v1, :cond_0

    .line 11
    .line 12
    move v1, v3

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v1, v2

    .line 15
    :goto_0
    if-nez v1, :cond_1

    .line 16
    .line 17
    iget-object v4, p0, LP/u;->u:Lr/J;

    .line 18
    .line 19
    iget-object v4, v4, Lr/J;->q:Lr/H;

    .line 20
    .line 21
    invoke-virtual {v4}, Lr/H;->g()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-nez v4, :cond_3

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    goto :goto_4

    .line 30
    :cond_1
    :goto_1
    const-string v4, "Compose:deactivate"

    .line 31
    .line 32
    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    :try_start_1
    new-instance v4, LX/j;

    .line 36
    .line 37
    iget-object v5, p0, LP/u;->u:Lr/J;

    .line 38
    .line 39
    invoke-direct {v4, v5}, LX/j;-><init>(Ljava/util/Set;)V

    .line 40
    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    iget-object v1, p0, LP/u;->v:LP/A0;

    .line 45
    .line 46
    invoke-virtual {v1}, LP/A0;->i()LP/D0;

    .line 47
    .line 48
    .line 49
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 50
    :try_start_2
    invoke-static {v1, v4}, LP/p;->e(LP/D0;LX/j;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 51
    .line 52
    .line 53
    :try_start_3
    invoke-virtual {v1, v3}, LP/D0;->e(Z)V

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, LP/u;->r:LB0/G0;

    .line 57
    .line 58
    invoke-virtual {v1}, LB0/G0;->O()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v4}, LX/j;->b()V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :catchall_1
    move-exception v1

    .line 66
    goto :goto_3

    .line 67
    :catchall_2
    move-exception v3

    .line 68
    invoke-virtual {v1, v2}, LP/D0;->e(Z)V

    .line 69
    .line 70
    .line 71
    throw v3

    .line 72
    :cond_2
    :goto_2
    invoke-virtual {v4}, LX/j;->a()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 73
    .line 74
    .line 75
    :try_start_4
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 76
    .line 77
    .line 78
    :cond_3
    iget-object v1, p0, LP/u;->w:Lr/G;

    .line 79
    .line 80
    invoke-virtual {v1}, Lr/G;->a()V

    .line 81
    .line 82
    .line 83
    iget-object v1, p0, LP/u;->z:Lr/G;

    .line 84
    .line 85
    invoke-virtual {v1}, Lr/G;->a()V

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, LP/u;->D:Lr/G;

    .line 89
    .line 90
    invoke-virtual {v1}, Lr/G;->a()V

    .line 91
    .line 92
    .line 93
    iget-object v1, p0, LP/u;->A:LQ/a;

    .line 94
    .line 95
    iget-object v1, v1, LQ/a;->o:LQ/K;

    .line 96
    .line 97
    invoke-virtual {v1}, LQ/K;->S()V

    .line 98
    .line 99
    .line 100
    iget-object v1, p0, LP/u;->B:LQ/a;

    .line 101
    .line 102
    iget-object v1, v1, LQ/a;->o:LQ/K;

    .line 103
    .line 104
    invoke-virtual {v1}, LQ/K;->S()V

    .line 105
    .line 106
    .line 107
    iget-object v1, p0, LP/u;->I:LP/o;

    .line 108
    .line 109
    iget-object v2, v1, LP/o;->D:Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 112
    .line 113
    .line 114
    iget-object v2, v1, LP/o;->r:Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 117
    .line 118
    .line 119
    iget-object v2, v1, LP/o;->e:LQ/a;

    .line 120
    .line 121
    iget-object v2, v2, LQ/a;->o:LQ/K;

    .line 122
    .line 123
    invoke-virtual {v2}, LQ/K;->S()V

    .line 124
    .line 125
    .line 126
    const/4 v2, 0x0

    .line 127
    iput-object v2, v1, LP/o;->u:Lr/v;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 128
    .line 129
    monitor-exit v0

    .line 130
    return-void

    .line 131
    :goto_3
    :try_start_5
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 132
    .line 133
    .line 134
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 135
    :goto_4
    monitor-exit v0

    .line 136
    throw v1
.end method

.method public final l()V
    .locals 6

    .line 1
    iget-object v0, p0, LP/u;->t:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LP/u;->I:LP/o;

    .line 5
    .line 6
    iget-boolean v1, v1, LP/o;->E:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const-string v1, "Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block."

    .line 11
    .line 12
    invoke-static {v1}, LP/j0;->b(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    goto/16 :goto_4

    .line 18
    .line 19
    :cond_0
    :goto_0
    iget-boolean v1, p0, LP/u;->J:Z

    .line 20
    .line 21
    if-nez v1, :cond_6

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    iput-boolean v1, p0, LP/u;->J:Z

    .line 25
    .line 26
    sget-object v2, LP/h;->b:LX/e;

    .line 27
    .line 28
    iget-object v2, p0, LP/u;->I:LP/o;

    .line 29
    .line 30
    iget-object v2, v2, LP/o;->K:LQ/a;

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0, v2}, LP/u;->e(LQ/a;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object v2, p0, LP/u;->v:LP/A0;

    .line 38
    .line 39
    iget v2, v2, LP/A0;->r:I

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    if-lez v2, :cond_2

    .line 43
    .line 44
    move v2, v1

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    move v2, v3

    .line 47
    :goto_1
    if-nez v2, :cond_3

    .line 48
    .line 49
    iget-object v4, p0, LP/u;->u:Lr/J;

    .line 50
    .line 51
    iget-object v4, v4, Lr/J;->q:Lr/H;

    .line 52
    .line 53
    invoke-virtual {v4}, Lr/H;->g()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-nez v4, :cond_5

    .line 58
    .line 59
    :cond_3
    new-instance v4, LX/j;

    .line 60
    .line 61
    iget-object v5, p0, LP/u;->u:Lr/J;

    .line 62
    .line 63
    invoke-direct {v4, v5}, LX/j;-><init>(Ljava/util/Set;)V

    .line 64
    .line 65
    .line 66
    if-eqz v2, :cond_4

    .line 67
    .line 68
    iget-object v2, p0, LP/u;->v:LP/A0;

    .line 69
    .line 70
    invoke-virtual {v2}, LP/A0;->i()LP/D0;

    .line 71
    .line 72
    .line 73
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    :try_start_1
    invoke-static {v2, v4}, LP/p;->g(LP/D0;LX/j;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 75
    .line 76
    .line 77
    :try_start_2
    invoke-virtual {v2, v1}, LP/D0;->e(Z)V

    .line 78
    .line 79
    .line 80
    iget-object v1, p0, LP/u;->r:LB0/G0;

    .line 81
    .line 82
    invoke-virtual {v1}, LB0/G0;->n()V

    .line 83
    .line 84
    .line 85
    iget-object v1, p0, LP/u;->r:LB0/G0;

    .line 86
    .line 87
    invoke-virtual {v1}, LB0/G0;->O()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4}, LX/j;->b()V

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :catchall_1
    move-exception v1

    .line 95
    invoke-virtual {v2, v3}, LP/D0;->e(Z)V

    .line 96
    .line 97
    .line 98
    throw v1

    .line 99
    :cond_4
    :goto_2
    invoke-virtual {v4}, LX/j;->a()V

    .line 100
    .line 101
    .line 102
    :cond_5
    iget-object v1, p0, LP/u;->I:LP/o;

    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    const-string v2, "Compose:Composer.dispose"

    .line 108
    .line 109
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 110
    .line 111
    .line 112
    :try_start_3
    iget-object v2, v1, LP/o;->b:LP/r;

    .line 113
    .line 114
    invoke-virtual {v2, v1}, LP/r;->o(LP/o;)V

    .line 115
    .line 116
    .line 117
    iget-object v2, v1, LP/o;->D:Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 120
    .line 121
    .line 122
    iget-object v2, v1, LP/o;->r:Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 125
    .line 126
    .line 127
    iget-object v2, v1, LP/o;->e:LQ/a;

    .line 128
    .line 129
    iget-object v2, v2, LQ/a;->o:LQ/K;

    .line 130
    .line 131
    invoke-virtual {v2}, LQ/K;->S()V

    .line 132
    .line 133
    .line 134
    const/4 v2, 0x0

    .line 135
    iput-object v2, v1, LP/o;->u:Lr/v;

    .line 136
    .line 137
    iget-object v1, v1, LP/o;->a:LB0/G0;

    .line 138
    .line 139
    invoke-virtual {v1}, LB0/G0;->n()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 140
    .line 141
    .line 142
    :try_start_4
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 143
    .line 144
    .line 145
    goto :goto_3

    .line 146
    :catchall_2
    move-exception v1

    .line 147
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 148
    .line 149
    .line 150
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 151
    :cond_6
    :goto_3
    monitor-exit v0

    .line 152
    iget-object v0, p0, LP/u;->q:LP/r;

    .line 153
    .line 154
    invoke-virtual {v0, p0}, LP/r;->p(LP/u;)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :goto_4
    monitor-exit v0

    .line 159
    throw v1
.end method

.method public final m()V
    .locals 5

    .line 1
    sget-object v0, LP/b;->a:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, LP/u;->s:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-eqz v2, :cond_3

    .line 10
    .line 11
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    instance-of v0, v2, Ljava/util/Set;

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    check-cast v2, Ljava/util/Set;

    .line 23
    .line 24
    invoke-virtual {p0, v2, v3}, LP/u;->c(Ljava/util/Set;Z)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    instance-of v0, v2, [Ljava/lang/Object;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    check-cast v2, [Ljava/util/Set;

    .line 33
    .line 34
    array-length v0, v2

    .line 35
    const/4 v1, 0x0

    .line 36
    :goto_0
    if-ge v1, v0, :cond_3

    .line 37
    .line 38
    aget-object v4, v2, v1

    .line 39
    .line 40
    invoke-virtual {p0, v4, v3}, LP/u;->c(Ljava/util/Set;Z)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v2, "corrupt pendingModifications drain: "

    .line 49
    .line 50
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0}, LP/p;->d(Ljava/lang/String;)Ljava/lang/Void;

    .line 61
    .line 62
    .line 63
    new-instance v0, LC2/e;

    .line 64
    .line 65
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :cond_2
    const-string v0, "pending composition has not been applied"

    .line 70
    .line 71
    invoke-static {v0}, LP/p;->d(Ljava/lang/String;)Ljava/lang/Void;

    .line 72
    .line 73
    .line 74
    new-instance v0, LC2/e;

    .line 75
    .line 76
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 77
    .line 78
    .line 79
    throw v0

    .line 80
    :cond_3
    return-void
.end method

.method public final n()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, LP/u;->s:Ljava/util/concurrent/atomic/AtomicReference;

    .line 3
    .line 4
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v2, LP/b;->a:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_3

    .line 15
    .line 16
    instance-of v2, v0, Ljava/util/Set;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    check-cast v0, Ljava/util/Set;

    .line 22
    .line 23
    invoke-virtual {p0, v0, v3}, LP/u;->c(Ljava/util/Set;Z)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    instance-of v2, v0, [Ljava/lang/Object;

    .line 28
    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    check-cast v0, [Ljava/util/Set;

    .line 32
    .line 33
    array-length v1, v0

    .line 34
    move v2, v3

    .line 35
    :goto_0
    if-ge v2, v1, :cond_3

    .line 36
    .line 37
    aget-object v4, v0, v2

    .line 38
    .line 39
    invoke-virtual {p0, v4, v3}, LP/u;->c(Ljava/util/Set;Z)V

    .line 40
    .line 41
    .line 42
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    if-nez v0, :cond_2

    .line 46
    .line 47
    const-string v0, "calling recordModificationsOf and applyChanges concurrently is not supported"

    .line 48
    .line 49
    invoke-static {v0}, LP/p;->d(Ljava/lang/String;)Ljava/lang/Void;

    .line 50
    .line 51
    .line 52
    new-instance v0, LC2/e;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 55
    .line 56
    .line 57
    throw v0

    .line 58
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v2, "corrupt pendingModifications drain: "

    .line 61
    .line 62
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0}, LP/p;->d(Ljava/lang/String;)Ljava/lang/Void;

    .line 73
    .line 74
    .line 75
    new-instance v0, LC2/e;

    .line 76
    .line 77
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 78
    .line 79
    .line 80
    throw v0

    .line 81
    :cond_3
    return-void
.end method

.method public final o()V
    .locals 5

    .line 1
    sget-object v0, Ln5/u;->q:Ln5/u;

    .line 2
    .line 3
    iget-object v1, p0, LP/u;->s:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v2, LP/b;->a:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    if-nez v0, :cond_1

    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    instance-of v2, v0, Ljava/util/Set;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    check-cast v0, Ljava/util/Set;

    .line 27
    .line 28
    invoke-virtual {p0, v0, v3}, LP/u;->c(Ljava/util/Set;Z)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    instance-of v2, v0, [Ljava/lang/Object;

    .line 33
    .line 34
    if-eqz v2, :cond_4

    .line 35
    .line 36
    check-cast v0, [Ljava/util/Set;

    .line 37
    .line 38
    array-length v1, v0

    .line 39
    move v2, v3

    .line 40
    :goto_0
    if-ge v2, v1, :cond_3

    .line 41
    .line 42
    aget-object v4, v0, v2

    .line 43
    .line 44
    invoke-virtual {p0, v4, v3}, LP/u;->c(Ljava/util/Set;Z)V

    .line 45
    .line 46
    .line 47
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    return-void

    .line 51
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string v2, "corrupt pendingModifications drain: "

    .line 54
    .line 55
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v0}, LP/p;->d(Ljava/lang/String;)Ljava/lang/Void;

    .line 66
    .line 67
    .line 68
    new-instance v0, LC2/e;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 71
    .line 72
    .line 73
    throw v0
.end method

.method public final p(Ljava/util/ArrayList;)V
    .locals 3

    .line 1
    iget-object v0, p0, LP/u;->u:Lr/J;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-gtz v1, :cond_2

    .line 8
    .line 9
    :try_start_0
    iget-object v1, p0, LP/u;->I:LP/o;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 12
    .line 13
    .line 14
    :try_start_1
    invoke-virtual {v1, p1}, LP/o;->y(Ljava/util/ArrayList;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    .line 16
    .line 17
    :try_start_2
    invoke-virtual {v1}, LP/o;->j()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    invoke-virtual {v1}, LP/o;->a()V

    .line 23
    .line 24
    .line 25
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 26
    :catchall_1
    move-exception p1

    .line 27
    :try_start_3
    iget-object v1, v0, Lr/J;->q:Lr/H;

    .line 28
    .line 29
    invoke-virtual {v1}, Lr/H;->g()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    new-instance v1, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    iget-object v1, v0, Lr/J;->q:Lr/H;

    .line 41
    .line 42
    invoke-virtual {v1}, Lr/H;->g()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_1

    .line 47
    .line 48
    const-string v1, "Compose:abandons"

    .line 49
    .line 50
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 51
    .line 52
    .line 53
    :try_start_4
    new-instance v1, LI5/h;

    .line 54
    .line 55
    invoke-direct {v1, v0}, LI5/h;-><init>(Lr/J;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, v1, LI5/h;->r:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, LI5/j;

    .line 61
    .line 62
    :goto_0
    invoke-virtual {v0}, LI5/j;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_0

    .line 67
    .line 68
    invoke-virtual {v0}, LI5/j;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, LP/w0;

    .line 73
    .line 74
    invoke-virtual {v1}, LI5/h;->remove()V

    .line 75
    .line 76
    .line 77
    invoke-interface {v2}, LP/w0;->c()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :catchall_2
    move-exception p1

    .line 82
    goto :goto_1

    .line 83
    :cond_0
    :try_start_5
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 88
    .line 89
    .line 90
    throw p1

    .line 91
    :cond_1
    :goto_2
    throw p1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 92
    :catch_0
    move-exception p1

    .line 93
    invoke-virtual {p0}, LP/u;->a()V

    .line 94
    .line 95
    .line 96
    throw p1

    .line 97
    :cond_2
    const/4 v0, 0x0

    .line 98
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    check-cast p1, Lm5/j;

    .line 103
    .line 104
    iget-object p1, p1, Lm5/j;->q:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast p1, LP/V;

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    const/4 p1, 0x0

    .line 112
    throw p1
.end method

.method public final q(LP/o0;Ljava/lang/Object;)LP/M;
    .locals 2

    .line 1
    iget v0, p1, LP/o0;->a:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x2

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    or-int/lit8 v0, v0, 0x4

    .line 8
    .line 9
    iput v0, p1, LP/o0;->a:I

    .line 10
    .line 11
    :cond_0
    iget-object v0, p1, LP/o0;->c:LP/a;

    .line 12
    .line 13
    if-eqz v0, :cond_5

    .line 14
    .line 15
    invoke-virtual {v0}, LP/a;->a()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget-object v1, p0, LP/u;->v:LP/A0;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, LP/A0;->j(LP/a;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    iget-object v0, p0, LP/u;->t:Ljava/lang/Object;

    .line 31
    .line 32
    monitor-enter v0

    .line 33
    :try_start_0
    iget-object v1, p0, LP/u;->F:LP/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    monitor-exit v0

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    iget-object v0, v1, LP/u;->I:LP/o;

    .line 39
    .line 40
    iget-boolean v1, v0, LP/o;->E:Z

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    invoke-virtual {v0, p1, p2}, LP/o;->Y(LP/o0;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    sget-object p1, LP/M;->t:LP/M;

    .line 51
    .line 52
    return-object p1

    .line 53
    :cond_2
    sget-object p1, LP/M;->q:LP/M;

    .line 54
    .line 55
    return-object p1

    .line 56
    :catchall_0
    move-exception p1

    .line 57
    monitor-exit v0

    .line 58
    throw p1

    .line 59
    :cond_3
    iget-object v1, p1, LP/o0;->d:LB5/e;

    .line 60
    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    invoke-virtual {p0, p1, v0, p2}, LP/u;->s(LP/o0;LP/a;Ljava/lang/Object;)LP/M;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    return-object p1

    .line 68
    :cond_4
    sget-object p1, LP/M;->q:LP/M;

    .line 69
    .line 70
    return-object p1

    .line 71
    :cond_5
    :goto_0
    sget-object p1, LP/M;->q:LP/M;

    .line 72
    .line 73
    return-object p1
.end method

.method public final r()V
    .locals 7

    .line 1
    iget-object v0, p0, LP/u;->t:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LP/u;->v:LP/A0;

    .line 5
    .line 6
    iget-object v1, v1, LP/A0;->s:[Ljava/lang/Object;

    .line 7
    .line 8
    array-length v2, v1

    .line 9
    const/4 v3, 0x0

    .line 10
    :goto_0
    if-ge v3, v2, :cond_2

    .line 11
    .line 12
    aget-object v4, v1, v3

    .line 13
    .line 14
    instance-of v5, v4, LP/o0;

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    if-eqz v5, :cond_0

    .line 18
    .line 19
    check-cast v4, LP/o0;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :catchall_0
    move-exception v1

    .line 23
    goto :goto_2

    .line 24
    :cond_0
    move-object v4, v6

    .line 25
    :goto_1
    if-eqz v4, :cond_1

    .line 26
    .line 27
    iget-object v5, v4, LP/o0;->b:LP/u;

    .line 28
    .line 29
    if-eqz v5, :cond_1

    .line 30
    .line 31
    invoke-virtual {v5, v4, v6}, LP/u;->q(LP/o0;Ljava/lang/Object;)LP/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    monitor-exit v0

    .line 38
    return-void

    .line 39
    :goto_2
    monitor-exit v0

    .line 40
    throw v1
.end method

.method public final s(LP/o0;LP/a;Ljava/lang/Object;)LP/M;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    iget-object v4, v1, LP/u;->t:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v4

    .line 12
    :try_start_0
    iget-object v5, v1, LP/u;->F:LP/u;

    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    if-eqz v5, :cond_3

    .line 16
    .line 17
    iget-object v7, v1, LP/u;->v:LP/A0;

    .line 18
    .line 19
    iget v8, v1, LP/u;->G:I

    .line 20
    .line 21
    iget-boolean v9, v7, LP/A0;->w:Z

    .line 22
    .line 23
    if-eqz v9, :cond_0

    .line 24
    .line 25
    const-string v9, "Writer is active"

    .line 26
    .line 27
    invoke-static {v9}, LP/p;->c(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    if-ltz v8, :cond_1

    .line 31
    .line 32
    iget v9, v7, LP/A0;->r:I

    .line 33
    .line 34
    if-ge v8, v9, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const-string v9, "Invalid group index"

    .line 38
    .line 39
    invoke-static {v9}, LP/p;->c(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-virtual {v7, v2}, LP/A0;->j(LP/a;)Z

    .line 43
    .line 44
    .line 45
    move-result v9

    .line 46
    if-eqz v9, :cond_2

    .line 47
    .line 48
    iget-object v7, v7, LP/A0;->q:[I

    .line 49
    .line 50
    mul-int/lit8 v9, v8, 0x5

    .line 51
    .line 52
    add-int/lit8 v9, v9, 0x3

    .line 53
    .line 54
    aget v7, v7, v9

    .line 55
    .line 56
    add-int/2addr v7, v8

    .line 57
    iget v9, v2, LP/a;->a:I

    .line 58
    .line 59
    if-gt v8, v9, :cond_2

    .line 60
    .line 61
    if-ge v9, v7, :cond_2

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    move-object v5, v6

    .line 65
    :goto_1
    move-object v6, v5

    .line 66
    goto :goto_2

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    goto/16 :goto_7

    .line 69
    .line 70
    :cond_3
    :goto_2
    if-nez v6, :cond_e

    .line 71
    .line 72
    iget-object v5, v1, LP/u;->I:LP/o;

    .line 73
    .line 74
    iget-boolean v7, v5, LP/o;->E:Z

    .line 75
    .line 76
    if-eqz v7, :cond_4

    .line 77
    .line 78
    invoke-virtual {v5, v0, v3}, LP/o;->Y(LP/o0;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-eqz v5, :cond_4

    .line 83
    .line 84
    const/4 v5, 0x1

    .line 85
    goto :goto_3

    .line 86
    :cond_4
    const/4 v5, 0x0

    .line 87
    :goto_3
    if-eqz v5, :cond_5

    .line 88
    .line 89
    sget-object v0, LP/M;->t:LP/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    .line 91
    monitor-exit v4

    .line 92
    return-object v0

    .line 93
    :cond_5
    :try_start_1
    iget-object v5, v1, LP/u;->H:LP/S;

    .line 94
    .line 95
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iget-object v5, v1, LP/u;->q:LP/r;

    .line 99
    .line 100
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    if-nez v3, :cond_6

    .line 104
    .line 105
    iget-object v5, v1, LP/u;->D:Lr/G;

    .line 106
    .line 107
    sget-object v7, LP/S;->u:LP/S;

    .line 108
    .line 109
    invoke-virtual {v5, v0, v7}, Lr/G;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    goto/16 :goto_6

    .line 113
    .line 114
    :cond_6
    instance-of v5, v3, LP/C;

    .line 115
    .line 116
    if-nez v5, :cond_7

    .line 117
    .line 118
    iget-object v5, v1, LP/u;->D:Lr/G;

    .line 119
    .line 120
    sget-object v7, LP/S;->u:LP/S;

    .line 121
    .line 122
    invoke-virtual {v5, v0, v7}, Lr/G;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    goto/16 :goto_6

    .line 126
    .line 127
    :cond_7
    iget-object v5, v1, LP/u;->D:Lr/G;

    .line 128
    .line 129
    invoke-virtual {v5, v0}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    if-eqz v5, :cond_d

    .line 134
    .line 135
    instance-of v7, v5, Lr/H;

    .line 136
    .line 137
    if-eqz v7, :cond_c

    .line 138
    .line 139
    check-cast v5, Lr/H;

    .line 140
    .line 141
    iget-object v7, v5, Lr/H;->b:[Ljava/lang/Object;

    .line 142
    .line 143
    iget-object v5, v5, Lr/H;->a:[J

    .line 144
    .line 145
    array-length v9, v5

    .line 146
    add-int/lit8 v9, v9, -0x2

    .line 147
    .line 148
    if-ltz v9, :cond_d

    .line 149
    .line 150
    const/4 v10, 0x0

    .line 151
    :goto_4
    aget-wide v11, v5, v10

    .line 152
    .line 153
    not-long v13, v11

    .line 154
    const/4 v15, 0x7

    .line 155
    shl-long/2addr v13, v15

    .line 156
    and-long/2addr v13, v11

    .line 157
    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    and-long/2addr v13, v15

    .line 163
    cmp-long v13, v13, v15

    .line 164
    .line 165
    if-eqz v13, :cond_b

    .line 166
    .line 167
    sub-int v13, v10, v9

    .line 168
    .line 169
    not-int v13, v13

    .line 170
    ushr-int/lit8 v13, v13, 0x1f

    .line 171
    .line 172
    const/16 v14, 0x8

    .line 173
    .line 174
    rsub-int/lit8 v13, v13, 0x8

    .line 175
    .line 176
    const/4 v15, 0x0

    .line 177
    :goto_5
    if-ge v15, v13, :cond_a

    .line 178
    .line 179
    const-wide/16 v16, 0xff

    .line 180
    .line 181
    and-long v16, v11, v16

    .line 182
    .line 183
    const-wide/16 v18, 0x80

    .line 184
    .line 185
    cmp-long v16, v16, v18

    .line 186
    .line 187
    if-gez v16, :cond_8

    .line 188
    .line 189
    shl-int/lit8 v16, v10, 0x3

    .line 190
    .line 191
    add-int v16, v16, v15

    .line 192
    .line 193
    aget-object v8, v7, v16

    .line 194
    .line 195
    move/from16 v16, v14

    .line 196
    .line 197
    sget-object v14, LP/S;->u:LP/S;

    .line 198
    .line 199
    if-ne v8, v14, :cond_9

    .line 200
    .line 201
    goto :goto_6

    .line 202
    :cond_8
    move/from16 v16, v14

    .line 203
    .line 204
    :cond_9
    shr-long v11, v11, v16

    .line 205
    .line 206
    add-int/lit8 v15, v15, 0x1

    .line 207
    .line 208
    move/from16 v14, v16

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_a
    move v8, v14

    .line 212
    if-ne v13, v8, :cond_d

    .line 213
    .line 214
    :cond_b
    if-eq v10, v9, :cond_d

    .line 215
    .line 216
    add-int/lit8 v10, v10, 0x1

    .line 217
    .line 218
    goto :goto_4

    .line 219
    :cond_c
    sget-object v7, LP/S;->u:LP/S;

    .line 220
    .line 221
    if-ne v5, v7, :cond_d

    .line 222
    .line 223
    goto :goto_6

    .line 224
    :cond_d
    iget-object v5, v1, LP/u;->D:Lr/G;

    .line 225
    .line 226
    invoke-static {v5, v0, v3}, La/a;->e(Lr/G;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 227
    .line 228
    .line 229
    :cond_e
    :goto_6
    monitor-exit v4

    .line 230
    if-eqz v6, :cond_f

    .line 231
    .line 232
    invoke-virtual {v6, v0, v2, v3}, LP/u;->s(LP/o0;LP/a;Ljava/lang/Object;)LP/M;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    return-object v0

    .line 237
    :cond_f
    iget-object v0, v1, LP/u;->q:LP/r;

    .line 238
    .line 239
    invoke-virtual {v0, v1}, LP/r;->i(LP/u;)V

    .line 240
    .line 241
    .line 242
    iget-object v0, v1, LP/u;->I:LP/o;

    .line 243
    .line 244
    iget-boolean v0, v0, LP/o;->E:Z

    .line 245
    .line 246
    if-eqz v0, :cond_10

    .line 247
    .line 248
    sget-object v0, LP/M;->s:LP/M;

    .line 249
    .line 250
    return-object v0

    .line 251
    :cond_10
    sget-object v0, LP/M;->r:LP/M;

    .line 252
    .line 253
    return-object v0

    .line 254
    :goto_7
    monitor-exit v4

    .line 255
    throw v0
.end method

.method public final t(Ljava/lang/Object;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, LP/u;->w:Lr/G;

    .line 6
    .line 7
    invoke-virtual {v2, v1}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_4

    .line 12
    .line 13
    instance-of v3, v2, Lr/H;

    .line 14
    .line 15
    iget-object v4, v0, LP/u;->C:Lr/G;

    .line 16
    .line 17
    if-eqz v3, :cond_3

    .line 18
    .line 19
    check-cast v2, Lr/H;

    .line 20
    .line 21
    iget-object v3, v2, Lr/H;->b:[Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v2, v2, Lr/H;->a:[J

    .line 24
    .line 25
    array-length v5, v2

    .line 26
    add-int/lit8 v5, v5, -0x2

    .line 27
    .line 28
    if-ltz v5, :cond_4

    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    move v7, v6

    .line 32
    :goto_0
    aget-wide v8, v2, v7

    .line 33
    .line 34
    not-long v10, v8

    .line 35
    const/4 v12, 0x7

    .line 36
    shl-long/2addr v10, v12

    .line 37
    and-long/2addr v10, v8

    .line 38
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    and-long/2addr v10, v12

    .line 44
    cmp-long v10, v10, v12

    .line 45
    .line 46
    if-eqz v10, :cond_2

    .line 47
    .line 48
    sub-int v10, v7, v5

    .line 49
    .line 50
    not-int v10, v10

    .line 51
    ushr-int/lit8 v10, v10, 0x1f

    .line 52
    .line 53
    const/16 v11, 0x8

    .line 54
    .line 55
    rsub-int/lit8 v10, v10, 0x8

    .line 56
    .line 57
    move v12, v6

    .line 58
    :goto_1
    if-ge v12, v10, :cond_1

    .line 59
    .line 60
    const-wide/16 v13, 0xff

    .line 61
    .line 62
    and-long/2addr v13, v8

    .line 63
    const-wide/16 v15, 0x80

    .line 64
    .line 65
    cmp-long v13, v13, v15

    .line 66
    .line 67
    if-gez v13, :cond_0

    .line 68
    .line 69
    shl-int/lit8 v13, v7, 0x3

    .line 70
    .line 71
    add-int/2addr v13, v12

    .line 72
    aget-object v13, v3, v13

    .line 73
    .line 74
    check-cast v13, LP/o0;

    .line 75
    .line 76
    invoke-virtual {v13, v1}, LP/o0;->c(Ljava/lang/Object;)LP/M;

    .line 77
    .line 78
    .line 79
    move-result-object v14

    .line 80
    sget-object v15, LP/M;->t:LP/M;

    .line 81
    .line 82
    if-ne v14, v15, :cond_0

    .line 83
    .line 84
    invoke-static {v4, v1, v13}, La/a;->e(Lr/G;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :cond_0
    shr-long/2addr v8, v11

    .line 88
    add-int/lit8 v12, v12, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    if-ne v10, v11, :cond_4

    .line 92
    .line 93
    :cond_2
    if-eq v7, v5, :cond_4

    .line 94
    .line 95
    add-int/lit8 v7, v7, 0x1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_3
    check-cast v2, LP/o0;

    .line 99
    .line 100
    invoke-virtual {v2, v1}, LP/o0;->c(Ljava/lang/Object;)LP/M;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    sget-object v5, LP/M;->t:LP/M;

    .line 105
    .line 106
    if-ne v3, v5, :cond_4

    .line 107
    .line 108
    invoke-static {v4, v1, v2}, La/a;->e(Lr/G;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :cond_4
    return-void
.end method

.method public final u(Ljava/util/Set;)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, LR/h;

    .line 6
    .line 7
    iget-object v3, v0, LP/u;->z:Lr/G;

    .line 8
    .line 9
    iget-object v4, v0, LP/u;->w:Lr/G;

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x1

    .line 13
    if-eqz v2, :cond_4

    .line 14
    .line 15
    check-cast v1, LR/h;

    .line 16
    .line 17
    iget-object v1, v1, LR/h;->q:Lr/H;

    .line 18
    .line 19
    iget-object v2, v1, Lr/H;->b:[Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v1, v1, Lr/H;->a:[J

    .line 22
    .line 23
    array-length v7, v1

    .line 24
    add-int/lit8 v7, v7, -0x2

    .line 25
    .line 26
    if-ltz v7, :cond_7

    .line 27
    .line 28
    move v8, v5

    .line 29
    :goto_0
    aget-wide v9, v1, v8

    .line 30
    .line 31
    not-long v11, v9

    .line 32
    const/4 v13, 0x7

    .line 33
    shl-long/2addr v11, v13

    .line 34
    and-long/2addr v11, v9

    .line 35
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    and-long/2addr v11, v13

    .line 41
    cmp-long v11, v11, v13

    .line 42
    .line 43
    if-eqz v11, :cond_3

    .line 44
    .line 45
    sub-int v11, v8, v7

    .line 46
    .line 47
    not-int v11, v11

    .line 48
    ushr-int/lit8 v11, v11, 0x1f

    .line 49
    .line 50
    const/16 v12, 0x8

    .line 51
    .line 52
    rsub-int/lit8 v11, v11, 0x8

    .line 53
    .line 54
    move v13, v5

    .line 55
    :goto_1
    if-ge v13, v11, :cond_2

    .line 56
    .line 57
    const-wide/16 v14, 0xff

    .line 58
    .line 59
    and-long/2addr v14, v9

    .line 60
    const-wide/16 v16, 0x80

    .line 61
    .line 62
    cmp-long v14, v14, v16

    .line 63
    .line 64
    if-gez v14, :cond_1

    .line 65
    .line 66
    shl-int/lit8 v14, v8, 0x3

    .line 67
    .line 68
    add-int/2addr v14, v13

    .line 69
    aget-object v14, v2, v14

    .line 70
    .line 71
    invoke-virtual {v4, v14}, Lr/G;->c(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v15

    .line 75
    if-nez v15, :cond_0

    .line 76
    .line 77
    invoke-virtual {v3, v14}, Lr/G;->c(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v14

    .line 81
    if-eqz v14, :cond_1

    .line 82
    .line 83
    :cond_0
    return v6

    .line 84
    :cond_1
    shr-long/2addr v9, v12

    .line 85
    add-int/lit8 v13, v13, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    if-ne v11, v12, :cond_7

    .line 89
    .line 90
    :cond_3
    if-eq v8, v7, :cond_7

    .line 91
    .line 92
    add-int/lit8 v8, v8, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_4
    check-cast v1, Ljava/lang/Iterable;

    .line 96
    .line 97
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-eqz v2, :cond_7

    .line 106
    .line 107
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {v4, v2}, Lr/G;->c(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    if-nez v7, :cond_6

    .line 116
    .line 117
    invoke-virtual {v3, v2}, Lr/G;->c(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-eqz v2, :cond_5

    .line 122
    .line 123
    :cond_6
    return v6

    .line 124
    :cond_7
    return v5
.end method

.method public final v()Z
    .locals 4

    .line 1
    iget-object v0, p0, LP/u;->t:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, LP/u;->m()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 5
    .line 6
    .line 7
    :try_start_1
    iget-object v1, p0, LP/u;->D:Lr/G;

    .line 8
    .line 9
    invoke-static {}, La/a;->q()Lr/G;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iput-object v2, p0, LP/u;->D:Lr/G;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    .line 15
    :try_start_2
    iget-object v2, p0, LP/u;->H:LP/S;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, LP/u;->q:LP/r;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, LP/u;->I:LP/o;

    .line 26
    .line 27
    invoke-virtual {v2, v1}, LP/o;->B(Lr/G;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0}, LP/u;->n()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception v1

    .line 38
    goto :goto_2

    .line 39
    :catch_0
    move-exception v2

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    :goto_0
    monitor-exit v0

    .line 42
    return v2

    .line 43
    :goto_1
    :try_start_3
    iput-object v1, p0, LP/u;->D:Lr/G;

    .line 44
    .line 45
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 46
    :goto_2
    :try_start_4
    iget-object v2, p0, LP/u;->u:Lr/J;

    .line 47
    .line 48
    iget-object v2, v2, Lr/J;->q:Lr/H;

    .line 49
    .line 50
    invoke-virtual {v2}, Lr/H;->g()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-nez v2, :cond_2

    .line 55
    .line 56
    iget-object v2, p0, LP/u;->u:Lr/J;

    .line 57
    .line 58
    new-instance v3, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    iget-object v3, v2, Lr/J;->q:Lr/H;

    .line 64
    .line 65
    invoke-virtual {v3}, Lr/H;->g()Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-nez v3, :cond_2

    .line 70
    .line 71
    const-string v3, "Compose:abandons"

    .line 72
    .line 73
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 74
    .line 75
    .line 76
    :try_start_5
    new-instance v3, LI5/h;

    .line 77
    .line 78
    invoke-direct {v3, v2}, LI5/h;-><init>(Lr/J;)V

    .line 79
    .line 80
    .line 81
    :goto_3
    iget-object v2, v3, LI5/h;->r:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v2, LI5/j;

    .line 84
    .line 85
    invoke-virtual {v2}, LI5/j;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_1

    .line 90
    .line 91
    iget-object v2, v3, LI5/h;->r:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v2, LI5/j;

    .line 94
    .line 95
    invoke-virtual {v2}, LI5/j;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    check-cast v2, LP/w0;

    .line 100
    .line 101
    invoke-virtual {v3}, LI5/h;->remove()V

    .line 102
    .line 103
    .line 104
    invoke-interface {v2}, LP/w0;->c()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 105
    .line 106
    .line 107
    goto :goto_3

    .line 108
    :catchall_1
    move-exception v1

    .line 109
    goto :goto_4

    .line 110
    :cond_1
    :try_start_6
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 111
    .line 112
    .line 113
    goto :goto_5

    .line 114
    :goto_4
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 115
    .line 116
    .line 117
    throw v1

    .line 118
    :catchall_2
    move-exception v1

    .line 119
    goto :goto_7

    .line 120
    :catch_1
    move-exception v1

    .line 121
    goto :goto_6

    .line 122
    :cond_2
    :goto_5
    throw v1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 123
    :goto_6
    :try_start_7
    invoke-virtual {p0}, LP/u;->a()V

    .line 124
    .line 125
    .line 126
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 127
    :goto_7
    monitor-exit v0

    .line 128
    throw v1
.end method

.method public final w(LR/h;)V
    .locals 6

    .line 1
    :cond_0
    iget-object v0, p0, LP/u;->s:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    move v2, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_1
    sget-object v2, LP/b;->a:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    :goto_0
    const/4 v3, 0x0

    .line 19
    if-eqz v2, :cond_2

    .line 20
    .line 21
    move-object v2, p1

    .line 22
    goto :goto_1

    .line 23
    :cond_2
    instance-of v2, v0, Ljava/util/Set;

    .line 24
    .line 25
    if-eqz v2, :cond_3

    .line 26
    .line 27
    const/4 v2, 0x2

    .line 28
    new-array v2, v2, [Ljava/util/Set;

    .line 29
    .line 30
    aput-object v0, v2, v3

    .line 31
    .line 32
    aput-object p1, v2, v1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_3
    instance-of v2, v0, [Ljava/lang/Object;

    .line 36
    .line 37
    if-eqz v2, :cond_7

    .line 38
    .line 39
    const-string v2, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>"

    .line 40
    .line 41
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    move-object v2, v0

    .line 45
    check-cast v2, [Ljava/util/Set;

    .line 46
    .line 47
    const-string v4, "<this>"

    .line 48
    .line 49
    invoke-static {v2, v4}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    array-length v4, v2

    .line 53
    add-int/lit8 v5, v4, 0x1

    .line 54
    .line 55
    invoke-static {v2, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    aput-object p1, v2, v4

    .line 60
    .line 61
    :goto_1
    iget-object v4, p0, LP/u;->s:Ljava/util/concurrent/atomic/AtomicReference;

    .line 62
    .line 63
    :cond_4
    invoke-virtual {v4, v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_5

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_5
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    if-eq v5, v0, :cond_4

    .line 75
    .line 76
    move v1, v3

    .line 77
    :goto_2
    if-eqz v1, :cond_0

    .line 78
    .line 79
    if-nez v0, :cond_6

    .line 80
    .line 81
    iget-object p1, p0, LP/u;->t:Ljava/lang/Object;

    .line 82
    .line 83
    monitor-enter p1

    .line 84
    :try_start_0
    invoke-virtual {p0}, LP/u;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    .line 87
    monitor-exit p1

    .line 88
    return-void

    .line 89
    :catchall_0
    move-exception v0

    .line 90
    monitor-exit p1

    .line 91
    throw v0

    .line 92
    :cond_6
    return-void

    .line 93
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 94
    .line 95
    new-instance v0, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v1, "corrupt pendingModifications: "

    .line 98
    .line 99
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    iget-object v1, p0, LP/u;->s:Ljava/util/concurrent/atomic/AtomicReference;

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw p1
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, LP/u;->I:LP/o;

    .line 6
    .line 7
    iget v3, v2, LP/o;->z:I

    .line 8
    .line 9
    if-lez v3, :cond_0

    .line 10
    .line 11
    goto/16 :goto_7

    .line 12
    .line 13
    :cond_0
    invoke-virtual {v2}, LP/o;->v()LP/o0;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-eqz v2, :cond_c

    .line 18
    .line 19
    iget v3, v2, LP/o0;->a:I

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    or-int/2addr v3, v4

    .line 23
    iput v3, v2, LP/o0;->a:I

    .line 24
    .line 25
    and-int/lit8 v3, v3, 0x20

    .line 26
    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    iget-object v3, v2, LP/o0;->f:Lr/B;

    .line 31
    .line 32
    if-nez v3, :cond_2

    .line 33
    .line 34
    new-instance v3, Lr/B;

    .line 35
    .line 36
    invoke-direct {v3}, Lr/B;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v3, v2, LP/o0;->f:Lr/B;

    .line 40
    .line 41
    :cond_2
    iget v5, v2, LP/o0;->e:I

    .line 42
    .line 43
    invoke-virtual {v3, v1}, Lr/B;->c(Ljava/lang/Object;)I

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    if-gez v6, :cond_3

    .line 48
    .line 49
    not-int v6, v6

    .line 50
    const/4 v7, -0x1

    .line 51
    goto :goto_0

    .line 52
    :cond_3
    iget-object v7, v3, Lr/B;->c:[I

    .line 53
    .line 54
    aget v7, v7, v6

    .line 55
    .line 56
    :goto_0
    iget-object v8, v3, Lr/B;->b:[Ljava/lang/Object;

    .line 57
    .line 58
    aput-object v1, v8, v6

    .line 59
    .line 60
    iget-object v3, v3, Lr/B;->c:[I

    .line 61
    .line 62
    aput v5, v3, v6

    .line 63
    .line 64
    iget v3, v2, LP/o0;->e:I

    .line 65
    .line 66
    if-ne v7, v3, :cond_4

    .line 67
    .line 68
    goto/16 :goto_7

    .line 69
    .line 70
    :cond_4
    :goto_1
    instance-of v3, v1, La0/v;

    .line 71
    .line 72
    if-eqz v3, :cond_5

    .line 73
    .line 74
    move-object v3, v1

    .line 75
    check-cast v3, La0/v;

    .line 76
    .line 77
    invoke-virtual {v3, v4}, La0/v;->c(I)V

    .line 78
    .line 79
    .line 80
    :cond_5
    iget-object v3, v0, LP/u;->w:Lr/G;

    .line 81
    .line 82
    invoke-static {v3, v1, v2}, La/a;->e(Lr/G;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    instance-of v3, v1, LP/C;

    .line 86
    .line 87
    if-eqz v3, :cond_c

    .line 88
    .line 89
    move-object v3, v1

    .line 90
    check-cast v3, LP/C;

    .line 91
    .line 92
    invoke-virtual {v3}, LP/C;->f()LP/B;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    iget-object v6, v0, LP/u;->z:Lr/G;

    .line 97
    .line 98
    invoke-static {v6, v1}, La/a;->L(Lr/G;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    iget-object v7, v5, LP/B;->e:Lr/B;

    .line 102
    .line 103
    iget-object v8, v7, Lr/B;->b:[Ljava/lang/Object;

    .line 104
    .line 105
    iget-object v7, v7, Lr/B;->a:[J

    .line 106
    .line 107
    array-length v9, v7

    .line 108
    add-int/lit8 v9, v9, -0x2

    .line 109
    .line 110
    if-ltz v9, :cond_a

    .line 111
    .line 112
    const/4 v11, 0x0

    .line 113
    :goto_2
    aget-wide v12, v7, v11

    .line 114
    .line 115
    not-long v14, v12

    .line 116
    const/16 v16, 0x7

    .line 117
    .line 118
    shl-long v14, v14, v16

    .line 119
    .line 120
    and-long/2addr v14, v12

    .line 121
    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    and-long v14, v14, v16

    .line 127
    .line 128
    cmp-long v14, v14, v16

    .line 129
    .line 130
    if-eqz v14, :cond_9

    .line 131
    .line 132
    sub-int v14, v11, v9

    .line 133
    .line 134
    not-int v14, v14

    .line 135
    ushr-int/lit8 v14, v14, 0x1f

    .line 136
    .line 137
    const/16 v15, 0x8

    .line 138
    .line 139
    rsub-int/lit8 v14, v14, 0x8

    .line 140
    .line 141
    const/4 v10, 0x0

    .line 142
    :goto_3
    if-ge v10, v14, :cond_8

    .line 143
    .line 144
    const-wide/16 v17, 0xff

    .line 145
    .line 146
    and-long v17, v12, v17

    .line 147
    .line 148
    const-wide/16 v19, 0x80

    .line 149
    .line 150
    cmp-long v17, v17, v19

    .line 151
    .line 152
    if-gez v17, :cond_7

    .line 153
    .line 154
    shl-int/lit8 v17, v11, 0x3

    .line 155
    .line 156
    add-int v17, v17, v10

    .line 157
    .line 158
    aget-object v17, v8, v17

    .line 159
    .line 160
    move/from16 v18, v15

    .line 161
    .line 162
    move-object/from16 v15, v17

    .line 163
    .line 164
    check-cast v15, La0/u;

    .line 165
    .line 166
    instance-of v4, v15, La0/v;

    .line 167
    .line 168
    if-eqz v4, :cond_6

    .line 169
    .line 170
    move-object v4, v15

    .line 171
    check-cast v4, La0/v;

    .line 172
    .line 173
    const/4 v0, 0x1

    .line 174
    invoke-virtual {v4, v0}, La0/v;->c(I)V

    .line 175
    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_6
    const/4 v0, 0x1

    .line 179
    :goto_4
    invoke-static {v6, v15, v1}, La/a;->e(Lr/G;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_7
    move v0, v4

    .line 184
    move/from16 v18, v15

    .line 185
    .line 186
    :goto_5
    shr-long v12, v12, v18

    .line 187
    .line 188
    add-int/lit8 v10, v10, 0x1

    .line 189
    .line 190
    move v4, v0

    .line 191
    move/from16 v15, v18

    .line 192
    .line 193
    move-object/from16 v0, p0

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_8
    move v0, v4

    .line 197
    move v4, v15

    .line 198
    if-ne v14, v4, :cond_a

    .line 199
    .line 200
    goto :goto_6

    .line 201
    :cond_9
    move v0, v4

    .line 202
    :goto_6
    if-eq v11, v9, :cond_a

    .line 203
    .line 204
    add-int/lit8 v11, v11, 0x1

    .line 205
    .line 206
    move v4, v0

    .line 207
    move-object/from16 v0, p0

    .line 208
    .line 209
    goto :goto_2

    .line 210
    :cond_a
    iget-object v0, v5, LP/B;->f:Ljava/lang/Object;

    .line 211
    .line 212
    iget-object v1, v2, LP/o0;->g:Lr/G;

    .line 213
    .line 214
    if-nez v1, :cond_b

    .line 215
    .line 216
    new-instance v1, Lr/G;

    .line 217
    .line 218
    invoke-direct {v1}, Lr/G;-><init>()V

    .line 219
    .line 220
    .line 221
    iput-object v1, v2, LP/o0;->g:Lr/G;

    .line 222
    .line 223
    :cond_b
    invoke-virtual {v1, v3, v0}, Lr/G;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    :cond_c
    :goto_7
    return-void
.end method

.method public final y(Ljava/lang/Object;)V
    .locals 14

    .line 1
    iget-object v0, p0, LP/u;->t:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0, p1}, LP/u;->t(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, LP/u;->z:Lr/G;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_4

    .line 14
    .line 15
    instance-of v1, p1, Lr/H;

    .line 16
    .line 17
    if-eqz v1, :cond_3

    .line 18
    .line 19
    check-cast p1, Lr/H;

    .line 20
    .line 21
    iget-object v1, p1, Lr/H;->b:[Ljava/lang/Object;

    .line 22
    .line 23
    iget-object p1, p1, Lr/H;->a:[J

    .line 24
    .line 25
    array-length v2, p1

    .line 26
    add-int/lit8 v2, v2, -0x2

    .line 27
    .line 28
    if-ltz v2, :cond_4

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    move v4, v3

    .line 32
    :goto_0
    aget-wide v5, p1, v4

    .line 33
    .line 34
    not-long v7, v5

    .line 35
    const/4 v9, 0x7

    .line 36
    shl-long/2addr v7, v9

    .line 37
    and-long/2addr v7, v5

    .line 38
    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    and-long/2addr v7, v9

    .line 44
    cmp-long v7, v7, v9

    .line 45
    .line 46
    if-eqz v7, :cond_2

    .line 47
    .line 48
    sub-int v7, v4, v2

    .line 49
    .line 50
    not-int v7, v7

    .line 51
    ushr-int/lit8 v7, v7, 0x1f

    .line 52
    .line 53
    const/16 v8, 0x8

    .line 54
    .line 55
    rsub-int/lit8 v7, v7, 0x8

    .line 56
    .line 57
    move v9, v3

    .line 58
    :goto_1
    if-ge v9, v7, :cond_1

    .line 59
    .line 60
    const-wide/16 v10, 0xff

    .line 61
    .line 62
    and-long/2addr v10, v5

    .line 63
    const-wide/16 v12, 0x80

    .line 64
    .line 65
    cmp-long v10, v10, v12

    .line 66
    .line 67
    if-gez v10, :cond_0

    .line 68
    .line 69
    shl-int/lit8 v10, v4, 0x3

    .line 70
    .line 71
    add-int/2addr v10, v9

    .line 72
    aget-object v10, v1, v10

    .line 73
    .line 74
    check-cast v10, LP/C;

    .line 75
    .line 76
    invoke-virtual {p0, v10}, LP/u;->t(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :catchall_0
    move-exception p1

    .line 81
    goto :goto_3

    .line 82
    :cond_0
    :goto_2
    shr-long/2addr v5, v8

    .line 83
    add-int/lit8 v9, v9, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_1
    if-ne v7, v8, :cond_4

    .line 87
    .line 88
    :cond_2
    if-eq v4, v2, :cond_4

    .line 89
    .line 90
    add-int/lit8 v4, v4, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    check-cast p1, LP/C;

    .line 94
    .line 95
    invoke-virtual {p0, p1}, LP/u;->t(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    .line 97
    .line 98
    :cond_4
    monitor-exit v0

    .line 99
    return-void

    .line 100
    :goto_3
    monitor-exit v0

    .line 101
    throw p1
.end method
