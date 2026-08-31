.class public LP5/G;
.super LQ5/b;
.source "SourceFile"

# interfaces
.implements LP5/h;
.implements LP5/i;
.implements LQ5/v;


# instance fields
.field public A:I

.field public final u:I

.field public final v:I

.field public w:[Ljava/lang/Object;

.field public x:J

.field public y:J

.field public z:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LP5/G;->u:I

    .line 5
    .line 6
    iput p2, p0, LP5/G;->v:I

    .line 7
    .line 8
    return-void
.end method

.method public static h(LP5/G;LP5/i;Lq5/c;)V
    .locals 8

    .line 1
    instance-of v0, p2, LP5/F;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LP5/F;

    .line 7
    .line 8
    iget v1, v0, LP5/F;->w:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LP5/F;->w:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LP5/F;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LP5/F;-><init>(LP5/G;Lq5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LP5/F;->u:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, LP5/F;->w:I

    .line 28
    .line 29
    const/4 v2, 0x3

    .line 30
    const/4 v3, 0x2

    .line 31
    if-eqz v1, :cond_5

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    if-eq v1, p0, :cond_4

    .line 35
    .line 36
    if-eq v1, v3, :cond_3

    .line 37
    .line 38
    if-ne v1, v2, :cond_2

    .line 39
    .line 40
    iget-object p0, v0, LP5/F;->t:LM5/b0;

    .line 41
    .line 42
    iget-object p1, v0, LP5/F;->s:LP5/I;

    .line 43
    .line 44
    iget-object v1, v0, LP5/F;->r:LP5/i;

    .line 45
    .line 46
    iget-object v4, v0, LP5/F;->q:LP5/G;

    .line 47
    .line 48
    :try_start_0
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    :cond_1
    move-object p2, v1

    .line 52
    move-object v1, p0

    .line 53
    move-object p0, v4

    .line 54
    goto :goto_2

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    goto/16 :goto_6

    .line 57
    .line 58
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p0

    .line 66
    :cond_3
    iget-object p0, v0, LP5/F;->t:LM5/b0;

    .line 67
    .line 68
    iget-object p1, v0, LP5/F;->s:LP5/I;

    .line 69
    .line 70
    iget-object v1, v0, LP5/F;->r:LP5/i;

    .line 71
    .line 72
    iget-object v4, v0, LP5/F;->q:LP5/G;

    .line 73
    .line 74
    :try_start_1
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    iget-object p1, v0, LP5/F;->s:LP5/I;

    .line 79
    .line 80
    iget-object p0, v0, LP5/F;->r:LP5/i;

    .line 81
    .line 82
    iget-object v1, v0, LP5/F;->q:LP5/G;

    .line 83
    .line 84
    :try_start_2
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 85
    .line 86
    .line 87
    move-object p2, p0

    .line 88
    move-object p0, v1

    .line 89
    goto :goto_1

    .line 90
    :catchall_1
    move-exception p0

    .line 91
    move-object v4, v1

    .line 92
    goto :goto_6

    .line 93
    :cond_5
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, LQ5/b;->b()LQ5/d;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    check-cast p2, LP5/I;

    .line 101
    .line 102
    move-object v7, p2

    .line 103
    move-object p2, p1

    .line 104
    move-object p1, v7

    .line 105
    :goto_1
    :try_start_3
    invoke-interface {v0}, Lq5/c;->getContext()Lq5/h;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    sget-object v4, LM5/t;->r:LM5/t;

    .line 110
    .line 111
    invoke-interface {v1, v4}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    check-cast v1, LM5/b0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 116
    .line 117
    :goto_2
    move-object v4, p0

    .line 118
    move-object p0, v1

    .line 119
    move-object v1, p2

    .line 120
    :cond_6
    :goto_3
    :try_start_4
    invoke-virtual {v4, p1}, LP5/G;->q(LP5/I;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    sget-object v5, LP5/H;->a:LE4/f;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 125
    .line 126
    sget-object v6, Lr5/a;->q:Lr5/a;

    .line 127
    .line 128
    if-ne p2, v5, :cond_7

    .line 129
    .line 130
    :try_start_5
    iput-object v4, v0, LP5/F;->q:LP5/G;

    .line 131
    .line 132
    iput-object v1, v0, LP5/F;->r:LP5/i;

    .line 133
    .line 134
    iput-object p1, v0, LP5/F;->s:LP5/I;

    .line 135
    .line 136
    iput-object p0, v0, LP5/F;->t:LM5/b0;

    .line 137
    .line 138
    iput v3, v0, LP5/F;->w:I

    .line 139
    .line 140
    invoke-virtual {v4, p1, v0}, LP5/G;->g(LP5/I;LP5/F;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    if-ne p2, v6, :cond_6

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_7
    if-eqz p0, :cond_9

    .line 148
    .line 149
    invoke-interface {p0}, LM5/b0;->b()Z

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    if-eqz v5, :cond_8

    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_8
    invoke-interface {p0}, LM5/b0;->v()Ljava/util/concurrent/CancellationException;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    throw p0

    .line 161
    :cond_9
    :goto_4
    iput-object v4, v0, LP5/F;->q:LP5/G;

    .line 162
    .line 163
    iput-object v1, v0, LP5/F;->r:LP5/i;

    .line 164
    .line 165
    iput-object p1, v0, LP5/F;->s:LP5/I;

    .line 166
    .line 167
    iput-object p0, v0, LP5/F;->t:LM5/b0;

    .line 168
    .line 169
    iput v2, v0, LP5/F;->w:I

    .line 170
    .line 171
    invoke-interface {v1, p2, v0}, LP5/i;->emit(Ljava/lang/Object;Lq5/c;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 175
    if-ne p2, v6, :cond_1

    .line 176
    .line 177
    :goto_5
    return-void

    .line 178
    :catchall_2
    move-exception p2

    .line 179
    move-object v4, p0

    .line 180
    move-object p0, p2

    .line 181
    :goto_6
    invoke-virtual {v4, p1}, LQ5/b;->e(LQ5/d;)V

    .line 182
    .line 183
    .line 184
    throw p0
.end method


# virtual methods
.method public final a(Lq5/h;ILO5/a;)LP5/h;
    .locals 1

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const/4 v0, -0x3

    .line 4
    if-ne p2, v0, :cond_1

    .line 5
    .line 6
    :cond_0
    sget-object v0, LO5/a;->q:LO5/a;

    .line 7
    .line 8
    if-ne p3, v0, :cond_1

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_1
    new-instance v0, LQ5/j;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1, p2, p3}, LQ5/i;-><init>(LP5/h;Lq5/h;ILO5/a;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final c()LQ5/d;
    .locals 3

    .line 1
    new-instance v0, LP5/I;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v1, -0x1

    .line 7
    .line 8
    iput-wide v1, v0, LP5/I;->a:J

    .line 9
    .line 10
    return-object v0
.end method

.method public final collect(LP5/i;Lq5/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LP5/G;->h(LP5/G;LP5/i;Lq5/c;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lr5/a;->q:Lr5/a;

    .line 5
    .line 6
    return-object p1
.end method

.method public final d()[LQ5/d;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [LP5/I;

    .line 3
    .line 4
    return-object v0
.end method

.method public final emit(Ljava/lang/Object;Lq5/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LP5/G;->n(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 5
    .line 6
    return-object p1
.end method

.method public final g(LP5/I;LP5/F;)Ljava/lang/Object;
    .locals 5

    .line 1
    new-instance v0, LM5/h;

    .line 2
    .line 3
    invoke-static {p2}, Ln5/A;->v(Lq5/c;)Lq5/c;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p2}, LM5/h;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LM5/h;->s()V

    .line 12
    .line 13
    .line 14
    monitor-enter p0

    .line 15
    :try_start_0
    invoke-virtual {p0, p1}, LP5/G;->p(LP5/I;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    const-wide/16 v3, 0x0

    .line 20
    .line 21
    cmp-long p2, v1, v3

    .line 22
    .line 23
    if-gez p2, :cond_0

    .line 24
    .line 25
    iput-object v0, p1, LP5/I;->b:LM5/h;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, LM5/h;->resumeWith(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    :goto_0
    monitor-exit p0

    .line 36
    invoke-virtual {v0}, LM5/h;->r()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    sget-object p2, Lr5/a;->q:Lr5/a;

    .line 41
    .line 42
    if-ne p1, p2, :cond_1

    .line 43
    .line 44
    return-object p1

    .line 45
    :cond_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 46
    .line 47
    return-object p1

    .line 48
    :goto_1
    monitor-exit p0

    .line 49
    throw p1
.end method

.method public final i()V
    .locals 10

    .line 1
    iget-object v0, p0, LP5/G;->w:[Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LP5/G;->l()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {v0, v1, v2, v3}, LP5/H;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget v0, p0, LP5/G;->z:I

    .line 15
    .line 16
    add-int/lit8 v0, v0, -0x1

    .line 17
    .line 18
    iput v0, p0, LP5/G;->z:I

    .line 19
    .line 20
    invoke-virtual {p0}, LP5/G;->l()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    const-wide/16 v2, 0x1

    .line 25
    .line 26
    add-long/2addr v0, v2

    .line 27
    iget-wide v2, p0, LP5/G;->x:J

    .line 28
    .line 29
    cmp-long v2, v2, v0

    .line 30
    .line 31
    if-gez v2, :cond_0

    .line 32
    .line 33
    iput-wide v0, p0, LP5/G;->x:J

    .line 34
    .line 35
    :cond_0
    iget-wide v2, p0, LP5/G;->y:J

    .line 36
    .line 37
    cmp-long v2, v2, v0

    .line 38
    .line 39
    if-gez v2, :cond_3

    .line 40
    .line 41
    iget v2, p0, LQ5/b;->r:I

    .line 42
    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    iget-object v2, p0, LQ5/b;->q:[LQ5/d;

    .line 46
    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    array-length v3, v2

    .line 50
    const/4 v4, 0x0

    .line 51
    :goto_0
    if-ge v4, v3, :cond_2

    .line 52
    .line 53
    aget-object v5, v2, v4

    .line 54
    .line 55
    if-eqz v5, :cond_1

    .line 56
    .line 57
    check-cast v5, LP5/I;

    .line 58
    .line 59
    iget-wide v6, v5, LP5/I;->a:J

    .line 60
    .line 61
    const-wide/16 v8, 0x0

    .line 62
    .line 63
    cmp-long v8, v6, v8

    .line 64
    .line 65
    if-ltz v8, :cond_1

    .line 66
    .line 67
    cmp-long v6, v6, v0

    .line 68
    .line 69
    if-gez v6, :cond_1

    .line 70
    .line 71
    iput-wide v0, v5, LP5/I;->a:J

    .line 72
    .line 73
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    iput-wide v0, p0, LP5/G;->y:J

    .line 77
    .line 78
    :cond_3
    return-void
.end method

.method public final j(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget v0, p0, LP5/G;->z:I

    .line 2
    .line 3
    iget v1, p0, LP5/G;->A:I

    .line 4
    .line 5
    add-int/2addr v0, v1

    .line 6
    iget-object v1, p0, LP5/G;->w:[Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-virtual {p0, v1, v3, v2}, LP5/G;->m([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    array-length v3, v1

    .line 19
    if-lt v0, v3, :cond_1

    .line 20
    .line 21
    array-length v3, v1

    .line 22
    mul-int/2addr v3, v2

    .line 23
    invoke-virtual {p0, v1, v0, v3}, LP5/G;->m([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :cond_1
    :goto_0
    invoke-virtual {p0}, LP5/G;->l()J

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    int-to-long v4, v0

    .line 32
    add-long/2addr v2, v4

    .line 33
    invoke-static {v1, v2, v3, p1}, LP5/H;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final k([Lq5/c;)[Lq5/c;
    .locals 10

    .line 1
    array-length v0, p1

    .line 2
    iget v1, p0, LQ5/b;->r:I

    .line 3
    .line 4
    if-eqz v1, :cond_3

    .line 5
    .line 6
    iget-object v1, p0, LQ5/b;->q:[LQ5/d;

    .line 7
    .line 8
    if-eqz v1, :cond_3

    .line 9
    .line 10
    array-length v2, v1

    .line 11
    const/4 v3, 0x0

    .line 12
    :goto_0
    if-ge v3, v2, :cond_3

    .line 13
    .line 14
    aget-object v4, v1, v3

    .line 15
    .line 16
    if-eqz v4, :cond_2

    .line 17
    .line 18
    check-cast v4, LP5/I;

    .line 19
    .line 20
    iget-object v5, v4, LP5/I;->b:LM5/h;

    .line 21
    .line 22
    if-nez v5, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    invoke-virtual {p0, v4}, LP5/G;->p(LP5/I;)J

    .line 26
    .line 27
    .line 28
    move-result-wide v6

    .line 29
    const-wide/16 v8, 0x0

    .line 30
    .line 31
    cmp-long v6, v6, v8

    .line 32
    .line 33
    if-ltz v6, :cond_2

    .line 34
    .line 35
    array-length v6, p1

    .line 36
    if-lt v0, v6, :cond_1

    .line 37
    .line 38
    array-length v6, p1

    .line 39
    const/4 v7, 0x2

    .line 40
    mul-int/2addr v6, v7

    .line 41
    invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    invoke-static {p1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string v6, "copyOf(...)"

    .line 50
    .line 51
    invoke-static {p1, v6}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    move-object v6, p1

    .line 55
    check-cast v6, [Lq5/c;

    .line 56
    .line 57
    add-int/lit8 v7, v0, 0x1

    .line 58
    .line 59
    aput-object v5, v6, v0

    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    iput-object v0, v4, LP5/I;->b:LM5/h;

    .line 63
    .line 64
    move v0, v7

    .line 65
    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    check-cast p1, [Lq5/c;

    .line 69
    .line 70
    return-object p1
.end method

.method public final l()J
    .locals 4

    .line 1
    iget-wide v0, p0, LP5/G;->y:J

    .line 2
    .line 3
    iget-wide v2, p0, LP5/G;->x:J

    .line 4
    .line 5
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public final m([Ljava/lang/Object;II)[Ljava/lang/Object;
    .locals 7

    .line 1
    if-lez p3, :cond_2

    .line 2
    .line 3
    new-array p3, p3, [Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, LP5/G;->w:[Ljava/lang/Object;

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-virtual {p0}, LP5/G;->l()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-ge v2, p2, :cond_1

    .line 16
    .line 17
    int-to-long v3, v2

    .line 18
    add-long/2addr v3, v0

    .line 19
    long-to-int v5, v3

    .line 20
    array-length v6, p1

    .line 21
    add-int/lit8 v6, v6, -0x1

    .line 22
    .line 23
    and-int/2addr v5, v6

    .line 24
    aget-object v5, p1, v5

    .line 25
    .line 26
    invoke-static {p3, v3, v4, v5}, LP5/H;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    :goto_1
    return-object p3

    .line 33
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    const-string p2, "Buffer size overflow"

    .line 36
    .line 37
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1
.end method

.method public final n(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    sget-object v0, LQ5/c;->a:[Lq5/c;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    invoke-virtual {p0, p1}, LP5/G;->o(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, LP5/G;->k([Lq5/c;)[Lq5/c;

    .line 8
    .line 9
    .line 10
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    monitor-exit p0

    .line 12
    array-length v0, p1

    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    if-ge v1, v0, :cond_1

    .line 15
    .line 16
    aget-object v2, p1, v1

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    sget-object v3, Lm5/y;->a:Lm5/y;

    .line 21
    .line 22
    invoke-interface {v2, v3}, Lq5/c;->resumeWith(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 p1, 0x1

    .line 29
    return p1

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    monitor-exit p0

    .line 32
    throw p1
.end method

.method public final o(Ljava/lang/Object;)Z
    .locals 12

    .line 1
    iget v1, p0, LQ5/b;->r:I

    .line 2
    .line 3
    iget v2, p0, LP5/G;->u:I

    .line 4
    .line 5
    const/4 v9, 0x1

    .line 6
    if-nez v1, :cond_2

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual/range {p0 .. p1}, LP5/G;->j(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget v1, p0, LP5/G;->z:I

    .line 15
    .line 16
    add-int/2addr v1, v9

    .line 17
    iput v1, p0, LP5/G;->z:I

    .line 18
    .line 19
    if-le v1, v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, LP5/G;->i()V

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {p0}, LP5/G;->l()J

    .line 25
    .line 26
    .line 27
    move-result-wide v1

    .line 28
    iget v3, p0, LP5/G;->z:I

    .line 29
    .line 30
    int-to-long v3, v3

    .line 31
    add-long/2addr v1, v3

    .line 32
    iput-wide v1, p0, LP5/G;->y:J

    .line 33
    .line 34
    return v9

    .line 35
    :cond_2
    iget v1, p0, LP5/G;->v:I

    .line 36
    .line 37
    invoke-virtual/range {p0 .. p1}, LP5/G;->j(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget v3, p0, LP5/G;->z:I

    .line 41
    .line 42
    add-int/2addr v3, v9

    .line 43
    iput v3, p0, LP5/G;->z:I

    .line 44
    .line 45
    if-le v3, v1, :cond_3

    .line 46
    .line 47
    invoke-virtual {p0}, LP5/G;->i()V

    .line 48
    .line 49
    .line 50
    :cond_3
    invoke-virtual {p0}, LP5/G;->l()J

    .line 51
    .line 52
    .line 53
    move-result-wide v3

    .line 54
    iget v1, p0, LP5/G;->z:I

    .line 55
    .line 56
    int-to-long v5, v1

    .line 57
    add-long/2addr v3, v5

    .line 58
    iget-wide v5, p0, LP5/G;->x:J

    .line 59
    .line 60
    sub-long/2addr v3, v5

    .line 61
    long-to-int v1, v3

    .line 62
    if-le v1, v2, :cond_4

    .line 63
    .line 64
    const-wide/16 v1, 0x1

    .line 65
    .line 66
    add-long/2addr v1, v5

    .line 67
    iget-wide v3, p0, LP5/G;->y:J

    .line 68
    .line 69
    invoke-virtual {p0}, LP5/G;->l()J

    .line 70
    .line 71
    .line 72
    move-result-wide v5

    .line 73
    iget v7, p0, LP5/G;->z:I

    .line 74
    .line 75
    int-to-long v7, v7

    .line 76
    add-long/2addr v5, v7

    .line 77
    invoke-virtual {p0}, LP5/G;->l()J

    .line 78
    .line 79
    .line 80
    move-result-wide v7

    .line 81
    iget v10, p0, LP5/G;->z:I

    .line 82
    .line 83
    int-to-long v10, v10

    .line 84
    add-long/2addr v7, v10

    .line 85
    iget v10, p0, LP5/G;->A:I

    .line 86
    .line 87
    int-to-long v10, v10

    .line 88
    add-long/2addr v7, v10

    .line 89
    move-object v0, p0

    .line 90
    invoke-virtual/range {v0 .. v8}, LP5/G;->r(JJJJ)V

    .line 91
    .line 92
    .line 93
    :cond_4
    :goto_0
    return v9
.end method

.method public final p(LP5/I;)J
    .locals 6

    .line 1
    iget-wide v0, p1, LP5/I;->a:J

    .line 2
    .line 3
    invoke-virtual {p0}, LP5/G;->l()J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    iget p1, p0, LP5/G;->z:I

    .line 8
    .line 9
    int-to-long v4, p1

    .line 10
    add-long/2addr v2, v4

    .line 11
    cmp-long p1, v0, v2

    .line 12
    .line 13
    if-gez p1, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    iget p1, p0, LP5/G;->v:I

    .line 17
    .line 18
    if-lez p1, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {p0}, LP5/G;->l()J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    cmp-long p1, v0, v2

    .line 26
    .line 27
    if-lez p1, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    iget p1, p0, LP5/G;->A:I

    .line 31
    .line 32
    if-nez p1, :cond_3

    .line 33
    .line 34
    :goto_0
    const-wide/16 v0, -0x1

    .line 35
    .line 36
    :cond_3
    :goto_1
    return-wide v0
.end method

.method public final q(LP5/I;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, LQ5/c;->a:[Lq5/c;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    invoke-virtual {p0, p1}, LP5/G;->p(LP5/I;)J

    .line 5
    .line 6
    .line 7
    move-result-wide v1

    .line 8
    const-wide/16 v3, 0x0

    .line 9
    .line 10
    cmp-long v3, v1, v3

    .line 11
    .line 12
    if-gez v3, :cond_0

    .line 13
    .line 14
    sget-object p1, LP5/H;->a:LE4/f;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    goto :goto_2

    .line 19
    :cond_0
    iget-wide v3, p1, LP5/I;->a:J

    .line 20
    .line 21
    iget-object v0, p0, LP5/G;->w:[Ljava/lang/Object;

    .line 22
    .line 23
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    long-to-int v5, v1

    .line 27
    array-length v6, v0

    .line 28
    add-int/lit8 v6, v6, -0x1

    .line 29
    .line 30
    and-int/2addr v5, v6

    .line 31
    aget-object v0, v0, v5

    .line 32
    .line 33
    instance-of v5, v0, LP5/E;

    .line 34
    .line 35
    if-eqz v5, :cond_1

    .line 36
    .line 37
    check-cast v0, LP5/E;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    :cond_1
    const-wide/16 v5, 0x1

    .line 44
    .line 45
    add-long/2addr v1, v5

    .line 46
    iput-wide v1, p1, LP5/I;->a:J

    .line 47
    .line 48
    invoke-virtual {p0, v3, v4}, LP5/G;->s(J)[Lq5/c;

    .line 49
    .line 50
    .line 51
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    move-object v7, v0

    .line 53
    move-object v0, p1

    .line 54
    move-object p1, v7

    .line 55
    :goto_0
    monitor-exit p0

    .line 56
    array-length v1, v0

    .line 57
    const/4 v2, 0x0

    .line 58
    :goto_1
    if-ge v2, v1, :cond_3

    .line 59
    .line 60
    aget-object v3, v0, v2

    .line 61
    .line 62
    if-eqz v3, :cond_2

    .line 63
    .line 64
    sget-object v4, Lm5/y;->a:Lm5/y;

    .line 65
    .line 66
    invoke-interface {v3, v4}, Lq5/c;->resumeWith(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    return-object p1

    .line 73
    :goto_2
    monitor-exit p0

    .line 74
    throw p1
.end method

.method public final r(JJJJ)V
    .locals 6

    .line 1
    invoke-static {p3, p4, p1, p2}, Ljava/lang/Math;->min(JJ)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0}, LP5/G;->l()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    :goto_0
    cmp-long v4, v2, v0

    .line 10
    .line 11
    if-gez v4, :cond_0

    .line 12
    .line 13
    iget-object v4, p0, LP5/G;->w:[Ljava/lang/Object;

    .line 14
    .line 15
    invoke-static {v4}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    invoke-static {v4, v2, v3, v5}, LP5/H;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    const-wide/16 v4, 0x1

    .line 23
    .line 24
    add-long/2addr v2, v4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iput-wide p1, p0, LP5/G;->x:J

    .line 27
    .line 28
    iput-wide p3, p0, LP5/G;->y:J

    .line 29
    .line 30
    sub-long p1, p5, v0

    .line 31
    .line 32
    long-to-int p1, p1

    .line 33
    iput p1, p0, LP5/G;->z:I

    .line 34
    .line 35
    sub-long/2addr p7, p5

    .line 36
    long-to-int p1, p7

    .line 37
    iput p1, p0, LP5/G;->A:I

    .line 38
    .line 39
    return-void
.end method

.method public final s(J)[Lq5/c;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, LP5/H;->a:LE4/f;

    .line 4
    .line 5
    sget-object v2, LQ5/c;->a:[Lq5/c;

    .line 6
    .line 7
    iget-wide v3, v0, LP5/G;->y:J

    .line 8
    .line 9
    cmp-long v3, p1, v3

    .line 10
    .line 11
    if-lez v3, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-virtual {v0}, LP5/G;->l()J

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    iget v5, v0, LP5/G;->z:I

    .line 19
    .line 20
    int-to-long v5, v5

    .line 21
    add-long/2addr v5, v3

    .line 22
    iget v7, v0, LP5/G;->v:I

    .line 23
    .line 24
    const-wide/16 v8, 0x1

    .line 25
    .line 26
    if-nez v7, :cond_1

    .line 27
    .line 28
    iget v10, v0, LP5/G;->A:I

    .line 29
    .line 30
    if-lez v10, :cond_1

    .line 31
    .line 32
    add-long/2addr v5, v8

    .line 33
    :cond_1
    iget v10, v0, LQ5/b;->r:I

    .line 34
    .line 35
    const/4 v11, 0x0

    .line 36
    if-eqz v10, :cond_3

    .line 37
    .line 38
    iget-object v10, v0, LQ5/b;->q:[LQ5/d;

    .line 39
    .line 40
    if-eqz v10, :cond_3

    .line 41
    .line 42
    array-length v12, v10

    .line 43
    move v13, v11

    .line 44
    :goto_0
    if-ge v13, v12, :cond_3

    .line 45
    .line 46
    aget-object v14, v10, v13

    .line 47
    .line 48
    if-eqz v14, :cond_2

    .line 49
    .line 50
    check-cast v14, LP5/I;

    .line 51
    .line 52
    iget-wide v14, v14, LP5/I;->a:J

    .line 53
    .line 54
    const-wide/16 v16, 0x0

    .line 55
    .line 56
    cmp-long v16, v14, v16

    .line 57
    .line 58
    if-ltz v16, :cond_2

    .line 59
    .line 60
    cmp-long v16, v14, v5

    .line 61
    .line 62
    if-gez v16, :cond_2

    .line 63
    .line 64
    move-wide v5, v14

    .line 65
    :cond_2
    add-int/lit8 v13, v13, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    iget-wide v12, v0, LP5/G;->y:J

    .line 69
    .line 70
    cmp-long v10, v5, v12

    .line 71
    .line 72
    if-gtz v10, :cond_4

    .line 73
    .line 74
    :goto_1
    return-object v2

    .line 75
    :cond_4
    invoke-virtual {v0}, LP5/G;->l()J

    .line 76
    .line 77
    .line 78
    move-result-wide v12

    .line 79
    iget v10, v0, LP5/G;->z:I

    .line 80
    .line 81
    int-to-long v14, v10

    .line 82
    add-long/2addr v12, v14

    .line 83
    iget v10, v0, LQ5/b;->r:I

    .line 84
    .line 85
    if-lez v10, :cond_5

    .line 86
    .line 87
    sub-long v14, v12, v5

    .line 88
    .line 89
    long-to-int v10, v14

    .line 90
    iget v14, v0, LP5/G;->A:I

    .line 91
    .line 92
    sub-int v10, v7, v10

    .line 93
    .line 94
    invoke-static {v14, v10}, Ljava/lang/Math;->min(II)I

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    goto :goto_2

    .line 99
    :cond_5
    iget v10, v0, LP5/G;->A:I

    .line 100
    .line 101
    :goto_2
    iget v14, v0, LP5/G;->A:I

    .line 102
    .line 103
    int-to-long v14, v14

    .line 104
    add-long/2addr v14, v12

    .line 105
    if-lez v10, :cond_9

    .line 106
    .line 107
    new-array v2, v10, [Lq5/c;

    .line 108
    .line 109
    move-wide/from16 p1, v8

    .line 110
    .line 111
    iget-object v8, v0, LP5/G;->w:[Ljava/lang/Object;

    .line 112
    .line 113
    invoke-static {v8}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    move-wide/from16 v16, v3

    .line 117
    .line 118
    move-object v4, v2

    .line 119
    move-wide v2, v12

    .line 120
    :goto_3
    cmp-long v9, v12, v14

    .line 121
    .line 122
    if-gez v9, :cond_8

    .line 123
    .line 124
    long-to-int v9, v12

    .line 125
    move-object/from16 v18, v4

    .line 126
    .line 127
    array-length v4, v8

    .line 128
    add-int/lit8 v4, v4, -0x1

    .line 129
    .line 130
    and-int/2addr v4, v9

    .line 131
    aget-object v4, v8, v4

    .line 132
    .line 133
    if-eq v4, v1, :cond_7

    .line 134
    .line 135
    const-string v9, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter"

    .line 136
    .line 137
    invoke-static {v4, v9}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    check-cast v4, LP5/E;

    .line 141
    .line 142
    add-int/lit8 v9, v11, 0x1

    .line 143
    .line 144
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    const/4 v4, 0x0

    .line 148
    aput-object v4, v18, v11

    .line 149
    .line 150
    invoke-static {v8, v12, v13, v1}, LP5/H;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    invoke-static {v8, v2, v3, v4}, LP5/H;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    add-long v2, v2, p1

    .line 157
    .line 158
    if-ge v9, v10, :cond_6

    .line 159
    .line 160
    move v11, v9

    .line 161
    goto :goto_5

    .line 162
    :cond_6
    :goto_4
    move-wide v12, v2

    .line 163
    move-object/from16 v9, v18

    .line 164
    .line 165
    goto :goto_6

    .line 166
    :cond_7
    :goto_5
    add-long v12, v12, p1

    .line 167
    .line 168
    move-object/from16 v4, v18

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_8
    move-object/from16 v18, v4

    .line 172
    .line 173
    goto :goto_4

    .line 174
    :cond_9
    move-wide/from16 v16, v3

    .line 175
    .line 176
    move-wide/from16 p1, v8

    .line 177
    .line 178
    move-object v9, v2

    .line 179
    :goto_6
    sub-long v2, v12, v16

    .line 180
    .line 181
    long-to-int v2, v2

    .line 182
    iget v3, v0, LQ5/b;->r:I

    .line 183
    .line 184
    if-nez v3, :cond_a

    .line 185
    .line 186
    move-wide v3, v12

    .line 187
    goto :goto_7

    .line 188
    :cond_a
    move-wide v3, v5

    .line 189
    :goto_7
    iget-wide v5, v0, LP5/G;->x:J

    .line 190
    .line 191
    iget v8, v0, LP5/G;->u:I

    .line 192
    .line 193
    invoke-static {v8, v2}, Ljava/lang/Math;->min(II)I

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    int-to-long v10, v2

    .line 198
    sub-long v10, v12, v10

    .line 199
    .line 200
    invoke-static {v5, v6, v10, v11}, Ljava/lang/Math;->max(JJ)J

    .line 201
    .line 202
    .line 203
    move-result-wide v5

    .line 204
    if-nez v7, :cond_b

    .line 205
    .line 206
    cmp-long v2, v5, v14

    .line 207
    .line 208
    if-gez v2, :cond_b

    .line 209
    .line 210
    iget-object v2, v0, LP5/G;->w:[Ljava/lang/Object;

    .line 211
    .line 212
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    long-to-int v7, v5

    .line 216
    array-length v8, v2

    .line 217
    add-int/lit8 v8, v8, -0x1

    .line 218
    .line 219
    and-int/2addr v7, v8

    .line 220
    aget-object v2, v2, v7

    .line 221
    .line 222
    invoke-static {v2, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    if-eqz v1, :cond_b

    .line 227
    .line 228
    add-long v12, v12, p1

    .line 229
    .line 230
    add-long v5, v5, p1

    .line 231
    .line 232
    :cond_b
    move-wide v1, v5

    .line 233
    move-wide v5, v12

    .line 234
    move-wide v7, v14

    .line 235
    invoke-virtual/range {v0 .. v8}, LP5/G;->r(JJJJ)V

    .line 236
    .line 237
    .line 238
    iget v1, v0, LP5/G;->v:I

    .line 239
    .line 240
    const/4 v2, 0x1

    .line 241
    if-nez v1, :cond_c

    .line 242
    .line 243
    iget v1, v0, LP5/G;->A:I

    .line 244
    .line 245
    if-gt v1, v2, :cond_c

    .line 246
    .line 247
    goto :goto_9

    .line 248
    :cond_c
    iget-object v1, v0, LP5/G;->w:[Ljava/lang/Object;

    .line 249
    .line 250
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    :goto_8
    iget v3, v0, LP5/G;->A:I

    .line 254
    .line 255
    if-lez v3, :cond_d

    .line 256
    .line 257
    invoke-virtual {v0}, LP5/G;->l()J

    .line 258
    .line 259
    .line 260
    move-result-wide v3

    .line 261
    iget v5, v0, LP5/G;->z:I

    .line 262
    .line 263
    iget v6, v0, LP5/G;->A:I

    .line 264
    .line 265
    add-int/2addr v5, v6

    .line 266
    int-to-long v7, v5

    .line 267
    add-long/2addr v3, v7

    .line 268
    const-wide/16 v7, 0x1

    .line 269
    .line 270
    sub-long/2addr v3, v7

    .line 271
    long-to-int v3, v3

    .line 272
    array-length v4, v1

    .line 273
    sub-int/2addr v4, v2

    .line 274
    and-int/2addr v3, v4

    .line 275
    aget-object v3, v1, v3

    .line 276
    .line 277
    sget-object v4, LP5/H;->a:LE4/f;

    .line 278
    .line 279
    if-ne v3, v4, :cond_d

    .line 280
    .line 281
    add-int/lit8 v6, v6, -0x1

    .line 282
    .line 283
    iput v6, v0, LP5/G;->A:I

    .line 284
    .line 285
    invoke-virtual {v0}, LP5/G;->l()J

    .line 286
    .line 287
    .line 288
    move-result-wide v3

    .line 289
    iget v5, v0, LP5/G;->z:I

    .line 290
    .line 291
    iget v6, v0, LP5/G;->A:I

    .line 292
    .line 293
    add-int/2addr v5, v6

    .line 294
    int-to-long v5, v5

    .line 295
    add-long/2addr v3, v5

    .line 296
    const/4 v5, 0x0

    .line 297
    invoke-static {v1, v3, v4, v5}, LP5/H;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    goto :goto_8

    .line 301
    :cond_d
    :goto_9
    array-length v1, v9

    .line 302
    if-nez v1, :cond_e

    .line 303
    .line 304
    return-object v9

    .line 305
    :cond_e
    invoke-virtual {v0, v9}, LP5/G;->k([Lq5/c;)[Lq5/c;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    return-object v1
.end method
