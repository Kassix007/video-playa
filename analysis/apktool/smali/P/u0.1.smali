.class public final LP/u0;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/f;


# instance fields
.field public final synthetic A:LP/v0;

.field public q:Ljava/util/List;

.field public r:Ljava/util/List;

.field public s:Ljava/util/List;

.field public t:Lr/H;

.field public u:Lr/H;

.field public v:Lr/H;

.field public w:Ljava/util/Set;

.field public x:Lr/H;

.field public y:I

.field public synthetic z:LP/T;


# direct methods
.method public constructor <init>(LP/v0;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP/u0;->A:LP/v0;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p2}, Ls5/i;-><init>(ILq5/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static final a(LP/v0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lr/H;Lr/H;Lr/H;Lr/H;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    move-object/from16 v3, p5

    .line 8
    .line 9
    move-object/from16 v4, p7

    .line 10
    .line 11
    iget-object v5, v0, LP/v0;->b:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v5

    .line 14
    :try_start_0
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->clear()V

    .line 15
    .line 16
    .line 17
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->clear()V

    .line 18
    .line 19
    .line 20
    move-object v6, v1

    .line 21
    check-cast v6, Ljava/util/Collection;

    .line 22
    .line 23
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    const/4 v8, 0x0

    .line 28
    :goto_0
    if-ge v8, v6, :cond_0

    .line 29
    .line 30
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v9

    .line 34
    check-cast v9, LP/u;

    .line 35
    .line 36
    invoke-virtual {v9}, LP/u;->a()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v9}, LP/v0;->B(LP/u;)V

    .line 40
    .line 41
    .line 42
    add-int/lit8 v8, v8, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    goto/16 :goto_7

    .line 47
    .line 48
    :cond_0
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 49
    .line 50
    .line 51
    iget-object v1, v2, Lr/H;->b:[Ljava/lang/Object;

    .line 52
    .line 53
    iget-object v6, v2, Lr/H;->a:[J

    .line 54
    .line 55
    array-length v8, v6

    .line 56
    add-int/lit8 v8, v8, -0x2

    .line 57
    .line 58
    const/16 v7, 0x8

    .line 59
    .line 60
    const-wide/16 p2, 0x80

    .line 61
    .line 62
    if-ltz v8, :cond_4

    .line 63
    .line 64
    const/4 v9, 0x0

    .line 65
    const-wide/16 v16, 0xff

    .line 66
    .line 67
    :goto_1
    aget-wide v11, v6, v9

    .line 68
    .line 69
    const/4 v10, 0x7

    .line 70
    const-wide v18, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    not-long v13, v11

    .line 76
    shl-long/2addr v13, v10

    .line 77
    and-long/2addr v13, v11

    .line 78
    and-long v13, v13, v18

    .line 79
    .line 80
    cmp-long v13, v13, v18

    .line 81
    .line 82
    if-eqz v13, :cond_3

    .line 83
    .line 84
    sub-int v13, v9, v8

    .line 85
    .line 86
    not-int v13, v13

    .line 87
    ushr-int/lit8 v13, v13, 0x1f

    .line 88
    .line 89
    rsub-int/lit8 v13, v13, 0x8

    .line 90
    .line 91
    const/4 v14, 0x0

    .line 92
    :goto_2
    if-ge v14, v13, :cond_2

    .line 93
    .line 94
    and-long v20, v11, v16

    .line 95
    .line 96
    cmp-long v15, v20, p2

    .line 97
    .line 98
    if-gez v15, :cond_1

    .line 99
    .line 100
    shl-int/lit8 v15, v9, 0x3

    .line 101
    .line 102
    add-int/2addr v15, v14

    .line 103
    aget-object v15, v1, v15

    .line 104
    .line 105
    check-cast v15, LP/u;

    .line 106
    .line 107
    invoke-virtual {v15}, LP/u;->a()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v15}, LP/v0;->B(LP/u;)V

    .line 111
    .line 112
    .line 113
    :cond_1
    shr-long/2addr v11, v7

    .line 114
    add-int/lit8 v14, v14, 0x1

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_2
    if-ne v13, v7, :cond_5

    .line 118
    .line 119
    :cond_3
    if-eq v9, v8, :cond_5

    .line 120
    .line 121
    add-int/lit8 v9, v9, 0x1

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_4
    const/4 v10, 0x7

    .line 125
    const-wide/16 v16, 0xff

    .line 126
    .line 127
    const-wide v18, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    :cond_5
    invoke-virtual {v2}, Lr/H;->b()V

    .line 133
    .line 134
    .line 135
    iget-object v1, v3, Lr/H;->b:[Ljava/lang/Object;

    .line 136
    .line 137
    iget-object v2, v3, Lr/H;->a:[J

    .line 138
    .line 139
    array-length v6, v2

    .line 140
    add-int/lit8 v6, v6, -0x2

    .line 141
    .line 142
    if-ltz v6, :cond_9

    .line 143
    .line 144
    const/4 v8, 0x0

    .line 145
    :goto_3
    aget-wide v11, v2, v8

    .line 146
    .line 147
    not-long v13, v11

    .line 148
    shl-long/2addr v13, v10

    .line 149
    and-long/2addr v13, v11

    .line 150
    and-long v13, v13, v18

    .line 151
    .line 152
    cmp-long v9, v13, v18

    .line 153
    .line 154
    if-eqz v9, :cond_8

    .line 155
    .line 156
    sub-int v9, v8, v6

    .line 157
    .line 158
    not-int v9, v9

    .line 159
    ushr-int/lit8 v9, v9, 0x1f

    .line 160
    .line 161
    rsub-int/lit8 v9, v9, 0x8

    .line 162
    .line 163
    const/4 v13, 0x0

    .line 164
    :goto_4
    if-ge v13, v9, :cond_7

    .line 165
    .line 166
    and-long v14, v11, v16

    .line 167
    .line 168
    cmp-long v14, v14, p2

    .line 169
    .line 170
    if-gez v14, :cond_6

    .line 171
    .line 172
    shl-int/lit8 v14, v8, 0x3

    .line 173
    .line 174
    add-int/2addr v14, v13

    .line 175
    aget-object v14, v1, v14

    .line 176
    .line 177
    check-cast v14, LP/u;

    .line 178
    .line 179
    invoke-virtual {v14}, LP/u;->g()V

    .line 180
    .line 181
    .line 182
    :cond_6
    shr-long/2addr v11, v7

    .line 183
    add-int/lit8 v13, v13, 0x1

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_7
    if-ne v9, v7, :cond_9

    .line 187
    .line 188
    :cond_8
    if-eq v8, v6, :cond_9

    .line 189
    .line 190
    add-int/lit8 v8, v8, 0x1

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_9
    invoke-virtual {v3}, Lr/H;->b()V

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {p6 .. p6}, Lr/H;->b()V

    .line 197
    .line 198
    .line 199
    iget-object v1, v4, Lr/H;->b:[Ljava/lang/Object;

    .line 200
    .line 201
    iget-object v2, v4, Lr/H;->a:[J

    .line 202
    .line 203
    array-length v3, v2

    .line 204
    add-int/lit8 v3, v3, -0x2

    .line 205
    .line 206
    if-ltz v3, :cond_d

    .line 207
    .line 208
    const/4 v6, 0x0

    .line 209
    :goto_5
    aget-wide v8, v2, v6

    .line 210
    .line 211
    not-long v11, v8

    .line 212
    shl-long/2addr v11, v10

    .line 213
    and-long/2addr v11, v8

    .line 214
    and-long v11, v11, v18

    .line 215
    .line 216
    cmp-long v11, v11, v18

    .line 217
    .line 218
    if-eqz v11, :cond_c

    .line 219
    .line 220
    sub-int v11, v6, v3

    .line 221
    .line 222
    not-int v11, v11

    .line 223
    ushr-int/lit8 v11, v11, 0x1f

    .line 224
    .line 225
    rsub-int/lit8 v11, v11, 0x8

    .line 226
    .line 227
    const/4 v12, 0x0

    .line 228
    :goto_6
    if-ge v12, v11, :cond_b

    .line 229
    .line 230
    and-long v13, v8, v16

    .line 231
    .line 232
    cmp-long v13, v13, p2

    .line 233
    .line 234
    if-gez v13, :cond_a

    .line 235
    .line 236
    shl-int/lit8 v13, v6, 0x3

    .line 237
    .line 238
    add-int/2addr v13, v12

    .line 239
    aget-object v13, v1, v13

    .line 240
    .line 241
    check-cast v13, LP/u;

    .line 242
    .line 243
    invoke-virtual {v13}, LP/u;->a()V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0, v13}, LP/v0;->B(LP/u;)V

    .line 247
    .line 248
    .line 249
    :cond_a
    shr-long/2addr v8, v7

    .line 250
    add-int/lit8 v12, v12, 0x1

    .line 251
    .line 252
    goto :goto_6

    .line 253
    :cond_b
    if-ne v11, v7, :cond_d

    .line 254
    .line 255
    :cond_c
    if-eq v6, v3, :cond_d

    .line 256
    .line 257
    add-int/lit8 v6, v6, 0x1

    .line 258
    .line 259
    goto :goto_5

    .line 260
    :cond_d
    invoke-virtual {v4}, Lr/H;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 261
    .line 262
    .line 263
    monitor-exit v5

    .line 264
    return-void

    .line 265
    :goto_7
    monitor-exit v5

    .line 266
    throw v0
.end method

.method public static final b(Ljava/util/List;LP/v0;)V
    .locals 6

    .line 1
    invoke-interface {p0}, Ljava/util/List;->clear()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, LP/v0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p1, LP/v0;->j:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    :goto_0
    if-ge v3, v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    check-cast v4, LP/V;

    .line 21
    .line 22
    move-object v5, p0

    .line 23
    check-cast v5, Ljava/util/Collection;

    .line 24
    .line 25
    invoke-interface {v5, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    iget-object p0, p1, LP/v0;->j:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    monitor-exit v0

    .line 39
    return-void

    .line 40
    :goto_1
    monitor-exit v0

    .line 41
    throw p0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, LM5/w;

    .line 2
    .line 3
    check-cast p2, LP/T;

    .line 4
    .line 5
    check-cast p3, Lq5/c;

    .line 6
    .line 7
    new-instance p1, LP/u0;

    .line 8
    .line 9
    iget-object v0, p0, LP/u0;->A:LP/v0;

    .line 10
    .line 11
    invoke-direct {p1, v0, p3}, LP/u0;-><init>(LP/v0;Lq5/c;)V

    .line 12
    .line 13
    .line 14
    iput-object p2, p1, LP/u0;->z:LP/T;

    .line 15
    .line 16
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, LP/u0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    sget-object p1, Lr5/a;->q:Lr5/a;

    .line 22
    .line 23
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 4
    .line 5
    iget v2, v1, LP/u0;->y:I

    .line 6
    .line 7
    const/4 v4, 0x2

    .line 8
    const/4 v5, 0x1

    .line 9
    if-eqz v2, :cond_2

    .line 10
    .line 11
    if-eq v2, v5, :cond_1

    .line 12
    .line 13
    if-ne v2, v4, :cond_0

    .line 14
    .line 15
    iget-object v2, v1, LP/u0;->x:Lr/H;

    .line 16
    .line 17
    iget-object v6, v1, LP/u0;->w:Ljava/util/Set;

    .line 18
    .line 19
    check-cast v6, Ljava/util/Set;

    .line 20
    .line 21
    iget-object v7, v1, LP/u0;->v:Lr/H;

    .line 22
    .line 23
    iget-object v8, v1, LP/u0;->u:Lr/H;

    .line 24
    .line 25
    iget-object v9, v1, LP/u0;->t:Lr/H;

    .line 26
    .line 27
    iget-object v10, v1, LP/u0;->s:Ljava/util/List;

    .line 28
    .line 29
    check-cast v10, Ljava/util/List;

    .line 30
    .line 31
    iget-object v11, v1, LP/u0;->r:Ljava/util/List;

    .line 32
    .line 33
    check-cast v11, Ljava/util/List;

    .line 34
    .line 35
    iget-object v12, v1, LP/u0;->q:Ljava/util/List;

    .line 36
    .line 37
    check-cast v12, Ljava/util/List;

    .line 38
    .line 39
    iget-object v13, v1, LP/u0;->z:LP/T;

    .line 40
    .line 41
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    move-object/from16 v20, v13

    .line 45
    .line 46
    move-object v13, v2

    .line 47
    move-object/from16 v2, v20

    .line 48
    .line 49
    goto/16 :goto_6

    .line 50
    .line 51
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v0

    .line 59
    :cond_1
    iget-object v2, v1, LP/u0;->x:Lr/H;

    .line 60
    .line 61
    iget-object v6, v1, LP/u0;->w:Ljava/util/Set;

    .line 62
    .line 63
    check-cast v6, Ljava/util/Set;

    .line 64
    .line 65
    iget-object v7, v1, LP/u0;->v:Lr/H;

    .line 66
    .line 67
    iget-object v8, v1, LP/u0;->u:Lr/H;

    .line 68
    .line 69
    iget-object v9, v1, LP/u0;->t:Lr/H;

    .line 70
    .line 71
    iget-object v10, v1, LP/u0;->s:Ljava/util/List;

    .line 72
    .line 73
    check-cast v10, Ljava/util/List;

    .line 74
    .line 75
    iget-object v11, v1, LP/u0;->r:Ljava/util/List;

    .line 76
    .line 77
    check-cast v11, Ljava/util/List;

    .line 78
    .line 79
    iget-object v12, v1, LP/u0;->q:Ljava/util/List;

    .line 80
    .line 81
    check-cast v12, Ljava/util/List;

    .line 82
    .line 83
    iget-object v13, v1, LP/u0;->z:LP/T;

    .line 84
    .line 85
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    move-object v14, v9

    .line 89
    move-object v9, v2

    .line 90
    move-object v2, v13

    .line 91
    move-object v13, v10

    .line 92
    move-object v10, v12

    .line 93
    move-object v12, v14

    .line 94
    :goto_0
    move-object v15, v6

    .line 95
    move-object v14, v8

    .line 96
    move-object v8, v7

    .line 97
    goto/16 :goto_4

    .line 98
    .line 99
    :cond_2
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iget-object v2, v1, LP/u0;->z:LP/T;

    .line 103
    .line 104
    new-instance v6, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .line 108
    .line 109
    new-instance v7, Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 112
    .line 113
    .line 114
    new-instance v8, Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 117
    .line 118
    .line 119
    sget v9, Lr/P;->a:I

    .line 120
    .line 121
    new-instance v9, Lr/H;

    .line 122
    .line 123
    invoke-direct {v9}, Lr/H;-><init>()V

    .line 124
    .line 125
    .line 126
    new-instance v10, Lr/H;

    .line 127
    .line 128
    invoke-direct {v10}, Lr/H;-><init>()V

    .line 129
    .line 130
    .line 131
    new-instance v11, Lr/H;

    .line 132
    .line 133
    invoke-direct {v11}, Lr/H;-><init>()V

    .line 134
    .line 135
    .line 136
    new-instance v12, LR/h;

    .line 137
    .line 138
    invoke-direct {v12, v11}, LR/h;-><init>(Lr/H;)V

    .line 139
    .line 140
    .line 141
    new-instance v13, Lr/H;

    .line 142
    .line 143
    invoke-direct {v13}, Lr/H;-><init>()V

    .line 144
    .line 145
    .line 146
    move-object/from16 v20, v12

    .line 147
    .line 148
    move-object v12, v6

    .line 149
    move-object/from16 v6, v20

    .line 150
    .line 151
    move-object/from16 v20, v11

    .line 152
    .line 153
    move-object v11, v7

    .line 154
    move-object/from16 v7, v20

    .line 155
    .line 156
    move-object/from16 v20, v10

    .line 157
    .line 158
    move-object v10, v8

    .line 159
    move-object/from16 v8, v20

    .line 160
    .line 161
    :goto_1
    iget-object v14, v1, LP/u0;->A:LP/v0;

    .line 162
    .line 163
    iget-object v14, v14, LP/v0;->b:Ljava/lang/Object;

    .line 164
    .line 165
    monitor-enter v14

    .line 166
    monitor-exit v14

    .line 167
    iget-object v14, v1, LP/u0;->A:LP/v0;

    .line 168
    .line 169
    iput-object v2, v1, LP/u0;->z:LP/T;

    .line 170
    .line 171
    move-object v15, v12

    .line 172
    check-cast v15, Ljava/util/List;

    .line 173
    .line 174
    iput-object v15, v1, LP/u0;->q:Ljava/util/List;

    .line 175
    .line 176
    move-object v15, v11

    .line 177
    check-cast v15, Ljava/util/List;

    .line 178
    .line 179
    iput-object v15, v1, LP/u0;->r:Ljava/util/List;

    .line 180
    .line 181
    move-object v15, v10

    .line 182
    check-cast v15, Ljava/util/List;

    .line 183
    .line 184
    iput-object v15, v1, LP/u0;->s:Ljava/util/List;

    .line 185
    .line 186
    iput-object v9, v1, LP/u0;->t:Lr/H;

    .line 187
    .line 188
    iput-object v8, v1, LP/u0;->u:Lr/H;

    .line 189
    .line 190
    iput-object v7, v1, LP/u0;->v:Lr/H;

    .line 191
    .line 192
    move-object v15, v6

    .line 193
    check-cast v15, Ljava/util/Set;

    .line 194
    .line 195
    iput-object v15, v1, LP/u0;->w:Ljava/util/Set;

    .line 196
    .line 197
    iput-object v13, v1, LP/u0;->x:Lr/H;

    .line 198
    .line 199
    iput v5, v1, LP/u0;->y:I

    .line 200
    .line 201
    invoke-virtual {v14}, LP/v0;->w()Z

    .line 202
    .line 203
    .line 204
    move-result v15

    .line 205
    if-nez v15, :cond_6

    .line 206
    .line 207
    new-instance v15, LM5/h;

    .line 208
    .line 209
    invoke-static {v1}, Ln5/A;->v(Lq5/c;)Lq5/c;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    invoke-direct {v15, v5, v3}, LM5/h;-><init>(ILq5/c;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v15}, LM5/h;->s()V

    .line 217
    .line 218
    .line 219
    iget-object v3, v14, LP/v0;->b:Ljava/lang/Object;

    .line 220
    .line 221
    monitor-enter v3

    .line 222
    :try_start_0
    invoke-virtual {v14}, LP/v0;->w()Z

    .line 223
    .line 224
    .line 225
    move-result v16

    .line 226
    if-eqz v16, :cond_3

    .line 227
    .line 228
    move-object v14, v15

    .line 229
    goto :goto_2

    .line 230
    :cond_3
    iput-object v15, v14, LP/v0;->q:LM5/h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 231
    .line 232
    const/4 v14, 0x0

    .line 233
    :goto_2
    monitor-exit v3

    .line 234
    if-eqz v14, :cond_4

    .line 235
    .line 236
    sget-object v3, Lm5/y;->a:Lm5/y;

    .line 237
    .line 238
    invoke-virtual {v14, v3}, LM5/h;->resumeWith(Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    :cond_4
    invoke-virtual {v15}, LM5/h;->r()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    sget-object v14, Lr5/a;->q:Lr5/a;

    .line 246
    .line 247
    if-ne v3, v14, :cond_5

    .line 248
    .line 249
    goto :goto_3

    .line 250
    :cond_5
    sget-object v3, Lm5/y;->a:Lm5/y;

    .line 251
    .line 252
    goto :goto_3

    .line 253
    :catchall_0
    move-exception v0

    .line 254
    monitor-exit v3

    .line 255
    throw v0

    .line 256
    :cond_6
    sget-object v3, Lm5/y;->a:Lm5/y;

    .line 257
    .line 258
    :goto_3
    if-ne v3, v0, :cond_7

    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_7
    move-object v14, v12

    .line 262
    move-object v12, v9

    .line 263
    move-object v9, v13

    .line 264
    move-object v13, v10

    .line 265
    move-object v10, v14

    .line 266
    goto/16 :goto_0

    .line 267
    .line 268
    :goto_4
    iget-object v3, v1, LP/u0;->A:LP/v0;

    .line 269
    .line 270
    invoke-static {v3}, LP/v0;->r(LP/v0;)Z

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    if-eqz v3, :cond_d

    .line 275
    .line 276
    new-instance v6, LP/t0;

    .line 277
    .line 278
    iget-object v7, v1, LP/u0;->A:LP/v0;

    .line 279
    .line 280
    invoke-direct/range {v6 .. v15}, LP/t0;-><init>(LP/v0;Lr/H;Lr/H;Ljava/util/List;Ljava/util/List;Lr/H;Ljava/util/List;Lr/H;Ljava/util/Set;)V

    .line 281
    .line 282
    .line 283
    iput-object v2, v1, LP/u0;->z:LP/T;

    .line 284
    .line 285
    move-object v3, v10

    .line 286
    check-cast v3, Ljava/util/List;

    .line 287
    .line 288
    iput-object v3, v1, LP/u0;->q:Ljava/util/List;

    .line 289
    .line 290
    move-object v3, v11

    .line 291
    check-cast v3, Ljava/util/List;

    .line 292
    .line 293
    iput-object v3, v1, LP/u0;->r:Ljava/util/List;

    .line 294
    .line 295
    move-object v3, v13

    .line 296
    check-cast v3, Ljava/util/List;

    .line 297
    .line 298
    iput-object v3, v1, LP/u0;->s:Ljava/util/List;

    .line 299
    .line 300
    iput-object v12, v1, LP/u0;->t:Lr/H;

    .line 301
    .line 302
    iput-object v14, v1, LP/u0;->u:Lr/H;

    .line 303
    .line 304
    iput-object v8, v1, LP/u0;->v:Lr/H;

    .line 305
    .line 306
    move-object v3, v15

    .line 307
    check-cast v3, Ljava/util/Set;

    .line 308
    .line 309
    iput-object v3, v1, LP/u0;->w:Ljava/util/Set;

    .line 310
    .line 311
    iput-object v9, v1, LP/u0;->x:Lr/H;

    .line 312
    .line 313
    iput v4, v1, LP/u0;->y:I

    .line 314
    .line 315
    invoke-interface {v2, v6, v1}, LP/T;->e(LB5/c;Ls5/c;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    if-ne v3, v0, :cond_8

    .line 320
    .line 321
    :goto_5
    return-object v0

    .line 322
    :cond_8
    move-object v6, v13

    .line 323
    move-object v13, v9

    .line 324
    move-object v9, v12

    .line 325
    move-object v12, v10

    .line 326
    move-object v10, v6

    .line 327
    move-object v7, v8

    .line 328
    move-object v8, v14

    .line 329
    move-object v6, v15

    .line 330
    :goto_6
    iget-object v3, v1, LP/u0;->A:LP/v0;

    .line 331
    .line 332
    iget-object v14, v3, LP/v0;->b:Ljava/lang/Object;

    .line 333
    .line 334
    monitor-enter v14

    .line 335
    :try_start_1
    iget-object v15, v3, LP/v0;->k:Lr/G;

    .line 336
    .line 337
    iget v4, v15, Lr/G;->e:I

    .line 338
    .line 339
    const/16 v17, 0x0

    .line 340
    .line 341
    if-eqz v4, :cond_9

    .line 342
    .line 343
    move v4, v5

    .line 344
    goto :goto_7

    .line 345
    :cond_9
    move/from16 v4, v17

    .line 346
    .line 347
    :goto_7
    if-eqz v4, :cond_b

    .line 348
    .line 349
    invoke-static {v15}, LR/a;->b(Lr/G;)Lr/C;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    iget-object v15, v3, LP/v0;->k:Lr/G;

    .line 354
    .line 355
    invoke-virtual {v15}, Lr/G;->a()V

    .line 356
    .line 357
    .line 358
    iget-object v15, v3, LP/v0;->l:LB0/o;

    .line 359
    .line 360
    iget-object v5, v15, LB0/o;->q:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast v5, Lr/G;

    .line 363
    .line 364
    invoke-virtual {v5}, Lr/G;->a()V

    .line 365
    .line 366
    .line 367
    iget-object v5, v15, LB0/o;->r:Ljava/lang/Object;

    .line 368
    .line 369
    check-cast v5, Lr/G;

    .line 370
    .line 371
    invoke-virtual {v5}, Lr/G;->a()V

    .line 372
    .line 373
    .line 374
    iget-object v5, v3, LP/v0;->n:Lr/G;

    .line 375
    .line 376
    invoke-virtual {v5}, Lr/G;->a()V

    .line 377
    .line 378
    .line 379
    new-instance v5, Lr/C;

    .line 380
    .line 381
    iget v15, v4, Lr/C;->b:I

    .line 382
    .line 383
    invoke-direct {v5, v15}, Lr/C;-><init>(I)V

    .line 384
    .line 385
    .line 386
    iget-object v15, v4, Lr/C;->a:[Ljava/lang/Object;

    .line 387
    .line 388
    iget v4, v4, Lr/C;->b:I

    .line 389
    .line 390
    move-object/from16 v18, v0

    .line 391
    .line 392
    move/from16 v0, v17

    .line 393
    .line 394
    :goto_8
    if-ge v0, v4, :cond_a

    .line 395
    .line 396
    aget-object v19, v15, v0

    .line 397
    .line 398
    move/from16 p1, v0

    .line 399
    .line 400
    move-object/from16 v0, v19

    .line 401
    .line 402
    check-cast v0, LP/V;

    .line 403
    .line 404
    iget-object v1, v3, LP/v0;->m:Lr/G;

    .line 405
    .line 406
    invoke-virtual {v1, v0}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    move-object/from16 v19, v2

    .line 411
    .line 412
    new-instance v2, Lm5/j;

    .line 413
    .line 414
    invoke-direct {v2, v0, v1}, Lm5/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v5, v2}, Lr/C;->a(Ljava/lang/Object;)V

    .line 418
    .line 419
    .line 420
    add-int/lit8 v0, p1, 0x1

    .line 421
    .line 422
    move-object/from16 v1, p0

    .line 423
    .line 424
    move-object/from16 v2, v19

    .line 425
    .line 426
    goto :goto_8

    .line 427
    :catchall_1
    move-exception v0

    .line 428
    goto :goto_b

    .line 429
    :cond_a
    move-object/from16 v19, v2

    .line 430
    .line 431
    iget-object v0, v3, LP/v0;->m:Lr/G;

    .line 432
    .line 433
    invoke-virtual {v0}, Lr/G;->a()V

    .line 434
    .line 435
    .line 436
    goto :goto_9

    .line 437
    :cond_b
    move-object/from16 v18, v0

    .line 438
    .line 439
    move-object/from16 v19, v2

    .line 440
    .line 441
    sget-object v5, Lr/M;->b:Lr/C;

    .line 442
    .line 443
    const-string v0, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>"

    .line 444
    .line 445
    invoke-static {v5, v0}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 446
    .line 447
    .line 448
    :goto_9
    monitor-exit v14

    .line 449
    iget-object v0, v5, Lr/C;->a:[Ljava/lang/Object;

    .line 450
    .line 451
    iget v1, v5, Lr/C;->b:I

    .line 452
    .line 453
    move/from16 v2, v17

    .line 454
    .line 455
    :goto_a
    if-ge v2, v1, :cond_c

    .line 456
    .line 457
    aget-object v3, v0, v2

    .line 458
    .line 459
    check-cast v3, Lm5/j;

    .line 460
    .line 461
    iget-object v4, v3, Lm5/j;->q:Ljava/lang/Object;

    .line 462
    .line 463
    check-cast v4, LP/V;

    .line 464
    .line 465
    iget-object v3, v3, Lm5/j;->r:Ljava/lang/Object;

    .line 466
    .line 467
    check-cast v3, LP/U;

    .line 468
    .line 469
    add-int/lit8 v2, v2, 0x1

    .line 470
    .line 471
    goto :goto_a

    .line 472
    :cond_c
    move-object/from16 v1, p0

    .line 473
    .line 474
    move-object/from16 v0, v18

    .line 475
    .line 476
    move-object/from16 v2, v19

    .line 477
    .line 478
    const/4 v4, 0x2

    .line 479
    const/4 v5, 0x1

    .line 480
    goto/16 :goto_1

    .line 481
    .line 482
    :goto_b
    monitor-exit v14

    .line 483
    throw v0

    .line 484
    :cond_d
    move-object v1, v13

    .line 485
    move-object v13, v9

    .line 486
    move-object v9, v12

    .line 487
    move-object v12, v10

    .line 488
    move-object v10, v1

    .line 489
    move-object/from16 v1, p0

    .line 490
    .line 491
    move-object v7, v8

    .line 492
    move-object v8, v14

    .line 493
    move-object v6, v15

    .line 494
    goto/16 :goto_1
.end method
