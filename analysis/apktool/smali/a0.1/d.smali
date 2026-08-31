.class public La0/d;
.super La0/h;
.source "SourceFile"


# static fields
.field public static final n:[I


# instance fields
.field public final e:LB5/c;

.field public final f:LB5/c;

.field public g:I

.field public h:Lr/H;

.field public i:Ljava/util/ArrayList;

.field public j:La0/l;

.field public k:[I

.field public l:I

.field public m:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    sput-object v0, La0/d;->n:[I

    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(JLa0/l;LB5/c;LB5/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, La0/h;-><init>(JLa0/l;)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, La0/d;->e:LB5/c;

    .line 5
    .line 6
    iput-object p5, p0, La0/d;->f:LB5/c;

    .line 7
    .line 8
    sget-object p1, La0/l;->u:La0/l;

    .line 9
    .line 10
    iput-object p1, p0, La0/d;->j:La0/l;

    .line 11
    .line 12
    sget-object p1, La0/d;->n:[I

    .line 13
    .line 14
    iput-object p1, p0, La0/d;->k:[I

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput p1, p0, La0/d;->l:I

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final A(J)V
    .locals 2

    .line 1
    sget-object v0, La0/n;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, La0/d;->j:La0/l;

    .line 5
    .line 6
    invoke-virtual {v1, p1, p2}, La0/l;->j(J)La0/l;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, La0/d;->j:La0/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit v0

    .line 16
    throw p1
.end method

.method public B(Lr/H;)V
    .locals 0

    .line 1
    iput-object p1, p0, La0/d;->h:Lr/H;

    .line 2
    .line 3
    return-void
.end method

.method public C(LB5/c;LB5/c;)La0/d;
    .locals 11

    .line 1
    iget-boolean v0, p0, La0/h;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Cannot use a disposed snapshot"

    .line 6
    .line 7
    invoke-static {v0}, LP/j0;->a(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-boolean v0, p0, La0/d;->m:Z

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    iget v0, p0, La0/h;->d:I

    .line 15
    .line 16
    if-ltz v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const-string v0, "Unsupported operation on a disposed or applied snapshot"

    .line 20
    .line 21
    invoke-static {v0}, LP/j0;->b(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_2
    :goto_0
    invoke-virtual {p0}, La0/h;->g()J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    invoke-virtual {p0, v0, v1}, La0/d;->A(J)V

    .line 29
    .line 30
    .line 31
    sget-object v1, La0/n;->b:Ljava/lang/Object;

    .line 32
    .line 33
    monitor-enter v1

    .line 34
    :try_start_0
    sget-wide v3, La0/n;->d:J

    .line 35
    .line 36
    const-wide/16 v9, 0x1

    .line 37
    .line 38
    add-long v5, v3, v9

    .line 39
    .line 40
    sput-wide v5, La0/n;->d:J

    .line 41
    .line 42
    sget-object v0, La0/n;->c:La0/l;

    .line 43
    .line 44
    invoke-virtual {v0, v3, v4}, La0/l;->j(J)La0/l;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sput-object v0, La0/n;->c:La0/l;

    .line 49
    .line 50
    invoke-virtual {p0}, La0/h;->d()La0/l;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0, v3, v4}, La0/l;->j(J)La0/l;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {p0, v2}, La0/h;->r(La0/l;)V

    .line 59
    .line 60
    .line 61
    new-instance v2, La0/e;

    .line 62
    .line 63
    invoke-virtual {p0}, La0/h;->g()J

    .line 64
    .line 65
    .line 66
    move-result-wide v5

    .line 67
    add-long/2addr v5, v9

    .line 68
    invoke-static {v0, v5, v6, v3, v4}, La0/n;->e(La0/l;JJ)La0/l;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-virtual {p0}, La0/d;->y()LB5/c;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const/4 v6, 0x1

    .line 77
    invoke-static {p1, v0, v6}, La0/n;->l(LB5/c;LB5/c;Z)LB5/c;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-virtual {p0}, La0/d;->i()LB5/c;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-static {p2, p1}, La0/n;->b(LB5/c;LB5/c;)LB5/c;

    .line 86
    .line 87
    .line 88
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 89
    move-object v8, p0

    .line 90
    :try_start_1
    invoke-direct/range {v2 .. v8}, La0/e;-><init>(JLa0/l;LB5/c;LB5/c;La0/d;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 91
    .line 92
    .line 93
    monitor-exit v1

    .line 94
    iget-boolean p1, v8, La0/d;->m:Z

    .line 95
    .line 96
    if-nez p1, :cond_3

    .line 97
    .line 98
    iget-boolean p1, v8, La0/h;->c:Z

    .line 99
    .line 100
    if-nez p1, :cond_3

    .line 101
    .line 102
    invoke-virtual {p0}, La0/h;->g()J

    .line 103
    .line 104
    .line 105
    move-result-wide p1

    .line 106
    monitor-enter v1

    .line 107
    :try_start_2
    sget-wide v3, La0/n;->d:J

    .line 108
    .line 109
    add-long v5, v3, v9

    .line 110
    .line 111
    sput-wide v5, La0/n;->d:J

    .line 112
    .line 113
    invoke-virtual {p0, v3, v4}, La0/h;->s(J)V

    .line 114
    .line 115
    .line 116
    sget-object v0, La0/n;->c:La0/l;

    .line 117
    .line 118
    invoke-virtual {p0}, La0/h;->g()J

    .line 119
    .line 120
    .line 121
    move-result-wide v3

    .line 122
    invoke-virtual {v0, v3, v4}, La0/l;->j(J)La0/l;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    sput-object v0, La0/n;->c:La0/l;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 127
    .line 128
    monitor-exit v1

    .line 129
    invoke-virtual {p0}, La0/h;->d()La0/l;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    add-long/2addr p1, v9

    .line 134
    invoke-virtual {p0}, La0/h;->g()J

    .line 135
    .line 136
    .line 137
    move-result-wide v3

    .line 138
    invoke-static {v0, p1, p2, v3, v4}, La0/n;->e(La0/l;JJ)La0/l;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p0, p1}, La0/h;->r(La0/l;)V

    .line 143
    .line 144
    .line 145
    return-object v2

    .line 146
    :catchall_0
    move-exception v0

    .line 147
    move-object p1, v0

    .line 148
    monitor-exit v1

    .line 149
    throw p1

    .line 150
    :cond_3
    return-object v2

    .line 151
    :catchall_1
    move-exception v0

    .line 152
    :goto_1
    move-object p1, v0

    .line 153
    goto :goto_2

    .line 154
    :catchall_2
    move-exception v0

    .line 155
    move-object v8, p0

    .line 156
    goto :goto_1

    .line 157
    :goto_2
    monitor-exit v1

    .line 158
    throw p1
.end method

.method public final b()V
    .locals 3

    .line 1
    sget-object v0, La0/n;->c:La0/l;

    .line 2
    .line 3
    invoke-virtual {p0}, La0/h;->g()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0, v1, v2}, La0/l;->g(J)La0/l;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, La0/d;->j:La0/l;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, La0/l;->d(La0/l;)La0/l;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, La0/n;->c:La0/l;

    .line 18
    .line 19
    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    iget-boolean v0, p0, La0/h;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, La0/h;->c:Z

    .line 7
    .line 8
    sget-object v0, La0/n;->b:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    invoke-virtual {p0}, La0/h;->o()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    monitor-exit v0

    .line 15
    invoke-virtual {p0}, La0/d;->l()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    monitor-exit v0

    .line 21
    throw v1

    .line 22
    :cond_0
    return-void
.end method

.method public bridge synthetic e()LB5/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, La0/d;->y()LB5/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public f()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public h()I
    .locals 1

    .line 1
    iget v0, p0, La0/d;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public i()LB5/c;
    .locals 1

    .line 1
    iget-object v0, p0, La0/d;->f:LB5/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public k()V
    .locals 1

    .line 1
    iget v0, p0, La0/d;->l:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, La0/d;->l:I

    .line 6
    .line 7
    return-void
.end method

.method public l()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, La0/d;->l:I

    .line 4
    .line 5
    if-lez v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string v1, "no pending nested snapshots"

    .line 9
    .line 10
    invoke-static {v1}, LP/j0;->a(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    :goto_0
    iget v1, v0, La0/d;->l:I

    .line 14
    .line 15
    add-int/lit8 v1, v1, -0x1

    .line 16
    .line 17
    iput v1, v0, La0/d;->l:I

    .line 18
    .line 19
    if-nez v1, :cond_8

    .line 20
    .line 21
    iget-boolean v1, v0, La0/d;->m:Z

    .line 22
    .line 23
    if-nez v1, :cond_8

    .line 24
    .line 25
    invoke-virtual {v0}, La0/d;->x()Lr/H;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-eqz v1, :cond_7

    .line 30
    .line 31
    iget-boolean v2, v0, La0/d;->m:Z

    .line 32
    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    const-string v2, "Unsupported operation on a snapshot that has been applied"

    .line 36
    .line 37
    invoke-static {v2}, LP/j0;->b(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    const/4 v2, 0x0

    .line 41
    invoke-virtual {v0, v2}, La0/d;->B(Lr/H;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, La0/h;->g()J

    .line 45
    .line 46
    .line 47
    move-result-wide v2

    .line 48
    iget-object v4, v1, Lr/H;->b:[Ljava/lang/Object;

    .line 49
    .line 50
    iget-object v1, v1, Lr/H;->a:[J

    .line 51
    .line 52
    array-length v5, v1

    .line 53
    add-int/lit8 v5, v5, -0x2

    .line 54
    .line 55
    if-ltz v5, :cond_7

    .line 56
    .line 57
    const/4 v7, 0x0

    .line 58
    :goto_1
    aget-wide v8, v1, v7

    .line 59
    .line 60
    not-long v10, v8

    .line 61
    const/4 v12, 0x7

    .line 62
    shl-long/2addr v10, v12

    .line 63
    and-long/2addr v10, v8

    .line 64
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    and-long/2addr v10, v12

    .line 70
    cmp-long v10, v10, v12

    .line 71
    .line 72
    if-eqz v10, :cond_6

    .line 73
    .line 74
    sub-int v10, v7, v5

    .line 75
    .line 76
    not-int v10, v10

    .line 77
    ushr-int/lit8 v10, v10, 0x1f

    .line 78
    .line 79
    const/16 v11, 0x8

    .line 80
    .line 81
    rsub-int/lit8 v10, v10, 0x8

    .line 82
    .line 83
    const/4 v12, 0x0

    .line 84
    :goto_2
    if-ge v12, v10, :cond_5

    .line 85
    .line 86
    const-wide/16 v13, 0xff

    .line 87
    .line 88
    and-long/2addr v13, v8

    .line 89
    const-wide/16 v15, 0x80

    .line 90
    .line 91
    cmp-long v13, v13, v15

    .line 92
    .line 93
    if-gez v13, :cond_4

    .line 94
    .line 95
    shl-int/lit8 v13, v7, 0x3

    .line 96
    .line 97
    add-int/2addr v13, v12

    .line 98
    aget-object v13, v4, v13

    .line 99
    .line 100
    check-cast v13, La0/u;

    .line 101
    .line 102
    invoke-interface {v13}, La0/u;->d()La0/w;

    .line 103
    .line 104
    .line 105
    move-result-object v13

    .line 106
    :goto_3
    if-eqz v13, :cond_4

    .line 107
    .line 108
    iget-wide v14, v13, La0/w;->a:J

    .line 109
    .line 110
    cmp-long v16, v14, v2

    .line 111
    .line 112
    if-eqz v16, :cond_2

    .line 113
    .line 114
    iget-object v6, v0, La0/d;->j:La0/l;

    .line 115
    .line 116
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 117
    .line 118
    .line 119
    move-result-object v14

    .line 120
    invoke-static {v6, v14}, Ln5/l;->h0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    if-eqz v6, :cond_3

    .line 125
    .line 126
    :cond_2
    sget-object v6, La0/n;->a:LB0/G0;

    .line 127
    .line 128
    const-wide/16 v14, 0x0

    .line 129
    .line 130
    iput-wide v14, v13, La0/w;->a:J

    .line 131
    .line 132
    :cond_3
    iget-object v13, v13, La0/w;->b:La0/w;

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_4
    shr-long/2addr v8, v11

    .line 136
    add-int/lit8 v12, v12, 0x1

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_5
    if-ne v10, v11, :cond_7

    .line 140
    .line 141
    :cond_6
    if-eq v7, v5, :cond_7

    .line 142
    .line 143
    add-int/lit8 v7, v7, 0x1

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_7
    invoke-virtual {v0}, La0/h;->a()V

    .line 147
    .line 148
    .line 149
    :cond_8
    return-void
.end method

.method public m()V
    .locals 1

    .line 1
    iget-boolean v0, p0, La0/d;->m:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, La0/h;->c:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, La0/d;->v()V

    .line 11
    .line 12
    .line 13
    :cond_1
    :goto_0
    return-void
.end method

.method public n(La0/u;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, La0/d;->x()Lr/H;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget v0, Lr/P;->a:I

    .line 8
    .line 9
    new-instance v0, Lr/H;

    .line 10
    .line 11
    invoke-direct {v0}, Lr/H;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, La0/d;->B(Lr/H;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0, p1}, Lr/H;->a(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final p()V
    .locals 3

    .line 1
    iget-object v0, p0, La0/d;->k:[I

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_0

    .line 6
    .line 7
    iget-object v2, p0, La0/d;->k:[I

    .line 8
    .line 9
    aget v2, v2, v1

    .line 10
    .line 11
    invoke-static {v2}, La0/n;->u(I)V

    .line 12
    .line 13
    .line 14
    add-int/lit8 v1, v1, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p0}, La0/h;->o()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public t(I)V
    .locals 0

    .line 1
    iput p1, p0, La0/d;->g:I

    .line 2
    .line 3
    return-void
.end method

.method public u(LB5/c;)La0/h;
    .locals 11

    .line 1
    iget-boolean v0, p0, La0/h;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Cannot use a disposed snapshot"

    .line 6
    .line 7
    invoke-static {v0}, LP/j0;->a(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-boolean v0, p0, La0/d;->m:Z

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    iget v0, p0, La0/h;->d:I

    .line 15
    .line 16
    if-ltz v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const-string v0, "Unsupported operation on a disposed or applied snapshot"

    .line 20
    .line 21
    invoke-static {v0}, LP/j0;->b(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_2
    :goto_0
    invoke-virtual {p0}, La0/h;->g()J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    invoke-virtual {p0}, La0/h;->g()J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    invoke-virtual {p0, v2, v3}, La0/d;->A(J)V

    .line 33
    .line 34
    .line 35
    sget-object v2, La0/n;->b:Ljava/lang/Object;

    .line 36
    .line 37
    monitor-enter v2

    .line 38
    :try_start_0
    sget-wide v4, La0/n;->d:J

    .line 39
    .line 40
    const-wide/16 v9, 0x1

    .line 41
    .line 42
    add-long v6, v4, v9

    .line 43
    .line 44
    sput-wide v6, La0/n;->d:J

    .line 45
    .line 46
    sget-object v3, La0/n;->c:La0/l;

    .line 47
    .line 48
    invoke-virtual {v3, v4, v5}, La0/l;->j(J)La0/l;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    sput-object v3, La0/n;->c:La0/l;

    .line 53
    .line 54
    new-instance v3, La0/f;

    .line 55
    .line 56
    invoke-virtual {p0}, La0/h;->d()La0/l;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    add-long/2addr v0, v9

    .line 61
    invoke-static {v6, v0, v1, v4, v5}, La0/n;->e(La0/l;JJ)La0/l;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    invoke-virtual {p0}, La0/d;->y()LB5/c;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const/4 v1, 0x1

    .line 70
    invoke-static {p1, v0, v1}, La0/n;->l(LB5/c;LB5/c;Z)LB5/c;

    .line 71
    .line 72
    .line 73
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 74
    move-object v8, p0

    .line 75
    :try_start_1
    invoke-direct/range {v3 .. v8}, La0/f;-><init>(JLa0/l;LB5/c;La0/h;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 76
    .line 77
    .line 78
    monitor-exit v2

    .line 79
    iget-boolean p1, v8, La0/d;->m:Z

    .line 80
    .line 81
    if-nez p1, :cond_3

    .line 82
    .line 83
    iget-boolean p1, v8, La0/h;->c:Z

    .line 84
    .line 85
    if-nez p1, :cond_3

    .line 86
    .line 87
    invoke-virtual {p0}, La0/h;->g()J

    .line 88
    .line 89
    .line 90
    move-result-wide v0

    .line 91
    monitor-enter v2

    .line 92
    :try_start_2
    sget-wide v4, La0/n;->d:J

    .line 93
    .line 94
    add-long v6, v4, v9

    .line 95
    .line 96
    sput-wide v6, La0/n;->d:J

    .line 97
    .line 98
    invoke-virtual {p0, v4, v5}, La0/h;->s(J)V

    .line 99
    .line 100
    .line 101
    sget-object p1, La0/n;->c:La0/l;

    .line 102
    .line 103
    invoke-virtual {p0}, La0/h;->g()J

    .line 104
    .line 105
    .line 106
    move-result-wide v4

    .line 107
    invoke-virtual {p1, v4, v5}, La0/l;->j(J)La0/l;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    sput-object p1, La0/n;->c:La0/l;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 112
    .line 113
    monitor-exit v2

    .line 114
    invoke-virtual {p0}, La0/h;->d()La0/l;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    add-long/2addr v0, v9

    .line 119
    invoke-virtual {p0}, La0/h;->g()J

    .line 120
    .line 121
    .line 122
    move-result-wide v4

    .line 123
    invoke-static {p1, v0, v1, v4, v5}, La0/n;->e(La0/l;JJ)La0/l;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-virtual {p0, p1}, La0/h;->r(La0/l;)V

    .line 128
    .line 129
    .line 130
    return-object v3

    .line 131
    :catchall_0
    move-exception v0

    .line 132
    move-object p1, v0

    .line 133
    monitor-exit v2

    .line 134
    throw p1

    .line 135
    :cond_3
    return-object v3

    .line 136
    :catchall_1
    move-exception v0

    .line 137
    :goto_1
    move-object p1, v0

    .line 138
    goto :goto_2

    .line 139
    :catchall_2
    move-exception v0

    .line 140
    move-object v8, p0

    .line 141
    goto :goto_1

    .line 142
    :goto_2
    monitor-exit v2

    .line 143
    throw p1
.end method

.method public final v()V
    .locals 9

    .line 1
    invoke-virtual {p0}, La0/h;->g()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0, v0, v1}, La0/d;->A(J)V

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, La0/d;->m:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-boolean v0, p0, La0/h;->c:Z

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, La0/h;->g()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    sget-object v2, La0/n;->b:Ljava/lang/Object;

    .line 21
    .line 22
    monitor-enter v2

    .line 23
    :try_start_0
    sget-wide v3, La0/n;->d:J

    .line 24
    .line 25
    const-wide/16 v5, 0x1

    .line 26
    .line 27
    add-long v7, v3, v5

    .line 28
    .line 29
    sput-wide v7, La0/n;->d:J

    .line 30
    .line 31
    invoke-virtual {p0, v3, v4}, La0/h;->s(J)V

    .line 32
    .line 33
    .line 34
    sget-object v3, La0/n;->c:La0/l;

    .line 35
    .line 36
    invoke-virtual {p0}, La0/h;->g()J

    .line 37
    .line 38
    .line 39
    move-result-wide v7

    .line 40
    invoke-virtual {v3, v7, v8}, La0/l;->j(J)La0/l;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    sput-object v3, La0/n;->c:La0/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    monitor-exit v2

    .line 47
    invoke-virtual {p0}, La0/h;->d()La0/l;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    add-long/2addr v0, v5

    .line 52
    invoke-virtual {p0}, La0/h;->g()J

    .line 53
    .line 54
    .line 55
    move-result-wide v3

    .line 56
    invoke-static {v2, v0, v1, v3, v4}, La0/n;->e(La0/l;JJ)La0/l;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {p0, v0}, La0/h;->r(La0/l;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    monitor-exit v2

    .line 66
    throw v0

    .line 67
    :cond_0
    return-void
.end method

.method public w()La0/r;
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual {v1}, La0/d;->x()Lr/H;

    .line 4
    .line 5
    .line 6
    move-result-object v4

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz v4, :cond_0

    .line 9
    .line 10
    sget-object v2, La0/n;->i:La0/c;

    .line 11
    .line 12
    iget-wide v2, v2, La0/h;->b:J

    .line 13
    .line 14
    sget-object v5, La0/n;->c:La0/l;

    .line 15
    .line 16
    invoke-virtual {v5, v2, v3}, La0/l;->g(J)La0/l;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    invoke-static {v2, v3, v1, v5}, La0/n;->c(JLa0/d;La0/l;)Ljava/util/HashMap;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    move-object v5, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v5, v0

    .line 27
    :goto_0
    sget-object v2, Ln5/s;->q:Ln5/s;

    .line 28
    .line 29
    sget-object v7, La0/n;->b:Ljava/lang/Object;

    .line 30
    .line 31
    monitor-enter v7

    .line 32
    :try_start_0
    invoke-static {v1}, La0/n;->d(La0/h;)V

    .line 33
    .line 34
    .line 35
    const-wide/16 v8, 0x1

    .line 36
    .line 37
    const/4 v10, 0x0

    .line 38
    if-eqz v4, :cond_3

    .line 39
    .line 40
    iget v3, v4, Lr/H;->d:I

    .line 41
    .line 42
    if-nez v3, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    sget-object v11, La0/n;->i:La0/c;

    .line 46
    .line 47
    sget-wide v2, La0/n;->d:J

    .line 48
    .line 49
    sget-object v6, La0/n;->c:La0/l;

    .line 50
    .line 51
    iget-wide v12, v11, La0/h;->b:J

    .line 52
    .line 53
    invoke-virtual {v6, v12, v13}, La0/l;->g(J)La0/l;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-virtual/range {v1 .. v6}, La0/d;->z(JLr/H;Ljava/util/HashMap;La0/l;)La0/r;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    sget-object v3, La0/j;->b:La0/j;

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    if-nez v3, :cond_2

    .line 68
    .line 69
    monitor-exit v7

    .line 70
    return-object v2

    .line 71
    :cond_2
    :try_start_1
    invoke-virtual {v1}, La0/d;->b()V

    .line 72
    .line 73
    .line 74
    iget-object v2, v11, La0/d;->h:Lr/H;

    .line 75
    .line 76
    iget-wide v5, v11, La0/h;->b:J

    .line 77
    .line 78
    sget-object v3, La0/n;->c:La0/l;

    .line 79
    .line 80
    invoke-virtual {v3, v5, v6}, La0/l;->g(J)La0/l;

    .line 81
    .line 82
    .line 83
    sget-wide v12, La0/n;->d:J

    .line 84
    .line 85
    add-long/2addr v8, v12

    .line 86
    sput-wide v8, La0/n;->d:J

    .line 87
    .line 88
    sget-object v3, La0/n;->c:La0/l;

    .line 89
    .line 90
    invoke-virtual {v3, v5, v6}, La0/l;->g(J)La0/l;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    sput-object v3, La0/n;->c:La0/l;

    .line 95
    .line 96
    iput-wide v12, v11, La0/h;->b:J

    .line 97
    .line 98
    iput-object v3, v11, La0/h;->a:La0/l;

    .line 99
    .line 100
    iput v10, v11, La0/d;->g:I

    .line 101
    .line 102
    iput-object v0, v11, La0/d;->h:Lr/H;

    .line 103
    .line 104
    invoke-virtual {v11}, La0/h;->o()V

    .line 105
    .line 106
    .line 107
    sget-object v3, La0/n;->c:La0/l;

    .line 108
    .line 109
    invoke-virtual {v3, v12, v13}, La0/l;->j(J)La0/l;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    sput-object v3, La0/n;->c:La0/l;

    .line 114
    .line 115
    invoke-virtual {v1, v0}, La0/d;->B(Lr/H;)V

    .line 116
    .line 117
    .line 118
    iput-object v0, v11, La0/d;->h:Lr/H;

    .line 119
    .line 120
    sget-object v3, La0/n;->g:Ljava/lang/Object;

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :catchall_0
    move-exception v0

    .line 124
    goto/16 :goto_c

    .line 125
    .line 126
    :cond_3
    :goto_1
    invoke-virtual {v1}, La0/d;->b()V

    .line 127
    .line 128
    .line 129
    sget-object v3, La0/n;->i:La0/c;

    .line 130
    .line 131
    iget-object v5, v3, La0/d;->h:Lr/H;

    .line 132
    .line 133
    iget-wide v11, v3, La0/h;->b:J

    .line 134
    .line 135
    sget-object v6, La0/n;->c:La0/l;

    .line 136
    .line 137
    invoke-virtual {v6, v11, v12}, La0/l;->g(J)La0/l;

    .line 138
    .line 139
    .line 140
    sget-wide v13, La0/n;->d:J

    .line 141
    .line 142
    add-long/2addr v8, v13

    .line 143
    sput-wide v8, La0/n;->d:J

    .line 144
    .line 145
    sget-object v6, La0/n;->c:La0/l;

    .line 146
    .line 147
    invoke-virtual {v6, v11, v12}, La0/l;->g(J)La0/l;

    .line 148
    .line 149
    .line 150
    move-result-object v6

    .line 151
    sput-object v6, La0/n;->c:La0/l;

    .line 152
    .line 153
    iput-wide v13, v3, La0/h;->b:J

    .line 154
    .line 155
    iput-object v6, v3, La0/h;->a:La0/l;

    .line 156
    .line 157
    iput v10, v3, La0/d;->g:I

    .line 158
    .line 159
    iput-object v0, v3, La0/d;->h:Lr/H;

    .line 160
    .line 161
    invoke-virtual {v3}, La0/h;->o()V

    .line 162
    .line 163
    .line 164
    sget-object v3, La0/n;->c:La0/l;

    .line 165
    .line 166
    invoke-virtual {v3, v13, v14}, La0/l;->j(J)La0/l;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    sput-object v3, La0/n;->c:La0/l;

    .line 171
    .line 172
    if-eqz v5, :cond_4

    .line 173
    .line 174
    invoke-virtual {v5}, Lr/H;->h()Z

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    if-eqz v3, :cond_4

    .line 179
    .line 180
    sget-object v2, La0/n;->g:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 181
    .line 182
    move-object v3, v2

    .line 183
    move-object v2, v5

    .line 184
    goto :goto_2

    .line 185
    :cond_4
    move-object v3, v2

    .line 186
    move-object v2, v0

    .line 187
    :goto_2
    monitor-exit v7

    .line 188
    const/4 v5, 0x1

    .line 189
    iput-boolean v5, v1, La0/d;->m:Z

    .line 190
    .line 191
    if-eqz v2, :cond_5

    .line 192
    .line 193
    new-instance v5, LR/h;

    .line 194
    .line 195
    invoke-direct {v5, v2}, LR/h;-><init>(Lr/H;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2}, Lr/H;->g()Z

    .line 199
    .line 200
    .line 201
    move-result v6

    .line 202
    if-nez v6, :cond_5

    .line 203
    .line 204
    move-object v6, v3

    .line 205
    check-cast v6, Ljava/util/Collection;

    .line 206
    .line 207
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 208
    .line 209
    .line 210
    move-result v6

    .line 211
    move v7, v10

    .line 212
    :goto_3
    if-ge v7, v6, :cond_5

    .line 213
    .line 214
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v8

    .line 218
    check-cast v8, LB5/e;

    .line 219
    .line 220
    invoke-interface {v8, v5, v1}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    add-int/lit8 v7, v7, 0x1

    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_5
    if-eqz v4, :cond_6

    .line 227
    .line 228
    invoke-virtual {v4}, Lr/H;->h()Z

    .line 229
    .line 230
    .line 231
    move-result v5

    .line 232
    if-eqz v5, :cond_6

    .line 233
    .line 234
    new-instance v5, LR/h;

    .line 235
    .line 236
    invoke-direct {v5, v4}, LR/h;-><init>(Lr/H;)V

    .line 237
    .line 238
    .line 239
    move-object v6, v3

    .line 240
    check-cast v6, Ljava/util/Collection;

    .line 241
    .line 242
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 243
    .line 244
    .line 245
    move-result v6

    .line 246
    move v7, v10

    .line 247
    :goto_4
    if-ge v7, v6, :cond_6

    .line 248
    .line 249
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v8

    .line 253
    check-cast v8, LB5/e;

    .line 254
    .line 255
    invoke-interface {v8, v5, v1}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    add-int/lit8 v7, v7, 0x1

    .line 259
    .line 260
    goto :goto_4

    .line 261
    :cond_6
    sget-object v3, La0/n;->b:Ljava/lang/Object;

    .line 262
    .line 263
    monitor-enter v3

    .line 264
    :try_start_2
    invoke-virtual {v1}, La0/d;->p()V

    .line 265
    .line 266
    .line 267
    invoke-static {}, La0/n;->g()V

    .line 268
    .line 269
    .line 270
    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    const/16 v13, 0x8

    .line 276
    .line 277
    if-eqz v2, :cond_a

    .line 278
    .line 279
    iget-object v14, v2, Lr/H;->b:[Ljava/lang/Object;

    .line 280
    .line 281
    iget-object v2, v2, Lr/H;->a:[J

    .line 282
    .line 283
    array-length v15, v2

    .line 284
    add-int/lit8 v15, v15, -0x2

    .line 285
    .line 286
    if-ltz v15, :cond_a

    .line 287
    .line 288
    move v5, v10

    .line 289
    const-wide/16 v16, 0x80

    .line 290
    .line 291
    const-wide/16 v18, 0xff

    .line 292
    .line 293
    :goto_5
    aget-wide v7, v2, v5

    .line 294
    .line 295
    const/16 v20, 0x7

    .line 296
    .line 297
    not-long v9, v7

    .line 298
    shl-long v9, v9, v20

    .line 299
    .line 300
    and-long/2addr v9, v7

    .line 301
    and-long/2addr v9, v11

    .line 302
    cmp-long v9, v9, v11

    .line 303
    .line 304
    if-eqz v9, :cond_9

    .line 305
    .line 306
    sub-int v9, v5, v15

    .line 307
    .line 308
    not-int v9, v9

    .line 309
    ushr-int/lit8 v9, v9, 0x1f

    .line 310
    .line 311
    rsub-int/lit8 v9, v9, 0x8

    .line 312
    .line 313
    const/4 v10, 0x0

    .line 314
    :goto_6
    if-ge v10, v9, :cond_8

    .line 315
    .line 316
    and-long v21, v7, v18

    .line 317
    .line 318
    cmp-long v21, v21, v16

    .line 319
    .line 320
    if-gez v21, :cond_7

    .line 321
    .line 322
    shl-int/lit8 v21, v5, 0x3

    .line 323
    .line 324
    add-int v21, v21, v10

    .line 325
    .line 326
    aget-object v21, v14, v21

    .line 327
    .line 328
    check-cast v21, La0/u;

    .line 329
    .line 330
    invoke-static/range {v21 .. v21}, La0/n;->q(La0/u;)V

    .line 331
    .line 332
    .line 333
    goto :goto_7

    .line 334
    :catchall_1
    move-exception v0

    .line 335
    goto/16 :goto_b

    .line 336
    .line 337
    :cond_7
    :goto_7
    shr-long/2addr v7, v13

    .line 338
    add-int/lit8 v10, v10, 0x1

    .line 339
    .line 340
    goto :goto_6

    .line 341
    :cond_8
    if-ne v9, v13, :cond_b

    .line 342
    .line 343
    :cond_9
    if-eq v5, v15, :cond_b

    .line 344
    .line 345
    add-int/lit8 v5, v5, 0x1

    .line 346
    .line 347
    const/4 v10, 0x0

    .line 348
    goto :goto_5

    .line 349
    :cond_a
    const-wide/16 v16, 0x80

    .line 350
    .line 351
    const-wide/16 v18, 0xff

    .line 352
    .line 353
    const/16 v20, 0x7

    .line 354
    .line 355
    :cond_b
    if-eqz v4, :cond_f

    .line 356
    .line 357
    iget-object v2, v4, Lr/H;->b:[Ljava/lang/Object;

    .line 358
    .line 359
    iget-object v4, v4, Lr/H;->a:[J

    .line 360
    .line 361
    array-length v5, v4

    .line 362
    add-int/lit8 v5, v5, -0x2

    .line 363
    .line 364
    if-ltz v5, :cond_f

    .line 365
    .line 366
    const/4 v7, 0x0

    .line 367
    :goto_8
    aget-wide v8, v4, v7

    .line 368
    .line 369
    not-long v14, v8

    .line 370
    shl-long v14, v14, v20

    .line 371
    .line 372
    and-long/2addr v14, v8

    .line 373
    and-long/2addr v14, v11

    .line 374
    cmp-long v10, v14, v11

    .line 375
    .line 376
    if-eqz v10, :cond_e

    .line 377
    .line 378
    sub-int v10, v7, v5

    .line 379
    .line 380
    not-int v10, v10

    .line 381
    ushr-int/lit8 v10, v10, 0x1f

    .line 382
    .line 383
    rsub-int/lit8 v10, v10, 0x8

    .line 384
    .line 385
    const/4 v14, 0x0

    .line 386
    :goto_9
    if-ge v14, v10, :cond_d

    .line 387
    .line 388
    and-long v21, v8, v18

    .line 389
    .line 390
    cmp-long v15, v21, v16

    .line 391
    .line 392
    if-gez v15, :cond_c

    .line 393
    .line 394
    shl-int/lit8 v15, v7, 0x3

    .line 395
    .line 396
    add-int/2addr v15, v14

    .line 397
    aget-object v15, v2, v15

    .line 398
    .line 399
    check-cast v15, La0/u;

    .line 400
    .line 401
    invoke-static {v15}, La0/n;->q(La0/u;)V

    .line 402
    .line 403
    .line 404
    :cond_c
    shr-long/2addr v8, v13

    .line 405
    add-int/lit8 v14, v14, 0x1

    .line 406
    .line 407
    goto :goto_9

    .line 408
    :cond_d
    if-ne v10, v13, :cond_f

    .line 409
    .line 410
    :cond_e
    if-eq v7, v5, :cond_f

    .line 411
    .line 412
    add-int/lit8 v7, v7, 0x1

    .line 413
    .line 414
    goto :goto_8

    .line 415
    :cond_f
    iget-object v2, v1, La0/d;->i:Ljava/util/ArrayList;

    .line 416
    .line 417
    if-eqz v2, :cond_10

    .line 418
    .line 419
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 420
    .line 421
    .line 422
    move-result v4

    .line 423
    const/4 v10, 0x0

    .line 424
    :goto_a
    if-ge v10, v4, :cond_10

    .line 425
    .line 426
    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v5

    .line 430
    check-cast v5, La0/u;

    .line 431
    .line 432
    invoke-static {v5}, La0/n;->q(La0/u;)V

    .line 433
    .line 434
    .line 435
    add-int/lit8 v10, v10, 0x1

    .line 436
    .line 437
    goto :goto_a

    .line 438
    :cond_10
    iput-object v0, v1, La0/d;->i:Ljava/util/ArrayList;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 439
    .line 440
    monitor-exit v3

    .line 441
    sget-object v0, La0/j;->b:La0/j;

    .line 442
    .line 443
    return-object v0

    .line 444
    :goto_b
    monitor-exit v3

    .line 445
    throw v0

    .line 446
    :goto_c
    monitor-exit v7

    .line 447
    throw v0
.end method

.method public x()Lr/H;
    .locals 1

    .line 1
    iget-object v0, p0, La0/d;->h:Lr/H;

    .line 2
    .line 3
    return-object v0
.end method

.method public y()LB5/c;
    .locals 1

    .line 1
    iget-object v0, p0, La0/d;->e:LB5/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z(JLr/H;Ljava/util/HashMap;La0/l;)La0/r;
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-wide/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v0, p3

    .line 6
    .line 7
    move-object/from16 v4, p4

    .line 8
    .line 9
    invoke-virtual {v1}, La0/h;->d()La0/l;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    invoke-virtual {v1}, La0/h;->g()J

    .line 14
    .line 15
    .line 16
    move-result-wide v6

    .line 17
    invoke-virtual {v5, v6, v7}, La0/l;->j(J)La0/l;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    iget-object v6, v1, La0/d;->j:La0/l;

    .line 22
    .line 23
    invoke-virtual {v5, v6}, La0/l;->i(La0/l;)La0/l;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    iget-object v6, v0, Lr/H;->b:[Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v7, v0, Lr/H;->a:[J

    .line 30
    .line 31
    array-length v8, v7

    .line 32
    add-int/lit8 v8, v8, -0x2

    .line 33
    .line 34
    if-ltz v8, :cond_11

    .line 35
    .line 36
    const/4 v11, 0x0

    .line 37
    const/4 v12, 0x0

    .line 38
    const/4 v13, 0x0

    .line 39
    :goto_0
    aget-wide v14, v7, v11

    .line 40
    .line 41
    const/16 v16, 0x0

    .line 42
    .line 43
    not-long v9, v14

    .line 44
    const/16 v17, 0x7

    .line 45
    .line 46
    shl-long v9, v9, v17

    .line 47
    .line 48
    and-long/2addr v9, v14

    .line 49
    const-wide v17, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    and-long v9, v9, v17

    .line 55
    .line 56
    cmp-long v9, v9, v17

    .line 57
    .line 58
    if-eqz v9, :cond_f

    .line 59
    .line 60
    sub-int v9, v11, v8

    .line 61
    .line 62
    not-int v9, v9

    .line 63
    ushr-int/lit8 v9, v9, 0x1f

    .line 64
    .line 65
    const/16 v10, 0x8

    .line 66
    .line 67
    rsub-int/lit8 v9, v9, 0x8

    .line 68
    .line 69
    move/from16 v17, v10

    .line 70
    .line 71
    const/4 v10, 0x0

    .line 72
    :goto_1
    if-ge v10, v9, :cond_e

    .line 73
    .line 74
    const-wide/16 v18, 0xff

    .line 75
    .line 76
    and-long v18, v14, v18

    .line 77
    .line 78
    const-wide/16 v20, 0x80

    .line 79
    .line 80
    cmp-long v18, v18, v20

    .line 81
    .line 82
    if-gez v18, :cond_d

    .line 83
    .line 84
    shl-int/lit8 v18, v11, 0x3

    .line 85
    .line 86
    add-int v18, v18, v10

    .line 87
    .line 88
    aget-object v18, v6, v18

    .line 89
    .line 90
    move-object/from16 v19, v6

    .line 91
    .line 92
    move-object/from16 v6, v18

    .line 93
    .line 94
    check-cast v6, La0/u;

    .line 95
    .line 96
    move-object/from16 v18, v7

    .line 97
    .line 98
    invoke-interface {v6}, La0/u;->d()La0/w;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    move/from16 v20, v10

    .line 103
    .line 104
    move-object/from16 v21, v12

    .line 105
    .line 106
    move-object/from16 v10, p5

    .line 107
    .line 108
    invoke-static {v7, v2, v3, v10}, La0/n;->s(La0/w;JLa0/l;)La0/w;

    .line 109
    .line 110
    .line 111
    move-result-object v12

    .line 112
    if-nez v12, :cond_0

    .line 113
    .line 114
    move-object/from16 v25, v5

    .line 115
    .line 116
    move-object/from16 v22, v13

    .line 117
    .line 118
    move-wide/from16 v23, v14

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_0
    move-object/from16 v22, v13

    .line 122
    .line 123
    move-wide/from16 v23, v14

    .line 124
    .line 125
    invoke-virtual {v1}, La0/h;->g()J

    .line 126
    .line 127
    .line 128
    move-result-wide v13

    .line 129
    invoke-static {v7, v13, v14, v5}, La0/n;->s(La0/w;JLa0/l;)La0/w;

    .line 130
    .line 131
    .line 132
    move-result-object v13

    .line 133
    if-nez v13, :cond_1

    .line 134
    .line 135
    move-object/from16 v25, v5

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_1
    iget-wide v14, v13, La0/w;->a:J

    .line 139
    .line 140
    move-object/from16 v25, v5

    .line 141
    .line 142
    const/4 v5, 0x1

    .line 143
    move-wide/from16 v26, v14

    .line 144
    .line 145
    int-to-long v14, v5

    .line 146
    cmp-long v5, v26, v14

    .line 147
    .line 148
    if-nez v5, :cond_2

    .line 149
    .line 150
    :goto_2
    goto/16 :goto_8

    .line 151
    .line 152
    :cond_2
    invoke-virtual {v12, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    if-nez v5, :cond_c

    .line 157
    .line 158
    invoke-virtual {v1}, La0/h;->g()J

    .line 159
    .line 160
    .line 161
    move-result-wide v14

    .line 162
    invoke-virtual {v1}, La0/h;->d()La0/l;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    invoke-static {v7, v14, v15, v5}, La0/n;->s(La0/w;JLa0/l;)La0/w;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    if-eqz v5, :cond_b

    .line 171
    .line 172
    if-eqz v4, :cond_3

    .line 173
    .line 174
    invoke-interface {v4, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    check-cast v7, La0/w;

    .line 179
    .line 180
    if-nez v7, :cond_4

    .line 181
    .line 182
    :cond_3
    invoke-interface {v6, v13, v12, v5}, La0/u;->g(La0/w;La0/w;La0/w;)La0/w;

    .line 183
    .line 184
    .line 185
    move-result-object v7

    .line 186
    :cond_4
    if-nez v7, :cond_5

    .line 187
    .line 188
    new-instance v0, La0/i;

    .line 189
    .line 190
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 191
    .line 192
    .line 193
    return-object v0

    .line 194
    :cond_5
    invoke-virtual {v7, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v5

    .line 198
    if-nez v5, :cond_c

    .line 199
    .line 200
    invoke-virtual {v7, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    if-eqz v5, :cond_8

    .line 205
    .line 206
    if-nez v21, :cond_6

    .line 207
    .line 208
    new-instance v5, Ljava/util/ArrayList;

    .line 209
    .line 210
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 211
    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_6
    move-object/from16 v5, v21

    .line 215
    .line 216
    :goto_3
    invoke-virtual {v1}, La0/h;->g()J

    .line 217
    .line 218
    .line 219
    move-result-wide v13

    .line 220
    invoke-virtual {v12, v13, v14}, La0/w;->b(J)La0/w;

    .line 221
    .line 222
    .line 223
    move-result-object v7

    .line 224
    new-instance v12, Lm5/j;

    .line 225
    .line 226
    invoke-direct {v12, v6, v7}, Lm5/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    invoke-interface {v5, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    if-nez v22, :cond_7

    .line 233
    .line 234
    new-instance v13, Ljava/util/ArrayList;

    .line 235
    .line 236
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 237
    .line 238
    .line 239
    goto :goto_4

    .line 240
    :cond_7
    move-object/from16 v13, v22

    .line 241
    .line 242
    :goto_4
    invoke-interface {v13, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-object v12, v5

    .line 246
    goto :goto_9

    .line 247
    :cond_8
    if-nez v21, :cond_9

    .line 248
    .line 249
    new-instance v12, Ljava/util/ArrayList;

    .line 250
    .line 251
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 252
    .line 253
    .line 254
    goto :goto_5

    .line 255
    :cond_9
    move-object/from16 v12, v21

    .line 256
    .line 257
    :goto_5
    invoke-virtual {v7, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    if-nez v5, :cond_a

    .line 262
    .line 263
    new-instance v5, Lm5/j;

    .line 264
    .line 265
    invoke-direct {v5, v6, v7}, Lm5/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    goto :goto_6

    .line 269
    :cond_a
    invoke-virtual {v1}, La0/h;->g()J

    .line 270
    .line 271
    .line 272
    move-result-wide v14

    .line 273
    invoke-virtual {v13, v14, v15}, La0/w;->b(J)La0/w;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    new-instance v7, Lm5/j;

    .line 278
    .line 279
    invoke-direct {v7, v6, v5}, Lm5/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    move-object v5, v7

    .line 283
    :goto_6
    invoke-interface {v12, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    :goto_7
    move-object/from16 v13, v22

    .line 287
    .line 288
    goto :goto_9

    .line 289
    :cond_b
    invoke-static {}, La0/n;->r()V

    .line 290
    .line 291
    .line 292
    throw v16

    .line 293
    :cond_c
    :goto_8
    move-object/from16 v12, v21

    .line 294
    .line 295
    goto :goto_7

    .line 296
    :cond_d
    move-object/from16 v25, v5

    .line 297
    .line 298
    move-object/from16 v19, v6

    .line 299
    .line 300
    move-object/from16 v18, v7

    .line 301
    .line 302
    move/from16 v20, v10

    .line 303
    .line 304
    move-object/from16 v21, v12

    .line 305
    .line 306
    move-object/from16 v22, v13

    .line 307
    .line 308
    move-wide/from16 v23, v14

    .line 309
    .line 310
    move-object/from16 v10, p5

    .line 311
    .line 312
    :goto_9
    shr-long v14, v23, v17

    .line 313
    .line 314
    add-int/lit8 v5, v20, 0x1

    .line 315
    .line 316
    move v10, v5

    .line 317
    move-object/from16 v7, v18

    .line 318
    .line 319
    move-object/from16 v6, v19

    .line 320
    .line 321
    move-object/from16 v5, v25

    .line 322
    .line 323
    goto/16 :goto_1

    .line 324
    .line 325
    :cond_e
    move-object/from16 v10, p5

    .line 326
    .line 327
    move-object/from16 v25, v5

    .line 328
    .line 329
    move-object/from16 v19, v6

    .line 330
    .line 331
    move-object/from16 v18, v7

    .line 332
    .line 333
    move-object/from16 v21, v12

    .line 334
    .line 335
    move-object/from16 v22, v13

    .line 336
    .line 337
    move/from16 v5, v17

    .line 338
    .line 339
    if-ne v9, v5, :cond_12

    .line 340
    .line 341
    goto :goto_a

    .line 342
    :cond_f
    move-object/from16 v10, p5

    .line 343
    .line 344
    move-object/from16 v25, v5

    .line 345
    .line 346
    move-object/from16 v19, v6

    .line 347
    .line 348
    move-object/from16 v18, v7

    .line 349
    .line 350
    :goto_a
    if-eq v11, v8, :cond_10

    .line 351
    .line 352
    add-int/lit8 v11, v11, 0x1

    .line 353
    .line 354
    move-object/from16 v7, v18

    .line 355
    .line 356
    move-object/from16 v6, v19

    .line 357
    .line 358
    move-object/from16 v5, v25

    .line 359
    .line 360
    goto/16 :goto_0

    .line 361
    .line 362
    :cond_10
    move-object v9, v12

    .line 363
    goto :goto_b

    .line 364
    :cond_11
    const/16 v16, 0x0

    .line 365
    .line 366
    move-object/from16 v9, v16

    .line 367
    .line 368
    move-object v13, v9

    .line 369
    :goto_b
    move-object v12, v9

    .line 370
    :cond_12
    if-eqz v12, :cond_13

    .line 371
    .line 372
    invoke-virtual {v1}, La0/d;->v()V

    .line 373
    .line 374
    .line 375
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 376
    .line 377
    .line 378
    move-result v4

    .line 379
    const/4 v5, 0x0

    .line 380
    :goto_c
    if-ge v5, v4, :cond_13

    .line 381
    .line 382
    invoke-interface {v12, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v6

    .line 386
    check-cast v6, Lm5/j;

    .line 387
    .line 388
    iget-object v7, v6, Lm5/j;->q:Ljava/lang/Object;

    .line 389
    .line 390
    check-cast v7, La0/u;

    .line 391
    .line 392
    iget-object v6, v6, Lm5/j;->r:Ljava/lang/Object;

    .line 393
    .line 394
    check-cast v6, La0/w;

    .line 395
    .line 396
    iput-wide v2, v6, La0/w;->a:J

    .line 397
    .line 398
    sget-object v8, La0/n;->b:Ljava/lang/Object;

    .line 399
    .line 400
    monitor-enter v8

    .line 401
    :try_start_0
    invoke-interface {v7}, La0/u;->d()La0/w;

    .line 402
    .line 403
    .line 404
    move-result-object v9

    .line 405
    iput-object v9, v6, La0/w;->b:La0/w;

    .line 406
    .line 407
    invoke-interface {v7, v6}, La0/u;->h(La0/w;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 408
    .line 409
    .line 410
    monitor-exit v8

    .line 411
    add-int/lit8 v5, v5, 0x1

    .line 412
    .line 413
    goto :goto_c

    .line 414
    :catchall_0
    move-exception v0

    .line 415
    monitor-exit v8

    .line 416
    throw v0

    .line 417
    :cond_13
    if-eqz v13, :cond_16

    .line 418
    .line 419
    invoke-interface {v13}, Ljava/util/Collection;->size()I

    .line 420
    .line 421
    .line 422
    move-result v2

    .line 423
    const/4 v10, 0x0

    .line 424
    :goto_d
    if-ge v10, v2, :cond_14

    .line 425
    .line 426
    invoke-interface {v13, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v3

    .line 430
    check-cast v3, La0/u;

    .line 431
    .line 432
    invoke-virtual {v0, v3}, Lr/H;->l(Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    add-int/lit8 v10, v10, 0x1

    .line 436
    .line 437
    goto :goto_d

    .line 438
    :cond_14
    iget-object v0, v1, La0/d;->i:Ljava/util/ArrayList;

    .line 439
    .line 440
    if-nez v0, :cond_15

    .line 441
    .line 442
    goto :goto_e

    .line 443
    :cond_15
    invoke-static {v0, v13}, Ln5/l;->u0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 444
    .line 445
    .line 446
    move-result-object v13

    .line 447
    :goto_e
    iput-object v13, v1, La0/d;->i:Ljava/util/ArrayList;

    .line 448
    .line 449
    :cond_16
    sget-object v0, La0/j;->b:La0/j;

    .line 450
    .line 451
    return-object v0
.end method
