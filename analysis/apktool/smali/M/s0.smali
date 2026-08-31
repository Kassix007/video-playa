.class public abstract LM/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LL/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LL/g;

    .line 2
    .line 3
    const v1, 0x3dcccccd    # 0.1f

    .line 4
    .line 5
    .line 6
    const v2, 0x3da3d70a    # 0.08f

    .line 7
    .line 8
    .line 9
    const v3, 0x3e23d70a    # 0.16f

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v3, v1, v2, v1}, LL/g;-><init>(FFFF)V

    .line 13
    .line 14
    .line 15
    sput-object v0, LM/s0;->a:LL/g;

    .line 16
    .line 17
    return-void
.end method

.method public static final a(Lc0/m;Lj0/E;LM/e;LM/f;LX/e;LP/o;II)V
    .locals 18

    .line 1
    move-object/from16 v3, p2

    .line 2
    .line 3
    move-object/from16 v5, p4

    .line 4
    .line 5
    move-object/from16 v15, p5

    .line 6
    .line 7
    move/from16 v0, p6

    .line 8
    .line 9
    const v1, 0x464f98b1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v15, v1}, LP/o;->U(I)LP/o;

    .line 13
    .line 14
    .line 15
    and-int/lit8 v1, v0, 0x6

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    move-object/from16 v1, p0

    .line 20
    .line 21
    invoke-virtual {v15, v1}, LP/o;->g(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    const/4 v2, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v2, 0x2

    .line 30
    :goto_0
    or-int/2addr v2, v0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move-object/from16 v1, p0

    .line 33
    .line 34
    move v2, v0

    .line 35
    :goto_1
    and-int/lit8 v4, v0, 0x30

    .line 36
    .line 37
    move-object/from16 v7, p1

    .line 38
    .line 39
    if-nez v4, :cond_3

    .line 40
    .line 41
    invoke-virtual {v15, v7}, LP/o;->g(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    const/16 v4, 0x20

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/16 v4, 0x10

    .line 51
    .line 52
    :goto_2
    or-int/2addr v2, v4

    .line 53
    :cond_3
    and-int/lit16 v4, v0, 0x180

    .line 54
    .line 55
    if-nez v4, :cond_5

    .line 56
    .line 57
    invoke-virtual {v15, v3}, LP/o;->g(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-eqz v4, :cond_4

    .line 62
    .line 63
    const/16 v4, 0x100

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_4
    const/16 v4, 0x80

    .line 67
    .line 68
    :goto_3
    or-int/2addr v2, v4

    .line 69
    :cond_5
    and-int/lit16 v4, v0, 0xc00

    .line 70
    .line 71
    if-nez v4, :cond_8

    .line 72
    .line 73
    and-int/lit8 v4, p7, 0x8

    .line 74
    .line 75
    if-nez v4, :cond_6

    .line 76
    .line 77
    move-object/from16 v4, p3

    .line 78
    .line 79
    invoke-virtual {v15, v4}, LP/o;->g(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    if-eqz v6, :cond_7

    .line 84
    .line 85
    const/16 v6, 0x800

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_6
    move-object/from16 v4, p3

    .line 89
    .line 90
    :cond_7
    const/16 v6, 0x400

    .line 91
    .line 92
    :goto_4
    or-int/2addr v2, v6

    .line 93
    goto :goto_5

    .line 94
    :cond_8
    move-object/from16 v4, p3

    .line 95
    .line 96
    :goto_5
    and-int/lit8 v6, p7, 0x10

    .line 97
    .line 98
    if-eqz v6, :cond_9

    .line 99
    .line 100
    or-int/lit16 v2, v2, 0x6000

    .line 101
    .line 102
    goto :goto_7

    .line 103
    :cond_9
    and-int/lit16 v6, v0, 0x6000

    .line 104
    .line 105
    if-nez v6, :cond_b

    .line 106
    .line 107
    const/4 v6, 0x0

    .line 108
    invoke-virtual {v15, v6}, LP/o;->g(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    if-eqz v6, :cond_a

    .line 113
    .line 114
    const/16 v6, 0x4000

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_a
    const/16 v6, 0x2000

    .line 118
    .line 119
    :goto_6
    or-int/2addr v2, v6

    .line 120
    :cond_b
    :goto_7
    const/high16 v6, 0x30000

    .line 121
    .line 122
    and-int/2addr v6, v0

    .line 123
    if-nez v6, :cond_d

    .line 124
    .line 125
    invoke-virtual {v15, v5}, LP/o;->i(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    if-eqz v6, :cond_c

    .line 130
    .line 131
    const/high16 v6, 0x20000

    .line 132
    .line 133
    goto :goto_8

    .line 134
    :cond_c
    const/high16 v6, 0x10000

    .line 135
    .line 136
    :goto_8
    or-int/2addr v2, v6

    .line 137
    :cond_d
    const v6, 0x12493

    .line 138
    .line 139
    .line 140
    and-int/2addr v6, v2

    .line 141
    const v8, 0x12492

    .line 142
    .line 143
    .line 144
    if-ne v6, v8, :cond_f

    .line 145
    .line 146
    invoke-virtual {v15}, LP/o;->x()Z

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    if-nez v6, :cond_e

    .line 151
    .line 152
    goto :goto_9

    .line 153
    :cond_e
    invoke-virtual {v15}, LP/o;->N()V

    .line 154
    .line 155
    .line 156
    goto/16 :goto_d

    .line 157
    .line 158
    :cond_f
    :goto_9
    invoke-virtual {v15}, LP/o;->P()V

    .line 159
    .line 160
    .line 161
    and-int/lit8 v6, v0, 0x1

    .line 162
    .line 163
    if-eqz v6, :cond_11

    .line 164
    .line 165
    invoke-virtual {v15}, LP/o;->w()Z

    .line 166
    .line 167
    .line 168
    move-result v6

    .line 169
    if-eqz v6, :cond_10

    .line 170
    .line 171
    goto :goto_b

    .line 172
    :cond_10
    invoke-virtual {v15}, LP/o;->N()V

    .line 173
    .line 174
    .line 175
    and-int/lit8 v6, p7, 0x8

    .line 176
    .line 177
    if-eqz v6, :cond_12

    .line 178
    .line 179
    :goto_a
    and-int/lit16 v2, v2, -0x1c01

    .line 180
    .line 181
    goto :goto_c

    .line 182
    :cond_11
    :goto_b
    and-int/lit8 v6, p7, 0x8

    .line 183
    .line 184
    if-eqz v6, :cond_12

    .line 185
    .line 186
    const/4 v4, 0x0

    .line 187
    const/16 v6, 0x3f

    .line 188
    .line 189
    invoke-static {v6, v4}, LM/s0;->e(IF)LM/f;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    goto :goto_a

    .line 194
    :cond_12
    :goto_c
    invoke-virtual {v15}, LP/o;->q()V

    .line 195
    .line 196
    .line 197
    iget-wide v8, v3, LM/e;->a:J

    .line 198
    .line 199
    iget-wide v10, v3, LM/e;->b:J

    .line 200
    .line 201
    iget v6, v4, LM/f;->a:F

    .line 202
    .line 203
    const v12, -0x691c96f5

    .line 204
    .line 205
    .line 206
    invoke-virtual {v15, v12}, LP/o;->S(I)V

    .line 207
    .line 208
    .line 209
    const v12, -0x2bccbebc

    .line 210
    .line 211
    .line 212
    invoke-virtual {v15, v12}, LP/o;->S(I)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v15}, LP/o;->H()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v12

    .line 219
    sget-object v13, LP/k;->a:LP/S;

    .line 220
    .line 221
    if-ne v12, v13, :cond_13

    .line 222
    .line 223
    new-instance v12, LW0/f;

    .line 224
    .line 225
    invoke-direct {v12, v6}, LW0/f;-><init>(F)V

    .line 226
    .line 227
    .line 228
    invoke-static {v12}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 229
    .line 230
    .line 231
    move-result-object v12

    .line 232
    invoke-virtual {v15, v12}, LP/o;->d0(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    :cond_13
    check-cast v12, LP/W;

    .line 236
    .line 237
    const/4 v6, 0x0

    .line 238
    invoke-virtual {v15, v6}, LP/o;->p(Z)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v15, v6}, LP/o;->p(Z)V

    .line 242
    .line 243
    .line 244
    invoke-interface {v12}, LP/S0;->getValue()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v6

    .line 248
    check-cast v6, LW0/f;

    .line 249
    .line 250
    iget v13, v6, LW0/f;->q:F

    .line 251
    .line 252
    new-instance v6, LE/X;

    .line 253
    .line 254
    invoke-direct {v6, v5}, LE/X;-><init>(LX/e;)V

    .line 255
    .line 256
    .line 257
    const v12, 0x27956c36

    .line 258
    .line 259
    .line 260
    invoke-static {v12, v6, v15}, LX/k;->d(ILm5/e;LP/o;)LX/e;

    .line 261
    .line 262
    .line 263
    move-result-object v14

    .line 264
    and-int/lit8 v6, v2, 0xe

    .line 265
    .line 266
    const/high16 v12, 0xc00000

    .line 267
    .line 268
    or-int/2addr v6, v12

    .line 269
    and-int/lit8 v12, v2, 0x70

    .line 270
    .line 271
    or-int/2addr v6, v12

    .line 272
    const/high16 v12, 0x380000

    .line 273
    .line 274
    shl-int/lit8 v2, v2, 0x6

    .line 275
    .line 276
    and-int/2addr v2, v12

    .line 277
    or-int v16, v6, v2

    .line 278
    .line 279
    const/16 v17, 0x10

    .line 280
    .line 281
    const/4 v12, 0x0

    .line 282
    move-object v6, v1

    .line 283
    invoke-static/range {v6 .. v17}, LM/L0;->a(Lc0/m;Lj0/E;JJFFLX/e;LP/o;II)V

    .line 284
    .line 285
    .line 286
    :goto_d
    invoke-virtual/range {p5 .. p5}, LP/o;->r()LP/o0;

    .line 287
    .line 288
    .line 289
    move-result-object v8

    .line 290
    if-eqz v8, :cond_14

    .line 291
    .line 292
    new-instance v0, LM/g;

    .line 293
    .line 294
    move-object/from16 v1, p0

    .line 295
    .line 296
    move-object/from16 v2, p1

    .line 297
    .line 298
    move/from16 v6, p6

    .line 299
    .line 300
    move/from16 v7, p7

    .line 301
    .line 302
    invoke-direct/range {v0 .. v7}, LM/g;-><init>(Lc0/m;Lj0/E;LM/e;LM/f;LX/e;II)V

    .line 303
    .line 304
    .line 305
    iput-object v0, v8, LP/o0;->d:LB5/e;

    .line 306
    .line 307
    :cond_14
    return-void
.end method

.method public static final b(Lc0/m;Lj0/E;LM/e;LM/f;LX/e;LP/o;I)V
    .locals 16

    .line 1
    move-object/from16 v5, p5

    .line 2
    .line 3
    const v0, 0x3566f669

    .line 4
    .line 5
    .line 6
    invoke-virtual {v5, v0}, LP/o;->U(I)LP/o;

    .line 7
    .line 8
    .line 9
    and-int/lit8 v0, p6, 0x6

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    move-object/from16 v0, p0

    .line 14
    .line 15
    invoke-virtual {v5, v0}, LP/o;->g(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v1, 0x2

    .line 24
    :goto_0
    or-int v1, p6, v1

    .line 25
    .line 26
    :goto_1
    move-object/from16 v3, p1

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_1
    move-object/from16 v0, p0

    .line 30
    .line 31
    move/from16 v1, p6

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :goto_2
    invoke-virtual {v5, v3}, LP/o;->g(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    const/16 v2, 0x20

    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_2
    const/16 v2, 0x10

    .line 44
    .line 45
    :goto_3
    or-int/2addr v1, v2

    .line 46
    or-int/lit16 v1, v1, 0x80

    .line 47
    .line 48
    move-object/from16 v2, p3

    .line 49
    .line 50
    invoke-virtual {v5, v2}, LP/o;->g(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_3

    .line 55
    .line 56
    const/16 v4, 0x800

    .line 57
    .line 58
    goto :goto_4

    .line 59
    :cond_3
    const/16 v4, 0x400

    .line 60
    .line 61
    :goto_4
    or-int/2addr v1, v4

    .line 62
    and-int/lit16 v4, v1, 0x2493

    .line 63
    .line 64
    const/16 v6, 0x2492

    .line 65
    .line 66
    if-ne v4, v6, :cond_5

    .line 67
    .line 68
    invoke-virtual {v5}, LP/o;->x()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-nez v4, :cond_4

    .line 73
    .line 74
    goto :goto_5

    .line 75
    :cond_4
    invoke-virtual {v5}, LP/o;->N()V

    .line 76
    .line 77
    .line 78
    move-object/from16 v4, p2

    .line 79
    .line 80
    goto/16 :goto_8

    .line 81
    .line 82
    :cond_5
    :goto_5
    invoke-virtual {v5}, LP/o;->P()V

    .line 83
    .line 84
    .line 85
    and-int/lit8 v4, p6, 0x1

    .line 86
    .line 87
    if-eqz v4, :cond_7

    .line 88
    .line 89
    invoke-virtual {v5}, LP/o;->w()Z

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-eqz v4, :cond_6

    .line 94
    .line 95
    goto :goto_6

    .line 96
    :cond_6
    invoke-virtual {v5}, LP/o;->N()V

    .line 97
    .line 98
    .line 99
    and-int/lit16 v1, v1, -0x381

    .line 100
    .line 101
    move-object/from16 v2, p2

    .line 102
    .line 103
    goto :goto_7

    .line 104
    :cond_7
    :goto_6
    sget-object v4, LM/k;->a:LP/T0;

    .line 105
    .line 106
    invoke-virtual {v5, v4}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    check-cast v4, LM/i;

    .line 111
    .line 112
    iget-object v6, v4, LM/i;->L:LM/e;

    .line 113
    .line 114
    if-nez v6, :cond_8

    .line 115
    .line 116
    new-instance v7, LM/e;

    .line 117
    .line 118
    sget v6, LO/d;->a:I

    .line 119
    .line 120
    const/16 v6, 0x28

    .line 121
    .line 122
    invoke-static {v4, v6}, LM/k;->d(LM/i;I)J

    .line 123
    .line 124
    .line 125
    move-result-wide v8

    .line 126
    invoke-static {v4, v6}, LM/k;->d(LM/i;I)J

    .line 127
    .line 128
    .line 129
    move-result-wide v10

    .line 130
    invoke-static {v4, v10, v11}, LM/k;->a(LM/i;J)J

    .line 131
    .line 132
    .line 133
    move-result-wide v10

    .line 134
    sget v12, LO/d;->a:I

    .line 135
    .line 136
    invoke-static {v4, v12}, LM/k;->d(LM/i;I)J

    .line 137
    .line 138
    .line 139
    move-result-wide v13

    .line 140
    sget v15, LO/d;->b:F

    .line 141
    .line 142
    invoke-static {v13, v14, v15}, Lj0/o;->b(JF)J

    .line 143
    .line 144
    .line 145
    move-result-wide v13

    .line 146
    invoke-static {v4, v12}, LM/k;->d(LM/i;I)J

    .line 147
    .line 148
    .line 149
    move-result-wide v2

    .line 150
    invoke-static {v13, v14, v2, v3}, Lj0/B;->i(JJ)J

    .line 151
    .line 152
    .line 153
    move-result-wide v12

    .line 154
    invoke-static {v4, v6}, LM/k;->d(LM/i;I)J

    .line 155
    .line 156
    .line 157
    move-result-wide v2

    .line 158
    invoke-static {v4, v2, v3}, LM/k;->a(LM/i;J)J

    .line 159
    .line 160
    .line 161
    move-result-wide v2

    .line 162
    const v6, 0x3ec28f5c    # 0.38f

    .line 163
    .line 164
    .line 165
    invoke-static {v2, v3, v6}, Lj0/o;->b(JF)J

    .line 166
    .line 167
    .line 168
    move-result-wide v14

    .line 169
    invoke-direct/range {v7 .. v15}, LM/e;-><init>(JJJJ)V

    .line 170
    .line 171
    .line 172
    iput-object v7, v4, LM/i;->L:LM/e;

    .line 173
    .line 174
    move-object v6, v7

    .line 175
    :cond_8
    and-int/lit16 v1, v1, -0x381

    .line 176
    .line 177
    move-object v2, v6

    .line 178
    :goto_7
    invoke-virtual {v5}, LP/o;->q()V

    .line 179
    .line 180
    .line 181
    and-int/lit8 v3, v1, 0xe

    .line 182
    .line 183
    or-int/lit16 v3, v3, 0x6000

    .line 184
    .line 185
    and-int/lit8 v4, v1, 0x70

    .line 186
    .line 187
    or-int/2addr v3, v4

    .line 188
    and-int/lit16 v1, v1, 0x1c00

    .line 189
    .line 190
    or-int/2addr v1, v3

    .line 191
    const/high16 v3, 0x30000

    .line 192
    .line 193
    or-int v6, v1, v3

    .line 194
    .line 195
    const/4 v7, 0x0

    .line 196
    move-object/from16 v1, p1

    .line 197
    .line 198
    move-object/from16 v3, p3

    .line 199
    .line 200
    move-object/from16 v4, p4

    .line 201
    .line 202
    invoke-static/range {v0 .. v7}, LM/s0;->a(Lc0/m;Lj0/E;LM/e;LM/f;LX/e;LP/o;II)V

    .line 203
    .line 204
    .line 205
    move-object v4, v2

    .line 206
    :goto_8
    invoke-virtual/range {p5 .. p5}, LP/o;->r()LP/o0;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    if-eqz v0, :cond_9

    .line 211
    .line 212
    new-instance v1, LM/h;

    .line 213
    .line 214
    move-object/from16 v2, p0

    .line 215
    .line 216
    move-object/from16 v3, p1

    .line 217
    .line 218
    move-object/from16 v5, p3

    .line 219
    .line 220
    move-object/from16 v6, p4

    .line 221
    .line 222
    move/from16 v7, p6

    .line 223
    .line 224
    invoke-direct/range {v1 .. v7}, LM/h;-><init>(Lc0/m;Lj0/E;LM/e;LM/f;LX/e;I)V

    .line 225
    .line 226
    .line 227
    iput-object v1, v0, LP/o0;->d:LB5/e;

    .line 228
    .line 229
    :cond_9
    return-void
.end method

.method public static final c(LB5/a;Lc0/m;ZLM/u;LX/e;LP/o;II)V
    .locals 25

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    const v1, -0x441f35f2

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, LP/o;->U(I)LP/o;

    .line 7
    .line 8
    .line 9
    move-object/from16 v3, p0

    .line 10
    .line 11
    invoke-virtual {v0, v3}, LP/o;->i(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x4

    .line 16
    const/4 v4, 0x2

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    move v1, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v1, v4

    .line 22
    :goto_0
    or-int v1, p6, v1

    .line 23
    .line 24
    and-int/lit8 v5, p7, 0x2

    .line 25
    .line 26
    if-eqz v5, :cond_2

    .line 27
    .line 28
    or-int/lit8 v1, v1, 0x30

    .line 29
    .line 30
    :cond_1
    move-object/from16 v6, p1

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_2
    and-int/lit8 v6, p6, 0x30

    .line 34
    .line 35
    if-nez v6, :cond_1

    .line 36
    .line 37
    move-object/from16 v6, p1

    .line 38
    .line 39
    invoke-virtual {v0, v6}, LP/o;->g(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    if-eqz v7, :cond_3

    .line 44
    .line 45
    const/16 v7, 0x20

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    const/16 v7, 0x10

    .line 49
    .line 50
    :goto_1
    or-int/2addr v1, v7

    .line 51
    :goto_2
    or-int/lit16 v1, v1, 0x6580

    .line 52
    .line 53
    const v7, 0x12493

    .line 54
    .line 55
    .line 56
    and-int/2addr v1, v7

    .line 57
    const v7, 0x12492

    .line 58
    .line 59
    .line 60
    if-ne v1, v7, :cond_5

    .line 61
    .line 62
    invoke-virtual {v0}, LP/o;->x()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_4

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_4
    invoke-virtual {v0}, LP/o;->N()V

    .line 70
    .line 71
    .line 72
    move/from16 v5, p2

    .line 73
    .line 74
    move-object/from16 v7, p4

    .line 75
    .line 76
    move-object v4, v6

    .line 77
    move-object/from16 v6, p3

    .line 78
    .line 79
    goto/16 :goto_d

    .line 80
    .line 81
    :cond_5
    :goto_3
    invoke-virtual {v0}, LP/o;->P()V

    .line 82
    .line 83
    .line 84
    and-int/lit8 v1, p6, 0x1

    .line 85
    .line 86
    const/4 v9, 0x0

    .line 87
    if-eqz v1, :cond_7

    .line 88
    .line 89
    invoke-virtual {v0}, LP/o;->w()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_6

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_6
    invoke-virtual {v0}, LP/o;->N()V

    .line 97
    .line 98
    .line 99
    move/from16 v5, p2

    .line 100
    .line 101
    move-object/from16 v10, p3

    .line 102
    .line 103
    move-object v1, v6

    .line 104
    goto/16 :goto_9

    .line 105
    .line 106
    :cond_7
    :goto_4
    if-eqz v5, :cond_8

    .line 107
    .line 108
    sget-object v1, Lc0/j;->q:Lc0/j;

    .line 109
    .line 110
    goto :goto_5

    .line 111
    :cond_8
    move-object v1, v6

    .line 112
    :goto_5
    const v5, -0x5a939695

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v5}, LP/o;->S(I)V

    .line 116
    .line 117
    .line 118
    sget-object v5, LM/q;->a:LP/z;

    .line 119
    .line 120
    invoke-virtual {v0, v5}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    check-cast v5, Lj0/o;

    .line 125
    .line 126
    iget-wide v14, v5, Lj0/o;->a:J

    .line 127
    .line 128
    sget-object v5, LM/k;->a:LP/T0;

    .line 129
    .line 130
    invoke-virtual {v0, v5}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    check-cast v5, LM/i;

    .line 135
    .line 136
    iget-object v6, v5, LM/i;->M:LM/u;

    .line 137
    .line 138
    const v7, 0x3ec28f5c    # 0.38f

    .line 139
    .line 140
    .line 141
    if-nez v6, :cond_9

    .line 142
    .line 143
    new-instance v11, LM/u;

    .line 144
    .line 145
    sget-wide v12, Lj0/o;->f:J

    .line 146
    .line 147
    invoke-static {v14, v15, v7}, Lj0/o;->b(JF)J

    .line 148
    .line 149
    .line 150
    move-result-wide v18

    .line 151
    move-wide/from16 v16, v12

    .line 152
    .line 153
    invoke-direct/range {v11 .. v19}, LM/u;-><init>(JJJJ)V

    .line 154
    .line 155
    .line 156
    iput-object v11, v5, LM/i;->M:LM/u;

    .line 157
    .line 158
    move-object v6, v11

    .line 159
    :cond_9
    iget-wide v11, v6, LM/u;->b:J

    .line 160
    .line 161
    invoke-static {v11, v12, v14, v15}, Lj0/o;->c(JJ)Z

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    if-eqz v5, :cond_a

    .line 166
    .line 167
    invoke-virtual {v0, v9}, LP/o;->p(Z)V

    .line 168
    .line 169
    .line 170
    move-object/from16 v16, v6

    .line 171
    .line 172
    goto :goto_8

    .line 173
    :cond_a
    invoke-static {v14, v15, v7}, Lj0/o;->b(JF)J

    .line 174
    .line 175
    .line 176
    move-result-wide v7

    .line 177
    move-wide/from16 v16, v11

    .line 178
    .line 179
    iget-wide v10, v6, LM/u;->a:J

    .line 180
    .line 181
    move-wide/from16 v18, v14

    .line 182
    .line 183
    iget-wide v13, v6, LM/u;->c:J

    .line 184
    .line 185
    const-wide/16 v20, 0x10

    .line 186
    .line 187
    cmp-long v5, v18, v20

    .line 188
    .line 189
    if-eqz v5, :cond_b

    .line 190
    .line 191
    move-wide/from16 v16, v18

    .line 192
    .line 193
    :cond_b
    cmp-long v5, v7, v20

    .line 194
    .line 195
    if-eqz v5, :cond_c

    .line 196
    .line 197
    :goto_6
    move-wide/from16 v23, v7

    .line 198
    .line 199
    move-wide/from16 v19, v16

    .line 200
    .line 201
    goto :goto_7

    .line 202
    :cond_c
    iget-wide v7, v6, LM/u;->d:J

    .line 203
    .line 204
    goto :goto_6

    .line 205
    :goto_7
    new-instance v16, LM/u;

    .line 206
    .line 207
    move-wide/from16 v17, v10

    .line 208
    .line 209
    move-wide/from16 v21, v13

    .line 210
    .line 211
    invoke-direct/range {v16 .. v24}, LM/u;-><init>(JJJJ)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0, v9}, LP/o;->p(Z)V

    .line 215
    .line 216
    .line 217
    :goto_8
    move-object/from16 v10, v16

    .line 218
    .line 219
    const/4 v5, 0x1

    .line 220
    :goto_9
    invoke-virtual {v0}, LP/o;->q()V

    .line 221
    .line 222
    .line 223
    sget-object v6, LM/y;->a:LP/T0;

    .line 224
    .line 225
    sget-object v6, Landroidx/compose/material3/MinimumInteractiveModifier;->q:Landroidx/compose/material3/MinimumInteractiveModifier;

    .line 226
    .line 227
    invoke-interface {v1, v6}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    sget v7, LO/g;->b:F

    .line 232
    .line 233
    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/c;->c(Lc0/m;F)Lc0/m;

    .line 234
    .line 235
    .line 236
    move-result-object v6

    .line 237
    const/4 v8, 0x5

    .line 238
    invoke-static {v8, v0}, LM/D0;->a(ILP/o;)Lj0/E;

    .line 239
    .line 240
    .line 241
    move-result-object v8

    .line 242
    invoke-static {v6, v8}, La/a;->n(Lc0/m;Lj0/E;)Lc0/m;

    .line 243
    .line 244
    .line 245
    move-result-object v6

    .line 246
    if-eqz v5, :cond_d

    .line 247
    .line 248
    iget-wide v11, v10, LM/u;->a:J

    .line 249
    .line 250
    goto :goto_a

    .line 251
    :cond_d
    iget-wide v11, v10, LM/u;->c:J

    .line 252
    .line 253
    :goto_a
    sget-object v8, Lj0/B;->a:LO3/D;

    .line 254
    .line 255
    invoke-static {v6, v11, v12, v8}, Landroidx/compose/foundation/a;->a(Lc0/m;JLj0/E;)Lc0/m;

    .line 256
    .line 257
    .line 258
    move-result-object v6

    .line 259
    int-to-float v4, v4

    .line 260
    div-float/2addr v7, v4

    .line 261
    const/16 v4, 0x36

    .line 262
    .line 263
    invoke-static {v7, v0, v4, v2}, LM/t0;->a(FLP/o;II)Lv/P;

    .line 264
    .line 265
    .line 266
    move-result-object v4

    .line 267
    move-object v2, v6

    .line 268
    new-instance v6, LI0/f;

    .line 269
    .line 270
    invoke-direct {v6, v9}, LI0/f;-><init>(I)V

    .line 271
    .line 272
    .line 273
    const/16 v8, 0x8

    .line 274
    .line 275
    const/4 v3, 0x0

    .line 276
    move-object/from16 v7, p0

    .line 277
    .line 278
    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/a;->c(Lc0/m;Ly/i;Lv/P;ZLI0/f;LB5/a;I)Lc0/m;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    sget-object v3, Lc0/b;->u:Lc0/e;

    .line 283
    .line 284
    invoke-static {v3, v9}, LA/n;->d(Lc0/e;Z)Lz0/C;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    iget v4, v0, LP/o;->P:I

    .line 289
    .line 290
    invoke-virtual {v0}, LP/o;->m()LP/i0;

    .line 291
    .line 292
    .line 293
    move-result-object v6

    .line 294
    invoke-static {v0, v2}, Lc0/o;->c(LP/o;Lc0/m;)Lc0/m;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    sget-object v7, LB0/k;->a:LB0/j;

    .line 299
    .line 300
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    sget-object v7, LB0/j;->b:LB0/D;

    .line 304
    .line 305
    invoke-virtual {v0}, LP/o;->W()V

    .line 306
    .line 307
    .line 308
    iget-boolean v8, v0, LP/o;->O:Z

    .line 309
    .line 310
    if-eqz v8, :cond_e

    .line 311
    .line 312
    invoke-virtual {v0, v7}, LP/o;->l(LB5/a;)V

    .line 313
    .line 314
    .line 315
    goto :goto_b

    .line 316
    :cond_e
    invoke-virtual {v0}, LP/o;->g0()V

    .line 317
    .line 318
    .line 319
    :goto_b
    sget-object v7, LB0/j;->e:LB0/i;

    .line 320
    .line 321
    invoke-static {v7, v0, v3}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    sget-object v3, LB0/j;->d:LB0/i;

    .line 325
    .line 326
    invoke-static {v3, v0, v6}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    sget-object v3, LB0/j;->f:LB0/i;

    .line 330
    .line 331
    iget-boolean v6, v0, LP/o;->O:Z

    .line 332
    .line 333
    if-nez v6, :cond_f

    .line 334
    .line 335
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v6

    .line 339
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 340
    .line 341
    .line 342
    move-result-object v7

    .line 343
    invoke-static {v6, v7}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result v6

    .line 347
    if-nez v6, :cond_10

    .line 348
    .line 349
    :cond_f
    invoke-static {v4, v0, v4, v3}, Lk1/i;->o(ILP/o;ILB0/i;)V

    .line 350
    .line 351
    .line 352
    :cond_10
    sget-object v3, LB0/j;->c:LB0/i;

    .line 353
    .line 354
    invoke-static {v3, v0, v2}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    if-eqz v5, :cond_11

    .line 358
    .line 359
    iget-wide v2, v10, LM/u;->b:J

    .line 360
    .line 361
    goto :goto_c

    .line 362
    :cond_11
    iget-wide v2, v10, LM/u;->d:J

    .line 363
    .line 364
    :goto_c
    sget-object v4, LM/q;->a:LP/z;

    .line 365
    .line 366
    new-instance v6, Lj0/o;

    .line 367
    .line 368
    invoke-direct {v6, v2, v3}, Lj0/o;-><init>(J)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v4, v6}, LP/z;->a(Ljava/lang/Object;)LP/m0;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    const/16 v3, 0x38

    .line 376
    .line 377
    move-object/from16 v7, p4

    .line 378
    .line 379
    invoke-static {v2, v7, v0, v3}, LP/b;->a(LP/m0;LX/e;LP/o;I)V

    .line 380
    .line 381
    .line 382
    const/4 v13, 0x1

    .line 383
    invoke-virtual {v0, v13}, LP/o;->p(Z)V

    .line 384
    .line 385
    .line 386
    move-object v4, v1

    .line 387
    move-object v6, v10

    .line 388
    :goto_d
    invoke-virtual {v0}, LP/o;->r()LP/o0;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    if-eqz v0, :cond_12

    .line 393
    .line 394
    new-instance v2, LM/v;

    .line 395
    .line 396
    move-object/from16 v3, p0

    .line 397
    .line 398
    move/from16 v8, p6

    .line 399
    .line 400
    move/from16 v9, p7

    .line 401
    .line 402
    invoke-direct/range {v2 .. v9}, LM/v;-><init>(LB5/a;Lc0/m;ZLM/u;LX/e;II)V

    .line 403
    .line 404
    .line 405
    iput-object v2, v0, LP/o0;->d:LB5/e;

    .line 406
    .line 407
    :cond_12
    return-void
.end method

.method public static final d(LB5/a;LM/h0;Lu/c;LX/e;LP/o;I)V
    .locals 23

    .line 1
    move-object/from16 v3, p2

    .line 2
    .line 3
    move-object/from16 v7, p4

    .line 4
    .line 5
    move/from16 v10, p5

    .line 6
    .line 7
    const v0, 0x4acd0b82    # 6718913.0f

    .line 8
    .line 9
    .line 10
    invoke-virtual {v7, v0}, LP/o;->U(I)LP/o;

    .line 11
    .line 12
    .line 13
    and-int/lit8 v0, v10, 0x6

    .line 14
    .line 15
    move-object/from16 v1, p0

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v7, v1}, LP/o;->i(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x2

    .line 28
    :goto_0
    or-int/2addr v0, v10

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v0, v10

    .line 31
    :goto_1
    and-int/lit8 v2, v10, 0x30

    .line 32
    .line 33
    const/16 v12, 0x20

    .line 34
    .line 35
    if-nez v2, :cond_3

    .line 36
    .line 37
    move-object/from16 v2, p1

    .line 38
    .line 39
    invoke-virtual {v7, v2}, LP/o;->g(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    move v4, v12

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v4, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr v0, v4

    .line 50
    goto :goto_3

    .line 51
    :cond_3
    move-object/from16 v2, p1

    .line 52
    .line 53
    :goto_3
    and-int/lit16 v4, v10, 0x180

    .line 54
    .line 55
    if-nez v4, :cond_6

    .line 56
    .line 57
    and-int/lit16 v4, v10, 0x200

    .line 58
    .line 59
    if-nez v4, :cond_4

    .line 60
    .line 61
    invoke-virtual {v7, v3}, LP/o;->g(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    goto :goto_4

    .line 66
    :cond_4
    invoke-virtual {v7, v3}, LP/o;->i(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    :goto_4
    if-eqz v4, :cond_5

    .line 71
    .line 72
    const/16 v4, 0x100

    .line 73
    .line 74
    goto :goto_5

    .line 75
    :cond_5
    const/16 v4, 0x80

    .line 76
    .line 77
    :goto_5
    or-int/2addr v0, v4

    .line 78
    :cond_6
    and-int/lit16 v4, v10, 0xc00

    .line 79
    .line 80
    move-object/from16 v13, p3

    .line 81
    .line 82
    if-nez v4, :cond_8

    .line 83
    .line 84
    invoke-virtual {v7, v13}, LP/o;->i(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-eqz v4, :cond_7

    .line 89
    .line 90
    const/16 v4, 0x800

    .line 91
    .line 92
    goto :goto_6

    .line 93
    :cond_7
    const/16 v4, 0x400

    .line 94
    .line 95
    :goto_6
    or-int/2addr v0, v4

    .line 96
    :cond_8
    move v14, v0

    .line 97
    and-int/lit16 v0, v14, 0x493

    .line 98
    .line 99
    const/16 v4, 0x492

    .line 100
    .line 101
    if-ne v0, v4, :cond_a

    .line 102
    .line 103
    invoke-virtual {v7}, LP/o;->x()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-nez v0, :cond_9

    .line 108
    .line 109
    goto :goto_7

    .line 110
    :cond_9
    invoke-virtual {v7}, LP/o;->N()V

    .line 111
    .line 112
    .line 113
    move-object v15, v7

    .line 114
    goto/16 :goto_e

    .line 115
    .line 116
    :cond_a
    :goto_7
    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:LP/T0;

    .line 117
    .line 118
    invoke-virtual {v7, v0}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    check-cast v0, Landroid/view/View;

    .line 123
    .line 124
    sget-object v4, LC0/t0;->h:LP/T0;

    .line 125
    .line 126
    invoke-virtual {v7, v4}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    move-object v15, v4

    .line 131
    check-cast v15, LW0/c;

    .line 132
    .line 133
    sget-object v4, LC0/t0;->n:LP/T0;

    .line 134
    .line 135
    invoke-virtual {v7, v4}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    move-object/from16 v16, v4

    .line 140
    .line 141
    check-cast v16, LW0/l;

    .line 142
    .line 143
    invoke-static {v7}, LP/b;->s(LP/o;)LP/m;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-static/range {p3 .. p4}, LP/b;->t(Ljava/lang/Object;LP/o;)LP/W;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    const/4 v6, 0x0

    .line 152
    move-object v8, v4

    .line 153
    new-array v4, v6, [Ljava/lang/Object;

    .line 154
    .line 155
    move v9, v6

    .line 156
    sget-object v6, LM/j;->x:LM/j;

    .line 157
    .line 158
    move-object/from16 v17, v8

    .line 159
    .line 160
    const/16 v8, 0xc00

    .line 161
    .line 162
    move/from16 v18, v9

    .line 163
    .line 164
    const/4 v9, 0x6

    .line 165
    move-object/from16 v19, v5

    .line 166
    .line 167
    const/4 v5, 0x0

    .line 168
    move-object/from16 v11, v17

    .line 169
    .line 170
    move-object/from16 v20, v19

    .line 171
    .line 172
    invoke-static/range {v4 .. v9}, Lcom/google/android/gms/internal/measurement/P1;->P([Ljava/lang/Object;LZ/l;LB5/a;LP/o;II)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    move-object v5, v7

    .line 177
    move-object v6, v4

    .line 178
    check-cast v6, Ljava/util/UUID;

    .line 179
    .line 180
    invoke-virtual {v5}, LP/o;->H()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    sget-object v7, LP/k;->a:LP/S;

    .line 185
    .line 186
    if-ne v4, v7, :cond_b

    .line 187
    .line 188
    invoke-static {v5}, LP/b;->k(LP/o;)LM5/w;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    new-instance v8, LP/x;

    .line 193
    .line 194
    invoke-direct {v8, v4}, LP/x;-><init>(LM5/w;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v5, v8}, LP/o;->d0(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    move-object v4, v8

    .line 201
    :cond_b
    check-cast v4, LP/x;

    .line 202
    .line 203
    iget-object v8, v4, LP/x;->q:LM5/w;

    .line 204
    .line 205
    sget-object v4, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:LP/z;

    .line 206
    .line 207
    invoke-virtual {v5, v4}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    check-cast v4, Landroid/content/res/Configuration;

    .line 212
    .line 213
    iget v4, v4, Landroid/content/res/Configuration;->uiMode:I

    .line 214
    .line 215
    and-int/lit8 v4, v4, 0x30

    .line 216
    .line 217
    const/4 v9, 0x1

    .line 218
    if-ne v4, v12, :cond_c

    .line 219
    .line 220
    move v4, v9

    .line 221
    goto :goto_8

    .line 222
    :cond_c
    move v4, v9

    .line 223
    move/from16 v9, v18

    .line 224
    .line 225
    :goto_8
    invoke-virtual {v5, v0}, LP/o;->g(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v19

    .line 229
    invoke-virtual {v5, v15}, LP/o;->g(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v21

    .line 233
    or-int v19, v19, v21

    .line 234
    .line 235
    invoke-virtual {v5}, LP/o;->H()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    if-nez v19, :cond_d

    .line 240
    .line 241
    if-ne v4, v7, :cond_e

    .line 242
    .line 243
    :cond_d
    move-object v3, v0

    .line 244
    goto :goto_9

    .line 245
    :cond_e
    move-object v0, v4

    .line 246
    move-object v15, v5

    .line 247
    move-object/from16 v22, v7

    .line 248
    .line 249
    move-object/from16 v4, v16

    .line 250
    .line 251
    const/4 v12, 0x1

    .line 252
    goto :goto_a

    .line 253
    :goto_9
    new-instance v0, LM/M;

    .line 254
    .line 255
    move-object v4, v15

    .line 256
    move-object v15, v5

    .line 257
    move-object v5, v4

    .line 258
    move-object/from16 v22, v7

    .line 259
    .line 260
    move-object/from16 v4, v16

    .line 261
    .line 262
    const/4 v12, 0x1

    .line 263
    move-object/from16 v7, p2

    .line 264
    .line 265
    invoke-direct/range {v0 .. v9}, LM/M;-><init>(LB5/a;LM/h0;Landroid/view/View;LW0/l;LW0/c;Ljava/util/UUID;Lu/c;LM5/w;Z)V

    .line 266
    .line 267
    .line 268
    new-instance v1, LM/i0;

    .line 269
    .line 270
    const/4 v2, 0x0

    .line 271
    move-object/from16 v3, v20

    .line 272
    .line 273
    invoke-direct {v1, v3, v2}, LM/i0;-><init>(LP/W;I)V

    .line 274
    .line 275
    .line 276
    new-instance v2, LX/e;

    .line 277
    .line 278
    const v3, -0x5d0a5e91

    .line 279
    .line 280
    .line 281
    invoke-direct {v2, v3, v12, v1}, LX/e;-><init>(IZLjava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    iget-object v1, v0, LM/M;->w:LM/K;

    .line 285
    .line 286
    invoke-virtual {v1, v11}, LC0/a;->setParentCompositionContext(LP/r;)V

    .line 287
    .line 288
    .line 289
    iget-object v3, v1, LM/K;->C:LP/f0;

    .line 290
    .line 291
    invoke-virtual {v3, v2}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    iput-boolean v12, v1, LM/K;->E:Z

    .line 295
    .line 296
    invoke-virtual {v1}, LC0/a;->d()V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v15, v0}, LP/o;->d0(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    :goto_a
    move-object v2, v0

    .line 303
    check-cast v2, LM/M;

    .line 304
    .line 305
    invoke-virtual {v15, v2}, LP/o;->i(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    invoke-virtual {v15}, LP/o;->H()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    if-nez v0, :cond_f

    .line 314
    .line 315
    move-object/from16 v0, v22

    .line 316
    .line 317
    if-ne v1, v0, :cond_10

    .line 318
    .line 319
    goto :goto_b

    .line 320
    :cond_f
    move-object/from16 v0, v22

    .line 321
    .line 322
    :goto_b
    new-instance v1, LM/L;

    .line 323
    .line 324
    const/4 v3, 0x1

    .line 325
    invoke-direct {v1, v2, v3}, LM/L;-><init>(LM/M;I)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v15, v1}, LP/o;->d0(Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    :cond_10
    check-cast v1, LB5/c;

    .line 332
    .line 333
    invoke-static {v2, v1, v15}, LP/b;->c(Ljava/lang/Object;LB5/c;LP/o;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v15, v2}, LP/o;->i(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    move-result v1

    .line 340
    and-int/lit8 v3, v14, 0xe

    .line 341
    .line 342
    const/4 v5, 0x4

    .line 343
    if-ne v3, v5, :cond_11

    .line 344
    .line 345
    move v6, v12

    .line 346
    goto :goto_c

    .line 347
    :cond_11
    move/from16 v6, v18

    .line 348
    .line 349
    :goto_c
    or-int/2addr v1, v6

    .line 350
    and-int/lit8 v3, v14, 0x70

    .line 351
    .line 352
    const/16 v5, 0x20

    .line 353
    .line 354
    if-ne v3, v5, :cond_12

    .line 355
    .line 356
    move v6, v12

    .line 357
    goto :goto_d

    .line 358
    :cond_12
    move/from16 v6, v18

    .line 359
    .line 360
    :goto_d
    or-int/2addr v1, v6

    .line 361
    invoke-virtual {v15, v4}, LP/o;->g(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    move-result v3

    .line 365
    or-int/2addr v1, v3

    .line 366
    invoke-virtual {v15}, LP/o;->H()Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v3

    .line 370
    if-nez v1, :cond_13

    .line 371
    .line 372
    if-ne v3, v0, :cond_14

    .line 373
    .line 374
    :cond_13
    new-instance v1, LM/S;

    .line 375
    .line 376
    const/4 v6, 0x1

    .line 377
    move-object/from16 v3, p0

    .line 378
    .line 379
    move-object v5, v4

    .line 380
    move-object/from16 v4, p1

    .line 381
    .line 382
    invoke-direct/range {v1 .. v6}, LM/S;-><init>(Lb/m;LB5/a;Ljava/lang/Object;LW0/l;I)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v15, v1}, LP/o;->d0(Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    move-object v3, v1

    .line 389
    :cond_14
    check-cast v3, LB5/a;

    .line 390
    .line 391
    invoke-static {v3, v15}, LP/b;->g(LB5/a;LP/o;)V

    .line 392
    .line 393
    .line 394
    :goto_e
    invoke-virtual {v15}, LP/o;->r()LP/o0;

    .line 395
    .line 396
    .line 397
    move-result-object v7

    .line 398
    if-eqz v7, :cond_15

    .line 399
    .line 400
    new-instance v0, LM/z;

    .line 401
    .line 402
    const/4 v6, 0x1

    .line 403
    move-object/from16 v1, p0

    .line 404
    .line 405
    move-object/from16 v2, p1

    .line 406
    .line 407
    move-object/from16 v3, p2

    .line 408
    .line 409
    move v5, v10

    .line 410
    move-object v4, v13

    .line 411
    invoke-direct/range {v0 .. v6}, LM/z;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LX/e;II)V

    .line 412
    .line 413
    .line 414
    iput-object v0, v7, LP/o0;->d:LB5/e;

    .line 415
    .line 416
    :cond_15
    return-void
.end method

.method public static e(IF)LM/f;
    .locals 7

    .line 1
    and-int/lit8 p0, p0, 0x1

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    sget p1, LO/f;->a:F

    .line 6
    .line 7
    :cond_0
    move v1, p1

    .line 8
    sget v2, LO/f;->h:F

    .line 9
    .line 10
    sget v3, LO/f;->f:F

    .line 11
    .line 12
    sget v4, LO/f;->g:F

    .line 13
    .line 14
    sget v5, LO/f;->e:F

    .line 15
    .line 16
    sget v6, LO/f;->c:F

    .line 17
    .line 18
    new-instance v0, LM/f;

    .line 19
    .line 20
    invoke-direct/range {v0 .. v6}, LM/f;-><init>(FFFFFF)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public static final f(LM/J0;LP/o;)LM/I0;
    .locals 3

    .line 1
    sget-object v0, LM/d;->r:LM/d;

    .line 2
    .line 3
    const/16 v1, 0xc00

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-static {v0, p0, p1, v1, v2}, LM/G0;->a(LB5/c;LM/J0;LP/o;II)LM/I0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
