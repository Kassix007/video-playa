.class public abstract LM/q0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:Lc0/m;

.field public static final c:F

.field public static final d:F

.field public static final e:F

.field public static final f:Lu/t;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    sput v0, LM/q0;->a:F

    .line 5
    .line 6
    sget-object v1, LM/m0;->q:LM/m0;

    .line 7
    .line 8
    invoke-static {v1}, Landroidx/compose/ui/layout/a;->a(LB5/f;)Lc0/m;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sget-object v2, LM/d;->u:LM/d;

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    invoke-static {v1, v3, v2}, LI0/j;->a(Lc0/m;ZLB5/c;)Lc0/m;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-static {v1, v2, v0, v3}, Landroidx/compose/foundation/layout/b;->c(Lc0/m;FFI)Lc0/m;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, LM/q0;->b:Lc0/m;

    .line 25
    .line 26
    const/16 v0, 0xf0

    .line 27
    .line 28
    int-to-float v0, v0

    .line 29
    sput v0, LM/q0;->c:F

    .line 30
    .line 31
    sget v0, LO/i;->c:F

    .line 32
    .line 33
    sput v0, LM/q0;->d:F

    .line 34
    .line 35
    sget v1, LO/i;->d:F

    .line 36
    .line 37
    const/4 v3, 0x2

    .line 38
    int-to-float v3, v3

    .line 39
    mul-float/2addr v0, v3

    .line 40
    sub-float/2addr v1, v0

    .line 41
    sput v1, LM/q0;->e:F

    .line 42
    .line 43
    new-instance v0, Lu/t;

    .line 44
    .line 45
    const v1, 0x3e4ccccd    # 0.2f

    .line 46
    .line 47
    .line 48
    const v3, 0x3f4ccccd    # 0.8f

    .line 49
    .line 50
    .line 51
    invoke-direct {v0, v1, v2, v3}, Lu/t;-><init>(FFF)V

    .line 52
    .line 53
    .line 54
    new-instance v0, Lu/t;

    .line 55
    .line 56
    const v3, 0x3ecccccd    # 0.4f

    .line 57
    .line 58
    .line 59
    const/high16 v4, 0x3f800000    # 1.0f

    .line 60
    .line 61
    invoke-direct {v0, v3, v2, v4}, Lu/t;-><init>(FFF)V

    .line 62
    .line 63
    .line 64
    new-instance v0, Lu/t;

    .line 65
    .line 66
    const v4, 0x3f266666    # 0.65f

    .line 67
    .line 68
    .line 69
    invoke-direct {v0, v2, v2, v4}, Lu/t;-><init>(FFF)V

    .line 70
    .line 71
    .line 72
    new-instance v0, Lu/t;

    .line 73
    .line 74
    const v4, 0x3dcccccd    # 0.1f

    .line 75
    .line 76
    .line 77
    const v5, 0x3ee66666    # 0.45f

    .line 78
    .line 79
    .line 80
    invoke-direct {v0, v4, v2, v5}, Lu/t;-><init>(FFF)V

    .line 81
    .line 82
    .line 83
    new-instance v0, Lu/t;

    .line 84
    .line 85
    invoke-direct {v0, v3, v2, v1}, Lu/t;-><init>(FFF)V

    .line 86
    .line 87
    .line 88
    sput-object v0, LM/q0;->f:Lu/t;

    .line 89
    .line 90
    return-void
.end method

.method public static final a(Lc0/m;JFJILP/o;I)V
    .locals 22

    .line 1
    move-wide/from16 v9, p1

    .line 2
    .line 3
    move-wide/from16 v1, p4

    .line 4
    .line 5
    move-object/from16 v0, p7

    .line 6
    .line 7
    const/high16 v3, 0x43910000    # 290.0f

    .line 8
    .line 9
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    const/4 v5, 0x0

    .line 14
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    const v6, -0x6e80f9f

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v6}, LP/o;->U(I)LP/o;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v9, v10}, LP/o;->f(J)Z

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    if-eqz v6, :cond_0

    .line 29
    .line 30
    const/16 v6, 0x20

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/16 v6, 0x10

    .line 34
    .line 35
    :goto_0
    or-int v6, p8, v6

    .line 36
    .line 37
    invoke-virtual {v0, v1, v2}, LP/o;->f(J)Z

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    const/16 v11, 0x800

    .line 42
    .line 43
    if-eqz v8, :cond_1

    .line 44
    .line 45
    move v8, v11

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const/16 v8, 0x400

    .line 48
    .line 49
    :goto_1
    or-int/2addr v6, v8

    .line 50
    move/from16 v15, p6

    .line 51
    .line 52
    invoke-virtual {v0, v15}, LP/o;->e(I)Z

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    if-eqz v8, :cond_2

    .line 57
    .line 58
    const/16 v8, 0x4000

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    const/16 v8, 0x2000

    .line 62
    .line 63
    :goto_2
    or-int/2addr v6, v8

    .line 64
    and-int/lit16 v8, v6, 0x2493

    .line 65
    .line 66
    const/16 v12, 0x2492

    .line 67
    .line 68
    if-ne v8, v12, :cond_4

    .line 69
    .line 70
    invoke-virtual {v0}, LP/o;->x()Z

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    if-nez v8, :cond_3

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_3
    invoke-virtual {v0}, LP/o;->N()V

    .line 78
    .line 79
    .line 80
    move-object/from16 v13, p0

    .line 81
    .line 82
    move-object v11, v0

    .line 83
    goto/16 :goto_9

    .line 84
    .line 85
    :cond_4
    :goto_3
    invoke-virtual {v0}, LP/o;->P()V

    .line 86
    .line 87
    .line 88
    and-int/lit8 v8, p8, 0x1

    .line 89
    .line 90
    if-eqz v8, :cond_6

    .line 91
    .line 92
    invoke-virtual {v0}, LP/o;->w()Z

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    if-eqz v8, :cond_5

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_5
    invoke-virtual {v0}, LP/o;->N()V

    .line 100
    .line 101
    .line 102
    :cond_6
    :goto_4
    invoke-virtual {v0}, LP/o;->q()V

    .line 103
    .line 104
    .line 105
    sget-object v8, LC0/t0;->h:LP/T0;

    .line 106
    .line 107
    invoke-virtual {v0, v8}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    check-cast v8, LW0/c;

    .line 112
    .line 113
    new-instance v12, Ll0/g;

    .line 114
    .line 115
    move/from16 v13, p3

    .line 116
    .line 117
    invoke-interface {v8, v13}, LW0/c;->u(F)F

    .line 118
    .line 119
    .line 120
    move-result v8

    .line 121
    const/16 v16, 0x0

    .line 122
    .line 123
    const/16 v17, 0x1a

    .line 124
    .line 125
    const/4 v14, 0x0

    .line 126
    move v13, v8

    .line 127
    invoke-direct/range {v12 .. v17}, Ll0/g;-><init>(FFIII)V

    .line 128
    .line 129
    .line 130
    move-object v8, v12

    .line 131
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v12

    .line 135
    sget-object v13, LP/k;->a:LP/S;

    .line 136
    .line 137
    if-ne v12, v13, :cond_7

    .line 138
    .line 139
    new-instance v12, Lu/H;

    .line 140
    .line 141
    invoke-direct {v12}, Lu/H;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v12}, LP/o;->d0(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    :cond_7
    check-cast v12, Lu/H;

    .line 148
    .line 149
    const/4 v14, 0x0

    .line 150
    invoke-virtual {v12, v14, v0}, Lu/H;->a(ILP/o;)V

    .line 151
    .line 152
    .line 153
    move v15, v11

    .line 154
    move-object v11, v12

    .line 155
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 156
    .line 157
    .line 158
    move-result-object v12

    .line 159
    const/16 v16, 0x5

    .line 160
    .line 161
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 162
    .line 163
    .line 164
    move-result-object v16

    .line 165
    move/from16 v17, v14

    .line 166
    .line 167
    sget-object v14, Lu/A0;->b:LZ/m;

    .line 168
    .line 169
    sget-object v7, Lu/y;->b:LC0/Z0;

    .line 170
    .line 171
    const/16 v15, 0x1a04

    .line 172
    .line 173
    const/4 v3, 0x2

    .line 174
    invoke-static {v15, v3, v7}, Lu/d;->p(IILu/x;)Lu/z0;

    .line 175
    .line 176
    .line 177
    move-result-object v15

    .line 178
    invoke-static {v15}, Lu/d;->n(Lu/w;)Lu/D;

    .line 179
    .line 180
    .line 181
    move-result-object v15

    .line 182
    move/from16 v19, v17

    .line 183
    .line 184
    const v17, 0x81b8

    .line 185
    .line 186
    .line 187
    const/16 v20, 0x800

    .line 188
    .line 189
    const/16 v18, 0x10

    .line 190
    .line 191
    move-object/from16 v21, v13

    .line 192
    .line 193
    move-object/from16 v13, v16

    .line 194
    .line 195
    move-object/from16 v16, v0

    .line 196
    .line 197
    move/from16 v0, v19

    .line 198
    .line 199
    invoke-static/range {v11 .. v18}, Lu/d;->i(Lu/H;Ljava/lang/Number;Ljava/lang/Number;LZ/m;Lu/D;LP/o;II)Lu/E;

    .line 200
    .line 201
    .line 202
    move-result-object v12

    .line 203
    move-object v13, v11

    .line 204
    move-object/from16 v11, v16

    .line 205
    .line 206
    const/16 v14, 0x534

    .line 207
    .line 208
    invoke-static {v14, v3, v7}, Lu/d;->p(IILu/x;)Lu/z0;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-static {v3}, Lu/d;->n(Lu/w;)Lu/D;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    const/high16 v7, 0x438f0000    # 286.0f

    .line 217
    .line 218
    invoke-static {v13, v7, v3, v11}, Lu/d;->f(Lu/H;FLu/D;LP/o;)Lu/E;

    .line 219
    .line 220
    .line 221
    move-result-object v7

    .line 222
    new-instance v3, Lu/J;

    .line 223
    .line 224
    new-instance v15, LU/l;

    .line 225
    .line 226
    const/4 v0, 0x7

    .line 227
    invoke-direct {v15, v0}, LU/l;-><init>(I)V

    .line 228
    .line 229
    .line 230
    iput v14, v15, LU/l;->q:I

    .line 231
    .line 232
    const/4 v0, 0x0

    .line 233
    invoke-virtual {v15, v5, v0}, LU/l;->d(Ljava/lang/Float;I)Lu/I;

    .line 234
    .line 235
    .line 236
    move-result-object v14

    .line 237
    sget-object v0, LM/q0;->f:Lu/t;

    .line 238
    .line 239
    iput-object v0, v14, Lu/I;->b:Lu/x;

    .line 240
    .line 241
    const/16 v14, 0x29a

    .line 242
    .line 243
    invoke-virtual {v15, v4, v14}, LU/l;->d(Ljava/lang/Float;I)Lu/I;

    .line 244
    .line 245
    .line 246
    invoke-direct {v3, v15}, Lu/J;-><init>(LU/l;)V

    .line 247
    .line 248
    .line 249
    invoke-static {v3}, Lu/d;->n(Lu/w;)Lu/D;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    const/high16 v15, 0x43910000    # 290.0f

    .line 254
    .line 255
    invoke-static {v13, v15, v3, v11}, Lu/d;->f(Lu/H;FLu/D;LP/o;)Lu/E;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    new-instance v15, Lu/J;

    .line 260
    .line 261
    new-instance v14, LU/l;

    .line 262
    .line 263
    const/4 v9, 0x7

    .line 264
    invoke-direct {v14, v9}, LU/l;-><init>(I)V

    .line 265
    .line 266
    .line 267
    const/16 v9, 0x534

    .line 268
    .line 269
    iput v9, v14, LU/l;->q:I

    .line 270
    .line 271
    const/16 v9, 0x29a

    .line 272
    .line 273
    invoke-virtual {v14, v5, v9}, LU/l;->d(Ljava/lang/Float;I)Lu/I;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    iput-object v0, v5, Lu/I;->b:Lu/x;

    .line 278
    .line 279
    iget v0, v14, LU/l;->q:I

    .line 280
    .line 281
    invoke-virtual {v14, v4, v0}, LU/l;->d(Ljava/lang/Float;I)Lu/I;

    .line 282
    .line 283
    .line 284
    invoke-direct {v15, v14}, Lu/J;-><init>(LU/l;)V

    .line 285
    .line 286
    .line 287
    invoke-static {v15}, Lu/d;->n(Lu/w;)Lu/D;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    const/high16 v15, 0x43910000    # 290.0f

    .line 292
    .line 293
    invoke-static {v13, v15, v0, v11}, Lu/d;->f(Lu/H;FLu/D;LP/o;)Lu/E;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    sget-object v4, Lv/r;->u:Lv/r;

    .line 298
    .line 299
    const/4 v14, 0x1

    .line 300
    move-object/from16 v13, p0

    .line 301
    .line 302
    invoke-static {v13, v14, v4}, LI0/j;->a(Lc0/m;ZLB5/c;)Lc0/m;

    .line 303
    .line 304
    .line 305
    move-result-object v4

    .line 306
    sget v5, LM/q0;->e:F

    .line 307
    .line 308
    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/c;->c(Lc0/m;F)Lc0/m;

    .line 309
    .line 310
    .line 311
    move-result-object v15

    .line 312
    and-int/lit16 v4, v6, 0x1c00

    .line 313
    .line 314
    xor-int/lit16 v4, v4, 0xc00

    .line 315
    .line 316
    const/16 v5, 0x800

    .line 317
    .line 318
    if-le v4, v5, :cond_8

    .line 319
    .line 320
    invoke-virtual {v11, v1, v2}, LP/o;->f(J)Z

    .line 321
    .line 322
    .line 323
    move-result v4

    .line 324
    if-nez v4, :cond_9

    .line 325
    .line 326
    :cond_8
    and-int/lit16 v4, v6, 0xc00

    .line 327
    .line 328
    if-ne v4, v5, :cond_a

    .line 329
    .line 330
    :cond_9
    move v4, v14

    .line 331
    goto :goto_5

    .line 332
    :cond_a
    const/4 v4, 0x0

    .line 333
    :goto_5
    invoke-virtual {v11, v8}, LP/o;->i(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v5

    .line 337
    or-int/2addr v4, v5

    .line 338
    invoke-virtual {v11, v12}, LP/o;->g(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result v5

    .line 342
    or-int/2addr v4, v5

    .line 343
    invoke-virtual {v11, v3}, LP/o;->g(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result v5

    .line 347
    or-int/2addr v4, v5

    .line 348
    invoke-virtual {v11, v0}, LP/o;->g(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result v5

    .line 352
    or-int/2addr v4, v5

    .line 353
    invoke-virtual {v11, v7}, LP/o;->g(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    move-result v5

    .line 357
    or-int/2addr v4, v5

    .line 358
    and-int/lit8 v5, v6, 0x70

    .line 359
    .line 360
    xor-int/lit8 v5, v5, 0x30

    .line 361
    .line 362
    const/16 v9, 0x20

    .line 363
    .line 364
    move-object/from16 v16, v15

    .line 365
    .line 366
    move-wide/from16 v14, p1

    .line 367
    .line 368
    if-le v5, v9, :cond_b

    .line 369
    .line 370
    invoke-virtual {v11, v14, v15}, LP/o;->f(J)Z

    .line 371
    .line 372
    .line 373
    move-result v10

    .line 374
    if-nez v10, :cond_c

    .line 375
    .line 376
    :cond_b
    and-int/lit8 v6, v6, 0x30

    .line 377
    .line 378
    if-ne v6, v9, :cond_d

    .line 379
    .line 380
    :cond_c
    const/4 v5, 0x1

    .line 381
    goto :goto_6

    .line 382
    :cond_d
    const/4 v5, 0x0

    .line 383
    :goto_6
    or-int/2addr v4, v5

    .line 384
    invoke-virtual {v11}, LP/o;->H()Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v5

    .line 388
    if-nez v4, :cond_e

    .line 389
    .line 390
    move-object/from16 v4, v21

    .line 391
    .line 392
    if-ne v5, v4, :cond_f

    .line 393
    .line 394
    :cond_e
    move-object v6, v0

    .line 395
    goto :goto_7

    .line 396
    :cond_f
    const/4 v12, 0x0

    .line 397
    goto :goto_8

    .line 398
    :goto_7
    new-instance v0, LM/k0;

    .line 399
    .line 400
    move-object v5, v3

    .line 401
    move-object v3, v8

    .line 402
    move-object v4, v12

    .line 403
    move-wide v9, v14

    .line 404
    const/4 v12, 0x0

    .line 405
    move/from16 v8, p3

    .line 406
    .line 407
    invoke-direct/range {v0 .. v10}, LM/k0;-><init>(JLl0/g;Lu/E;Lu/E;Lu/E;Lu/E;FJ)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v11, v0}, LP/o;->d0(Ljava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    move-object v5, v0

    .line 414
    :goto_8
    check-cast v5, LB5/c;

    .line 415
    .line 416
    move-object/from16 v0, v16

    .line 417
    .line 418
    invoke-static {v0, v5, v11, v12}, Ln5/A;->b(Lc0/m;LB5/c;LP/o;I)V

    .line 419
    .line 420
    .line 421
    :goto_9
    invoke-virtual {v11}, LP/o;->r()LP/o0;

    .line 422
    .line 423
    .line 424
    move-result-object v9

    .line 425
    if-eqz v9, :cond_10

    .line 426
    .line 427
    new-instance v0, LM/l0;

    .line 428
    .line 429
    move-wide/from16 v2, p1

    .line 430
    .line 431
    move/from16 v4, p3

    .line 432
    .line 433
    move-wide/from16 v5, p4

    .line 434
    .line 435
    move/from16 v7, p6

    .line 436
    .line 437
    move/from16 v8, p8

    .line 438
    .line 439
    move-object v1, v13

    .line 440
    invoke-direct/range {v0 .. v8}, LM/l0;-><init>(Lc0/m;JFJII)V

    .line 441
    .line 442
    .line 443
    iput-object v0, v9, LP/o0;->d:LB5/e;

    .line 444
    .line 445
    :cond_10
    return-void
.end method

.method public static final b(LB5/a;Lc0/m;JJIFLB5/c;LP/o;I)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-wide/from16 v8, p2

    .line 4
    .line 5
    move-wide/from16 v5, p4

    .line 6
    .line 7
    move/from16 v7, p6

    .line 8
    .line 9
    move-object/from16 v0, p9

    .line 10
    .line 11
    const v2, -0x144387f6

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v2}, LP/o;->U(I)LP/o;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, LP/o;->i(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x4

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    move v2, v3

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v2, 0x2

    .line 27
    :goto_0
    or-int v2, p10, v2

    .line 28
    .line 29
    invoke-virtual {v0, v8, v9}, LP/o;->f(J)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    const/16 v10, 0x100

    .line 34
    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    move v4, v10

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const/16 v4, 0x80

    .line 40
    .line 41
    :goto_1
    or-int/2addr v2, v4

    .line 42
    invoke-virtual {v0, v5, v6}, LP/o;->f(J)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_2

    .line 47
    .line 48
    const/16 v4, 0x800

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const/16 v4, 0x400

    .line 52
    .line 53
    :goto_2
    or-int/2addr v2, v4

    .line 54
    invoke-virtual {v0, v7}, LP/o;->e(I)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    const/16 v12, 0x4000

    .line 59
    .line 60
    if-eqz v4, :cond_3

    .line 61
    .line 62
    move v4, v12

    .line 63
    goto :goto_3

    .line 64
    :cond_3
    const/16 v4, 0x2000

    .line 65
    .line 66
    :goto_3
    or-int/2addr v2, v4

    .line 67
    const/high16 v4, 0xb0000

    .line 68
    .line 69
    or-int/2addr v2, v4

    .line 70
    const v4, 0x92493

    .line 71
    .line 72
    .line 73
    and-int/2addr v4, v2

    .line 74
    const v13, 0x92492

    .line 75
    .line 76
    .line 77
    if-ne v4, v13, :cond_5

    .line 78
    .line 79
    invoke-virtual {v0}, LP/o;->x()Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-nez v4, :cond_4

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_4
    invoke-virtual {v0}, LP/o;->N()V

    .line 87
    .line 88
    .line 89
    move-object/from16 v11, p1

    .line 90
    .line 91
    move/from16 v8, p7

    .line 92
    .line 93
    move-object/from16 v9, p8

    .line 94
    .line 95
    goto/16 :goto_d

    .line 96
    .line 97
    :cond_5
    :goto_4
    invoke-virtual {v0}, LP/o;->P()V

    .line 98
    .line 99
    .line 100
    and-int/lit8 v4, p10, 0x1

    .line 101
    .line 102
    sget-object v15, LP/k;->a:LP/S;

    .line 103
    .line 104
    const v16, 0xe000

    .line 105
    .line 106
    .line 107
    const v17, -0x380001

    .line 108
    .line 109
    .line 110
    if-eqz v4, :cond_7

    .line 111
    .line 112
    invoke-virtual {v0}, LP/o;->w()Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-eqz v4, :cond_6

    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_6
    invoke-virtual {v0}, LP/o;->N()V

    .line 120
    .line 121
    .line 122
    and-int v2, v2, v17

    .line 123
    .line 124
    move/from16 v4, p7

    .line 125
    .line 126
    move-object/from16 v10, p8

    .line 127
    .line 128
    goto :goto_8

    .line 129
    :cond_7
    :goto_5
    sget v4, LM/j0;->b:F

    .line 130
    .line 131
    and-int/lit16 v13, v2, 0x380

    .line 132
    .line 133
    xor-int/lit16 v13, v13, 0x180

    .line 134
    .line 135
    if-le v13, v10, :cond_8

    .line 136
    .line 137
    invoke-virtual {v0, v8, v9}, LP/o;->f(J)Z

    .line 138
    .line 139
    .line 140
    move-result v13

    .line 141
    if-nez v13, :cond_9

    .line 142
    .line 143
    :cond_8
    and-int/lit16 v13, v2, 0x180

    .line 144
    .line 145
    if-ne v13, v10, :cond_a

    .line 146
    .line 147
    :cond_9
    const/4 v13, 0x1

    .line 148
    goto :goto_6

    .line 149
    :cond_a
    const/4 v13, 0x0

    .line 150
    :goto_6
    and-int v10, v2, v16

    .line 151
    .line 152
    if-ne v10, v12, :cond_b

    .line 153
    .line 154
    const/4 v10, 0x1

    .line 155
    goto :goto_7

    .line 156
    :cond_b
    const/4 v10, 0x0

    .line 157
    :goto_7
    or-int/2addr v10, v13

    .line 158
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v13

    .line 162
    if-nez v10, :cond_c

    .line 163
    .line 164
    if-ne v13, v15, :cond_d

    .line 165
    .line 166
    :cond_c
    new-instance v13, LM/n0;

    .line 167
    .line 168
    invoke-direct {v13, v8, v9, v7}, LM/n0;-><init>(JI)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v13}, LP/o;->d0(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    :cond_d
    move-object v10, v13

    .line 175
    check-cast v10, LB5/c;

    .line 176
    .line 177
    and-int v2, v2, v17

    .line 178
    .line 179
    :goto_8
    invoke-virtual {v0}, LP/o;->q()V

    .line 180
    .line 181
    .line 182
    and-int/lit8 v13, v2, 0xe

    .line 183
    .line 184
    if-ne v13, v3, :cond_e

    .line 185
    .line 186
    const/4 v3, 0x1

    .line 187
    goto :goto_9

    .line 188
    :cond_e
    const/4 v3, 0x0

    .line 189
    :goto_9
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v13

    .line 193
    if-nez v3, :cond_f

    .line 194
    .line 195
    if-ne v13, v15, :cond_10

    .line 196
    .line 197
    :cond_f
    new-instance v13, LF/Q;

    .line 198
    .line 199
    const/4 v3, 0x3

    .line 200
    invoke-direct {v13, v1, v3}, LF/Q;-><init>(LB5/a;I)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0, v13}, LP/o;->d0(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    :cond_10
    check-cast v13, LB5/a;

    .line 207
    .line 208
    sget-object v3, LM/q0;->b:Lc0/m;

    .line 209
    .line 210
    move-object/from16 v11, p1

    .line 211
    .line 212
    invoke-interface {v11, v3}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    invoke-virtual {v0, v13}, LP/o;->g(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v18

    .line 220
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v12

    .line 224
    if-nez v18, :cond_11

    .line 225
    .line 226
    if-ne v12, v15, :cond_12

    .line 227
    .line 228
    :cond_11
    new-instance v12, LM/Q;

    .line 229
    .line 230
    const/4 v14, 0x2

    .line 231
    invoke-direct {v12, v13, v14}, LM/Q;-><init>(LB5/a;I)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v0, v12}, LP/o;->d0(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    :cond_12
    check-cast v12, LB5/c;

    .line 238
    .line 239
    const/4 v14, 0x1

    .line 240
    invoke-static {v3, v14, v12}, LI0/j;->a(Lc0/m;ZLB5/c;)Lc0/m;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    sget v12, LM/q0;->c:F

    .line 245
    .line 246
    sget v14, LM/q0;->d:F

    .line 247
    .line 248
    invoke-static {v3, v12, v14}, Landroidx/compose/foundation/layout/c;->d(Lc0/m;FF)Lc0/m;

    .line 249
    .line 250
    .line 251
    move-result-object v12

    .line 252
    and-int v3, v2, v16

    .line 253
    .line 254
    const/16 v14, 0x4000

    .line 255
    .line 256
    if-ne v3, v14, :cond_13

    .line 257
    .line 258
    const/4 v3, 0x1

    .line 259
    goto :goto_a

    .line 260
    :cond_13
    const/4 v3, 0x0

    .line 261
    :goto_a
    invoke-virtual {v0, v13}, LP/o;->g(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v14

    .line 265
    or-int/2addr v3, v14

    .line 266
    and-int/lit16 v14, v2, 0x1c00

    .line 267
    .line 268
    xor-int/lit16 v14, v14, 0xc00

    .line 269
    .line 270
    const/16 v1, 0x800

    .line 271
    .line 272
    if-le v14, v1, :cond_14

    .line 273
    .line 274
    invoke-virtual {v0, v5, v6}, LP/o;->f(J)Z

    .line 275
    .line 276
    .line 277
    move-result v14

    .line 278
    if-nez v14, :cond_15

    .line 279
    .line 280
    :cond_14
    and-int/lit16 v14, v2, 0xc00

    .line 281
    .line 282
    if-ne v14, v1, :cond_16

    .line 283
    .line 284
    :cond_15
    const/4 v1, 0x1

    .line 285
    goto :goto_b

    .line 286
    :cond_16
    const/4 v1, 0x0

    .line 287
    :goto_b
    or-int/2addr v1, v3

    .line 288
    and-int/lit16 v3, v2, 0x380

    .line 289
    .line 290
    xor-int/lit16 v3, v3, 0x180

    .line 291
    .line 292
    const/16 v14, 0x100

    .line 293
    .line 294
    if-le v3, v14, :cond_17

    .line 295
    .line 296
    invoke-virtual {v0, v8, v9}, LP/o;->f(J)Z

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    if-nez v3, :cond_18

    .line 301
    .line 302
    :cond_17
    and-int/lit16 v2, v2, 0x180

    .line 303
    .line 304
    if-ne v2, v14, :cond_19

    .line 305
    .line 306
    :cond_18
    const/4 v14, 0x1

    .line 307
    goto :goto_c

    .line 308
    :cond_19
    const/4 v14, 0x0

    .line 309
    :goto_c
    or-int/2addr v1, v14

    .line 310
    invoke-virtual {v0, v10}, LP/o;->g(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move-result v2

    .line 314
    or-int/2addr v1, v2

    .line 315
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    if-nez v1, :cond_1a

    .line 320
    .line 321
    if-ne v2, v15, :cond_1b

    .line 322
    .line 323
    :cond_1a
    new-instance v2, LM/o0;

    .line 324
    .line 325
    move v3, v7

    .line 326
    move-wide v6, v5

    .line 327
    move-object v5, v13

    .line 328
    invoke-direct/range {v2 .. v10}, LM/o0;-><init>(IFLB5/a;JJLB5/c;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v0, v2}, LP/o;->d0(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    :cond_1b
    check-cast v2, LB5/c;

    .line 335
    .line 336
    const/4 v1, 0x0

    .line 337
    invoke-static {v12, v2, v0, v1}, Ln5/A;->b(Lc0/m;LB5/c;LP/o;I)V

    .line 338
    .line 339
    .line 340
    move v8, v4

    .line 341
    move-object v9, v10

    .line 342
    :goto_d
    invoke-virtual {v0}, LP/o;->r()LP/o0;

    .line 343
    .line 344
    .line 345
    move-result-object v12

    .line 346
    if-eqz v12, :cond_1c

    .line 347
    .line 348
    new-instance v0, LM/p0;

    .line 349
    .line 350
    move-object/from16 v1, p0

    .line 351
    .line 352
    move-wide/from16 v3, p2

    .line 353
    .line 354
    move-wide/from16 v5, p4

    .line 355
    .line 356
    move/from16 v7, p6

    .line 357
    .line 358
    move/from16 v10, p10

    .line 359
    .line 360
    move-object v2, v11

    .line 361
    invoke-direct/range {v0 .. v10}, LM/p0;-><init>(LB5/a;Lc0/m;JJIFLB5/c;I)V

    .line 362
    .line 363
    .line 364
    iput-object v0, v12, LP/o0;->d:LB5/e;

    .line 365
    .line 366
    :cond_1c
    return-void
.end method

.method public static final c(Ll0/d;FFJFI)V
    .locals 17

    .line 1
    invoke-interface/range {p0 .. p0}, Ll0/d;->d()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Li0/e;->d(J)F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-interface/range {p0 .. p0}, Ll0/d;->d()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-static {v1, v2}, Li0/e;->b(J)F

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x2

    .line 18
    int-to-float v2, v2

    .line 19
    div-float v3, v1, v2

    .line 20
    .line 21
    invoke-interface/range {p0 .. p0}, Ll0/d;->getLayoutDirection()LW0/l;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    sget-object v5, LW0/l;->q:LW0/l;

    .line 26
    .line 27
    if-ne v4, v5, :cond_0

    .line 28
    .line 29
    const/4 v4, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v4, 0x0

    .line 32
    :goto_0
    const/high16 v5, 0x3f800000    # 1.0f

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    move/from16 v6, p1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    sub-float v6, v5, p2

    .line 40
    .line 41
    :goto_1
    mul-float/2addr v6, v0

    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    move/from16 v5, p2

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    sub-float v5, v5, p1

    .line 48
    .line 49
    :goto_2
    mul-float/2addr v5, v0

    .line 50
    if-nez p6, :cond_3

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_3
    cmpl-float v1, v1, v0

    .line 54
    .line 55
    if-lez v1, :cond_4

    .line 56
    .line 57
    :goto_3
    invoke-static {v6, v3}, Lcom/google/android/gms/internal/measurement/P1;->b(FF)J

    .line 58
    .line 59
    .line 60
    move-result-wide v10

    .line 61
    invoke-static {v5, v3}, Lcom/google/android/gms/internal/measurement/P1;->b(FF)J

    .line 62
    .line 63
    .line 64
    move-result-wide v12

    .line 65
    const/4 v15, 0x0

    .line 66
    const/16 v16, 0x1f0

    .line 67
    .line 68
    move-object/from16 v7, p0

    .line 69
    .line 70
    move-wide/from16 v8, p3

    .line 71
    .line 72
    move/from16 v14, p5

    .line 73
    .line 74
    invoke-static/range {v7 .. v16}, Ll0/d;->P(Ll0/d;JJJFII)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_4
    div-float v1, p5, v2

    .line 79
    .line 80
    sub-float/2addr v0, v1

    .line 81
    new-instance v2, LG5/a;

    .line 82
    .line 83
    invoke-direct {v2, v1, v0}, LG5/a;-><init>(FF)V

    .line 84
    .line 85
    .line 86
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {v0, v2}, LD5/a;->s(Ljava/lang/Float;LG5/a;)Ljava/lang/Comparable;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Ljava/lang/Number;

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-static {v1, v2}, LD5/a;->s(Ljava/lang/Float;LG5/a;)Ljava/lang/Comparable;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    check-cast v1, Ljava/lang/Number;

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    sub-float v2, p2, p1

    .line 115
    .line 116
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    const/4 v4, 0x0

    .line 121
    cmpl-float v2, v2, v4

    .line 122
    .line 123
    if-lez v2, :cond_5

    .line 124
    .line 125
    invoke-static {v0, v3}, Lcom/google/android/gms/internal/measurement/P1;->b(FF)J

    .line 126
    .line 127
    .line 128
    move-result-wide v4

    .line 129
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->b(FF)J

    .line 130
    .line 131
    .line 132
    move-result-wide v0

    .line 133
    const/16 v9, 0x1e0

    .line 134
    .line 135
    move/from16 v7, p5

    .line 136
    .line 137
    move/from16 v8, p6

    .line 138
    .line 139
    move-wide v3, v4

    .line 140
    move-wide v5, v0

    .line 141
    move-object/from16 v0, p0

    .line 142
    .line 143
    move-wide/from16 v1, p3

    .line 144
    .line 145
    invoke-static/range {v0 .. v9}, Ll0/d;->P(Ll0/d;JJJFII)V

    .line 146
    .line 147
    .line 148
    :cond_5
    return-void
.end method

.method public static final d(Ll0/d;FFJLl0/g;)V
    .locals 10

    .line 1
    iget v0, p5, Ll0/g;->b:F

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    int-to-float v1, v1

    .line 5
    div-float/2addr v0, v1

    .line 6
    invoke-interface {p0}, Ll0/d;->d()J

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    invoke-static {v2, v3}, Li0/e;->d(J)F

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    mul-float/2addr v1, v0

    .line 15
    sub-float/2addr v2, v1

    .line 16
    invoke-static {v0, v0}, Lcom/google/android/gms/internal/measurement/P1;->b(FF)J

    .line 17
    .line 18
    .line 19
    move-result-wide v5

    .line 20
    invoke-static {v2, v2}, Ln5/A;->g(FF)J

    .line 21
    .line 22
    .line 23
    move-result-wide v7

    .line 24
    move-object v0, p0

    .line 25
    move v3, p1

    .line 26
    move v4, p2

    .line 27
    move-wide v1, p3

    .line 28
    move-object v9, p5

    .line 29
    invoke-interface/range {v0 .. v9}, Ll0/d;->v(JFFJJLl0/c;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method
