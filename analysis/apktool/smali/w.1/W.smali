.class public final Lw/W;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic A:F

.field public final synthetic B:Lw/H0;

.field public q:Lkotlin/jvm/internal/u;

.field public r:Lkotlin/jvm/internal/u;

.field public s:I

.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lkotlin/jvm/internal/v;

.field public final synthetic w:Lkotlin/jvm/internal/y;

.field public final synthetic x:Lkotlin/jvm/internal/y;

.field public final synthetic y:F

.field public final synthetic z:Lb2/a;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/v;Lkotlin/jvm/internal/y;Lkotlin/jvm/internal/y;FLb2/a;FLw/H0;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/W;->v:Lkotlin/jvm/internal/v;

    .line 2
    .line 3
    iput-object p2, p0, Lw/W;->w:Lkotlin/jvm/internal/y;

    .line 4
    .line 5
    iput-object p3, p0, Lw/W;->x:Lkotlin/jvm/internal/y;

    .line 6
    .line 7
    iput p4, p0, Lw/W;->y:F

    .line 8
    .line 9
    iput-object p5, p0, Lw/W;->z:Lb2/a;

    .line 10
    .line 11
    iput p6, p0, Lw/W;->A:F

    .line 12
    .line 13
    iput-object p7, p0, Lw/W;->B:Lw/H0;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, Ls5/i;-><init>(ILq5/c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 9

    .line 1
    new-instance v0, Lw/W;

    .line 2
    .line 3
    iget v6, p0, Lw/W;->A:F

    .line 4
    .line 5
    iget-object v7, p0, Lw/W;->B:Lw/H0;

    .line 6
    .line 7
    iget-object v1, p0, Lw/W;->v:Lkotlin/jvm/internal/v;

    .line 8
    .line 9
    iget-object v2, p0, Lw/W;->w:Lkotlin/jvm/internal/y;

    .line 10
    .line 11
    iget-object v3, p0, Lw/W;->x:Lkotlin/jvm/internal/y;

    .line 12
    .line 13
    iget v4, p0, Lw/W;->y:F

    .line 14
    .line 15
    iget-object v5, p0, Lw/W;->z:Lb2/a;

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, Lw/W;-><init>(Lkotlin/jvm/internal/v;Lkotlin/jvm/internal/y;Lkotlin/jvm/internal/y;FLb2/a;FLw/H0;Lq5/c;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, Lw/W;->u:Ljava/lang/Object;

    .line 22
    .line 23
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lw/E0;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lw/W;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lw/W;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lw/W;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    iget v0, v7, Lw/W;->t:I

    .line 4
    .line 5
    iget-object v1, v7, Lw/W;->x:Lkotlin/jvm/internal/y;

    .line 6
    .line 7
    iget-object v2, v7, Lw/W;->v:Lkotlin/jvm/internal/v;

    .line 8
    .line 9
    const/4 v8, 0x3

    .line 10
    const/4 v9, 0x2

    .line 11
    const/4 v10, 0x1

    .line 12
    iget-object v11, v7, Lw/W;->w:Lkotlin/jvm/internal/y;

    .line 13
    .line 14
    sget-object v12, Lr5/a;->q:Lr5/a;

    .line 15
    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    if-eq v0, v10, :cond_2

    .line 19
    .line 20
    if-eq v0, v9, :cond_1

    .line 21
    .line 22
    if-ne v0, v8, :cond_0

    .line 23
    .line 24
    iget-object v0, v7, Lw/W;->r:Lkotlin/jvm/internal/u;

    .line 25
    .line 26
    iget-object v3, v7, Lw/W;->q:Lkotlin/jvm/internal/u;

    .line 27
    .line 28
    iget-object v4, v7, Lw/W;->u:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v4, Lw/E0;

    .line 31
    .line 32
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    move-object v14, v0

    .line 36
    move-object v6, v3

    .line 37
    move-object v13, v4

    .line 38
    move-object v4, v11

    .line 39
    move-object/from16 v0, p1

    .line 40
    .line 41
    goto/16 :goto_4

    .line 42
    .line 43
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v0

    .line 51
    :cond_1
    iget v0, v7, Lw/W;->s:I

    .line 52
    .line 53
    iget-object v3, v7, Lw/W;->q:Lkotlin/jvm/internal/u;

    .line 54
    .line 55
    iget-object v4, v7, Lw/W;->u:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v4, Lw/E0;

    .line 58
    .line 59
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move-object/from16 v20, v1

    .line 63
    .line 64
    move-object/from16 v21, v2

    .line 65
    .line 66
    move-object v14, v3

    .line 67
    move-object v13, v4

    .line 68
    goto/16 :goto_3

    .line 69
    .line 70
    :cond_2
    iget-object v0, v7, Lw/W;->r:Lkotlin/jvm/internal/u;

    .line 71
    .line 72
    iget-object v3, v7, Lw/W;->q:Lkotlin/jvm/internal/u;

    .line 73
    .line 74
    iget-object v4, v7, Lw/W;->u:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v4, Lw/E0;

    .line 77
    .line 78
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    move-object v14, v0

    .line 82
    move-object v6, v3

    .line 83
    move-object v13, v4

    .line 84
    move-object v4, v11

    .line 85
    move-object/from16 v0, p1

    .line 86
    .line 87
    goto/16 :goto_8

    .line 88
    .line 89
    :cond_3
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, v7, Lw/W;->u:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v0, Lw/E0;

    .line 95
    .line 96
    new-instance v3, Lkotlin/jvm/internal/u;

    .line 97
    .line 98
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 99
    .line 100
    .line 101
    iput-boolean v10, v3, Lkotlin/jvm/internal/u;->q:Z

    .line 102
    .line 103
    move-object v6, v3

    .line 104
    :goto_0
    iget-boolean v3, v6, Lkotlin/jvm/internal/u;->q:Z

    .line 105
    .line 106
    sget-object v19, Lm5/y;->a:Lm5/y;

    .line 107
    .line 108
    if-eqz v3, :cond_c

    .line 109
    .line 110
    const/4 v3, 0x0

    .line 111
    iput-boolean v3, v6, Lkotlin/jvm/internal/u;->q:Z

    .line 112
    .line 113
    iget v3, v2, Lkotlin/jvm/internal/v;->q:F

    .line 114
    .line 115
    iget-object v4, v11, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v4, Lu/l;

    .line 118
    .line 119
    iget-object v4, v4, Lu/l;->r:LP/f0;

    .line 120
    .line 121
    invoke-virtual {v4}, LP/f0;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    check-cast v4, Ljava/lang/Number;

    .line 126
    .line 127
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    sub-float/2addr v3, v4

    .line 132
    iget-object v4, v1, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v4, Lw/Q;

    .line 135
    .line 136
    iget-boolean v4, v4, Lw/Q;->c:Z

    .line 137
    .line 138
    iget-object v5, v7, Lw/W;->z:Lb2/a;

    .line 139
    .line 140
    if-nez v4, :cond_4

    .line 141
    .line 142
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    iget v13, v7, Lw/W;->y:F

    .line 147
    .line 148
    cmpg-float v4, v4, v13

    .line 149
    .line 150
    if-gez v4, :cond_5

    .line 151
    .line 152
    :cond_4
    move-object v13, v0

    .line 153
    move-object v4, v11

    .line 154
    goto/16 :goto_6

    .line 155
    .line 156
    :cond_5
    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    mul-float/2addr v3, v13

    .line 161
    invoke-static {v5, v0, v3}, Lb2/a;->a(Lb2/a;Lw/E0;F)F

    .line 162
    .line 163
    .line 164
    iget-object v4, v11, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v4, Lu/l;

    .line 167
    .line 168
    iget-object v5, v4, Lu/l;->r:LP/f0;

    .line 169
    .line 170
    invoke-virtual {v5}, LP/f0;->getValue()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    check-cast v5, Ljava/lang/Number;

    .line 175
    .line 176
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    add-float/2addr v5, v3

    .line 181
    const/4 v3, 0x0

    .line 182
    const/16 v13, 0x1e

    .line 183
    .line 184
    invoke-static {v4, v5, v3, v13}, Lu/d;->k(Lu/l;FFI)Lu/l;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    iput-object v3, v11, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 189
    .line 190
    iget v4, v2, Lkotlin/jvm/internal/v;->q:F

    .line 191
    .line 192
    iget-object v3, v3, Lu/l;->r:LP/f0;

    .line 193
    .line 194
    invoke-virtual {v3}, LP/f0;->getValue()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    check-cast v3, Ljava/lang/Number;

    .line 199
    .line 200
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    sub-float/2addr v4, v3

    .line 205
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    iget v4, v7, Lw/W;->A:F

    .line 210
    .line 211
    div-float/2addr v3, v4

    .line 212
    invoke-static {v3}, LD5/a;->G(F)I

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    const/16 v4, 0x64

    .line 217
    .line 218
    if-le v3, v4, :cond_6

    .line 219
    .line 220
    move v13, v4

    .line 221
    goto :goto_1

    .line 222
    :cond_6
    move v13, v3

    .line 223
    :goto_1
    iget-object v3, v11, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 224
    .line 225
    move-object v14, v3

    .line 226
    check-cast v14, Lu/l;

    .line 227
    .line 228
    iget v15, v2, Lkotlin/jvm/internal/v;->q:F

    .line 229
    .line 230
    new-instance v17, Lw/V;

    .line 231
    .line 232
    iget-object v5, v7, Lw/W;->B:Lw/H0;

    .line 233
    .line 234
    move-object v4, v2

    .line 235
    iget-object v2, v7, Lw/W;->z:Lb2/a;

    .line 236
    .line 237
    move-object v3, v1

    .line 238
    move-object/from16 v1, v17

    .line 239
    .line 240
    invoke-direct/range {v1 .. v6}, Lw/V;-><init>(Lb2/a;Lkotlin/jvm/internal/y;Lkotlin/jvm/internal/v;Lw/H0;Lkotlin/jvm/internal/u;)V

    .line 241
    .line 242
    .line 243
    move-object/from16 v20, v3

    .line 244
    .line 245
    move-object/from16 v21, v4

    .line 246
    .line 247
    iput-object v0, v7, Lw/W;->u:Ljava/lang/Object;

    .line 248
    .line 249
    iput-object v6, v7, Lw/W;->q:Lkotlin/jvm/internal/u;

    .line 250
    .line 251
    const/4 v3, 0x0

    .line 252
    iput-object v3, v7, Lw/W;->r:Lkotlin/jvm/internal/u;

    .line 253
    .line 254
    iput v13, v7, Lw/W;->s:I

    .line 255
    .line 256
    iput v9, v7, Lw/W;->t:I

    .line 257
    .line 258
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    new-instance v3, Lkotlin/jvm/internal/v;

    .line 262
    .line 263
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 264
    .line 265
    .line 266
    iget-object v4, v14, Lu/l;->r:LP/f0;

    .line 267
    .line 268
    invoke-virtual {v4}, LP/f0;->getValue()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    check-cast v4, Ljava/lang/Number;

    .line 273
    .line 274
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 275
    .line 276
    .line 277
    move-result v4

    .line 278
    iput v4, v3, Lkotlin/jvm/internal/v;->q:F

    .line 279
    .line 280
    new-instance v1, Ljava/lang/Float;

    .line 281
    .line 282
    invoke-direct {v1, v15}, Ljava/lang/Float;-><init>(F)V

    .line 283
    .line 284
    .line 285
    sget-object v4, Lu/y;->b:LC0/Z0;

    .line 286
    .line 287
    invoke-static {v13, v9, v4}, Lu/d;->p(IILu/x;)Lu/z0;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    move v5, v13

    .line 292
    new-instance v13, LE/y;

    .line 293
    .line 294
    const/16 v18, 0x2

    .line 295
    .line 296
    move-object/from16 v16, v0

    .line 297
    .line 298
    move-object v15, v2

    .line 299
    move/from16 v22, v5

    .line 300
    .line 301
    move-object v0, v14

    .line 302
    move-object v14, v3

    .line 303
    invoke-direct/range {v13 .. v18}, LE/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 304
    .line 305
    .line 306
    move-object v2, v4

    .line 307
    move-object v4, v13

    .line 308
    move-object/from16 v13, v16

    .line 309
    .line 310
    const/4 v3, 0x1

    .line 311
    move-object v5, v7

    .line 312
    invoke-static/range {v0 .. v5}, Lu/d;->g(Lu/l;Ljava/lang/Float;Lu/k;ZLB5/c;Ls5/c;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    if-ne v0, v12, :cond_7

    .line 317
    .line 318
    goto :goto_2

    .line 319
    :cond_7
    move-object/from16 v0, v19

    .line 320
    .line 321
    :goto_2
    if-ne v0, v12, :cond_8

    .line 322
    .line 323
    goto :goto_7

    .line 324
    :cond_8
    move-object v14, v6

    .line 325
    move/from16 v0, v22

    .line 326
    .line 327
    :goto_3
    iget-boolean v1, v14, Lkotlin/jvm/internal/u;->q:Z

    .line 328
    .line 329
    if-nez v1, :cond_a

    .line 330
    .line 331
    const-wide/16 v1, 0x32

    .line 332
    .line 333
    int-to-long v3, v0

    .line 334
    sub-long v5, v1, v3

    .line 335
    .line 336
    iput-object v13, v7, Lw/W;->u:Ljava/lang/Object;

    .line 337
    .line 338
    iput-object v14, v7, Lw/W;->q:Lkotlin/jvm/internal/u;

    .line 339
    .line 340
    iput-object v14, v7, Lw/W;->r:Lkotlin/jvm/internal/u;

    .line 341
    .line 342
    iput v8, v7, Lw/W;->t:I

    .line 343
    .line 344
    iget-object v0, v7, Lw/W;->z:Lb2/a;

    .line 345
    .line 346
    iget-object v3, v7, Lw/W;->B:Lw/H0;

    .line 347
    .line 348
    move-object v4, v11

    .line 349
    move-object/from16 v1, v20

    .line 350
    .line 351
    move-object/from16 v2, v21

    .line 352
    .line 353
    invoke-static/range {v0 .. v7}, Lb2/a;->c(Lb2/a;Lkotlin/jvm/internal/y;Lkotlin/jvm/internal/v;Lw/H0;Lkotlin/jvm/internal/y;JLs5/c;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    if-ne v0, v12, :cond_9

    .line 358
    .line 359
    goto :goto_7

    .line 360
    :cond_9
    move-object v6, v14

    .line 361
    :goto_4
    check-cast v0, Ljava/lang/Boolean;

    .line 362
    .line 363
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    iput-boolean v0, v14, Lkotlin/jvm/internal/u;->q:Z

    .line 368
    .line 369
    :goto_5
    move-object v11, v4

    .line 370
    move-object v0, v13

    .line 371
    goto/16 :goto_0

    .line 372
    .line 373
    :cond_a
    move-object v0, v13

    .line 374
    move-object v6, v14

    .line 375
    move-object/from16 v1, v20

    .line 376
    .line 377
    move-object/from16 v2, v21

    .line 378
    .line 379
    goto/16 :goto_0

    .line 380
    .line 381
    :goto_6
    invoke-static {v5, v13, v3}, Lb2/a;->a(Lb2/a;Lw/E0;F)F

    .line 382
    .line 383
    .line 384
    iput-object v13, v7, Lw/W;->u:Ljava/lang/Object;

    .line 385
    .line 386
    iput-object v6, v7, Lw/W;->q:Lkotlin/jvm/internal/u;

    .line 387
    .line 388
    iput-object v6, v7, Lw/W;->r:Lkotlin/jvm/internal/u;

    .line 389
    .line 390
    iput v10, v7, Lw/W;->t:I

    .line 391
    .line 392
    iget-object v0, v7, Lw/W;->z:Lb2/a;

    .line 393
    .line 394
    iget-object v3, v7, Lw/W;->B:Lw/H0;

    .line 395
    .line 396
    move-object v14, v6

    .line 397
    const-wide/16 v5, 0x32

    .line 398
    .line 399
    invoke-static/range {v0 .. v7}, Lb2/a;->c(Lb2/a;Lkotlin/jvm/internal/y;Lkotlin/jvm/internal/v;Lw/H0;Lkotlin/jvm/internal/y;JLs5/c;)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    if-ne v0, v12, :cond_b

    .line 404
    .line 405
    :goto_7
    return-object v12

    .line 406
    :cond_b
    move-object v6, v14

    .line 407
    :goto_8
    check-cast v0, Ljava/lang/Boolean;

    .line 408
    .line 409
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    iput-boolean v0, v14, Lkotlin/jvm/internal/u;->q:Z

    .line 414
    .line 415
    move-object/from16 v7, p0

    .line 416
    .line 417
    goto :goto_5

    .line 418
    :cond_c
    return-object v19
.end method
