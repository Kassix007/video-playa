.class public abstract LE/C;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LB0/C;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LB0/C;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, LB0/C;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LE/C;->a:LB0/C;

    .line 8
    .line 9
    return-void
.end method

.method public static final a(LB5/a;Lc0/m;LE/K;LB5/e;LP/o;I)V
    .locals 6

    .line 1
    const v0, 0x775696f5

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4, v0}, LP/o;->U(I)LP/o;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4, p0}, LP/o;->i(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x2

    .line 16
    :goto_0
    or-int/2addr v0, p5

    .line 17
    invoke-virtual {p4, p1}, LP/o;->g(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    const/16 v1, 0x20

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    const/16 v1, 0x10

    .line 27
    .line 28
    :goto_1
    or-int/2addr v0, v1

    .line 29
    invoke-virtual {p4, p2}, LP/o;->g(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    const/16 v1, 0x100

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    const/16 v1, 0x80

    .line 39
    .line 40
    :goto_2
    or-int/2addr v0, v1

    .line 41
    invoke-virtual {p4, p3}, LP/o;->i(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    const/16 v1, 0x800

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_3
    const/16 v1, 0x400

    .line 51
    .line 52
    :goto_3
    or-int/2addr v0, v1

    .line 53
    and-int/lit16 v1, v0, 0x493

    .line 54
    .line 55
    const/16 v2, 0x492

    .line 56
    .line 57
    const/4 v3, 0x1

    .line 58
    if-eq v1, v2, :cond_4

    .line 59
    .line 60
    move v1, v3

    .line 61
    goto :goto_4

    .line 62
    :cond_4
    const/4 v1, 0x0

    .line 63
    :goto_4
    and-int/2addr v0, v3

    .line 64
    invoke-virtual {p4, v0, v1}, LP/o;->K(IZ)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_5

    .line 69
    .line 70
    invoke-static {p0, p4}, LP/b;->t(Ljava/lang/Object;LP/o;)LP/W;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    new-instance v1, Landroidx/compose/foundation/lazy/layout/c;

    .line 75
    .line 76
    invoke-direct {v1, p2, p1, p3, v0}, Landroidx/compose/foundation/lazy/layout/c;-><init>(LE/K;Lc0/m;LB5/e;LP/W;)V

    .line 77
    .line 78
    .line 79
    const v0, -0x58c04be3

    .line 80
    .line 81
    .line 82
    invoke-static {v0, v1, p4}, LX/k;->d(ILm5/e;LP/o;)LX/e;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const/4 v1, 0x6

    .line 87
    invoke-static {v0, p4, v1}, LE/C;->c(LX/e;LP/o;I)V

    .line 88
    .line 89
    .line 90
    goto :goto_5

    .line 91
    :cond_5
    invoke-virtual {p4}, LP/o;->N()V

    .line 92
    .line 93
    .line 94
    :goto_5
    invoke-virtual {p4}, LP/o;->r()LP/o0;

    .line 95
    .line 96
    .line 97
    move-result-object p4

    .line 98
    if-eqz p4, :cond_6

    .line 99
    .line 100
    new-instance v0, LE/z;

    .line 101
    .line 102
    move-object v1, p0

    .line 103
    move-object v2, p1

    .line 104
    move-object v3, p2

    .line 105
    move-object v4, p3

    .line 106
    move v5, p5

    .line 107
    invoke-direct/range {v0 .. v5}, LE/z;-><init>(LB5/a;Lc0/m;LE/K;LB5/e;I)V

    .line 108
    .line 109
    .line 110
    iput-object v0, p4, LP/o0;->d:LB5/e;

    .line 111
    .line 112
    :cond_6
    return-void
.end method

.method public static final b(Ljava/lang/Object;ILE/H;LX/e;LP/o;I)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move-object/from16 v0, p4

    .line 10
    .line 11
    move/from16 v5, p5

    .line 12
    .line 13
    const v6, -0x7beccd10

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v6}, LP/o;->U(I)LP/o;

    .line 17
    .line 18
    .line 19
    and-int/lit8 v6, v5, 0x6

    .line 20
    .line 21
    if-nez v6, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0, v1}, LP/o;->i(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    if-eqz v6, :cond_0

    .line 28
    .line 29
    const/4 v6, 0x4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v6, 0x2

    .line 32
    :goto_0
    or-int/2addr v6, v5

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v6, v5

    .line 35
    :goto_1
    and-int/lit8 v7, v5, 0x30

    .line 36
    .line 37
    if-nez v7, :cond_3

    .line 38
    .line 39
    invoke-virtual {v0, v2}, LP/o;->e(I)Z

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    if-eqz v7, :cond_2

    .line 44
    .line 45
    const/16 v7, 0x20

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v7, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr v6, v7

    .line 51
    :cond_3
    and-int/lit16 v7, v5, 0x180

    .line 52
    .line 53
    if-nez v7, :cond_5

    .line 54
    .line 55
    invoke-virtual {v0, v3}, LP/o;->i(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    if-eqz v7, :cond_4

    .line 60
    .line 61
    const/16 v7, 0x100

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_4
    const/16 v7, 0x80

    .line 65
    .line 66
    :goto_3
    or-int/2addr v6, v7

    .line 67
    :cond_5
    and-int/lit16 v7, v5, 0xc00

    .line 68
    .line 69
    if-nez v7, :cond_7

    .line 70
    .line 71
    invoke-virtual {v0, v4}, LP/o;->i(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-eqz v7, :cond_6

    .line 76
    .line 77
    const/16 v7, 0x800

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_6
    const/16 v7, 0x400

    .line 81
    .line 82
    :goto_4
    or-int/2addr v6, v7

    .line 83
    :cond_7
    and-int/lit16 v7, v6, 0x493

    .line 84
    .line 85
    const/16 v8, 0x492

    .line 86
    .line 87
    if-eq v7, v8, :cond_8

    .line 88
    .line 89
    const/4 v7, 0x1

    .line 90
    goto :goto_5

    .line 91
    :cond_8
    const/4 v7, 0x0

    .line 92
    :goto_5
    and-int/lit8 v8, v6, 0x1

    .line 93
    .line 94
    invoke-virtual {v0, v8, v7}, LP/o;->K(IZ)Z

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    if-eqz v7, :cond_11

    .line 99
    .line 100
    invoke-virtual {v0, v1}, LP/o;->g(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    invoke-virtual {v0, v3}, LP/o;->g(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v8

    .line 108
    or-int/2addr v7, v8

    .line 109
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    sget-object v9, LP/k;->a:LP/S;

    .line 114
    .line 115
    if-nez v7, :cond_9

    .line 116
    .line 117
    if-ne v8, v9, :cond_a

    .line 118
    .line 119
    :cond_9
    new-instance v8, LE/G;

    .line 120
    .line 121
    invoke-direct {v8, v1, v3}, LE/G;-><init>(Ljava/lang/Object;LE/H;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v8}, LP/o;->d0(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    :cond_a
    check-cast v8, LE/G;

    .line 128
    .line 129
    iput v2, v8, LE/G;->c:I

    .line 130
    .line 131
    iget-object v7, v8, LE/G;->g:LP/f0;

    .line 132
    .line 133
    sget-object v10, Lz0/H;->a:LP/z;

    .line 134
    .line 135
    invoke-virtual {v0, v10}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v11

    .line 139
    check-cast v11, LE/G;

    .line 140
    .line 141
    invoke-static {}, La0/r;->c()La0/h;

    .line 142
    .line 143
    .line 144
    move-result-object v12

    .line 145
    if-eqz v12, :cond_b

    .line 146
    .line 147
    invoke-virtual {v12}, La0/h;->e()LB5/c;

    .line 148
    .line 149
    .line 150
    move-result-object v14

    .line 151
    goto :goto_6

    .line 152
    :cond_b
    const/4 v14, 0x0

    .line 153
    :goto_6
    invoke-static {v12}, La0/r;->d(La0/h;)La0/h;

    .line 154
    .line 155
    .line 156
    move-result-object v15

    .line 157
    :try_start_0
    invoke-virtual {v7}, LP/f0;->getValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v16

    .line 161
    move-object/from16 v13, v16

    .line 162
    .line 163
    check-cast v13, LE/G;

    .line 164
    .line 165
    if-eq v11, v13, :cond_e

    .line 166
    .line 167
    invoke-virtual {v7, v11}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    iget v7, v8, LE/G;->d:I

    .line 171
    .line 172
    if-lez v7, :cond_e

    .line 173
    .line 174
    iget-object v7, v8, LE/G;->e:LE/G;

    .line 175
    .line 176
    if-eqz v7, :cond_c

    .line 177
    .line 178
    invoke-virtual {v7}, LE/G;->b()V

    .line 179
    .line 180
    .line 181
    goto :goto_7

    .line 182
    :catchall_0
    move-exception v0

    .line 183
    goto :goto_9

    .line 184
    :cond_c
    :goto_7
    if-eqz v11, :cond_d

    .line 185
    .line 186
    invoke-virtual {v11}, LE/G;->a()LE/G;

    .line 187
    .line 188
    .line 189
    goto :goto_8

    .line 190
    :cond_d
    const/4 v11, 0x0

    .line 191
    :goto_8
    iput-object v11, v8, LE/G;->e:LE/G;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 192
    .line 193
    :cond_e
    invoke-static {v12, v15, v14}, La0/r;->f(La0/h;La0/h;LB5/c;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0, v8}, LP/o;->g(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v7

    .line 200
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v11

    .line 204
    if-nez v7, :cond_f

    .line 205
    .line 206
    if-ne v11, v9, :cond_10

    .line 207
    .line 208
    :cond_f
    new-instance v11, LB0/a;

    .line 209
    .line 210
    const/16 v7, 0xa

    .line 211
    .line 212
    invoke-direct {v11, v7, v8}, LB0/a;-><init>(ILjava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, v11}, LP/o;->d0(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    :cond_10
    check-cast v11, LB5/c;

    .line 219
    .line 220
    invoke-static {v8, v11, v0}, LP/b;->c(Ljava/lang/Object;LB5/c;LP/o;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v10, v8}, LP/z;->a(Ljava/lang/Object;)LP/m0;

    .line 224
    .line 225
    .line 226
    move-result-object v7

    .line 227
    shr-int/lit8 v6, v6, 0x6

    .line 228
    .line 229
    and-int/lit8 v6, v6, 0x70

    .line 230
    .line 231
    const/16 v8, 0x8

    .line 232
    .line 233
    or-int/2addr v6, v8

    .line 234
    invoke-static {v7, v4, v0, v6}, LP/b;->a(LP/m0;LX/e;LP/o;I)V

    .line 235
    .line 236
    .line 237
    goto :goto_a

    .line 238
    :goto_9
    invoke-static {v12, v15, v14}, La0/r;->f(La0/h;La0/h;LB5/c;)V

    .line 239
    .line 240
    .line 241
    throw v0

    .line 242
    :cond_11
    invoke-virtual {v0}, LP/o;->N()V

    .line 243
    .line 244
    .line 245
    :goto_a
    invoke-virtual {v0}, LP/o;->r()LP/o0;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    if-eqz v6, :cond_12

    .line 250
    .line 251
    new-instance v0, LE/w;

    .line 252
    .line 253
    invoke-direct/range {v0 .. v5}, LE/w;-><init>(Ljava/lang/Object;ILE/H;LX/e;I)V

    .line 254
    .line 255
    .line 256
    iput-object v0, v6, LP/o0;->d:LB5/e;

    .line 257
    .line 258
    :cond_12
    return-void
.end method

.method public static final c(LX/e;LP/o;I)V
    .locals 10

    .line 1
    const v0, 0x282f3fa8

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, LP/o;->U(I)LP/o;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p2, 0x3

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x2

    .line 11
    if-eq v0, v2, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v1

    .line 16
    :goto_0
    and-int/lit8 v2, p2, 0x1

    .line 17
    .line 18
    invoke-virtual {p1, v2, v0}, LP/o;->K(IZ)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    sget-object v0, LZ/k;->a:LP/T0;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, LZ/i;

    .line 31
    .line 32
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/n2;->L(LP/o;)LZ/f;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    new-instance v5, LA/Y;

    .line 41
    .line 42
    const/16 v6, 0x8

    .line 43
    .line 44
    invoke-direct {v5, v6, v2, v3}, LA/Y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    sget-object v7, LZ/n;->a:LZ/m;

    .line 48
    .line 49
    move-object v7, v5

    .line 50
    new-instance v5, LZ/m;

    .line 51
    .line 52
    sget-object v8, LE/V;->q:LE/V;

    .line 53
    .line 54
    invoke-direct {v5, v1, v8, v7}, LZ/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v2}, LP/o;->i(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    invoke-virtual {p1, v3}, LP/o;->i(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    or-int/2addr v1, v7

    .line 66
    invoke-virtual {p1}, LP/o;->H()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    if-nez v1, :cond_1

    .line 71
    .line 72
    sget-object v1, LP/k;->a:LP/S;

    .line 73
    .line 74
    if-ne v7, v1, :cond_2

    .line 75
    .line 76
    :cond_1
    new-instance v7, LB0/K;

    .line 77
    .line 78
    invoke-direct {v7, v6, v2, v3}, LB0/K;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, v7}, LP/o;->d0(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    move-object v6, v7

    .line 85
    check-cast v6, LB5/a;

    .line 86
    .line 87
    const/4 v8, 0x0

    .line 88
    const/4 v9, 0x4

    .line 89
    move-object v7, p1

    .line 90
    invoke-static/range {v4 .. v9}, Lcom/google/android/gms/internal/measurement/P1;->P([Ljava/lang/Object;LZ/l;LB5/a;LP/o;II)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    check-cast p1, LE/W;

    .line 95
    .line 96
    invoke-virtual {v0, p1}, LP/T0;->a(Ljava/lang/Object;)LP/m0;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    new-instance v1, LB0/j0;

    .line 101
    .line 102
    const/4 v2, 0x5

    .line 103
    invoke-direct {v1, v2, p0, p1}, LB0/j0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    const p1, 0x6f1942e8

    .line 107
    .line 108
    .line 109
    invoke-static {p1, v1, v7}, LX/k;->d(ILm5/e;LP/o;)LX/e;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    const/16 v1, 0x38

    .line 114
    .line 115
    invoke-static {v0, p1, v7, v1}, LP/b;->a(LP/m0;LX/e;LP/o;I)V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_3
    move-object v7, p1

    .line 120
    invoke-virtual {v7}, LP/o;->N()V

    .line 121
    .line 122
    .line 123
    :goto_1
    invoke-virtual {v7}, LP/o;->r()LP/o0;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    if-eqz p1, :cond_4

    .line 128
    .line 129
    new-instance v0, LE/X;

    .line 130
    .line 131
    invoke-direct {v0, p0, p2}, LE/X;-><init>(LX/e;I)V

    .line 132
    .line 133
    .line 134
    iput-object v0, p1, LP/o0;->d:LB5/e;

    .line 135
    .line 136
    :cond_4
    return-void
.end method

.method public static final d(LE/x;Ljava/lang/Object;ILjava/lang/Object;LP/o;I)V
    .locals 6

    .line 1
    const v0, 0x55d242fd

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4, v0}, LP/o;->U(I)LP/o;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p5, 0x6

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p4, p0}, LP/o;->g(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x2

    .line 20
    :goto_0
    or-int/2addr v0, p5

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, p5

    .line 23
    :goto_1
    and-int/lit8 v1, p5, 0x30

    .line 24
    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    invoke-virtual {p4, p1}, LP/o;->g(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    const/16 v1, 0x20

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    const/16 v1, 0x10

    .line 37
    .line 38
    :goto_2
    or-int/2addr v0, v1

    .line 39
    :cond_3
    and-int/lit16 v1, p5, 0x180

    .line 40
    .line 41
    if-nez v1, :cond_5

    .line 42
    .line 43
    invoke-virtual {p4, p2}, LP/o;->e(I)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_4

    .line 48
    .line 49
    const/16 v1, 0x100

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_4
    const/16 v1, 0x80

    .line 53
    .line 54
    :goto_3
    or-int/2addr v0, v1

    .line 55
    :cond_5
    and-int/lit16 v1, p5, 0xc00

    .line 56
    .line 57
    if-nez v1, :cond_7

    .line 58
    .line 59
    invoke-virtual {p4, p3}, LP/o;->g(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_6

    .line 64
    .line 65
    const/16 v1, 0x800

    .line 66
    .line 67
    goto :goto_4

    .line 68
    :cond_6
    const/16 v1, 0x400

    .line 69
    .line 70
    :goto_4
    or-int/2addr v0, v1

    .line 71
    :cond_7
    and-int/lit16 v1, v0, 0x493

    .line 72
    .line 73
    const/16 v2, 0x492

    .line 74
    .line 75
    const/4 v3, 0x1

    .line 76
    if-eq v1, v2, :cond_8

    .line 77
    .line 78
    move v1, v3

    .line 79
    goto :goto_5

    .line 80
    :cond_8
    const/4 v1, 0x0

    .line 81
    :goto_5
    and-int/2addr v0, v3

    .line 82
    invoke-virtual {p4, v0, v1}, LP/o;->K(IZ)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_9

    .line 87
    .line 88
    move-object v0, p1

    .line 89
    check-cast v0, LZ/c;

    .line 90
    .line 91
    new-instance v1, LE/v;

    .line 92
    .line 93
    invoke-direct {v1, p2, p0, p3}, LE/v;-><init>(ILE/x;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    const v2, 0x3a785bde

    .line 97
    .line 98
    .line 99
    invoke-static {v2, v1, p4}, LX/k;->d(ILm5/e;LP/o;)LX/e;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    const/16 v2, 0x30

    .line 104
    .line 105
    invoke-interface {v0, p3, v1, p4, v2}, LZ/c;->f(Ljava/lang/Object;LX/e;LP/o;I)V

    .line 106
    .line 107
    .line 108
    goto :goto_6

    .line 109
    :cond_9
    invoke-virtual {p4}, LP/o;->N()V

    .line 110
    .line 111
    .line 112
    :goto_6
    invoke-virtual {p4}, LP/o;->r()LP/o0;

    .line 113
    .line 114
    .line 115
    move-result-object p4

    .line 116
    if-eqz p4, :cond_a

    .line 117
    .line 118
    new-instance v0, LE/w;

    .line 119
    .line 120
    move-object v1, p0

    .line 121
    move-object v2, p1

    .line 122
    move v3, p2

    .line 123
    move-object v4, p3

    .line 124
    move v5, p5

    .line 125
    invoke-direct/range {v0 .. v5}, LE/w;-><init>(LE/x;Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 126
    .line 127
    .line 128
    iput-object v0, p4, LP/o0;->d:LB5/e;

    .line 129
    .line 130
    :cond_a
    return-void
.end method

.method public static final e(ILR/e;)I
    .locals 5

    .line 1
    iget v0, p1, LR/e;->s:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :cond_0
    :goto_0
    if-ge v1, v0, :cond_3

    .line 7
    .line 8
    sub-int v2, v0, v1

    .line 9
    .line 10
    div-int/lit8 v2, v2, 0x2

    .line 11
    .line 12
    add-int/2addr v2, v1

    .line 13
    iget-object v3, p1, LR/e;->q:[Ljava/lang/Object;

    .line 14
    .line 15
    aget-object v4, v3, v2

    .line 16
    .line 17
    check-cast v4, LE/i;

    .line 18
    .line 19
    iget v4, v4, LE/i;->a:I

    .line 20
    .line 21
    if-ne v4, p0, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    if-ge v4, p0, :cond_2

    .line 25
    .line 26
    add-int/lit8 v1, v2, 0x1

    .line 27
    .line 28
    aget-object v3, v3, v1

    .line 29
    .line 30
    check-cast v3, LE/i;

    .line 31
    .line 32
    iget v3, v3, LE/i;->a:I

    .line 33
    .line 34
    if-ge p0, v3, :cond_0

    .line 35
    .line 36
    :goto_1
    return v2

    .line 37
    :cond_2
    add-int/lit8 v0, v2, -0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_3
    return v1
.end method

.method public static final f(LE/E;Ljava/util/ArrayList;Lr/u;IIILB5/c;)Ljava/util/List;
    .locals 21

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    if-eqz p0, :cond_13

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-nez v3, :cond_13

    .line 14
    .line 15
    iget v3, v1, Lr/u;->b:I

    .line 16
    .line 17
    if-eqz v3, :cond_13

    .line 18
    .line 19
    invoke-static {v0}, Ln5/l;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, LE/B;

    .line 24
    .line 25
    invoke-interface {v3}, LE/B;->getIndex()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-static {v0}, Ln5/l;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, LE/B;

    .line 34
    .line 35
    invoke-interface {v4}, LE/B;->getIndex()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    sub-int/2addr v4, v3

    .line 40
    const/4 v5, -0x1

    .line 41
    const/4 v6, 0x0

    .line 42
    if-ltz v4, :cond_3

    .line 43
    .line 44
    iget v4, v1, Lr/u;->b:I

    .line 45
    .line 46
    if-nez v4, :cond_0

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    invoke-static {v6, v4}, LD5/a;->O(II)LG5/d;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    iget v7, v4, LG5/b;->q:I

    .line 54
    .line 55
    iget v4, v4, LG5/b;->r:I

    .line 56
    .line 57
    move v8, v5

    .line 58
    if-gt v7, v4, :cond_1

    .line 59
    .line 60
    :goto_0
    invoke-virtual {v1, v7}, Lr/u;->c(I)I

    .line 61
    .line 62
    .line 63
    move-result v9

    .line 64
    if-gt v9, v3, :cond_1

    .line 65
    .line 66
    invoke-virtual {v1, v7}, Lr/u;->c(I)I

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    if-eq v7, v4, :cond_1

    .line 71
    .line 72
    add-int/lit8 v7, v7, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    if-ne v8, v5, :cond_2

    .line 76
    .line 77
    sget-object v3, Lr/j;->a:Lr/u;

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    sget-object v3, Lr/j;->a:Lr/u;

    .line 81
    .line 82
    new-instance v3, Lr/u;

    .line 83
    .line 84
    const/4 v4, 0x1

    .line 85
    invoke-direct {v3, v4}, Lr/u;-><init>(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3, v8}, Lr/u;->a(I)V

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_3
    :goto_1
    sget-object v3, Lr/j;->a:Lr/u;

    .line 93
    .line 94
    :goto_2
    new-instance v4, Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 97
    .line 98
    .line 99
    new-instance v7, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 106
    .line 107
    .line 108
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 109
    .line 110
    .line 111
    move-result v8

    .line 112
    move v9, v6

    .line 113
    :goto_3
    if-ge v9, v8, :cond_6

    .line 114
    .line 115
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    move-object v11, v10

    .line 120
    check-cast v11, LE/B;

    .line 121
    .line 122
    invoke-interface {v11}, LE/B;->getIndex()I

    .line 123
    .line 124
    .line 125
    move-result v11

    .line 126
    iget-object v12, v1, Lr/u;->a:[I

    .line 127
    .line 128
    iget v13, v1, Lr/u;->b:I

    .line 129
    .line 130
    move v14, v6

    .line 131
    :goto_4
    if-ge v14, v13, :cond_5

    .line 132
    .line 133
    aget v15, v12, v14

    .line 134
    .line 135
    if-ne v15, v11, :cond_4

    .line 136
    .line 137
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    goto :goto_5

    .line 141
    :cond_4
    add-int/lit8 v14, v14, 0x1

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_5
    :goto_5
    add-int/lit8 v9, v9, 0x1

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_6
    iget-object v1, v3, Lr/u;->a:[I

    .line 148
    .line 149
    iget v3, v3, Lr/u;->b:I

    .line 150
    .line 151
    move v8, v6

    .line 152
    :goto_6
    if-ge v8, v3, :cond_12

    .line 153
    .line 154
    aget v9, v1, v8

    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 157
    .line 158
    .line 159
    move-result v10

    .line 160
    move v11, v6

    .line 161
    move v12, v11

    .line 162
    :goto_7
    if-ge v12, v10, :cond_8

    .line 163
    .line 164
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v13

    .line 168
    add-int/lit8 v12, v12, 0x1

    .line 169
    .line 170
    check-cast v13, LE/B;

    .line 171
    .line 172
    invoke-interface {v13}, LE/B;->getIndex()I

    .line 173
    .line 174
    .line 175
    move-result v13

    .line 176
    if-ne v13, v9, :cond_7

    .line 177
    .line 178
    goto :goto_8

    .line 179
    :cond_7
    add-int/lit8 v11, v11, 0x1

    .line 180
    .line 181
    goto :goto_7

    .line 182
    :cond_8
    move v11, v5

    .line 183
    :goto_8
    if-ne v11, v5, :cond_9

    .line 184
    .line 185
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    move-result-object v10

    .line 189
    move-object/from16 v12, p6

    .line 190
    .line 191
    invoke-interface {v12, v10}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v10

    .line 195
    check-cast v10, LE/B;

    .line 196
    .line 197
    goto :goto_9

    .line 198
    :cond_9
    move-object/from16 v12, p6

    .line 199
    .line 200
    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v10

    .line 204
    check-cast v10, LE/B;

    .line 205
    .line 206
    :goto_9
    invoke-interface {v10}, LE/B;->f()I

    .line 207
    .line 208
    .line 209
    move-result v13

    .line 210
    const/16 p0, 0x20

    .line 211
    .line 212
    if-ne v11, v5, :cond_a

    .line 213
    .line 214
    const/high16 v11, -0x80000000

    .line 215
    .line 216
    const-wide v19, 0xffffffffL

    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    goto :goto_b

    .line 222
    :cond_a
    invoke-interface {v10, v6}, LE/B;->g(I)J

    .line 223
    .line 224
    .line 225
    move-result-wide v17

    .line 226
    invoke-interface {v10}, LE/B;->c()Z

    .line 227
    .line 228
    .line 229
    move-result v11

    .line 230
    if-eqz v11, :cond_b

    .line 231
    .line 232
    const-wide v19, 0xffffffffL

    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    and-long v14, v17, v19

    .line 238
    .line 239
    :goto_a
    long-to-int v11, v14

    .line 240
    goto :goto_b

    .line 241
    :cond_b
    const-wide v19, 0xffffffffL

    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    shr-long v14, v17, p0

    .line 247
    .line 248
    goto :goto_a

    .line 249
    :goto_b
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 250
    .line 251
    .line 252
    move-result v14

    .line 253
    move v15, v6

    .line 254
    :goto_c
    if-ge v15, v14, :cond_d

    .line 255
    .line 256
    invoke-virtual {v7, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v16

    .line 260
    move-object/from16 v17, v16

    .line 261
    .line 262
    check-cast v17, LE/B;

    .line 263
    .line 264
    invoke-interface/range {v17 .. v17}, LE/B;->getIndex()I

    .line 265
    .line 266
    .line 267
    move-result v5

    .line 268
    if-eq v5, v9, :cond_c

    .line 269
    .line 270
    goto :goto_d

    .line 271
    :cond_c
    add-int/lit8 v15, v15, 0x1

    .line 272
    .line 273
    const/4 v5, -0x1

    .line 274
    goto :goto_c

    .line 275
    :cond_d
    const/16 v16, 0x0

    .line 276
    .line 277
    :goto_d
    move-object/from16 v5, v16

    .line 278
    .line 279
    check-cast v5, LE/B;

    .line 280
    .line 281
    if-eqz v5, :cond_f

    .line 282
    .line 283
    invoke-interface {v5, v6}, LE/B;->g(I)J

    .line 284
    .line 285
    .line 286
    move-result-wide v14

    .line 287
    invoke-interface {v5}, LE/B;->c()Z

    .line 288
    .line 289
    .line 290
    move-result v5

    .line 291
    if-eqz v5, :cond_e

    .line 292
    .line 293
    and-long v14, v14, v19

    .line 294
    .line 295
    :goto_e
    long-to-int v5, v14

    .line 296
    goto :goto_f

    .line 297
    :cond_e
    shr-long v14, v14, p0

    .line 298
    .line 299
    goto :goto_e

    .line 300
    :goto_f
    const/high16 v9, -0x80000000

    .line 301
    .line 302
    goto :goto_10

    .line 303
    :cond_f
    const/high16 v5, -0x80000000

    .line 304
    .line 305
    goto :goto_f

    .line 306
    :goto_10
    if-ne v11, v9, :cond_10

    .line 307
    .line 308
    neg-int v11, v2

    .line 309
    goto :goto_11

    .line 310
    :cond_10
    neg-int v14, v2

    .line 311
    invoke-static {v14, v11}, Ljava/lang/Math;->max(II)I

    .line 312
    .line 313
    .line 314
    move-result v11

    .line 315
    :goto_11
    if-eq v5, v9, :cond_11

    .line 316
    .line 317
    sub-int/2addr v5, v13

    .line 318
    invoke-static {v11, v5}, Ljava/lang/Math;->min(II)I

    .line 319
    .line 320
    .line 321
    move-result v11

    .line 322
    :cond_11
    invoke-interface {v10}, LE/B;->d()V

    .line 323
    .line 324
    .line 325
    move/from16 v5, p4

    .line 326
    .line 327
    move/from16 v9, p5

    .line 328
    .line 329
    invoke-interface {v10, v11, v5, v9}, LE/B;->e(III)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    add-int/lit8 v8, v8, 0x1

    .line 336
    .line 337
    const/4 v5, -0x1

    .line 338
    goto/16 :goto_6

    .line 339
    .line 340
    :cond_12
    return-object v4

    .line 341
    :cond_13
    sget-object v0, Ln5/s;->q:Ln5/s;

    .line 342
    .line 343
    return-object v0
.end method

.method public static final g(LE/x;LE/H;LE/k;)Ljava/util/List;
    .locals 10

    .line 1
    iget-object v0, p2, LE/k;->a:LR/e;

    .line 2
    .line 3
    iget v1, v0, LR/e;->s:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move v1, v3

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v1, v2

    .line 12
    :goto_0
    if-nez v1, :cond_1

    .line 13
    .line 14
    iget-object v1, p1, LE/H;->q:La0/q;

    .line 15
    .line 16
    invoke-virtual {v1}, La0/q;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    sget-object p0, Ln5/s;->q:Ln5/s;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iget-object p2, p2, LE/k;->a:LR/e;

    .line 31
    .line 32
    iget p2, p2, LR/e;->s:I

    .line 33
    .line 34
    if-eqz p2, :cond_9

    .line 35
    .line 36
    new-instance p2, LG5/d;

    .line 37
    .line 38
    iget v4, v0, LR/e;->s:I

    .line 39
    .line 40
    const-string v5, "MutableVector is empty."

    .line 41
    .line 42
    if-eqz v4, :cond_8

    .line 43
    .line 44
    iget-object v6, v0, LR/e;->q:[Ljava/lang/Object;

    .line 45
    .line 46
    aget-object v7, v6, v2

    .line 47
    .line 48
    check-cast v7, LE/j;

    .line 49
    .line 50
    iget v7, v7, LE/j;->a:I

    .line 51
    .line 52
    move v8, v2

    .line 53
    :goto_1
    if-ge v8, v4, :cond_3

    .line 54
    .line 55
    aget-object v9, v6, v8

    .line 56
    .line 57
    check-cast v9, LE/j;

    .line 58
    .line 59
    iget v9, v9, LE/j;->a:I

    .line 60
    .line 61
    if-ge v9, v7, :cond_2

    .line 62
    .line 63
    move v7, v9

    .line 64
    :cond_2
    add-int/lit8 v8, v8, 0x1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    if-ltz v7, :cond_4

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_4
    const-string v4, "negative minIndex"

    .line 71
    .line 72
    invoke-static {v4}, Lz/a;->a(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :goto_2
    iget v4, v0, LR/e;->s:I

    .line 76
    .line 77
    if-eqz v4, :cond_7

    .line 78
    .line 79
    iget-object v0, v0, LR/e;->q:[Ljava/lang/Object;

    .line 80
    .line 81
    aget-object v5, v0, v2

    .line 82
    .line 83
    check-cast v5, LE/j;

    .line 84
    .line 85
    iget v5, v5, LE/j;->b:I

    .line 86
    .line 87
    move v6, v2

    .line 88
    :goto_3
    if-ge v6, v4, :cond_6

    .line 89
    .line 90
    aget-object v8, v0, v6

    .line 91
    .line 92
    check-cast v8, LE/j;

    .line 93
    .line 94
    iget v8, v8, LE/j;->b:I

    .line 95
    .line 96
    if-le v8, v5, :cond_5

    .line 97
    .line 98
    move v5, v8

    .line 99
    :cond_5
    add-int/lit8 v6, v6, 0x1

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_6
    invoke-interface {p0}, LE/x;->a()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    sub-int/2addr v0, v3

    .line 107
    invoke-static {v5, v0}, Ljava/lang/Math;->min(II)I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    invoke-direct {p2, v7, v0, v3}, LG5/b;-><init>(III)V

    .line 112
    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_7
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 116
    .line 117
    invoke-direct {p0, v5}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw p0

    .line 121
    :cond_8
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 122
    .line 123
    invoke-direct {p0, v5}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw p0

    .line 127
    :cond_9
    sget-object p2, LG5/d;->t:LG5/d;

    .line 128
    .line 129
    :goto_4
    iget-object v0, p1, LE/H;->q:La0/q;

    .line 130
    .line 131
    invoke-virtual {v0}, La0/q;->size()I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    :goto_5
    if-ge v2, v0, :cond_c

    .line 136
    .line 137
    invoke-virtual {p1, v2}, LE/H;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    check-cast v3, LE/G;

    .line 142
    .line 143
    iget-object v4, v3, LE/G;->a:Ljava/lang/Object;

    .line 144
    .line 145
    iget v3, v3, LE/G;->c:I

    .line 146
    .line 147
    invoke-static {v3, p0, v4}, LE/C;->i(ILE/x;Ljava/lang/Object;)I

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    iget v4, p2, LG5/b;->q:I

    .line 152
    .line 153
    iget v5, p2, LG5/b;->r:I

    .line 154
    .line 155
    if-gt v3, v5, :cond_a

    .line 156
    .line 157
    if-gt v4, v3, :cond_a

    .line 158
    .line 159
    goto :goto_6

    .line 160
    :cond_a
    if-ltz v3, :cond_b

    .line 161
    .line 162
    invoke-interface {p0}, LE/x;->a()I

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-ge v3, v4, :cond_b

    .line 167
    .line 168
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    :cond_b
    :goto_6
    add-int/lit8 v2, v2, 0x1

    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_c
    iget p0, p2, LG5/b;->q:I

    .line 179
    .line 180
    iget p1, p2, LG5/b;->r:I

    .line 181
    .line 182
    if-gt p0, p1, :cond_d

    .line 183
    .line 184
    :goto_7
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    if-eq p0, p1, :cond_d

    .line 192
    .line 193
    add-int/lit8 p0, p0, 0x1

    .line 194
    .line 195
    goto :goto_7

    .line 196
    :cond_d
    return-object v1
.end method

.method public static h()LP/W;
    .locals 3

    .line 1
    sget-object v0, LP/S;->s:LP/S;

    .line 2
    .line 3
    new-instance v1, LP/f0;

    .line 4
    .line 5
    sget-object v2, Lm5/y;->a:Lm5/y;

    .line 6
    .line 7
    invoke-direct {v1, v2, v0}, LP/f0;-><init>(Ljava/lang/Object;LP/I0;)V

    .line 8
    .line 9
    .line 10
    return-object v1
.end method

.method public static final i(ILE/x;Ljava/lang/Object;)I
    .locals 1

    .line 1
    if-eqz p2, :cond_2

    .line 2
    .line 3
    invoke-interface {p1}, LE/x;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-interface {p1}, LE/x;->a()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-ge p0, v0, :cond_1

    .line 15
    .line 16
    invoke-interface {p1, p0}, LE/x;->b(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-interface {p1, p2}, LE/x;->d(Ljava/lang/Object;)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    const/4 p2, -0x1

    .line 32
    if-eq p1, p2, :cond_2

    .line 33
    .line 34
    return p1

    .line 35
    :cond_2
    :goto_0
    return p0
.end method

.method public static final m(IILjava/util/ArrayList;Ljava/util/List;)Ljava/util/List;
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object p0, Ln5/s;->q:Ln5/s;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    check-cast p3, Ljava/util/Collection;

    .line 11
    .line 12
    invoke-static {p3}, Ln5/l;->C0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    :goto_0
    if-ge v1, v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, LE/B;

    .line 28
    .line 29
    invoke-interface {v2}, LE/B;->getIndex()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-gt p0, v3, :cond_1

    .line 34
    .line 35
    if-gt v3, p1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    sget-object p0, LE/C;->a:LB0/C;

    .line 44
    .line 45
    invoke-static {p3, p0}, Ln5/p;->d0(Ljava/util/List;Ljava/util/Comparator;)V

    .line 46
    .line 47
    .line 48
    return-object p3
.end method


# virtual methods
.method public j(I)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, LE/C;->k()LE/Y;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LE/Y;->f(I)LE/i;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v1, v0, LE/i;->a:I

    .line 10
    .line 11
    sub-int/2addr p1, v1

    .line 12
    iget-object v0, v0, LE/i;->c:LE/q;

    .line 13
    .line 14
    invoke-interface {v0}, LE/q;->a()LB5/c;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {v0, p1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method

.method public abstract k()LE/Y;
.end method

.method public l(I)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, LE/C;->k()LE/Y;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LE/Y;->f(I)LE/i;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v1, v0, LE/i;->a:I

    .line 10
    .line 11
    sub-int v1, p1, v1

    .line 12
    .line 13
    iget-object v0, v0, LE/i;->c:LE/q;

    .line 14
    .line 15
    invoke-interface {v0}, LE/q;->getKey()LB5/c;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {v0, v1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-object v0

    .line 33
    :cond_1
    :goto_0
    new-instance v0, LE/g;

    .line 34
    .line 35
    invoke-direct {v0, p1}, LE/g;-><init>(I)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method
