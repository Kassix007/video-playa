.class public final Lz0/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP/i;


# instance fields
.field public final A:Lr/V;

.field public final B:Lr/G;

.field public final C:LR/e;

.field public D:I

.field public E:I

.field public final q:LB0/L;

.field public r:LP/r;

.field public s:Lz0/U;

.field public t:I

.field public u:I

.field public final v:Lr/G;

.field public final w:Lr/G;

.field public final x:Lz0/t;

.field public final y:Lz0/q;

.field public final z:Lr/G;


# direct methods
.method public constructor <init>(LB0/L;Lz0/U;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz0/y;->q:LB0/L;

    .line 5
    .line 6
    iput-object p2, p0, Lz0/y;->s:Lz0/U;

    .line 7
    .line 8
    sget-object p1, Lr/O;->a:[J

    .line 9
    .line 10
    new-instance p1, Lr/G;

    .line 11
    .line 12
    invoke-direct {p1}, Lr/G;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lz0/y;->v:Lr/G;

    .line 16
    .line 17
    new-instance p1, Lr/G;

    .line 18
    .line 19
    invoke-direct {p1}, Lr/G;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lz0/y;->w:Lr/G;

    .line 23
    .line 24
    new-instance p1, Lz0/t;

    .line 25
    .line 26
    invoke-direct {p1, p0}, Lz0/t;-><init>(Lz0/y;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lz0/y;->x:Lz0/t;

    .line 30
    .line 31
    new-instance p1, Lz0/q;

    .line 32
    .line 33
    invoke-direct {p1, p0}, Lz0/q;-><init>(Lz0/y;)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lz0/y;->y:Lz0/q;

    .line 37
    .line 38
    new-instance p1, Lr/G;

    .line 39
    .line 40
    invoke-direct {p1}, Lr/G;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Lz0/y;->z:Lr/G;

    .line 44
    .line 45
    new-instance p1, Lr/V;

    .line 46
    .line 47
    invoke-direct {p1}, Lr/V;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Lz0/y;->A:Lr/V;

    .line 51
    .line 52
    new-instance p1, Lr/G;

    .line 53
    .line 54
    invoke-direct {p1}, Lr/G;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object p1, p0, Lz0/y;->B:Lr/G;

    .line 58
    .line 59
    new-instance p1, LR/e;

    .line 60
    .line 61
    const/16 p2, 0x10

    .line 62
    .line 63
    new-array p2, p2, [Ljava/lang/Object;

    .line 64
    .line 65
    invoke-direct {p1, p2}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, Lz0/y;->C:LR/e;

    .line 69
    .line 70
    return-void
.end method

.method public static i(LP/u;LB0/L;ZLP/r;LX/e;)LP/u;
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    iget-boolean v0, p0, LP/u;->J:Z

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    :cond_0
    sget-object p0, LC0/x1;->a:Landroid/view/ViewGroup$LayoutParams;

    .line 8
    .line 9
    new-instance p0, LB0/G0;

    .line 10
    .line 11
    invoke-direct {p0, p1}, LB0/G0;-><init>(LB0/L;)V

    .line 12
    .line 13
    .line 14
    new-instance p1, LP/u;

    .line 15
    .line 16
    invoke-direct {p1, p3, p0}, LP/u;-><init>(LP/r;LB0/G0;)V

    .line 17
    .line 18
    .line 19
    move-object p0, p1

    .line 20
    :cond_1
    if-nez p2, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0, p4}, LP/u;->j(LX/e;)V

    .line 23
    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_2
    iget-object p1, p0, LP/u;->I:LP/o;

    .line 27
    .line 28
    const/16 p2, 0x64

    .line 29
    .line 30
    iput p2, p1, LP/o;->y:I

    .line 31
    .line 32
    const/4 p3, 0x1

    .line 33
    iput-boolean p3, p1, LP/o;->x:Z

    .line 34
    .line 35
    invoke-virtual {p0, p4}, LP/u;->j(LX/e;)V

    .line 36
    .line 37
    .line 38
    iget-boolean p3, p1, LP/o;->E:Z

    .line 39
    .line 40
    if-nez p3, :cond_3

    .line 41
    .line 42
    iget p3, p1, LP/o;->y:I

    .line 43
    .line 44
    if-ne p3, p2, :cond_3

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_3
    const-string p2, "Cannot disable reuse from root if it was caused by other groups"

    .line 48
    .line 49
    invoke-static {p2}, LP/j0;->a(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :goto_0
    const/4 p2, -0x1

    .line 53
    iput p2, p1, LP/o;->y:I

    .line 54
    .line 55
    const/4 p2, 0x0

    .line 56
    iput-boolean p2, p1, LP/o;->x:Z

    .line 57
    .line 58
    return-object p0
.end method


# virtual methods
.method public final a(I)V
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lz0/y;->D:I

    .line 3
    .line 4
    iget-object v1, p0, Lz0/y;->q:LB0/L;

    .line 5
    .line 6
    invoke-virtual {v1}, LB0/L;->o()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    move-object v2, v1

    .line 11
    check-cast v2, LR/b;

    .line 12
    .line 13
    iget-object v3, v2, LR/b;->q:LR/e;

    .line 14
    .line 15
    iget v3, v3, LR/e;->s:I

    .line 16
    .line 17
    iget v4, p0, Lz0/y;->E:I

    .line 18
    .line 19
    sub-int/2addr v3, v4

    .line 20
    const/4 v4, 0x1

    .line 21
    sub-int/2addr v3, v4

    .line 22
    if-gt p1, v3, :cond_7

    .line 23
    .line 24
    iget-object v5, p0, Lz0/y;->A:Lr/V;

    .line 25
    .line 26
    invoke-virtual {v5}, Lr/V;->clear()V

    .line 27
    .line 28
    .line 29
    if-gt p1, v3, :cond_0

    .line 30
    .line 31
    move v5, p1

    .line 32
    :goto_0
    invoke-virtual {v2, v5}, LR/b;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    check-cast v6, LB0/L;

    .line 37
    .line 38
    iget-object v7, p0, Lz0/y;->v:Lr/G;

    .line 39
    .line 40
    invoke-virtual {v7, v6}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    invoke-static {v6}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    check-cast v6, Lz0/r;

    .line 48
    .line 49
    iget-object v6, v6, Lz0/r;->a:Ljava/lang/Object;

    .line 50
    .line 51
    iget-object v7, p0, Lz0/y;->A:Lr/V;

    .line 52
    .line 53
    iget-object v7, v7, Lr/V;->r:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v7, Lr/D;

    .line 56
    .line 57
    invoke-virtual {v7, v6}, Lr/D;->a(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    if-eq v5, v3, :cond_0

    .line 61
    .line 62
    add-int/lit8 v5, v5, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    iget-object v2, p0, Lz0/y;->s:Lz0/U;

    .line 66
    .line 67
    iget-object v5, p0, Lz0/y;->A:Lr/V;

    .line 68
    .line 69
    invoke-interface {v2, v5}, Lz0/U;->b(Lr/V;)V

    .line 70
    .line 71
    .line 72
    invoke-static {}, La0/r;->c()La0/h;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    if-eqz v2, :cond_1

    .line 77
    .line 78
    invoke-virtual {v2}, La0/h;->e()LB5/c;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    goto :goto_1

    .line 83
    :cond_1
    const/4 v5, 0x0

    .line 84
    :goto_1
    invoke-static {v2}, La0/r;->d(La0/h;)La0/h;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    move v7, v0

    .line 89
    :goto_2
    if-lt v3, p1, :cond_6

    .line 90
    .line 91
    :try_start_0
    move-object v8, v1

    .line 92
    check-cast v8, LR/b;

    .line 93
    .line 94
    invoke-virtual {v8, v3}, LR/b;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    check-cast v8, LB0/L;

    .line 99
    .line 100
    iget-object v9, p0, Lz0/y;->v:Lr/G;

    .line 101
    .line 102
    invoke-virtual {v9, v8}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    invoke-static {v9}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    check-cast v9, Lz0/r;

    .line 110
    .line 111
    iget-object v10, v9, Lz0/r;->a:Ljava/lang/Object;

    .line 112
    .line 113
    iget-object v11, p0, Lz0/y;->A:Lr/V;

    .line 114
    .line 115
    iget-object v11, v11, Lr/V;->r:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v11, Lr/D;

    .line 118
    .line 119
    invoke-virtual {v11, v10}, Lr/D;->c(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v11

    .line 123
    if-eqz v11, :cond_3

    .line 124
    .line 125
    iget v11, p0, Lz0/y;->D:I

    .line 126
    .line 127
    add-int/2addr v11, v4

    .line 128
    iput v11, p0, Lz0/y;->D:I

    .line 129
    .line 130
    iget-object v11, v9, Lz0/r;->f:LP/f0;

    .line 131
    .line 132
    invoke-virtual {v11}, LP/f0;->getValue()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v11

    .line 136
    check-cast v11, Ljava/lang/Boolean;

    .line 137
    .line 138
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 139
    .line 140
    .line 141
    move-result v11

    .line 142
    if-eqz v11, :cond_5

    .line 143
    .line 144
    iget-object v7, v8, LB0/L;->V:LB0/P;

    .line 145
    .line 146
    iget-object v8, v7, LB0/P;->p:LB0/c0;

    .line 147
    .line 148
    sget-object v11, LB0/I;->s:LB0/I;

    .line 149
    .line 150
    iput-object v11, v8, LB0/c0;->B:LB0/I;

    .line 151
    .line 152
    iget-object v7, v7, LB0/P;->q:LB0/Y;

    .line 153
    .line 154
    if-eqz v7, :cond_2

    .line 155
    .line 156
    iput-object v11, v7, LB0/Y;->z:LB0/I;

    .line 157
    .line 158
    :cond_2
    iget-object v7, v9, Lz0/r;->f:LP/f0;

    .line 159
    .line 160
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 161
    .line 162
    invoke-virtual {v7, v8}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    move v7, v4

    .line 166
    goto :goto_3

    .line 167
    :catchall_0
    move-exception p1

    .line 168
    goto :goto_4

    .line 169
    :cond_3
    iget-object v11, p0, Lz0/y;->q:LB0/L;

    .line 170
    .line 171
    iput-boolean v4, v11, LB0/L;->G:Z

    .line 172
    .line 173
    iget-object v12, p0, Lz0/y;->v:Lr/G;

    .line 174
    .line 175
    invoke-virtual {v12, v8}, Lr/G;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    iget-object v8, v9, Lz0/r;->c:LP/u;

    .line 179
    .line 180
    if-eqz v8, :cond_4

    .line 181
    .line 182
    invoke-virtual {v8}, LP/u;->l()V

    .line 183
    .line 184
    .line 185
    :cond_4
    iget-object v8, p0, Lz0/y;->q:LB0/L;

    .line 186
    .line 187
    invoke-virtual {v8, v3, v4}, LB0/L;->N(II)V

    .line 188
    .line 189
    .line 190
    iput-boolean v0, v11, LB0/L;->G:Z

    .line 191
    .line 192
    :cond_5
    :goto_3
    iget-object v8, p0, Lz0/y;->w:Lr/G;

    .line 193
    .line 194
    invoke-virtual {v8, v10}, Lr/G;->j(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 195
    .line 196
    .line 197
    add-int/lit8 v3, v3, -0x1

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :goto_4
    invoke-static {v2, v6, v5}, La0/r;->f(La0/h;La0/h;LB5/c;)V

    .line 201
    .line 202
    .line 203
    throw p1

    .line 204
    :cond_6
    invoke-static {v2, v6, v5}, La0/r;->f(La0/h;La0/h;LB5/c;)V

    .line 205
    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_7
    move v7, v0

    .line 209
    :goto_5
    if-eqz v7, :cond_9

    .line 210
    .line 211
    sget-object p1, La0/n;->b:Ljava/lang/Object;

    .line 212
    .line 213
    monitor-enter p1

    .line 214
    :try_start_1
    sget-object v1, La0/n;->i:La0/c;

    .line 215
    .line 216
    iget-object v1, v1, La0/d;->h:Lr/H;

    .line 217
    .line 218
    if-eqz v1, :cond_8

    .line 219
    .line 220
    invoke-virtual {v1}, Lr/H;->h()Z

    .line 221
    .line 222
    .line 223
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 224
    if-ne v1, v4, :cond_8

    .line 225
    .line 226
    move v0, v4

    .line 227
    :cond_8
    monitor-exit p1

    .line 228
    if-eqz v0, :cond_9

    .line 229
    .line 230
    invoke-static {}, La0/n;->a()V

    .line 231
    .line 232
    .line 233
    goto :goto_6

    .line 234
    :catchall_1
    move-exception v0

    .line 235
    monitor-exit p1

    .line 236
    throw v0

    .line 237
    :cond_9
    :goto_6
    invoke-virtual {p0}, Lz0/y;->b()V

    .line 238
    .line 239
    .line 240
    return-void
.end method

.method public final b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lz0/y;->q:LB0/L;

    .line 2
    .line 3
    invoke-virtual {v0}, LB0/L;->o()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LR/b;

    .line 8
    .line 9
    iget-object v0, v0, LR/b;->q:LR/e;

    .line 10
    .line 11
    iget v0, v0, LR/e;->s:I

    .line 12
    .line 13
    iget-object v1, p0, Lz0/y;->v:Lr/G;

    .line 14
    .line 15
    iget v2, v1, Lr/G;->e:I

    .line 16
    .line 17
    if-ne v2, v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v3, "Inconsistency between the count of nodes tracked by the state ("

    .line 23
    .line 24
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget v1, v1, Lr/G;->e:I

    .line 28
    .line 29
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, ") and the children count on the SubcomposeLayout ("

    .line 33
    .line 34
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, "). Are you trying to use the state of the disposed SubcomposeLayout?"

    .line 41
    .line 42
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-static {v1}, Ly0/a;->a(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :goto_0
    iget v1, p0, Lz0/y;->D:I

    .line 53
    .line 54
    sub-int v1, v0, v1

    .line 55
    .line 56
    iget v2, p0, Lz0/y;->E:I

    .line 57
    .line 58
    sub-int/2addr v1, v2

    .line 59
    if-ltz v1, :cond_1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    const-string v1, "Incorrect state. Total children "

    .line 63
    .line 64
    const-string v2, ". Reusable children "

    .line 65
    .line 66
    invoke-static {v1, v2, v0}, Lk1/i;->l(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget v1, p0, Lz0/y;->D:I

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v1, ". Precomposed children "

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget v1, p0, Lz0/y;->E:I

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {v0}, Ly0/a;->a(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    :goto_1
    iget-object v0, p0, Lz0/y;->z:Lr/G;

    .line 93
    .line 94
    iget v1, v0, Lr/G;->e:I

    .line 95
    .line 96
    iget v2, p0, Lz0/y;->E:I

    .line 97
    .line 98
    if-ne v1, v2, :cond_2

    .line 99
    .line 100
    return-void

    .line 101
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    const-string v2, "Incorrect state. Precomposed children "

    .line 104
    .line 105
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    iget v2, p0, Lz0/y;->E:I

    .line 109
    .line 110
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v2, ". Map size "

    .line 114
    .line 115
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    iget v0, v0, Lr/G;->e:I

    .line 119
    .line 120
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-static {v0}, Ly0/a;->a(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    return-void
.end method

.method public final c(Z)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lz0/y;->E:I

    .line 3
    .line 4
    iget-object v1, p0, Lz0/y;->z:Lr/G;

    .line 5
    .line 6
    invoke-virtual {v1}, Lr/G;->a()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lz0/y;->q:LB0/L;

    .line 10
    .line 11
    invoke-virtual {v1}, LB0/L;->o()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    move-object v2, v1

    .line 16
    check-cast v2, LR/b;

    .line 17
    .line 18
    iget-object v2, v2, LR/b;->q:LR/e;

    .line 19
    .line 20
    iget v2, v2, LR/e;->s:I

    .line 21
    .line 22
    iget v3, p0, Lz0/y;->D:I

    .line 23
    .line 24
    if-eq v3, v2, :cond_6

    .line 25
    .line 26
    iput v2, p0, Lz0/y;->D:I

    .line 27
    .line 28
    invoke-static {}, La0/r;->c()La0/h;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    invoke-virtual {v3}, La0/h;->e()LB5/c;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v4, 0x0

    .line 40
    :goto_0
    invoke-static {v3}, La0/r;->d(La0/h;)La0/h;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    :goto_1
    if-ge v0, v2, :cond_5

    .line 45
    .line 46
    :try_start_0
    move-object v6, v1

    .line 47
    check-cast v6, LR/b;

    .line 48
    .line 49
    invoke-virtual {v6, v0}, LR/b;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    check-cast v6, LB0/L;

    .line 54
    .line 55
    iget-object v7, p0, Lz0/y;->v:Lr/G;

    .line 56
    .line 57
    invoke-virtual {v7, v6}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    check-cast v7, Lz0/r;

    .line 62
    .line 63
    if-eqz v7, :cond_4

    .line 64
    .line 65
    iget-object v8, v7, Lz0/r;->f:LP/f0;

    .line 66
    .line 67
    invoke-virtual {v8}, LP/f0;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    check-cast v8, Ljava/lang/Boolean;

    .line 72
    .line 73
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    if-eqz v8, :cond_4

    .line 78
    .line 79
    iget-object v6, v6, LB0/L;->V:LB0/P;

    .line 80
    .line 81
    iget-object v8, v6, LB0/P;->p:LB0/c0;

    .line 82
    .line 83
    sget-object v9, LB0/I;->s:LB0/I;

    .line 84
    .line 85
    iput-object v9, v8, LB0/c0;->B:LB0/I;

    .line 86
    .line 87
    iget-object v6, v6, LB0/P;->q:LB0/Y;

    .line 88
    .line 89
    if-eqz v6, :cond_1

    .line 90
    .line 91
    iput-object v9, v6, LB0/Y;->z:LB0/I;

    .line 92
    .line 93
    :cond_1
    if-eqz p1, :cond_3

    .line 94
    .line 95
    iget-object v6, v7, Lz0/r;->c:LP/u;

    .line 96
    .line 97
    if-eqz v6, :cond_2

    .line 98
    .line 99
    invoke-virtual {v6}, LP/u;->k()V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :catchall_0
    move-exception p1

    .line 104
    goto :goto_4

    .line 105
    :cond_2
    :goto_2
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 106
    .line 107
    invoke-static {v6}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    iput-object v6, v7, Lz0/r;->f:LP/f0;

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_3
    iget-object v6, v7, Lz0/r;->f:LP/f0;

    .line 115
    .line 116
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 117
    .line 118
    invoke-virtual {v6, v8}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :goto_3
    sget-object v6, Lz0/O;->a:Lz0/F;

    .line 122
    .line 123
    iput-object v6, v7, Lz0/r;->a:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    .line 125
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :goto_4
    invoke-static {v3, v5, v4}, La0/r;->f(La0/h;La0/h;LB5/c;)V

    .line 129
    .line 130
    .line 131
    throw p1

    .line 132
    :cond_5
    invoke-static {v3, v5, v4}, La0/r;->f(La0/h;La0/h;LB5/c;)V

    .line 133
    .line 134
    .line 135
    iget-object p1, p0, Lz0/y;->w:Lr/G;

    .line 136
    .line 137
    invoke-virtual {p1}, Lr/G;->a()V

    .line 138
    .line 139
    .line 140
    :cond_6
    invoke-virtual {p0}, Lz0/y;->b()V

    .line 141
    .line 142
    .line 143
    return-void
.end method

.method public final d(Ljava/lang/Object;LB5/e;)Lz0/P;
    .locals 7

    .line 1
    iget-object v0, p0, Lz0/y;->q:LB0/L;

    .line 2
    .line 3
    invoke-virtual {v0}, LB0/L;->F()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    new-instance p1, Lz0/w;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    invoke-virtual {p0}, Lz0/y;->b()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lz0/y;->w:Lr/G;

    .line 19
    .line 20
    invoke-virtual {v1, p1}, Lr/G;->c(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_3

    .line 25
    .line 26
    iget-object v1, p0, Lz0/y;->B:Lr/G;

    .line 27
    .line 28
    invoke-virtual {v1, p1}, Lr/G;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lz0/y;->z:Lr/G;

    .line 32
    .line 33
    invoke-virtual {v1, p1}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    if-nez v2, :cond_2

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Lz0/y;->j(Ljava/lang/Object;)LB0/L;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const/4 v3, 0x0

    .line 44
    const/4 v4, 0x1

    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    invoke-virtual {v0}, LB0/L;->o()Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    check-cast v5, LR/b;

    .line 52
    .line 53
    iget-object v5, v5, LR/b;->q:LR/e;

    .line 54
    .line 55
    invoke-virtual {v5, v2}, LR/e;->k(Ljava/lang/Object;)I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    invoke-virtual {v0}, LB0/L;->o()Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    check-cast v6, LR/b;

    .line 64
    .line 65
    iget-object v6, v6, LR/b;->q:LR/e;

    .line 66
    .line 67
    iget v6, v6, LR/e;->s:I

    .line 68
    .line 69
    iput-boolean v4, v0, LB0/L;->G:Z

    .line 70
    .line 71
    invoke-virtual {v0, v5, v6, v4}, LB0/L;->J(III)V

    .line 72
    .line 73
    .line 74
    iput-boolean v3, v0, LB0/L;->G:Z

    .line 75
    .line 76
    iget v0, p0, Lz0/y;->E:I

    .line 77
    .line 78
    add-int/2addr v0, v4

    .line 79
    iput v0, p0, Lz0/y;->E:I

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    invoke-virtual {v0}, LB0/L;->o()Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, LR/b;

    .line 87
    .line 88
    iget-object v2, v2, LR/b;->q:LR/e;

    .line 89
    .line 90
    iget v2, v2, LR/e;->s:I

    .line 91
    .line 92
    new-instance v5, LB0/L;

    .line 93
    .line 94
    const/4 v6, 0x2

    .line 95
    invoke-direct {v5, v6}, LB0/L;-><init>(I)V

    .line 96
    .line 97
    .line 98
    iput-boolean v4, v0, LB0/L;->G:Z

    .line 99
    .line 100
    invoke-virtual {v0, v2, v5}, LB0/L;->z(ILB0/L;)V

    .line 101
    .line 102
    .line 103
    iput-boolean v3, v0, LB0/L;->G:Z

    .line 104
    .line 105
    iget v0, p0, Lz0/y;->E:I

    .line 106
    .line 107
    add-int/2addr v0, v4

    .line 108
    iput v0, p0, Lz0/y;->E:I

    .line 109
    .line 110
    move-object v2, v5

    .line 111
    :goto_0
    invoke-virtual {v1, p1, v2}, Lr/G;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_2
    check-cast v2, LB0/L;

    .line 115
    .line 116
    invoke-virtual {p0, v2, p1, p2}, Lz0/y;->h(LB0/L;Ljava/lang/Object;LB5/e;)V

    .line 117
    .line 118
    .line 119
    :cond_3
    new-instance p2, Lz0/x;

    .line 120
    .line 121
    invoke-direct {p2, p0, p1}, Lz0/x;-><init>(Lz0/y;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    return-object p2
.end method

.method public final e()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lz0/y;->c(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final f()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, v0, Lz0/y;->q:LB0/L;

    .line 5
    .line 6
    iput-boolean v1, v2, LB0/L;->G:Z

    .line 7
    .line 8
    iget-object v1, v0, Lz0/y;->v:Lr/G;

    .line 9
    .line 10
    iget-object v3, v1, Lr/G;->c:[Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v4, v1, Lr/G;->a:[J

    .line 13
    .line 14
    array-length v5, v4

    .line 15
    add-int/lit8 v5, v5, -0x2

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    if-ltz v5, :cond_3

    .line 19
    .line 20
    move v7, v6

    .line 21
    :goto_0
    aget-wide v8, v4, v7

    .line 22
    .line 23
    not-long v10, v8

    .line 24
    const/4 v12, 0x7

    .line 25
    shl-long/2addr v10, v12

    .line 26
    and-long/2addr v10, v8

    .line 27
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    and-long/2addr v10, v12

    .line 33
    cmp-long v10, v10, v12

    .line 34
    .line 35
    if-eqz v10, :cond_2

    .line 36
    .line 37
    sub-int v10, v7, v5

    .line 38
    .line 39
    not-int v10, v10

    .line 40
    ushr-int/lit8 v10, v10, 0x1f

    .line 41
    .line 42
    const/16 v11, 0x8

    .line 43
    .line 44
    rsub-int/lit8 v10, v10, 0x8

    .line 45
    .line 46
    move v12, v6

    .line 47
    :goto_1
    if-ge v12, v10, :cond_1

    .line 48
    .line 49
    const-wide/16 v13, 0xff

    .line 50
    .line 51
    and-long/2addr v13, v8

    .line 52
    const-wide/16 v15, 0x80

    .line 53
    .line 54
    cmp-long v13, v13, v15

    .line 55
    .line 56
    if-gez v13, :cond_0

    .line 57
    .line 58
    shl-int/lit8 v13, v7, 0x3

    .line 59
    .line 60
    add-int/2addr v13, v12

    .line 61
    aget-object v13, v3, v13

    .line 62
    .line 63
    check-cast v13, Lz0/r;

    .line 64
    .line 65
    iget-object v13, v13, Lz0/r;->c:LP/u;

    .line 66
    .line 67
    if-eqz v13, :cond_0

    .line 68
    .line 69
    invoke-virtual {v13}, LP/u;->l()V

    .line 70
    .line 71
    .line 72
    :cond_0
    shr-long/2addr v8, v11

    .line 73
    add-int/lit8 v12, v12, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    if-ne v10, v11, :cond_3

    .line 77
    .line 78
    :cond_2
    if-eq v7, v5, :cond_3

    .line 79
    .line 80
    add-int/lit8 v7, v7, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    invoke-virtual {v2}, LB0/L;->M()V

    .line 84
    .line 85
    .line 86
    iput-boolean v6, v2, LB0/L;->G:Z

    .line 87
    .line 88
    invoke-virtual {v1}, Lr/G;->a()V

    .line 89
    .line 90
    .line 91
    iget-object v1, v0, Lz0/y;->w:Lr/G;

    .line 92
    .line 93
    invoke-virtual {v1}, Lr/G;->a()V

    .line 94
    .line 95
    .line 96
    iput v6, v0, Lz0/y;->E:I

    .line 97
    .line 98
    iput v6, v0, Lz0/y;->D:I

    .line 99
    .line 100
    iget-object v1, v0, Lz0/y;->z:Lr/G;

    .line 101
    .line 102
    invoke-virtual {v1}, Lr/G;->a()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Lz0/y;->b()V

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method public final g()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lz0/y;->c(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final h(LB0/L;Ljava/lang/Object;LB5/e;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lz0/y;->v:Lr/G;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    new-instance v1, Lz0/r;

    .line 11
    .line 12
    sget-object v3, Lz0/h;->a:LX/e;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p2, v1, Lz0/r;->a:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object v3, v1, Lz0/r;->b:LB5/e;

    .line 20
    .line 21
    iput-object v2, v1, Lz0/r;->c:LP/u;

    .line 22
    .line 23
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-static {p2}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    iput-object p2, v1, Lz0/r;->f:LP/f0;

    .line 30
    .line 31
    invoke-virtual {v0, p1, v1}, Lr/G;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    check-cast v1, Lz0/r;

    .line 35
    .line 36
    iget-object p2, v1, Lz0/r;->c:LP/u;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    const/4 v3, 0x1

    .line 40
    if-eqz p2, :cond_2

    .line 41
    .line 42
    iget-object v4, p2, LP/u;->t:Ljava/lang/Object;

    .line 43
    .line 44
    monitor-enter v4

    .line 45
    :try_start_0
    iget-object p2, p2, LP/u;->D:Lr/G;

    .line 46
    .line 47
    iget p2, p2, Lr/G;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    if-lez p2, :cond_1

    .line 50
    .line 51
    move p2, v3

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    move p2, v0

    .line 54
    :goto_0
    monitor-exit v4

    .line 55
    goto :goto_1

    .line 56
    :catchall_0
    move-exception p1

    .line 57
    monitor-exit v4

    .line 58
    throw p1

    .line 59
    :cond_2
    move p2, v3

    .line 60
    :goto_1
    iget-object v4, v1, Lz0/r;->b:LB5/e;

    .line 61
    .line 62
    if-ne v4, p3, :cond_4

    .line 63
    .line 64
    if-nez p2, :cond_4

    .line 65
    .line 66
    iget-boolean p2, v1, Lz0/r;->d:Z

    .line 67
    .line 68
    if-eqz p2, :cond_3

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    return-void

    .line 72
    :cond_4
    :goto_2
    iput-object p3, v1, Lz0/r;->b:LB5/e;

    .line 73
    .line 74
    invoke-static {}, La0/r;->c()La0/h;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    if-eqz p2, :cond_5

    .line 79
    .line 80
    invoke-virtual {p2}, La0/h;->e()LB5/c;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    :cond_5
    invoke-static {p2}, La0/r;->d(La0/h;)La0/h;

    .line 85
    .line 86
    .line 87
    move-result-object p3

    .line 88
    :try_start_1
    iget-object v4, p0, Lz0/y;->q:LB0/L;

    .line 89
    .line 90
    iput-boolean v3, v4, LB0/L;->G:Z

    .line 91
    .line 92
    iget-object v5, v1, Lz0/r;->b:LB5/e;

    .line 93
    .line 94
    iget-object v6, v1, Lz0/r;->c:LP/u;

    .line 95
    .line 96
    iget-object v7, p0, Lz0/y;->r:LP/r;

    .line 97
    .line 98
    if-eqz v7, :cond_6

    .line 99
    .line 100
    iget-boolean v8, v1, Lz0/r;->e:Z

    .line 101
    .line 102
    new-instance v9, LB0/j0;

    .line 103
    .line 104
    const/16 v10, 0xe

    .line 105
    .line 106
    invoke-direct {v9, v10, v1, v5}, LB0/j0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    new-instance v5, LX/e;

    .line 110
    .line 111
    const v10, -0x68551fe9

    .line 112
    .line 113
    .line 114
    invoke-direct {v5, v10, v3, v9}, LX/e;-><init>(IZLjava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    invoke-static {v6, p1, v8, v7, v5}, Lz0/y;->i(LP/u;LB0/L;ZLP/r;LX/e;)LP/u;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    iput-object p1, v1, Lz0/r;->c:LP/u;

    .line 122
    .line 123
    iput-boolean v0, v1, Lz0/r;->e:Z

    .line 124
    .line 125
    iput-boolean v0, v4, LB0/L;->G:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 126
    .line 127
    invoke-static {p2, p3, v2}, La0/r;->f(La0/h;La0/h;LB5/c;)V

    .line 128
    .line 129
    .line 130
    iput-boolean v0, v1, Lz0/r;->d:Z

    .line 131
    .line 132
    return-void

    .line 133
    :catchall_1
    move-exception p1

    .line 134
    goto :goto_3

    .line 135
    :cond_6
    :try_start_2
    const-string p1, "parent composition reference not set"

    .line 136
    .line 137
    invoke-static {p1}, Ly0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    .line 138
    .line 139
    .line 140
    new-instance p1, LC2/e;

    .line 141
    .line 142
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 143
    .line 144
    .line 145
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 146
    :goto_3
    invoke-static {p2, p3, v2}, La0/r;->f(La0/h;La0/h;LB5/c;)V

    .line 147
    .line 148
    .line 149
    throw p1
.end method

.method public final j(Ljava/lang/Object;)LB0/L;
    .locals 11

    .line 1
    iget v0, p0, Lz0/y;->D:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_5

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lz0/y;->q:LB0/L;

    .line 8
    .line 9
    invoke-virtual {v0}, LB0/L;->o()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, LR/b;

    .line 14
    .line 15
    iget-object v2, v1, LR/b;->q:LR/e;

    .line 16
    .line 17
    iget v2, v2, LR/e;->s:I

    .line 18
    .line 19
    iget v3, p0, Lz0/y;->E:I

    .line 20
    .line 21
    sub-int/2addr v2, v3

    .line 22
    iget v3, p0, Lz0/y;->D:I

    .line 23
    .line 24
    sub-int v3, v2, v3

    .line 25
    .line 26
    const/4 v4, 0x1

    .line 27
    sub-int/2addr v2, v4

    .line 28
    move v5, v2

    .line 29
    :goto_0
    iget-object v6, p0, Lz0/y;->v:Lr/G;

    .line 30
    .line 31
    const/4 v7, -0x1

    .line 32
    if-lt v5, v3, :cond_2

    .line 33
    .line 34
    invoke-virtual {v1, v5}, LR/b;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    check-cast v8, LB0/L;

    .line 39
    .line 40
    invoke-virtual {v6, v8}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    invoke-static {v8}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    check-cast v8, Lz0/r;

    .line 48
    .line 49
    iget-object v8, v8, Lz0/r;->a:Ljava/lang/Object;

    .line 50
    .line 51
    invoke-static {v8, p1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    if-eqz v8, :cond_1

    .line 56
    .line 57
    move v8, v5

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    add-int/lit8 v5, v5, -0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    move v8, v7

    .line 63
    :goto_1
    if-ne v8, v7, :cond_6

    .line 64
    .line 65
    :goto_2
    if-lt v2, v3, :cond_5

    .line 66
    .line 67
    invoke-virtual {v1, v2}, LR/b;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    check-cast v5, LB0/L;

    .line 72
    .line 73
    invoke-virtual {v6, v5}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-static {v5}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    check-cast v5, Lz0/r;

    .line 81
    .line 82
    iget-object v9, v5, Lz0/r;->a:Ljava/lang/Object;

    .line 83
    .line 84
    sget-object v10, Lz0/O;->a:Lz0/F;

    .line 85
    .line 86
    if-eq v9, v10, :cond_4

    .line 87
    .line 88
    iget-object v10, p0, Lz0/y;->s:Lz0/U;

    .line 89
    .line 90
    invoke-interface {v10, p1, v9}, Lz0/U;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    if-eqz v9, :cond_3

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_3
    add-int/lit8 v2, v2, -0x1

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_4
    :goto_3
    iput-object p1, v5, Lz0/r;->a:Ljava/lang/Object;

    .line 101
    .line 102
    move v5, v2

    .line 103
    move v8, v5

    .line 104
    goto :goto_4

    .line 105
    :cond_5
    move v5, v2

    .line 106
    :cond_6
    :goto_4
    if-ne v8, v7, :cond_7

    .line 107
    .line 108
    :goto_5
    const/4 p1, 0x0

    .line 109
    return-object p1

    .line 110
    :cond_7
    if-eq v5, v3, :cond_8

    .line 111
    .line 112
    iput-boolean v4, v0, LB0/L;->G:Z

    .line 113
    .line 114
    invoke-virtual {v0, v5, v3, v4}, LB0/L;->J(III)V

    .line 115
    .line 116
    .line 117
    const/4 p1, 0x0

    .line 118
    iput-boolean p1, v0, LB0/L;->G:Z

    .line 119
    .line 120
    :cond_8
    iget p1, p0, Lz0/y;->D:I

    .line 121
    .line 122
    add-int/2addr p1, v7

    .line 123
    iput p1, p0, Lz0/y;->D:I

    .line 124
    .line 125
    invoke-virtual {v1, v3}, LR/b;->get(I)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    check-cast p1, LB0/L;

    .line 130
    .line 131
    invoke-virtual {v6, p1}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    check-cast v0, Lz0/r;

    .line 139
    .line 140
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 141
    .line 142
    invoke-static {v1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    iput-object v1, v0, Lz0/r;->f:LP/f0;

    .line 147
    .line 148
    iput-boolean v4, v0, Lz0/r;->e:Z

    .line 149
    .line 150
    iput-boolean v4, v0, Lz0/r;->d:Z

    .line 151
    .line 152
    return-object p1
.end method
