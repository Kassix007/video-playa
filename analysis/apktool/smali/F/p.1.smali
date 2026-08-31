.class public final LF/p;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/f;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LF/p;->q:I

    iput-object p2, p0, LF/p;->r:Ljava/lang/Object;

    iput-object p3, p0, LF/p;->s:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, LF/p;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lv0/l;

    .line 7
    .line 8
    check-cast p2, Lv0/l;

    .line 9
    .line 10
    check-cast p3, Li0/b;

    .line 11
    .line 12
    iget-wide v0, p3, Li0/b;->a:J

    .line 13
    .line 14
    iget-object p3, p0, LF/p;->r:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p3, Lw/C;

    .line 17
    .line 18
    iget-object v2, p3, Lw/C;->H:Lkotlin/jvm/internal/n;

    .line 19
    .line 20
    invoke-interface {v2, p1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    iget-boolean v2, p3, Lw/C;->M:Z

    .line 33
    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    iget-object v2, p3, Lw/C;->K:LO5/e;

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    if-nez v2, :cond_0

    .line 40
    .line 41
    const v2, 0x7fffffff

    .line 42
    .line 43
    .line 44
    const/4 v4, 0x6

    .line 45
    invoke-static {v2, v3, v4}, Ll6/d;->e(ILO5/a;I)LO5/e;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iput-object v2, p3, Lw/C;->K:LO5/e;

    .line 50
    .line 51
    :cond_0
    const/4 v2, 0x1

    .line 52
    iput-boolean v2, p3, Lw/C;->M:Z

    .line 53
    .line 54
    invoke-virtual {p3}, Lc0/l;->l0()LM5/w;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    new-instance v4, Lw/B;

    .line 59
    .line 60
    invoke-direct {v4, p3, v3}, Lw/B;-><init>(Lw/C;Lq5/c;)V

    .line 61
    .line 62
    .line 63
    const/4 v5, 0x3

    .line 64
    invoke-static {v2, v3, v3, v4, v5}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 65
    .line 66
    .line 67
    :cond_1
    iget-object v2, p0, LF/p;->s:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v2, LO3/l;

    .line 70
    .line 71
    invoke-static {v2, p1}, Lcom/google/android/gms/internal/measurement/P1;->d(LO3/l;Lv0/l;)V

    .line 72
    .line 73
    .line 74
    iget-wide p1, p2, Lv0/l;->c:J

    .line 75
    .line 76
    invoke-static {p1, p2, v0, v1}, Li0/b;->d(JJ)J

    .line 77
    .line 78
    .line 79
    move-result-wide p1

    .line 80
    iget-object p3, p3, Lw/C;->K:LO5/e;

    .line 81
    .line 82
    if-eqz p3, :cond_2

    .line 83
    .line 84
    new-instance v0, Lw/q;

    .line 85
    .line 86
    invoke-direct {v0, p1, p2}, Lw/q;-><init>(J)V

    .line 87
    .line 88
    .line 89
    invoke-interface {p3, v0}, LO5/w;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    :cond_2
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 93
    .line 94
    return-object p1

    .line 95
    :pswitch_0
    check-cast p1, Lc0/m;

    .line 96
    .line 97
    check-cast p2, LP/o;

    .line 98
    .line 99
    check-cast p3, Ljava/lang/Number;

    .line 100
    .line 101
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 102
    .line 103
    .line 104
    const p1, -0x15193045

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2, p1}, LP/o;->S(I)V

    .line 108
    .line 109
    .line 110
    iget-object p1, p0, LF/p;->r:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p1, Lv/P;

    .line 113
    .line 114
    iget-object p3, p0, LF/p;->s:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p3, Ly/i;

    .line 117
    .line 118
    invoke-interface {p1, p3, p2}, Lv/P;->a(Ly/i;LP/o;)Lv/Q;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {p2, p1}, LP/o;->g(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result p3

    .line 126
    invoke-virtual {p2}, LP/o;->H()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    if-nez p3, :cond_3

    .line 131
    .line 132
    sget-object p3, LP/k;->a:LP/S;

    .line 133
    .line 134
    if-ne v0, p3, :cond_4

    .line 135
    .line 136
    :cond_3
    new-instance v0, Lv/T;

    .line 137
    .line 138
    invoke-direct {v0, p1}, Lv/T;-><init>(Lv/Q;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p2, v0}, LP/o;->d0(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :cond_4
    check-cast v0, Lv/T;

    .line 145
    .line 146
    const/4 p1, 0x0

    .line 147
    invoke-virtual {p2, p1}, LP/o;->p(Z)V

    .line 148
    .line 149
    .line 150
    return-object v0

    .line 151
    :pswitch_1
    check-cast p1, LL0/y;

    .line 152
    .line 153
    check-cast p2, Ljava/lang/Number;

    .line 154
    .line 155
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 156
    .line 157
    .line 158
    move-result p2

    .line 159
    check-cast p3, Ljava/lang/Number;

    .line 160
    .line 161
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 162
    .line 163
    .line 164
    move-result p3

    .line 165
    iget-object v0, p0, LF/p;->r:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v0, Landroid/text/Spannable;

    .line 168
    .line 169
    new-instance v1, LN0/b;

    .line 170
    .line 171
    iget-object v2, p0, LF/p;->s:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v2, LS0/c;

    .line 174
    .line 175
    iget-object v3, p1, LL0/y;->f:LO0/p;

    .line 176
    .line 177
    iget-object v4, p1, LL0/y;->c:LO0/j;

    .line 178
    .line 179
    if-nez v4, :cond_5

    .line 180
    .line 181
    sget-object v4, LO0/j;->s:LO0/j;

    .line 182
    .line 183
    :cond_5
    iget-object v5, p1, LL0/y;->d:LO0/h;

    .line 184
    .line 185
    if-eqz v5, :cond_6

    .line 186
    .line 187
    iget v5, v5, LO0/h;->a:I

    .line 188
    .line 189
    goto :goto_0

    .line 190
    :cond_6
    const/4 v5, 0x0

    .line 191
    :goto_0
    iget-object p1, p1, LL0/y;->e:LO0/i;

    .line 192
    .line 193
    if-eqz p1, :cond_7

    .line 194
    .line 195
    iget p1, p1, LO0/i;->a:I

    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_7
    const p1, 0xffff

    .line 199
    .line 200
    .line 201
    :goto_1
    iget-object v2, v2, LS0/c;->r:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v2, LS0/d;

    .line 204
    .line 205
    iget-object v6, v2, LS0/d;->e:LO0/d;

    .line 206
    .line 207
    check-cast v6, LO0/e;

    .line 208
    .line 209
    invoke-virtual {v6, v3, v4, v5, p1}, LO0/e;->b(LO0/p;LO0/j;II)LO0/r;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    instance-of v3, p1, LO0/r;

    .line 214
    .line 215
    const-string v4, "null cannot be cast to non-null type android.graphics.Typeface"

    .line 216
    .line 217
    if-nez v3, :cond_8

    .line 218
    .line 219
    new-instance v3, LB0/G0;

    .line 220
    .line 221
    iget-object v5, v2, LS0/d;->j:LB0/G0;

    .line 222
    .line 223
    invoke-direct {v3, p1, v5}, LB0/G0;-><init>(LO0/r;LB0/G0;)V

    .line 224
    .line 225
    .line 226
    iput-object v3, v2, LS0/d;->j:LB0/G0;

    .line 227
    .line 228
    iget-object p1, v3, LB0/G0;->r:Ljava/lang/Object;

    .line 229
    .line 230
    invoke-static {p1, v4}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    check-cast p1, Landroid/graphics/Typeface;

    .line 234
    .line 235
    goto :goto_2

    .line 236
    :cond_8
    iget-object p1, p1, LO0/r;->q:Ljava/lang/Object;

    .line 237
    .line 238
    invoke-static {p1, v4}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    check-cast p1, Landroid/graphics/Typeface;

    .line 242
    .line 243
    :goto_2
    const/4 v2, 0x1

    .line 244
    invoke-direct {v1, v2, p1}, LN0/b;-><init>(ILjava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    const/16 p1, 0x21

    .line 248
    .line 249
    invoke-interface {v0, v1, p2, p3, p1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 250
    .line 251
    .line 252
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 253
    .line 254
    return-object p1

    .line 255
    :pswitch_2
    check-cast p1, Ljava/lang/Number;

    .line 256
    .line 257
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 258
    .line 259
    .line 260
    move-result p1

    .line 261
    check-cast p2, Ljava/lang/Number;

    .line 262
    .line 263
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 264
    .line 265
    .line 266
    move-result p2

    .line 267
    check-cast p3, Ljava/lang/Number;

    .line 268
    .line 269
    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    .line 270
    .line 271
    .line 272
    move-result p3

    .line 273
    iget-object v0, p0, LF/p;->r:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v0, LF/e;

    .line 276
    .line 277
    iget-object v1, p0, LF/p;->s:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v1, LW0/l;

    .line 280
    .line 281
    invoke-static {v0, p1}, LE3/h;->F(LF/e;F)Z

    .line 282
    .line 283
    .line 284
    move-result v2

    .line 285
    invoke-virtual {v0}, LF/N;->k()LF/B;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    iget-object v3, v3, LF/B;->e:Lw/d0;

    .line 290
    .line 291
    sget-object v4, Lw/d0;->q:Lw/d0;

    .line 292
    .line 293
    const/4 v5, 0x0

    .line 294
    const/4 v6, 0x1

    .line 295
    if-ne v3, v4, :cond_9

    .line 296
    .line 297
    goto :goto_3

    .line 298
    :cond_9
    sget-object v3, LW0/l;->q:LW0/l;

    .line 299
    .line 300
    if-ne v1, v3, :cond_a

    .line 301
    .line 302
    goto :goto_3

    .line 303
    :cond_a
    if-nez v2, :cond_b

    .line 304
    .line 305
    move v2, v6

    .line 306
    goto :goto_3

    .line 307
    :cond_b
    move v2, v5

    .line 308
    :goto_3
    invoke-virtual {v0}, LF/N;->k()LF/B;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    iget v1, v1, LF/B;->b:I

    .line 313
    .line 314
    const/4 v3, 0x0

    .line 315
    if-nez v1, :cond_c

    .line 316
    .line 317
    move v4, v3

    .line 318
    goto :goto_4

    .line 319
    :cond_c
    invoke-static {v0}, LE3/h;->y(LF/e;)F

    .line 320
    .line 321
    .line 322
    move-result v4

    .line 323
    int-to-float v1, v1

    .line 324
    div-float/2addr v4, v1

    .line 325
    :goto_4
    float-to-int v1, v4

    .line 326
    int-to-float v1, v1

    .line 327
    sub-float v1, v4, v1

    .line 328
    .line 329
    iget-object v7, v0, LF/N;->q:LW0/c;

    .line 330
    .line 331
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 332
    .line 333
    .line 334
    move-result v8

    .line 335
    sget v9, Lx/l;->a:F

    .line 336
    .line 337
    invoke-interface {v7, v9}, LW0/c;->u(F)F

    .line 338
    .line 339
    .line 340
    move-result v7

    .line 341
    cmpg-float v7, v8, v7

    .line 342
    .line 343
    const/4 v8, 0x2

    .line 344
    if-gez v7, :cond_d

    .line 345
    .line 346
    goto :goto_5

    .line 347
    :cond_d
    cmpl-float p1, p1, v3

    .line 348
    .line 349
    if-lez p1, :cond_e

    .line 350
    .line 351
    move v5, v6

    .line 352
    goto :goto_5

    .line 353
    :cond_e
    move v5, v8

    .line 354
    :goto_5
    if-nez v5, :cond_12

    .line 355
    .line 356
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 357
    .line 358
    .line 359
    move-result p1

    .line 360
    const/high16 v1, 0x3f000000    # 0.5f

    .line 361
    .line 362
    cmpl-float p1, p1, v1

    .line 363
    .line 364
    if-lez p1, :cond_f

    .line 365
    .line 366
    if-eqz v2, :cond_15

    .line 367
    .line 368
    goto :goto_6

    .line 369
    :cond_f
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 370
    .line 371
    .line 372
    move-result p1

    .line 373
    iget-object v1, v0, LF/N;->q:LW0/c;

    .line 374
    .line 375
    sget v3, LF/S;->a:F

    .line 376
    .line 377
    invoke-interface {v1, v3}, LW0/c;->u(F)F

    .line 378
    .line 379
    .line 380
    move-result v1

    .line 381
    invoke-virtual {v0}, LF/N;->m()I

    .line 382
    .line 383
    .line 384
    move-result v3

    .line 385
    int-to-float v3, v3

    .line 386
    const/high16 v4, 0x40000000    # 2.0f

    .line 387
    .line 388
    div-float/2addr v3, v4

    .line 389
    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    .line 390
    .line 391
    .line 392
    move-result v1

    .line 393
    invoke-virtual {v0}, LF/N;->m()I

    .line 394
    .line 395
    .line 396
    move-result v0

    .line 397
    int-to-float v0, v0

    .line 398
    div-float/2addr v1, v0

    .line 399
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 400
    .line 401
    .line 402
    move-result v0

    .line 403
    cmpl-float p1, p1, v0

    .line 404
    .line 405
    if-ltz p1, :cond_10

    .line 406
    .line 407
    if-eqz v2, :cond_11

    .line 408
    .line 409
    goto :goto_7

    .line 410
    :cond_10
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 411
    .line 412
    .line 413
    move-result p1

    .line 414
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 415
    .line 416
    .line 417
    move-result v0

    .line 418
    cmpg-float p1, p1, v0

    .line 419
    .line 420
    if-gez p1, :cond_11

    .line 421
    .line 422
    goto :goto_7

    .line 423
    :cond_11
    :goto_6
    move p2, p3

    .line 424
    goto :goto_7

    .line 425
    :cond_12
    if-ne v5, v6, :cond_13

    .line 426
    .line 427
    goto :goto_6

    .line 428
    :cond_13
    if-ne v5, v8, :cond_14

    .line 429
    .line 430
    goto :goto_7

    .line 431
    :cond_14
    move p2, v3

    .line 432
    :cond_15
    :goto_7
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 433
    .line 434
    .line 435
    move-result-object p1

    .line 436
    return-object p1

    .line 437
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
