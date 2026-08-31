.class public final LA/J;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LB0/T;LN/u;Lz0/J;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LA/J;->q:I

    .line 1
    iput-object p1, p0, LA/J;->t:Ljava/lang/Object;

    iput-object p2, p0, LA/J;->r:Ljava/lang/Object;

    iput-object p3, p0, LA/J;->s:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lh0/o;Lh0/h;LB5/c;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, LA/J;->q:I

    .line 2
    iput-object p1, p0, LA/J;->r:Ljava/lang/Object;

    iput-object p2, p0, LA/J;->s:Ljava/lang/Object;

    check-cast p3, Lkotlin/jvm/internal/n;

    iput-object p3, p0, LA/J;->t:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p4, p0, LA/J;->q:I

    iput-object p1, p0, LA/J;->r:Ljava/lang/Object;

    iput-object p2, p0, LA/J;->s:Ljava/lang/Object;

    iput-object p3, p0, LA/J;->t:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/v;Lw/C0;Lkotlin/jvm/internal/v;Lw/l;)V
    .locals 0

    const/16 p4, 0xf

    iput p4, p0, LA/J;->q:I

    .line 4
    iput-object p1, p0, LA/J;->r:Ljava/lang/Object;

    iput-object p2, p0, LA/J;->s:Ljava/lang/Object;

    iput-object p3, p0, LA/J;->t:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, LA/J;->q:I

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const/high16 v2, 0x3f800000    # 1.0f

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v6, 0x1

    .line 10
    sget-object v7, Lm5/y;->a:Lm5/y;

    .line 11
    .line 12
    iget-object v8, p0, LA/J;->s:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v9, p0, LA/J;->t:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v10, p0, LA/J;->r:Ljava/lang/Object;

    .line 17
    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast p1, Lv0/l;

    .line 22
    .line 23
    check-cast v10, LO3/l;

    .line 24
    .line 25
    iget-object v0, v10, LO3/l;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Lw0/c;

    .line 28
    .line 29
    iget-object v1, v10, LO3/l;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Lw0/c;

    .line 32
    .line 33
    invoke-static {v10, p1}, Lcom/google/android/gms/internal/measurement/P1;->d(LO3/l;Lv0/l;)V

    .line 34
    .line 35
    .line 36
    check-cast v8, Lv0/o;

    .line 37
    .line 38
    check-cast v8, Lv0/A;

    .line 39
    .line 40
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-static {v8}, LB0/g;->u(LB0/m;)LB0/L;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iget-object p1, p1, LB0/L;->P:LC0/b1;

    .line 48
    .line 49
    invoke-interface {p1}, LC0/b1;->a()F

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-static {p1, p1}, Ll6/d;->i(FF)J

    .line 54
    .line 55
    .line 56
    move-result-wide v11

    .line 57
    invoke-static {v11, v12}, LW0/p;->b(J)F

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    cmpl-float p1, p1, v3

    .line 62
    .line 63
    if-lez p1, :cond_0

    .line 64
    .line 65
    invoke-static {v11, v12}, LW0/p;->c(J)F

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    cmpl-float p1, p1, v3

    .line 70
    .line 71
    if-lez p1, :cond_0

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-string v2, "maximumVelocity should be a positive value. You specified="

    .line 77
    .line 78
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v11, v12}, LW0/p;->f(J)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-static {p1}, Ly0/a;->b(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :goto_0
    invoke-static {v11, v12}, LW0/p;->b(J)F

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    invoke-virtual {v1, p1}, Lw0/c;->b(F)F

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    invoke-static {v11, v12}, LW0/p;->c(J)F

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    invoke-virtual {v0, v2}, Lw0/c;->b(F)F

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    invoke-static {p1, v2}, Ll6/d;->i(FF)J

    .line 112
    .line 113
    .line 114
    move-result-wide v11

    .line 115
    iget-object p1, v1, Lw0/c;->d:[Lw0/a;

    .line 116
    .line 117
    invoke-static {p1, v5}, Ln5/k;->L0([Ljava/lang/Object;LE4/f;)V

    .line 118
    .line 119
    .line 120
    iput v4, v1, Lw0/c;->e:I

    .line 121
    .line 122
    iget-object p1, v0, Lw0/c;->d:[Lw0/a;

    .line 123
    .line 124
    invoke-static {p1, v5}, Ln5/k;->L0([Ljava/lang/Object;LE4/f;)V

    .line 125
    .line 126
    .line 127
    iput v4, v0, Lw0/c;->e:I

    .line 128
    .line 129
    const-wide/16 v0, 0x0

    .line 130
    .line 131
    iput-wide v0, v10, LO3/l;->a:J

    .line 132
    .line 133
    check-cast v9, Lw/C;

    .line 134
    .line 135
    iget-object p1, v9, Lw/C;->K:LO5/e;

    .line 136
    .line 137
    if-eqz p1, :cond_3

    .line 138
    .line 139
    new-instance v0, Lw/r;

    .line 140
    .line 141
    sget-object v1, Lw/D;->a:Le3/u;

    .line 142
    .line 143
    invoke-static {v11, v12}, LW0/p;->b(J)F

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    if-eqz v1, :cond_1

    .line 152
    .line 153
    move v1, v3

    .line 154
    goto :goto_1

    .line 155
    :cond_1
    invoke-static {v11, v12}, LW0/p;->b(J)F

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    :goto_1
    invoke-static {v11, v12}, LW0/p;->c(J)F

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    if-eqz v2, :cond_2

    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_2
    invoke-static {v11, v12}, LW0/p;->c(J)F

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    :goto_2
    invoke-static {v1, v3}, Ll6/d;->i(FF)J

    .line 175
    .line 176
    .line 177
    move-result-wide v1

    .line 178
    invoke-direct {v0, v1, v2}, Lw/r;-><init>(J)V

    .line 179
    .line 180
    .line 181
    invoke-interface {p1, v0}, LO5/w;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    :cond_3
    return-object v7

    .line 185
    :pswitch_0
    check-cast p1, Lu/j;

    .line 186
    .line 187
    iget-object v0, p1, Lu/j;->e:LP/f0;

    .line 188
    .line 189
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    check-cast v0, Ljava/lang/Number;

    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    check-cast v10, Lkotlin/jvm/internal/v;

    .line 200
    .line 201
    iget v1, v10, Lkotlin/jvm/internal/v;->q:F

    .line 202
    .line 203
    sub-float/2addr v0, v1

    .line 204
    check-cast v8, Lw/C0;

    .line 205
    .line 206
    invoke-virtual {v8, v0}, Lw/C0;->a(F)F

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    iget-object v2, p1, Lu/j;->e:LP/f0;

    .line 211
    .line 212
    invoke-virtual {v2}, LP/f0;->getValue()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    check-cast v2, Ljava/lang/Number;

    .line 217
    .line 218
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    iput v2, v10, Lkotlin/jvm/internal/v;->q:F

    .line 223
    .line 224
    check-cast v9, Lkotlin/jvm/internal/v;

    .line 225
    .line 226
    iget-object v2, p1, Lu/j;->a:LZ/m;

    .line 227
    .line 228
    iget-object v2, v2, LZ/m;->r:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v2, LB5/c;

    .line 231
    .line 232
    iget-object v3, p1, Lu/j;->f:Lu/q;

    .line 233
    .line 234
    invoke-interface {v2, v3}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    check-cast v2, Ljava/lang/Number;

    .line 239
    .line 240
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    iput v2, v9, Lkotlin/jvm/internal/v;->q:F

    .line 245
    .line 246
    sub-float/2addr v0, v1

    .line 247
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    const/high16 v1, 0x3f000000    # 0.5f

    .line 252
    .line 253
    cmpl-float v0, v0, v1

    .line 254
    .line 255
    if-lez v0, :cond_4

    .line 256
    .line 257
    invoke-virtual {p1}, Lu/j;->a()V

    .line 258
    .line 259
    .line 260
    :cond_4
    return-object v7

    .line 261
    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    .line 262
    .line 263
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 264
    .line 265
    .line 266
    move-result p1

    .line 267
    check-cast v10, Lw/j;

    .line 268
    .line 269
    iget-boolean v0, v10, Lw/j;->G:Z

    .line 270
    .line 271
    if-eqz v0, :cond_5

    .line 272
    .line 273
    goto :goto_3

    .line 274
    :cond_5
    const/high16 v2, -0x40800000    # -1.0f

    .line 275
    .line 276
    :goto_3
    mul-float v0, v2, p1

    .line 277
    .line 278
    iget-object v1, v10, Lw/j;->F:Lw/H0;

    .line 279
    .line 280
    check-cast v9, Lw/E0;

    .line 281
    .line 282
    invoke-virtual {v1, v0}, Lw/H0;->h(F)J

    .line 283
    .line 284
    .line 285
    move-result-wide v3

    .line 286
    invoke-virtual {v1, v3, v4}, Lw/H0;->e(J)J

    .line 287
    .line 288
    .line 289
    move-result-wide v3

    .line 290
    iget-object v0, v9, Lw/E0;->a:Lw/H0;

    .line 291
    .line 292
    iget-object v9, v0, Lw/H0;->j:Lw/i0;

    .line 293
    .line 294
    invoke-static {v0, v9, v3, v4, v6}, Lw/H0;->a(Lw/H0;Lw/i0;JI)J

    .line 295
    .line 296
    .line 297
    move-result-wide v3

    .line 298
    invoke-virtual {v1, v3, v4}, Lw/H0;->e(J)J

    .line 299
    .line 300
    .line 301
    move-result-wide v3

    .line 302
    invoke-virtual {v1, v3, v4}, Lw/H0;->g(J)F

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    mul-float/2addr v0, v2

    .line 307
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 308
    .line 309
    .line 310
    move-result v1

    .line 311
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 312
    .line 313
    .line 314
    move-result v2

    .line 315
    cmpg-float v1, v1, v2

    .line 316
    .line 317
    if-gez v1, :cond_6

    .line 318
    .line 319
    check-cast v8, LM5/b0;

    .line 320
    .line 321
    new-instance v1, Ljava/lang/StringBuilder;

    .line 322
    .line 323
    const-string v2, "Scroll animation cancelled because scroll was not consumed ("

    .line 324
    .line 325
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    const-string v0, " < "

    .line 332
    .line 333
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    const/16 p1, 0x29

    .line 340
    .line 341
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object p1

    .line 348
    new-instance v0, Ljava/util/concurrent/CancellationException;

    .line 349
    .line 350
    invoke-direct {v0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v0, v5}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 354
    .line 355
    .line 356
    invoke-interface {v8, v0}, LM5/b0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 357
    .line 358
    .line 359
    :cond_6
    return-object v7

    .line 360
    :pswitch_2
    check-cast p1, Lu/j;

    .line 361
    .line 362
    check-cast v10, Lu/c;

    .line 363
    .line 364
    iget-object v0, v10, Lu/c;->c:Lu/l;

    .line 365
    .line 366
    invoke-static {p1, v0}, Lu/d;->q(Lu/j;Lu/l;)V

    .line 367
    .line 368
    .line 369
    iget-object v0, p1, Lu/j;->e:LP/f0;

    .line 370
    .line 371
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    invoke-static {v10, v1}, Lu/c;->a(Lu/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v1

    .line 379
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-static {v1, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    move-result v0

    .line 387
    if-nez v0, :cond_7

    .line 388
    .line 389
    iget-object v0, v10, Lu/c;->c:Lu/l;

    .line 390
    .line 391
    iget-object v0, v0, Lu/l;->r:LP/f0;

    .line 392
    .line 393
    invoke-virtual {v0, v1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    check-cast v8, Lu/l;

    .line 397
    .line 398
    iget-object v0, v8, Lu/l;->r:LP/f0;

    .line 399
    .line 400
    invoke-virtual {v0, v1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {p1}, Lu/j;->a()V

    .line 404
    .line 405
    .line 406
    check-cast v9, Lkotlin/jvm/internal/u;

    .line 407
    .line 408
    iput-boolean v6, v9, Lkotlin/jvm/internal/u;->q:Z

    .line 409
    .line 410
    :cond_7
    return-object v7

    .line 411
    :pswitch_3
    check-cast p1, Lt/t;

    .line 412
    .line 413
    check-cast v9, Lt/E;

    .line 414
    .line 415
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 416
    .line 417
    .line 418
    move-result p1

    .line 419
    if-eqz p1, :cond_a

    .line 420
    .line 421
    if-eq p1, v6, :cond_9

    .line 422
    .line 423
    const/4 v0, 0x2

    .line 424
    if-ne p1, v0, :cond_8

    .line 425
    .line 426
    iget-object p1, v9, Lt/E;->a:Lt/L;

    .line 427
    .line 428
    goto :goto_4

    .line 429
    :cond_8
    new-instance p1, LC2/e;

    .line 430
    .line 431
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 432
    .line 433
    .line 434
    throw p1

    .line 435
    :cond_9
    move-object v5, v10

    .line 436
    check-cast v5, Lj0/H;

    .line 437
    .line 438
    goto :goto_4

    .line 439
    :cond_a
    iget-object p1, v9, Lt/E;->a:Lt/L;

    .line 440
    .line 441
    :goto_4
    if-eqz v5, :cond_b

    .line 442
    .line 443
    iget-wide v0, v5, Lj0/H;->a:J

    .line 444
    .line 445
    goto :goto_5

    .line 446
    :cond_b
    sget-wide v0, Lj0/H;->b:J

    .line 447
    .line 448
    :goto_5
    new-instance p1, Lj0/H;

    .line 449
    .line 450
    invoke-direct {p1, v0, v1}, Lj0/H;-><init>(J)V

    .line 451
    .line 452
    .line 453
    return-object p1

    .line 454
    :pswitch_4
    check-cast p1, Lj0/C;

    .line 455
    .line 456
    check-cast v8, LP/S0;

    .line 457
    .line 458
    check-cast v10, LP/S0;

    .line 459
    .line 460
    if-eqz v10, :cond_c

    .line 461
    .line 462
    invoke-interface {v10}, LP/S0;->getValue()Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    check-cast v0, Ljava/lang/Number;

    .line 467
    .line 468
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 469
    .line 470
    .line 471
    move-result v0

    .line 472
    goto :goto_6

    .line 473
    :cond_c
    move v0, v2

    .line 474
    :goto_6
    invoke-virtual {p1, v0}, Lj0/C;->a(F)V

    .line 475
    .line 476
    .line 477
    if-eqz v8, :cond_d

    .line 478
    .line 479
    invoke-interface {v8}, LP/S0;->getValue()Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    check-cast v0, Ljava/lang/Number;

    .line 484
    .line 485
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 486
    .line 487
    .line 488
    move-result v0

    .line 489
    goto :goto_7

    .line 490
    :cond_d
    move v0, v2

    .line 491
    :goto_7
    invoke-virtual {p1, v0}, Lj0/C;->c(F)V

    .line 492
    .line 493
    .line 494
    if-eqz v8, :cond_e

    .line 495
    .line 496
    invoke-interface {v8}, LP/S0;->getValue()Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    check-cast v0, Ljava/lang/Number;

    .line 501
    .line 502
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 503
    .line 504
    .line 505
    move-result v2

    .line 506
    :cond_e
    invoke-virtual {p1, v2}, Lj0/C;->e(F)V

    .line 507
    .line 508
    .line 509
    check-cast v9, LP/S0;

    .line 510
    .line 511
    if-eqz v9, :cond_f

    .line 512
    .line 513
    invoke-interface {v9}, LP/S0;->getValue()Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    check-cast v0, Lj0/H;

    .line 518
    .line 519
    iget-wide v0, v0, Lj0/H;->a:J

    .line 520
    .line 521
    goto :goto_8

    .line 522
    :cond_f
    sget-wide v0, Lj0/H;->b:J

    .line 523
    .line 524
    :goto_8
    invoke-virtual {p1, v0, v1}, Lj0/C;->g(J)V

    .line 525
    .line 526
    .line 527
    return-object v7

    .line 528
    :pswitch_5
    check-cast p1, LP/F;

    .line 529
    .line 530
    check-cast v10, La0/q;

    .line 531
    .line 532
    check-cast v9, Lt/l;

    .line 533
    .line 534
    new-instance p1, LU1/n;

    .line 535
    .line 536
    invoke-direct {p1, v10, v8, v9}, LU1/n;-><init>(La0/q;Ljava/lang/Object;Lt/l;)V

    .line 537
    .line 538
    .line 539
    return-object p1

    .line 540
    :pswitch_6
    check-cast p1, Lh0/o;

    .line 541
    .line 542
    check-cast v10, Lh0/o;

    .line 543
    .line 544
    invoke-static {p1, v10}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 545
    .line 546
    .line 547
    move-result v0

    .line 548
    if-eqz v0, :cond_10

    .line 549
    .line 550
    goto :goto_9

    .line 551
    :cond_10
    check-cast v8, Lh0/h;

    .line 552
    .line 553
    iget-object v0, v8, Lh0/h;->d:Lh0/o;

    .line 554
    .line 555
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 556
    .line 557
    .line 558
    move-result v0

    .line 559
    if-nez v0, :cond_11

    .line 560
    .line 561
    check-cast v9, Lkotlin/jvm/internal/n;

    .line 562
    .line 563
    invoke-interface {v9, p1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object p1

    .line 567
    check-cast p1, Ljava/lang/Boolean;

    .line 568
    .line 569
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 570
    .line 571
    .line 572
    move-result v4

    .line 573
    :goto_9
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 574
    .line 575
    .line 576
    move-result-object p1

    .line 577
    return-object p1

    .line 578
    :cond_11
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 579
    .line 580
    const-string v0, "Focus search landed at the root."

    .line 581
    .line 582
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 583
    .line 584
    .line 585
    throw p1

    .line 586
    :pswitch_7
    check-cast p1, LB0/E0;

    .line 587
    .line 588
    move-object v0, p1

    .line 589
    check-cast v0, Lf0/f;

    .line 590
    .line 591
    check-cast v8, Lf0/f;

    .line 592
    .line 593
    invoke-static {v8}, LB0/g;->v(LB0/m;)LB0/t0;

    .line 594
    .line 595
    .line 596
    move-result-object v1

    .line 597
    check-cast v1, LC0/A;

    .line 598
    .line 599
    invoke-virtual {v1}, LC0/A;->getDragAndDropManager()Lf0/c;

    .line 600
    .line 601
    .line 602
    move-result-object v1

    .line 603
    check-cast v1, Lf0/a;

    .line 604
    .line 605
    iget-object v1, v1, Lf0/a;->b:Lr/f;

    .line 606
    .line 607
    invoke-virtual {v1, v0}, Lr/f;->contains(Ljava/lang/Object;)Z

    .line 608
    .line 609
    .line 610
    move-result v1

    .line 611
    if-eqz v1, :cond_12

    .line 612
    .line 613
    check-cast v9, Lk3/c;

    .line 614
    .line 615
    invoke-static {v9}, Lcom/google/android/gms/internal/measurement/P1;->C(Lk3/c;)J

    .line 616
    .line 617
    .line 618
    move-result-wide v1

    .line 619
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/K1;->c(Lf0/f;J)Z

    .line 620
    .line 621
    .line 622
    move-result v0

    .line 623
    if-eqz v0, :cond_12

    .line 624
    .line 625
    check-cast v10, Lkotlin/jvm/internal/y;

    .line 626
    .line 627
    iput-object p1, v10, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 628
    .line 629
    sget-object p1, LB0/D0;->s:LB0/D0;

    .line 630
    .line 631
    goto :goto_a

    .line 632
    :cond_12
    sget-object p1, LB0/D0;->q:LB0/D0;

    .line 633
    .line 634
    :goto_a
    return-object p1

    .line 635
    :pswitch_8
    check-cast p1, LP/F;

    .line 636
    .line 637
    check-cast v10, Lb/A;

    .line 638
    .line 639
    check-cast v8, Landroidx/lifecycle/x;

    .line 640
    .line 641
    check-cast v9, Lc/h;

    .line 642
    .line 643
    invoke-virtual {v10, v8, v9}, Lb/A;->a(Landroidx/lifecycle/x;Lb/u;)V

    .line 644
    .line 645
    .line 646
    new-instance p1, LC0/Y;

    .line 647
    .line 648
    const/4 v0, 0x7

    .line 649
    invoke-direct {p1, v0, v9}, LC0/Y;-><init>(ILjava/lang/Object;)V

    .line 650
    .line 651
    .line 652
    return-object p1

    .line 653
    :pswitch_9
    check-cast p1, LP/F;

    .line 654
    .line 655
    check-cast v10, Lb/A;

    .line 656
    .line 657
    check-cast v8, Landroidx/lifecycle/x;

    .line 658
    .line 659
    check-cast v9, Lc/b;

    .line 660
    .line 661
    invoke-virtual {v10, v8, v9}, Lb/A;->a(Landroidx/lifecycle/x;Lb/u;)V

    .line 662
    .line 663
    .line 664
    new-instance p1, LC0/Y;

    .line 665
    .line 666
    invoke-direct {p1, v1, v9}, LC0/Y;-><init>(ILjava/lang/Object;)V

    .line 667
    .line 668
    .line 669
    return-object p1

    .line 670
    :pswitch_a
    check-cast p1, Ll0/d;

    .line 671
    .line 672
    check-cast v10, LZ0/r;

    .line 673
    .line 674
    check-cast v8, LB0/L;

    .line 675
    .line 676
    check-cast v9, LZ0/r;

    .line 677
    .line 678
    invoke-interface {p1}, Ll0/d;->z()LB0/G0;

    .line 679
    .line 680
    .line 681
    move-result-object p1

    .line 682
    invoke-virtual {p1}, LB0/G0;->t()Lj0/m;

    .line 683
    .line 684
    .line 685
    move-result-object p1

    .line 686
    invoke-virtual {v10}, LZ0/j;->getView()Landroid/view/View;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 691
    .line 692
    .line 693
    move-result v0

    .line 694
    const/16 v1, 0x8

    .line 695
    .line 696
    if-eq v0, v1, :cond_15

    .line 697
    .line 698
    iput-boolean v6, v10, LZ0/j;->N:Z

    .line 699
    .line 700
    iget-object v0, v8, LB0/L;->D:LB0/t0;

    .line 701
    .line 702
    instance-of v1, v0, LC0/A;

    .line 703
    .line 704
    if-eqz v1, :cond_13

    .line 705
    .line 706
    move-object v5, v0

    .line 707
    check-cast v5, LC0/A;

    .line 708
    .line 709
    :cond_13
    if-eqz v5, :cond_14

    .line 710
    .line 711
    invoke-static {p1}, Lj0/c;->a(Lj0/m;)Landroid/graphics/Canvas;

    .line 712
    .line 713
    .line 714
    move-result-object p1

    .line 715
    invoke-virtual {v5}, LC0/A;->getAndroidViewsHandler$ui_release()LC0/k0;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 720
    .line 721
    .line 722
    invoke-virtual {v9, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 723
    .line 724
    .line 725
    :cond_14
    iput-boolean v4, v10, LZ0/j;->N:Z

    .line 726
    .line 727
    :cond_15
    return-object v7

    .line 728
    :pswitch_b
    check-cast p1, LP/F;

    .line 729
    .line 730
    check-cast v9, LZ/i;

    .line 731
    .line 732
    check-cast v10, LZ/f;

    .line 733
    .line 734
    iget-object p1, v10, LZ/f;->b:Lr/G;

    .line 735
    .line 736
    invoke-virtual {p1, v8}, Lr/G;->b(Ljava/lang/Object;)Z

    .line 737
    .line 738
    .line 739
    move-result v0

    .line 740
    if-nez v0, :cond_16

    .line 741
    .line 742
    iget-object v0, v10, LZ/f;->a:Ljava/util/Map;

    .line 743
    .line 744
    invoke-interface {v0, v8}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    invoke-virtual {p1, v8, v9}, Lr/G;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 748
    .line 749
    .line 750
    new-instance p1, LU1/n;

    .line 751
    .line 752
    invoke-direct {p1, v10, v8, v9, v6}, LU1/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 753
    .line 754
    .line 755
    return-object p1

    .line 756
    :cond_16
    new-instance p1, Ljava/lang/StringBuilder;

    .line 757
    .line 758
    const-string v0, "Key "

    .line 759
    .line 760
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 761
    .line 762
    .line 763
    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 764
    .line 765
    .line 766
    const-string v0, " was used multiple times "

    .line 767
    .line 768
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 769
    .line 770
    .line 771
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 772
    .line 773
    .line 774
    move-result-object p1

    .line 775
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 776
    .line 777
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object p1

    .line 781
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 782
    .line 783
    .line 784
    throw v0

    .line 785
    :pswitch_c
    check-cast p1, LP/F;

    .line 786
    .line 787
    check-cast v9, LP/W;

    .line 788
    .line 789
    new-instance p1, LY/a;

    .line 790
    .line 791
    invoke-direct {p1, v9}, LY/a;-><init>(LP/W;)V

    .line 792
    .line 793
    .line 794
    check-cast v10, Landroidx/lifecycle/G;

    .line 795
    .line 796
    check-cast v8, Landroidx/lifecycle/x;

    .line 797
    .line 798
    invoke-virtual {v10, v8, p1}, Landroidx/lifecycle/G;->e(Landroidx/lifecycle/x;Landroidx/lifecycle/K;)V

    .line 799
    .line 800
    .line 801
    new-instance v0, LA/X;

    .line 802
    .line 803
    invoke-direct {v0, v1, v10, p1}, LA/X;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 804
    .line 805
    .line 806
    return-object v0

    .line 807
    :pswitch_d
    check-cast p1, Lz0/I;

    .line 808
    .line 809
    check-cast v10, LN/u;

    .line 810
    .line 811
    check-cast v9, LB0/T;

    .line 812
    .line 813
    invoke-interface {v9}, Lz0/E;->r()Z

    .line 814
    .line 815
    .line 816
    move-result v0

    .line 817
    if-eqz v0, :cond_17

    .line 818
    .line 819
    iget-object v0, v10, LN/u;->E:LN/r;

    .line 820
    .line 821
    invoke-virtual {v0}, LN/r;->d()LN/y;

    .line 822
    .line 823
    .line 824
    move-result-object v0

    .line 825
    iget-object v1, v10, LN/u;->E:LN/r;

    .line 826
    .line 827
    iget-object v1, v1, LN/r;->h:LP/C;

    .line 828
    .line 829
    invoke-virtual {v1}, LP/C;->getValue()Ljava/lang/Object;

    .line 830
    .line 831
    .line 832
    move-result-object v1

    .line 833
    invoke-virtual {v0, v1}, LN/y;->d(Ljava/lang/Object;)F

    .line 834
    .line 835
    .line 836
    move-result v0

    .line 837
    goto :goto_b

    .line 838
    :cond_17
    iget-object v0, v10, LN/u;->E:LN/r;

    .line 839
    .line 840
    invoke-virtual {v0}, LN/r;->f()F

    .line 841
    .line 842
    .line 843
    move-result v0

    .line 844
    :goto_b
    iget-object v1, v10, LN/u;->G:Lw/d0;

    .line 845
    .line 846
    sget-object v2, Lw/d0;->r:Lw/d0;

    .line 847
    .line 848
    if-ne v1, v2, :cond_18

    .line 849
    .line 850
    move v2, v0

    .line 851
    goto :goto_c

    .line 852
    :cond_18
    move v2, v3

    .line 853
    :goto_c
    sget-object v4, Lw/d0;->q:Lw/d0;

    .line 854
    .line 855
    if-ne v1, v4, :cond_19

    .line 856
    .line 857
    move v3, v0

    .line 858
    :cond_19
    check-cast v8, Lz0/J;

    .line 859
    .line 860
    invoke-static {v2}, LD5/a;->G(F)I

    .line 861
    .line 862
    .line 863
    move-result v0

    .line 864
    invoke-static {v3}, LD5/a;->G(F)I

    .line 865
    .line 866
    .line 867
    move-result v1

    .line 868
    invoke-static {p1, v8, v0, v1}, Lz0/I;->d(Lz0/I;Lz0/J;II)V

    .line 869
    .line 870
    .line 871
    return-object v7

    .line 872
    :pswitch_e
    check-cast p1, Ljava/lang/Number;

    .line 873
    .line 874
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 875
    .line 876
    .line 877
    move-result p1

    .line 878
    check-cast v10, LM5/w;

    .line 879
    .line 880
    new-instance v0, LM/Y;

    .line 881
    .line 882
    check-cast v8, LM/I0;

    .line 883
    .line 884
    invoke-direct {v0, v8, p1, v5}, LM/Y;-><init>(LM/I0;FLq5/c;)V

    .line 885
    .line 886
    .line 887
    const/4 p1, 0x3

    .line 888
    invoke-static {v10, v5, v5, v0, p1}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 889
    .line 890
    .line 891
    move-result-object p1

    .line 892
    new-instance v0, LM/X;

    .line 893
    .line 894
    check-cast v9, LB5/a;

    .line 895
    .line 896
    invoke-direct {v0, v8, v9, v6}, LM/X;-><init>(LM/I0;LB5/a;I)V

    .line 897
    .line 898
    .line 899
    invoke-virtual {p1, v0}, LM5/i0;->G(LB5/c;)LM5/J;

    .line 900
    .line 901
    .line 902
    return-object v7

    .line 903
    :pswitch_f
    check-cast v8, Lz0/J;

    .line 904
    .line 905
    check-cast p1, Lz0/I;

    .line 906
    .line 907
    check-cast v9, LB0/T;

    .line 908
    .line 909
    check-cast v10, LA/K;

    .line 910
    .line 911
    iget-boolean v0, v10, LA/K;->I:Z

    .line 912
    .line 913
    if-eqz v0, :cond_1a

    .line 914
    .line 915
    iget v0, v10, LA/K;->E:F

    .line 916
    .line 917
    invoke-interface {v9, v0}, LW0/c;->G(F)I

    .line 918
    .line 919
    .line 920
    move-result v0

    .line 921
    iget v1, v10, LA/K;->F:F

    .line 922
    .line 923
    invoke-interface {v9, v1}, LW0/c;->G(F)I

    .line 924
    .line 925
    .line 926
    move-result v1

    .line 927
    invoke-static {p1, v8, v0, v1}, Lz0/I;->f(Lz0/I;Lz0/J;II)V

    .line 928
    .line 929
    .line 930
    goto :goto_d

    .line 931
    :cond_1a
    iget v0, v10, LA/K;->E:F

    .line 932
    .line 933
    invoke-interface {v9, v0}, LW0/c;->G(F)I

    .line 934
    .line 935
    .line 936
    move-result v0

    .line 937
    iget v1, v10, LA/K;->F:F

    .line 938
    .line 939
    invoke-interface {v9, v1}, LW0/c;->G(F)I

    .line 940
    .line 941
    .line 942
    move-result v1

    .line 943
    invoke-static {p1, v8, v0, v1}, Lz0/I;->d(Lz0/I;Lz0/J;II)V

    .line 944
    .line 945
    .line 946
    :goto_d
    return-object v7

    .line 947
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
