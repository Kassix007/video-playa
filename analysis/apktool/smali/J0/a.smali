.class public final LJ0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LE/Y;

.field public final b:LJ0/b;

.field public final c:Lr/C;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:LC0/z;

.field public h:J

.field public final i:LA0/d;

.field public final j:Li0/a;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LE/Y;

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v0, v1, v2}, LE/Y;-><init>(IB)V

    .line 9
    .line 10
    .line 11
    const/16 v1, 0xc0

    .line 12
    .line 13
    new-array v2, v1, [J

    .line 14
    .line 15
    iput-object v2, v0, LE/Y;->c:Ljava/lang/Object;

    .line 16
    .line 17
    new-array v1, v1, [J

    .line 18
    .line 19
    iput-object v1, v0, LE/Y;->d:Ljava/lang/Object;

    .line 20
    .line 21
    iput-object v0, p0, LJ0/a;->a:LE/Y;

    .line 22
    .line 23
    new-instance v0, LJ0/b;

    .line 24
    .line 25
    invoke-direct {v0}, LJ0/b;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, LJ0/a;->b:LJ0/b;

    .line 29
    .line 30
    new-instance v0, Lr/C;

    .line 31
    .line 32
    invoke-direct {v0}, Lr/C;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, LJ0/a;->c:Lr/C;

    .line 36
    .line 37
    const-wide/16 v0, -0x1

    .line 38
    .line 39
    iput-wide v0, p0, LJ0/a;->h:J

    .line 40
    .line 41
    new-instance v0, LA0/d;

    .line 42
    .line 43
    const/4 v1, 0x4

    .line 44
    invoke-direct {v0, v1, p0}, LA0/d;-><init>(ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, LJ0/a;->i:LA0/d;

    .line 48
    .line 49
    new-instance v0, Li0/a;

    .line 50
    .line 51
    invoke-direct {v0}, Li0/a;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object v0, p0, LJ0/a;->j:Li0/a;

    .line 55
    .line 56
    return-void
.end method

.method public static g(LB0/L;)J
    .locals 6

    .line 1
    iget-object p0, p0, LB0/L;->U:LB0/g0;

    .line 2
    .line 3
    iget-object v0, p0, LB0/g0;->c:LB0/n0;

    .line 4
    .line 5
    iget-object p0, p0, LB0/g0;->b:LB0/v;

    .line 6
    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    :cond_0
    :goto_0
    if-eqz p0, :cond_3

    .line 10
    .line 11
    if-eq p0, v0, :cond_3

    .line 12
    .line 13
    iget-object v3, p0, LB0/n0;->V:LB0/s0;

    .line 14
    .line 15
    iget-wide v4, p0, LB0/n0;->M:J

    .line 16
    .line 17
    invoke-static {v1, v2, v4, v5}, Lcom/google/android/gms/internal/measurement/K1;->H(JJ)J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    iget-object p0, p0, LB0/n0;->D:LB0/n0;

    .line 22
    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    invoke-interface {v3}, LB0/s0;->getUnderlyingMatrix-sQKQjiQ()[F

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-static {v3}, Ln5/A;->i([F)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    const/4 v5, 0x3

    .line 34
    if-ne v4, v5, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    and-int/lit8 v4, v4, 0x2

    .line 38
    .line 39
    if-nez v4, :cond_2

    .line 40
    .line 41
    const-wide v0, 0x7fffffff7fffffffL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    return-wide v0

    .line 47
    :cond_2
    invoke-static {v3, v1, v2}, Lj0/B;->o([FJ)J

    .line 48
    .line 49
    .line 50
    move-result-wide v1

    .line 51
    goto :goto_0

    .line 52
    :cond_3
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/K1;->K(J)J

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    return-wide v0
.end method


# virtual methods
.method public final a()V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lc0/a;->a:Landroid/os/Handler;

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    iget-boolean v3, v0, LJ0/a;->d:Z

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    const/4 v5, 0x0

    .line 13
    if-nez v3, :cond_1

    .line 14
    .line 15
    iget-boolean v6, v0, LJ0/a;->e:Z

    .line 16
    .line 17
    if-eqz v6, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v6, v5

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    :goto_0
    move v6, v4

    .line 23
    :goto_1
    iget-object v7, v0, LJ0/a;->a:LE/Y;

    .line 24
    .line 25
    iget-object v8, v0, LJ0/a;->b:LJ0/b;

    .line 26
    .line 27
    if-eqz v3, :cond_6

    .line 28
    .line 29
    iput-boolean v5, v0, LJ0/a;->d:Z

    .line 30
    .line 31
    iget-object v3, v0, LJ0/a;->c:Lr/C;

    .line 32
    .line 33
    iget-object v9, v3, Lr/C;->a:[Ljava/lang/Object;

    .line 34
    .line 35
    iget v3, v3, Lr/C;->b:I

    .line 36
    .line 37
    move v10, v5

    .line 38
    :goto_2
    if-ge v10, v3, :cond_2

    .line 39
    .line 40
    aget-object v11, v9, v10

    .line 41
    .line 42
    check-cast v11, LB5/a;

    .line 43
    .line 44
    invoke-interface {v11}, LB5/a;->invoke()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    add-int/lit8 v10, v10, 0x1

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    iget-object v3, v7, LE/Y;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v3, [J

    .line 53
    .line 54
    iget v9, v7, LE/Y;->b:I

    .line 55
    .line 56
    move v10, v5

    .line 57
    :goto_3
    array-length v11, v3

    .line 58
    add-int/lit8 v11, v11, -0x2

    .line 59
    .line 60
    if-ge v10, v11, :cond_5

    .line 61
    .line 62
    if-ge v10, v9, :cond_5

    .line 63
    .line 64
    add-int/lit8 v11, v10, 0x2

    .line 65
    .line 66
    aget-wide v11, v3, v11

    .line 67
    .line 68
    const/16 v13, 0x3d

    .line 69
    .line 70
    shr-long v13, v11, v13

    .line 71
    .line 72
    long-to-int v13, v13

    .line 73
    and-int/2addr v13, v4

    .line 74
    if-eqz v13, :cond_4

    .line 75
    .line 76
    aget-wide v13, v3, v10

    .line 77
    .line 78
    add-int/lit8 v13, v10, 0x1

    .line 79
    .line 80
    aget-wide v13, v3, v13

    .line 81
    .line 82
    long-to-int v11, v11

    .line 83
    const v12, 0x3ffffff

    .line 84
    .line 85
    .line 86
    and-int/2addr v11, v12

    .line 87
    iget-object v12, v8, LJ0/b;->a:Lr/v;

    .line 88
    .line 89
    invoke-virtual {v12, v11}, Lr/k;->b(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v11

    .line 93
    if-nez v11, :cond_3

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_3
    new-instance v1, Ljava/lang/ClassCastException;

    .line 97
    .line 98
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 99
    .line 100
    .line 101
    throw v1

    .line 102
    :cond_4
    :goto_4
    add-int/lit8 v10, v10, 0x3

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_5
    iget-object v3, v7, LE/Y;->c:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v3, [J

    .line 108
    .line 109
    iget v4, v7, LE/Y;->b:I

    .line 110
    .line 111
    move v9, v5

    .line 112
    :goto_5
    array-length v10, v3

    .line 113
    add-int/lit8 v10, v10, -0x2

    .line 114
    .line 115
    if-ge v9, v10, :cond_6

    .line 116
    .line 117
    if-ge v9, v4, :cond_6

    .line 118
    .line 119
    add-int/lit8 v10, v9, 0x2

    .line 120
    .line 121
    aget-wide v11, v3, v10

    .line 122
    .line 123
    const-wide v13, -0x2000000000000001L    # -2.681561585988519E154

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    and-long/2addr v11, v13

    .line 129
    aput-wide v11, v3, v10

    .line 130
    .line 131
    add-int/lit8 v9, v9, 0x3

    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_6
    iget-boolean v3, v0, LJ0/a;->e:Z

    .line 135
    .line 136
    const/16 v13, 0x8

    .line 137
    .line 138
    if-eqz v3, :cond_b

    .line 139
    .line 140
    iput-boolean v5, v0, LJ0/a;->e:Z

    .line 141
    .line 142
    iget-object v3, v8, LJ0/b;->a:Lr/v;

    .line 143
    .line 144
    const/16 v16, 0x7

    .line 145
    .line 146
    iget-object v4, v3, Lr/k;->c:[Ljava/lang/Object;

    .line 147
    .line 148
    iget-object v3, v3, Lr/k;->a:[J

    .line 149
    .line 150
    const-wide/16 v17, 0x80

    .line 151
    .line 152
    array-length v9, v3

    .line 153
    add-int/lit8 v9, v9, -0x2

    .line 154
    .line 155
    if-ltz v9, :cond_c

    .line 156
    .line 157
    move v10, v5

    .line 158
    const-wide/16 v19, 0xff

    .line 159
    .line 160
    :goto_6
    aget-wide v11, v3, v10

    .line 161
    .line 162
    const-wide v21, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    not-long v14, v11

    .line 168
    shl-long v14, v14, v16

    .line 169
    .line 170
    and-long/2addr v14, v11

    .line 171
    and-long v14, v14, v21

    .line 172
    .line 173
    cmp-long v14, v14, v21

    .line 174
    .line 175
    if-eqz v14, :cond_a

    .line 176
    .line 177
    sub-int v14, v10, v9

    .line 178
    .line 179
    not-int v14, v14

    .line 180
    ushr-int/lit8 v14, v14, 0x1f

    .line 181
    .line 182
    rsub-int/lit8 v14, v14, 0x8

    .line 183
    .line 184
    move v15, v5

    .line 185
    :goto_7
    if-ge v15, v14, :cond_9

    .line 186
    .line 187
    and-long v23, v11, v19

    .line 188
    .line 189
    cmp-long v23, v23, v17

    .line 190
    .line 191
    if-gez v23, :cond_8

    .line 192
    .line 193
    shl-int/lit8 v23, v10, 0x3

    .line 194
    .line 195
    add-int v23, v23, v15

    .line 196
    .line 197
    aget-object v23, v4, v23

    .line 198
    .line 199
    if-nez v23, :cond_7

    .line 200
    .line 201
    goto :goto_8

    .line 202
    :cond_7
    new-instance v1, Ljava/lang/ClassCastException;

    .line 203
    .line 204
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 205
    .line 206
    .line 207
    throw v1

    .line 208
    :cond_8
    :goto_8
    shr-long/2addr v11, v13

    .line 209
    add-int/lit8 v15, v15, 0x1

    .line 210
    .line 211
    goto :goto_7

    .line 212
    :cond_9
    if-ne v14, v13, :cond_d

    .line 213
    .line 214
    :cond_a
    if-eq v10, v9, :cond_d

    .line 215
    .line 216
    add-int/lit8 v10, v10, 0x1

    .line 217
    .line 218
    goto :goto_6

    .line 219
    :cond_b
    const/16 v16, 0x7

    .line 220
    .line 221
    const-wide/16 v17, 0x80

    .line 222
    .line 223
    :cond_c
    const-wide/16 v19, 0xff

    .line 224
    .line 225
    const-wide v21, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    :cond_d
    if-eqz v6, :cond_e

    .line 231
    .line 232
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    :cond_e
    iget-boolean v3, v0, LJ0/a;->f:Z

    .line 236
    .line 237
    if-eqz v3, :cond_11

    .line 238
    .line 239
    iput-boolean v5, v0, LJ0/a;->f:Z

    .line 240
    .line 241
    iget-object v3, v7, LE/Y;->c:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v3, [J

    .line 244
    .line 245
    iget v4, v7, LE/Y;->b:I

    .line 246
    .line 247
    iget-object v6, v7, LE/Y;->d:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v6, [J

    .line 250
    .line 251
    move v9, v5

    .line 252
    move v10, v9

    .line 253
    :goto_9
    array-length v11, v3

    .line 254
    add-int/lit8 v11, v11, -0x2

    .line 255
    .line 256
    if-ge v9, v11, :cond_10

    .line 257
    .line 258
    array-length v11, v6

    .line 259
    add-int/lit8 v11, v11, -0x2

    .line 260
    .line 261
    if-ge v10, v11, :cond_10

    .line 262
    .line 263
    if-ge v9, v4, :cond_10

    .line 264
    .line 265
    add-int/lit8 v11, v9, 0x2

    .line 266
    .line 267
    aget-wide v14, v3, v11

    .line 268
    .line 269
    const-wide v23, 0x1fffffffffffffffL

    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    cmp-long v12, v14, v23

    .line 275
    .line 276
    if-eqz v12, :cond_f

    .line 277
    .line 278
    aget-wide v14, v3, v9

    .line 279
    .line 280
    aput-wide v14, v6, v10

    .line 281
    .line 282
    add-int/lit8 v12, v10, 0x1

    .line 283
    .line 284
    add-int/lit8 v14, v9, 0x1

    .line 285
    .line 286
    aget-wide v14, v3, v14

    .line 287
    .line 288
    aput-wide v14, v6, v12

    .line 289
    .line 290
    add-int/lit8 v12, v10, 0x2

    .line 291
    .line 292
    aget-wide v14, v3, v11

    .line 293
    .line 294
    aput-wide v14, v6, v12

    .line 295
    .line 296
    add-int/lit8 v10, v10, 0x3

    .line 297
    .line 298
    :cond_f
    add-int/lit8 v9, v9, 0x3

    .line 299
    .line 300
    goto :goto_9

    .line 301
    :cond_10
    iput v10, v7, LE/Y;->b:I

    .line 302
    .line 303
    iput-object v6, v7, LE/Y;->c:Ljava/lang/Object;

    .line 304
    .line 305
    iput-object v3, v7, LE/Y;->d:Ljava/lang/Object;

    .line 306
    .line 307
    :cond_11
    iget-wide v3, v8, LJ0/b;->b:J

    .line 308
    .line 309
    cmp-long v1, v3, v1

    .line 310
    .line 311
    if-lez v1, :cond_12

    .line 312
    .line 313
    return-void

    .line 314
    :cond_12
    iget-object v1, v8, LJ0/b;->a:Lr/v;

    .line 315
    .line 316
    iget-object v2, v1, Lr/k;->c:[Ljava/lang/Object;

    .line 317
    .line 318
    iget-object v1, v1, Lr/k;->a:[J

    .line 319
    .line 320
    array-length v3, v1

    .line 321
    add-int/lit8 v3, v3, -0x2

    .line 322
    .line 323
    if-ltz v3, :cond_17

    .line 324
    .line 325
    move v4, v5

    .line 326
    :goto_a
    aget-wide v6, v1, v4

    .line 327
    .line 328
    not-long v9, v6

    .line 329
    shl-long v9, v9, v16

    .line 330
    .line 331
    and-long/2addr v9, v6

    .line 332
    and-long v9, v9, v21

    .line 333
    .line 334
    cmp-long v9, v9, v21

    .line 335
    .line 336
    if-eqz v9, :cond_16

    .line 337
    .line 338
    sub-int v9, v4, v3

    .line 339
    .line 340
    not-int v9, v9

    .line 341
    ushr-int/lit8 v9, v9, 0x1f

    .line 342
    .line 343
    rsub-int/lit8 v9, v9, 0x8

    .line 344
    .line 345
    move v10, v5

    .line 346
    :goto_b
    if-ge v10, v9, :cond_15

    .line 347
    .line 348
    and-long v11, v6, v19

    .line 349
    .line 350
    cmp-long v11, v11, v17

    .line 351
    .line 352
    if-gez v11, :cond_14

    .line 353
    .line 354
    shl-int/lit8 v11, v4, 0x3

    .line 355
    .line 356
    add-int/2addr v11, v10

    .line 357
    aget-object v11, v2, v11

    .line 358
    .line 359
    if-nez v11, :cond_13

    .line 360
    .line 361
    goto :goto_c

    .line 362
    :cond_13
    new-instance v1, Ljava/lang/ClassCastException;

    .line 363
    .line 364
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 365
    .line 366
    .line 367
    throw v1

    .line 368
    :cond_14
    :goto_c
    shr-long/2addr v6, v13

    .line 369
    add-int/lit8 v10, v10, 0x1

    .line 370
    .line 371
    goto :goto_b

    .line 372
    :cond_15
    if-ne v9, v13, :cond_17

    .line 373
    .line 374
    :cond_16
    if-eq v4, v3, :cond_17

    .line 375
    .line 376
    add-int/lit8 v4, v4, 0x1

    .line 377
    .line 378
    goto :goto_a

    .line 379
    :cond_17
    const-wide/16 v1, -0x1

    .line 380
    .line 381
    iput-wide v1, v8, LJ0/b;->b:J

    .line 382
    .line 383
    return-void
.end method

.method public final b(LB0/L;JZ)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, LB0/L;->U:LB0/g0;

    .line 6
    .line 7
    iget-object v2, v2, LB0/g0;->c:LB0/n0;

    .line 8
    .line 9
    iget-object v3, v1, LB0/L;->V:LB0/P;

    .line 10
    .line 11
    iget-object v3, v3, LB0/P;->p:LB0/c0;

    .line 12
    .line 13
    invoke-virtual {v3}, LB0/c0;->N()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    invoke-virtual {v3}, LB0/c0;->K()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/16 v5, 0x20

    .line 22
    .line 23
    shr-long v6, p2, v5

    .line 24
    .line 25
    long-to-int v6, v6

    .line 26
    int-to-float v7, v6

    .line 27
    const-wide v8, 0xffffffffL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    and-long v10, p2, v8

    .line 33
    .line 34
    long-to-int v10, v10

    .line 35
    int-to-float v11, v10

    .line 36
    add-int/2addr v6, v4

    .line 37
    int-to-float v4, v6

    .line 38
    add-int/2addr v10, v3

    .line 39
    int-to-float v3, v10

    .line 40
    iget-object v6, v0, LJ0/a;->j:Li0/a;

    .line 41
    .line 42
    iput v7, v6, Li0/a;->b:F

    .line 43
    .line 44
    iput v11, v6, Li0/a;->c:F

    .line 45
    .line 46
    iput v4, v6, Li0/a;->d:F

    .line 47
    .line 48
    iput v3, v6, Li0/a;->e:F

    .line 49
    .line 50
    :cond_0
    :goto_0
    if-eqz v2, :cond_1

    .line 51
    .line 52
    iget-object v3, v2, LB0/n0;->V:LB0/s0;

    .line 53
    .line 54
    iget-wide v10, v2, LB0/n0;->M:J

    .line 55
    .line 56
    shr-long v12, v10, v5

    .line 57
    .line 58
    long-to-int v4, v12

    .line 59
    int-to-float v4, v4

    .line 60
    and-long/2addr v10, v8

    .line 61
    long-to-int v7, v10

    .line 62
    int-to-float v7, v7

    .line 63
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    int-to-long v10, v4

    .line 68
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    int-to-long v12, v4

    .line 73
    shl-long/2addr v10, v5

    .line 74
    and-long/2addr v12, v8

    .line 75
    or-long/2addr v10, v12

    .line 76
    shr-long v12, v10, v5

    .line 77
    .line 78
    long-to-int v4, v12

    .line 79
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    and-long/2addr v10, v8

    .line 84
    long-to-int v7, v10

    .line 85
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    iget v10, v6, Li0/a;->b:F

    .line 90
    .line 91
    add-float/2addr v10, v4

    .line 92
    iput v10, v6, Li0/a;->b:F

    .line 93
    .line 94
    iget v10, v6, Li0/a;->c:F

    .line 95
    .line 96
    add-float/2addr v10, v7

    .line 97
    iput v10, v6, Li0/a;->c:F

    .line 98
    .line 99
    iget v10, v6, Li0/a;->d:F

    .line 100
    .line 101
    add-float/2addr v10, v4

    .line 102
    iput v10, v6, Li0/a;->d:F

    .line 103
    .line 104
    iget v4, v6, Li0/a;->e:F

    .line 105
    .line 106
    add-float/2addr v4, v7

    .line 107
    iput v4, v6, Li0/a;->e:F

    .line 108
    .line 109
    iget-object v2, v2, LB0/n0;->D:LB0/n0;

    .line 110
    .line 111
    if-eqz v3, :cond_0

    .line 112
    .line 113
    invoke-interface {v3}, LB0/s0;->getUnderlyingMatrix-sQKQjiQ()[F

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-static {v3}, Lj0/B;->m([F)Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-nez v4, :cond_0

    .line 122
    .line 123
    invoke-static {v3, v6}, Lj0/B;->p([FLi0/a;)V

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_1
    iget v2, v6, Li0/a;->b:F

    .line 128
    .line 129
    float-to-int v12, v2

    .line 130
    iget v2, v6, Li0/a;->c:F

    .line 131
    .line 132
    float-to-int v13, v2

    .line 133
    iget v2, v6, Li0/a;->d:F

    .line 134
    .line 135
    float-to-int v14, v2

    .line 136
    iget v2, v6, Li0/a;->e:F

    .line 137
    .line 138
    float-to-int v15, v2

    .line 139
    iget v11, v1, LB0/L;->r:I

    .line 140
    .line 141
    iget-object v10, v0, LJ0/a;->a:LE/Y;

    .line 142
    .line 143
    if-nez p4, :cond_3

    .line 144
    .line 145
    const v3, 0x3ffffff

    .line 146
    .line 147
    .line 148
    and-int v4, v11, v3

    .line 149
    .line 150
    iget-object v6, v10, LE/Y;->c:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v6, [J

    .line 153
    .line 154
    iget v7, v10, LE/Y;->b:I

    .line 155
    .line 156
    const/16 v16, 0x0

    .line 157
    .line 158
    move/from16 p2, v3

    .line 159
    .line 160
    move/from16 v3, v16

    .line 161
    .line 162
    move/from16 v16, v5

    .line 163
    .line 164
    :goto_1
    array-length v5, v6

    .line 165
    add-int/lit8 v5, v5, -0x2

    .line 166
    .line 167
    if-ge v3, v5, :cond_3

    .line 168
    .line 169
    if-ge v3, v7, :cond_3

    .line 170
    .line 171
    add-int/lit8 v5, v3, 0x2

    .line 172
    .line 173
    move-wide/from16 v17, v8

    .line 174
    .line 175
    aget-wide v8, v6, v5

    .line 176
    .line 177
    const/16 p3, 0x1

    .line 178
    .line 179
    long-to-int v2, v8

    .line 180
    and-int v2, v2, p2

    .line 181
    .line 182
    if-ne v2, v4, :cond_2

    .line 183
    .line 184
    int-to-long v1, v12

    .line 185
    shl-long v1, v1, v16

    .line 186
    .line 187
    int-to-long v10, v13

    .line 188
    and-long v10, v10, v17

    .line 189
    .line 190
    or-long/2addr v1, v10

    .line 191
    aput-wide v1, v6, v3

    .line 192
    .line 193
    add-int/lit8 v3, v3, 0x1

    .line 194
    .line 195
    int-to-long v1, v14

    .line 196
    shl-long v1, v1, v16

    .line 197
    .line 198
    int-to-long v10, v15

    .line 199
    and-long v10, v10, v17

    .line 200
    .line 201
    or-long/2addr v1, v10

    .line 202
    aput-wide v1, v6, v3

    .line 203
    .line 204
    const-wide/high16 v1, 0x2000000000000000L

    .line 205
    .line 206
    or-long/2addr v1, v8

    .line 207
    aput-wide v1, v6, v5

    .line 208
    .line 209
    :goto_2
    move/from16 v1, p3

    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_2
    add-int/lit8 v3, v3, 0x3

    .line 213
    .line 214
    move-wide/from16 v8, v17

    .line 215
    .line 216
    goto :goto_1

    .line 217
    :cond_3
    const/16 p3, 0x1

    .line 218
    .line 219
    invoke-virtual {v1}, LB0/L;->s()LB0/L;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    if-eqz v1, :cond_4

    .line 224
    .line 225
    iget v1, v1, LB0/L;->r:I

    .line 226
    .line 227
    :goto_3
    move/from16 v16, v1

    .line 228
    .line 229
    goto :goto_4

    .line 230
    :cond_4
    const/4 v1, -0x1

    .line 231
    goto :goto_3

    .line 232
    :goto_4
    invoke-static/range {v10 .. v16}, LE/Y;->j(LE/Y;IIIIII)V

    .line 233
    .line 234
    .line 235
    goto :goto_2

    .line 236
    :goto_5
    iput-boolean v1, v0, LJ0/a;->d:Z

    .line 237
    .line 238
    return-void
.end method

.method public final c(LB0/L;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, LB0/L;->w()LR/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p1, LR/e;->q:[Ljava/lang/Object;

    .line 6
    .line 7
    iget p1, p1, LR/e;->s:I

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    move v2, v1

    .line 11
    :goto_0
    if-ge v2, p1, :cond_0

    .line 12
    .line 13
    aget-object v3, v0, v2

    .line 14
    .line 15
    check-cast v3, LB0/L;

    .line 16
    .line 17
    iget-object v4, v3, LB0/L;->U:LB0/g0;

    .line 18
    .line 19
    iget-object v4, v4, LB0/g0;->c:LB0/n0;

    .line 20
    .line 21
    iget-wide v4, v4, LB0/n0;->M:J

    .line 22
    .line 23
    invoke-virtual {p0, v3, v4, v5, v1}, LJ0/a;->b(LB0/L;JZ)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v3}, LJ0/a;->c(LB0/L;)V

    .line 27
    .line 28
    .line 29
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void
.end method

.method public final d(LB0/L;)V
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LJ0/a;->d:Z

    .line 3
    .line 4
    iget p1, p1, LB0/L;->r:I

    .line 5
    .line 6
    const v1, 0x3ffffff

    .line 7
    .line 8
    .line 9
    and-int/2addr p1, v1

    .line 10
    iget-object v2, p0, LJ0/a;->a:LE/Y;

    .line 11
    .line 12
    iget-object v3, v2, LE/Y;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, [J

    .line 15
    .line 16
    iget v2, v2, LE/Y;->b:I

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    move v5, v4

    .line 20
    :goto_0
    array-length v6, v3

    .line 21
    add-int/lit8 v6, v6, -0x2

    .line 22
    .line 23
    if-ge v5, v6, :cond_1

    .line 24
    .line 25
    if-ge v5, v2, :cond_1

    .line 26
    .line 27
    add-int/lit8 v6, v5, 0x2

    .line 28
    .line 29
    aget-wide v7, v3, v6

    .line 30
    .line 31
    long-to-int v9, v7

    .line 32
    and-int/2addr v9, v1

    .line 33
    if-ne v9, p1, :cond_0

    .line 34
    .line 35
    const-wide/high16 v1, 0x2000000000000000L

    .line 36
    .line 37
    or-long/2addr v1, v7

    .line 38
    aput-wide v1, v3, v6

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    add-int/lit8 v5, v5, 0x3

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    :goto_1
    iget-object p1, p0, LJ0/a;->g:LC0/z;

    .line 45
    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    move v0, v4

    .line 50
    :goto_2
    iget-object v1, p0, LJ0/a;->b:LJ0/b;

    .line 51
    .line 52
    iget-wide v1, v1, LJ0/b;->b:J

    .line 53
    .line 54
    const-wide/16 v3, 0x0

    .line 55
    .line 56
    cmp-long v3, v1, v3

    .line 57
    .line 58
    if-gez v3, :cond_3

    .line 59
    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_3
    iget-wide v3, p0, LJ0/a;->h:J

    .line 64
    .line 65
    cmp-long v3, v3, v1

    .line 66
    .line 67
    if-nez v3, :cond_4

    .line 68
    .line 69
    if-eqz v0, :cond_4

    .line 70
    .line 71
    :goto_3
    return-void

    .line 72
    :cond_4
    if-eqz p1, :cond_5

    .line 73
    .line 74
    sget-object v0, Lc0/a;->a:Landroid/os/Handler;

    .line 75
    .line 76
    sget-object v0, Lc0/a;->a:Landroid/os/Handler;

    .line 77
    .line 78
    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 79
    .line 80
    .line 81
    :cond_5
    sget-object p1, Lc0/a;->a:Landroid/os/Handler;

    .line 82
    .line 83
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 84
    .line 85
    .line 86
    move-result-wide v3

    .line 87
    const/16 p1, 0x10

    .line 88
    .line 89
    int-to-long v5, p1

    .line 90
    add-long/2addr v5, v3

    .line 91
    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 92
    .line 93
    .line 94
    move-result-wide v0

    .line 95
    iput-wide v0, p0, LJ0/a;->h:J

    .line 96
    .line 97
    sub-long/2addr v0, v3

    .line 98
    new-instance p1, LC0/z;

    .line 99
    .line 100
    iget-object v2, p0, LJ0/a;->i:LA0/d;

    .line 101
    .line 102
    const/4 v3, 0x3

    .line 103
    invoke-direct {p1, v2, v3}, LC0/z;-><init>(LB5/a;I)V

    .line 104
    .line 105
    .line 106
    sget-object v2, Lc0/a;->a:Landroid/os/Handler;

    .line 107
    .line 108
    invoke-virtual {v2, p1, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 109
    .line 110
    .line 111
    iput-object p1, p0, LJ0/a;->g:LC0/z;

    .line 112
    .line 113
    return-void
.end method

.method public final e(LB0/L;)V
    .locals 7

    .line 1
    invoke-static {p1}, LJ0/a;->g(LB0/L;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide v2, 0x7fffffff7fffffffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, v2, v3}, LW0/i;->a(JJ)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_1

    .line 15
    .line 16
    iput-wide v0, p1, LB0/L;->u:J

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p1, LB0/L;->v:Z

    .line 20
    .line 21
    invoke-virtual {p1}, LB0/L;->w()LR/e;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v2, v1, LR/e;->q:[Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v1, LR/e;->s:I

    .line 28
    .line 29
    move v3, v0

    .line 30
    :goto_0
    if-ge v3, v1, :cond_0

    .line 31
    .line 32
    aget-object v4, v2, v3

    .line 33
    .line 34
    check-cast v4, LB0/L;

    .line 35
    .line 36
    iget-object v5, v4, LB0/L;->U:LB0/g0;

    .line 37
    .line 38
    iget-object v5, v5, LB0/g0;->c:LB0/n0;

    .line 39
    .line 40
    iget-wide v5, v5, LB0/n0;->M:J

    .line 41
    .line 42
    invoke-virtual {p0, v4, v5, v6, v0}, LJ0/a;->f(LB0/L;JZ)V

    .line 43
    .line 44
    .line 45
    add-int/lit8 v3, v3, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {p0, p1}, LJ0/a;->d(LB0/L;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    invoke-virtual {p0, p1}, LJ0/a;->c(LB0/L;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final f(LB0/L;JZ)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, LB0/L;->V:LB0/P;

    .line 6
    .line 7
    iget-object v2, v2, LB0/P;->p:LB0/c0;

    .line 8
    .line 9
    invoke-virtual {v2}, LB0/c0;->N()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    invoke-virtual {v2}, LB0/c0;->K()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {v1}, LB0/L;->s()LB0/L;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    iget-wide v5, v1, LB0/L;->s:J

    .line 22
    .line 23
    iget-wide v7, v1, LB0/L;->t:J

    .line 24
    .line 25
    const/16 v9, 0x20

    .line 26
    .line 27
    shr-long v10, v7, v9

    .line 28
    .line 29
    long-to-int v10, v10

    .line 30
    const-wide v11, 0xffffffffL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    and-long/2addr v7, v11

    .line 36
    long-to-int v7, v7

    .line 37
    const-wide v13, 0x7fffffff7fffffffL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    const/4 v15, 0x0

    .line 43
    if-eqz v4, :cond_5

    .line 44
    .line 45
    move/from16 v16, v9

    .line 46
    .line 47
    iget-boolean v9, v4, LB0/L;->v:Z

    .line 48
    .line 49
    move-wide/from16 v17, v11

    .line 50
    .line 51
    iget-wide v11, v4, LB0/L;->s:J

    .line 52
    .line 53
    move/from16 v20, v9

    .line 54
    .line 55
    iget-wide v8, v4, LB0/L;->u:J

    .line 56
    .line 57
    invoke-static {v11, v12, v13, v14}, LW0/i;->a(JJ)Z

    .line 58
    .line 59
    .line 60
    move-result v21

    .line 61
    if-nez v21, :cond_1

    .line 62
    .line 63
    if-eqz v20, :cond_0

    .line 64
    .line 65
    invoke-static {v4}, LJ0/a;->g(LB0/L;)J

    .line 66
    .line 67
    .line 68
    move-result-wide v8

    .line 69
    iput-wide v8, v4, LB0/L;->u:J

    .line 70
    .line 71
    iput-boolean v15, v4, LB0/L;->v:Z

    .line 72
    .line 73
    :cond_0
    invoke-static {v8, v9, v13, v14}, LW0/i;->a(JJ)Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    invoke-static {v11, v12, v8, v9}, LW0/i;->c(JJ)J

    .line 78
    .line 79
    .line 80
    move-result-wide v8

    .line 81
    move-wide/from16 v11, p2

    .line 82
    .line 83
    invoke-static {v8, v9, v11, v12}, LW0/i;->c(JJ)J

    .line 84
    .line 85
    .line 86
    move-result-wide v8

    .line 87
    move/from16 v20, v15

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_1
    move-wide/from16 v11, p2

    .line 91
    .line 92
    iget-object v4, v1, LB0/L;->U:LB0/g0;

    .line 93
    .line 94
    iget-object v4, v4, LB0/g0;->c:LB0/n0;

    .line 95
    .line 96
    const-wide/16 v8, 0x0

    .line 97
    .line 98
    :goto_0
    if-eqz v4, :cond_4

    .line 99
    .line 100
    move/from16 v20, v15

    .line 101
    .line 102
    iget-object v15, v4, LB0/n0;->V:LB0/s0;

    .line 103
    .line 104
    iget-wide v13, v4, LB0/n0;->M:J

    .line 105
    .line 106
    invoke-static {v8, v9, v13, v14}, Lcom/google/android/gms/internal/measurement/K1;->H(JJ)J

    .line 107
    .line 108
    .line 109
    move-result-wide v8

    .line 110
    iget-object v4, v4, LB0/n0;->D:LB0/n0;

    .line 111
    .line 112
    if-eqz v15, :cond_3

    .line 113
    .line 114
    invoke-interface {v15}, LB0/s0;->getUnderlyingMatrix-sQKQjiQ()[F

    .line 115
    .line 116
    .line 117
    move-result-object v13

    .line 118
    invoke-static {v13}, Ln5/A;->i([F)I

    .line 119
    .line 120
    .line 121
    move-result v14

    .line 122
    const/4 v15, 0x3

    .line 123
    if-eq v14, v15, :cond_3

    .line 124
    .line 125
    and-int/lit8 v14, v14, 0x2

    .line 126
    .line 127
    if-nez v14, :cond_2

    .line 128
    .line 129
    const-wide v8, 0x7fffffff7fffffffL

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_2
    invoke-static {v13, v8, v9}, Lj0/B;->o([FJ)J

    .line 136
    .line 137
    .line 138
    move-result-wide v8

    .line 139
    :cond_3
    move/from16 v15, v20

    .line 140
    .line 141
    const-wide v13, 0x7fffffff7fffffffL

    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_4
    move/from16 v20, v15

    .line 148
    .line 149
    invoke-static {v8, v9}, Lcom/google/android/gms/internal/measurement/K1;->K(J)J

    .line 150
    .line 151
    .line 152
    move-result-wide v8

    .line 153
    goto :goto_1

    .line 154
    :cond_5
    move/from16 v16, v9

    .line 155
    .line 156
    move-wide/from16 v17, v11

    .line 157
    .line 158
    move/from16 v20, v15

    .line 159
    .line 160
    move-wide/from16 v11, p2

    .line 161
    .line 162
    move-wide v8, v11

    .line 163
    :goto_1
    move/from16 v4, v20

    .line 164
    .line 165
    :goto_2
    if-nez v4, :cond_12

    .line 166
    .line 167
    const-wide v13, 0x7fffffff7fffffffL

    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    invoke-static {v8, v9, v13, v14}, LW0/i;->a(JJ)Z

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    if-eqz v4, :cond_6

    .line 177
    .line 178
    goto/16 :goto_e

    .line 179
    .line 180
    :cond_6
    iput-wide v8, v1, LB0/L;->s:J

    .line 181
    .line 182
    int-to-long v11, v3

    .line 183
    shl-long v11, v11, v16

    .line 184
    .line 185
    int-to-long v13, v2

    .line 186
    and-long v13, v13, v17

    .line 187
    .line 188
    or-long/2addr v11, v13

    .line 189
    iput-wide v11, v1, LB0/L;->t:J

    .line 190
    .line 191
    shr-long v11, v8, v16

    .line 192
    .line 193
    long-to-int v4, v11

    .line 194
    and-long v11, v8, v17

    .line 195
    .line 196
    long-to-int v11, v11

    .line 197
    add-int v12, v4, v3

    .line 198
    .line 199
    add-int v13, v11, v2

    .line 200
    .line 201
    if-nez p4, :cond_7

    .line 202
    .line 203
    invoke-static {v8, v9, v5, v6}, LW0/i;->a(JJ)Z

    .line 204
    .line 205
    .line 206
    move-result v5

    .line 207
    if-eqz v5, :cond_7

    .line 208
    .line 209
    if-ne v10, v3, :cond_7

    .line 210
    .line 211
    if-ne v7, v2, :cond_7

    .line 212
    .line 213
    return-void

    .line 214
    :cond_7
    iget v2, v1, LB0/L;->r:I

    .line 215
    .line 216
    iget-object v3, v0, LJ0/a;->a:LE/Y;

    .line 217
    .line 218
    if-nez p4, :cond_10

    .line 219
    .line 220
    const v6, 0x3ffffff

    .line 221
    .line 222
    .line 223
    and-int v7, v2, v6

    .line 224
    .line 225
    iget-object v8, v3, LE/Y;->c:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v8, [J

    .line 228
    .line 229
    iget v9, v3, LE/Y;->b:I

    .line 230
    .line 231
    move/from16 v10, v20

    .line 232
    .line 233
    :goto_3
    array-length v14, v8

    .line 234
    add-int/lit8 v14, v14, -0x2

    .line 235
    .line 236
    if-ge v10, v14, :cond_10

    .line 237
    .line 238
    if-ge v10, v9, :cond_10

    .line 239
    .line 240
    add-int/lit8 v14, v10, 0x2

    .line 241
    .line 242
    move/from16 p3, v6

    .line 243
    .line 244
    aget-wide v5, v8, v14

    .line 245
    .line 246
    long-to-int v15, v5

    .line 247
    and-int v15, v15, p3

    .line 248
    .line 249
    if-ne v15, v7, :cond_f

    .line 250
    .line 251
    aget-wide v1, v8, v10

    .line 252
    .line 253
    move-wide/from16 v21, v5

    .line 254
    .line 255
    int-to-long v5, v4

    .line 256
    shl-long v5, v5, v16

    .line 257
    .line 258
    move/from16 v23, v4

    .line 259
    .line 260
    move-wide/from16 v24, v5

    .line 261
    .line 262
    int-to-long v4, v11

    .line 263
    and-long v4, v4, v17

    .line 264
    .line 265
    or-long v4, v24, v4

    .line 266
    .line 267
    aput-wide v4, v8, v10

    .line 268
    .line 269
    add-int/lit8 v4, v10, 0x1

    .line 270
    .line 271
    int-to-long v5, v12

    .line 272
    shl-long v5, v5, v16

    .line 273
    .line 274
    int-to-long v12, v13

    .line 275
    and-long v12, v12, v17

    .line 276
    .line 277
    or-long/2addr v5, v12

    .line 278
    aput-wide v5, v8, v4

    .line 279
    .line 280
    const-wide/high16 v4, 0x2000000000000000L

    .line 281
    .line 282
    or-long v6, v21, v4

    .line 283
    .line 284
    aput-wide v6, v8, v14

    .line 285
    .line 286
    shr-long v6, v1, v16

    .line 287
    .line 288
    long-to-int v6, v6

    .line 289
    sub-int v6, v23, v6

    .line 290
    .line 291
    long-to-int v1, v1

    .line 292
    sub-int/2addr v11, v1

    .line 293
    if-eqz v6, :cond_8

    .line 294
    .line 295
    const/4 v1, 0x1

    .line 296
    goto :goto_4

    .line 297
    :cond_8
    move/from16 v1, v20

    .line 298
    .line 299
    :goto_4
    if-eqz v11, :cond_9

    .line 300
    .line 301
    const/4 v2, 0x1

    .line 302
    goto :goto_5

    .line 303
    :cond_9
    move/from16 v2, v20

    .line 304
    .line 305
    :goto_5
    or-int/2addr v1, v2

    .line 306
    if-eqz v1, :cond_e

    .line 307
    .line 308
    const/16 v19, 0x3

    .line 309
    .line 310
    add-int/lit8 v10, v10, 0x3

    .line 311
    .line 312
    const-wide v1, -0xffffffc000001L

    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    and-long v7, v21, v1

    .line 318
    .line 319
    and-int v9, v10, p3

    .line 320
    .line 321
    int-to-long v9, v9

    .line 322
    const/16 v12, 0x1a

    .line 323
    .line 324
    shl-long/2addr v9, v12

    .line 325
    or-long/2addr v7, v9

    .line 326
    iget-object v9, v3, LE/Y;->c:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v9, [J

    .line 329
    .line 330
    iget-object v10, v3, LE/Y;->d:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v10, [J

    .line 333
    .line 334
    iget v3, v3, LE/Y;->b:I

    .line 335
    .line 336
    const/16 v19, 0x3

    .line 337
    .line 338
    div-int/lit8 v3, v3, 0x3

    .line 339
    .line 340
    aput-wide v7, v10, v20

    .line 341
    .line 342
    const/4 v7, 0x1

    .line 343
    :goto_6
    if-lez v7, :cond_e

    .line 344
    .line 345
    add-int/lit8 v7, v7, -0x1

    .line 346
    .line 347
    aget-wide v13, v10, v7

    .line 348
    .line 349
    long-to-int v8, v13

    .line 350
    and-int v8, v8, p3

    .line 351
    .line 352
    move-wide/from16 v21, v1

    .line 353
    .line 354
    shr-long v1, v13, v12

    .line 355
    .line 356
    long-to-int v1, v1

    .line 357
    and-int v1, v1, p3

    .line 358
    .line 359
    const/16 v2, 0x34

    .line 360
    .line 361
    shr-long/2addr v13, v2

    .line 362
    long-to-int v13, v13

    .line 363
    const/16 v14, 0x1ff

    .line 364
    .line 365
    and-int/2addr v13, v14

    .line 366
    if-ne v13, v14, :cond_a

    .line 367
    .line 368
    move v13, v3

    .line 369
    goto :goto_7

    .line 370
    :cond_a
    add-int/2addr v13, v1

    .line 371
    :goto_7
    if-ltz v1, :cond_e

    .line 372
    .line 373
    :goto_8
    array-length v15, v9

    .line 374
    add-int/lit8 v15, v15, -0x2

    .line 375
    .line 376
    if-ge v1, v15, :cond_d

    .line 377
    .line 378
    if-ge v1, v13, :cond_d

    .line 379
    .line 380
    add-int/lit8 v15, v1, 0x2

    .line 381
    .line 382
    aget-wide v19, v9, v15

    .line 383
    .line 384
    move/from16 p4, v2

    .line 385
    .line 386
    move/from16 p1, v3

    .line 387
    .line 388
    shr-long v2, v19, v12

    .line 389
    .line 390
    long-to-int v2, v2

    .line 391
    and-int v2, v2, p3

    .line 392
    .line 393
    if-ne v2, v8, :cond_b

    .line 394
    .line 395
    aget-wide v2, v9, v1

    .line 396
    .line 397
    add-int/lit8 v23, v1, 0x1

    .line 398
    .line 399
    move-wide/from16 v24, v4

    .line 400
    .line 401
    aget-wide v4, v9, v23

    .line 402
    .line 403
    move/from16 v26, v12

    .line 404
    .line 405
    move/from16 v27, v13

    .line 406
    .line 407
    shr-long v12, v2, v16

    .line 408
    .line 409
    long-to-int v12, v12

    .line 410
    add-int/2addr v12, v6

    .line 411
    long-to-int v2, v2

    .line 412
    add-int/2addr v2, v11

    .line 413
    int-to-long v12, v12

    .line 414
    shl-long v12, v12, v16

    .line 415
    .line 416
    int-to-long v2, v2

    .line 417
    and-long v2, v2, v17

    .line 418
    .line 419
    or-long/2addr v2, v12

    .line 420
    aput-wide v2, v9, v1

    .line 421
    .line 422
    shr-long v2, v4, v16

    .line 423
    .line 424
    long-to-int v2, v2

    .line 425
    add-int/2addr v2, v6

    .line 426
    long-to-int v3, v4

    .line 427
    add-int/2addr v3, v11

    .line 428
    int-to-long v4, v2

    .line 429
    shl-long v4, v4, v16

    .line 430
    .line 431
    int-to-long v2, v3

    .line 432
    and-long v2, v2, v17

    .line 433
    .line 434
    or-long/2addr v2, v4

    .line 435
    aput-wide v2, v9, v23

    .line 436
    .line 437
    or-long v2, v19, v24

    .line 438
    .line 439
    aput-wide v2, v9, v15

    .line 440
    .line 441
    shr-long v2, v19, p4

    .line 442
    .line 443
    long-to-int v2, v2

    .line 444
    and-int/2addr v2, v14

    .line 445
    if-lez v2, :cond_c

    .line 446
    .line 447
    add-int/lit8 v2, v7, 0x1

    .line 448
    .line 449
    add-int/lit8 v3, v1, 0x3

    .line 450
    .line 451
    and-long v4, v19, v21

    .line 452
    .line 453
    and-int v3, v3, p3

    .line 454
    .line 455
    int-to-long v12, v3

    .line 456
    shl-long v12, v12, v26

    .line 457
    .line 458
    or-long v3, v4, v12

    .line 459
    .line 460
    aput-wide v3, v10, v7

    .line 461
    .line 462
    move v7, v2

    .line 463
    goto :goto_9

    .line 464
    :cond_b
    move-wide/from16 v24, v4

    .line 465
    .line 466
    move/from16 v26, v12

    .line 467
    .line 468
    move/from16 v27, v13

    .line 469
    .line 470
    :cond_c
    :goto_9
    add-int/lit8 v1, v1, 0x3

    .line 471
    .line 472
    move/from16 v3, p1

    .line 473
    .line 474
    move/from16 v2, p4

    .line 475
    .line 476
    move-wide/from16 v4, v24

    .line 477
    .line 478
    move/from16 v12, v26

    .line 479
    .line 480
    move/from16 v13, v27

    .line 481
    .line 482
    goto :goto_8

    .line 483
    :cond_d
    move/from16 p1, v3

    .line 484
    .line 485
    move-wide/from16 v24, v4

    .line 486
    .line 487
    move/from16 v26, v12

    .line 488
    .line 489
    move/from16 v3, p1

    .line 490
    .line 491
    move-wide/from16 v1, v21

    .line 492
    .line 493
    move-wide/from16 v4, v24

    .line 494
    .line 495
    move/from16 v12, v26

    .line 496
    .line 497
    goto/16 :goto_6

    .line 498
    .line 499
    :cond_e
    :goto_a
    const/4 v1, 0x1

    .line 500
    goto :goto_d

    .line 501
    :cond_f
    move/from16 v23, v4

    .line 502
    .line 503
    const/16 v19, 0x3

    .line 504
    .line 505
    add-int/lit8 v10, v10, 0x3

    .line 506
    .line 507
    move/from16 v6, p3

    .line 508
    .line 509
    goto/16 :goto_3

    .line 510
    .line 511
    :cond_10
    move/from16 v23, v4

    .line 512
    .line 513
    invoke-virtual {v1}, LB0/L;->s()LB0/L;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    if-eqz v1, :cond_11

    .line 518
    .line 519
    iget v1, v1, LB0/L;->r:I

    .line 520
    .line 521
    :goto_b
    move/from16 v27, v1

    .line 522
    .line 523
    move/from16 v22, v2

    .line 524
    .line 525
    move-object/from16 v21, v3

    .line 526
    .line 527
    move/from16 v24, v11

    .line 528
    .line 529
    move/from16 v25, v12

    .line 530
    .line 531
    move/from16 v26, v13

    .line 532
    .line 533
    goto :goto_c

    .line 534
    :cond_11
    const/4 v1, -0x1

    .line 535
    goto :goto_b

    .line 536
    :goto_c
    invoke-static/range {v21 .. v27}, LE/Y;->j(LE/Y;IIIIII)V

    .line 537
    .line 538
    .line 539
    goto :goto_a

    .line 540
    :goto_d
    iput-boolean v1, v0, LJ0/a;->d:Z

    .line 541
    .line 542
    return-void

    .line 543
    :cond_12
    :goto_e
    invoke-virtual/range {p0 .. p4}, LJ0/a;->b(LB0/L;JZ)V

    .line 544
    .line 545
    .line 546
    return-void
.end method

.method public final h(LB0/L;)V
    .locals 8

    .line 1
    iget p1, p1, LB0/L;->r:I

    .line 2
    .line 3
    const v0, 0x3ffffff

    .line 4
    .line 5
    .line 6
    and-int/2addr p1, v0

    .line 7
    iget-object v1, p0, LJ0/a;->a:LE/Y;

    .line 8
    .line 9
    iget-object v2, v1, LE/Y;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, [J

    .line 12
    .line 13
    iget v1, v1, LE/Y;->b:I

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    :goto_0
    array-length v4, v2

    .line 17
    add-int/lit8 v4, v4, -0x2

    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    if-ge v3, v4, :cond_1

    .line 21
    .line 22
    if-ge v3, v1, :cond_1

    .line 23
    .line 24
    add-int/lit8 v4, v3, 0x2

    .line 25
    .line 26
    aget-wide v6, v2, v4

    .line 27
    .line 28
    long-to-int v6, v6

    .line 29
    and-int/2addr v6, v0

    .line 30
    if-ne v6, p1, :cond_0

    .line 31
    .line 32
    const-wide/16 v0, -0x1

    .line 33
    .line 34
    aput-wide v0, v2, v3

    .line 35
    .line 36
    add-int/2addr v3, v5

    .line 37
    aput-wide v0, v2, v3

    .line 38
    .line 39
    const-wide v0, 0x1fffffffffffffffL

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    aput-wide v0, v2, v4

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    add-int/lit8 v3, v3, 0x3

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    :goto_1
    iput-boolean v5, p0, LJ0/a;->d:Z

    .line 51
    .line 52
    iput-boolean v5, p0, LJ0/a;->f:Z

    .line 53
    .line 54
    return-void
.end method
