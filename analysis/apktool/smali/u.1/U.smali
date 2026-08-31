.class public final Lu/U;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:LU5/c;

.field public r:Lu/d0;

.field public s:I

.field public final synthetic t:Lu/d0;

.field public final synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lu/v0;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lq5/c;Lu/d0;Lu/v0;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lu/U;->t:Lu/d0;

    .line 2
    .line 3
    iput-object p1, p0, Lu/U;->u:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p4, p0, Lu/U;->v:Lu/v0;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p2}, Ls5/i;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 3

    .line 1
    new-instance p1, Lu/U;

    .line 2
    .line 3
    iget-object v0, p0, Lu/U;->u:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v1, p0, Lu/U;->v:Lu/v0;

    .line 6
    .line 7
    iget-object v2, p0, Lu/U;->t:Lu/d0;

    .line 8
    .line 9
    invoke-direct {p1, v0, p2, v2, v1}, Lu/U;-><init>(Ljava/lang/Object;Lq5/c;Lu/d0;Lu/v0;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LM5/w;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lu/U;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lu/U;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lu/U;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lu/U;->s:I

    .line 4
    .line 5
    sget-object v4, Lm5/y;->a:Lm5/y;

    .line 6
    .line 7
    const/4 v5, 0x5

    .line 8
    const/4 v6, 0x4

    .line 9
    const/4 v7, 0x3

    .line 10
    const/4 v8, 0x2

    .line 11
    const/4 v9, 0x1

    .line 12
    const-wide/16 v10, 0x0

    .line 13
    .line 14
    const/4 v12, 0x0

    .line 15
    iget-object v13, v1, Lu/U;->u:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v14, v1, Lu/U;->t:Lu/d0;

    .line 18
    .line 19
    const/4 v15, 0x0

    .line 20
    const-wide/high16 v16, -0x8000000000000000L

    .line 21
    .line 22
    sget-object v2, Lr5/a;->q:Lr5/a;

    .line 23
    .line 24
    if-eqz v0, :cond_5

    .line 25
    .line 26
    if-eq v0, v9, :cond_4

    .line 27
    .line 28
    if-eq v0, v8, :cond_3

    .line 29
    .line 30
    if-eq v0, v7, :cond_2

    .line 31
    .line 32
    if-eq v0, v6, :cond_1

    .line 33
    .line 34
    if-ne v0, v5, :cond_0

    .line 35
    .line 36
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    move v9, v12

    .line 40
    goto/16 :goto_b

    .line 41
    .line 42
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0

    .line 50
    :cond_1
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    move/from16 p1, v12

    .line 54
    .line 55
    move-object v0, v13

    .line 56
    goto/16 :goto_9

    .line 57
    .line 58
    :cond_2
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_3

    .line 62
    .line 63
    :cond_3
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto/16 :goto_2

    .line 67
    .line 68
    :cond_4
    iget-object v0, v1, Lu/U;->r:Lu/d0;

    .line 69
    .line 70
    iget-object v3, v1, Lu/U;->q:LU5/c;

    .line 71
    .line 72
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_5
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, v14, Lu/d0;->s:LP/f0;

    .line 80
    .line 81
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v13, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-nez v3, :cond_6

    .line 90
    .line 91
    invoke-static {v14}, Lu/d0;->p(Lu/d0;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v14, v12}, Lu/d0;->y(F)V

    .line 95
    .line 96
    .line 97
    iget-object v3, v1, Lu/U;->v:Lu/v0;

    .line 98
    .line 99
    invoke-virtual {v3, v13}, Lu/v0;->p(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3, v10, v11}, Lu/v0;->n(J)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v14, v0}, Lu/d0;->l(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    iget-object v0, v14, Lu/d0;->s:LP/f0;

    .line 109
    .line 110
    invoke-virtual {v0, v13}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_6
    iget-object v3, v14, Lu/d0;->A:LU5/c;

    .line 114
    .line 115
    iput-object v3, v1, Lu/U;->q:LU5/c;

    .line 116
    .line 117
    iput-object v14, v1, Lu/U;->r:Lu/d0;

    .line 118
    .line 119
    iput v9, v1, Lu/U;->s:I

    .line 120
    .line 121
    invoke-virtual {v3, v1}, LU5/c;->e(Ls5/c;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    if-ne v0, v2, :cond_7

    .line 126
    .line 127
    goto/16 :goto_a

    .line 128
    .line 129
    :cond_7
    move-object v0, v14

    .line 130
    :goto_0
    :try_start_0
    iget-object v0, v0, Lu/d0;->u:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    .line 132
    invoke-virtual {v3, v15}, LU5/c;->g(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v13, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-nez v0, :cond_b

    .line 140
    .line 141
    iput-object v15, v1, Lu/U;->q:LU5/c;

    .line 142
    .line 143
    iput-object v15, v1, Lu/U;->r:Lu/d0;

    .line 144
    .line 145
    iput v8, v1, Lu/U;->s:I

    .line 146
    .line 147
    iget-wide v8, v14, Lu/d0;->C:J

    .line 148
    .line 149
    cmp-long v0, v8, v16

    .line 150
    .line 151
    if-nez v0, :cond_8

    .line 152
    .line 153
    iget-object v0, v14, Lu/d0;->F:Lu/T;

    .line 154
    .line 155
    invoke-interface {v1}, Lq5/c;->getContext()Lq5/h;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    invoke-static {v3}, LP/b;->o(Lq5/h;)LP/T;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    invoke-interface {v3, v0, v1}, LP/T;->e(LB5/c;Ls5/c;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    if-ne v0, v2, :cond_9

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_8
    invoke-virtual {v14, v1}, Lu/d0;->u(Ls5/c;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    if-ne v0, v2, :cond_9

    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_9
    move-object v0, v4

    .line 178
    :goto_1
    if-ne v0, v2, :cond_a

    .line 179
    .line 180
    goto/16 :goto_a

    .line 181
    .line 182
    :cond_a
    :goto_2
    iput v7, v1, Lu/U;->s:I

    .line 183
    .line 184
    invoke-static {v14, v1}, Lu/d0;->t(Lu/d0;Ls5/c;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    if-ne v0, v2, :cond_b

    .line 189
    .line 190
    goto/16 :goto_a

    .line 191
    .line 192
    :cond_b
    :goto_3
    iget-object v0, v14, Lu/d0;->t:LP/f0;

    .line 193
    .line 194
    iget-object v3, v14, Lu/d0;->y:LP/b0;

    .line 195
    .line 196
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-static {v0, v13}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-nez v0, :cond_18

    .line 205
    .line 206
    invoke-virtual {v3}, LP/b0;->e()F

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    const/high16 v7, 0x3f800000    # 1.0f

    .line 211
    .line 212
    cmpg-float v0, v0, v7

    .line 213
    .line 214
    if-gez v0, :cond_c

    .line 215
    .line 216
    iget-object v0, v14, Lu/d0;->E:Lu/S;

    .line 217
    .line 218
    if-eqz v0, :cond_d

    .line 219
    .line 220
    iget-object v8, v0, Lu/S;->b:Lu/E0;

    .line 221
    .line 222
    invoke-static {v15, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v8

    .line 226
    if-nez v8, :cond_c

    .line 227
    .line 228
    goto :goto_4

    .line 229
    :cond_c
    move/from16 p1, v12

    .line 230
    .line 231
    move-object/from16 v24, v13

    .line 232
    .line 233
    goto/16 :goto_8

    .line 234
    .line 235
    :cond_d
    :goto_4
    if-eqz v0, :cond_e

    .line 236
    .line 237
    iget-object v8, v0, Lu/S;->b:Lu/E0;

    .line 238
    .line 239
    move-object/from16 v18, v8

    .line 240
    .line 241
    goto :goto_5

    .line 242
    :cond_e
    move-object/from16 v18, v15

    .line 243
    .line 244
    :goto_5
    sget-object v8, Lu/d0;->I:Lu/m;

    .line 245
    .line 246
    if-eqz v18, :cond_10

    .line 247
    .line 248
    move v9, v12

    .line 249
    move-object/from16 v24, v13

    .line 250
    .line 251
    iget-wide v12, v0, Lu/S;->a:J

    .line 252
    .line 253
    iget-object v7, v0, Lu/S;->e:Lu/m;

    .line 254
    .line 255
    move/from16 p1, v9

    .line 256
    .line 257
    iget-object v9, v0, Lu/S;->f:Lu/m;

    .line 258
    .line 259
    if-nez v9, :cond_f

    .line 260
    .line 261
    move-object/from16 v23, v8

    .line 262
    .line 263
    goto :goto_6

    .line 264
    :cond_f
    move-object/from16 v23, v9

    .line 265
    .line 266
    :goto_6
    sget-object v22, Lu/d0;->J:Lu/m;

    .line 267
    .line 268
    move-object/from16 v21, v7

    .line 269
    .line 270
    move-wide/from16 v19, v12

    .line 271
    .line 272
    invoke-interface/range {v18 .. v23}, Lu/B0;->n(JLu/q;Lu/q;Lu/q;)Lu/q;

    .line 273
    .line 274
    .line 275
    move-result-object v7

    .line 276
    move-object v8, v7

    .line 277
    check-cast v8, Lu/m;

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_10
    move/from16 p1, v12

    .line 281
    .line 282
    move-object/from16 v24, v13

    .line 283
    .line 284
    if-eqz v0, :cond_14

    .line 285
    .line 286
    iget-wide v12, v0, Lu/S;->a:J

    .line 287
    .line 288
    cmp-long v9, v12, v10

    .line 289
    .line 290
    if-nez v9, :cond_11

    .line 291
    .line 292
    goto :goto_7

    .line 293
    :cond_11
    iget-wide v12, v0, Lu/S;->g:J

    .line 294
    .line 295
    cmp-long v9, v12, v16

    .line 296
    .line 297
    if-nez v9, :cond_12

    .line 298
    .line 299
    iget-wide v12, v14, Lu/d0;->w:J

    .line 300
    .line 301
    :cond_12
    long-to-float v9, v12

    .line 302
    const v12, 0x4e6e6b28    # 1.0E9f

    .line 303
    .line 304
    .line 305
    div-float/2addr v9, v12

    .line 306
    cmpg-float v12, v9, p1

    .line 307
    .line 308
    if-gtz v12, :cond_13

    .line 309
    .line 310
    goto :goto_7

    .line 311
    :cond_13
    new-instance v8, Lu/m;

    .line 312
    .line 313
    div-float/2addr v7, v9

    .line 314
    invoke-direct {v8, v7}, Lu/m;-><init>(F)V

    .line 315
    .line 316
    .line 317
    :cond_14
    :goto_7
    if-nez v0, :cond_15

    .line 318
    .line 319
    new-instance v0, Lu/S;

    .line 320
    .line 321
    invoke-direct {v0}, Lu/S;-><init>()V

    .line 322
    .line 323
    .line 324
    :cond_15
    iget-object v7, v0, Lu/S;->e:Lu/m;

    .line 325
    .line 326
    iput-object v15, v0, Lu/S;->b:Lu/E0;

    .line 327
    .line 328
    const/4 v9, 0x0

    .line 329
    iput-boolean v9, v0, Lu/S;->c:Z

    .line 330
    .line 331
    invoke-virtual {v3}, LP/b0;->e()F

    .line 332
    .line 333
    .line 334
    move-result v12

    .line 335
    iput v12, v0, Lu/S;->d:F

    .line 336
    .line 337
    invoke-virtual {v3}, LP/b0;->e()F

    .line 338
    .line 339
    .line 340
    move-result v12

    .line 341
    invoke-virtual {v7, v9, v12}, Lu/m;->e(IF)V

    .line 342
    .line 343
    .line 344
    iget-wide v12, v14, Lu/d0;->w:J

    .line 345
    .line 346
    iput-wide v12, v0, Lu/S;->g:J

    .line 347
    .line 348
    iput-wide v10, v0, Lu/S;->a:J

    .line 349
    .line 350
    iput-object v8, v0, Lu/S;->f:Lu/m;

    .line 351
    .line 352
    long-to-double v7, v12

    .line 353
    invoke-virtual {v3}, LP/b0;->e()F

    .line 354
    .line 355
    .line 356
    move-result v3

    .line 357
    float-to-double v9, v3

    .line 358
    const-wide/high16 v11, 0x3ff0000000000000L    # 1.0

    .line 359
    .line 360
    sub-double/2addr v11, v9

    .line 361
    mul-double/2addr v11, v7

    .line 362
    invoke-static {v11, v12}, LD5/a;->H(D)J

    .line 363
    .line 364
    .line 365
    move-result-wide v7

    .line 366
    iput-wide v7, v0, Lu/S;->h:J

    .line 367
    .line 368
    iput-object v0, v14, Lu/d0;->E:Lu/S;

    .line 369
    .line 370
    :goto_8
    iput-object v15, v1, Lu/U;->q:LU5/c;

    .line 371
    .line 372
    iput-object v15, v1, Lu/U;->r:Lu/d0;

    .line 373
    .line 374
    iput v6, v1, Lu/U;->s:I

    .line 375
    .line 376
    invoke-static {v14, v1}, Lu/d0;->r(Lu/d0;Ls5/c;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    if-ne v0, v2, :cond_16

    .line 381
    .line 382
    goto :goto_a

    .line 383
    :cond_16
    move-object/from16 v0, v24

    .line 384
    .line 385
    :goto_9
    invoke-virtual {v14, v0}, Lu/d0;->l(Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    iput v5, v1, Lu/U;->s:I

    .line 389
    .line 390
    invoke-static {v14, v1}, Lu/d0;->s(Lu/d0;Ls5/c;)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    if-ne v0, v2, :cond_17

    .line 395
    .line 396
    :goto_a
    return-object v2

    .line 397
    :cond_17
    move/from16 v9, p1

    .line 398
    .line 399
    :goto_b
    invoke-virtual {v14, v9}, Lu/d0;->y(F)V

    .line 400
    .line 401
    .line 402
    :cond_18
    return-object v4

    .line 403
    :catchall_0
    move-exception v0

    .line 404
    invoke-virtual {v3, v15}, LU5/c;->g(Ljava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    throw v0
.end method
